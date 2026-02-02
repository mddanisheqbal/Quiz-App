package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS
   =============================== */

const val JS_BASICS = "js_basics"
const val JS_CONTROL_FLOW = "js_control_flow"
const val JS_FUNCTIONS = "js_functions"
const val JS_ARRAYS_OBJECTS = "js_arrays_objects"
const val JS_ASYNC = "js_async"
const val JS_ES6 = "js_es6"
const val JS_ADVANCED = "js_advanced"

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

    /* ---------- CONTROL FLOW ---------- */
    val controlFlow = listOf(
        jsQuestion(
            id = "js_flow_001",
            categoryId = categoryId,
            chapterId = JS_CONTROL_FLOW,
            questionText = "How do you write an IF statement in JavaScript?",
            options = listOf(
                "if i = 5",
                "if (i == 5)",
                "if i == 5 then",
                "if i = 5 then"
            ),
            correctAnswer = "if (i == 5)",
            explanation = "JavaScript conditions use parentheses.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "js_flow_002",
            categoryId = categoryId,
            chapterId = JS_CONTROL_FLOW,
            questionText = "Which keyword is used to stop a loop?",
            options = listOf("exit", "stop", "break", "return"),
            correctAnswer = "break",
            explanation = "break exits the loop immediately.",
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

    /* ---------- ADVANCED ---------- */
    val advanced = listOf(
        jsQuestion(
            id = "js_adv_001",
            categoryId = categoryId,
            chapterId = JS_ADVANCED,
            questionText = "What is the Event Loop?",
            options = listOf(
                "UI loop",
                "Async task manager",
                "Rendering engine",
                "Thread pool"
            ),
            correctAnswer = "Async task manager",
            explanation = "Event loop manages async execution.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        ),
        jsQuestion(
            id = "js_adv_002",
            categoryId = categoryId,
            chapterId = JS_ADVANCED,
            questionText = "What is Prototype Pollution?",
            options = listOf(
                "Memory leak",
                "Security vulnerability",
                "Syntax error",
                "Garbage collection issue"
            ),
            correctAnswer = "Security vulnerability",
            explanation = "Prototype pollution can lead to attacks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    return basics +
            controlFlow +
            functions +
            arraysObjects +
            async +
            es6 +
            advanced
}
