package com.example.quizapp.presentation.screens

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
    val questionsState by quizViewModel.questions.collectAsStateWithLifecycle()
    val currentIndex by quizViewModel.currentQuestionIndex.collectAsStateWithLifecycle()
    val userAnswers by quizViewModel.userAnswers.collectAsStateWithLifecycle()
    val answerStates by quizViewModel.answerState.collectAsStateWithLifecycle()
    val timeRemaining by quizViewModel.timeRemaining.collectAsStateWithLifecycle()
    val quizResult by quizViewModel.quizResult.collectAsStateWithLifecycle()

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
                        if (questionsState is Resource.Success) {
                            val questionList = (questionsState as Resource.Success).data ?: emptyList()
                            Text(
                                text = "Question ${currentIndex + 1}/${questionList.size}",
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
                    TextButton(onClick = { showSubmitDialog = true }) {
                        Text("Submit Quiz", color = MaterialTheme.colorScheme.onPrimary)
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
            when (questionsState) {
                is Resource.Loading -> {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator()
                    }
                }
                is Resource.Success -> {
                    val questionList = (questionsState as Resource.Success).data ?: emptyList()
                    if (questionList.isEmpty()) {
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
                            LinearProgressIndicator(
                                progress = (currentIndex + 1).toFloat() / (if (questionList.isEmpty()) 1 else questionList.size),
                                modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp))
                            )
                            Spacer(Modifier.height(24.dp))

                            QuestionCard(
                                question = questionList[currentIndex],
                                questionNumber = currentIndex + 1,
                                selectedAnswer = userAnswers[currentIndex],
                                answerState = answerStates[currentIndex] ?: AnswerState.UNANSWERED,
                                onAnswerSelected = { answer ->
                                    quizViewModel.setAnswer(currentIndex, answer)
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
                                Button(
                                    onClick = {
                                        if (currentIndex < questionList.size - 1) {
                                            quizViewModel.nextQuestion()
                                        } else {
                                            showSubmitDialog = true
                                        }
                                    },
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(if (currentIndex < questionList.size - 1) "Next" else "Submit")
                                    Spacer(Modifier.width(8.dp))
                                    Icon(
                                        if (currentIndex < questionList.size - 1) Icons.Default.ArrowForward else Icons.Default.Check,
                                        null,
                                        Modifier.size(20.dp)
                                    )
                                }
                            }
                            Spacer(Modifier.height(16.dp))
                            QuestionNavigator(
                                totalQuestions = questionList.size,
                                currentIndex = currentIndex,
                                answeredQuestions = userAnswers.keys,
                                onQuestionClick = { index -> quizViewModel.goToQuestion(index) }
                            )
                        }
                    }
                }
                is Resource.Error -> {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(24.dp)) {
                            Icon(Icons.Default.Error, null, Modifier.size(64.dp), tint = MaterialTheme.colorScheme.error)
                            Spacer(Modifier.height(16.dp))
                            Text(
                                text = (questionsState as Resource.Error).message ?: "An error occurred",
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.error,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }

    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog = false },
            title = { Text("Exit Quiz?") },
            text = { Text("Your progress will be lost. Are you sure you want to exit?") },
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
fun QuestionCard(
    question: Question,
    questionNumber: Int,
    selectedAnswer: String?,
    answerState: AnswerState,
    onAnswerSelected: (String) -> Unit
) {
    val isAnswered = answerState != AnswerState.UNANSWERED

    Card(elevation = CardDefaults.cardElevation(4.dp), shape = RoundedCornerShape(16.dp)) {
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
    totalQuestions: Int,
    currentIndex: Int,
    answeredQuestions: Set<Int>,
    onQuestionClick: (Int) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(totalQuestions) { index ->
            val isAnswered = answeredQuestions.contains(index)
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