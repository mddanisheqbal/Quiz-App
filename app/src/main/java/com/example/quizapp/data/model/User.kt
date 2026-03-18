package com.example.quizapp.data.model

data class User(
    val uid: String = "",
    val email: String = "",
    val username: String = "",
    val profilePictureUrl: String? = null,
    val totalXP: Int = 0,
    val monthlyXP: Int = 0, // Feature 3: Monthly Leaderboard
    val lastResetMonth: Int = -1, // To track monthly reset
    val level: Int = 1,
    val streak: Int = 0,
    val correctAnswers: Int = 0,
    val quizzesCompleted: Int = 0,
    val lastActiveDate: Long = 0L,
    val dailyChallengeDate: Long = 0L,
    val dailyChallengeCompleted: Boolean = false,
    val isAdmin: Boolean = false,
    val createdAt: Long = System.currentTimeMillis(),
    
    // Feature 1: Firestore User Fields
    val coins: Int = 0,
    val lastRewardDate: Long = 0L,
    val rewardDay: Int = 1, // 1-7 for cycle
    val adsDisabledUntil: Long = 0L
)
