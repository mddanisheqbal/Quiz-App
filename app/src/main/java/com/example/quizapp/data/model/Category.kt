package com.example.quizapp.data.model

data class Category(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val icon: String = "",
    val colorHex: String = "",
    val questionCount: Int = 0,
    val topicCount: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
)