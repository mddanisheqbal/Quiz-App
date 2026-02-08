package com.example.quizapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.model.*
import com.example.quizapp.data.repository.QuizRepository
import com.example.quizapp.util.PreferencesManager
import com.example.quizapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
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
    private val prefsManager: PreferencesManager
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

    private var currentQuizId: String = ""
    private var currentCategoryId: String = ""
    private var currentCategoryName: String = ""
    private var currentChapterId: String = ""
    private var currentChapterName: String = ""
    private var quizStartTime: Long = 0

    private var categoriesJob: Job? = null
    private var topicsJob: Job? = null
    private var questionsJob: Job? = null

    fun loadCategories() {
        categoriesJob?.cancel()
        categoriesJob = viewModelScope.launch {
            quizRepository.getCategoriesFlow().collect { result ->
                _categories.value = result
            }
        }
    }

    fun loadTopics(categoryId: String) {
        topicsJob?.cancel()
        topicsJob = viewModelScope.launch {
            quizRepository.getTopicsFlow(categoryId).collect { result ->
                _topics.value = result
            }
        }
    }

    fun loadQuestions(categoryId: String, chapterId: String, chapterName: String) {
        questionsJob?.cancel()
        questionsJob = viewModelScope.launch {
            _userAnswers.value.clear()
            _answerState.value = emptyMap()
            _currentQuestionIndex.value = 0
            _quizResult.value = null
            _timeRemaining.value = -1

            currentCategoryId = categoryId
            currentChapterId = chapterId
            currentChapterName = chapterName
            currentQuizId = UUID.randomUUID().toString()
            quizStartTime = System.currentTimeMillis()

            quizRepository.getQuestionsByChapterFlow(chapterId).collect { result ->
                _questions.value = result

                if (result is Resource.Success) {
                    val questionsList = result.data
                    if (!questionsList.isNullOrEmpty()) {
                        val totalTime = questionsList.sumOf { it.timeLimit }
                        // Only set time if it's the first load or if we haven't started yet
                        if (_timeRemaining.value == -1) {
                            _timeRemaining.value = totalTime
                        }
                    } else {
                        _timeRemaining.value = 0
                    }
                } else if (result is Resource.Error) {
                    _timeRemaining.value = 0
                }
            }
        }
    }

    fun setAnswer(questionIndex: Int, answer: String) {
        val answers = _userAnswers.value.toMutableMap()
        if (answers[questionIndex] == null) {
            answers[questionIndex] = answer
            _userAnswers.value = answers
            checkAnswer(questionIndex, answer)
        }
    }

    private fun checkAnswer(questionIndex: Int, userAnswer: String) {
        val question = _questions.value.data?.getOrNull(questionIndex) ?: return
        val isCorrect = userAnswer.equals(question.correctAnswer, ignoreCase = true)
        val newState = if (isCorrect) AnswerState.CORRECT else AnswerState.INCORRECT

        val newAnswerStates = _answerState.value.toMutableMap()
        newAnswerStates[questionIndex] = newState
        _answerState.value = newAnswerStates
    }

    fun nextQuestion() {
        if (_currentQuestionIndex.value < (_questions.value.data?.size ?: 0) - 1) {
            _currentQuestionIndex.value += 1
        }
    }

    fun previousQuestion() {
        if (_currentQuestionIndex.value > 0) {
            _currentQuestionIndex.value -= 1
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

            val userId = prefsManager.getUserId()
            if (userId == null) {
                _quizResult.value = Resource.Error("User not logged in. Please restart the app.")
                return@launch
            }

            val questions = _questions.value.data
            if (questions.isNullOrEmpty()) {
                _quizResult.value = Resource.Error("No questions available")
                return@launch
            }

            var correctCount = 0
            var wrongCount = 0
            var skippedCount = 0
            var totalScore = 0
            val maxScore = questions.sumOf { it.points }
            val userAnswersList = mutableMapOf<String, UserAnswer>()

            questions.forEachIndexed { index, question ->
                val userAnswer = _userAnswers.value[index] ?: ""
                val isCorrect = when (question.questionType) {
                    QuestionType.MULTIPLE_CHOICE, QuestionType.TRUE_FALSE -> userAnswer.equals(question.correctAnswer, ignoreCase = true)
                    QuestionType.SHORT_ANSWER -> userAnswer.trim().equals(question.correctAnswer.trim(), ignoreCase = true)
                    else -> false
                }

                if (userAnswer.isEmpty()) {
                    skippedCount++
                } else if (isCorrect) {
                    correctCount++
                    totalScore += question.points
                } else {
                    wrongCount++
                }

                userAnswersList[index.toString()] = UserAnswer(
                    questionId = question.id,
                    questionText = question.questionText,
                    userAnswer = userAnswer,
                    correctAnswer = question.correctAnswer,
                    isCorrect = isCorrect,
                    timeTaken = 0
                )
            }

            val timeTaken = ((System.currentTimeMillis() - quizStartTime) / 1000).toInt()
            val percentage = if (maxScore > 0) (totalScore.toFloat() / maxScore) * 100 else 0f

            val result = QuizResult(
                id = UUID.randomUUID().toString(),
                userId = userId,
                quizId = currentQuizId,
                categoryId = currentCategoryId,
                categoryName = currentCategoryName,
                totalQuestions = questions.size,
                correctAnswers = correctCount,
                wrongAnswers = wrongCount,
                skippedAnswers = skippedCount,
                totalScore = totalScore,
                maxScore = maxScore,
                percentage = percentage,
                timeTaken = timeTaken,
                answers = userAnswersList,
                completedAt = System.currentTimeMillis()
            )

            val saveResult = quizRepository.saveQuizResult(result)

            if (saveResult is Resource.Success) {
                _quizResult.value = Resource.Success(result)
            } else {
                _quizResult.value = Resource.Error(saveResult.message ?: "Failed to save result to Firestore")
            }
        }
    }

    fun resetQuiz() {
        _currentQuestionIndex.value = 0
        _userAnswers.value = mutableMapOf()
        _timeRemaining.value = -1
        _quizResult.value = null
        _answerState.value = emptyMap()
        currentQuizId = ""
        currentCategoryId = ""
        currentCategoryName = ""
        currentChapterId = ""
        currentChapterName = ""
        quizStartTime = 0
    }
}
