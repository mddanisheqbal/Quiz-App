package com.example.quizapp.data.model

data class User(
    val uid: String = "",
    val email: String = "",
    val username: String = "", // Changed from displayName
    val totalXP: Int = 0,
    val level: Int = 1,
    val streak: Int = 0, // Changed from streakCount
    val correctAnswers: Int = 0, // Changed from correctAnswersCount
    val quizzesCompleted: Int = 0, // Changed from quizCount
    val lastActiveDate: Long = 0L,
    val dailyChallengeDate: Long = 0L,
    val dailyChallengeCompleted: Boolean = false,
    val isAdmin: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)