package com.example.quizapp.data.model

data class Achievement(
    val id: String,
    val title: String,
    val description: String,
    val icon: String,
    val category: String,
    val xpReward: Int,
    val coinReward: Int,
    val target: Int
)
