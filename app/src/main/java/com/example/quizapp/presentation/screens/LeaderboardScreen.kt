package com.example.quizapp.presentation.screens

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import kotlin.math.absoluteValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LeaderboardScreen(
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel(),
    userViewModel: UserViewModel = hiltViewModel()
) {
    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("All Time", "Monthly")
    
    val leaderboardState = quizViewModel.leaderboard.collectAsState()
    val monthlyLeaderboardState = quizViewModel.monthlyLeaderboard.collectAsState()
    val currentUserState by userViewModel.user.collectAsState()

    LaunchedEffect(selectedTab) {
        if (selectedTab == 0) quizViewModel.loadLeaderboard()
        else quizViewModel.loadMonthlyLeaderboard()
    }

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color(0xFF7B1FA2), Color(0xFF512DA8))
                        )
                    )
            ) {
                CenterAlignedTopAppBar(
                    title = {
                        Text(
                            "Leaderboard 🏆",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = onNavigateBack) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                        }
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color.Transparent
                    )
                )
                
                TabRow(
                    selectedTabIndex = selectedTab,
                    containerColor = Color.Transparent,
                    contentColor = Color.White,
                    indicator = { tabPositions ->
                        TabRowDefaults.Indicator(
                            Modifier.tabIndicatorOffset(tabPositions[selectedTab]),
                            color = Color.White
                        )
                    },
                    divider = {}
                ) {
                    tabs.forEachIndexed { index, title ->
                        Tab(
                            selected = selectedTab == index,
                            onClick = { selectedTab = index },
                            text = { 
                                Text(
                                    title, 
                                    fontWeight = if (selectedTab == index) FontWeight.Bold else FontWeight.Normal,
                                    fontSize = 14.sp
                                ) 
                            }
                        )
                    }
                }
            }
        },
        containerColor = Color(0xFFF5F5F5)
    ) { paddingValues ->
        val currentState = if (selectedTab == 0) leaderboardState.value else monthlyLeaderboardState.value

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (currentState) {
                is Resource.Loading -> {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center), color = Color(0xFF7B1FA2))
                }
                is Resource.Success -> {
                    val users = currentState.data ?: emptyList()
                    if (users.isEmpty()) {
                        EmptyLeaderboard()
                    } else {
                        LeaderboardContent(
                            users = users,
                            currentUser = currentUserState,
                            isMonthly = selectedTab == 1
                        )
                    }
                }
                is Resource.Error -> {
                    Text(
                        text = currentState.message ?: "An error occurred",
                        modifier = Modifier.align(Alignment.Center),
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        }
    }
}

@Composable
fun EmptyLeaderboard() {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.EmojiEvents,
            contentDescription = null,
            modifier = Modifier.size(80.dp),
            tint = Color.Gray.copy(alpha = 0.3f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "No rankings yet",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.Gray
        )
    }
}

@Composable
fun LeaderboardContent(users: List<User>, currentUser: User?, isMonthly: Boolean) {
    val top3 = users.take(3)
    val rest = users.drop(3)

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            PodiumSection(top3, isMonthly)
        }
        
        itemsIndexed(rest) { index, user ->
            LeaderboardItem(
                rank = index + 4,
                user = user,
                isCurrentUser = user.uid == currentUser?.uid,
                isMonthly = isMonthly
            )
        }
    }
}

@Composable
fun PodiumSection(top3: List<User>, isMonthly: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 24.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom
    ) {
        // Rank 2
        top3.getOrNull(1)?.let { user ->
            PodiumUser(user, 2, 70.dp, Color(0xFFC0C0C0), isMonthly)
        }
        
        // Rank 1
        top3.getOrNull(0)?.let { user ->
            PodiumUser(user, 1, 90.dp, Color(0xFFFFD700), isMonthly)
        }
        
        // Rank 3
        top3.getOrNull(2)?.let { user ->
            PodiumUser(user, 3, 70.dp, Color(0xFFCD7F32), isMonthly)
        }
    }
}

// PREMIUM JAGGED SHAPE (Seal style)
val JaggedBadgeShape = GenericShape { size, _ ->
    val points = 16
    val radius = size.width / 2f
    val innerRadius = radius * 0.85f
    val centerX = size.width / 2f
    val centerY = size.height / 2f
    
    for (i in 0 until points * 2) {
        val r = if (i % 2 == 0) radius else innerRadius
        val angle = Math.PI * i / points
        val x = centerX + r * Math.cos(angle).toFloat()
        val y = centerY + r * Math.sin(angle).toFloat()
        if (i == 0) moveTo(x, y) else lineTo(x, y)
    }
    close()
}

@Composable
fun RankBadge(rank: Int) {
    val (bgColor, textColor) = when (rank) {
        1 -> Color(0xFFFFD740) to Color.Black   // Premium Gold
        2 -> Color(0xFFE1F5FE) to Color.Black   // Premium Silver
        3 -> Color(0xFFFFCCBC) to Color.Black   // Premium Bronze
        else -> Color(0xFFF5F5F5) to Color.DarkGray
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(28.dp)
            // FIX: Using CircleShape for shadow instead of JaggedBadgeShape to fix ANR
            .shadow(if (rank <= 3) 4.dp else 0.dp, CircleShape)
            .clip(JaggedBadgeShape)
            .background(bgColor)
            .border(1.dp, Color.White, JaggedBadgeShape)
    ) {
        Text(
            text = rank.toString(),
            color = textColor,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 11.sp 
        )
    }
}

@Composable
fun RankMedal(rank: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.wrapContentSize()
    ) {
        Box(contentAlignment = Alignment.TopCenter) {
            // Ribbons behind for Top 3
            if (rank <= 3) {
                Row(
                    modifier = Modifier.offset(y = 20.dp)
                ) {
                    val ribbonColor = Color(0xFFC62828)
                    // Left Ribbon
                    Box(
                        modifier = Modifier
                            .width(10.dp)
                            .height(14.dp)
                            .clip(GenericShape { size, _ ->
                                moveTo(0f, 0f)
                                lineTo(size.width, 0f)
                                lineTo(size.width, size.height)
                                lineTo(0f, size.height * 0.7f)
                                close()
                            })
                            .background(ribbonColor)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    // Right Ribbon
                    Box(
                        modifier = Modifier
                            .width(10.dp)
                            .height(14.dp)
                            .clip(GenericShape { size, _ ->
                                moveTo(0f, 0f)
                                lineTo(size.width, 0f)
                                lineTo(size.width, size.height * 0.7f)
                                lineTo(0f, size.height)
                                close()
                            })
                            .background(ribbonColor)
                    )
                }
            }
            
            // Badge on Top
            RankBadge(rank)
        }
    }
}

@Composable
fun DefaultAvatar(name: String, size: androidx.compose.ui.unit.Dp) {
    val firstChar = name.firstOrNull()?.uppercase() ?: "?"

    val backgroundColor = remember(name) {
        val colors = listOf(
            Color(0xFF6A1B9A),
            Color(0xFF1E88E5),
            Color(0xFF00897B),
            Color(0xFFF4511E),
            Color(0xFF3949AB)
        )
        colors[name.hashCode().absoluteValue % colors.size]
    }

    Box(
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = firstChar,
            color = Color.White,
            fontSize = (size.value * 0.4f).sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun PodiumUser(user: User, rank: Int, size: androidx.compose.ui.unit.Dp, color: Color, isMonthly: Boolean) {
    val displayName = user.username.ifEmpty { user.email.split("@").firstOrNull() ?: "U" }
    
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(contentAlignment = Alignment.TopCenter) {
            if (rank == 1) {
                Text("👑", fontSize = 24.sp, modifier = Modifier.offset(y = (-20).dp))
            }
            
            Box(
                modifier = Modifier
                    .size(size)
                    .shadow(if (rank == 1) 8.dp else 4.dp, CircleShape)
                    .clip(CircleShape)
                    .border(3.dp, color, CircleShape)
            ) {
                if (!user.profilePictureUrl.isNullOrEmpty()) {
                    AsyncImage(
                        model = user.profilePictureUrl,
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    DefaultAvatar(name = displayName, size = size)
                }
            }
            
            // Updated positioning in PodiumUser
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .offset(y = 12.dp) // Sits perfectly at the bottom edge
            ) {
                RankMedal(rank = rank)
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(displayName, fontWeight = FontWeight.Bold, fontSize = 14.sp)
        Text("${if (isMonthly) user.monthlyXP else user.totalXP} XP", color = Color(0xFF7B1FA2), fontWeight = FontWeight.ExtraBold, fontSize = 12.sp)
    }
}

@Composable
fun LeaderboardItem(rank: Int, user: User, isCurrentUser: Boolean, isMonthly: Boolean) {
    val displayName = user.username.ifEmpty { user.email.split("@").firstOrNull() ?: "U" }
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                if (isCurrentUser) 2.dp else 0.dp,
                if (isCurrentUser) Color(0xFF7B1FA2) else Color.Transparent,
                RoundedCornerShape(16.dp)
            ),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.width(40.dp), contentAlignment = Alignment.Center) {
                RankMedal(rank = rank)
            }
            
            Spacer(modifier = Modifier.width(12.dp))
            
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
            ) {
                if (!user.profilePictureUrl.isNullOrEmpty()) {
                    AsyncImage(
                        model = user.profilePictureUrl,
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    DefaultAvatar(name = displayName, size = 44.dp)
                }
            }
            
            Spacer(modifier = Modifier.width(12.dp))
            
            Text(
                text = if (isCurrentUser) "$displayName (You)" else displayName,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            
            Text(
                text = "${if (isMonthly) user.monthlyXP else user.totalXP} XP",
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF7B1FA2)
            )
        }
    }
}
