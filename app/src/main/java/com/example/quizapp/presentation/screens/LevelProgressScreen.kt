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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel
import com.example.quizapp.util.Constants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelProgressScreen(
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel(),
    userViewModel: UserViewModel = hiltViewModel()
) {
    val totalXP by userViewModel.totalXP.collectAsState()
    val userLevel by userViewModel.userLevel.collectAsState()
    
    val thresholds = Constants.LEVEL_THRESHOLDS
    val currentLevelXP = thresholds.getOrElse(userLevel - 1) { 0 }
    val nextLevelXP = thresholds.getOrElse(userLevel) { thresholds.last() }
    val remainingXP = nextLevelXP - totalXP
    
    val progress = if (nextLevelXP > currentLevelXP) {
        (totalXP - currentLevelXP).toFloat() / (nextLevelXP - currentLevelXP).toFloat()
    } else 1f

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Level Progress", fontWeight = FontWeight.Bold) },
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    // FEATURE 3 — CENTER UI PROPERLY
                    Column(
                        modifier = Modifier.padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // FEATURE 4 — UPDATED UI STRUCTURE
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(0xFFFFD700),
                            modifier = Modifier.size(80.dp)
                        )
                        
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        // FEATURE 1 — REMOVE "PROGRAMMER"
                        Text(
                            text = "Level $userLevel",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = getLevelTitle(userLevel),
                            fontSize = 16.sp,
                            color = Color.Gray
                        )
                        
                        Spacer(modifier = Modifier.height(24.dp))
                        
                        LinearProgressIndicator(
                            progress = progress.coerceIn(0f, 1f),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(16.dp)
                                .clip(RoundedCornerShape(8.dp)),
                            color = MaterialTheme.colorScheme.primary,
                            trackColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                        
                        Spacer(modifier = Modifier.height(12.dp))
                        
                        Text(
                            text = "$totalXP / $nextLevelXP XP",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        
                        if (userLevel < thresholds.size) {
                            Text(
                                text = "$remainingXP XP to reach Level ${userLevel + 1}",
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        } else {
                            Text(
                                text = "Max Level Reached!",
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            item {
                Text(
                    text = "Level Roadmap",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            itemsIndexed(thresholds) { index, xp ->
                LevelRoadmapItem(
                    level = index + 1,
                    requiredXP = xp,
                    isReached = userLevel >= index + 1,
                    isCurrent = userLevel == index + 1
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelRoadmapItem(level: Int, requiredXP: Int, isReached: Boolean, isCurrent: Boolean) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isCurrent) MaterialTheme.colorScheme.primaryContainer 
                             else if (isReached) MaterialTheme.colorScheme.surfaceVariant
                             else MaterialTheme.colorScheme.surface
        ),
        border = if (isCurrent) IconButtonDefaults.outlinedIconButtonBorder(true) else null
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (isReached) Icons.Default.CheckCircle else Icons.Default.Lock,
                contentDescription = null,
                tint = if (isReached) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Level $level",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "$requiredXP XP Required",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            if (isCurrent) {
                Spacer(modifier = Modifier.weight(1f))
                Badge(containerColor = MaterialTheme.colorScheme.primary) {
                    Text("Current", color = Color.White, modifier = Modifier.padding(4.dp))
                }
            }
        }
    }
}
