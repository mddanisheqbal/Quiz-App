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
const val PY_CONDITIONAL_STATEMENTS = "python_conditional_statements"
const val PY_LOOPS = "python_loops"
const val PY_LISTS_TUPLES = "python_lists_and_tuples"
const val PY_SETS_DICTS = "python_sets_and_dictionaries"
const val PY_FUNCTIONS = "python_functions"
const val PY_MODULES_PACKAGES = "python_modules_and_packages"
const val PY_FILE_HANDLING = "python_file_handling"
const val PY_EXCEPTION_HANDLING = "python_exception_handling"
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

    val questions = mutableListOf<Question>()

    /* ---------- 1. Python Basics ---------- */
    questions.add(pythonQuestion(
        id = "py_basics_001",
        categoryId = categoryId,
        chapterId = PY_BASICS,
        questionText = "Who developed Python Programming Language?",
        options = listOf("Wick van Rossum", "Rasmus Lerdorf", "Guido van Rossum", "Niene Stom"),
        correctAnswer = "Guido van Rossum",
        explanation = "Python was created by Guido van Rossum and first released in 1991.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 2. Variables & Data Types ---------- */
    questions.add(pythonQuestion(
        id = "py_vars_001",
        categoryId = categoryId,
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is an invalid variable name in Python?",
        options = listOf("my_var", "_var", "2var", "var2"),
        correctAnswer = "2var",
        explanation = "Variable names cannot start with a digit.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 3. Operators ---------- */
    questions.add(pythonQuestion(
        id = "py_ops_001",
        categoryId = categoryId,
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used for exponentiation (power) in Python?",
        options = listOf("^", "**", "//", "%"),
        correctAnswer = "**",
        explanation = "** is the exponentiation operator in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 4. Conditional Statements ---------- */
    questions.add(pythonQuestion(
        id = "py_cond_001",
        categoryId = categoryId,
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which keyword is used for else-if in Python?",
        options = listOf("elseif", "else if", "elif", "elif-if"),
        correctAnswer = "elif",
        explanation = "elif is the shorthand for else if in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 5. Loops ---------- */
    questions.add(pythonQuestion(
        id = "py_loops_001",
        categoryId = categoryId,
        chapterId = PY_LOOPS,
        questionText = "Which loop is used to iterate over a sequence (like a list or string)?",
        options = listOf("while", "for", "do-while", "foreach"),
        correctAnswer = "for",
        explanation = "The for loop is used for iterating over a sequence.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 6. Lists & Tuples ---------- */
    questions.add(pythonQuestion(
        id = "py_lists_001",
        categoryId = categoryId,
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which statement is true about Tuples?",
        options = listOf("Tuples are mutable", "Tuples are immutable", "Tuples use square brackets", "Tuples cannot contain duplicates"),
        correctAnswer = "Tuples are immutable",
        explanation = "Tuples are immutable sequences in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 7. Sets & Dictionaries ---------- */
    questions.add(pythonQuestion(
        id = "py_sets_001",
        categoryId = categoryId,
        chapterId = PY_SETS_DICTS,
        questionText = "How do you access a value in a dictionary?",
        options = listOf("Using index", "Using key", "Using value", "Using position"),
        correctAnswer = "Using key",
        explanation = "Dictionary values are accessed using their corresponding keys.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 8. Functions ---------- */
    questions.add(pythonQuestion(
        id = "py_funcs_001",
        categoryId = categoryId,
        chapterId = PY_FUNCTIONS,
        questionText = "Which keyword is used to create a function in Python?",
        options = listOf("function", "def", "fun", "define"),
        correctAnswer = "def",
        explanation = "Functions are defined using the 'def' keyword.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 9. Modules & Packages ---------- */
    questions.add(pythonQuestion(
        id = "py_mods_001",
        categoryId = categoryId,
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which keyword is used to import a module?",
        options = listOf("include", "using", "import", "require"),
        correctAnswer = "import",
        explanation = "The 'import' keyword is used to bring in modules.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 10. File Handling ---------- */
    questions.add(pythonQuestion(
        id = "py_files_001",
        categoryId = categoryId,
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode is used to open a file for reading in Python?",
        options = listOf("'w'", "'a'", "'r'", "'x'"),
        correctAnswer = "'r'",
        explanation = "'r' stands for read mode.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 11. Exception Handling ---------- */
    questions.add(pythonQuestion(
        id = "py_exc_001",
        categoryId = categoryId,
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block is used to catch exceptions in Python?",
        options = listOf("catch", "except", "try", "finally"),
        correctAnswer = "except",
        explanation = "Python uses 'try...except' blocks for exception handling.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    /* ---------- 12. OOP in Python ---------- */
    questions.add(pythonQuestion(
        id = "py_oop_001",
        categoryId = categoryId,
        chapterId = PY_OOP,
        questionText = "What is the name of the constructor method in Python classes?",
        options = listOf("__init__()", "constructor()", "new()", "init()"),
        correctAnswer = "__init__()",
        explanation = "__init__ is the special method called when an object is instantiated.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    return questions
}
