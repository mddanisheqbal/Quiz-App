package com.example.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import com.example.quizapp.presentation.navigation.NavGraph
import com.example.quizapp.presentation.navigation.Screen
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.ui.theme.QuizAppTheme
import com.example.quizapp.util.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<QuizViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        setContent {
            QuizAppTheme {
                var isLoading by remember { mutableStateOf(true) }
                val categoriesState by viewModel.categories.collectAsStateWithLifecycle()
                val isOnline by viewModel.isOnline.collectAsStateWithLifecycle()

                LaunchedEffect(Unit) {
                    viewModel.loadCategories()
                }

                splashScreen.setKeepOnScreenCondition { isLoading }

                LaunchedEffect(categoriesState) {
                    if (categoriesState is Resource.Success<*> || categoriesState is Resource.Error<*>) {
                        isLoading = false
                    }
                }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    if (!isLoading) {
                        if (isOnline) {
                            val navController = rememberNavController()
                            NavGraph(
                                navController = navController,
                                startDestination = Screen.Splash.route
                            )
                        } else {
                            NoInternetScreen(onRetry = { viewModel.loadCategories() })
                        }
                    } else {
                        // Loading state while checking categories
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun NoInternetScreen(onRetry: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "No Internet Connection",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Please turn on internet to continue using the app.",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = onRetry,
                modifier = Modifier.fillMaxWidth().height(50.dp)
            ) {
                Text("Retry")
            }
        }
    }
}
