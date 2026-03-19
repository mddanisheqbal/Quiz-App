package com.example.quizapp.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.model.Category
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel
import com.example.quizapp.util.Constants
import com.example.quizapp.util.Resource
import kotlinx.coroutines.launch

// FEATURE 4 — CREATE LEVEL TITLE FUNCTION
fun getLevelTitle(level: Int): String {
    return when (level) {
        1 -> "Beginner"
        2 -> "Learner"
        3 -> "Intermediate"
        4 -> "Advanced"
        5 -> "Skilled"
        6 -> "Proficient"
        7 -> "Expert"
        8 -> "Master"
        9 -> "Elite"
        10 -> "Legend"
        else -> "Legend"
    }
}

@Composable
fun CoinDisplay(
    coins: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.White.copy(alpha = 0.15f),
        shape = RoundedCornerShape(50),
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .clickable { onClick() }
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.MonetizationOn,
                contentDescription = "Coins",
                tint = Color(0xFFFFD700), // gold color
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = coins.toString(),
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    userViewModel: UserViewModel,
    quizViewModel: QuizViewModel = hiltViewModel(),
    onNavigateToTopic: (String, String, String) -> Unit,
    onNavigateToQuiz: (String, String, String) -> Unit = { _, _, _ -> },
    onNavigateToStreakDetails: () -> Unit,
    onNavigateToStore: () -> Unit,
    onNavigateToProfile: () -> Unit,
    onNavigateToLevelProgress: () -> Unit = {},
    onNavigateToDailyChallenge: () -> Unit = {},
    onNavigateToHistory: () -> Unit = {},
    onNavigateToLeaderboard: () -> Unit = {},
    onLogout: () -> Unit = {}
) {
    val categoriesState by quizViewModel.categories.collectAsState()
    val userState by userViewModel.user.collectAsState()
    val drawerState = LocalDrawerState.current
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val isDark = isSystemInDarkTheme()

    // RESTORE SCROLL POSITION FROM VIEWMODEL
    val gridState = rememberLazyGridState(
        initialFirstVisibleItemIndex = quizViewModel.homeGridScrollIndex,
        initialFirstVisibleItemScrollOffset = quizViewModel.homeGridScrollOffset
    )

    // SAVE SCROLL POSITION ON CHANGE
    LaunchedEffect(gridState) {
        snapshotFlow { gridState.firstVisibleItemIndex to gridState.firstVisibleItemScrollOffset }
            .collect { (index, offset) ->
                quizViewModel.homeGridScrollIndex = index
                quizViewModel.homeGridScrollOffset = offset
            }
    }

    LaunchedEffect(Unit) {
        quizViewModel.loadCategories()
    }

    // FEATURE 2 — MAIN BACKGROUND
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Scaffold(
            containerColor = Color.Transparent,
            topBar = {
                // FEATURE 1 — TOP BAR (GRADIENT)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp) // Increased height for the greeting
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(Color(0xFF7B1FA2), Color(0xFF512DA8))
                            )
                        )
                        .padding(horizontal = 16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .statusBarsPadding(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(onClick = { scope.launch { drawerState.open() } }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.White)
                            }

                            Spacer(modifier = Modifier.width(4.dp))

                            // FEATURE 2 — ADD GREETING HEADER (HOME SCREEN)
                            Column {
                                Text(
                                    text = "Hello, ${userState?.username ?: "Explorer"}",
                                    color = Color.White.copy(alpha = 0.9f),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Let’s test your knowledge!",
                                    color = Color.White.copy(alpha = 0.7f),
                                    fontSize = 12.sp
                                )
                            }
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            // PREMIUM COIN DISPLAY
                            CoinDisplay(
                                coins = userState?.coins ?: 0,
                                onClick = onNavigateToStore,
                                modifier = Modifier.padding(end = 8.dp)
                            )

                            IconButton(onClick = onNavigateToLeaderboard) {
                                Icon(Icons.Default.BarChart, contentDescription = "Leaderboard", tint = Color.White)
                            }
                        }
                    }
                }
            }
        ) { paddingValues ->
            LazyVerticalGrid(
                state = gridState,
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // FEATURE 3 — CARDS SECTION (Vertical Stack)
                item(span = { GridItemSpan(2) }) {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        
                        // 1. LEVEL PROGRESS CARD
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onNavigateToLevelProgress() }
                                .shadow(6.dp, RoundedCornerShape(20.dp)),
                            shape = RoundedCornerShape(20.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                        ) {
                            Box(
                                modifier = Modifier
                                    .background(
                                        brush = Brush.horizontalGradient(
                                            colors = listOf(Color(0xFF7B1FA2), Color(0xFF512DA8))
                                        )
                                    )
                                    .padding(16.dp)
                            ) {
                                Column {
                                    val currentLevel = userState?.level ?: 1
                                    val thresholds = Constants.LEVEL_THRESHOLDS
                                    val currentLevelXP = thresholds.getOrElse(currentLevel - 1) { 0 }
                                    val nextLevelXP = thresholds.getOrElse(currentLevel) { thresholds.last() }
                                    val totalXP = userState?.totalXP ?: 0

                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = null,
                                            tint = Color.Yellow,
                                            modifier = Modifier.size(24.dp)
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Column {
                                            Text(
                                                text = "Level $currentLevel",
                                                color = Color.White,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 16.sp
                                            )
                                            Text(
                                                text = getLevelTitle(currentLevel),
                                                color = Color.White.copy(alpha = 0.8f),
                                                fontSize = 14.sp
                                            )
                                        }
                                        Spacer(modifier = Modifier.weight(1f))
                                        Text(
                                            text = "$totalXP / $nextLevelXP XP",
                                            color = Color.White.copy(alpha = 0.7f),
                                            fontSize = 12.sp
                                        )
                                    }
                                    
                                    Spacer(modifier = Modifier.height(12.dp))
                                    
                                    val progress = if (nextLevelXP > currentLevelXP) {
                                        (totalXP - currentLevelXP).toFloat() / (nextLevelXP - currentLevelXP).toFloat()
                                    } else 1f
                                    
                                    LinearProgressIndicator(
                                        progress = progress.coerceIn(0f, 1f),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(8.dp)
                                            .clip(CircleShape),
                                        color = Color.Yellow,
                                        trackColor = Color.White.copy(alpha = 0.2f)
                                    )
                                }
                            }
                        }

                        // 2. DAILY STREAK CARD
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onNavigateToStreakDetails() }
                                .shadow(4.dp, RoundedCornerShape(20.dp)),
                            shape = RoundedCornerShape(20.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Brush.horizontalGradient(listOf(Color(0xFFFF6A00), Color(0xFFFF3D00))))
                                    .padding(16.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.Whatshot, contentDescription = null, tint = Color.White, modifier = Modifier.size(40.dp))
                                    Spacer(modifier = Modifier.width(16.dp))
                                    Column {
                                        Text("Daily Streak", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                                        Text("${userState?.streak ?: 0} Day Streak", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                                        Text("Complete a quiz today to keep it alive", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
                                    }
                                }
                            }
                        }

                        // 3. EARN COINS CARD
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    val activity = context as? android.app.Activity
                                    if (activity != null) userViewModel.showRewardedAd(activity)
                                }
                                .shadow(2.dp, RoundedCornerShape(20.dp)),
                            shape = RoundedCornerShape(20.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = if (isDark) Color(0xFF3B2527) else Color(0xFFF8D7DA)
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Default.PlayCircle, contentDescription = null, tint = if (isDark) Color(0xFFE57373) else Color(0xFFC62828), modifier = Modifier.size(40.dp))
                                Spacer(modifier = Modifier.width(16.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text("Earn Free Coins", color = if (isDark) Color.White else Color.Black, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                                    Text("Watch a quick ad to get 20 coins!", color = if (isDark) Color.White.copy(alpha = 0.7f) else Color.Black.copy(alpha = 0.7f), fontSize = 12.sp)
                                }
                                Icon(Icons.Default.ChevronRight, contentDescription = null, tint = if (isDark) Color.White.copy(alpha = 0.5f) else Color.Black.copy(alpha = 0.5f))
                            }
                        }

                        // 4. DAILY CHALLENGE CARD
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onNavigateToDailyChallenge() }
                                .shadow(2.dp, RoundedCornerShape(20.dp)),
                            shape = RoundedCornerShape(20.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF009688))
                        ) {
                            Row(
                                modifier = Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Default.AdsClick, contentDescription = null, tint = Color.White, modifier = Modifier.size(40.dp))
                                Spacer(modifier = Modifier.width(16.dp))
                                Column {
                                    Text("Daily Challenge 🎯", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                                    Text("Complete today's challenge (+25 XP)", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
                                }
                            }
                        }
                    }
                }

                // FEATURE 4 — CATEGORY TITLE
                item(span = { GridItemSpan(2) }) {
                    Text(
                        text = "Categories",
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }

                // FEATURE 5 — CATEGORY GRID
                when (categoriesState) {
                    is Resource.Loading -> {
                        item(span = { GridItemSpan(2) }) {
                            Box(modifier = Modifier.fillMaxWidth().height(200.dp), contentAlignment = Alignment.Center) {
                                CircularProgressIndicator(color = Color(0xFF6A1B9A))
                            }
                        }
                    }
                    is Resource.Success -> {
                        val categories = (categoriesState as Resource.Success<List<Category>>).data ?: emptyList()
                        items(categories) { category ->
                            CategoryExactCard(
                                category = category,
                                onClick = {
                                    onNavigateToTopic(category.id, category.name, category.colorHex)
                                }
                            )
                        }
                    }
                    is Resource.Error -> {
                        item(span = { GridItemSpan(2) }) {
                            Text(text = "Error loading categories", color = Color.Red)
                        }
                    }
                }
                
                item(span = { GridItemSpan(2) }) {
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Composable
fun CategoryExactCard(category: Category, onClick: () -> Unit) {
    // FEATURE 7 — EXACT COLORS (Gradients)
    val gradientColors = remember(category.name, category.colorHex) {
        val baseColor = try {
            Color(android.graphics.Color.parseColor(category.colorHex))
        } catch (e: Exception) {
            Color(0xFF1565C0)
        }
        
        when (category.name.uppercase()) {
            "C" -> listOf(Color(0xFF1565C0), Color(0xFF1E88E5))
            "C++" -> listOf(Color(0xFF64B5F6), Color(0xFF90CAF9))
            "CSS" -> listOf(Color(0xFFC62828), Color(0xFFE57373))
            "HTML" -> listOf(Color(0xFFF9A825), Color(0xFFFFD54F))
            "JAVA" -> listOf(Color(0xFFE57373), Color(0xFFEF9A9A))
            "JAVASCRIPT" -> listOf(Color(0xFF1E3A8A), Color(0xFF3B82F6))
            "KOTLIN" -> listOf(Color(0xFF00897B), Color(0xFF26A69A))
            "PYTHON" -> listOf(Color(0xFF6A1B9A), Color(0xFF8E24AA))
            else -> listOf(baseColor, baseColor.copy(alpha = 0.7f))
        }
    }

    val icon = remember(category.name) {
        when (category.name.uppercase()) {
            "C" -> Icons.Default.Memory
            "C++" -> Icons.Default.Terminal
            "CSS" -> Icons.Default.WebAsset
            "HTML" -> Icons.Default.Language
            "JAVA" -> Icons.Default.Coffee
            "JAVASCRIPT" -> Icons.Default.Bolt
            "KOTLIN" -> Icons.Default.Android
            "PYTHON" -> Icons.Default.Code
            else -> Icons.Default.Category
        }
    }

    // FEATURE 6 — CATEGORY CARD DESIGN
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .clickable { onClick() }
            .shadow(6.dp, RoundedCornerShape(24.dp)),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(gradientColors))
                .padding(20.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Top-left: Icon
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(32.dp)
                )
                
                Spacer(modifier = Modifier.height(24.dp))
                
                // Bottom-left: Title and Topics
                Column(modifier = Modifier.align(Alignment.Start)) {
                    Text(
                        text = category.name,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 2.dp)
                    )
                    Text(
                        text = "${category.topicCount} Topics",
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 13.sp
                    )
                }
            }
        }
    }
}
