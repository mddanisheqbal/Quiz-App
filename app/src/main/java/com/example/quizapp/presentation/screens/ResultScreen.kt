package com.example.quizapp.presentation.screens

import android.app.Activity
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.presentation.viewmodel.AnswerResult
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel
import com.example.quizapp.ui.theme.CorrectGreen
import com.example.quizapp.ui.theme.GradientEnd
import com.example.quizapp.ui.theme.GradientStart
import com.example.quizapp.ui.theme.IncorrectRed
import com.example.quizapp.util.Resource
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResultScreen(
    onNavigateToHome: () -> Unit,
    onRetryQuiz: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel(),
    userViewModel: UserViewModel = hiltViewModel()
) {
    val quizResult by quizViewModel.quizResult.collectAsState()
    val xpAwarded by quizViewModel.xpAwardedInThisSession.collectAsState()
    val starsEarned by quizViewModel.stars.collectAsState()
    val wrongAnswers by quizViewModel.wrongAnswers.collectAsState()
    val context = LocalContext.current

    val scale = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Quiz Result",
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { paddingValues ->
        when (quizResult) {
            is Resource.Success -> {
                val result = (quizResult as Resource.Success).data!!
                
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .scale(scale.value),
                            shape = RoundedCornerShape(24.dp),
                            elevation = CardDefaults.cardElevation(8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(GradientStart, GradientEnd)
                                        )
                                    )
                                    .padding(32.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Icon(
                                        imageVector = if (result.percentage >= 70)
                                            Icons.Default.EmojiEvents
                                        else Icons.Default.ThumbUp,
                                        contentDescription = null,
                                        modifier = Modifier.size(80.dp),
                                        tint = Color.White
                                    )

                                    Spacer(modifier = Modifier.height(16.dp))

                                    Text(
                                        text = when {
                                            result.percentage >= 90 -> "Excellent!"
                                            result.percentage >= 70 -> "Great Job!"
                                            result.percentage >= 50 -> "Good Try!"
                                            else -> "Keep Practicing!"
                                        },
                                        fontSize = 32.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )

                                    Spacer(modifier = Modifier.height(8.dp))
                                    
                                    // Display Stars Earned
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center,
                                        modifier = Modifier.padding(vertical = 8.dp)
                                    ) {
                                        repeat(3) { index ->
                                            Icon(
                                                imageVector = if (index < starsEarned) Icons.Default.Star else Icons.Default.StarBorder,
                                                contentDescription = null,
                                                modifier = Modifier.size(36.dp),
                                                tint = if (index < starsEarned) Color(0xFFFFC107) else Color.White.copy(alpha = 0.3f)
                                            )
                                        }
                                    }

                                    if (xpAwarded != null && xpAwarded!! > 0) {
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Surface(
                                            color = Color.White.copy(alpha = 0.2f),
                                            shape = RoundedCornerShape(16.dp)
                                        ) {
                                            Text(
                                                text = "🎉 +$xpAwarded XP Earned!",
                                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                                                color = Color.White,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }

                                    Spacer(modifier = Modifier.height(16.dp))

                                    Text(
                                        text = "${result.percentage.toInt()}%",
                                        fontSize = 48.sp,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = Color.White
                                    )

                                    Spacer(modifier = Modifier.height(4.dp))

                                    Text(
                                        text = "${result.totalScore} / ${result.maxScore} Points",
                                        fontSize = 18.sp,
                                        color = Color.White.copy(alpha = 0.9f)
                                    )
                                }
                            }
                        }
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { userViewModel.showRewardedAd(context as Activity) },
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer)
                        ) {
                            Row(
                                modifier = Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.VideoLibrary,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.tertiary
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Column {
                                    Text(
                                        text = "Watch Ad → Earn 20 Coins",
                                        fontWeight = FontWeight.Bold,
                                        style = MaterialTheme.typography.titleMedium
                                    )
                                    Text(
                                        text = "Get extra coins for hints and skips!",
                                        style = MaterialTheme.typography.bodySmall
                                    )
                                }
                            }
                        }
                    }

                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(20.dp)
                            ) {
                                Text(
                                    text = "Statistics",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )

                                Spacer(modifier = Modifier.height(16.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    StatItem(
                                        icon = Icons.Default.CheckCircle,
                                        value = result.correctAnswers.toString(),
                                        label = "Correct",
                                        color = CorrectGreen
                                    )

                                    StatItem(
                                        icon = Icons.Default.Cancel,
                                        value = result.wrongAnswers.toString(),
                                        label = "Wrong",
                                        color = IncorrectRed
                                    )

                                    StatItem(
                                        icon = Icons.Default.HelpOutline,
                                        value = result.skippedAnswers.toString(),
                                        label = "Skipped",
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }
                    }

                    if (wrongAnswers.isNotEmpty()) {
                        item {
                            Text(
                                text = "Review Wrong Answers",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }

                        itemsIndexed(wrongAnswers) { index, item ->
                            val animationDelay = index * 100
                            var visible by remember { mutableStateOf(false) }
                            LaunchedEffect(Unit) {
                                delay(animationDelay.toLong())
                                visible = true
                            }
                            
                            AnimatedVisibility(
                                visible = visible,
                                enter = fadeIn() + slideInVertically(initialOffsetY = { 50 })
                            ) {
                                WrongAnswerCard(item, index + 1)
                            }
                        }
                    } else {
                        item {
                            EmptyStatePerfectScore()
                        }
                    }

                    item {
                        Column(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Button(
                                onClick = { onRetryQuiz() },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(56.dp),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                            ) {
                                Icon(Icons.Default.Refresh, contentDescription = null)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Retry Quiz", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            }

                            OutlinedButton(
                                onClick = {
                                    quizViewModel.resetQuiz()
                                    onNavigateToHome()
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(56.dp),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Icon(Icons.Default.Home, contentDescription = null)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Back to Home", fontSize = 16.sp)
                            }
                        }
                    }
                    
                    item { Spacer(modifier = Modifier.height(24.dp)) }
                }
            }
            is Resource.Loading -> {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            }
            else -> {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("No result available")
                }
            }
        }
    }
}

@Composable
fun WrongAnswerCard(item: AnswerResult, questionNumber: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFEBEE) // Light pink/red background
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(Color.Red),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Question $questionNumber",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = item.question,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 22.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                    .padding(12.dp)
            ) {
                Text(
                    text = "Your Answer: ${item.userAnswer ?: "Skipped"}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFD32F2F) // Darker Red for visibility
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Correct Answer: ${item.correctAnswer}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF388E3C) // Darker Green for visibility
                )
            }
        }
    }
}

@Composable
fun EmptyStatePerfectScore() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(Color(0xFFE8F5E9)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = null,
                modifier = Modifier.size(60.dp),
                tint = Color(0xFF4CAF50)
            )
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Text(
            text = "Perfect Score! 🎉",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        
        Text(
            text = "You got everything right. No mistakes!",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun StatItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    value: String,
    label: String,
    color: Color
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(32.dp),
            tint = color
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = value,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = color
        )
        Text(
            text = label,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
