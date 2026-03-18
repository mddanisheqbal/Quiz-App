package com.example.quizapp.presentation.screens

import android.content.Intent
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import coil.compose.AsyncImage
import com.example.quizapp.presentation.navigation.Screen
import com.example.quizapp.presentation.viewmodel.AuthViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainDrawerScreen(
    navController: NavHostController,
    authViewModel: AuthViewModel = hiltViewModel(),
    userViewModel: UserViewModel = hiltViewModel(),
    content: @Composable () -> Unit
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    
    val userState by userViewModel.user.collectAsState()

    // 1. CLOSE DRAWER WHEN BACK IS PRESSED
    BackHandler(enabled = drawerState.isOpen) {
        scope.launch { drawerState.close() }
    }

    // FEATURE 1 — REMOVE LOGOUT FROM DRAWER
    val menuItems = listOf(
        DrawerMenuItem("Home", Screen.Home.route, Icons.Default.Home),
        DrawerMenuItem("Achievements", Screen.Achievements.route, Icons.Default.EmojiEvents),
        DrawerMenuItem("Bookmark", Screen.Bookmark.route, Icons.Default.Bookmark),
        DrawerMenuItem("About Us", Screen.AboutUs.route, Icons.Default.Info),
        DrawerMenuItem("Share", "share_action", Icons.Default.Share)
    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.fillMaxWidth(0.75f)
            ) {
                Spacer(modifier = Modifier.height(24.dp))
                
                // FEATURE 2 — MAKE HEADER CLICKABLE (OPEN PROFILE)
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth()
                        .clickable {
                            scope.launch { drawerState.close() }
                            navController.navigate(Screen.Profile.route)
                        }
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // FEATURE 1 — SHOW PROFILE IMAGE IN DRAWER HEADER
                        Box(
                            modifier = Modifier
                                .size(60.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.primaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            if (userState?.profilePictureUrl != null) {
                                AsyncImage(
                                    model = userState?.profilePictureUrl,
                                    contentDescription = "Profile",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            } else {
                                Icon(
                                    imageVector = Icons.Default.Person,
                                    contentDescription = "Default Avatar",
                                    modifier = Modifier.size(35.dp),
                                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                            }
                        }
                        // FEATURE 6 — UI POLISH
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = userState?.username ?: "Explorer",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            // FEATURE 4 — KEEP VIEW PROFILE TEXT
                            Text(
                                text = "View Profile",
                                fontSize = 12.sp,
                                color = Color.Blue
                            )
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                Divider(modifier = Modifier.padding(horizontal = 16.dp))
                Spacer(modifier = Modifier.height(8.dp))
                
                menuItems.forEach { item ->
                    val isSelected = currentRoute == item.route
                    NavigationDrawerItem(
                        label = { Text(text = item.title) },
                        selected = isSelected,
                        onClick = {
                            scope.launch { drawerState.close() }
                            when (item.route) {
                                "share_action" -> {
                                    val sendIntent: Intent = Intent().apply {
                                        action = Intent.ACTION_SEND
                                        putExtra(Intent.EXTRA_TEXT, "Check out this programming quiz app!")
                                        type = "text/plain"
                                    }
                                    val shareIntent = Intent.createChooser(sendIntent, null)
                                    context.startActivity(shareIntent)
                                }
                                else -> {
                                    if (currentRoute != item.route) {
                                        navController.navigate(item.route) {
                                            popUpTo(Screen.Home.route) {
                                                if (item.route == Screen.Home.route) {
                                                    inclusive = true
                                                }
                                            }
                                            launchSingleTop = true
                                        }
                                    }
                                }
                            }
                        },
                        icon = { Icon(item.icon, contentDescription = null) },
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = Color(0xFF2B3F6C),
                            selectedIconColor = Color.White,
                            selectedTextColor = Color.White,
                            unselectedContainerColor = Color.Transparent,
                            unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                            unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                        ),
                        shape = RoundedCornerShape(50.dp),
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        gesturesEnabled = currentRoute == Screen.Home.route || 
                         currentRoute == Screen.Bookmark.route || 
                         currentRoute == Screen.AboutUs.route ||
                         currentRoute == Screen.Achievements.route
    ) {
        CompositionLocalProvider(LocalDrawerState provides drawerState) {
            content()
        }
    }
}

val LocalDrawerState = compositionLocalOf<DrawerState> { error("No DrawerState provided") }

data class DrawerMenuItem(
    val title: String,
    val route: String,
    val icon: ImageVector
)
