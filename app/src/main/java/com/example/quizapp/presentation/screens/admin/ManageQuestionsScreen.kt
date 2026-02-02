package com.example.quizapp.presentation.screens.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import com.example.quizapp.presentation.viewmodel.AdminViewModel
import com.example.quizapp.util.Resource
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ManageQuestionsScreen(
    categoryId: String,
    categoryName: String,
    onNavigateBack: () -> Unit,
    adminViewModel: AdminViewModel = hiltViewModel()
) {
    val questions by adminViewModel.questions.collectAsState()
    val operationResult by adminViewModel.operationResult.collectAsState()

    var showAddDialog by remember { mutableStateOf(false) }
    var showEditDialog by remember { mutableStateOf(false) }
    var showDeleteDialog by remember { mutableStateOf(false) }
    var selectedQuestion by remember { mutableStateOf<Question?>(null) }
    var selectedChapterId by remember { mutableStateOf("") }


    LaunchedEffect(categoryId) {
        adminViewModel.loadQuestions(categoryId)
    }

    val snackbarHostState = remember { SnackbarHostState() }
    LaunchedEffect(operationResult) {
        operationResult?.let { result ->
            when (result) {
                is Resource.Success -> {
                    snackbarHostState.showSnackbar(
                        message = result.data ?: "Operation successful",
                        duration = SnackbarDuration.Short
                    )
                    adminViewModel.resetOperationResult()
                }
                is Resource.Error -> {
                    snackbarHostState.showSnackbar(
                        message = result.message ?: "Operation failed",
                        duration = SnackbarDuration.Long
                    )
                    adminViewModel.resetOperationResult()
                }
                else -> {}
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = categoryName,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Manage Questions",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.8f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { showAddDialog = true },
                containerColor = MaterialTheme.colorScheme.primary
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Question"
                )
            }
        },
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (questions) {
                is Resource.Loading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
                is Resource.Success -> {
                    val questionList = (questions as Resource.Success).data ?: emptyList()

                    if (questionList.isEmpty()) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.padding(24.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Quiz,
                                    contentDescription = null,
                                    modifier = Modifier.size(80.dp),
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(
                                    text = "No Questions",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Click + to add a new question",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    } else {
                        LazyColumn(
                            contentPadding = PaddingValues(16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            items(questionList) { question ->
                                QuestionItemCard(
                                    question = question,
                                    onEdit = {
                                        selectedQuestion = question
                                        showEditDialog = true
                                    },
                                    onDelete = {
                                        selectedQuestion = question
                                        showDeleteDialog = true
                                    }
                                )
                            }
                        }
                    }
                }
                is Resource.Error -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(24.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Error,
                                contentDescription = null,
                                modifier = Modifier.size(64.dp),
                                tint = MaterialTheme.colorScheme.error
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = (questions as Resource.Error).message ?: "Error",
                                color = MaterialTheme.colorScheme.error
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(onClick = { adminViewModel.loadQuestions(categoryId) }) {
                                Text("Retry")
                            }
                        }
                    }
                }
            }
        }
    }

    // Add Question Dialog
    if (showAddDialog) {
        QuestionDialog(
            title = "Add Question",
            question = null,
            categoryId = categoryId,
            onDismiss = { showAddDialog = false },
            onConfirm = { question ->
                adminViewModel.createQuestion(question)
                showAddDialog = false
            }
        )
    }

    // Edit Question Dialog
    if (showEditDialog && selectedQuestion != null) {
        QuestionDialog(
            title = "Edit Question",
            question = selectedQuestion,
            categoryId = categoryId,
            onDismiss = { showEditDialog = false },
            onConfirm = { question ->
                adminViewModel.updateQuestion(selectedQuestion!!.id, question)
                showEditDialog = false
            }
        )
    }

    // Delete Confirmation Dialog
    if (showDeleteDialog && selectedQuestion != null) {
        AlertDialog(
            onDismissRequest = { showDeleteDialog = false },
            title = { Text("Delete Question") },
            text = { Text("Are you sure you want to delete this question?") },
            confirmButton = {
                TextButton(
                    onClick = {
                        adminViewModel.deleteQuestion(selectedQuestion!!.id, categoryId)
                        showDeleteDialog = false
                    },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = MaterialTheme.colorScheme.error
                    )
                ) {
                    Text("Delete")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

@Composable
fun QuestionItemCard(
    question: Question,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Surface(
                        color = MaterialTheme.colorScheme.primaryContainer,
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = question.questionType.name.replace("_", " "),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = question.questionText,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 22.sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Answer: ${question.correctAnswer}",
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Row {
                    IconButton(onClick = onEdit) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Edit",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }

                    IconButton(onClick = onDelete) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete",
                            tint = MaterialTheme.colorScheme.error
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Divider()

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Difficulty: ${question.difficulty.name}",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = "Points: ${question.points}",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = "Time: ${question.timeLimit}s",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionDialog(
    title: String,
    question: Question?,
    categoryId: String,
    onDismiss: () -> Unit,
    onConfirm: (Question) -> Unit
) {
    var questionText by remember { mutableStateOf(question?.questionText ?: "") }
    var questionType by remember { mutableStateOf(question?.questionType ?: QuestionType.MULTIPLE_CHOICE) }
    var correctAnswer by remember { mutableStateOf(question?.correctAnswer ?: "") }
    var options by remember { mutableStateOf(question?.options?.joinToString("\n") ?: "") }
    var explanation by remember { mutableStateOf(question?.explanation ?: "") }
    var difficulty by remember { mutableStateOf(question?.difficulty ?: Difficulty.MEDIUM) }
    var timeLimit by remember { mutableStateOf(question?.timeLimit?.toString() ?: "30") }
    var points by remember { mutableStateOf(question?.points?.toString() ?: "10") }

    var expandedType by remember { mutableStateOf(false) }
    var expandedDifficulty by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(title) },
        text = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 500.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                item {
                    // Question Type
                    ExposedDropdownMenuBox(
                        expanded = expandedType,
                        onExpandedChange = { expandedType = it }
                    ) {
                        OutlinedTextField(
                            value = questionType.name.replace("_", " "),
                            onValueChange = {},
                            readOnly = true,
                            label = { Text("Question Type") },
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedType) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .menuAnchor()
                        )

                        ExposedDropdownMenu(
                            expanded = expandedType,
                            onDismissRequest = { expandedType = false }
                        ) {
                            QuestionType.values().forEach { type ->
                                DropdownMenuItem(
                                    text = { Text(type.name.replace("_", " ")) },
                                    onClick = {
                                        questionType = type
                                        expandedType = false
                                    }
                                )
                            }
                        }
                    }
                }

                item {
                    OutlinedTextField(
                        value = questionText,
                        onValueChange = { questionText = it },
                        label = { Text("Question Text") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 2,
                        maxLines = 4
                    )
                }

                if (questionType == QuestionType.MULTIPLE_CHOICE) {
                    item {
                        OutlinedTextField(
                            value = options,
                            onValueChange = { options = it },
                            label = { Text("Options (one per line)") },
                            modifier = Modifier.fillMaxWidth(),
                            minLines = 4,
                            maxLines = 6,
                            placeholder = { Text("Option 1\nOption 2\nOption 3\nOption 4") }
                        )
                    }
                }

                item {
                    OutlinedTextField(
                        value = correctAnswer,
                        onValueChange = { correctAnswer = it },
                        label = { Text("Correct Answer") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                }

                item {
                    OutlinedTextField(
                        value = explanation,
                        onValueChange = { explanation = it },
                        label = { Text("Explanation (Optional)") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 2,
                        maxLines = 3
                    )
                }

                item {
                    // Difficulty
                    ExposedDropdownMenuBox(
                        expanded = expandedDifficulty,
                        onExpandedChange = { expandedDifficulty = it }
                    ) {
                        OutlinedTextField(
                            value = difficulty.name,
                            onValueChange = {},
                            readOnly = true,
                            label = { Text("Difficulty") },
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedDifficulty) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .menuAnchor()
                        )

                        ExposedDropdownMenu(
                            expanded = expandedDifficulty,
                            onDismissRequest = { expandedDifficulty = false }
                        ) {
                            Difficulty.values().forEach { diff ->
                                DropdownMenuItem(
                                    text = { Text(diff.name) },
                                    onClick = {
                                        difficulty = diff
                                        expandedDifficulty = false
                                    }
                                )
                            }
                        }
                    }
                }

                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        OutlinedTextField(
                            value = timeLimit,
                            onValueChange = { if (it.all { char -> char.isDigit() }) timeLimit = it },
                            label = { Text("Time (sec)") },
                            modifier = Modifier.weight(1f),
                            singleLine = true
                        )

                        OutlinedTextField(
                            value = points,
                            onValueChange = { if (it.all { char -> char.isDigit() }) points = it },
                            label = { Text("Points") },
                            modifier = Modifier.weight(1f),
                            singleLine = true
                        )
                    }
                }
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    if (questionText.isNotBlank() && correctAnswer.isNotBlank()) {
                        val newQuestion = Question(
                            id = question?.id ?: UUID.randomUUID().toString(),
                            categoryId = categoryId,
                            chapterId = question?.chapterId ?: "default_chapter",
                            questionText = questionText,
                            options = if (questionType == QuestionType.MULTIPLE_CHOICE) {
                                options
                                    .lines()
                                    .map { it.trim() }
                                    .filter { it.isNotEmpty() }
                            } else {
                                emptyList()
                            },
                            correctAnswer = correctAnswer,
                            explanation = explanation,
                            difficulty = difficulty,
                            questionType = questionType,
                            timeLimit = timeLimit.toIntOrNull() ?: 30,
                            points = points.toIntOrNull() ?: 10,
                            createdAt = question?.createdAt ?: System.currentTimeMillis().toString()
                        )


                        onConfirm(newQuestion)
                    }
                },
                enabled = questionText.isNotBlank() && correctAnswer.isNotBlank()
            ) {
                Text("Save")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )
}