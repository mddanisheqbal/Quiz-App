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
import javax.inject.Inject

enum class AnswerState {
    CORRECT, INCORRECT, UNANSWERED, SKIPPED
}

data class AnswerResult(
    val question: String,
    val userAnswer: String?,
    val correctAnswer: String,
    val isCorrect: Boolean
)

data class QuizUiState(
    val questions: List<Question> = emptyList(),
    val currentIndex: Int = 0,
    val selectedAnswers: Map<String, String> = emptyMap(),
    val answerState: Map<String, AnswerState> = emptyMap(),
    val selectedAnswer: String? = null,
    val showResult: Boolean = false,
    val isTimeUp: Boolean = false,
    val showTimeUpDialog: Boolean = false,
    val isFinished: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
    val timeRemaining: Int = 30,
    val isHintVisible: Boolean = false,
    val removedOptions: Set<String> = emptySet(),
    val quizResult: Resource<QuizResult>? = null,
    val xpAwarded: Int? = null,
    val starsEarned: Int = 0,
    val wrongAnswers: List<AnswerResult> = emptyList()
)

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

    private val _uiState = MutableStateFlow(QuizUiState())
    val uiState: StateFlow<QuizUiState> = _uiState.asStateFlow()

    // Backward compatibility flows
    val questions = _uiState.map { it.questions }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())
    val currentQuestionIndex = _uiState.map { it.currentIndex }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)
    val selectedAnswers = _uiState.map { it.selectedAnswers }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyMap())
    val selectedAnswer = _uiState.map { it.selectedAnswer }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)
    val showResult = _uiState.map { it.showResult }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)
    val isTimeUp = _uiState.map { it.isTimeUp }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)
    val showTimeUpDialog = _uiState.map { it.showTimeUpDialog }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)
    val answerState = _uiState.map { it.answerState }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyMap())
    val quizResult = _uiState.map { it.quizResult }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)
    val timeRemaining = _uiState.map { it.timeRemaining }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 30)
    val stars = _uiState.map { it.starsEarned }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)
    val xpAwardedInThisSession = _uiState.map { it.xpAwarded }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)
    val isHintVisible = _uiState.map { it.isHintVisible }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)
    val removedOptions = _uiState.map { it.removedOptions }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptySet())
    val isLoading = _uiState.map { it.isLoading }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)
    val error = _uiState.map { it.error }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)
    val wrongAnswers = _uiState.map { it.wrongAnswers }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    private val _categories = MutableStateFlow<Resource<List<Category>>>(Resource.Loading())
    val categories: StateFlow<Resource<List<Category>>> = _categories

    private val _topics = MutableStateFlow<Resource<List<Topic>>>(Resource.Loading())
    val topics: StateFlow<Resource<List<Topic>>> = _topics

    private val _showResumeDialog = MutableStateFlow(false)
    val showResumeDialog: StateFlow<Boolean> = _showResumeDialog

    private val _resumeMessage = MutableStateFlow("")
    val resumeMessage: StateFlow<String> = _resumeMessage

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

    private val _toastMessage = MutableSharedFlow<String>()
    val toastMessage = _toastMessage.asSharedFlow()

    val isAllAnswered: StateFlow<Boolean> = _uiState.map { state ->
        state.questions.isNotEmpty() && state.questions.all { state.answerState.containsKey(it.id) }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)

    private var isSubmitting = false
    private var timerJob: Job? = null

    val achievementEvent = achievementManager.achievementEvent

    val bookmarkedQuestions: StateFlow<List<BookmarkEntity>> = bookmarkDao.getAllBookmarks()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Public info for retry navigation
    var currentTopicId: String = ""
        private set
    var currentCategoryId: String = ""
        private set
    var currentTopicName: String = ""
        private set

    private var currentQuizId = ""
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
        combine(_uiState.map { it.currentIndex }, _uiState.map { it.questions }, bookmarkedQuestions) { index, questions, bookmarks ->
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
        if (coins.value >= 10 && !uiState.value.isHintVisible) {
            viewModelScope.launch {
                if (coinsManager.spendCoins(10)) {
                    _uiState.update { it.copy(isHintVisible = true) }
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
                    val currentQuestion = uiState.value.questions.getOrNull(uiState.value.currentIndex)
                    if (currentQuestion != null) {
                        val currentStates = uiState.value.answerState.toMutableMap()
                        currentStates[currentQuestion.id] = AnswerState.SKIPPED
                        _uiState.update { it.copy(answerState = currentStates) }
                    }
                    nextQuestion()
                }
            }
            return true
        }
        return false
    }

    fun removeTwoOptionsPowerUp() {
        val currentQuestion = uiState.value.questions.getOrNull(uiState.value.currentIndex) ?: return
        if (currentQuestion.questionType != QuestionType.MULTIPLE_CHOICE) return
        if (currentQuestion.options.size < 3) return
        if (uiState.value.removedOptions.isNotEmpty()) return

        if (coins.value >= 10) {
            viewModelScope.launch {
                if (coinsManager.spendCoins(10)) {
                    val options = currentQuestion.options.toMutableList()
                    val correct = currentQuestion.correctAnswer
                    options.remove(correct)
                    options.shuffle()
                    val toRemove = options.take(2).toSet()
                    _uiState.update { it.copy(removedOptions = toRemove) }
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
        _uiState.value = QuizUiState()
        isSubmitting = false
        isSessionInitialized = false
        pendingSession = null
    }

    fun loadQuestions(categoryId: String, chapterId: String, chapterName: String, categoryColor: String = "#7B1FA2") {
        if (currentTopicId == chapterId && uiState.value.questions.isNotEmpty()) {
            return
        }

        viewModelScope.launch {
            resetQuizState()
            _uiState.update { it.copy(isLoading = true) }

            isDailyChallenge = (categoryId == "random")
            currentCategoryId = categoryId
            currentTopicId = chapterId
            currentTopicName = chapterName
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
                        _uiState.update { it.copy(isLoading = false) }
                        return@launch
                    }
                }
            }
            
            if (!networkUtils.isNetworkAvailable()) {
                _uiState.update { it.copy(error = "No internet connection", isLoading = false) }
                return@launch
            }

            fetchQuestions(chapterId, isResuming = false)
        }
    }

    private suspend fun fetchQuestions(chapterId: String, isResuming: Boolean, savedOrder: List<String>? = null) {
        _uiState.update { it.copy(isLoading = true) }
        try {
            val result = if (isDailyChallenge) {
                quizRepository.getRandomQuestions(10)
            } else {
                quizRepository.getQuestions(chapterId)
            }

            when (result) {
                is Resource.Success<List<Question>> -> {
                    val questionsList = result.data ?: emptyList()

                    if (questionsList.isEmpty()) {
                        _uiState.update { it.copy(error = "No questions found for this topic.", isLoading = false) }
                        return
                    }

                    if (isResuming && pendingSession != null) {
                        // Restore answer states
                        val restoredStates = mutableMapOf<String, AnswerState>()
                        pendingSession!!.answers.forEach { (qid, ans) ->
                            val question = questionsList.find { it.id == qid }
                            if (question != null) {
                                val isCorrect = question.correctAnswer.equals(ans, ignoreCase = true)
                                restoredStates[qid] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT
                            }
                        }
                        
                        val qId = questionsList.getOrNull(pendingSession!!.currentIndex)?.id

                        _uiState.update { it.copy(
                            questions = questionsList,
                            currentIndex = pendingSession!!.currentIndex,
                            selectedAnswers = pendingSession!!.answers,
                            answerState = restoredStates,
                            selectedAnswer = if (qId != null) pendingSession!!.answers[qId] else null,
                            showResult = if (qId != null) restoredStates.containsKey(qId) else false,
                            isLoading = false
                        ) }

                        isSessionInitialized = true
                    } else {
                        _uiState.update { it.copy(
                            questions = questionsList,
                            currentIndex = 0,
                            selectedAnswers = emptyMap(),
                            answerState = emptyMap(),
                            isLoading = false
                        ) }
                    }

                    startQuestionTimer()
                }
                is Resource.Error<List<Question>> -> {
                    _uiState.update { it.copy(error = result.message, isLoading = false) }
                }
                else -> {}
            }
        } catch (e: Exception) {
            _uiState.update { it.copy(error = e.message, isLoading = false) }
        }
    }

    fun startQuestionTimer() {
        val currentQuestion = uiState.value.questions.getOrNull(uiState.value.currentIndex)
        val state = uiState.value.answerState[currentQuestion?.id] ?: AnswerState.UNANSWERED
        
        if (state == AnswerState.UNANSWERED) {
            _uiState.update { it.copy(timeRemaining = 30) }
            resumeTimer()
        } else {
            timerJob?.cancel()
            _uiState.update { it.copy(timeRemaining = 0) }
        }
    }

    fun pauseTimer() {
        timerJob?.cancel()
    }

    fun resumeTimer() {
        val currentQuestion = uiState.value.questions.getOrNull(uiState.value.currentIndex)
        val state = uiState.value.answerState[currentQuestion?.id] ?: AnswerState.UNANSWERED

        if (state == AnswerState.UNANSWERED) {
            startTimerWithRemaining()
        } else {
            timerJob?.cancel()
        }
    }

    private fun startTimerWithRemaining() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (uiState.value.timeRemaining > 0) {
                delay(1000)
                _uiState.update { it.copy(timeRemaining = it.timeRemaining - 1) }
            }
            onTimeUp()
        }
    }

    fun onTimeUp() {
        timerJob?.cancel()
        _uiState.update { it.copy(timeRemaining = 0) }

        val currentQuestion = uiState.value.questions.getOrNull(uiState.value.currentIndex)
        if (currentQuestion != null) {
            val currentStates = uiState.value.answerState.toMutableMap()
            currentStates[currentQuestion.id] = AnswerState.SKIPPED
            _uiState.update { it.copy(
                answerState = currentStates,
                isTimeUp = true,
                showTimeUpDialog = true
            ) }
        }
    }

    fun goToNextAfterTimeUp() {
        _uiState.update { it.copy(isTimeUp = false, showTimeUpDialog = false) }
        nextQuestion()
    }

    fun dismissTimeUpDialog() {
        goToNextAfterTimeUp()
    }

    fun selectAnswer(answer: String) {
        if (uiState.value.showResult || uiState.value.isTimeUp || uiState.value.showTimeUpDialog) return
        _uiState.update { it.copy(selectedAnswer = answer) }
    }

    fun onAnswerSelected(answer: String) {
        if (uiState.value.showResult || uiState.value.isTimeUp || uiState.value.showTimeUpDialog) return

        timerJob?.cancel()
        val currentQuestion = uiState.value.questions.getOrNull(uiState.value.currentIndex) ?: return

        val isCorrect = currentQuestion.correctAnswer.equals(answer, ignoreCase = true)
        
        val newSelectedAnswers = uiState.value.selectedAnswers.toMutableMap().apply {
            put(currentQuestion.id, answer)
        }

        val currentStates = uiState.value.answerState.toMutableMap()
        currentStates[currentQuestion.id] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT

        _uiState.update { it.copy(
            selectedAnswer = answer,
            showResult = true,
            selectedAnswers = newSelectedAnswers,
            answerState = currentStates
        ) }

        if (!isSessionInitialized) {
            isSessionInitialized = true
        }
        updateSession()
    }

    fun nextQuestion() {
        val currentQuestion = uiState.value.questions.getOrNull(uiState.value.currentIndex)
        if (currentQuestion != null && !uiState.value.answerState.containsKey(currentQuestion.id)) {
            val currentStates = uiState.value.answerState.toMutableMap()
            currentStates[currentQuestion.id] = AnswerState.SKIPPED
            _uiState.update { it.copy(answerState = currentStates) }
        }

        _uiState.update { it.copy(isTimeUp = false, showTimeUpDialog = false) }

        if (uiState.value.currentIndex < uiState.value.questions.size - 1) {
            val nextIndex = uiState.value.currentIndex + 1
            val nextQuestionId = uiState.value.questions[nextIndex].id

            _uiState.update { it.copy(
                currentIndex = nextIndex,
                selectedAnswer = it.selectedAnswers[nextQuestionId],
                showResult = it.answerState.containsKey(nextQuestionId),
                isHintVisible = false,
                removedOptions = emptySet()
            ) }

            updateSession()
            startQuestionTimer()
        }
    }

    fun previousQuestion() {
        if (uiState.value.currentIndex > 0) {
            val prevIndex = uiState.value.currentIndex - 1
            val prevQuestionId = uiState.value.questions[prevIndex].id

            _uiState.update { it.copy(
                currentIndex = prevIndex,
                selectedAnswer = it.selectedAnswers[prevQuestionId],
                showResult = it.answerState.containsKey(prevQuestionId)
            ) }

            updateSession()
            startQuestionTimer()
        }
    }

    fun goToQuestion(index: Int) {
        if (index in uiState.value.questions.indices) {
            val questionId = uiState.value.questions[index].id

            _uiState.update { it.copy(
                currentIndex = index,
                selectedAnswer = it.selectedAnswers[questionId],
                showResult = it.answerState.containsKey(questionId)
            ) }

            updateSession()
            startQuestionTimer()
        }
    }

    private fun updateSession() {
        if (!isSessionInitialized || isDailyChallenge) return

        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            val questionsList = _uiState.value.questions
            quizRepository.saveQuizSession(
                userId = userId,
                chapterId = currentTopicId,
                categoryId = currentCategoryId,
                currentIndex = _uiState.value.currentIndex,
                answers = _uiState.value.selectedAnswers,
                questionOrder = questionsList.map { it.id },
                totalQuestions = questionsList.size,
                startedAt = quizStartTime
            )
        }
    }

    fun submitQuiz() {
        if (uiState.value.questions.isEmpty()) return

        if (!isAllAnswered.value) {
            viewModelScope.launch {
                _toastMessage.emit("Please answer all questions")
            }
            return
        }

        if (isSubmitting) return
        isSubmitting = true
        timerJob?.cancel()

        viewModelScope.launch {
            val currentStates = uiState.value.answerState.toMutableMap()

            uiState.value.questions.forEach { question ->
                if (!currentStates.containsKey(question.id)) {
                    currentStates[question.id] = AnswerState.UNANSWERED
                }
            }
            _uiState.update { it.copy(answerState = currentStates) }

            val correctCount = currentStates.values.count { it == AnswerState.CORRECT }
            val wrongCount = currentStates.values.count { it == AnswerState.INCORRECT }
            val skippedCount = currentStates.values.count { it == AnswerState.SKIPPED }
            val unattemptedCount = currentStates.values.count { it == AnswerState.UNANSWERED }

            val totalQuestions = uiState.value.questions.size
            val scorePercentage = if (totalQuestions > 0) (correctCount * 100) / totalQuestions else 0

            var xpEarned = correctCount * 10
            if (correctCount >= 10) {
                xpEarned += 25
            }

            val coinsEarned = correctCount * 2
            
            val wrongAnswersList = uiState.value.questions.mapNotNull { question ->
                val userAnswer = uiState.value.selectedAnswers[question.id]
                val isCorrect = userAnswer.equals(question.correctAnswer, ignoreCase = true)
                if (!isCorrect) {
                    AnswerResult(
                        question = question.questionText,
                        userAnswer = userAnswer,
                        correctAnswer = question.correctAnswer,
                        isCorrect = false
                    )
                } else null
            }

            val result = QuizResult(
                quizId = currentQuizId,
                categoryId = currentCategoryId,
                categoryName = currentTopicName,
                totalQuestions = totalQuestions,
                correctAnswers = correctCount,
                wrongAnswers = wrongCount,
                skippedAnswers = skippedCount + unattemptedCount,
                totalScore = xpEarned,
                maxScore = totalQuestions * 10,
                percentage = scorePercentage.toFloat(),
                answers = uiState.value.questions.associate { question ->
                    val userAnswer = uiState.value.selectedAnswers[question.id] ?: ""
                    question.id to UserAnswer(
                        questionId = question.id,
                        questionText = question.questionText,
                        userAnswer = userAnswer,
                        correctAnswer = question.correctAnswer,
                        isCorrect = userAnswer.equals(question.correctAnswer, ignoreCase = true)
                    )
                },
                completedAt = System.currentTimeMillis()
            )

            _uiState.update { it.copy(
                quizResult = Resource.Success(result),
                xpAwarded = xpEarned,
                isFinished = true,
                wrongAnswers = wrongAnswersList
            ) }

            val timeTaken = (System.currentTimeMillis() - quizStartTime) / 1000
            
            checkChallengeCompletion(correctCount, totalQuestions, scorePercentage, timeTaken)
            
            val userId = FirebaseAuth.getInstance().currentUser?.uid
            if (userId != null) {
                quizRepository.saveQuizResult(userId, result)
                storeRepository.addCoins(coinsEarned)
                quizRepository.deleteQuizSession(userId, currentTopicId)

                // FEATURE: Update Topic Progress with Stars to unlock next chapter
                if (!isDailyChallenge) {
                    val starsEarned = when {
                        scorePercentage >= 90 -> 3
                        scorePercentage >= 70 -> 2
                        scorePercentage >= 40 -> 1
                        else -> 0
                    }
                    _uiState.update { it.copy(starsEarned = starsEarned) }
                    quizRepository.updateTopicProgressWithStars(
                        userId = userId,
                        topicId = currentTopicId,
                        score = xpEarned,
                        stars = starsEarned,
                        totalQuestions = totalQuestions,
                        percentage = scorePercentage
                    )
                    // Refresh progress locally
                    restoreTopicProgress(userId)
                }

                // Achievement Progress Tracking
                val userResult = quizRepository.getUserProfile(userId)
                if (userResult is Resource.Success) {
                    var user = userResult.data!!
                    user = achievementManager.updateProgress(user, "quiz", 1)
                    if (correctCount == totalQuestions) {
                        user = achievementManager.updateProgress(user, "skill", 1)
                    }
                    if (timeTaken <= 60 && totalQuestions >= 5) {
                        user = achievementManager.updateProgress(user, "skill", 1)
                    }
                    user = achievementManager.updateProgress(user, "economy", coinsEarned)
                    quizRepository.updateUserAchievements(userId, user.achievements)
                }
            }
        }
    }

    fun getAnswerResults(): List<AnswerResult> {
        return uiState.value.questions.map { question ->
            val userAnswer = uiState.value.selectedAnswers[question.id]
            AnswerResult(
                question = question.questionText,
                userAnswer = userAnswer,
                correctAnswer = question.correctAnswer,
                isCorrect = userAnswer.equals(question.correctAnswer, ignoreCase = true)
            )
        }
    }

    private suspend fun checkChallengeCompletion(score: Int, total: Int, percentage: Int, timeTaken: Long) {
        if (isDailyChallenge && currentTopicId == "daily" && total >= 10) {
            dailyChallengeManager.completeChallenge("daily", 25, 10)
        }
        if (isDailyChallenge && currentTopicId == "speed" && timeTaken <= 60) {
            dailyChallengeManager.completeChallenge("speed", 30, 15)
        }
        if (isDailyChallenge && currentTopicId == "accuracy" && percentage == 100) {
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
                    topicName = currentTopicName,
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
        _uiState.update { it.copy(showResult = false, selectedAnswer = null) }
        _showResumeDialog.value = false
        viewModelScope.launch {
            fetchQuestions(currentTopicId, isResuming = true)
        }
    }

    fun restartQuiz() {
        _showResumeDialog.value = false
        val userId = FirebaseAuth.getInstance().currentUser?.uid
        viewModelScope.launch {
            if (userId != null) {
                quizRepository.deleteQuizSession(userId, currentTopicId)
            }
            resetQuizState()
            loadQuestions(currentCategoryId, currentTopicId, currentTopicName)
        }
    }

    fun retryQuiz() {
        _showResumeDialog.value = false
        resetQuizState() // CLEAR STATE SYNCHRONOUSLY

        val userId = FirebaseAuth.getInstance().currentUser?.uid
        viewModelScope.launch {
            if (userId != null) {
                quizRepository.deleteQuizSession(userId, currentTopicId)
            }
            // Start fresh
            loadQuestions(currentCategoryId, currentTopicId, currentTopicName)
        }
    }
}
