package com.example.quizapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookmarks")
data class BookmarkEntity(
    @PrimaryKey val questionId: String,
    val questionText: String,
    val options: List<String>,
    val correctAnswer: String,
    val explanation: String,
    val topicName: String,
    val categoryName: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
