package com.example.quizapp.presentation.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.model.Category
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.ui.theme.*
import com.example.quizapp.util.Constants
import com.example.quizapp.util.Resource
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToTopic: (String, String, String) -> Unit,
    onNavigateToQuiz: (String, String) -> Unit,
    onNavigateToHistory: () -> Unit,
    onNavigateToLevelProgress: () -> Unit,
    onNavigateToStreakDetails: () -> Unit,
    onNavigateToLeaderboard: () -> Unit,
    onLogout: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel()
) {
    val categories by quizViewModel.categories.collectAsState()
    val totalXP by quizViewModel.totalXP.collectAsState()
    val userLevel by quizViewModel.userLevel.collectAsState()
    val streakCount by quizViewModel.streakCount.collectAsState()
    val dailyChallengeCompleted by quizViewModel.dailyChallengeCompleted.collectAsState()
    
    val drawerState = LocalDrawerState.current
    val scope = rememberCoroutineScope()

    // Preserve scroll position
    val listState = rememberSaveable(saver = LazyGridState.Saver) {
        LazyGridState()
    }

    LaunchedEffect(Unit) {
        quizViewModel.loadCategories()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Quiz Master",
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { scope.launch { drawerState.open() } }) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = onNavigateToLeaderboard) {
                        Icon(Icons.Default.Leaderboard, contentDescription = "Leaderboard")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (categories) {
                is Resource.Loading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
                is Resource.Success -> {
                    val categoryList = (categories as Resource.Success).data ?: emptyList()
                    val defaultPrimaryColor = MaterialTheme.colorScheme.primary

                    LazyVerticalGrid(
                        state = listState,
                        columns = GridCells.Fixed(2),
                        contentPadding = PaddingValues(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        // SECTION 1 — LEVEL PROGRESS CARD
                        item(span = { GridItemSpan(2) }) {
                            LevelProgressCard(
                                level = userLevel,
                                currentXP = totalXP,
                                onClick = onNavigateToLevelProgress
                            )
                        }

                        // SECTION 2 — DAILY STREAK CARD
                        item(span = { GridItemSpan(2) }) {
                            DailyStreakCard(
                                streak = streakCount,
                                onClick = onNavigateToStreakDetails
                            )
                        }

                        // SECTION 3 — LEADERBOARD CARD
                        item(span = { GridItemSpan(2) }) {
                            LeaderboardCard(
                                onClick = onNavigateToLeaderboard
                            )
                        }

                        // Daily Challenge Card
                        item(span = { GridItemSpan(2) }) {
                            DailyChallengeCard(
                                completed = dailyChallengeCompleted,
                                onClick = { quizViewModel.startDailyChallenge() }
                            )
                        }

                        item(span = { GridItemSpan(2) }) {
                            Text(
                                text = "Categories",
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                            )
                        }

                        items(categoryList) { category ->
                            CategoryCard(
                                category = category,
                                onClick = {
                                    val color = when (category.name) {
                                        "Java" -> JavaColor
                                        "Python" -> PythonColor
                                        "Kotlin" -> KotlinColor
                                        "C++" -> CppColor
                                        "C" -> Color(0xFF00599C)
                                        "HTML" -> Color(0xFFE3BA26)
                                        "CSS" -> Color(0xFFB62215)
                                        "JavaScript" -> Color(0xFF1E42F7)
                                        else -> defaultPrimaryColor
                                    }
                                    onNavigateToTopic(category.id, category.name, color.toArgb().toLong().toString())
                                }
                            )
                        }
                    }
                }
                is Resource.Error -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(24.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Error,
                                contentDescription = null,
                                modifier = Modifier.size(64.dp),
                                tint = MaterialTheme.colorScheme.error
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = (categories as Resource.Error).message ?: "An error occurred",
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.error
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(
                                onClick = { quizViewModel.loadCategories() }
                            ) {
                                Text("Retry")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun LevelProgressCard(level: Int, currentXP: Int, onClick: () -> Unit) {
    val thresholds = Constants.LEVEL_THRESHOLDS
    val currentLevelXP = thresholds.getOrElse(level - 1) { 0 }
    val nextLevelXP = thresholds.getOrElse(level) { thresholds.last() }
    val remainingXP = nextLevelXP - currentXP
    
    val progress = if (nextLevelXP > currentLevelXP) {
        (currentXP - currentLevelXP).toFloat() / (nextLevelXP - currentLevelXP).toFloat()
    } else 1f

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    tint = Color(0xFFFFD700),
                    modifier = Modifier.size(32.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = "Level Progress",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Level $level Programmer",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            LinearProgressIndicator(
                progress = progress.coerceIn(0f, 1f),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
                    .clip(RoundedCornerShape(6.dp)),
                color = MaterialTheme.colorScheme.primary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "$currentXP / $nextLevelXP XP",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "$remainingXP XP to next level",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
fun DailyStreakCard(streak: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(Color(0xFFFF6F00), Color(0xFFFF3D00))
                    )
                )
                .padding(20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.LocalFireDepartment,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Daily Streak",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "$streak Day Streak",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                    Text(
                        text = "Complete a quiz today to keep it alive",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }
        }
    }
}

@Composable
fun LeaderboardCard(onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.EmojiEvents,
                contentDescription = null,
                tint = Color(0xFFFFD700),
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Leaderboard",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "See top learners",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                Icons.Default.ChevronRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
            )
        }
    }
}

@Composable
fun DailyChallengeCard(completed: Boolean, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = !completed, onClick = onClick),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (completed) MaterialTheme.colorScheme.surfaceVariant 
                             else MaterialTheme.colorScheme.secondaryContainer
        ),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (completed) Icons.Default.CheckCircle else Icons.Default.AdsClick,
                contentDescription = null,
                tint = if (completed) CorrectGreen else MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = if (completed) "Challenge Completed Today ✅" else "Daily Challenge 🎯",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = if (completed) "Come back tomorrow for more!" else "Complete today's challenge (+25 XP)",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Composable
fun CategoryCard(
    category: Category,
    onClick: () -> Unit
) {
    val categoryColor = when (category.name) {
        "Java" -> JavaColor
        "Python" -> PythonColor
        "Kotlin" -> KotlinColor
        "C++" -> CppColor
        "C" -> Color(0xFF00599C)
        "HTML" -> Color(0xFFE3BA26)
        "CSS" -> Color(0xFFB62215)
        "JavaScript" -> Color(0xFF1E42F7)
        else -> MaterialTheme.colorScheme.primary
    }

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.96f else 1f,
        label = "scale"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .animateContentSize()
            .clip(RoundedCornerShape(20.dp))
            .clickable(
                interactionSource = interactionSource,
                indication = rememberRipple(bounded = true),
                onClick = onClick
            ),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            categoryColor,
                            categoryColor.copy(alpha = 0.7f)
                        )
                    )
                )
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = when (category.name) {
                        "C" -> Icons.Default.Memory
                        "C++" -> Icons.Default.Terminal
                        "Java" -> Icons.Default.Coffee
                        "Python" -> Icons.Default.Code
                        "HTML" -> Icons.Default.Language
                        "Kotlin" -> Icons.Default.Android
                        "CSS" -> Icons.Default.Web
                        "JavaScript" -> Icons.Default.Bolt
                        else -> Icons.Default.Quiz
                },
                    contentDescription = null,
                    modifier = Modifier.size(48.dp),
                    tint = Color.White
                )

                Column {
                    Text(
                        text = category.name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "${category.topicCount} Topics",
                        fontSize = 14.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }
        }
    }
}
