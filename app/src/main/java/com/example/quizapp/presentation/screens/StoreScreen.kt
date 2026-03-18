package com.example.quizapp.presentation.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.Stars
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.presentation.viewmodel.StoreViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoreScreen(
    userViewModel: UserViewModel,
    storeViewModel: StoreViewModel = hiltViewModel(),
    onBackClick: () -> Unit
) {
    val userState by userViewModel.user.collectAsState()

    val coinPacks = listOf(
        CoinPack("100 Coins", "₹49", 100, badge = "+50%"),
        CoinPack("200 Coins", "₹99", 200, badge = "+60%"),
        CoinPack("500 Coins", "₹249", 500, badge = "+70%"),
        CoinPack("1200 Coins", "₹499", 1200, isBestValue = true, badge = "Best Value"),
        CoinPack("2500 Coins", "₹999", 2500, badge = "+110%"),
        CoinPack("6000 Coins", "₹1999", 6000, badge = "+10%")
    )

    val removeAdsPacks = listOf(
        RemoveAdsPack("30 Days", "₹990", Color(0xFF2196F3), Color(0xFF1976D2)),
        RemoveAdsPack("365 Days", "₹1999", Color(0xFFE91E63), Color(0xFFC2185B)),
        RemoveAdsPack("Forever", "₹3499", Color(0xFFFFD700), Color(0xFFFFA000))
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Coin Store",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Transparent
                ),
                actions = {
                    Surface(
                        color = Color.White.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(20.dp),
                        modifier = Modifier.padding(end = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Default.Stars, null, tint = Color(0xFFFFD700), modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Your Coins: ${userState?.coins ?: 0}",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            )
        },
        containerColor = Color.Transparent
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color(0xFF7B1FA2), Color(0xFF311B92))
                    )
                )
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // PURCHASE COINS SECTION
                item(span = { GridItemSpan(2) }) {
                    Text(
                        text = "Purchase Coins",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }

                items(coinPacks) { pack ->
                    CoinPackCard(pack = pack) {
                        // Action: storeViewModel.purchaseCoins(...) 
                    }
                }

                // REMOVE ADS SECTION
                item(span = { GridItemSpan(2) }) {
                    Text(
                        text = "Remove Ads",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White,
                        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
                    )
                }

                items(removeAdsPacks, span = { GridItemSpan(2) }) { pack ->
                    RemoveAdsCard(pack = pack) {
                        // Action: storeViewModel.buyPowerUp(...)
                    }
                }

                item(span = { GridItemSpan(2) }) {
                    Spacer(modifier = Modifier.height(32.dp))
                }
            }
        }
    }
}

data class CoinPack(
    val title: String,
    val price: String,
    val amount: Int,
    val isBestValue: Boolean = false,
    val badge: String? = null
)

data class RemoveAdsPack(
    val duration: String,
    val price: String,
    val startColor: Color,
    val endColor: Color
)

@Composable
fun CoinPackCard(pack: CoinPack, onBuyClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(if (isPressed) 0.95f else 1f, label = "scale")

    Box(
        modifier = Modifier
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onBuyClick
            )
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(if (pack.isBestValue) 160.dp else 145.dp)
                .then(
                    if (pack.isBestValue) Modifier.border(2.dp, Color(0xFFFFC107), RoundedCornerShape(20.dp))
                    else Modifier
                ),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(if (pack.isBestValue) 12.dp else 6.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = if (pack.isBestValue) 
                                listOf(Color(0xFF8E24AA), Color(0xFF4A148C)) 
                            else 
                                listOf(Color(0xFF6A1B9A), Color(0xFF4A148C))
                        )
                    )
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Gold Coin Icon
                Box(
                    modifier = Modifier
                        .size(if (pack.isBestValue) 52.dp else 44.dp)
                        .background(Color.White.copy(alpha = 0.15f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Stars,
                        contentDescription = null,
                        tint = Color(0xFFFFC107),
                        modifier = Modifier.size(if (pack.isBestValue) 34.dp else 28.dp)
                    )
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = pack.title,
                        color = Color.White,
                        fontSize = if (pack.isBestValue) 20.sp else 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = pack.price,
                        color = Color.White.copy(alpha = 0.9f),
                        fontSize = if (pack.isBestValue) 16.sp else 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }

                Surface(
                    color = Color(0xFFFFC107),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "BUY",
                        modifier = Modifier.padding(vertical = 4.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black,
                        fontSize = 13.sp
                    )
                }
            }
        }

        if (pack.badge != null) {
            Surface(
                color = Color.Red,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 4.dp, y = (-4).dp)
                    .rotate(15f)
                    .border(1.5.dp, Color.White, RoundedCornerShape(8.dp))
            ) {
                Text(
                    text = pack.badge,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun RemoveAdsCard(pack: RemoveAdsPack, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(if (isPressed) 0.98f else 1f, label = "scale")

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            ),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(pack.startColor, pack.endColor)
                    )
                )
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(54.dp)
                        .background(Color.White.copy(alpha = 0.2f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Block,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Remove Ads",
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = pack.duration,
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            
            Surface(
                color = Color.White.copy(alpha = 0.25f),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = pack.price,
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }
}
