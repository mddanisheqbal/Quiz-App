package com.example.quizapp.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.model.Achievement
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.util.Resource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementsScreen(
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel()
) {
    val achievementsState by quizViewModel.achievements.collectAsState()

    LaunchedEffect(Unit) {
        quizViewModel.loadAchievements()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Achievements 🏆", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (val state = achievementsState) {
                is Resource.Loading -> {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }
                is Resource.Success -> {
                    val achievements = state.data ?: emptyList()
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(achievements) { achievement ->
                            AchievementCard(achievement = achievement)
                        }
                    }
                }
                is Resource.Error -> {
                    Text(
                        text = state.message ?: "An error occurred",
                        modifier = Modifier.align(Alignment.Center),
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        }
    }
}

@Composable
fun AchievementCard(achievement: Achievement) {
    val icon = when (achievement.iconName) {
        "quiz" -> Icons.Default.Quiz
        "streak" -> Icons.Default.LocalFireDepartment
        "check" -> Icons.Default.CheckCircle
        "star" -> Icons.Default.Star
        "champion" -> Icons.Default.EmojiEvents
        else -> Icons.Default.EmojiEvents
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (achievement.unlocked) MaterialTheme.colorScheme.surfaceVariant
                             else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        ),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .background(
                        if (achievement.unlocked) MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)
                        else Color.Gray.copy(alpha = 0.2f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(36.dp),
                    tint = if (achievement.unlocked) MaterialTheme.colorScheme.primary else Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = achievement.title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = if (achievement.unlocked) MaterialTheme.colorScheme.onSurface 
                        else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = achievement.description,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center,
                color = if (achievement.unlocked) MaterialTheme.colorScheme.onSurfaceVariant 
                        else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
            )
        }
    }
}
