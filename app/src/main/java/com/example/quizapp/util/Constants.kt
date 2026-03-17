package com.example.quizapp.util

object Constants {
    // SharedPreferences Keys
    const val PREFS_NAME = "quiz_app_prefs"
    const val KEY_AUTH_TOKEN = "auth_token"
    const val KEY_USER_ID = "user_id"
    const val KEY_USER_EMAIL = "user_email"
    const val KEY_IS_ADMIN = "is_admin"
    const val KEY_IS_LOGGED_IN = "is_logged_in"
    const val KEY_CURRENT_STREAK = "current_streak"
    const val KEY_LAST_QUIZ_DATE = "last_quiz_date"
    const val KEY_TOTAL_XP = "total_xp"
    const val KEY_QUIZ_COUNT = "quiz_count"
    const val KEY_CORRECT_ANSWERS = "correct_answers"
    const val KEY_NOTIFICATIONS_REQUESTED = "notifications_requested"

    // Admin Credentials (Change these!)
    const val ADMIN_EMAIL = "mddanisheqbal7667@gmail.com"
    const val ADMIN_PASSWORD = "mrdAnishAdmin7782"

    // Quiz Settings
    const val POINTS_PER_CORRECT_ANSWER = 10
    const val XP_PER_CORRECT_ANSWER = 5
    const val XP_PERFECT_QUIZ_BONUS = 10
    const val XP_DAILY_CHALLENGE_BONUS = 25

    // Level Thresholds
    val LEVEL_THRESHOLDS = listOf(
        0,      // Level 1
        300,    // Level 2
        700,    // Level 3
        1200,   // Level 4
        1800,   // Level 5
        2500,   // Level 6
        3500,   // Level 7
        4700,   // Level 8
        6000,   // Level 9
        7500    // Level 10
    )

    // Categories
    const val CATEGORY_JAVA = "Java"
    const val CATEGORY_PYTHON = "Python"
    const val CATEGORY_KOTLIN = "Kotlin"
    const val CATEGORY_CPP = "C++"
    const val CATEGORY_C = "C"
    const val CATEGORY_HTML = "HTML"
    const val CATEGORY_CSS = "CSS"
    const val CATEGORY_JS = "JavaScript"
}
