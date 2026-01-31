package com.example.quizapp.data.model

data class Question(
    val id: String = "",
    val categoryId: String = "",
    val topicId: String? = null,
    val questionText: String = "",
    val questionType: QuestionType = QuestionType.MULTIPLE_CHOICE,
    val options: List<String> = emptyList(),
    val correctAnswer: String = "",
    val explanation: String? = null,
    val difficulty: Difficulty = Difficulty.MEDIUM,
    val timeLimit: Int = 30, // seconds
    val points: Int = 10,
    val createdAt: String = ""
)

enum class QuestionType {
    MULTIPLE_CHOICE,
    TRUE_FALSE,
    SHORT_ANSWER
}

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}
