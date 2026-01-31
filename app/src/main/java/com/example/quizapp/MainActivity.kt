package com.example.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import com.example.quizapp.presentation.navigation.NavGraph
import com.example.quizapp.presentation.navigation.Screen
import com.example.quizapp.presentation.viewmodel.AdminViewModel
import com.example.quizapp.ui.theme.QuizAppTheme
import com.example.quizapp.util.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<AdminViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
//        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        setContent {
            QuizAppTheme {
                var isLoading by remember { mutableStateOf(true) }
                val categoriesState by viewModel.categories.collectAsStateWithLifecycle()

                LaunchedEffect(Unit) {
                    viewModel.loadCategories()
                }

//                splashScreen.setKeepOnScreenCondition { isLoading }

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
                        val navController = rememberNavController()
                        NavGraph(
                            navController = navController,
                            startDestination = Screen.Splash.route
                        )
                    }
                }
            }
        }
    }
}