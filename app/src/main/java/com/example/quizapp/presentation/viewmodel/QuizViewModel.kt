package com.example.quizapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.local.BookmarkDao
import com.example.quizapp.data.local.BookmarkEntity
import com.example.quizapp.data.model.*
import com.example.quizapp.data.repository.QuizRepository
import com.example.quizapp.util.Constants
import com.example.quizapp.util.PreferencesManager
import com.example.quizapp.util.Resource
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
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
    private val bookmarkDao: BookmarkDao
) : ViewModel() {

    private val _categories = MutableStateFlow<Resource<List<Category>>>(Resource.Loading())
    val categories: StateFlow<Resource<List<Category>>> = _categories

    private val _topics = MutableStateFlow<Resource<List<Topic>>>(Resource.Loading())
    val topics: StateFlow<Resource<List<Topic>>> = _topics

    private val _questions = MutableStateFlow<Resource<List<Question>>>(Resource.Loading())
    val questions: StateFlow<Resource<List<Question>>> = _questions

    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex

    private val _userAnswers = MutableStateFlow<MutableMap<Int, String>>(mutableMapOf())
    val userAnswers: StateFlow<MutableMap<Int, String>> = _userAnswers

    private val _answerState = MutableStateFlow<Map<Int, AnswerState>>(emptyMap())
    val answerState: StateFlow<Map<Int, AnswerState>> = _answerState

    private val _timeRemaining = MutableStateFlow(-1)
    val timeRemaining: StateFlow<Int> = _timeRemaining

    private val _quizResult = MutableStateFlow<Resource<QuizResult>?>(null)
    val quizResult: StateFlow<Resource<QuizResult>?> = _quizResult

    private val _totalXP = MutableStateFlow(prefsManager.getTotalXP())
    val totalXP: StateFlow<Int> = _totalXP

    private val _userLevel = MutableStateFlow(calculateLevel(prefsManager.getTotalXP()))
    val userLevel: StateFlow<Int> = _userLevel

    val bookmarkedQuestions: StateFlow<List<BookmarkEntity>> = bookmarkDao.getAllBookmarks()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    private var currentQuizId = ""
    private var currentCategoryId = ""
    private var currentCategoryName = ""
    private var currentChapterId = ""
    private var currentChapterName = ""
    private var quizStartTime = 0L

    private var categoriesJob: Job? = null
    private var topicsJob: Job? = null
    private var questionsJob: Job? = null

    private var isSessionInitialized = false

    fun loadCategories() {
        categoriesJob?.cancel()
        categoriesJob = viewModelScope.launch {
            quizRepository.getCategoriesFlow().collect {
                _categories.value = it
            }
        }
    }

    fun loadTopics(categoryId: String) {
        topicsJob?.cancel()
        topicsJob = viewModelScope.launch {
            quizRepository.getTopicsFlow(categoryId).collect {
                _topics.value = it
            }
        }
    }

    fun loadQuestions(categoryId: String, chapterId: String, chapterName: String) {
        questionsJob?.cancel()
        questionsJob = viewModelScope.launch {
            isSessionInitialized = false
            _questions.value = Resource.Loading()
            _currentQuestionIndex.value = 0
            _userAnswers.value.clear()
            _answerState.value = emptyMap()
            _timeRemaining.value = -1
            _quizResult.value = null

            currentCategoryId = categoryId
            currentCategoryName = "" // Will be updated if available
            currentChapterId = chapterId
            currentChapterName = chapterName
            currentQuizId = UUID.randomUUID().toString()
            quizStartTime = System.currentTimeMillis()

            quizRepository.getQuestionsByChapterFlow(chapterId).collect { result ->
                when (result) {
                    is Resource.Success -> {
                        if (!isSessionInitialized) {
                            val shuffled = result.data?.shuffled().orEmpty()
                            _questions.value = Resource.Success(shuffled)
                            val totalTime = shuffled.sumOf { it.timeLimit }
                            _timeRemaining.value = totalTime
                            isSessionInitialized = true
                        }
                    }
                    is Resource.Error -> {
                        _questions.value = result
                        _timeRemaining.value = 0
                    }
                    is Resource.Loading -> {
                        _questions.value = result
                    }
                }
            }
        }
    }

    fun setAnswer(questionIndex: Int, answer: String) {
        val answers = _userAnswers.value.toMutableMap()
        if (!answers.containsKey(questionIndex)) {
            answers[questionIndex] = answer
            _userAnswers.value = answers
            checkAnswer(questionIndex, answer)
        }
    }

    private fun checkAnswer(questionIndex: Int, userAnswer: String) {
        val question = _questions.value.data?.getOrNull(questionIndex) ?: return
        val isCorrect = userAnswer.equals(question.correctAnswer, true)
        val map = _answerState.value.toMutableMap()
        map[questionIndex] = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT
        _answerState.value = map
    }

    fun nextQuestion() {
        if (_currentQuestionIndex.value < (_questions.value.data?.size ?: 0) - 1) {
            _currentQuestionIndex.value++
        }
    }

    fun previousQuestion() {
        if (_currentQuestionIndex.value > 0) {
            _currentQuestionIndex.value--
        }
    }

    fun goToQuestion(index: Int) {
        if (index in 0 until (_questions.value.data?.size ?: 0)) {
            _currentQuestionIndex.value = index
        }
    }

    fun updateTimeRemaining(seconds: Int) {
        _timeRemaining.value = seconds
    }

    fun submitQuiz() {
        viewModelScope.launch {
            _quizResult.value = Resource.Loading()

            val firebaseUser = FirebaseAuth.getInstance().currentUser
            val userId = firebaseUser?.uid ?: prefsManager.getUserId()
            
            if (userId == null) {
                _quizResult.value = Resource.Error("User not logged in")
                return@launch
            }

            val questions = _questions.value.data.orEmpty()
            var correct = 0
            var wrong = 0
            var notAttempted = 0
            var score = 0
            val maxScore = questions.sumOf { it.points }
            val answers = mutableMapOf<String, UserAnswer>()

            questions.forEachIndexed { index, q ->
                val ua = _userAnswers.value[index].orEmpty()
                val isCorrect = ua.equals(q.correctAnswer, true)
                
                if (ua.isEmpty()) {
                    notAttempted++
                } else if (isCorrect) {
                    correct++
                    score += q.points
                } else {
                    wrong++
                }

                answers[index.toString()] = UserAnswer(
                    q.id, q.questionText, ua, q.correctAnswer, isCorrect, 0
                )
            }

            val timeTaken = ((System.currentTimeMillis() - quizStartTime) / 1000).toInt()
            val percentage = if (maxScore > 0) score * 100f / maxScore else 0f

            val result = QuizResult(
                UUID.randomUUID().toString(),
                userId,
                currentQuizId,
                currentCategoryId,
                currentCategoryName,
                questions.size,
                correct,
                wrong,
                notAttempted,
                score,
                maxScore,
                percentage,
                timeTaken,
                answers,
                System.currentTimeMillis()
            )

            val saveResult = quizRepository.saveQuizResult(result)
            if (saveResult is Resource.Success) {
                val earnedXP = (correct * Constants.XP_PER_CORRECT_ANSWER) + Constants.XP_QUIZ_COMPLETED_BONUS
                addXP(earnedXP)
                _quizResult.value = Resource.Success(result)
            } else {
                _quizResult.value = Resource.Error(saveResult.message ?: "Failed to save result")
            }
        }
    }

    private fun addXP(xp: Int) {
        val updatedXP = _totalXP.value + xp
        _totalXP.value = updatedXP
        _userLevel.value = calculateLevel(updatedXP)
        
        viewModelScope.launch {
            prefsManager.setTotalXP(updatedXP)
        }
    }

    private fun calculateLevel(xp: Int): Int {
        return when {
            xp >= 1400 -> 5
            xp >= 900 -> 4
            xp >= 500 -> 3
            xp >= 200 -> 2
            else -> 1
        }
    }

    fun toggleBookmark(question: Question) {
        viewModelScope.launch {
            val isBookmarked = bookmarkedQuestions.value.any { it.questionId == question.id }
            if (isBookmarked) {
                bookmarkDao.deleteByQuestionId(question.id)
            } else {
                val entity = BookmarkEntity(
                    questionId = question.id,
                    questionText = question.questionText,
                    options = question.options,
                    correctAnswer = question.correctAnswer,
                    topicName = currentChapterName,
                    categoryName = currentCategoryName
                )
                bookmarkDao.insertBookmark(entity)
            }
        }
    }

    fun isQuestionBookmarked(questionId: String): Flow<Boolean> {
        return bookmarkDao.isBookmarked(questionId)
    }

    fun removeBookmark(questionId: String) {
        viewModelScope.launch {
            bookmarkDao.deleteByQuestionId(questionId)
        }
    }

    fun resetQuiz() {
        isSessionInitialized = false
        _questions.value = Resource.Loading()
        _currentQuestionIndex.value = 0
        _userAnswers.value.clear()
        _answerState.value = emptyMap()
        _timeRemaining.value = -1
        _quizResult.value = null
    }
}
