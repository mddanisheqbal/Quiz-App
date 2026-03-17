package com.example.quizapp.di

import android.content.Context
import androidx.room.Room
import com.example.quizapp.data.local.AppDatabase
import com.example.quizapp.data.local.BookmarkDao
import com.example.quizapp.data.local.QuizSessionDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "quiz_db"
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideBookmarkDao(database: AppDatabase): BookmarkDao {
        return database.bookmarkDao()
    }

    @Provides
    fun provideQuizSessionDao(database: AppDatabase): QuizSessionDao {
        return database.quizSessionDao()
    }
}
