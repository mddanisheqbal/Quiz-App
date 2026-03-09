package com.example.quizapp.presentation.screens

import android.content.Intent
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.quizapp.presentation.navigation.Screen
import com.example.quizapp.presentation.viewmodel.AuthViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainDrawerScreen(
    navController: NavHostController,
    authViewModel: AuthViewModel = hiltViewModel(),
    content: @Composable () -> Unit
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    var showLogoutDialog by remember { mutableStateOf(false) }

    // 1. CLOSE DRAWER WHEN BACK IS PRESSED
    // If the drawer is open, the back button will close it instead of navigating.
    BackHandler(enabled = drawerState.isOpen) {
        scope.launch { drawerState.close() }
    }

    val menuItems = listOf(
        DrawerMenuItem("Home", Screen.Home.route, Icons.Default.Home),
        DrawerMenuItem("Bookmark", Screen.Bookmark.route, Icons.Default.Bookmark),
        DrawerMenuItem("About Us", Screen.AboutUs.route, Icons.Default.Info),
        DrawerMenuItem("Share", "share_action", Icons.Default.Share),
        DrawerMenuItem("Logout", "logout_action", Icons.Default.Logout)
    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Quiz Master",
                    modifier = Modifier.padding(16.dp),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Divider(modifier = Modifier.padding(vertical = 8.dp))
                
                menuItems.forEach { item ->
                    NavigationDrawerItem(
                        label = { Text(text = item.title) },
                        // 2. HIGHLIGHT CURRENT DRAWER ITEM
                        selected = currentRoute == item.route,
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
                                "logout_action" -> {
                                    showLogoutDialog = true
                                }
                                else -> {
                                    if (currentRoute != item.route) {
                                        // 3. PREVENT MULTIPLE STACKED DESTINATIONS
                                        navController.navigate(item.route) {
                                            // Pop up to the home destination of the graph to
                                            // avoid building up a large stack of destinations
                                            // on the back stack as users select items
                                            popUpTo(Screen.Home.route) {
                                                if (item.route == Screen.Home.route) {
                                                    inclusive = true
                                                }
                                            }
                                            // Avoid multiple copies of the same destination when
                                            // reselecting the same item
                                            launchSingleTop = true
                                        }
                                    }
                                }
                            }
                        },
                        icon = { Icon(item.icon, contentDescription = null) },
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        gesturesEnabled = currentRoute == Screen.Home.route || 
                         currentRoute == Screen.Bookmark.route || 
                         currentRoute == Screen.AboutUs.route
    ) {
        CompositionLocalProvider(LocalDrawerState provides drawerState) {
            content()
        }
    }

    if (showLogoutDialog) {
        AlertDialog(
            onDismissRequest = { showLogoutDialog = false },
            title = { Text("Logout") },
            text = { Text("Are you sure you want to logout?") },
            confirmButton = {
                TextButton(
                    onClick = {
                        showLogoutDialog = false
                        authViewModel.signOut()
                        navController.navigate(Screen.Login.route) {
                            popUpTo("main_flow") { inclusive = true }
                        }
                    }
                ) {
                    Text("Logout")
                }
            },
            dismissButton = {
                TextButton(onClick = { showLogoutDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

val LocalDrawerState = compositionLocalOf<DrawerState> { error("No DrawerState provided") }

data class DrawerMenuItem(
    val title: String,
    val route: String,
    val icon: ImageVector
)
