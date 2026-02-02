package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS
   =============================== */

const val KOTLIN_BASICS = "kotlin_basics"
const val KOTLIN_CONTROL_FLOW = "kotlin_control_flow"
const val KOTLIN_FUNCTIONS = "kotlin_functions"
const val KOTLIN_COLLECTIONS = "kotlin_collections"
const val KOTLIN_OOP = "kotlin_oop"
const val KOTLIN_NULL_SAFETY = "kotlin_null_safety"
const val KOTLIN_COROUTINES = "kotlin_coroutines"
const val KOTLIN_ADVANCED = "kotlin_advanced"

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
            chapterId = KOTLIN_BASICS,
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
            chapterId = KOTLIN_BASICS,
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
            chapterId = KOTLIN_CONTROL_FLOW,
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
            chapterId = KOTLIN_CONTROL_FLOW,
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
            chapterId = KOTLIN_FUNCTIONS,
            questionText = "Which keyword is used to define a function?",
            options = listOf("def", "func", "fun", "function"),
            correctAnswer = "fun",
            explanation = "Functions are declared using fun.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        kotlinQuestion(
            id = "kt_func_002",
            categoryId = categoryId,
            chapterId = KOTLIN_FUNCTIONS,
            questionText = "What is a higher-order function?",
            options = listOf(
                "A function inside a class",
                "A function that takes or returns another function",
                "A recursive function",
                "A private function"
            ),
            correctAnswer = "A function that takes or returns another function",
            explanation = "Functions are first-class citizens in Kotlin.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- COLLECTIONS ---------- */
    val collections = listOf(
        kotlinQuestion(
            id = "kt_col_001",
            categoryId = categoryId,
            chapterId = KOTLIN_COLLECTIONS,
            questionText = "Which collection stores unique elements?",
            options = listOf("List", "Set", "Map", "Array"),
            correctAnswer = "Set",
            explanation = "Set does not allow duplicates.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        kotlinQuestion(
            id = "kt_col_002",
            categoryId = categoryId,
            chapterId = KOTLIN_COLLECTIONS,
            questionText = "Which function transforms elements into a new list?",
            options = listOf("filter", "map", "forEach", "reduce"),
            correctAnswer = "map",
            explanation = "map transforms each element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- OOP ---------- */
    val oop = listOf(
        kotlinQuestion(
            id = "kt_oop_001",
            categoryId = categoryId,
            chapterId = KOTLIN_OOP,
            questionText = "By default, Kotlin classes are:",
            options = listOf("open", "abstract", "final", "sealed"),
            correctAnswer = "final",
            explanation = "Classes must be marked open to inherit.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        kotlinQuestion(
            id = "kt_oop_002",
            categoryId = categoryId,
            chapterId = KOTLIN_OOP,
            questionText = "What is a data class mainly used for?",
            options = listOf(
                "UI rendering",
                "Holding data",
                "Networking",
                "Threading"
            ),
            correctAnswer = "Holding data",
            explanation = "Data classes generate equals, hashCode, copy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- NULL SAFETY ---------- */
    val nullSafety = listOf(
        kotlinQuestion(
            id = "kt_null_001",
            categoryId = categoryId,
            chapterId = KOTLIN_NULL_SAFETY,
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
            chapterId = KOTLIN_NULL_SAFETY,
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
            chapterId = KOTLIN_COROUTINES,
            questionText = "Which keyword marks a suspendable function?",
            options = listOf("async", "launch", "suspend", "yield"),
            correctAnswer = "suspend",
            explanation = "Suspend functions can pause without blocking.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 20
        ),
        kotlinQuestion(
            id = "kt_cor_002",
            categoryId = categoryId,
            chapterId = KOTLIN_COROUTINES,
            questionText = "Which builder returns a result?",
            options = listOf("launch", "async", "runBlocking", "withContext"),
            correctAnswer = "async",
            explanation = "async returns a Deferred value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    /* ---------- ADVANCED ---------- */
    val advanced = listOf(
        kotlinQuestion(
            id = "kt_adv_001",
            categoryId = categoryId,
            chapterId = KOTLIN_ADVANCED,
            questionText = "What does reified allow?",
            options = listOf(
                "Thread safety",
                "Runtime access to generic type",
                "Memory optimization",
                "Inlining objects"
            ),
            correctAnswer = "Runtime access to generic type",
            explanation = "Reified keeps generic type at runtime.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        ),
        kotlinQuestion(
            id = "kt_adv_002",
            categoryId = categoryId,
            chapterId = KOTLIN_ADVANCED,
            questionText = "What is structured concurrency?",
            options = listOf(
                "Parallel threads",
                "Parent waits for children",
                "Global coroutines",
                "Manual lifecycle"
            ),
            correctAnswer = "Parent waits for children",
            explanation = "It prevents coroutine leaks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    return basics +
            controlFlow +
            functions +
            collections +
            oop +
            nullSafety +
            coroutines +
            advanced
}
