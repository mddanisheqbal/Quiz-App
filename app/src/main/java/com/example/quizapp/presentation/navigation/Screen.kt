package com.example.quizapp.presentation.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Chapter : Screen("chapter/{categoryId}/{categoryName}/{categoryColor}") {
        fun createRoute(categoryId: String, categoryName: String, categoryColor: String) = "chapter/$categoryId/$categoryName/$categoryColor"
    }
    object Quiz : Screen("quiz/{categoryId}/{topicId}/{topicName}") {
        fun createRoute(categoryId: String, topicId: String, topicName: String) = "quiz/$categoryId/$topicId/$topicName"
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
        fun createRoute(categoryId: String, categoryName: String) = "manage_questions/$categoryId/$categoryName"
    }
}
