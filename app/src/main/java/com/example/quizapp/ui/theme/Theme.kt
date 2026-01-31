package com.example.quizapp.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Correctly importing all the custom colors
import com.example.quizapp.ui.theme.Primary
import com.example.quizapp.ui.theme.PrimaryVariant
import com.example.quizapp.ui.theme.Secondary
import com.example.quizapp.ui.theme.SecondaryVariant
import com.example.quizapp.ui.theme.KotlinColor
import com.example.quizapp.ui.theme.BackgroundDark
import com.example.quizapp.ui.theme.TextPrimaryDark
import com.example.quizapp.ui.theme.SurfaceDark
import com.example.quizapp.ui.theme.TextSecondaryDark
import com.example.quizapp.ui.theme.IncorrectRed
import com.example.quizapp.ui.theme.BackgroundLight
import com.example.quizapp.ui.theme.TextPrimary
import com.example.quizapp.ui.theme.SurfaceLight
import com.example.quizapp.ui.theme.TextSecondary

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = PrimaryVariant,
    onPrimaryContainer = Color.White,
    secondary = Secondary,
    onSecondary = Color.Black,
    secondaryContainer = SecondaryVariant,
    onSecondaryContainer = Color.White,
    tertiary = KotlinColor,
    onTertiary = Color.White,
    background = BackgroundDark,
    onBackground = TextPrimaryDark,
    surface = SurfaceDark,
    onSurface = TextPrimaryDark,
    surfaceVariant = Color(0xFF2C2C2C),
    onSurfaceVariant = TextSecondaryDark,
    error = IncorrectRed,
    onError = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFBB86FC),
    onPrimaryContainer = Color(0xFF3700B3),
    secondary = Secondary,
    onSecondary = Color.Black,
    secondaryContainer = Color(0xFF03DAC6),
    onSecondaryContainer = Color(0xFF00201E),
    tertiary = KotlinColor,
    onTertiary = Color.White,
    background = BackgroundLight,
    onBackground = TextPrimary,
    surface = SurfaceLight,
    onSurface = TextPrimary,
    surfaceVariant = Color(0xFFF5F5F5),
    onSurfaceVariant = TextSecondary,
    error = IncorrectRed,
    onError = Color.White
)

@Composable
fun QuizAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
