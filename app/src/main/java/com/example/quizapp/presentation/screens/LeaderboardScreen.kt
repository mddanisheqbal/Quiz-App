package com.example.quizapp.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.quizapp.data.model.User
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel
import com.example.quizapp.util.Resource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LeaderboardScreen(
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel(),
    userViewModel: UserViewModel = hiltViewModel()
) {
    val leaderboardState = quizViewModel.leaderboard.collectAsState()
    val currentUserState by userViewModel.user.collectAsState()

    LaunchedEffect(Unit) {
        quizViewModel.loadLeaderboard()
    }

    Scaffold(
        topBar = {
            // FEATURE 6 — HEADER IMPROVEMENT (Gradient)
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
                        text = "Leaderboard 🏆",
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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (val state = leaderboardState.value) {
                is Resource.Loading -> {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center), color = Color(0xFF7B1FA2))
                }
                is Resource.Success -> {
                    val users = state.data ?: emptyList()
                    if (users.isEmpty()) {
                        // FEATURE 7 — EMPTY STATE
                        Column(
                            modifier = Modifier.align(Alignment.Center).padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.EmojiEvents,
                                contentDescription = null,
                                modifier = Modifier.size(64.dp),
                                tint = Color.Gray.copy(alpha = 0.5f)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "No rankings yet",
                                style = MaterialTheme.typography.headlineSmall,
                                textAlign = TextAlign.Center,
                                color = Color.Gray
                            )
                        }
                    } else {
                        // FEATURE 5 — SPACING
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(16.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            itemsIndexed(users) { index, user ->
                                LeaderboardItem(
                                    rank = index + 1,
                                    user = user,
                                    isCurrentUser = user.uid == currentUserState?.uid
                                )
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
fun LeaderboardItem(rank: Int, user: User, isCurrentUser: Boolean) {
    // FEATURE 1 — TOP 1 USER HIGHLIGHT
    val isRank1 = rank == 1
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            // FEATURE 4 — CURRENT USER HIGHLIGHT
            .then(
                if (isCurrentUser) Modifier.border(2.dp, Color(0xFF7B1FA2), RoundedCornerShape(16.dp))
                else Modifier
            ),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isRank1) Color(0xFFFFF3CD) else Color.White
        ),
        elevation = CardDefaults.cardElevation(if (isRank1) 6.dp else 2.dp)
    ) {
        // FEATURE 2 — USER ROW DESIGN
        Row(
            modifier = Modifier
                .padding(if (isRank1) 16.dp else 12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // LEFT SIDE — Rank Badge
            Box(
                modifier = Modifier
                    .size(if (isRank1) 40.dp else 32.dp)
                    .background(
                        if (isRank1) Color(0xFFFFD700) else Color(0xFFEEEEEE), 
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (isRank1) "🏆" else rank.toString(),
                    fontSize = if (isRank1) 18.sp else 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isRank1) Color.Black else Color.Gray
                )
            }
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // FEATURE 3 — ADD USER AVATAR
            Box(
                modifier = Modifier
                    .size(if (isRank1) 48.dp else 40.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            ) {
                if (!user.profilePictureUrl.isNullOrEmpty()) {
                    AsyncImage(
                        model = user.profilePictureUrl,
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier.align(Alignment.Center).size(24.dp),
                        tint = Color.Gray
                    )
                }
            }
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // MIDDLE
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = if (isCurrentUser) "${user.username} (You)" else user.username.ifEmpty { "User" },
                    fontWeight = FontWeight.Bold,
                    fontSize = if (isRank1) 18.sp else 16.sp,
                    color = Color.Black
                )
                
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "⭐ Level ${calculateLevel(user.totalXP)}",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "🔥 ${user.streak} Day",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }
            
            // RIGHT SIDE — XP
            Text(
                text = "${user.totalXP} XP",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF7B1FA2),
                fontSize = if (isRank1) 18.sp else 16.sp
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
