package com.example.quizapp.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class PowerUp(
    val id: String,
    val title: String,
    val description: String,
    val cost: Int,
    val icon: ImageVector? = null,
    val type: PowerUpType
)

enum class PowerUpType {
    HINT, SKIP, DOUBLE_XP, REMOVE_ADS
}

data class UserPowerUps(
    val hint: Int = 0,
    val skip: Int = 0,
    val doubleXP: Int = 0
)
