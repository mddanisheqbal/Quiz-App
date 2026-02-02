package com.example.quizapp.presentation.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object Home : Screen("home")
    object Chapter : Screen("chapter/{categoryId}/{categoryName}") {
        fun createRoute(categoryId: String, categoryName: String) = "chapter/$categoryId/$categoryName"
    }
    object Quiz : Screen("quiz/{categoryId}/{topicId}/{topicName}") {
        fun createRoute(categoryId: String, topicId: String, topicName: String) = "quiz/$categoryId/$topicId/$topicName"
    }
    object Result : Screen("result")
    object History : Screen("history")
    object AdminLogin : Screen("admin_login")
    object AdminDashboard : Screen("admin_dashboard")
    object ManageCategories : Screen("manage_categories")
    object ManageQuestions : Screen("manage_questions/{categoryId}/{categoryName}") {
        fun createRoute(categoryId: String, categoryName: String) = "manage_questions/$categoryId/$categoryName"
    }
}