package com.example.quizapp.presentation.navigation

import java.net.URLEncoder
import java.nio.charset.StandardCharsets

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Chapter : Screen("chapter/{categoryId}/{categoryName}/{categoryColor}") {
        fun createRoute(categoryId: String, categoryName: String, categoryColor: String): String {
            val encodedId = URLEncoder.encode(categoryId, StandardCharsets.UTF_8.toString())
            val encodedName = URLEncoder.encode(categoryName, StandardCharsets.UTF_8.toString())
            val encodedColor = URLEncoder.encode(categoryColor, StandardCharsets.UTF_8.toString())
            return "chapter/$encodedId/$encodedName/$encodedColor"
        }
    }
    object Quiz : Screen("quiz/{categoryId}/{topicId}/{topicName}") {
        fun createRoute(categoryId: String, topicId: String, topicName: String): String {
            val encodedCatId = URLEncoder.encode(categoryId, StandardCharsets.UTF_8.toString())
            val encodedTopicId = URLEncoder.encode(topicId, StandardCharsets.UTF_8.toString())
            val encodedTopicName = URLEncoder.encode(topicName, StandardCharsets.UTF_8.toString())
            return "quiz/$encodedCatId/$encodedTopicId/$encodedTopicName"
        }
    }
    object Result : Screen("result")
    object History : Screen("history")
    object Bookmark : Screen("bookmark")
    object AboutUs : Screen("about_us")
    object LevelProgress : Screen("level_progress")
    object StreakDetails : Screen("streak_details")
    object Leaderboard : Screen("leaderboard")
    object DailyChallenge : Screen("daily_challenge")
    object Achievements : Screen("achievements")
    object Store : Screen("store")
    object AdminLogin : Screen("admin_login")
    object AdminDashboard : Screen("admin_dashboard")
    object ManageCategories : Screen("manage_categories")
    object ManageQuestions : Screen("manage_questions/{categoryId}/{categoryName}") {
        fun createRoute(categoryId: String, categoryName: String): String {
            val encodedId = URLEncoder.encode(categoryId, StandardCharsets.UTF_8.toString())
            val encodedName = URLEncoder.encode(categoryName, StandardCharsets.UTF_8.toString())
            return "manage_questions/$encodedId/$encodedName"
        }
    }
}
