package com.example.quizapp.presentation.screens

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.core.content.ContextCompat
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.model.Category
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.ui.theme.*
import com.example.quizapp.util.Constants
import com.example.quizapp.util.NotificationWorker
import com.example.quizapp.util.PreferencesManager
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
    onNavigateToDailyChallenge: () -> Unit,
    onLogout: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel()
) {
    val categories by quizViewModel.categories.collectAsState()
    val totalXP by quizViewModel.totalXP.collectAsState()
    val userLevel by quizViewModel.userLevel.collectAsState()
    val streakCount by quizViewModel.streakCount.collectAsState()
    val dailyChallengeCompleted by quizViewModel.dailyChallengeCompleted.collectAsState()
    val coins by quizViewModel.coins.collectAsState()
    val showDailyReward by quizViewModel.showDailyRewardDialog.collectAsState()
    val rewardAmount by quizViewModel.dailyRewardAmount.collectAsState()
    
    val drawerState = LocalDrawerState.current
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val prefsManager = remember { PreferencesManager(context) }
    val snackbarHostState = remember { SnackbarHostState() }

    // Feature 5: Daily Reward Dialog
    if (showDailyReward && rewardAmount != null) {
        DailyRewardDialog(
            rewardAmount = rewardAmount!!,
            onClaim = { quizViewModel.dismissDailyRewardDialog() }
        )
    }

    // Permission Launcher
    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            NotificationWorker.scheduleDailyReminders(context)
        } else {
            scope.launch {
                val result = snackbarHostState.showSnackbar(
                    message = "Enable notifications to stay updated with daily challenges!",
                    actionLabel = "Settings",
                    duration = SnackbarDuration.Long
                )
                if (result == SnackbarResult.ActionPerformed) {
                    val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                        data = Uri.fromParts("package", context.packageName, null)
                    }
                    context.startActivity(intent)
                }
            }
        }
        prefsManager.setNotificationsRequested(true)
    }

    val listState = rememberSaveable(saver = LazyGridState.Saver) {
        LazyGridState()
    }

    LaunchedEffect(Unit) {
        quizViewModel.loadCategories()
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            val isPermissionGranted = ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED

            if (!isPermissionGranted && !prefsManager.isNotificationsRequested()) {
                permissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            } else if (isPermissionGranted) {
                NotificationWorker.scheduleDailyReminders(context)
            }
        } else {
            NotificationWorker.scheduleDailyReminders(context)
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
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
                    // Feature 10: Coins Display in TopBar
                    Surface(
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .clickable { /* Open Store/Coins screen */ },
                        shape = RoundedCornerShape(20.dp),
                        color = Color.Black.copy(alpha = 0.2f)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.MonetizationOn,
                                contentDescription = "Coins",
                                tint = Color(0xFFFFD700),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = coins.toString(),
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                    }
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
                        item(span = { GridItemSpan(2) }) {
                            LevelProgressCard(
                                level = userLevel,
                                currentXP = totalXP,
                                onClick = onNavigateToLevelProgress
                            )
                        }

                        item(span = { GridItemSpan(2) }) {
                            DailyStreakCard(
                                streak = streakCount,
                                onClick = onNavigateToStreakDetails
                            )
                        }

                        // Feature 7: Earn Free Coins Ad Banner
                        item(span = { GridItemSpan(2) }) {
                            EarnCoinsAdCard(
                                onClick = { quizViewModel.showRewardedAd(context as Activity) }
                            )
                        }

                        item(span = { GridItemSpan(2) }) {
                            DailyChallengeCard(
                                completed = dailyChallengeCompleted,
                                onClick = onNavigateToDailyChallenge
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
fun DailyRewardDialog(rewardAmount: Int, onClaim: () -> Unit) {
    Dialog(onDismissRequest = onClaim) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "🎁 Daily Reward",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color(0xFFFFD700).copy(alpha = 0.1f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.MonetizationOn,
                        contentDescription = null,
                        tint = Color(0xFFFFD700),
                        modifier = Modifier.size(64.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Congratulations!",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "You earned $rewardAmount coins",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = onClaim,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Claim")
                }
            }
        }
    }
}

@Composable
fun EarnCoinsAdCard(onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.VideoLibrary,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.tertiary,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Earn Free Coins",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Watch a quick ad to get 20-50 coins!",
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = null,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Composable
fun LevelProgressCard(level: Int, currentXP: Int, onClick: () -> Unit) {
    val thresholds = Constants.LEVEL_THRESHOLDS
    val currentLevelXP = thresholds.getOrElse(level - 1) { 0 }
    val nextLevelXP = thresholds.getOrElse(level) { thresholds.last() }
    
    val progress = if (nextLevelXP > currentLevelXP) {
        (currentXP - currentLevelXP).toFloat() / (nextLevelXP - currentLevelXP).toFloat()
    } else 1f

    val skillTitle = when (level) {
        1 -> "Beginner"
        2 -> "Learner"
        3 -> "Explorer"
        4 -> "Coder"
        5 -> "Developer"
        6 -> "Advanced Developer"
        7 -> "Expert"
        8 -> "Senior Expert"
        9 -> "Master"
        10 -> "Grand Master"
        else -> "Legend"
    }

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
                        text = skillTitle,
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
fun DailyChallengeCard(completed: Boolean, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
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
                    text = if (completed) "See all challenges!" else "Complete today's challenge (+25 XP)",
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
