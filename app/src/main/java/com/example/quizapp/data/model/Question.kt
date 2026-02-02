package com.example.quizapp.data.model

data class Question(
    val id: String = "",
    val categoryId: String = "",
    val chapterId: String = "",
    val questionText: String = "",
    val options: List<String> = emptyList(),
    val correctAnswer: String = "",
    val explanation: String = "",
    val difficulty: Difficulty = Difficulty.EASY,
    val questionType: QuestionType = QuestionType.MULTIPLE_CHOICE,
    val timeLimit: Int = 30,
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
