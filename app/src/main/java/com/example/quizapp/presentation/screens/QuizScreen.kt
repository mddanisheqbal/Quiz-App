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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
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
    val haptic = LocalHapticFeedback.current
    
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

    // 🔥 Ultra Premium: Background Blur logic
    val shouldBlur = showTimeUpDialog || showExitDialog || showSubmitDialog || showResumeDialog

    LaunchedEffect(categoryId, topicId, topicName) {
        quizViewModel.loadQuestions(categoryId, topicId, topicName)
    }

    // 🔥 Added: Observe bookmark toast messages
    LaunchedEffect(Unit) {
        quizViewModel.toastMessage.collect { message ->
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
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
        // 🔥 Ultra Premium: Blur effect on content
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .blur(if (shouldBlur) 10.dp else 0.dp)
        ) {
            if (isLoading) {
                // 🔥 Ultra Smooth: Shimmer Loading
                QuestionShimmer()
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
                // 🔥 Fade in content
                AnimatedVisibility(
                    visible = true,
                    enter = fadeIn(tween(500))
                ) {
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
                            
                            // 🔥 Ultra Premium: Pulsating Timer
                            TimerComponent(timeRemaining = timeRemaining)
                        }
                        
                        Spacer(Modifier.height(8.dp))
                        
                        LinearProgressIndicator(
                            progress = (currentIndex + 1).toFloat() / questions.size,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp))
                        )
                        
                        Spacer(Modifier.height(16.dp))
                        PowerUpsBar(
                            coins = coins,
                            onHint = {
                                if (quizViewModel.useHint()) {
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                } else {
                                    Toast.makeText(context, "Not enough coins!", Toast.LENGTH_SHORT).show()
                                }
                            },
                            onSkip = {
                                if (quizViewModel.skipQuestionPowerUp()) {
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                } else {
                                    Toast.makeText(context, "Not enough coins!", Toast.LENGTH_SHORT).show()
                                }
                            },
                            onRemoveOptions = {
                                quizViewModel.removeTwoOptionsPowerUp()
                                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
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
                                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                    quizViewModel.onAnswerSelected(answer)
                                },
                                onBookmarkToggle = {
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
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
                                enabled = true,
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
            }
        }

        // 🔥 Overlays outside the blur box
        if (showTimeUpDialog) {
            TimeUpFeedback(
                explanation = questions.getOrNull(currentIndex)?.explanation ?: "",
                onNext = { quizViewModel.goToNextAfterTimeUp() }
            )
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
}

@Composable
fun QuestionShimmer() {
    val shimmerColors = listOf(
        Color.LightGray.copy(alpha = 0.6f),
        Color.LightGray.copy(alpha = 0.2f),
        Color.LightGray.copy(alpha = 0.6f),
    )

    val transition = rememberInfiniteTransition(label = "")
    val translateAnim = transition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = ""
    )

    val brush = Brush.linearGradient(
        colors = shimmerColors,
        start = Offset.Zero,
        end = Offset(x = translateAnim.value, y = translateAnim.value)
    )

    Column(modifier = Modifier.padding(16.dp).fillMaxSize()) {
        Spacer(modifier = Modifier.height(20.dp))
        // Progress bar shimmer
        Box(modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)).background(brush))
        Spacer(modifier = Modifier.height(40.dp))
        // Question card shimmer
        Box(modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(24.dp)).background(brush))
        Spacer(modifier = Modifier.height(24.dp))
        // Options shimmer
        repeat(4) {
            Box(modifier = Modifier.fillMaxWidth().height(60.dp).clip(RoundedCornerShape(16.dp)).background(brush))
            Spacer(modifier = Modifier.height(14.dp))
        }
    }
}

@Composable
fun TimerComponent(timeRemaining: Int) {
    val isUrgent = timeRemaining < 10
    val infiniteTransition = rememberInfiniteTransition(label = "timer_pulse")
    
    val pulseScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = if (isUrgent) 1.2f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(500, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse"
    )

    Box(
        contentAlignment = Alignment.Center, 
        modifier = Modifier
            .size(44.dp)
            .graphicsLayer {
                scaleX = if (isUrgent) pulseScale else 1f
                scaleY = if (isUrgent) pulseScale else 1f
            }
    ) {
        CircularProgressIndicator(
            progress = timeRemaining / 30f,
            modifier = Modifier.fillMaxSize(),
            strokeWidth = 4.dp,
            color = if (isUrgent) Color.Red else MaterialTheme.colorScheme.primary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant
        )
        Text(
            text = timeRemaining.toString(),
            style = MaterialTheme.typography.labelLarge,
            fontWeight = FontWeight.Bold,
            color = if (isUrgent) Color.Red else MaterialTheme.colorScheme.onSurface
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
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(12.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .offset(x = offsetX.value.dp)
                .scale(scale.value)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(32.dp)
            ) {
                // 🔥 Icon with animation
                val iconScale by rememberInfiniteTransition(label = "").animateFloat(
                    initialValue = 1f,
                    targetValue = 1.1f,
                    animationSpec = infiniteRepeatable(tween(1000), RepeatMode.Reverse),
                    label = ""
                )
                
                Icon(
                    imageVector = Icons.Default.TimerOff,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier.size(72.dp).scale(iconScale)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Time’s Up!",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                if (explanation.isNotBlank()) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "The answer was:",
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Surface(
                        color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.padding(top = 8.dp)
                    ) {
                        Text(
                            text = explanation,
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                } else {
                    Text(
                        text = "Don't worry, you'll get the next one!",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = onNext,
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    elevation = ButtonDefaults.buttonElevation(4.dp)
                ) {
                    Text("Continue", fontSize = 18.sp, fontWeight = FontWeight.Bold)
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
                .size(54.dp)
                .background(MaterialTheme.colorScheme.secondaryContainer, CircleShape)
        ) {
            Icon(icon, contentDescription = label, tint = MaterialTheme.colorScheme.onSecondaryContainer, modifier = Modifier.size(28.dp))
        }
        Spacer(Modifier.height(4.dp))
        Text(text = label, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.MonetizationOn, null, Modifier.size(12.dp), tint = Color(0xFFFFD700))
            Spacer(Modifier.width(2.dp))
            Text(text = cost.toString(), fontSize = 11.sp, fontWeight = FontWeight.ExtraBold)
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
        elevation = CardDefaults.cardElevation(6.dp), 
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(24.dp)) {
                Surface(
                    color = MaterialTheme.colorScheme.primaryContainer, 
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = question.questionType.name.replace("_", " "),
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }
                Spacer(Modifier.height(20.dp))
                Text(
                    text = "Q$questionNumber. ${question.questionText}", 
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 28.sp
                )
                
                if (isHintVisible && question.explanation.isNotBlank()) {
                    Spacer(Modifier.height(12.dp))
                    Surface(
                        color = Color(0xFFFFF9C4),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Lightbulb, null, Modifier.size(20.dp), tint = Color(0xFFFBC02D))
                            Spacer(Modifier.width(10.dp))
                            Text(text = "Hint: ${question.explanation}", fontSize = 14.sp, color = Color.Black)
                        }
                    }
                }

                Spacer(Modifier.height(24.dp))

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
                            Spacer(Modifier.height(14.dp))
                        }
                    }
                } else {
                    OutlinedTextField(
                        value = selectedAnswer ?: "",
                        onValueChange = onAnswerSelected,
                        label = { Text("Your Answer") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        readOnly = isAnswered || showResult
                    )
                }

                AnimatedVisibility(
                    visible = isAnswered && question.explanation.isNotBlank(),
                    enter = fadeIn() + expandVertically()
                ) {
                    ExplanationBox(
                        answerState = answerState,
                        explanation = question.explanation,
                        isTimeUp = isTimeUp
                    )
                }
            }

            IconButton(
                onClick = onBookmarkToggle,
                modifier = Modifier.align(Alignment.TopEnd).padding(12.dp)
            ) {
                Icon(
                    imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                    contentDescription = "Bookmark",
                    tint = if (isBookmarked) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(28.dp)
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
            else -> MaterialTheme.colorScheme.surface
        },
        animationSpec = tween(400),
        label = ""
    )

    val borderColor by animateColorAsState(
        targetValue = when {
            showResult && isCorrect -> CorrectGreen
            showResult && isSelected && !isCorrect -> IncorrectRed
            isSelected && !showResult -> MaterialTheme.colorScheme.primary
            else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
        },
        animationSpec = tween(400),
        label = ""
    )

    val scale by animateFloatAsState(
        targetValue = if (isSelected) 1.04f else 1f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy),
        label = ""
    )

    val borderWidth = if (isSelected || (showResult && isCorrect)) 2.5.dp else 1.dp

    val labelBackgroundColor by animateColorAsState(
        targetValue = when {
            showResult && isCorrect -> CorrectGreen
            showResult && isSelected && !isCorrect -> IncorrectRed
            isSelected && !showResult -> MaterialTheme.colorScheme.primary
            else -> MaterialTheme.colorScheme.surfaceVariant
        },
        animationSpec = tween(400),
        label = ""
    )

    OutlinedCard(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth().graphicsLayer {
            scaleX = scale
            scaleY = scale
        },
        colors = CardDefaults.outlinedCardColors(containerColor = backgroundColor),
        border = BorderStroke(borderWidth, borderColor),
        shape = RoundedCornerShape(16.dp),
        enabled = !showResult,
        elevation = CardDefaults.cardElevation(if (isSelected) 4.dp else 0.dp)
    ) {
        Row(
            modifier = Modifier.padding(18.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = labelBackgroundColor,
                shape = RoundedCornerShape(6.dp)
            ) {
                Text(
                    text = optionLabel,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Black,
                    color = if (labelBackgroundColor == MaterialTheme.colorScheme.surfaceVariant) MaterialTheme.colorScheme.onSurfaceVariant else Color.White
                )
            }
            Spacer(Modifier.width(16.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f),
                fontWeight = if (isSelected || (showResult && isCorrect)) FontWeight.Bold else FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurface
            )

            if (showResult) {
                if (isCorrect) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = null,
                        tint = CorrectGreen,
                        modifier = Modifier.size(28.dp)
                    )
                } else if (isSelected) {
                    Icon(
                        imageVector = Icons.Default.Cancel,
                        contentDescription = null,
                        tint = IncorrectRed,
                        modifier = Modifier.size(28.dp)
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
        modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
        border = BorderStroke(2.dp, color),
        colors = CardDefaults.outlinedCardColors(containerColor = color.copy(alpha = 0.08f)),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = color,
                    modifier = Modifier.size(22.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    text = label,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.ExtraBold,
                    color = color
                )
            }
            Spacer(Modifier.height(10.dp))
            Text(
                text = explanation,
                style = MaterialTheme.typography.bodyMedium,
                lineHeight = 22.sp,
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
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        questions.forEachIndexed { index, question ->
            val isAnswered = answeredQuestionIds.contains(question.id)
            val isSelected = index == currentIndex

            val color = when {
                isSelected -> MaterialTheme.colorScheme.primary
                isAnswered -> CorrectGreen.copy(alpha = 0.8f)
                else -> MaterialTheme.colorScheme.surfaceVariant
            }

            val textColor = if (isSelected || isAnswered) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant

            Surface(
                onClick = { onQuestionClick(index) },
                color = color,
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(44.dp),
                shadowElevation = if (isSelected) 4.dp else 0.dp
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(text = (index + 1).toString(), color = textColor, fontWeight = FontWeight.Black)
                }
            }
        }
    }
}
