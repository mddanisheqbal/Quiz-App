package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS
   =============================== */

const val PY_BASICS = "python_basics"
const val PY_CONTROL_FLOW = "python_control_flow"
const val PY_FUNCTIONS = "python_functions"
const val PY_COLLECTIONS = "python_collections"
const val PY_OOP = "python_oop"
const val PY_EXCEPTIONS = "python_exceptions"
const val PY_ADVANCED = "python_advanced"

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

    /* ---------- CONTROL FLOW ---------- */
    val controlFlow = listOf(
        pythonQuestion(
            id = "py_flow_001",
            categoryId = categoryId,
            chapterId = PY_CONTROL_FLOW,
            questionText = "Which keyword is used for conditional execution?",
            options = listOf("check", "if", "case", "when"),
            correctAnswer = "if",
            explanation = "if is used to execute code conditionally.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        pythonQuestion(
            id = "py_flow_002",
            categoryId = categoryId,
            chapterId = PY_CONTROL_FLOW,
            questionText = "Which keyword exits a loop completely?",
            options = listOf("stop", "exit", "break", "continue"),
            correctAnswer = "break",
            explanation = "break immediately exits the loop.",
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

    /* ---------- COLLECTIONS ---------- */
    val collections = listOf(
        pythonQuestion(
            id = "py_col_001",
            categoryId = categoryId,
            chapterId = PY_COLLECTIONS,
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
            chapterId = PY_COLLECTIONS,
            questionText = "Which method adds an element to the end of a list?",
            options = listOf("add()", "insert()", "append()", "push()"),
            correctAnswer = "append()",
            explanation = "append() adds an item at the end of the list.",
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

    /* ---------- EXCEPTIONS ---------- */
    val exceptions = listOf(
        pythonQuestion(
            id = "py_exc_001",
            categoryId = categoryId,
            chapterId = PY_EXCEPTIONS,
            questionText = "How do you handle errors in Python?",
            options = listOf("try-catch", "try-except", "do-except", "error-handle"),
            correctAnswer = "try-except",
            explanation = "Python uses try-except blocks.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        pythonQuestion(
            id = "py_exc_002",
            categoryId = categoryId,
            chapterId = PY_EXCEPTIONS,
            questionText = "Which block always executes?",
            options = listOf("catch", "else", "finally", "always"),
            correctAnswer = "finally",
            explanation = "finally runs regardless of errors.",
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
            chapterId = PY_ADVANCED,
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
            chapterId = PY_ADVANCED,
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

    return basics +
            controlFlow +
            functions +
            collections +
            oop +
            exceptions +
            advanced
}
