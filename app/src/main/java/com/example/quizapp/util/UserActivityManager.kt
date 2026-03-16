package com.example.quizapp.util

import android.content.Context
import android.content.SharedPreferences
import java.util.*

class UserActivityManager(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("user_activity_prefs", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_LAST_APP_OPEN = "last_app_open_time"
    }

    fun recordAppOpen() {
        prefs.edit().putLong(KEY_LAST_APP_OPEN, System.currentTimeMillis()).apply()
    }

    fun isUserActiveToday(): Boolean {
        val lastOpenTime = prefs.getLong(KEY_LAST_APP_OPEN, 0L)
        if (lastOpenTime == 0L) return false

        val lastOpenCalendar = Calendar.getInstance().apply { timeInMillis = lastOpenTime }
        val currentCalendar = Calendar.getInstance()

        return lastOpenCalendar.get(Calendar.YEAR) == currentCalendar.get(Calendar.YEAR) &&
                lastOpenCalendar.get(Calendar.DAY_OF_YEAR) == currentCalendar.get(Calendar.DAY_OF_YEAR)
    }
}
