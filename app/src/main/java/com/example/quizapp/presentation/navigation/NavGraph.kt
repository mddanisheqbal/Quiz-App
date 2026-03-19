package com.example.quizapp.presentation.navigation

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizapp.presentation.screens.*
import com.example.quizapp.presentation.screens.admin.*
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel

@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: String = Screen.Splash.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        enterTransition = {
            slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
        },
        exitTransition = {
            slideOutHorizontally(
                targetOffsetX = { -it },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
        },
        popEnterTransition = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
        },
        popExitTransition = {
            slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
        }
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
            composable(Screen.Home.route) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                val quizViewModel: QuizViewModel = hiltViewModel(parentEntry)
                
                MainDrawerScreen(navController = navController) {
                    HomeScreen(
                        userViewModel = userViewModel,
                        quizViewModel = quizViewModel,
                        onNavigateToTopic = { categoryId, categoryName, categoryColor ->
                            // Strip # for URL safety
                            val safeColor = categoryColor.replace("#", "")
                            navController.navigate(Screen.Chapter.createRoute(categoryId, categoryName, safeColor))
                        },
                        onNavigateToQuiz = { categoryId, topicId, topicName ->
                            navController.navigate(Screen.Quiz.createRoute(categoryId, topicId, topicName))
                        },
                        onNavigateToHistory = { navController.navigate(Screen.History.route) },
                        onNavigateToLevelProgress = { navController.navigate(Screen.LevelProgress.route) },
                        onNavigateToStreakDetails = { navController.navigate(Screen.StreakDetails.route) },
                        onNavigateToLeaderboard = { navController.navigate(Screen.Leaderboard.route) },
                        onNavigateToDailyChallenge = { navController.navigate(Screen.DailyChallenge.route) },
                        onNavigateToStore = { navController.navigate(Screen.Store.route) },
                        onNavigateToProfile = { navController.navigate(Screen.Profile.route) },
                        onLogout = {
                            navController.navigate(Screen.Login.route) {
                                popUpTo("main_flow") { inclusive = true }
                            }
                        }
                    )
                }
            }

            composable(Screen.Profile.route) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                
                ProfileScreen(
                    onNavigateBack = { navController.popBackStack() },
                    onLogout = {
                        navController.navigate(Screen.Login.route) {
                            popUpTo("main_flow") { inclusive = true }
                        }
                    },
                    userViewModel = userViewModel
                )
            }

            composable(
                route = Screen.Chapter.route,
                arguments = listOf(
                    navArgument("categoryId") { type = NavType.StringType },
                    navArgument("categoryName") { type = NavType.StringType },
                    navArgument("categoryColor") { type = NavType.StringType }
                )
            ) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val quizViewModel: QuizViewModel = hiltViewModel(parentEntry)
                
                val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
                val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""
                val categoryColor = backStackEntry.arguments?.getString("categoryColor") ?: ""
                
                ChapterScreen(
                    categoryId = categoryId,
                    categoryName = categoryName,
                    categoryColorString = categoryColor,
                    quizViewModel = quizViewModel,
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
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                val quizViewModel: QuizViewModel = hiltViewModel(parentEntry)
                
                val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
                val topicId = backStackEntry.arguments?.getString("topicId") ?: ""
                val topicName = backStackEntry.arguments?.getString("topicName") ?: ""

                QuizScreen(
                    categoryId = categoryId,
                    topicId = topicId,
                    topicName = topicName,
                    quizViewModel = quizViewModel,
                    userViewModel = userViewModel,
                    onNavigateToResult = {
                        navController.navigate(Screen.Result.route) {
                            popUpTo(Screen.Quiz.route) { inclusive = true }
                        }
                    },
                    onNavigateBack = { navController.popBackStack() }
                )
            }

            composable(Screen.Result.route) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                val quizViewModel: QuizViewModel = hiltViewModel(parentEntry)
                
                ResultScreen(
                    quizViewModel = quizViewModel,
                    userViewModel = userViewModel,
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

            composable(Screen.Bookmark.route) {
                MainDrawerScreen(navController = navController) {
                    BookmarkScreen(onNavigateBack = { navController.popBackStack() })
                }
            }

            composable(Screen.AboutUs.route) {
                MainDrawerScreen(navController = navController) {
                    AboutUsScreen(onNavigateBack = { navController.popBackStack() })
                }
            }

            composable(Screen.LevelProgress.route) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                LevelProgressScreen(
                    userViewModel = userViewModel,
                    onNavigateBack = { navController.popBackStack() }
                )
            }

            composable(Screen.StreakDetails.route) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                StreakScreen(
                    userViewModel = userViewModel,
                    onNavigateBack = { navController.popBackStack() }
                )
            }

            composable(Screen.Leaderboard.route) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val quizViewModel: QuizViewModel = hiltViewModel(parentEntry)
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                LeaderboardScreen(
                    quizViewModel = quizViewModel,
                    userViewModel = userViewModel,
                    onNavigateBack = { navController.popBackStack() }
                )
            }

            composable(Screen.DailyChallenge.route) {
                DailyChallengeScreen(onNavigateBack = { navController.popBackStack() })
            }

            composable(Screen.Achievements.route) {
                MainDrawerScreen(navController = navController) {
                    AchievementsScreen(onNavigateBack = { navController.popBackStack() })
                }
            }

            composable(Screen.Store.route) { backStackEntry ->
                val parentEntry = remember(backStackEntry) {
                    navController.getBackStackEntry("main_flow")
                }
                val userViewModel: UserViewModel = hiltViewModel(parentEntry)
                
                StoreScreen(
                    userViewModel = userViewModel,
                    onBackClick = { navController.popBackStack() }
                )
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
