package com.example.quizapp.presentation.screens

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import com.example.quizapp.presentation.viewmodel.AnswerState
import com.example.quizapp.presentation.viewmodel.QuizViewModel
import com.example.quizapp.presentation.viewmodel.UserViewModel
import com.example.quizapp.ui.theme.CorrectGreen
import com.example.quizapp.ui.theme.IncorrectRed
import com.example.quizapp.util.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
    categoryId: String,
    topicId: String,
    topicName: String,
    onNavigateToResult: () -> Unit,
    onNavigateBack: () -> Unit,
    quizViewModel: QuizViewModel = hiltViewModel(),
    userViewModel: UserViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val questions by quizViewModel.questions.collectAsStateWithLifecycle()
    val isLoading by quizViewModel.isLoading.collectAsStateWithLifecycle()
    val error by quizViewModel.error.collectAsStateWithLifecycle()
    
    val currentIndex by quizViewModel.currentQuestionIndex.collectAsStateWithLifecycle()
    val selectedAnswers by quizViewModel.selectedAnswers.collectAsStateWithLifecycle()
    val answerStates by quizViewModel.answerState.collectAsStateWithLifecycle()
    val timeRemaining by quizViewModel.timeRemaining.collectAsStateWithLifecycle()
    val quizResult by quizViewModel.quizResult.collectAsStateWithLifecycle()
    val isBookmarked by quizViewModel.isBookmarked.collectAsStateWithLifecycle()
    val showResumeDialog by quizViewModel.showResumeDialog.collectAsStateWithLifecycle()
    val resumeMessage by quizViewModel.resumeMessage.collectAsStateWithLifecycle()
    
    val selectedAnswer by quizViewModel.selectedAnswer.collectAsStateWithLifecycle()
    val showResult by quizViewModel.showResult.collectAsStateWithLifecycle()
    val isTimeUp by quizViewModel.isTimeUp.collectAsStateWithLifecycle()
    val showTimeUpDialog by quizViewModel.showTimeUpDialog.collectAsStateWithLifecycle()

    val coins by userViewModel.coins.collectAsStateWithLifecycle()
    val isHintVisible by quizViewModel.isHintVisible.collectAsStateWithLifecycle()
    val removedOptions by quizViewModel.removedOptions.collectAsStateWithLifecycle()

    var showExitDialog by remember { mutableStateOf(false) }
    var showSubmitDialog by remember { mutableStateOf(false) }

    LaunchedEffect(categoryId, topicId, topicName) {
        quizViewModel.loadQuestions(categoryId, topicId, topicName)
    }

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_PAUSE -> quizViewModel.pauseTimer()
                Lifecycle.Event.ON_RESUME -> quizViewModel.resumeTimer()
                else -> {}
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
    }

    LaunchedEffect(quizResult) {
        when (val result = quizResult) {
            is Resource.Success -> {
                onNavigateToResult()
            }
            is Resource.Error -> {
                val errorMessage = result.message ?: "An unknown error occurred."
                Toast.makeText(context, errorMessage, Toast.LENGTH_LONG).show()
            }
            else -> { /* Loading or null */ }
        }
    }

    BackHandler {
        showExitDialog = true
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(text = topicName, fontWeight = FontWeight.Bold)
                        if (questions.isNotEmpty()) {
                            Text(
                                text = "Question ${currentIndex + 1}/${questions.size}",
                                fontSize = 12.sp,
                                color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.8f)
                            )
                        }
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { showExitDialog = true }) {
                        Icon(Icons.Default.ArrowBack, "Back")
                    }
                },
                actions = {
                    Surface(
                        modifier = Modifier.padding(end = 8.dp),
                        shape = RoundedCornerShape(20.dp),
                        color = Color.Black.copy(alpha = 0.2f)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.MonetizationOn,
                                contentDescription = null,
                                tint = Color(0xFFFFD700),
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = coins.toString(),
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp
                            )
                        }
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
        Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            if (isLoading) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CircularProgressIndicator()
                        Spacer(Modifier.height(16.dp))
                        Text("Loading questions...")
                    }
                }
            } else if (error != null) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(24.dp)) {
                        Icon(Icons.Default.Error, null, Modifier.size(64.dp), tint = MaterialTheme.colorScheme.error)
                        Spacer(Modifier.height(16.dp))
                        Text(
                            text = error ?: "An error occurred",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.error,
                            textAlign = TextAlign.Center
                        )
                        Spacer(Modifier.height(24.dp))
                        Button(onClick = { quizViewModel.loadQuestions(categoryId, topicId, topicName) }) {
                            Text("Retry")
                        }
                    }
                }
            } else if (questions.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("No questions available for this category.")
                }
            } else {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Answered ${selectedAnswers.size} / ${questions.size}",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Medium
                        )
                        
                        // 🔥 Circular Timer UI
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.size(40.dp)) {
                            CircularProgressIndicator(
                                progress = timeRemaining / 30f,
                                modifier = Modifier.fillMaxSize(),
                                strokeWidth = 4.dp,
                                color = if (timeRemaining < 10) Color.Red else MaterialTheme.colorScheme.primary,
                                trackColor = MaterialTheme.colorScheme.surfaceVariant
                            )
                            Text(
                                text = timeRemaining.toString(),
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold,
                                color = if (timeRemaining < 10) Color.Red else MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                    
                    Spacer(Modifier.height(8.dp))
                    
                    LinearProgressIndicator(
                        progress = (currentIndex + 1).toFloat() / questions.size,
                        modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp))
                    )
                    
                    Spacer(Modifier.height(16.dp))
                    PowerUpsBar(
                        coins = coins,
                        onHint = {
                            if (!quizViewModel.useHint()) {
                                Toast.makeText(context, "Not enough coins!", Toast.LENGTH_SHORT).show()
                            }
                        },
                        onSkip = {
                            if (!quizViewModel.skipQuestionPowerUp()) {
                                Toast.makeText(context, "Not enough coins!", Toast.LENGTH_SHORT).show()
                            }
                        },
                        onRemoveOptions = {
                            quizViewModel.removeTwoOptionsPowerUp()
                        }
                    )
                    
                    Spacer(Modifier.height(16.dp))

                    val currentQuestion = questions.getOrNull(currentIndex)

                    if (currentQuestion != null) {
                        QuestionCard(
                            question = currentQuestion,
                            questionNumber = currentIndex + 1,
                            selectedAnswer = selectedAnswer,
                            showResult = showResult,
                            isTimeUp = isTimeUp,
                            answerState = answerStates[currentQuestion.id] ?: AnswerState.UNANSWERED,
                            isBookmarked = isBookmarked,
                            isHintVisible = isHintVisible,
                            removedOptions = removedOptions,
                            onAnswerSelected = { answer ->
                                quizViewModel.onAnswerSelected(answer)
                            },
                            onBookmarkToggle = {
                                quizViewModel.toggleBookmark(currentQuestion)
                            }
                        )
                    }

                    Spacer(Modifier.height(24.dp))

                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        OutlinedButton(
                            onClick = { quizViewModel.previousQuestion() },
                            enabled = currentIndex > 0,
                            modifier = Modifier.weight(1f)
                        ) {
                            Icon(Icons.Default.ArrowBack, null, Modifier.size(20.dp))
                            Spacer(Modifier.width(8.dp))
                            Text("Previous")
                        }
                        Spacer(Modifier.width(16.dp))
                        
                        val isLastQuestion = currentIndex == questions.size - 1
                        
                        Button(
                            onClick = {
                                if (!isLastQuestion) {
                                    quizViewModel.nextQuestion()
                                } else {
                                    showSubmitDialog = true
                                }
                            },
                            enabled = true, // ✅ PRO LEVEL: Always allow next/submit
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(if (isLastQuestion) "Submit" else "Next")
                            Spacer(Modifier.width(8.dp))
                            Icon(
                                if (isLastQuestion) Icons.Default.Check else Icons.Default.ArrowForward,
                                null,
                                Modifier.size(20.dp)
                            )
                        }
                    }
                    Spacer(Modifier.height(16.dp))
                    QuestionNavigator(
                        questions = questions,
                        currentIndex = currentIndex,
                        answeredQuestionIds = selectedAnswers.keys,
                        onQuestionClick = { index -> 
                             quizViewModel.goToQuestion(index) 
                        }
                    )
                }
            }

            if (showTimeUpDialog) {
                TimeUpFeedback(
                    explanation = questions.getOrNull(currentIndex)?.explanation ?: "",
                    onNext = { quizViewModel.goToNextAfterTimeUp() }
                )
            }
        }
    }

    if (showResumeDialog) {
        AlertDialog(
            onDismissRequest = { },
            title = { Text("Resume Quiz?") },
            text = { Text(resumeMessage) },
            confirmButton = {
                Button(onClick = { quizViewModel.resumeQuiz() }) { Text("Resume") }
            },
            dismissButton = {
                OutlinedButton(onClick = { quizViewModel.restartQuiz() }) { Text("Restart") }
            }
        )
    }

    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog = false },
            title = { Text("Exit Quiz?") },
            text = { Text("Your progress will be saved automatically. You can resume later.") },
            confirmButton = {
                TextButton(onClick = {
                    showExitDialog = false
                    onNavigateBack()
                }) { Text("Exit") }
            },
            dismissButton = { TextButton(onClick = { showExitDialog = false }) { Text("Continue") } }
        )
    }

    if (showSubmitDialog) {
        AlertDialog(
            onDismissRequest = { showSubmitDialog = false },
            title = { Text("Submit Quiz?") },
            text = { Text("Are you sure you want to submit the quiz?") },
            confirmButton = {
                TextButton(onClick = {
                    showSubmitDialog = false
                    quizViewModel.submitQuiz()
                }) { Text("Yes") }
            },
            dismissButton = { TextButton(onClick = { showSubmitDialog = false }) { Text("No") } }
        )
    }
}

@Composable
fun TimeUpFeedback(explanation: String, onNext: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.6f)),
        contentAlignment = Alignment.Center
    ) {
        val scale = remember { Animatable(0.5f) }
        val offsetX = remember { Animatable(0f) }

        LaunchedEffect(Unit) {
            launch {
                scale.animateTo(
                    targetValue = 1f,
                    animationSpec = tween(500, easing = FastOutSlowInEasing)
                )
            }
            launch {
                delay(200)
                offsetX.animateTo(
                    targetValue = 10f,
                    animationSpec = repeatable(
                        iterations = 3,
                        animation = tween(50),
                        repeatMode = RepeatMode.Reverse
                    )
                )
                offsetX.snapTo(0f)
            }
        }

        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .offset(x = offsetX.value.dp)
                .scale(scale.value)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(24.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.TimerOff,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier.size(64.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Time’s Up!",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                if (explanation.isNotBlank()) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "The answer was:",
                        fontSize = 14.sp,
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = explanation,
                        fontSize = 16.sp,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Center,
                        lineHeight = 22.sp,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                } else {
                    Text(
                        text = "You missed this question",
                        fontSize = 16.sp,
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = onNext,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Next Question")
                }
            }
        }
    }
}

@Composable
fun PowerUpsBar(
    coins: Int,
    onHint: () -> Unit,
    onSkip: () -> Unit,
    onRemoveOptions: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        PowerUpButton(
            icon = Icons.Default.Lightbulb,
            label = "Hint",
            cost = 10,
            onClick = onHint
        )
        PowerUpButton(
            icon = Icons.Default.SkipNext,
            label = "Skip",
            cost = 15,
            onClick = onSkip
        )
        PowerUpButton(
            icon = Icons.Default.RemoveCircleOutline,
            label = "50:50",
            cost = 10,
            onClick = onRemoveOptions
        )
    }
}

@Composable
fun PowerUpButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    cost: Int,
    onClick: () -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(50.dp)
                .background(MaterialTheme.colorScheme.secondaryContainer, CircleShape)
        ) {
            Icon(icon, contentDescription = label, tint = MaterialTheme.colorScheme.onSecondaryContainer)
        }
        Text(text = label, fontSize = 10.sp, fontWeight = FontWeight.Bold)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.MonetizationOn, null, Modifier.size(10.dp), tint = Color(0xFFFFD700))
            Text(text = cost.toString(), fontSize = 10.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun QuestionCard(
    question: Question,
    questionNumber: Int,
    selectedAnswer: String?,
    showResult: Boolean,
    isTimeUp: Boolean,
    answerState: AnswerState,
    isBookmarked: Boolean,
    isHintVisible: Boolean,
    removedOptions: Set<String>,
    onAnswerSelected: (String) -> Unit,
    onBookmarkToggle: () -> Unit
) {
    val isAnswered = answerState != AnswerState.UNANSWERED || isTimeUp

    Card(
        elevation = CardDefaults.cardElevation(4.dp), 
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(20.dp)) {
                Surface(color = MaterialTheme.colorScheme.primaryContainer, shape = RoundedCornerShape(8.dp)) {
                    Text(
                        text = question.questionType.name.replace("_", " "),
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }
                Spacer(Modifier.height(16.dp))
                Text("Q$questionNumber. ${question.questionText}", fontSize = 18.sp, fontWeight = FontWeight.SemiBold, lineHeight = 26.sp)
                
                if (isHintVisible && question.explanation.isNotBlank()) {
                    Spacer(Modifier.height(8.dp))
                    Surface(
                        color = Color(0xFFFFF9C4),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Lightbulb, null, Modifier.size(16.dp), tint = Color(0xFFFBC02D))
                            Spacer(Modifier.width(8.dp))
                            Text(text = "Hint: ${question.explanation}", fontSize = 12.sp, color = Color.Black)
                        }
                    }
                }

                Spacer(Modifier.height(20.dp))

                val options = when (question.questionType) {
                    QuestionType.MULTIPLE_CHOICE -> question.options
                    QuestionType.TRUE_FALSE -> listOf("True", "False")
                    else -> emptyList()
                }

                if (question.questionType != QuestionType.SHORT_ANSWER) {
                    options.forEachIndexed { index, option ->
                        if (!removedOptions.contains(option)) {
                            val isCorrectOption = option.equals(question.correctAnswer, ignoreCase = true)
                            val optionLabel = ('A' + index).toString()
                            AnswerOption(
                                text = option,
                                optionLabel = optionLabel,
                                isSelected = selectedAnswer == option,
                                isCorrect = isCorrectOption,
                                isAnswered = isAnswered,
                                showResult = showResult,
                                onClick = { if (!isAnswered && !showResult) onAnswerSelected(option) }
                            )
                            Spacer(Modifier.height(12.dp))
                        }
                    }
                } else {
                    OutlinedTextField(
                        value = selectedAnswer ?: "",
                        onValueChange = onAnswerSelected,
                        label = { Text("Your Answer") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        readOnly = isAnswered || showResult
                    )
                }

                AnimatedVisibility(visible = isAnswered && question.explanation.isNotBlank()) {
                    ExplanationBox(
                        answerState = answerState,
                        explanation = question.explanation,
                        isTimeUp = isTimeUp
                    )
                }
            }

            IconButton(
                onClick = onBookmarkToggle,
                modifier = Modifier.align(Alignment.TopEnd).padding(8.dp)
            ) {
                Icon(
                    imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                    contentDescription = "Bookmark",
                    tint = if (isBookmarked) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnswerOption(
    text: String,
    optionLabel: String,
    isSelected: Boolean,
    isCorrect: Boolean,
    isAnswered: Boolean,
    showResult: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor by animateColorAsState(
        targetValue = when {
            showResult && isCorrect -> CorrectGreen.copy(alpha = 0.2f)
            showResult && isSelected && !isCorrect -> IncorrectRed.copy(alpha = 0.2f)
            isSelected && !showResult -> MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
            else -> Color.Transparent
        },
        animationSpec = tween(400)
    )

    val borderColor by animateColorAsState(
        targetValue = when {
            showResult && isCorrect -> CorrectGreen
            showResult && isSelected && !isCorrect -> IncorrectRed
            isSelected && !showResult -> MaterialTheme.colorScheme.primary
            else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
        },
        animationSpec = tween(400)
    )

    val scale by animateFloatAsState(
        targetValue = if (isSelected) 1.03f else 1f,
        animationSpec = tween(200)
    )

    val borderWidth = if (isSelected || (showResult && isCorrect)) 2.dp else 1.dp

    val labelBackgroundColor by animateColorAsState(
        targetValue = when {
            showResult && isCorrect -> CorrectGreen
            showResult && isSelected && !isCorrect -> IncorrectRed
            isSelected && !showResult -> MaterialTheme.colorScheme.primary
            else -> MaterialTheme.colorScheme.surfaceVariant
        },
        animationSpec = tween(400)
    )

    OutlinedCard(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth().scale(scale),
        colors = CardDefaults.outlinedCardColors(containerColor = backgroundColor),
        border = BorderStroke(borderWidth, borderColor),
        shape = RoundedCornerShape(12.dp),
        enabled = !showResult
    ) {
        Row(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = labelBackgroundColor,
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(
                    text = optionLabel,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (labelBackgroundColor == MaterialTheme.colorScheme.surfaceVariant) MaterialTheme.colorScheme.onSurfaceVariant else Color.White
                )
            }
            Spacer(Modifier.width(16.dp))
            Text(
                text = text,
                fontSize = 16.sp,
                modifier = Modifier.weight(1f),
                fontWeight = if (isSelected || (showResult && isCorrect)) FontWeight.Medium else FontWeight.Normal,
                color = MaterialTheme.colorScheme.onSurface
            )

            if (showResult) {
                if (isCorrect) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = null,
                        tint = CorrectGreen,
                        modifier = Modifier.size(24.dp)
                    )
                } else if (isSelected) {
                    Icon(
                        imageVector = Icons.Default.Cancel,
                        contentDescription = null,
                        tint = IncorrectRed,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ExplanationBox(answerState: AnswerState, explanation: String, isTimeUp: Boolean = false) {
    val color = when {
        answerState == AnswerState.CORRECT -> CorrectGreen
        answerState == AnswerState.SKIPPED || isTimeUp -> MaterialTheme.colorScheme.primary
        else -> IncorrectRed
    }
    val label = when {
        answerState == AnswerState.CORRECT -> "Correct!"
        answerState == AnswerState.SKIPPED || isTimeUp -> "Explanation"
        else -> "Incorrect"
    }
    val icon = when {
        answerState == AnswerState.CORRECT -> Icons.Default.CheckCircle
        answerState == AnswerState.SKIPPED || isTimeUp -> Icons.Default.Info
        else -> Icons.Default.Cancel
    }

    OutlinedCard(
        modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
        border = BorderStroke(2.dp, color),
        colors = CardDefaults.outlinedCardColors(containerColor = color.copy(alpha = 0.1f)),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = color,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = label,
                    fontWeight = FontWeight.Bold,
                    color = color,
                    fontSize = 16.sp
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = explanation,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionNavigator(
    questions: List<Question>,
    currentIndex: Int,
    answeredQuestionIds: Set<String>,
    onQuestionClick: (Int) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        questions.forEachIndexed { index, question ->
            val isAnswered = answeredQuestionIds.contains(question.id)
            val isSelected = index == currentIndex

            val color = when {
                isSelected -> MaterialTheme.colorScheme.primary
                isAnswered -> CorrectGreen.copy(alpha = 0.7f)
                else -> MaterialTheme.colorScheme.surfaceVariant
            }

            val textColor = if (isSelected || isAnswered) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant

            Surface(
                onClick = { onQuestionClick(index) },
                color = color,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.size(40.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(text = (index + 1).toString(), color = textColor, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
