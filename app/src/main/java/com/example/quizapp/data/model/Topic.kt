package com.example.quizapp.data.model

data class Topic(
    val id: String = "",
    val name: String = "",
    val categoryId: String = "",
    val questionCount: Int = 0,
    val order: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
)