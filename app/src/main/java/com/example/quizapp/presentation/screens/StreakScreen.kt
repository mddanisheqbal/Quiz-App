package com.example.quizapp.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StreakScreen(
    onNavigateBack: () -> Unit,
    onPlayQuiz: () -> Unit = {},
    userViewModel: UserViewModel = hiltViewModel()
) {
    val userState by userViewModel.user.collectAsState()
    val streakCount = userState?.streak ?: 0
    
    // Calculate current day of week (0-6, starting Sunday)
    val calendar = Calendar.getInstance()
    val currentDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1
    
    val days = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    
    // For demo/UI purposes, we show some active days if streak > 0
    // In a real app, this should be tracked in Firestore per day
    val activeDays = List(7) { index -> 
        index <= currentDayOfWeek && streakCount > (currentDayOfWeek - index)
    }

    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(Color(0xFF7B1FA2), Color(0xFF512DA8))
                        )
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.White)
                    }
                    Text(
                        text = "Daily Streak",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        },
        containerColor = Color(0xFFF5F5F5)
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(20.dp))
                
                // FEATURE 2 — BIG CIRCLE WITH PROGRESS FEEL
                Box(
                    modifier = Modifier
                        .size(180.dp)
                        .shadow(12.dp, CircleShape)
                        .clip(CircleShape)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color(0xFFFF9800), Color(0xFFFF5722))
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.LocalFireDepartment,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(70.dp)
                        )
                        Text(
                            text = streakCount.toString(),
                            fontSize = 48.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    }
                }
            }

            item {
                // FEATURE 1 — FIX MAIN TEXT
                Text(
                    text = if (streakCount == 0) "Start your streak 🔥" else "$streakCount Day Streak 🔥",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                
                Spacer(modifier = Modifier.height(8.dp))
                
                Text(
                    text = if (streakCount == 0) "Complete a quiz today to begin your streak" else "Keep it going! You're doing great",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )
            }

            // FEATURE 3 — WEEKLY TRACKER
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Text(
                            text = "This Week",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            days.forEachIndexed { index, day ->
                                DayIndicator(
                                    day = day, 
                                    isActive = activeDays[index],
                                    isToday = index == currentDayOfWeek
                                )
                            }
                        }
                    }
                }
            }

            // FEATURE 4 — ADD REWARD SYSTEM
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Stars, contentDescription = null, tint = Color(0xFFFFD700))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Streak Rewards",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                        }
                        
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        val rewards = listOf(
                            StreakReward(3, 10),
                            StreakReward(7, 50),
                        )
                        
                        rewards.forEach { reward ->
                            RewardRow(reward, streakCount)
                        }
                        
                        val nextReward = rewards.find { it.day > streakCount }
                        if (nextReward != null) {
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(
                                text = "Next reward in ${nextReward.day - streakCount} days",
                                color = Color(0xFF7B1FA2),
                                fontWeight = FontWeight.Medium,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }

            // FEATURE 6 — ADD BEST STREAK
            item {
                Text(
                    text = "Best Streak: ${userState?.streak ?: 0} Days",
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }

            // FEATURE 7 — ADD CTA BUTTON
            item {
                Button(
                    onClick = onPlayQuiz,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7B1FA2))
                ) {
                    Text("Play Quiz Now", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

data class StreakReward(val day: Int, val coins: Int)

@Composable
fun RewardRow(reward: StreakReward, currentStreak: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .background(
                        if (currentStreak >= reward.day) Color(0xFF4CAF50).copy(alpha = 0.1f) 
                        else Color.Gray.copy(alpha = 0.1f),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (currentStreak >= reward.day) Icons.Default.CheckCircle else Icons.Default.Lock,
                    contentDescription = null,
                    tint = if (currentStreak >= reward.day) Color(0xFF4CAF50) else Color.Gray,
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Day ${reward.day}",
                fontWeight = FontWeight.Bold,
                color = if (currentStreak >= reward.day) Color.Black else Color.Gray
            )
        }
        Text(
            text = "+${reward.coins} Coins",
            fontWeight = FontWeight.ExtraBold,
            color = if (currentStreak >= reward.day) Color(0xFFFFD700) else Color.Gray
        )
    }
}

@Composable
fun DayIndicator(day: String, isActive: Boolean, isToday: Boolean) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = day,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            color = if (isToday) Color(0xFF7B1FA2) else Color.Gray
        )
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .background(
                    if (isActive) Color(0xFFFF9800) else Color(0xFFEEEEEE)
                )
                .then(
                    if (isToday) Modifier.border(2.dp, Color(0xFF7B1FA2), CircleShape) else Modifier
                ),
            contentAlignment = Alignment.Center
        ) {
            if (isActive) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}
