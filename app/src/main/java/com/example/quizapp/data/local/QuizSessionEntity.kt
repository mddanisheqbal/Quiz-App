package com.example.quizapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_sessions")
data class QuizSessionEntity(
    @PrimaryKey val chapterId: String,
    val categoryId: String,
    val questionOrder: List<String>,
    val answers: Map<String, String>,
    val currentIndex: Int,
    val totalQuestions: Int,
    val startedAt: Long = System.currentTimeMillis(),
    val lastUpdated: Long = System.currentTimeMillis()
)
