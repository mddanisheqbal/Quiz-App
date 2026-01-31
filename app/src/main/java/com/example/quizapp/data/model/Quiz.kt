package com.example.quizapp.data.model

data class Quiz(
    val id: String = "",
    val categoryId: String = "",
    val categoryName: String = "",
    val questions: List<Question> = emptyList(),
    val totalQuestions: Int = 0,
    val timeLimit: Int = 0, // total time in seconds
    val createdAt: Long = System.currentTimeMillis()
)

data class QuizProgress(
    val quizId: String = "",
    val userId: String = "",
    val categoryId: String = "",
    val currentQuestionIndex: Int = 0,
    val answers: MutableMap<Int, String> = mutableMapOf(),
    val timeRemaining: Int = 0,
    val startedAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)