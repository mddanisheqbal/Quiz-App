package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val JS_BASICS = "javascript_javascript_basics"
const val JS_FUNCTIONS = "javascript_functions"
const val JS_ARRAYS_OBJECTS = "javascript_arrays_and_objects"
const val JS_ASYNC = "javascript_async_javascript"
const val JS_ES6 = "javascript_es6_features"

/* ===============================
   HELPER
   =============================== */

private fun jsQuestion(
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

fun getJavaScriptQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    /* ---------- BASICS ---------- */
    val basics = listOf(
        jsQuestion(
            id = "js_basics_001",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Inside which HTML element do we put the JavaScript?",
            options = listOf("<js>", "<javascript>", "<script>", "<scripting>"),
            correctAnswer = "<script>",
            explanation = "JavaScript code is placed inside the <script> tag.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "js_basics_002",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "How do you write 'Hello World' in an alert box?",
            options = listOf(
                "msg('Hello World')",
                "alertBox('Hello World')",
                "alert('Hello World')",
                "console.log('Hello World')"
            ),
            correctAnswer = "alert('Hello World')",
            explanation = "alert() displays a popup dialog.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- FUNCTIONS ---------- */
    val functions = listOf(
        jsQuestion(
            id = "js_func_001",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "How do you create a function in JavaScript?",
            options = listOf(
                "function:myFunc()",
                "function myFunc()",
                "def myFunc()",
                "func myFunc()"
            ),
            correctAnswer = "function myFunc()",
            explanation = "Functions are declared using the function keyword.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "js_func_002",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is a Closure?",
            options = listOf(
                "A closed function",
                "A function with access to its lexical scope",
                "A syntax error",
                "A memory leak"
            ),
            correctAnswer = "A function with access to its lexical scope",
            explanation = "Closures allow access to outer variables even after execution.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- ARRAYS & OBJECTS ---------- */
    val arraysObjects = listOf(
        jsQuestion(
            id = "js_arr_001",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method adds an element to the end of an array?",
            options = listOf("push()", "pop()", "shift()", "unshift()"),
            correctAnswer = "push()",
            explanation = "push() appends elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "js_arr_002",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "What does map() return?",
            options = listOf(
                "Single value",
                "Boolean",
                "New transformed array",
                "Nothing"
            ),
            correctAnswer = "New transformed array",
            explanation = "map() transforms each element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- ASYNC ---------- */
    val async = listOf(
        jsQuestion(
            id = "js_async_001",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "What is a Promise?",
            options = listOf(
                "Loop",
                "Object representing async result",
                "Callback",
                "Thread"
            ),
            correctAnswer = "Object representing async result",
            explanation = "Promises handle async operations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        ),
        jsQuestion(
            id = "js_async_002",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "What does async/await improve?",
            options = listOf(
                "Speed",
                "Syntax readability",
                "Memory",
                "Security"
            ),
            correctAnswer = "Syntax readability",
            explanation = "Async/await simplifies Promise usage.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- ES6 ---------- */
    val es6 = listOf(
        jsQuestion(
            id = "js_es6_001",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which keyword declares a block-scoped variable?",
            options = listOf("var", "let", "global", "static"),
            correctAnswer = "let",
            explanation = "let is block scoped.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "js_es6_002",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "What is the spread operator used for?",
            options = listOf(
                "Loops",
                "Expanding iterables",
                "Sorting arrays",
                "Memory cleanup"
            ),
            correctAnswer = "Expanding iterables",
            explanation = "Spread expands values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    return basics + functions + arraysObjects + async + es6
}
