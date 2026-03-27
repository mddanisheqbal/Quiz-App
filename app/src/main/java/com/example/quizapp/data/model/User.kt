package com.example.quizapp.data.model

data class User(
    val uid: String = "",
    val email: String = "",
    val username: String = "",
    val profilePictureUrl: String? = null,
    val totalXP: Int = 0,
    val monthlyXP: Int = 0,
    val lastResetMonth: Int = -1,
    val level: Int = 1,
    val streak: Int = 0,
    val correctAnswers: Int = 0,
    val quizzesCompleted: Int = 0,
    val lastActiveDate: Long = 0L,
    val dailyChallengeDate: Long = 0L,
    val completedChallenges: List<String> = emptyList(), // Added for multi-challenge support
    val isAdmin: Boolean = false,
    val createdAt: Long = System.currentTimeMillis(),
    
    val coins: Int = 0,
    val lastRewardDate: Long = 0L,
    val rewardDay: Int = 1,
    val adsDisabledUntil: Long = 0L,

    val lastCategoryId: String? = null,
    val lastCategoryName: String? = null,
    val lastTopicId: String? = null,
    val lastTopicName: String? = null,
    val lastCategoryColor: String? = null
)
