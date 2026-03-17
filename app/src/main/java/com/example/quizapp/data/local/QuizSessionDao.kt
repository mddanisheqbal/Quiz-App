package com.example.quizapp.data.local

import androidx.room.*

@Dao
interface QuizSessionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveSession(session: QuizSessionEntity)

    @Query("SELECT * FROM quiz_sessions WHERE chapterId = :chapterId")
    suspend fun getSession(chapterId: String): QuizSessionEntity?

    @Query("DELETE FROM quiz_sessions WHERE chapterId = :chapterId")
    suspend fun deleteSession(chapterId: String)
}
