package com.example.quizapp.data.model

data class User(
    val uid: String = "",
    val email: String = "",
    val displayName: String = "",
    val password: String? = null, // Add this line
    val isAdmin: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)