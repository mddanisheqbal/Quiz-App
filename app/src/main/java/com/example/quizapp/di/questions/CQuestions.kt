package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

// =====================================================
// C CHAPTER IDS (MUST MATCH ChapterScreen + filtering)
// =====================================================
const val C_BASICS = "c_basics"
const val C_DATA_TYPES = "c_data_types"
const val C_OPERATORS = "c_operators"
const val C_CONTROL_FLOW = "c_control_flow"

// =====================================================
// HELPER FUNCTION (SINGLE SOURCE OF TRUTH)
// =====================================================
private fun cQuestion(
    id: String,
    categoryId: String,
    chapterId: String,
    questionText: String,
    options: List<String>,
    correctAnswer: String,
    explanation: String,
    difficulty: Difficulty,
    createdAt: String,
    questionType: QuestionType = QuestionType.MULTIPLE_CHOICE,
    timeLimit: Int = 30,
    points: Int = 10
): Question {
    return Question(
        id = id,                 // STABLE ID (NO UUID)
        categoryId = categoryId, // Language ID (C)
        chapterId = chapterId,   // Chapter ID (VERY IMPORTANT)
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

// =====================================================
// MAIN ENTRY FUNCTION
// =====================================================
fun getCQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    // -------------------- C BASICS --------------------
    val basics = listOf(
        cQuestion(
            id = "c_basics_001",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Who developed the C language?",
            options = listOf(
                "Dennis Ritchie",
                "Bjarne Stroustrup",
                "James Gosling",
                "Guido van Rossum"
            ),
            correctAnswer = "Dennis Ritchie",
            explanation = "Dennis Ritchie developed the C language at Bell Labs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_basics_002",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which function is the entry point of a C program?",
            options = listOf("start()", "main()", "init()", "begin()"),
            correctAnswer = "main()",
            explanation = "Execution of a C program always starts from main().",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    // -------------------- DATA TYPES --------------------
    val dataTypes = listOf(
        cQuestion(
            id = "c_data_types_001",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type occupies exactly one byte in C?",
            options = listOf("char", "int", "float", "double"),
            correctAnswer = "char",
            explanation = "char is defined as exactly one byte in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_data_types_002",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which format specifier is used for float?",
            options = listOf("%f", "%d", "%c", "%s"),
            correctAnswer = "%f",
            explanation = "%f is used to print float values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    // -------------------- OPERATORS --------------------
    val operators = listOf(
        cQuestion(
            id = "c_operators_001",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator gives the remainder?",
            options = listOf("%", "/", "*", "+"),
            correctAnswer = "%",
            explanation = "% is the modulus operator.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_operators_002",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the result of 5 / 2 in C?",
            options = listOf("2", "2.5", "3", "Error"),
            correctAnswer = "2",
            explanation = "Integer division truncates the decimal part.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    // -------------------- CONTROL FLOW --------------------
    val controlFlow = listOf(
        cQuestion(
            id = "c_control_flow_001",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword starts a conditional statement?",
            options = listOf("if", "for", "switch", "goto"),
            correctAnswer = "if",
            explanation = "The if keyword is used for conditional execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_control_flow_002",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which loop executes at least once?",
            options = listOf("do-while", "while", "for", "foreach"),
            correctAnswer = "do-while",
            explanation = "do-while checks the condition after execution.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        )
    )

    // -------------------- RETURN ALL QUESTIONS --------------------
    return basics + dataTypes + operators + controlFlow
}
