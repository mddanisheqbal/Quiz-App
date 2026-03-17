package com.example.quizapp.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface BookmarkDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookmark(bookmark: BookmarkEntity)

    @Delete
    suspend fun deleteBookmark(bookmark: BookmarkEntity)

    @Query("DELETE FROM bookmarks WHERE questionId = :questionId")
    suspend fun deleteByQuestionId(questionId: String)

    @Query("SELECT * FROM bookmarks ORDER BY timestamp DESC")
    fun getAllBookmarks(): Flow<List<BookmarkEntity>>

    @Query("SELECT EXISTS(SELECT 1 FROM bookmarks WHERE questionId = :questionId)")
    fun isBookmarked(questionId: String): Flow<Boolean>

    @Query("SELECT EXISTS(SELECT 1 FROM bookmarks WHERE questionId = :questionId)")
    suspend fun isBookmarkedSync(questionId: String): Boolean
}
