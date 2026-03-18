package com.example.quizapp.presentation.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.R
import com.example.quizapp.presentation.viewmodel.AuthViewModel
import com.example.quizapp.ui.theme.GradientEnd
import com.example.quizapp.ui.theme.GradientStart
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreen(
    onNavigateToLogin: () -> Unit,
    onNavigateToHome: () -> Unit,
    onNavigateToAdminDashboard: () -> Unit,
    authViewModel: AuthViewModel = hiltViewModel()
) {
    val isLoggedIn = remember { FirebaseAuth.getInstance().currentUser != null }
    val isAdmin by authViewModel.isAdmin.collectAsState()

    val animatableScale = remember { Animatable(0.5f) }
    val animatableAlpha = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        launch {
            animatableScale.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing)
            )
        }
        launch {
            animatableAlpha.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing)
            )
        }

        delay(1500)
        
        // FEATURE 3 & 7 — Direct session check
        if (isLoggedIn) {
            // Only go to admin if they are the specific admin email
            val currentUser = FirebaseAuth.getInstance().currentUser
            if (currentUser?.email == "admin@gmail.com") {
                onNavigateToAdminDashboard()
            } else {
                onNavigateToHome()
            }
        } else {
            onNavigateToLogin()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(GradientStart, GradientEnd)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.quizappicon),
                contentDescription = "Quiz App Logo",
                modifier = Modifier
                    .size(150.dp)
                    .scale(animatableScale.value)
                    .alpha(animatableAlpha.value)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Quiz Master",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.alpha(animatableAlpha.value)
            )
        }
    }
}
