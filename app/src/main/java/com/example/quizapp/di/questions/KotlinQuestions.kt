package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val KT_BASICS = "kotlin_kotlin_basics"
const val KT_VARS_DATA_TYPES = "kotlin_variables_and_data_types"
const val KT_CONTROL_FLOW = "kotlin_control_flow"
const val KT_FUNCTIONS = "kotlin_functions"
const val KT_NULL_SAFETY = "kotlin_null_safety"
const val KT_CLASSES_OBJECTS = "kotlin_classes_and_objects"
const val KT_INHERITANCE = "kotlin_inheritance"
const val KT_DATA_CLASSES = "kotlin_data_classes"
const val KT_COLLECTIONS = "kotlin_collections"
const val KT_LAMBDAS = "kotlin_lambdas"
const val KT_COROUTINES = "kotlin_coroutines"
const val KT_ANDROID_BASICS = "kotlin_android_basics"

/* ===============================
   HELPER FUNCTION
   =============================== */

private fun kotlinQuestion(
    id: String,
    categoryId: String,
    chapterId: String,
    questionText: String,
    options: List<String>,
    correctAnswer: String,
    explanation: String,
    difficulty: Difficulty,
    createdAt: String,
    timeLimit: Int = 30,
    points: Int = 10,
    questionType: QuestionType = QuestionType.MULTIPLE_CHOICE
): Question {
    return Question(
        id = id,
        categoryId = categoryId,
        chapterId = chapterId,
        questionText = questionText,
        options = options,
        correctAnswer = correctAnswer,
        explanation = explanation,
        difficulty = difficulty,
        questionType = questionType,
        timeLimit = timeLimit,
        points = points,
        createdAt = createdAt
    )
}

/* ===============================
   MAIN FUNCTION
   =============================== */

fun getKotlinQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    /* ---------- BASICS ---------- */
    val basics = listOf(
        kotlinQuestion(
            id = "kt_basic_001",
            categoryId = categoryId,
            chapterId = KT_BASICS,
            questionText = "Which keyword is used to declare a read-only variable in Kotlin?",
            options = listOf("var", "val", "const", "let"),
            correctAnswer = "val",
            explanation = "val declares an immutable variable.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        kotlinQuestion(
            id = "kt_basic_002",
            categoryId = categoryId,
            chapterId = KT_BASICS,
            questionText = "What is the file extension for Kotlin source files?",
            options = listOf(".java", ".kt", ".kotlin", ".ko"),
            correctAnswer = ".kt",
            explanation = "Kotlin source files use .kt.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- CONTROL FLOW ---------- */
    val controlFlow = listOf(
        kotlinQuestion(
            id = "kt_flow_001",
            categoryId = categoryId,
            chapterId = KT_CONTROL_FLOW,
            questionText = "Which keyword replaces switch in Kotlin?",
            options = listOf("switch", "case", "when", "select"),
            correctAnswer = "when",
            explanation = "when is Kotlin’s replacement for switch.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        kotlinQuestion(
            id = "kt_flow_002",
            categoryId = categoryId,
            chapterId = KT_CONTROL_FLOW,
            questionText = "How do you create a range from 1 to 5?",
            options = listOf("1-5", "1 to 5", "1..5", "range(1,5)"),
            correctAnswer = "1..5",
            explanation = "The .. operator creates a range.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- FUNCTIONS ---------- */
    val functions = listOf(
        kotlinQuestion(
            id = "kt_func_001",
            categoryId = categoryId,
            chapterId = KT_FUNCTIONS,
            questionText = "Which keyword is used to define a function?",
            options = listOf("def", "func", "fun", "function"),
            correctAnswer = "fun",
            explanation = "Functions are declared using fun.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- NULL SAFETY ---------- */
    val nullSafety = listOf(
        kotlinQuestion(
            id = "kt_null_001",
            categoryId = categoryId,
            chapterId = KT_NULL_SAFETY,
            questionText = "Which symbol makes a variable nullable?",
            options = listOf("!", "?", "*", "&"),
            correctAnswer = "?",
            explanation = "String? means nullable String.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        kotlinQuestion(
            id = "kt_null_002",
            categoryId = categoryId,
            chapterId = KT_NULL_SAFETY,
            questionText = "Which operator provides a default value if null?",
            options = listOf("!!", "?.", "?:", "as"),
            correctAnswer = "?:",
            explanation = "This is the Elvis operator.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- COROUTINES ---------- */
    val coroutines = listOf(
        kotlinQuestion(
            id = "kt_cor_001",
            categoryId = categoryId,
            chapterId = KT_COROUTINES,
            questionText = "Which keyword marks a suspendable function?",
            options = listOf("async", "launch", "suspend", "yield"),
            correctAnswer = "suspend",
            explanation = "Suspend functions can pause without blocking.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 20
        )
    )

    return basics + controlFlow + functions + nullSafety + coroutines
}
