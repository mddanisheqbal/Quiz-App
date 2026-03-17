package com.example.quizapp.util

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesManager @Inject constructor(
    @ApplicationContext context: Context
) {
    private val prefs: SharedPreferences =
        context.getSharedPreferences(Constants.PREFS_NAME, Context.MODE_PRIVATE)

    fun saveAuthToken(token: String) {
        prefs.edit().putString(Constants.KEY_AUTH_TOKEN, token).apply()
    }

    fun getAuthToken(): String? {
        return prefs.getString(Constants.KEY_AUTH_TOKEN, null)
    }

    fun saveUserId(userId: String) {
        prefs.edit().putString(Constants.KEY_USER_ID, userId).apply()
    }

    fun getUserId(): String? {
        return prefs.getString(Constants.KEY_USER_ID, null)
    }

    fun saveUserEmail(email: String) {
        prefs.edit().putString(Constants.KEY_USER_EMAIL, email).apply()
    }

    fun getUserEmail(): String? {
        return prefs.getString(Constants.KEY_USER_EMAIL, null)
    }

    fun setIsAdmin(isAdmin: Boolean) {
        prefs.edit().putBoolean(Constants.KEY_IS_ADMIN, isAdmin).apply()
    }

    fun isAdmin(): Boolean {
        return prefs.getBoolean(Constants.KEY_IS_ADMIN, false)
    }

    fun setLoggedIn(isLoggedIn: Boolean) {
        prefs.edit().putBoolean(Constants.KEY_IS_LOGGED_IN, isLoggedIn).apply()
    }

    fun isLoggedIn(): Boolean {
        return prefs.getBoolean(Constants.KEY_IS_LOGGED_IN, false)
    }

    fun getCurrentStreak(): Int {
        return prefs.getInt(Constants.KEY_CURRENT_STREAK, 0)
    }

    fun setCurrentStreak(streak: Int) {
        prefs.edit().putInt(Constants.KEY_CURRENT_STREAK, streak).apply()
    }

    fun getLastQuizDate(): String? {
        return prefs.getString(Constants.KEY_LAST_QUIZ_DATE, null)
    }

    fun setLastQuizDate(date: String) {
        prefs.edit().putString(Constants.KEY_LAST_QUIZ_DATE, date).apply()
    }

    fun getTotalXP(): Int {
        return prefs.getInt(Constants.KEY_TOTAL_XP, 0)
    }

    fun setTotalXP(xp: Int) {
        prefs.edit().putInt(Constants.KEY_TOTAL_XP, xp).apply()
    }

    fun getQuizCount(): Int {
        return prefs.getInt(Constants.KEY_QUIZ_COUNT, 0)
    }

    fun setQuizCount(count: Int) {
        prefs.edit().putInt(Constants.KEY_QUIZ_COUNT, count).apply()
    }

    fun getCorrectAnswersCount(): Int {
        return prefs.getInt(Constants.KEY_CORRECT_ANSWERS, 0)
    }

    fun setCorrectAnswersCount(count: Int) {
        prefs.edit().putInt(Constants.KEY_CORRECT_ANSWERS, count).apply()
    }

    fun setNotificationsRequested(requested: Boolean) {
        prefs.edit().putBoolean(Constants.KEY_NOTIFICATIONS_REQUESTED, requested).apply()
    }

    fun isNotificationsRequested(): Boolean {
        return prefs.getBoolean(Constants.KEY_NOTIFICATIONS_REQUESTED, false)
    }

    fun clearAll() {
        prefs.edit().clear().apply()
    }
}
