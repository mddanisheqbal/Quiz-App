package com.example.quizapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.local.BookmarkDao
import com.example.quizapp.data.local.BookmarkEntity
import com.example.quizapp.data.local.QuizSessionEntity
import com.example.quizapp.data.model.*
import com.example.quizapp.data.repository.QuizRepository
import com.example.quizapp.util.*
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

enum class AnswerState {
    CORRECT,
    INCORRECT,
    UNANSWERED
}

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val quizRepository: QuizRepository,
    private val prefsManager: PreferencesManager,
    private val bookmarkDao: BookmarkDao,
    private val networkUtils: NetworkUtils
) : ViewModel() {

    // FEATURE 7 — SAFE STATE FLOW
    private val _quizSession = MutableStateFlow<QuizSessionEntity?>(null)
    val quizSession: StateFlow<QuizSessionEntity?> = _quizSession

    private val _questions = MutableStateFlow<List<Question>>(emptyList())
    val questions: StateFlow<List<Question>> = _questions

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex

    // FEATURE 3 — SAVE ANSWERS BY QUESTION ID
    private val _selectedAnswers = MutableStateFlow<Map<String, String>>(emptyMap())
    val selectedAnswers: StateFlow<Map<String, String>> = _selectedAnswers

    private val _answerState = MutableStateFlow<Map<String, AnswerState>>(emptyMap())
    val answerState: StateFlow<Map<String, AnswerState>> = _answerState

    private val _quizResult = MutableStateFlow<Resource<QuizResult>?>(null)
    val quizResult: StateFlow<Resource<QuizResult>?> = _quizResult

    private val _showResumeDialog = MutableStateFlow(false)
    val showResumeDialog: StateFlow<Boolean> = _showResumeDialog

    private val _resumeMessage = MutableStateFlow("")
    val resumeMessage: StateFlow<String> = _resumeMessage

    private val _timeRemaining = MutableStateFlow(0)
    val timeRemaining: StateFlow<Int> = _timeRemaining

    // FEATURE 8 — VIEWMODEL UPDATE (Stars)
    private val _stars = MutableStateFlow(0)
    val stars: StateFlow<Int> = _stars

    // Additional UI states
    private val _categories = MutableStateFlow<Resource<List<Category>>>(Resource.Loading())
    val categories: StateFlow<Resource<List<Category>>> = _categories

    private val _topics = MutableStateFlow<Resource<List<Topic>>>(Resource.Loading())
    val topics: StateFlow<Resource<List<Topic>>> = _topics

    private val _achievements = MutableStateFlow<Resource<List<Achievement>>>(Resource.Loading())
    val achievements: StateFlow<Resource<List<Achievement>>> = _achievements

    private val _totalXP = MutableStateFlow(prefsManager.getTotalXP())
    val totalXP: StateFlow<Int> = _totalXP

    private val _userLevel = MutableStateFlow(1)
    val userLevel: StateFlow<Int> = _userLevel

    private val _streakCount = MutableStateFlow(0)
    val streakCount: StateFlow<Int> = _streakCount

    private val _dailyChallengeCompleted = MutableStateFlow(false)
    val dailyChallengeCompleted: StateFlow<Boolean> = _dailyChallengeCompleted

    private val _topicProgress = MutableStateFlow<Map<String, Int>>(emptyMap()) // Changed to Int for stars
    val topicProgress: StateFlow<Map<String, Int>> = _topicProgress

    private val _leaderboard = MutableStateFlow<Resource<List<User>>>(Resource.Loading())
    val leaderboard: StateFlow<Resource<List<User>>> = _leaderboard

    private val _xpAwardedInThisSession = MutableStateFlow<Int?>(null)
    val xpAwardedInThisSession: StateFlow<Int?> = _xpAwardedInThisSession

    private val _isBookmarked = MutableStateFlow(false)
    val isBookmarked: StateFlow<Boolean> = _isBookmarked

    private val _isPreviouslyCompleted = MutableStateFlow(false)
    val isPreviouslyCompleted: StateFlow<Boolean> = _isPreviouslyCompleted

    private val _isOnline = MutableStateFlow(networkUtils.isNetworkAvailable())
    val isOnline: StateFlow<Boolean> = _isOnline

    val bookmarkedQuestions: StateFlow<List<BookmarkEntity>> = bookmarkDao.getAllBookmarks()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    private var currentQuizId = ""
    private var currentCategoryId = ""
    private var currentChapterId = ""
    private var currentChapterName = ""
    private var isDailyChallenge = false
    private var quizStartTime = 0L

    private var pendingSession: QuizSessionEntity? = null
    private var isSessionInitialized = false

    init {
        restoreUserData()
        observeNetwork()
    }

    private fun observeNetwork() {
        viewModelScope.launch {
            networkUtils.observeNetworkStatus.collect {
                _isOnline.value = it
            }
        }
    }

    private fun restoreUserData() {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            val result = quizRepository.getUserProfile(userId)
            if (result is Resource.Success) {
                val user = result.data!!
                _totalXP.value = user.totalXP
                _streakCount.value = user.streak
                _userLevel.value = user.level
                _dailyChallengeCompleted.value = user.dailyChallengeCompleted
                prefsManager.setTotalXP(user.totalXP)
            }
            
            restoreTopicProgress(userId)
        }
    }

    private suspend fun restoreTopicProgress(userId: String) {
        val progressResult = quizRepository.getTopicProgressWithStars(userId)
        if (progressResult is Resource.Success) {
            _topicProgress.value = progressResult.data ?: emptyMap()
        }
    }

    fun loadQuestions(categoryId: String, chapterId: String, chapterName: String) {
        viewModelScope.launch {
            isDailyChallenge = false
            isSessionInitialized = false
            _quizResult.value = null
            _xpAwardedInThisSession.value = null
            _stars.value = 0

            currentCategoryId = categoryId
            currentChapterId = chapterId
            currentChapterName = chapterName
            currentQuizId = chapterId 
            quizStartTime = System.currentTimeMillis()

            loadTopics(categoryId)

            val userId = FirebaseAuth.getInstance().currentUser?.uid
            if (userId != null) {
                _isPreviouslyCompleted.value = quizRepository.isQuizCompleted(userId, currentQuizId)
                
                val sessionResource = quizRepository.getQuizSession(userId, chapterId)
                if (sessionResource is Resource.Success && sessionResource.data != null) {
                    val session = sessionResource.data!!
                    pendingSession = session
                    _resumeMessage.value = "You answered ${session.answers.size} / ${session.totalQuestions} questions"
                    _showResumeDialog.value = true
                    return@launch
                }
            }
            
            if (!networkUtils.isNetworkAvailable()) {
                _error.value = "Internet is required to load questions."
                return@launch
            }

            fetchQuestions(chapterId, isResuming = false)
        }
    }

    fun resumeQuiz() {
        _showResumeDialog.value = false
        val session = pendingSession ?: return
        
        viewModelScope.launch {
            _quizSession.value = session
            _selectedAnswers.value = session.answers
            _currentQuestionIndex.value = session.currentIndex
            quizStartTime = session.startedAt
            
            Log.d("QUIZ_DEBUG", "Resumed Order: ${session.questionOrder}")
            Log.d("QUIZ_DEBUG", "Resumed Answers: ${session.answers}")

            fetchQuestions(session.chapterId, isResuming = true, savedOrder = session.questionOrder)
        }
    }

    fun restartQuiz() {
        _showResumeDialog.value = false
        val userId = FirebaseAuth.getInstance().currentUser?.uid
        viewModelScope.launch {
            if (!networkUtils.isNetworkAvailable()) {
                _error.value = "Internet is required to start a new quiz."
                return@launch
            }
            
            if (userId != null) {
                quizRepository.deleteQuizSession(userId, currentChapterId)
            }
            
            _selectedAnswers.value = emptyMap()
            _answerState.value = emptyMap()
            _currentQuestionIndex.value = 0
            _quizSession.value = null
            _questions.value = emptyList()
            isSessionInitialized = false
            
            fetchQuestions(currentChapterId, isResuming = false)
        }
    }

    private suspend fun fetchQuestions(
        chapterId: String, 
        isResuming: Boolean, 
        savedOrder: List<String> = emptyList()
    ) {
        _isLoading.value = true
        _error.value = null
        
        quizRepository.getQuestionsByChapterFlow(chapterId).collect { result ->
            if (result is Resource.Success && !isSessionInitialized) {
                val allQuestions = result.data.orEmpty()
                
                val finalQuestions = if (isResuming && savedOrder.isNotEmpty()) {
                    savedOrder.mapNotNull { id -> allQuestions.find { it.id == id } }
                } else {
                    allQuestions.shuffled()
                }
                
                _questions.value = finalQuestions
                
                if (!isResuming) {
                    val newSession = QuizSessionEntity(
                        chapterId = chapterId,
                        categoryId = currentCategoryId,
                        questionOrder = finalQuestions.map { it.id },
                        answers = emptyMap(),
                        currentIndex = 0,
                        totalQuestions = finalQuestions.size,
                        startedAt = quizStartTime
                    )
                    _quizSession.value = newSession
                    saveSessionState(newSession)
                } else {
                    val statesMap = mutableMapOf<String, AnswerState>()
                    _selectedAnswers.value.forEach { (qId, answer) ->
                        val q = finalQuestions.find { it.id == qId }
                        if (q != null) {
                            val isCorrect = answer.equals(q.correctAnswer, true)
                            statesMap[qId] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT
                        }
                    }
                    _answerState.value = statesMap
                }
                
                isSessionInitialized = true
                _isLoading.value = false

                Log.d("QUIZ_DEBUG", "Final Order: ${finalQuestions.map { it.id }}")
                
                if (finalQuestions.isNotEmpty()) {
                    val currentQId = finalQuestions.getOrNull(_currentQuestionIndex.value)?.id
                    if (currentQId != null) checkBookmarkStatus(currentQId)
                    _timeRemaining.value = finalQuestions.getOrNull(_currentQuestionIndex.value)?.timeLimit ?: 30
                }
            } else if (result is Resource.Error) {
                _error.value = result.message
                _isLoading.value = false
            }
        }
    }

    fun setAnswer(questionId: String, answer: String) {
        val currentSession = _quizSession.value ?: return
        val answers = _selectedAnswers.value.toMutableMap()
        
        if (!answers.containsKey(questionId)) {
            answers[questionId] = answer
            _selectedAnswers.value = answers
            
            Log.d("QUIZ_DEBUG", "Answers: $answers")
            
            checkAnswer(questionId, answer)
            
            val updatedSession = currentSession.copy(
                answers = answers,
                lastUpdated = System.currentTimeMillis()
            )
            _quizSession.value = updatedSession
            saveSessionState(updatedSession)
        }
    }

    private fun checkAnswer(questionId: String, userAnswer: String) {
        val question = _questions.value.find { it.id == questionId } ?: return
        val isCorrect = userAnswer.equals(question.correctAnswer, true)
        val map = _answerState.value.toMutableMap()
        map[questionId] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT
        _answerState.value = map
    }

    private fun saveSessionState(session: QuizSessionEntity) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        if (isDailyChallenge) return
        
        viewModelScope.launch {
            quizRepository.saveQuizSession(
                userId = userId,
                chapterId = session.chapterId,
                categoryId = session.categoryId,
                currentIndex = session.currentIndex,
                answers = session.answers,
                questionOrder = session.questionOrder,
                totalQuestions = session.totalQuestions,
                startedAt = session.startedAt
            )
        }
    }

    fun nextQuestion() {
        val total = _questions.value.size
        if (_currentQuestionIndex.value < total - 1) {
            _currentQuestionIndex.value++
            updateNavState()
        }
    }

    fun previousQuestion() {
        if (_currentQuestionIndex.value > 0) {
            _currentQuestionIndex.value--
            updateNavState()
        }
    }

    fun goToQuestion(index: Int) {
        val total = _questions.value.size
        if (index in 0 until total) {
            _currentQuestionIndex.value = index
            updateNavState()
        }
    }

    fun updateTimeRemaining(time: Int) {
        _timeRemaining.value = time
    }

    private fun updateNavState() {
        val questionsList = _questions.value
        val currentIndex = _currentQuestionIndex.value
        val currentQuestion = questionsList.getOrNull(currentIndex) ?: return
        
        checkBookmarkStatus(currentQuestion.id)
        _timeRemaining.value = currentQuestion.timeLimit
        
        _quizSession.value?.let { session ->
            val updatedSession = session.copy(currentIndex = currentIndex)
            _quizSession.value = updatedSession
            saveSessionState(updatedSession)
        }
    }

    // FEATURE 1 & 9 — STAR CALCULATION & EDGE CASE HANDLING
    fun submitQuiz() {
        val session = _quizSession.value ?: return
        val questionsList = _questions.value
        if (questionsList.isEmpty()) return

        val totalQuestionsCount = questionsList.size
        val attemptedCount = session.answers.size

        if (attemptedCount < totalQuestionsCount) {
             _quizResult.value = Resource.Error("Please answer all questions before submitting")
             return
        }

        viewModelScope.launch {
            _quizResult.value = Resource.Loading()
            val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return@launch

            try {
                val correctAnswerMap = questionsList.associate { it.id to it.correctAnswer }
                
                val correctCount = session.answers.count { (qId, ans) -> 
                    correctAnswerMap[qId].equals(ans, ignoreCase = true) 
                }
                
                // FEATURE 1 — STAR CALCULATION LOGIC
                val percentage = if (totalQuestionsCount > 0) (correctCount * 100) / totalQuestionsCount else 0
                val starsEarned = when {
                    percentage >= 90 -> 3
                    percentage >= 60 -> 2
                    percentage >= 40 -> 1
                    else -> 0
                }
                _stars.value = starsEarned

                var totalScore = 0
                val answersMap = mutableMapOf<String, UserAnswer>()

                questionsList.forEachIndexed { index, q ->
                    val ua = session.answers[q.id].orEmpty()
                    val isCorrect = ua.equals(q.correctAnswer, true)
                    if (isCorrect) {
                        totalScore += q.points
                    }
                    answersMap[index.toString()] = UserAnswer(q.id, q.questionText, ua, q.correctAnswer, isCorrect, 0)
                }

                val timeTaken = ((System.currentTimeMillis() - session.startedAt) / 1000).toInt()

                val result = QuizResult(
                    id = UUID.randomUUID().toString(),
                    userId = userId,
                    quizId = currentQuizId,
                    categoryId = currentCategoryId,
                    categoryName = "",
                    totalQuestions = totalQuestionsCount,
                    correctAnswers = correctCount,
                    wrongAnswers = totalQuestionsCount - correctCount,
                    skippedAnswers = 0,
                    totalScore = totalScore,
                    maxScore = questionsList.sumOf { it.points },
                    percentage = percentage.toFloat(),
                    timeTaken = timeTaken,
                    answers = answersMap,
                    completedAt = System.currentTimeMillis()
                )

                val saveResult = quizRepository.saveQuizResult(result)
                
                if (saveResult is Resource.Success) {
                    // FEATURE 2 — SAVE STARS IN FIRESTORE
                    val progressResult = quizRepository.updateTopicProgressWithStars(
                        userId = userId,
                        topicId = currentChapterId,
                        score = correctCount,
                        stars = starsEarned,
                        totalQuestions = totalQuestionsCount,
                        percentage = percentage
                    )
                    
                    if (progressResult is Resource.Success) {
                        val isAlreadyCompleted = quizRepository.isQuizCompleted(userId, currentQuizId)
                        if (!isAlreadyCompleted) {
                            val xp = correctCount * Constants.XP_PER_CORRECT_ANSWER
                            addXP(xp)
                            _xpAwardedInThisSession.value = xp
                            quizRepository.markQuizAsCompleted(userId, currentQuizId, xp)
                        }

                        // FEATURE 5 — UNLOCK RULE WITH STARS
                        if (starsEarned >= 2) {
                            unlockNextChapter(userId)
                        }
                        
                        quizRepository.deleteQuizSession(userId, currentChapterId)
                        restoreTopicProgress(userId) // Refresh progress map
                        _quizResult.value = Resource.Success(result)
                    } else {
                        _quizResult.value = Resource.Error(progressResult.message ?: "Failed to save progress")
                    }
                } else {
                    _quizResult.value = Resource.Error(saveResult.message ?: "Failed to save result")
                }
            } catch (e: Exception) {
                _quizResult.value = Resource.Error("Submission failed: ${e.message}")
            }
        }
    }

    private suspend fun unlockNextChapter(userId: String) {
        val result = _topics.value
        if (result is Resource.Success) {
            val currentTopics = result.data ?: return
            val currentIndex = currentTopics.indexOfFirst { it.id == currentChapterId }
            if (currentIndex != -1 && currentIndex < currentTopics.size - 1) {
                quizRepository.initializeTopicProgress(userId, currentTopics[currentIndex + 1].id)
            }
        }
    }

    private fun addXP(xp: Int) {
        val updatedXP = _totalXP.value + xp
        _totalXP.value = updatedXP
        viewModelScope.launch { prefsManager.setTotalXP(updatedXP) }
    }

    private fun checkBookmarkStatus(questionId: String) {
        viewModelScope.launch {
            _isBookmarked.value = bookmarkDao.isBookmarkedSync(questionId)
        }
    }

    fun loadCategories() {
        viewModelScope.launch {
            quizRepository.getCategoriesFlow().collect { _categories.value = it }
        }
    }

    fun loadTopics(categoryId: String) {
        viewModelScope.launch {
            quizRepository.getTopicsFlow(categoryId).collect { _topics.value = it }
        }
    }

    fun loadAchievements() {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            quizRepository.getAchievementsFlow(userId).collect {
                _achievements.value = it
            }
        }
    }

    fun loadLeaderboard() {
        viewModelScope.launch {
            quizRepository.getLeaderboardFlow().collect {
                _leaderboard.value = it
            }
        }
    }

    fun removeBookmark(questionId: String) {
        viewModelScope.launch {
            bookmarkDao.deleteByQuestionId(questionId)
        }
    }

    fun toggleBookmark(question: Question) {
        viewModelScope.launch {
            val isBookmarked = bookmarkDao.isBookmarkedSync(question.id)
            if (isBookmarked) {
                bookmarkDao.deleteByQuestionId(question.id)
                _isBookmarked.value = false
            } else {
                bookmarkDao.insertBookmark(
                    BookmarkEntity(
                        questionId = question.id,
                        questionText = question.questionText,
                        options = question.options,
                        correctAnswer = question.correctAnswer,
                        explanation = question.explanation,
                        topicName = currentChapterName
                    )
                )
                _isBookmarked.value = true
            }
        }
    }

    fun resetQuiz() {
        _quizResult.value = null
        _xpAwardedInThisSession.value = null
        _selectedAnswers.value = emptyMap()
        _answerState.value = emptyMap()
        _currentQuestionIndex.value = 0
        _stars.value = 0
        isSessionInitialized = false
    }
}
