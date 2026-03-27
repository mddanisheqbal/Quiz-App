package com.example.quizapp.presentation.viewmodel

import android.app.Activity
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.local.BookmarkEntity
import com.example.quizapp.data.local.QuizSessionEntity
import com.example.quizapp.data.local.BookmarkDao
import com.example.quizapp.data.model.*
import com.example.quizapp.data.repository.QuizRepository
import com.example.quizapp.data.repository.StoreRepository
import com.example.quizapp.util.*
import com.example.quizapp.data.repository.CoinsManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

enum class AnswerState {
    CORRECT, INCORRECT, UNANSWERED, SKIPPED
}

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val quizRepository: QuizRepository,
    private val storeRepository: StoreRepository,
    private val prefsManager: PreferencesManager,
    private val networkUtils: NetworkUtils,
    private val rewardedAdManager: RewardedAdManager,
    private val dailyRewardManager: DailyRewardManager,
    private val streakManager: StreakManager,
    private val coinsManager: CoinsManager,
    private val bookmarkDao: BookmarkDao,
    private val dailyChallengeManager: DailyChallengeManager,
    private val firestore: FirebaseFirestore
) : ViewModel() {

    private val _categories = MutableStateFlow<Resource<List<Category>>>(Resource.Loading())
    val categories: StateFlow<Resource<List<Category>>> = _categories

    private val _topics = MutableStateFlow<Resource<List<Topic>>>(Resource.Loading())
    val topics: StateFlow<Resource<List<Topic>>> = _topics

    private val _questions = MutableStateFlow<List<Question>>(emptyList())
    val questions: StateFlow<List<Question>> = _questions

    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex

    private val _selectedAnswers = MutableStateFlow<Map<String, String>>(emptyMap())
    val selectedAnswers: StateFlow<Map<String, String>> = _selectedAnswers

    private val _selectedAnswer = MutableStateFlow<String?>(null)
    val selectedAnswer: StateFlow<String?> = _selectedAnswer

    private val _showResult = MutableStateFlow(false)
    val showResult: StateFlow<Boolean> = _showResult

    private val _isTimeUp = MutableStateFlow(false)
    val isTimeUp: StateFlow<Boolean> = _isTimeUp

    private val _showTimeUpDialog = MutableStateFlow(false)
    val showTimeUpDialog: StateFlow<Boolean> = _showTimeUpDialog

    private val _answerState = MutableStateFlow<Map<String, AnswerState>>(emptyMap())
    val answerState: StateFlow<Map<String, AnswerState>> = _answerState

    private val _quizResult = MutableStateFlow<Resource<QuizResult>?>(null)
    val quizResult: StateFlow<Resource<QuizResult>?> = _quizResult

    private val _showResumeDialog = MutableStateFlow(false)
    val showResumeDialog: StateFlow<Boolean> = _showResumeDialog

    private val _resumeMessage = MutableStateFlow("")
    val resumeMessage: StateFlow<String> = _resumeMessage

    private val _timeRemaining = MutableStateFlow(30)
    val timeRemaining: StateFlow<Int> = _timeRemaining

    private val _stars = MutableStateFlow(0)
    val stars: StateFlow<Int> = _stars

    private val _achievements = MutableStateFlow<Resource<List<Achievement>>>(Resource.Loading())
    val achievements: StateFlow<Resource<List<Achievement>>> = _achievements

    private val _totalXP = MutableStateFlow(prefsManager.getTotalXP())
    val totalXP: StateFlow<Int> = _totalXP

    private val _userLevel = MutableStateFlow(1)
    val userLevel: StateFlow<Int> = _userLevel

    private val _streakCount = MutableStateFlow(0)
    val streakCount: StateFlow<Int> = _streakCount

    private val _completedChallenges = MutableStateFlow<List<String>>(emptyList())
    val completedChallenges: StateFlow<List<String>> = _completedChallenges

    private val _topicProgress = MutableStateFlow<Map<String, Int>>(emptyMap())
    val topicProgress: StateFlow<Map<String, Int>> = _topicProgress

    private val _leaderboard = MutableStateFlow<Resource<List<User>>>(Resource.Loading())
    val leaderboard: StateFlow<Resource<List<User>>> = _leaderboard

    private val _monthlyLeaderboard = MutableStateFlow<Resource<List<User>>>(Resource.Loading())
    val monthlyLeaderboard: StateFlow<Resource<List<User>>> = _monthlyLeaderboard

    private val _xpAwardedInThisSession = MutableStateFlow<Int?>(null)
    val xpAwardedInThisSession: StateFlow<Int?> = _xpAwardedInThisSession

    private val _isBookmarked = MutableStateFlow(false)
    val isBookmarked: StateFlow<Boolean> = _isBookmarked

    private val _isPreviouslyCompleted = MutableStateFlow(false)
    val isPreviouslyCompleted: StateFlow<Boolean> = _isPreviouslyCompleted

    private val _isOnline = MutableStateFlow(networkUtils.isNetworkAvailable())
    val isOnline: StateFlow<Boolean> = _isOnline

    private val _coins = MutableStateFlow(0)
    val coins: StateFlow<Int> = _coins

    private val _dailyRewardAmount = MutableStateFlow<Int?>(null)
    val dailyRewardAmount: StateFlow<Int?> = _dailyRewardAmount

    private val _showDailyRewardDialog = MutableStateFlow(false)
    val showDailyRewardDialog: StateFlow<Boolean> = _showDailyRewardDialog

    private val _isHintVisible = MutableStateFlow(false)
    val isHintVisible: StateFlow<Boolean> = _isHintVisible

    private val _removedOptions = MutableStateFlow<Set<String>>(emptySet())
    val removedOptions: StateFlow<Set<String>> = _removedOptions

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    private var isSubmitting = false
    private var timerJob: Job? = null

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

    private val _showLevelUpDialog = MutableStateFlow<Pair<Int, Int>?>(null)
    val showLevelUpDialog: StateFlow<Pair<Int, Int>?> = _showLevelUpDialog

    var homeGridScrollIndex = 0
    var homeGridScrollOffset = 0

    init {
        restoreUserData()
        observeNetwork()
        checkDailyReward()
        observeCoins()
        updateStreak()
        loadCategories()
        loadAchievements()
    }

    fun loadCategories() {
        viewModelScope.launch {
            _categories.value = Resource.Loading()
            val result = quizRepository.getCategories()
            _categories.value = result
        }
    }

    fun loadAchievements() {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            _achievements.value = Resource.Loading()
            quizRepository.getAchievementsFlow(userId).collect {
                _achievements.value = it
            }
        }
    }

    fun loadTopics(categoryId: String) {
        viewModelScope.launch {
            _topics.value = Resource.Loading()
            quizRepository.getTopicsFlow(categoryId).collect {
                _topics.value = it
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

    fun loadMonthlyLeaderboard() {
        viewModelScope.launch {
            quizRepository.getMonthlyLeaderboardFlow().collect {
                _monthlyLeaderboard.value = it
            }
        }
    }

    private fun updateStreak() {
        viewModelScope.launch {
            val newStreak = streakManager.updateDailyStreak()
            _streakCount.value = newStreak
        }
    }

    private fun observeNetwork() {
        viewModelScope.launch {
            networkUtils.observeNetworkStatus.collect {
                _isOnline.value = it
            }
        }
    }

    private fun observeCoins() {
        viewModelScope.launch {
            storeRepository.getUserCoins().collect { resource ->
                if (resource is Resource.Success) {
                    _coins.value = resource.data ?: 0
                }
            }
        }
    }

    private fun restoreUserData() {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            val result = quizRepository.getUserProfile(userId)
            if (result is Resource.Success) {
                val user = result.data!!
                
                // Reset challenges if needed
                val updatedUser = dailyChallengeManager.checkAndResetChallenges(user)
                
                _totalXP.value = updatedUser.totalXP
                _streakCount.value = updatedUser.streak
                
                val calculatedLevel = Constants.calculateLevel(updatedUser.totalXP)
                _userLevel.value = calculatedLevel
                
                _completedChallenges.value = updatedUser.completedChallenges
                prefsManager.setTotalXP(updatedUser.totalXP)
                
                if (updatedUser.level != calculatedLevel) {
                    quizRepository.updateUserLevel(userId, calculatedLevel)
                }
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

    private fun checkDailyReward() {
        viewModelScope.launch {
            if (networkUtils.isNetworkAvailable()) {
                val reward = dailyRewardManager.checkAndClaimDailyReward()
                if (reward != null) {
                    _dailyRewardAmount.value = reward
                    _showDailyRewardDialog.value = true
                }
            }
        }
    }

    fun dismissDailyRewardDialog() {
        _showDailyRewardDialog.value = false
        _dailyRewardAmount.value = null
    }

    fun showRewardedAd(activity: Activity) {
        if (!networkUtils.isNetworkAvailable()) return
        
        rewardedAdManager.showRewardedAd(
            activity = activity,
            onRewardEarned = { _ ->
                viewModelScope.launch {
                    val rewardCoins = 20 + (Math.random() * 30).toInt()
                    storeRepository.addCoins(rewardCoins)
                }
            },
            onAdDismissed = {
            }
        )
    }

    fun isAdLoaded(): Boolean = rewardedAdManager.isAdLoaded()

    fun useHint(): Boolean {
        if (coins.value >= 10 && !_isHintVisible.value) {
            viewModelScope.launch {
                if (coinsManager.spendCoins(10)) {
                    _isHintVisible.value = true
                }
            }
            return true
        }
        return false
    }

    fun skipQuestionPowerUp(): Boolean {
        if (coins.value >= 15) {
            viewModelScope.launch {
                if (coinsManager.spendCoins(15)) {
                    nextQuestion()
                }
            }
            return true
        }
        return false
    }

    fun removeTwoOptionsPowerUp() {
        val currentQuestion = _questions.value.getOrNull(_currentQuestionIndex.value) ?: return
        if (currentQuestion.questionType != QuestionType.MULTIPLE_CHOICE) return
        if (currentQuestion.options.size < 3) return
        if (_removedOptions.value.isNotEmpty()) return

        if (coins.value >= 10) {
            viewModelScope.launch {
                if (coinsManager.spendCoins(10)) {
                    val options = currentQuestion.options.toMutableList()
                    val correct = currentQuestion.correctAnswer
                    options.remove(correct)
                    options.shuffle()
                    val toRemove = options.take(2).toSet()
                    _removedOptions.value = toRemove
                }
            }
        }
    }

    fun removeBookmark(questionId: String) {
        viewModelScope.launch {
            bookmarkDao.deleteByQuestionId(questionId)
        }
    }

    fun resetQuizState() {
        timerJob?.cancel()
        _questions.value = emptyList()
        _currentQuestionIndex.value = 0
        _selectedAnswers.value = emptyMap()
        _selectedAnswer.value = null
        _showResult.value = false
        _isTimeUp.value = false
        _showTimeUpDialog.value = false
        _answerState.value = emptyMap()
        _quizResult.value = null
        _xpAwardedInThisSession.value = null
        _stars.value = 0
        _isHintVisible.value = false
        _removedOptions.value = emptySet()
        _error.value = null
        _timeRemaining.value = 30
        isSubmitting = false
        isSessionInitialized = false
        pendingSession = null
    }

    fun loadQuestions(categoryId: String, chapterId: String, chapterName: String, categoryColor: String = "#7B1FA2") {
        viewModelScope.launch {
            resetQuizState() // 🔥 CRITICAL: Clear previous quiz state before starting new one
            
            isDailyChallenge = (categoryId == "random")
            currentCategoryId = categoryId
            currentChapterId = chapterId
            currentChapterName = chapterName
            currentQuizId = chapterId 
            quizStartTime = System.currentTimeMillis()

            val userId = FirebaseAuth.getInstance().currentUser?.uid
            if (userId != null && !isDailyChallenge) {
                quizRepository.updateUserLastProgress(
                    userId = userId,
                    categoryId = categoryId,
                    categoryName = chapterName,
                    topicId = chapterId,
                    topicName = chapterName,
                    categoryColor = categoryColor
                )

                _isPreviouslyCompleted.value = quizRepository.isQuizCompleted(userId, currentQuizId)
                
                val sessionResource = quizRepository.getQuizSession(userId, chapterId)
                if (sessionResource is Resource.Success && sessionResource.data != null) {
                    val session = sessionResource.data
                    // 🔥 FIX: Only show resume if there is actual progress
                    if (session.currentIndex > 0 || session.answers.isNotEmpty()) {
                        pendingSession = session
                        _resumeMessage.value = "You answered ${session.answers.size} / ${session.totalQuestions} questions"
                        _showResumeDialog.value = true
                        return@launch
                    }
                }
            }
            
            if (!networkUtils.isNetworkAvailable()) {
                _error.value = "No internet connection"
                return@launch
            }

            fetchQuestions(chapterId, isResuming = false)
        }
    }

    private suspend fun fetchQuestions(chapterId: String, isResuming: Boolean, savedOrder: List<String>? = null) {
        _isLoading.value = true
        Log.d("QUIZ_DEBUG", "Fetching questions for chapterId: $chapterId, isResuming: $isResuming")
        try {
            val result = if (isDailyChallenge) {
                quizRepository.getRandomQuestions(10)
            } else {
                quizRepository.getQuestions(chapterId)
            }

            when (result) {
                is Resource.Success<List<Question>> -> {
                    val questionsList = result.data ?: emptyList()
                    Log.d("QUIZ_DEBUG", "Fetched ${questionsList.size} questions")
                    
                    if (questionsList.isEmpty()) {
                        Log.e("QUIZ_ERROR", "No questions found for topic: $chapterId")
                        _error.value = "No questions found for this topic."
                        return
                    }

                    _questions.value = questionsList
                    
                    if (isResuming && pendingSession != null) {
                        _currentQuestionIndex.value = pendingSession!!.currentIndex
                        _selectedAnswers.value = pendingSession!!.answers
                        
                        // Restore answer states
                        val restoredStates = mutableMapOf<String, AnswerState>()
                        pendingSession!!.answers.forEach { (qid, ans) ->
                            val question = questionsList.find { it.id == qid }
                            if (question != null) {
                                val isCorrect = question.correctAnswer.equals(ans, ignoreCase = true)
                                restoredStates[qid] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT
                            }
                        }
                        _answerState.value = restoredStates
                        isSessionInitialized = true
                    } else {
                        _currentQuestionIndex.value = 0
                        _selectedAnswers.value = emptyMap()
                        _answerState.value = emptyMap()
                    }
                    
                    startQuestionTimer()
                }
                is Resource.Error<List<Question>> -> {
                    Log.e("QUIZ_ERROR", "Error fetching questions: ${result.message}")
                    _error.value = result.message
                }
                else -> {}
            }
        } catch (e: Exception) {
            Log.e("QUIZ_ERROR", "Exception fetching questions", e)
            _error.value = e.message
        } finally {
            _isLoading.value = false
        }
    }

    fun startQuestionTimer() {
        _timeRemaining.value = 30
        resumeTimer()
    }

    fun pauseTimer() {
        timerJob?.cancel()
    }

    fun resumeTimer() {
        startTimerWithRemaining()
    }

    private fun startTimerWithRemaining() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (_timeRemaining.value > 0) {
                delay(1000)
                _timeRemaining.value--
            }
            onTimeUp()
        }
    }

    fun onTimeUp() {
        timerJob?.cancel()
        
        val currentQuestion = _questions.value.getOrNull(_currentQuestionIndex.value)
        if (currentQuestion != null) {
            val currentStates = _answerState.value.toMutableMap()
            currentStates[currentQuestion.id] = AnswerState.SKIPPED
            _answerState.value = currentStates
        }

        viewModelScope.launch {
            delay(300)
            _isTimeUp.value = true
            _showTimeUpDialog.value = true
        }
    }

    fun goToNextAfterTimeUp() {
        _isTimeUp.value = false
        _showTimeUpDialog.value = false
        nextQuestion()
    }

    fun dismissTimeUpDialog() {
        goToNextAfterTimeUp()
    }

    fun onAnswerSelected(answer: String) {
        if (_showResult.value || _isTimeUp.value || _showTimeUpDialog.value) return

        timerJob?.cancel()
        val currentQuestion = _questions.value.getOrNull(_currentQuestionIndex.value) ?: return
        
        _selectedAnswer.value = answer
        _showResult.value = true

        val isCorrect = currentQuestion.correctAnswer.equals(answer, ignoreCase = true)
        
        val currentAnswers = _selectedAnswers.value.toMutableMap()
        currentAnswers[currentQuestion.id] = answer
        _selectedAnswers.value = currentAnswers

        val currentStates = _answerState.value.toMutableMap()
        currentStates[currentQuestion.id] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT
        _answerState.value = currentStates

        if (!isSessionInitialized) {
            isSessionInitialized = true
        }
        updateSession()
    }

    fun setAnswer(questionId: String, answer: String) {
        if (_questions.value.isEmpty()) return

        val currentAnswers = _selectedAnswers.value.toMutableMap()
        currentAnswers[questionId] = answer
        _selectedAnswers.value = currentAnswers

        val currentQuestion = _questions.value.find { it.id == questionId }
        if (currentQuestion != null) {
            val isCorrect = currentQuestion.correctAnswer.equals(answer, ignoreCase = true)
            val currentStates = _answerState.value.toMutableMap()
            currentStates[questionId] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT
            _answerState.value = currentStates
        }

        // 🔥 Save session ONLY when user interacts
        if (!isSessionInitialized) {
            isSessionInitialized = true
        }
        updateSession()
    }

    fun nextQuestion() {
        // Mark as skipped if not answered
        val currentQuestion = _questions.value.getOrNull(_currentQuestionIndex.value)
        if (currentQuestion != null && !_answerState.value.containsKey(currentQuestion.id)) {
            val currentStates = _answerState.value.toMutableMap()
            currentStates[currentQuestion.id] = AnswerState.SKIPPED
            _answerState.value = currentStates
        }

        _selectedAnswer.value = null
        _showResult.value = false
        _isTimeUp.value = false
        _showTimeUpDialog.value = false

        if (_currentQuestionIndex.value < _questions.value.size - 1) {
            _currentQuestionIndex.value++
            _isHintVisible.value = false
            _removedOptions.value = emptySet()
            updateSession()
            startQuestionTimer()
        } else {
            submitQuiz()
        }
    }

    fun previousQuestion() {
        if (_currentQuestionIndex.value > 0) {
            _currentQuestionIndex.value--
            updateSession()
            startQuestionTimer()
        }
    }

    fun goToQuestion(index: Int) {
        if (index in _questions.value.indices) {
            _currentQuestionIndex.value = index
            updateSession()
            startQuestionTimer()
        }
    }

    fun updateTimeRemaining(time: Int) {
        _timeRemaining.value = time
    }

    private fun updateSession() {
        if (!isSessionInitialized || isDailyChallenge) return

        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            quizRepository.saveQuizSession(
                userId = userId,
                chapterId = currentChapterId,
                categoryId = currentCategoryId,
                currentIndex = _currentQuestionIndex.value,
                answers = _selectedAnswers.value,
                questionOrder = _questions.value.map { it.id },
                totalQuestions = _questions.value.size,
                startedAt = quizStartTime
            )
        }
    }

    fun submitQuiz() {
        if (_questions.value.isEmpty()) return // 🔥 Prevent auto-submit if no questions loaded
        if (isSubmitting) return // 🔥 Prevent multiple submissions
        isSubmitting = true
        timerJob?.cancel()

        viewModelScope.launch {
            val currentStates = _answerState.value.toMutableMap()
            
            // Mark all unanswered questions as SKIPPED
            _questions.value.forEach { question ->
                if (!currentStates.containsKey(question.id)) {
                    currentStates[question.id] = AnswerState.SKIPPED
                }
            }
            _answerState.value = currentStates

            val correctCount = currentStates.values.count { it == AnswerState.CORRECT }
            val totalQuestions = _questions.value.size
            val scorePercentage = if (totalQuestions > 0) (correctCount * 100) / totalQuestions else 0
            
            var xpEarned = correctCount * 10
            // Feature: 10th number bonus
            if (correctCount >= 10) {
                xpEarned += 25 
            }
            
            val coinsEarned = correctCount * 2
            
            val result = QuizResult(
                quizId = currentQuizId,
                categoryId = currentCategoryId,
                categoryName = currentChapterName,
                totalQuestions = totalQuestions,
                correctAnswers = correctCount,
                wrongAnswers = totalQuestions - correctCount,
                totalScore = xpEarned,
                maxScore = totalQuestions * 10,
                percentage = scorePercentage.toFloat(),
                completedAt = System.currentTimeMillis()
            )
            
            _quizResult.value = Resource.Success(result)
            _xpAwardedInThisSession.value = xpEarned
            
            // Handle Challenge Completion logic linking result -> challenge type
            checkChallengeCompletion(correctCount, totalQuestions, scorePercentage)
            
            // Trigger Achievements
            checkAchievements(correctCount, totalQuestions)
            
            // Save results to user profile
            val userId = FirebaseAuth.getInstance().currentUser?.uid
            if (userId != null) {
                quizRepository.saveQuizResult(userId, result)
                storeRepository.addCoins(coinsEarned)
                // 🔥 Clear session after successful submission
                quizRepository.deleteQuizSession(userId, currentChapterId)
            }
        }
    }

    private suspend fun checkChallengeCompletion(score: Int, total: Int, percentage: Int) {
        // Daily Challenge: Answer 10 questions
        if (isDailyChallenge && currentChapterId == "daily" && total >= 10) {
            dailyChallengeManager.completeChallenge("daily", 25, 10)
        }
        
        // Speed Challenge: Complete in 60 sec (Total time taken)
        val timeTaken = (System.currentTimeMillis() - quizStartTime) / 1000
        if (isDailyChallenge && currentChapterId == "speed" && timeTaken <= 60) {
            dailyChallengeManager.completeChallenge("speed", 30, 15)
        }
        
        // Accuracy Challenge: Score 100%
        if (isDailyChallenge && currentChapterId == "accuracy" && percentage == 100) {
            dailyChallengeManager.completeChallenge("accuracy", 40, 20)
        }
        
        // Category Challenge: Complete any quiz in a specific category (implied here)
        if (!isDailyChallenge) {
            dailyChallengeManager.completeChallenge("category", 20, 10)
        }
    }

    private fun checkAchievements(score: Int, total: Int) {
        if (score == total && total >= 5) {
            unlockAchievement("perfect_score")
        }
        
        if (_streakCount.value >= 7) {
            unlockAchievement("7_day_streak")
        }
        
        if (_totalXP.value + (score * 10) >= 500) {
            unlockAchievement("xp_500")
        }
    }

    fun unlockAchievement(id: String) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            try {
                val achievementRef = firestore.collection("users").document(userId)
                    .collection("achievements").document(id)
                
                val doc = achievementRef.get().await()
                if (!doc.exists()) {
                    val achievementData = mapOf(
                        "id" to id,
                        "unlocked" to true,
                        "unlockedAt" to System.currentTimeMillis()
                    )
                    achievementRef.set(achievementData).await()
                    // You might want to emit an event to show a toast or dialog
                    Log.d("ACHIEVEMENT", "🏆 Achievement Unlocked: $id")
                }
            } catch (e: Exception) {
                Log.e("ACHIEVEMENT", "Failed to unlock achievement", e)
            }
        }
    }

    fun toggleBookmark(question: Question) {
        viewModelScope.launch {
            if (_isBookmarked.value) {
                bookmarkDao.deleteByQuestionId(question.id)
                _isBookmarked.value = false
            } else {
                bookmarkDao.insertBookmark(BookmarkEntity(
                    questionId = question.id,
                    questionText = question.questionText,
                    options = question.options,
                    correctAnswer = question.correctAnswer,
                    explanation = question.explanation,
                    topicName = currentChapterName,
                    categoryName = currentCategoryId
                ))
                _isBookmarked.value = true
            }
        }
    }

    fun resetQuiz() {
        resetQuizState()
    }

    fun resumeQuiz() {
        _showResumeDialog.value = false
        viewModelScope.launch {
            fetchQuestions(currentChapterId, isResuming = true)
        }
    }

    fun restartQuiz() {
        _showResumeDialog.value = false
        val userId = FirebaseAuth.getInstance().currentUser?.uid
        viewModelScope.launch {
            if (userId != null) {
                quizRepository.deleteQuizSession(userId, currentChapterId)
            }
            resetQuizState()
            loadQuestions(currentCategoryId, currentChapterId, currentChapterName)
        }
    }
}
