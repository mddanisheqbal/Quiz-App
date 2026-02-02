package com.example.quizapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizapp.presentation.screens.*
import com.example.quizapp.presentation.screens.admin.*
import com.example.quizapp.presentation.viewmodel.AuthViewModel
import com.example.quizapp.presentation.viewmodel.QuizViewModel

@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: String = Screen.Splash.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(
                onNavigateToLogin = {
                    navController.navigate(Screen.Login.route) { popUpTo(Screen.Splash.route) { inclusive = true } }
                },
                onNavigateToHome = {
                    navController.navigate("main_flow") { popUpTo(Screen.Splash.route) { inclusive = true } }
                },
                onNavigateToAdminDashboard = {
                    navController.navigate("admin_flow") { popUpTo(Screen.Splash.route) { inclusive = true } }
                }
            )
        }

        composable(Screen.Login.route) {
            LoginScreen(
                onNavigateToSignUp = { navController.navigate(Screen.SignUp.route) },
                onNavigateToHome = {
                    navController.navigate("main_flow") { popUpTo(Screen.Login.route) { inclusive = true } }
                },
                onNavigateToAdmin = { navController.navigate("admin_flow") }
            )
        }

        composable(Screen.SignUp.route) {
            SignUpScreen(
                onNavigateToLogin = { navController.popBackStack() },
                onNavigateToHome = {
                    navController.navigate("main_flow") { popUpTo(Screen.Login.route) { inclusive = true } }
                }
            )
        }

        navigation(startDestination = Screen.Home.route, route = "main_flow") {
            composable(Screen.Home.route) {
                HomeScreen(
                    onNavigateToTopic = { categoryId, categoryName ->
                        navController.navigate(Screen.Chapter.createRoute(categoryId, categoryName))
                    },
                    onNavigateToQuiz = { categoryId, categoryName ->
                        // This might be used for categories without chapters, but based on request, 
                        // we go to Chapters first.
                        navController.navigate(Screen.Chapter.createRoute(categoryId, categoryName))
                    },
                    onNavigateToHistory = { navController.navigate(Screen.History.route) },
                    onLogout = {
                        navController.navigate(Screen.Login.route) {
                            popUpTo("main_flow") { inclusive = true }
                        }
                    }
                )
            }

            composable(
                route = Screen.Chapter.route,
                arguments = listOf(
                    navArgument("categoryId") { type = NavType.StringType },
                    navArgument("categoryName") { type = NavType.StringType }
                )
            ) { backStackEntry ->
                val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
                val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""
                
                ChapterScreen(
                    categoryId = categoryId,
                    categoryName = categoryName,
                    onNavigateToQuiz = { catId, topicId, topicName ->
                        navController.navigate(Screen.Quiz.createRoute(catId, topicId, topicName))
                    },
                    onNavigateBack = { navController.popBackStack() }
                )
            }

            composable(
                route = Screen.Quiz.route,
                arguments = listOf(
                    navArgument("categoryId") { type = NavType.StringType },
                    navArgument("topicId") { type = NavType.StringType },
                    navArgument("topicName") { type = NavType.StringType }
                )
            ) { backStackEntry ->
                val quizViewModel: QuizViewModel = hiltViewModel(navController.getBackStackEntry("main_flow"))
                val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
                val topicId = backStackEntry.arguments?.getString("topicId") ?: ""
                val topicName = backStackEntry.arguments?.getString("topicName") ?: ""

                QuizScreen(
                    categoryId = categoryId,
                    topicId = topicId,
                    topicName = topicName,
                    quizViewModel = quizViewModel,
                    onNavigateToResult = {
                        navController.navigate(Screen.Result.route) {
                            popUpTo(Screen.Quiz.route) { inclusive = true }
                        }
                    },
                    onNavigateBack = { navController.popBackStack() }
                )
            }

            composable(Screen.Result.route) {
                val quizViewModel: QuizViewModel = hiltViewModel(navController.getBackStackEntry("main_flow"))
                ResultScreen(
                    quizViewModel = quizViewModel,
                    onNavigateToHome = {
                        navController.navigate(Screen.Home.route) {
                            popUpTo("main_flow") { inclusive = true }
                        }
                    },
                    onNavigateToHistory = {
                        navController.navigate(Screen.History.route)
                    }
                )
            }

            composable(Screen.History.route) {
                HistoryScreen(onNavigateBack = { navController.popBackStack() })
            }
        }

        navigation(startDestination = Screen.AdminLogin.route, route = "admin_flow") {
            composable(Screen.AdminLogin.route) {
                AdminLoginScreen(
                    onNavigateBack = {
                        navController.navigate(Screen.Login.route) {
                            popUpTo("admin_flow") { inclusive = true }
                        }
                    },
                    onNavigateToDashboard = {
                        navController.navigate(Screen.AdminDashboard.route) {
                            popUpTo(Screen.AdminLogin.route) { inclusive = true }
                        }
                    }
                )
            }

            composable(Screen.AdminDashboard.route) {
                AdminDashboardScreen(
                    onNavigateToManageCategories = { navController.navigate(Screen.ManageCategories.route) },
                    onNavigateToManageQuestions = { categoryId, categoryName ->
                        navController.navigate(Screen.ManageQuestions.createRoute(categoryId, categoryName))
                    },
                    onLogout = {
                        navController.navigate(Screen.Login.route) {
                            popUpTo("admin_flow") { inclusive = true }
                        }
                    }
                )
            }

            composable(Screen.ManageCategories.route) {
                ManageCategoriesScreen(onNavigateBack = { navController.popBackStack() })
            }

            composable(
                route = Screen.ManageQuestions.route,
                arguments = listOf(
                    navArgument("categoryId") { type = NavType.StringType },
                    navArgument("categoryName") { type = NavType.StringType }
                )
            ) { backStackEntry ->
                val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
                val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""

                ManageQuestionsScreen(
                    categoryId = categoryId,
                    categoryName = categoryName,
                    onNavigateBack = { navController.popBackStack() }
                )
            }
        }
    }
}