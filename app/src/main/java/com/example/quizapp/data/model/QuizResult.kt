package com.example.quizapp.data.model

data class QuizResult(
    val id: String = "",
    val userId: String = "",
    val quizId: String = "",
    val categoryId: String = "",
    val categoryName: String = "",
    val totalQuestions: Int = 0,
    val correctAnswers: Int = 0,
    val wrongAnswers: Int = 0,
    val skippedAnswers: Int = 0,
    val totalScore: Int = 0,
    val maxScore: Int = 0,
    val percentage: Float = 0f,
    val timeTaken: Int = 0, // seconds
    val answers: Map<String, UserAnswer> = emptyMap(),
    val completedAt: Long = System.currentTimeMillis()
)

data class UserAnswer(
    val questionId: String = "",
    val questionText: String = "",
    val userAnswer: String = "",
    val correctAnswer: String = "",
    val isCorrect: Boolean = false,
    val timeTaken: Int = 0
)