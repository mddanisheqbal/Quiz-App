package com.example.quizapp.data.model

data class User(
    val uid: String = "",
    val email: String = "",
    val displayName: String = "",
    val password: String? = null,
    val isAdmin: Boolean = false,
    val streakCount: Int = 0,
    val totalXP: Int = 0,
    val lastActiveDate: Long = 0L,
    val dailyChallengeDate: Long = 0L,
    val dailyChallengeCompleted: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)