package com.example.quizapp.data.model

data class Achievement(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val iconName: String = "",
    val unlocked: Boolean = false,
    val unlockedAt: Long = 0L
)