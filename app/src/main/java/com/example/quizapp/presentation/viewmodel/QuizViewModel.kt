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
    private val achievementManager: AchievementManager,
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

    private val _userAchievements = MutableStateFlow<Resource<List<UserAchievement>>>(Resource.Loading())
    val userAchievements: StateFlow<Resource<List<UserAchievement>>> = _userAchievements

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

    private val _toastMessage = MutableSharedFlow<String>()
    val toastMessage = _toastMessage.asSharedFlow()

    private var isSubmitting = false
    private var timerJob: Job? = null

    val achievementEvent = achievementManager.achievementEvent

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
        observeBookmarkStatus()
    }

    private fun observeBookmarkStatus() {
        combine(_currentQuestionIndex, _questions, bookmarkedQuestions) { index, questions, bookmarks ->
            val currentQuestion = questions.getOrNull(index)
            currentQuestion != null && bookmarks.any { it.questionId == currentQuestion.id }
        }.onEach { isBookmarked ->
            _isBookmarked.value = isBookmarked
        }.launchIn(viewModelScope)
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
            _userAchievements.value = Resource.Loading()
            quizRepository.getAchievementsFlow(userId).collect {
                _userAchievements.value = it
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
            
            // Trigger streak achievement
            val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return@launch
            val userResult = quizRepository.getUserProfile(userId)
            if (userResult is Resource.Success) {
                val updatedUser = achievementManager.updateProgress(userResult.data!!, "streak", newStreak)
                if (updatedUser != userResult.data) {
                    quizRepository.updateUserAchievements(userId, updatedUser.achievements)
                }
            }
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

                // Trigger progress achievement (level)
                val levelUser = achievementManager.updateProgress(updatedUser, "progress", calculatedLevel)
                if (levelUser != updatedUser) {
                    quizRepository.updateUserAchievements(userId, levelUser.achievements)
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
                    
                    // Trigger economy achievement
                    val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return@launch
                    val userResult = quizRepository.getUserProfile(userId)
                    if (userResult is Resource.Success) {
                        val updatedUser = achievementManager.updateProgress(userResult.data!!, "economy", rewardCoins)
                        if (updatedUser != userResult.data) {
                            quizRepository.updateUserAchievements(userId, updatedUser.achievements)
                        }
                    }
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
        _isLoading.value = false
    }

    fun loadQuestions(categoryId: String, chapterId: String, chapterName: String, categoryColor: String = "#7B1FA2") {
        // 🔥 OPTIMIZATION: Prevent reload if already loaded (e.g., on rotation or returning to screen)
        if (currentChapterId == chapterId && _questions.value.isNotEmpty()) {
            Log.d("QUIZ_DEBUG", "Quiz already loaded for $chapterId, skipping reload")
            return
        }

        viewModelScope.launch {
            resetQuizState() 
            _isLoading.value = true 
            
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
                    if (session.currentIndex > 0 || session.answers.isNotEmpty()) {
                        pendingSession = session
                        _resumeMessage.value = "You answered ${session.answers.size} / ${session.totalQuestions} questions"
                        _showResumeDialog.value = true
                        _isLoading.value = false 
                        return@launch
                    }
                }
            }
            
            if (!networkUtils.isNetworkAvailable()) {
                _error.value = "No internet connection"
                _isLoading.value = false
                return@launch
            }

            fetchQuestions(chapterId, isResuming = false)
        }
    }

    private suspend fun fetchQuestions(chapterId: String, isResuming: Boolean, savedOrder: List<String>? = null) {
        _isLoading.value = true
        Log.d("QUIZ_DEBUG", "Fetching questions for chapterId: $chapterId, isResuming: $isResuming")
        try {
            // Remove artificial delay for faster loading when data is cached or network is fast
            // delay(300)

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
        val currentQuestion = _questions.value.getOrNull(_currentQuestionIndex.value)
        val state = _answerState.value[currentQuestion?.id] ?: AnswerState.UNANSWERED
        
        if (state == AnswerState.UNANSWERED) {
            _timeRemaining.value = 30
            resumeTimer()
        } else {
            timerJob?.cancel()
            _timeRemaining.value = 0
        }
    }

    fun pauseTimer() {
        timerJob?.cancel()
    }

    fun resumeTimer() {
        val currentQuestion = _questions.value.getOrNull(_currentQuestionIndex.value)
        val state = _answerState.value[currentQuestion?.id] ?: AnswerState.UNANSWERED
        
        if (state == AnswerState.UNANSWERED) {
            startTimerWithRemaining()
        } else {
            timerJob?.cancel()
        }
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
        _timeRemaining.value = 0
        
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
        if (_questions.value.isEmpty()) return 
        if (isSubmitting) return 
        isSubmitting = true
        timerJob?.cancel()

        viewModelScope.launch {
            val currentStates = _answerState.value.toMutableMap()
            
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
            
            val timeTaken = (System.currentTimeMillis() - quizStartTime) / 1000
            
            checkChallengeCompletion(correctCount, totalQuestions, scorePercentage, timeTaken)
            
            val userId = FirebaseAuth.getInstance().currentUser?.uid
            if (userId != null) {
                quizRepository.saveQuizResult(userId, result)
                storeRepository.addCoins(coinsEarned)
                quizRepository.deleteQuizSession(userId, currentChapterId)
                
                // Achievement Progress Tracking
                val userResult = quizRepository.getUserProfile(userId)
                if (userResult is Resource.Success) {
                    var user = userResult.data!!
                    
                    // 🎯 Quiz count
                    user = achievementManager.updateProgress(user, "quiz", 1)
                    
                    // 🏆 Perfect Score
                    if (correctCount == totalQuestions) {
                        user = achievementManager.updateProgress(user, "skill", 1)
                    }
                    
                    // ⚡ Speed Master
                    if (timeTaken <= 60 && totalQuestions >= 5) {
                        user = achievementManager.updateProgress(user, "skill", 1)
                    }
                    
                    // 💰 Economy
                    user = achievementManager.updateProgress(user, "economy", coinsEarned)
                    
                    // Sync to Firestore
                    quizRepository.updateUserAchievements(userId, user.achievements)
                }
            }
        }
    }

    private suspend fun checkChallengeCompletion(score: Int, total: Int, percentage: Int, timeTaken: Long) {
        if (isDailyChallenge && currentChapterId == "daily" && total >= 10) {
            dailyChallengeManager.completeChallenge("daily", 25, 10)
        }
        if (isDailyChallenge && currentChapterId == "speed" && timeTaken <= 60) {
            dailyChallengeManager.completeChallenge("speed", 30, 15)
        }
        if (isDailyChallenge && currentChapterId == "accuracy" && percentage == 100) {
            dailyChallengeManager.completeChallenge("accuracy", 40, 20)
        }
        if (!isDailyChallenge) {
            dailyChallengeManager.completeChallenge("category", 20, 10)
        }
    }

    fun toggleBookmark(question: Question) {
        viewModelScope.launch {
            val currentlyBookmarked = bookmarkedQuestions.value.any { it.questionId == question.id }
            if (currentlyBookmarked) {
                bookmarkDao.deleteByQuestionId(question.id)
                _toastMessage.emit("Removed from bookmark")
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
                _toastMessage.emit("Added to bookmark")
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
