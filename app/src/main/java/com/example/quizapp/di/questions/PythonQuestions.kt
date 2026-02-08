package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val PY_BASICS = "python_python_basics"
const val PY_VARS_DATA_TYPES = "python_variables_and_data_types"
const val PY_OPERATORS = "python_operators"
const val PY_FUNCTIONS = "python_functions"
const val PY_FILE_HANDLING = "python_file_handling"
const val PY_OOP = "python_oop_in_python"

/* ===============================
   HELPER FUNCTION
   =============================== */

private fun pythonQuestion(
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

fun getPythonQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    /* ---------- BASICS ---------- */
    val basics = listOf(
        pythonQuestion(
            id = "py_basic_001",
            categoryId = categoryId,
            chapterId = PY_BASICS,
            questionText = "What is the correct file extension for Python files?",
            options = listOf(".pyth", ".pt", ".py", ".pyc"),
            correctAnswer = ".py",
            explanation = "Python source files use the .py extension.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        pythonQuestion(
            id = "py_basic_002",
            categoryId = categoryId,
            chapterId = PY_BASICS,
            questionText = "Which function prints output to the screen?",
            options = listOf("echo()", "print()", "printf()", "display()"),
            correctAnswer = "print()",
            explanation = "print() sends output to the console.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- VARIABLES & DATA TYPES ---------- */
    val vars = listOf(
        pythonQuestion(
            id = "py_col_001",
            categoryId = categoryId,
            chapterId = PY_VARS_DATA_TYPES,
            questionText = "Which collection stores unique values?",
            options = listOf("List", "Tuple", "Set", "Dictionary"),
            correctAnswer = "Set",
            explanation = "Sets automatically remove duplicates.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        pythonQuestion(
            id = "py_col_002",
            categoryId = categoryId,
            chapterId = PY_VARS_DATA_TYPES,
            questionText = "Which method adds an element to the end of a list?",
            options = listOf("add()", "insert()", "append()", "push()"),
            correctAnswer = "append()",
            explanation = "append() adds an item at the end of the list.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- FUNCTIONS ---------- */
    val functions = listOf(
        pythonQuestion(
            id = "py_func_001",
            categoryId = categoryId,
            chapterId = PY_FUNCTIONS,
            questionText = "How do you define a function in Python?",
            options = listOf(
                "function myFunc():",
                "def myFunc():",
                "create myFunc():",
                "func myFunc():"
            ),
            correctAnswer = "def myFunc():",
            explanation = "Functions are defined using the def keyword.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        pythonQuestion(
            id = "py_func_002",
            categoryId = categoryId,
            chapterId = PY_FUNCTIONS,
            questionText = "What keyword returns a value from a function?",
            options = listOf("send", "give", "return", "exit"),
            correctAnswer = "return",
            explanation = "return sends a value back to the caller.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- OOP ---------- */
    val oop = listOf(
        pythonQuestion(
            id = "py_oop_001",
            categoryId = categoryId,
            chapterId = PY_OOP,
            questionText = "Which keyword is used to define a class?",
            options = listOf("struct", "define", "class", "object"),
            correctAnswer = "class",
            explanation = "Classes are defined using the class keyword.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        pythonQuestion(
            id = "py_oop_002",
            categoryId = categoryId,
            chapterId = PY_OOP,
            questionText = "What does 'self' represent in a class?",
            options = listOf(
                "The class itself",
                "The instance of the class",
                "A global object",
                "A static reference"
            ),
            correctAnswer = "The instance of the class",
            explanation = "self refers to the current object instance.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- ADVANCED ---------- */
    val advanced = listOf(
        pythonQuestion(
            id = "py_adv_001",
            categoryId = categoryId,
            chapterId = PY_BASICS, // Relocated or updated to match a category
            questionText = "What is a generator?",
            options = listOf(
                "A list builder",
                "A function returning an iterator",
                "A loop",
                "A memory allocator"
            ),
            correctAnswer = "A function returning an iterator",
            explanation = "Generators yield values lazily using yield.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        ),
        pythonQuestion(
            id = "py_adv_002",
            categoryId = categoryId,
            chapterId = PY_BASICS, // Relocated or updated
            questionText = "What does the GIL do?",
            options = listOf(
                "Improves threading speed",
                "Allows only one thread to execute Python bytecode",
                "Handles garbage collection",
                "Manages memory"
            ),
            correctAnswer = "Allows only one thread to execute Python bytecode",
            explanation = "The GIL limits true parallel threading in CPython.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    return basics + vars + functions + oop + advanced
}
