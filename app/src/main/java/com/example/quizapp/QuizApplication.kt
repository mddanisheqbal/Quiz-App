package com.example.quizapp

import android.app.Application
import android.util.Log
import com.example.quizapp.di.DatabaseSeeder
import com.example.quizapp.util.UserActivityManager
import com.example.quizapp.worker.EngagementReminderWorker
import com.google.android.gms.ads.MobileAds
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltAndroidApp
class QuizApplication : Application() {

    @Inject
    lateinit var databaseSeeder: DatabaseSeeder
    
    @Inject
    lateinit var userActivityManager: UserActivityManager

    override fun onCreate() {
        super.onCreate()
        
        // Global Crash Logging
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            Log.e("CRASH_LOG", "Uncaught exception in thread ${thread.name}")
            Log.e("CRASH_LOG", throwable.stackTraceToString())
            // In a real app, you might want to restart the app or send to Firebase Crashlytics
        }

        // Initialize Mobile Ads SDK
        MobileAds.initialize(this) {}
        
        // Schedule smart engagement reminders
        EngagementReminderWorker.scheduleReminders(this)

        // Launch a coroutine to seed the database safely
        CoroutineScope(Dispatchers.IO).launch {
            try {
                databaseSeeder.seedDatabaseIfNeeded()
            } catch (e: Exception) {
                // Log the error and fail gracefully, do not crash the app
                Log.e("QuizApplication", "Failed to seed database", e)
            }
        }
    }
}
