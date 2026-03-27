package com.example.quizapp.presentation.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.allAchievements
import com.example.quizapp.data.model.Achievement
import com.example.quizapp.data.model.UserAchievement
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.util.Resource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementsScreen(
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel()
) {
    val userAchievementsState by quizViewModel.userAchievements.collectAsState()
    var selectedCategory by remember { mutableStateOf("All") }
    val categories = listOf("All", "quiz", "streak", "skill", "economy", "progress")

    LaunchedEffect(Unit) {
        quizViewModel.loadAchievements()
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Achievements", fontWeight = FontWeight.ExtraBold) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(MaterialTheme.colorScheme.surface)
        ) {
            when (val state = userAchievementsState) {
                is Resource.Loading -> {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }
                is Resource.Success -> {
                    val userAchievements = state.data ?: emptyList()
                    
                    // Calculate unlocked count correctly by checking against targets
                    val unlockedCount = remember(userAchievements) {
                        allAchievements.count { achievement ->
                            val userAch = userAchievements.find { it.id == achievement.id }
                            userAch?.isUnlocked == true || (userAch != null && userAch.progress >= achievement.target)
                        }
                    }
                    
                    Column(modifier = Modifier.fillMaxSize()) {
                        AchievementHeader(unlocked = unlockedCount, total = allAchievements.size)
                        
                        CategoryFilterChips(
                            categories = categories,
                            selectedCategory = selectedCategory,
                            onCategorySelected = { selectedCategory = it }
                        )

                        val filteredAchievements = remember(selectedCategory, allAchievements) {
                            if (selectedCategory == "All") {
                                allAchievements
                            } else {
                                allAchievements.filter { it.category.equals(selectedCategory, ignoreCase = true) }
                            }
                        }

                        // Sort: Unlocked first, then by progress
                        val sortedAchievements = remember(filteredAchievements, userAchievements) {
                            filteredAchievements.sortedWith(
                                compareByDescending<Achievement> { achievement ->
                                    val userAch = userAchievements.find { it.id == achievement.id }
                                    userAch?.isUnlocked == true || (userAch != null && userAch.progress >= achievement.target)
                                }.thenByDescending { achievement ->
                                    val progress = userAchievements.find { it.id == achievement.id }?.progress ?: 0
                                    progress.toFloat() / achievement.target.toFloat()
                                }
                            )
                        }

                        if (sortedAchievements.isEmpty()) {
                            EmptyAchievementsState()
                        } else {
                            AchievementList(
                                achievements = sortedAchievements,
                                userAchievements = userAchievements
                            )
                        }
                    }
                }
                is Resource.Error -> {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = state.message ?: "An error occurred", color = MaterialTheme.colorScheme.error)
                        Button(onClick = { quizViewModel.loadAchievements() }) {
                            Text("Retry")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AchievementHeader(unlocked: Int, total: Int) {
    val progress = if (total > 0) unlocked / total.toFloat() else 0f
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(durationMillis = 1000),
        label = "HeaderProgress"
    )
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(12.dp)
    ) {
        Box(
            modifier = Modifier
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF673AB7), // Deep Purple
                            Color(0xFF9C27B0)  // Purple
                        )
                    )
                )
                .padding(24.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Your Progress 🏆",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    "$unlocked of $total achievements unlocked",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.8f)
                )
                Spacer(modifier = Modifier.height(20.dp))
                LinearProgressIndicator(
                    progress = animatedProgress,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(14.dp)
                        .clip(CircleShape),
                    color = Color(0xFFFFD700), // Gold
                    trackColor = Color.White.copy(alpha = 0.2f),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Keep going! You're doing great 🚀",
                    style = MaterialTheme.typography.labelMedium,
                    color = Color.White.copy(alpha = 0.9f),
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryFilterChips(
    categories: List<String>,
    selectedCategory: String,
    onCategorySelected: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        categories.forEach { category ->
            val isSelected = category == selectedCategory
            FilterChip(
                selected = isSelected,
                onClick = { onCategorySelected(category) },
                label = { 
                    Text(
                        category.replaceFirstChar { it.uppercase() },
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                    ) 
                },
                shape = RoundedCornerShape(12.dp),
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = Color(0xFF673AB7),
                    selectedLabelColor = Color.White
                )
            )
        }
    }
}

@Composable
fun AchievementList(
    achievements: List<Achievement>,
    userAchievements: List<UserAchievement>
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(achievements, key = { it.id }) { achievement ->
            val state = userAchievements.find { it.id == achievement.id }
            AchievementItem(achievement = achievement, state = state)
        }
    }
}

@Composable
fun AchievementItem(
    achievement: Achievement,
    state: UserAchievement?
) {
    val current = state?.progress ?: 0
    val target = achievement.target
    val progress = current.toFloat() / target.toFloat()
    
    val isUnlocked = state?.isUnlocked == true || progress >= 1f
    val isInProgress = !isUnlocked && current > 0
    val isLocked = current == 0

    val animatedProgress by animateFloatAsState(
        targetValue = progress.coerceIn(0f, 1f),
        animationSpec = tween(durationMillis = 800),
        label = "AchievementProgress"
    )

    val scale by animateFloatAsState(
        targetValue = if (isUnlocked) 1.02f else 1f,
        label = "ScaleAnimation"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
            .scale(scale),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = when {
                isUnlocked -> Color(0xFFEDE7F6) // Light purple glow
                isInProgress -> Color.White
                else -> Color(0xFFF5F5F5)
            }
        ),
        border = when {
            isUnlocked -> BorderStroke(1.5.dp, Color(0xFF7B1FA2))
            isInProgress -> BorderStroke(1.dp, Color.LightGray.copy(alpha = 0.5f))
            else -> null
        },
        elevation = CardDefaults.cardElevation(
            defaultElevation = if (isUnlocked) 8.dp else 4.dp
        )
    ) {
        Box {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .alpha(if (isLocked) 0.5f else 1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // ICON BOX
                Box(
                    modifier = Modifier
                        .size(54.dp)
                        .background(
                            if (isUnlocked) Color(0xFFD1C4E9) else Color(0xFFE0E0E0),
                            CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(achievement.icon, fontSize = 24.sp)
                }

                Spacer(Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        achievement.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (isUnlocked) Color(0xFF4A148C) else Color.Black
                    )

                    Text(
                        achievement.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )

                    Spacer(Modifier.height(8.dp))

                    if (!isUnlocked) {
                        LinearProgressIndicator(
                            progress = animatedProgress,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(CircleShape),
                            color = Color(0xFF7B1FA2),
                            trackColor = Color.LightGray.copy(alpha = 0.3f)
                        )

                        Spacer(Modifier.height(4.dp))
                        
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "$current / $target",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )
                            
                            if (progress > 0.7f) {
                                Text(
                                    "🔥 Almost there!",
                                    color = Color.Red,
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }
                        }
                    } else {
                        Text(
                            "Completed 🎉",
                            color = Color(0xFF4CAF50),
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }

                Spacer(Modifier.width(8.dp))

                // REWARD SECTION
                Column(horizontalAlignment = Alignment.End) {
                    Text(
                        "+${achievement.xpReward} XP",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color(0xFF7B1FA2),
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        "+${achievement.coinReward} 🪙",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color(0xFFFF9800),
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }

            // 🔒 LOCK OVERLAY
            if (isLocked) {
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .background(Color.White.copy(alpha = 0.4f))
                )
                Icon(
                    Icons.Default.Lock,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.Center)
                )
            }

            // ✅ COMPLETED ICON
            if (isUnlocked) {
                Icon(
                    Icons.Default.CheckCircle,
                    contentDescription = null,
                    tint = Color(0xFF4CAF50),
                    modifier = Modifier
                        .size(20.dp)
                        .align(Alignment.TopEnd)
                        .padding(4.dp)
                )
            }
        }
    }
}

@Composable
fun EmptyAchievementsState() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.EmojiEvents,
            contentDescription = null,
            modifier = Modifier.size(80.dp),
            tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "No achievements found in this category",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )
    }
}
