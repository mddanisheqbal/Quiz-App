package com.example.quizapp.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Challenge(
    val name: String,
    val description: String,
    val xpReward: Int,
    val icon: ImageVector
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DailyChallengeScreen(
    onNavigateBack: () -> Unit
) {
    val challenges = listOf(
        Challenge(
            "Daily Challenge",
            "Answer 10 random questions from various categories.",
            25,
            Icons.Default.EmojiEvents
        ),
        Challenge(
            "Speed Challenge",
            "Answer questions within a tight time limit to test your speed.",
            30,
            Icons.Default.EmojiEvents
        ),
        Challenge(
            "Accuracy Challenge",
            "Score 100% in a quiz to prove your mastery.",
            40,
            Icons.Default.EmojiEvents
        ),
        Challenge(
            "Category Challenge",
            "Complete a quiz in a specific category assigned for today.",
            20,
            Icons.Default.EmojiEvents
        )
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Daily Challenges") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(challenges) { challenge ->
                ChallengeCard(challenge = challenge)
            }
        }
    }
}

@Composable
fun ChallengeCard(challenge: Challenge) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* Handle challenge start */ },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = challenge.icon,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = challenge.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = challenge.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "+${challenge.xpReward} XP reward",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
