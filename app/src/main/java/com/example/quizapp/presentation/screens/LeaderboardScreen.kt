package com.example.quizapp.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.model.User
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.util.Resource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LeaderboardScreen(
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel()
) {
    val leaderboardState = quizViewModel.leaderboard.collectAsState()

    LaunchedEffect(Unit) {
        quizViewModel.loadLeaderboard()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Leaderboard 🏆", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
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
            when (val state = leaderboardState.value) {
                is Resource.Loading -> {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }
                is Resource.Success -> {
                    val users = state.data ?: emptyList()
                    if (users.isEmpty()) {
                        Column(
                            modifier = Modifier.align(Alignment.Center).padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.EmojiEvents,
                                contentDescription = null,
                                modifier = Modifier.size(64.dp),
                                tint = MaterialTheme.colorScheme.secondary.copy(alpha = 0.5f)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "No players yet. Be the first!",
                                style = MaterialTheme.typography.headlineSmall,
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            itemsIndexed(users) { index, user ->
                                LeaderboardItem(rank = index + 1, user = user)
                            }
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
fun LeaderboardItem(rank: Int, user: User) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = when (rank) {
                1 -> Color(0xFFFFF9C4) // Goldish for 1st
                2 -> Color(0xFFF5F5F5) // Silverish for 2nd
                3 -> Color(0xFFFFF3E0) // Bronzish for 3rd
                else -> MaterialTheme.colorScheme.surface
            }
        ),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Rank
            Text(
                text = when(rank) {
                    1 -> "1️⃣"
                    2 -> "2️⃣"
                    3 -> "3️⃣"
                    else -> rank.toString()
                },
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.width(44.dp)
            )
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // User Info
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = user.username.ifEmpty { "User" },
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Default.Star,
                        contentDescription = null,
                        tint = Color(0xFFFFD700),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Level ${calculateLevel(user.totalXP)}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Icon(
                        Icons.Default.LocalFireDepartment,
                        contentDescription = null,
                        tint = Color(0xFFFF6F00),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "${user.streak} Day Streak",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            
            // XP
            Text(
                text = "${user.totalXP} XP",
                fontWeight = FontWeight.ExtraBold,
                color = MaterialTheme.colorScheme.primary,
                fontSize = 16.sp
            )
        }
    }
}

private fun calculateLevel(xp: Int): Int {
    val thresholds = listOf(0, 300, 700, 1200, 1800, 2500, 3500, 4700, 6000, 7500)
    var level = 1
    for (i in 1 until thresholds.size) {
        if (xp >= thresholds[i]) level = i + 1 else break
    }
    return level
}
