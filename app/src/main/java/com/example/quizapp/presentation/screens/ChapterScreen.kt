package com.example.quizapp.presentation.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.model.Topic
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.util.Resource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChapterScreen(
    categoryId: String,
    categoryName: String,
    categoryColorString: String,
    onNavigateToQuiz: (String, String, String) -> Unit,
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel()
) {
    val topicsState by quizViewModel.topics.collectAsState()
    val topicProgress by quizViewModel.topicProgress.collectAsState()
    var searchQuery by remember { mutableStateOf("") }
    val context = LocalContext.current

    // Use default rememberLazyListState() to ensure it resets to top on back
    val listState = rememberLazyListState()

    LaunchedEffect(categoryId) {
        quizViewModel.loadTopics(categoryId)
    }

    val defaultColor = MaterialTheme.colorScheme.primary
    val categoryColor = remember(categoryColorString) {
        try {
            val hex = if (categoryColorString.startsWith("#")) categoryColorString else "#$categoryColorString"
            Color(android.graphics.Color.parseColor(hex))
        } catch (e: Exception) {
            defaultColor
        }
    }

    val contentColor = remember(categoryColor) {
        val argb = categoryColor.toArgb()
        val luminance = 0.2126 * android.graphics.Color.red(argb) + 
                        0.7152 * android.graphics.Color.green(argb) + 
                        0.0722 * android.graphics.Color.blue(argb)
        if (luminance < 128) Color.White else Color.Black
    }

    Scaffold(
        topBar = {
            Column {
                TopAppBar(
                    title = { Text("$categoryName Chapters", fontWeight = FontWeight.Bold) },
                    navigationIcon = {
                        IconButton(onClick = onNavigateBack) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = categoryColor,
                        titleContentColor = contentColor,
                        navigationIconContentColor = contentColor
                    )
                )
                
                // Redesigned Search Bar for visibility in both modes
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(categoryColor)
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    ChapterSearchBar(
                        query = searchQuery,
                        onQueryChange = { searchQuery = it }
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(MaterialTheme.colorScheme.background)
        ) {
            when (topicsState) {
                is Resource.Loading -> {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center), color = categoryColor)
                }
                is Resource.Success -> {
                    val topics = (topicsState as Resource.Success).data ?: emptyList()
                    val filteredTopics = topics.filter { 
                        it.name.contains(searchQuery, ignoreCase = true) 
                    }

                    if (filteredTopics.isEmpty()) {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.MenuBook,
                                    contentDescription = null,
                                    modifier = Modifier.size(64.dp),
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.3f)
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = if (searchQuery.isEmpty()) "No chapters available." else "No matches found.",
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    } else {
                        LazyColumn(
                            state = listState,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            itemsIndexed(filteredTopics) { index, topic ->
                                val stars = topicProgress[topic.id] ?: 0
                                
                                val previousTopicId = topics.getOrNull(index - 1)?.id
                                val previousStars = if (previousTopicId != null) topicProgress[previousTopicId] ?: 0 else 0
                                val isUnlocked = index == 0 || previousStars >= 2
                                
                                ChapterRow(
                                    number = index + 1,
                                    topic = topic,
                                    categoryColor = categoryColor,
                                    stars = stars,
                                    isUnlocked = isUnlocked,
                                    onClick = {
                                        if (isUnlocked) {
                                            onNavigateToQuiz(categoryId, topic.id, topic.name)
                                        } else {
                                            Toast.makeText(context, "Get at least 2 stars in the previous chapter to unlock!", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                )
                                Divider(
                                    modifier = Modifier.padding(horizontal = 16.dp),
                                    thickness = 0.5.dp,
                                    color = MaterialTheme.colorScheme.outlineVariant
                                )
                            }
                        }
                    }
                }
                is Resource.Error -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            text = (topicsState as Resource.Error).message ?: "Error loading chapters",
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ChapterSearchBar(query: String, onQueryChange: (String) -> Unit) {
    TextField(
        value = query,
        onValueChange = onQueryChange,
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp),
        placeholder = { 
            Text(
                "Search chapters...", 
                color = MaterialTheme.colorScheme.onSurfaceVariant
            ) 
        },
        leadingIcon = { 
            Icon(
                Icons.Default.Search, 
                contentDescription = null, 
                tint = MaterialTheme.colorScheme.onSurfaceVariant 
            ) 
        },
        trailingIcon = {
            if (query.isNotEmpty()) {
                IconButton(onClick = { onQueryChange("") }) {
                    Icon(
                        Icons.Default.Clear, 
                        contentDescription = "Clear", 
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            disabledContainerColor = MaterialTheme.colorScheme.surface,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedTextColor = MaterialTheme.colorScheme.onSurface,
            unfocusedTextColor = MaterialTheme.colorScheme.onSurface,
            cursorColor = MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(12.dp),
        singleLine = true
    )
}

@Composable
fun ChapterRow(
    number: Int,
    topic: Topic,
    categoryColor: Color,
    stars: Int,
    isUnlocked: Boolean,
    onClick: () -> Unit
) {
    val isCompleted = stars > 0

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 16.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Surface(
            modifier = Modifier.size(32.dp),
            shape = CircleShape,
            color = if (isCompleted) Color(0xFF4CAF50).copy(alpha = 0.1f) 
                    else if (isUnlocked) categoryColor.copy(alpha = 0.1f)
                    else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f)
        ) {
            Box(contentAlignment = Alignment.Center) {
                if (!isUnlocked) {
                    Icon(
                        Icons.Default.Lock, 
                        contentDescription = "Locked", 
                        tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f), 
                        modifier = Modifier.size(16.dp)
                    )
                } else if (isCompleted) {
                    Icon(
                        Icons.Default.Check, 
                        contentDescription = "Completed", 
                        tint = Color(0xFF4CAF50), 
                        modifier = Modifier.size(20.dp)
                    )
                } else {
                    Text(
                        text = number.toString(),
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = categoryColor
                    )
                }
            }
        }
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = topic.name,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
                color = if (isUnlocked) MaterialTheme.colorScheme.onSurface 
                        else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
            )
            
            if (!isUnlocked) {
                Text(
                    text = "Locked",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                )
            } else {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    repeat(3) { index ->
                        Icon(
                            imageVector = if (index < stars) Icons.Default.Star else Icons.Default.StarBorder,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp),
                            tint = if (index < stars) Color(0xFFFFC107) else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f)
                        )
                    }
                    
                    Spacer(modifier = Modifier.width(8.dp))
                    
                    Text(
                        text = if (isCompleted) "Completed" else "${topic.questionCount} Questions",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
        
        if (isUnlocked) {
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
            )
        }
    }
}
