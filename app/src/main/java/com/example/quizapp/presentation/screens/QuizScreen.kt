package com.example.quizapp.presentation.screens

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import com.example.quizapp.presentation.viewmodel.AnswerState
import com.example.quizapp.presentation.viewmodel.QuizViewModel
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
    quizViewModel: QuizViewModel = hiltViewModel()
) {
    val context = LocalContext.current
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

    var showExitDialog by remember { mutableStateOf(false) }
    var showSubmitDialog by remember { mutableStateOf(false) }
    var timerRunning by remember { mutableStateOf(true) }

    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    LaunchedEffect(categoryId, topicId, topicName) {
        quizViewModel.loadQuestions(categoryId, topicId, topicName)
    }

    LaunchedEffect(timerRunning, timeRemaining) {
        if (timerRunning && timeRemaining > 0) {
            delay(1000)
            quizViewModel.updateTimeRemaining(timeRemaining - 1)
        } else if (timeRemaining == 0 && timerRunning) {
            quizViewModel.submitQuiz()
        }
    }

    LaunchedEffect(quizResult) {
        when (val result = quizResult) {
            is Resource.Success -> {
                timerRunning = false
                onNavigateToResult()
            }
            is Resource.Error -> {
                val errorMessage = result.message ?: "An unknown error occurred."
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = errorMessage,
                        duration = SnackbarDuration.Long
                    )
                }
            }
            else -> { /* Loading or null */ }
        }
    }

    BackHandler {
        showExitDialog = true
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
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
                    // FEATURE 2 — DISABLE SUBMIT BUTTON EARLY
                    val isAllAnswered = selectedAnswers.size == questions.size
                    if (questions.isNotEmpty() && currentIndex == questions.size - 1) {
                        if (isAllAnswered) {
                            TextButton(onClick = { showSubmitDialog = true }) {
                                Text("Submit Quiz", color = MaterialTheme.colorScheme.onPrimary)
                            }
                        } else {
                            Text(
                                "Finish all to submit",
                                fontSize = 12.sp,
                                modifier = Modifier.padding(end = 16.dp),
                                color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f)
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
                    CircularProgressIndicator()
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
                    // FEATURE 7 — UX IMPROVEMENT (Progress display)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Answered ${selectedAnswers.size} / ${questions.size} questions",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Medium
                        )
                        val timeColor = if (timeRemaining < 10) Color.Red else MaterialTheme.colorScheme.primary
                        Text(
                            text = "00:${timeRemaining.toString().padStart(2, '0')}",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold,
                            color = timeColor
                        )
                    }
                    
                    Spacer(Modifier.height(8.dp))
                    
                    LinearProgressIndicator(
                        progress = (currentIndex + 1).toFloat() / questions.size,
                        modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp))
                    )
                    Spacer(Modifier.height(24.dp))

                    val currentQuestion = questions[currentIndex]

                    QuestionCard(
                        question = currentQuestion,
                        questionNumber = currentIndex + 1,
                        selectedAnswer = selectedAnswers[currentQuestion.id],
                        answerState = answerStates[currentQuestion.id] ?: AnswerState.UNANSWERED,
                        isBookmarked = isBookmarked,
                        onAnswerSelected = { answer ->
                            quizViewModel.setAnswer(currentQuestion.id, answer)
                        },
                        onBookmarkToggle = {
                            if (!isBookmarked) {
                                Toast.makeText(context, "Added to bookmarks", Toast.LENGTH_SHORT).show()
                            } else {
                                Toast.makeText(context, "Removed from bookmarks", Toast.LENGTH_SHORT).show()
                            }
                            quizViewModel.toggleBookmark(currentQuestion)
                        }
                    )

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
                        val isAllAnswered = selectedAnswers.size == questions.size
                        
                        Button(
                            onClick = {
                                if (!isLastQuestion) {
                                    quizViewModel.nextQuestion()
                                } else if (isAllAnswered) {
                                    showSubmitDialog = true
                                }
                            },
                            enabled = !isLastQuestion || isAllAnswered,
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
                        onQuestionClick = { index -> quizViewModel.goToQuestion(index) }
                    )
                }
            }
        }
    }

    if (showResumeDialog) {
        AlertDialog(
            onDismissRequest = { /* Don't dismiss by tapping outside */ },
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
                    timerRunning = false
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
            text = { Text("Are you sure you want to submit the quiz? You have completed all questions.") },
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
fun QuestionCard(
    question: Question,
    questionNumber: Int,
    selectedAnswer: String?,
    answerState: AnswerState,
    isBookmarked: Boolean,
    onAnswerSelected: (String) -> Unit,
    onBookmarkToggle: () -> Unit
) {
    val isAnswered = answerState != AnswerState.UNANSWERED

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
                Spacer(Modifier.height(20.dp))

                if (question.questionType == QuestionType.MULTIPLE_CHOICE && question.options.isEmpty()) {
                    Text(
                        text = "This multiple-choice question has no options. Please contact support or an admin.",
                        color = MaterialTheme.colorScheme.error,
                        modifier = Modifier.padding(vertical = 16.dp).fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                } else {
                    val options = when (question.questionType) {
                        QuestionType.MULTIPLE_CHOICE -> question.options
                        QuestionType.TRUE_FALSE -> listOf("True", "False")
                        else -> emptyList()
                    }

                    if (question.questionType != QuestionType.SHORT_ANSWER) {
                        options.forEachIndexed { index, option ->
                            val isCorrectOption = option.equals(question.correctAnswer, ignoreCase = true)
                            val optionLabel = ('A' + index).toString()
                            AnswerOption(
                                text = option,
                                optionLabel = optionLabel,
                                isSelected = selectedAnswer == option,
                                isCorrect = isCorrectOption,
                                isAnswered = isAnswered,
                                onClick = { if (!isAnswered) onAnswerSelected(option) }
                            )
                            Spacer(Modifier.height(12.dp))
                        }
                    } else {
                        OutlinedTextField(
                            value = selectedAnswer ?: "",
                            onValueChange = onAnswerSelected,
                            label = { Text("Your Answer") },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            readOnly = isAnswered
                        )
                    }
                }

                AnimatedVisibility(visible = isAnswered && question.explanation?.isNotBlank() == true) {
                    ExplanationBox(answerState = answerState, explanation = question.explanation!!)
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
    onClick: () -> Unit
) {
    val containerColor = when {
        isAnswered && isCorrect -> CorrectGreen.copy(alpha = 0.15f)
        isAnswered && isSelected && !isCorrect -> IncorrectRed.copy(alpha = 0.15f)
        isSelected && !isAnswered -> MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
        else -> Color.Transparent
    }

    val borderColor = when {
        isAnswered && isCorrect -> CorrectGreen
        isAnswered && isSelected && !isCorrect -> IncorrectRed
        isSelected && !isAnswered -> MaterialTheme.colorScheme.primary
        else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
    }

    val borderWidth = if (isSelected || (isAnswered && isCorrect)) 2.dp else 1.dp

    val labelBackgroundColor = when {
        isAnswered && isCorrect -> CorrectGreen
        isAnswered && isSelected && !isCorrect -> IncorrectRed
        isSelected && !isAnswered -> MaterialTheme.colorScheme.primary
        else -> MaterialTheme.colorScheme.surfaceVariant
    }

    OutlinedCard(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.outlinedCardColors(containerColor = containerColor),
        border = BorderStroke(borderWidth, borderColor),
        shape = RoundedCornerShape(12.dp),
        enabled = !isAnswered
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
                fontWeight = if (isSelected || (isAnswered && isCorrect)) FontWeight.Medium else FontWeight.Normal,
                color = MaterialTheme.colorScheme.onSurface
            )

            if (isAnswered) {
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
fun ExplanationBox(answerState: AnswerState, explanation: String) {
    val color = if (answerState == AnswerState.CORRECT) CorrectGreen else IncorrectRed
    val label = if (answerState == AnswerState.CORRECT) "Correct!" else "Incorrect"
    val icon = if (answerState == AnswerState.CORRECT) Icons.Default.CheckCircle else Icons.Default.Cancel

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
