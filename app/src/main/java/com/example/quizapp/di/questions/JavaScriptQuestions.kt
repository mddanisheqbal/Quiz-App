package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val JS_BASICS = "javascript_javascript_basics"
const val JS_VARS_DATA_TYPES = "javascript_variables_and_data_types"
const val JS_OPERATORS = "javascript_operators"
const val JS_CONDITIONAL_STATEMENTS = "javascript_conditional_statements"
const val JS_LOOPS = "javascript_loops"
const val JS_FUNCTIONS = "javascript_functions"
const val JS_ARRAYS_OBJECTS = "javascript_arrays_and_objects"
const val JS_DOM_MANIPULATION = "javascript_dom_manipulation"
const val JS_EVENTS = "javascript_events"
const val JS_ES6 = "javascript_es6_features"
const val JS_ASYNC = "javascript_async_javascript"
const val JS_ERROR_HANDLING = "javascript_error_handling"

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
    return listOf(
        jsQuestion(
            id = "javascript_javascript_basics_001",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which HTML tag is used to include JavaScript code?",
            options = listOf("<js>", "<javascript>", "<script>", "<code>"),
            correctAnswer = "<script>",
            explanation = "JavaScript code is written inside the <script> tag in HTML.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_002",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which keyword is used to declare a variable in JavaScript?",
            options = listOf("var", "int", "let", "Both var and let"),
            correctAnswer = "Both var and let",
            explanation = "JavaScript allows variable declaration using var, let, and const.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_003",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "JavaScript is a _____ language.",
            options = listOf("compiled", "interpreted", "markup", "assembly"),
            correctAnswer = "interpreted",
            explanation = "JavaScript is interpreted by the browser at runtime.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_004",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which symbol is used for single-line comments in JavaScript?",
            options = listOf("<!-- -->", "//", "/* */", "#"),
            correctAnswer = "//",
            explanation = "Single-line comments in JavaScript start with //.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_005",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which of the following is a valid JavaScript variable name?",
            options = listOf("2value", "value-2", "_value", "var"),
            correctAnswer = "_value",
            explanation = "Variable names can start with letters, underscore, or $.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_006",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the output of: typeof null?",
            options = listOf("null", "object", "undefined", "number"),
            correctAnswer = "object",
            explanation = "This is a well-known JavaScript bug where typeof null returns object.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_007",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which keyword is used to define a constant in JavaScript?",
            options = listOf("var", "let", "final", "const"),
            correctAnswer = "const",
            explanation = "const declares a variable whose value cannot be reassigned.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_008",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which data type is NOT primitive in JavaScript?",
            options = listOf("Number", "String", "Boolean", "Object"),
            correctAnswer = "Object",
            explanation = "Object is a non-primitive data type in JavaScript.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_009",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What will Boolean(0) return?",
            options = listOf("true", "false", "undefined", "error"),
            correctAnswer = "false",
            explanation = "0 is treated as a falsy value in JavaScript.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_010",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which operator is used for strict equality?",
            options = listOf("==", "=", "===", "!="),
            correctAnswer = "===",
            explanation = "=== checks both value and data type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_011",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the default value of an uninitialized variable?",
            options = listOf("null", "0", "undefined", "NaN"),
            correctAnswer = "undefined",
            explanation = "Variables declared but not assigned have the value undefined.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_012",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which function converts a string to an integer?",
            options = listOf("parseInt()", "parseFloat()", "Number()", "String()"),
            correctAnswer = "parseInt()",
            explanation = "parseInt() parses a string and returns an integer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_013",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What will NaN === NaN return?",
            options = listOf("true", "false", "undefined", "error"),
            correctAnswer = "false",
            explanation = "NaN is not equal to itself in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_014",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which keyword stops variable redeclaration in the same scope?",
            options = listOf("var", "let", "const", "static"),
            correctAnswer = "let",
            explanation = "let does not allow redeclaration in the same block scope.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_015",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What does isNaN('10') return?",
            options = listOf("true", "false", "NaN", "error"),
            correctAnswer = "false",
            explanation = "'10' can be converted to a number, so it is not NaN.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_016",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which value is considered falsy?",
            options = listOf("[]", "{}", "0", "function(){}"),
            correctAnswer = "0",
            explanation = "0 is a falsy value, others are truthy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_017",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the result of typeof undefined?",
            options = listOf("null", "object", "undefined", "string"),
            correctAnswer = "undefined",
            explanation = "typeof undefined returns undefined.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_018",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which operator is used to concatenate strings?",
            options = listOf("+", "-", "*", "&"),
            correctAnswer = "+",
            explanation = "+ operator is used for string concatenation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_019",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What will 2 + '2' evaluate to?",
            options = listOf("4", "22", "NaN", "error"),
            correctAnswer = "22",
            explanation = "Number is converted to string and concatenated.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_020",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which keyword has function scope?",
            options = listOf("let", "const", "var", "static"),
            correctAnswer = "var",
            explanation = "var is function-scoped, not block-scoped.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_021",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What does Number('abc') return?",
            options = listOf("0", "undefined", "NaN", "error"),
            correctAnswer = "NaN",
            explanation = "Non-numeric strings cannot be converted to numbers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_022",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which statement is true about JavaScript?",
            options = listOf(
                "It is case-insensitive",
                "It is object-based",
                "It requires compilation",
                "It cannot run in browser"
            ),
            correctAnswer = "It is object-based",
            explanation = "JavaScript is an object-based scripting language.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_023",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the result of '5' - 2?",
            options = listOf("3", "52", "NaN", "error"),
            correctAnswer = "3",
            explanation = "JavaScript converts string to number for subtraction.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_024",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which value is NOT falsy?",
            options = listOf("false", "null", "''", "[]"),
            correctAnswer = "[]",
            explanation = "Empty array is truthy in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_025",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What does typeof NaN return?",
            options = listOf("NaN", "number", "undefined", "object"),
            correctAnswer = "number",
            explanation = "NaN is considered a number type in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_026",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which function checks if a value is a number?",
            options = listOf("isNaN()", "Number()", "parseInt()", "typeof"),
            correctAnswer = "isNaN()",
            explanation = "isNaN() checks whether a value is Not-a-Number.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_027",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the output of Boolean('')?",
            options = listOf("true", "false", "null", "error"),
            correctAnswer = "false",
            explanation = "Empty string is a falsy value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_028",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which operator checks both value and type?",
            options = listOf("==", "=", "===", "!=="),
            correctAnswer = "===",
            explanation = "=== compares value and data type strictly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_029",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What will undefined + 1 return?",
            options = listOf("1", "undefined", "NaN", "error"),
            correctAnswer = "NaN",
            explanation = "undefined cannot be converted to a valid number.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_030",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which keyword creates a block-scoped variable?",
            options = listOf("var", "static", "let", "global"),
            correctAnswer = "let",
            explanation = "let is block-scoped and safer than var.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_031",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What does '===' avoid compared to '=='?",
            options = listOf(
                "Comparison",
                "Type coercion",
                "Logical checks",
                "Syntax errors"
            ),
            correctAnswer = "Type coercion",
            explanation = "=== avoids automatic type conversion.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_032",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which value results in NaN?",
            options = listOf("10 / 2", "0 / 0", "'10' * 2", "true + 1"),
            correctAnswer = "0 / 0",
            explanation = "0 divided by 0 results in NaN.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_033",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the output of typeof []?",
            options = listOf("array", "object", "list", "undefined"),
            correctAnswer = "object",
            explanation = "Arrays are treated as objects in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_034",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which statement declares multiple variables correctly?",
            options = listOf(
                "var a = b = c = 1",
                "var a, b, c = 1",
                "var a=1, b=2, c=3",
                "int a=1,b=2"
            ),
            correctAnswer = "var a=1, b=2, c=3",
            explanation = "Multiple variables can be declared in a single statement.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_035",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which keyword cannot be reassigned?",
            options = listOf("var", "let", "const", "mutable"),
            correctAnswer = "const",
            explanation = "const variables cannot be reassigned.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_036",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What does null represent?",
            options = listOf(
                "An undeclared variable",
                "An intentional empty value",
                "A number",
                "A syntax error"
            ),
            correctAnswer = "An intentional empty value",
            explanation = "null means no value assigned deliberately.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_037",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which conversion happens in '5' * '2'?",
            options = listOf(
                "String concatenation",
                "Implicit number conversion",
                "Boolean conversion",
                "Error"
            ),
            correctAnswer = "Implicit number conversion",
            explanation = "JavaScript converts strings to numbers for multiplication.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_038",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the output of !!'Hello'?",
            options = listOf("true", "false", "undefined", "NaN"),
            correctAnswer = "true",
            explanation = "Non-empty strings are truthy; double ! converts to boolean.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_039",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which statement about JavaScript is correct?",
            options = listOf(
                "It supports classes only",
                "It is strongly typed",
                "It is dynamically typed",
                "It does not support objects"
            ),
            correctAnswer = "It is dynamically typed",
            explanation = "Variable types are determined at runtime.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_040",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What does parseFloat('10.5px') return?",
            options = listOf("10", "10.5", "NaN", "error"),
            correctAnswer = "10.5",
            explanation = "parseFloat reads numeric value until invalid character.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_041",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which value is truthy?",
            options = listOf("0", "''", "null", "'0'"),
            correctAnswer = "'0'",
            explanation = "Non-empty strings are truthy even if they contain 0.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_042",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the result of typeof function(){}?",
            options = listOf("function", "object", "undefined", "class"),
            correctAnswer = "function",
            explanation = "Functions have their own type in JavaScript.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_043",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which value will result in false when converted to Boolean?",
            options = listOf("{}", "[]", "''", "'false'"),
            correctAnswer = "''",
            explanation = "Empty string is a falsy value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_044",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "What is the output of 1 + true?",
            options = listOf("true1", "2", "NaN", "error"),
            correctAnswer = "2",
            explanation = "true is converted to 1 in numeric context.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_javascript_basics_045",
            categoryId = categoryId,
            chapterId = JS_BASICS,
            questionText = "Which feature allows JavaScript to change variable type?",
            options = listOf(
                "Static typing",
                "Dynamic typing",
                "Compilation",
                "Hoisting"
            ),
            correctAnswer = "Dynamic typing",
            explanation = "JavaScript variables can change type at runtime.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_variables_and_data_types_001",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which keyword allows variable redeclaration in the same scope?",
            options = listOf("let", "const", "var", "static"),
            correctAnswer = "var",
            explanation = "var allows redeclaration within the same function scope, unlike let and const.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_002",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which data type is returned by typeof 'Hello'?",
            options = listOf("String", "text", "string", "char"),
            correctAnswer = "string",
            explanation = "typeof always returns type names in lowercase.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_003",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the default value of a declared but unassigned variable?",
            options = listOf("null", "0", "undefined", "NaN"),
            correctAnswer = "undefined",
            explanation = "Variables without assigned values are undefined by default.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_004",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which keyword creates a block-scoped variable?",
            options = listOf("var", "global", "let", "this"),
            correctAnswer = "let",
            explanation = "let is block-scoped and avoids scope-related bugs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_005",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value represents an intentional absence of value?",
            options = listOf("undefined", "NaN", "null", "false"),
            correctAnswer = "null",
            explanation = "null is explicitly assigned to indicate no value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_006",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which of the following is a primitive data type?",
            options = listOf("Object", "Array", "Function", "Number"),
            correctAnswer = "Number",
            explanation = "Number is a primitive type; others are objects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_007",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What will typeof null return?",
            options = listOf("null", "object", "undefined", "number"),
            correctAnswer = "object",
            explanation = "This is a known JavaScript quirk kept for backward compatibility.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_008",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which data type can store true or false?",
            options = listOf("Number", "String", "Boolean", "Object"),
            correctAnswer = "Boolean",
            explanation = "Boolean represents logical true or false values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_009",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value is considered falsy?",
            options = listOf("{}", "[]", "0", "'false'"),
            correctAnswer = "0",
            explanation = "0 is falsy, while objects and non-empty strings are truthy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_010",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the result of typeof NaN?",
            options = listOf("NaN", "number", "undefined", "object"),
            correctAnswer = "number",
            explanation = "NaN is treated as a number type in JavaScript.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_011",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which keyword prevents reassignment of a variable?",
            options = listOf("var", "let", "const", "lock"),
            correctAnswer = "const",
            explanation = "const variables cannot be reassigned after initialization.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_012",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What does typeof undefined return?",
            options = listOf("null", "object", "undefined", "NaN"),
            correctAnswer = "undefined",
            explanation = "typeof returns undefined for undefined values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_013",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value is NOT a primitive type?",
            options = listOf("String", "Number", "Boolean", "Object"),
            correctAnswer = "Object",
            explanation = "Objects are non-primitive reference types.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_014",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What happens when a variable is used without declaration?",
            options = listOf(
                "Syntax error",
                "It becomes global",
                "It becomes constant",
                "It is ignored"
            ),
            correctAnswer = "It becomes global",
            explanation = "In non-strict mode, undeclared variables become global.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_015",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which data type is returned by typeof []?",
            options = listOf("array", "object", "list", "undefined"),
            correctAnswer = "object",
            explanation = "Arrays are internally treated as objects.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_016",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the value of Boolean('')?",
            options = listOf("true", "false", "null", "undefined"),
            correctAnswer = "false",
            explanation = "Empty strings are falsy values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_017",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which type conversion occurs in '5' * 2?",
            options = listOf(
                "String concatenation",
                "Implicit number conversion",
                "Boolean conversion",
                "Error"
            ),
            correctAnswer = "Implicit number conversion",
            explanation = "JavaScript converts strings to numbers for arithmetic.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_018",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What will Number('10px') return?",
            options = listOf("10", "10px", "NaN", "undefined"),
            correctAnswer = "NaN",
            explanation = "Number() fails if the string is not purely numeric.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_019",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which data type can store large integers safely?",
            options = listOf("Number", "Float", "BigInt", "Double"),
            correctAnswer = "BigInt",
            explanation = "BigInt handles integers beyond Number safe limits.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_020",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the output of typeof true?",
            options = listOf("bool", "boolean", "Boolean", "logic"),
            correctAnswer = "boolean",
            explanation = "Boolean values return 'boolean' with typeof.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_021",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value is truthy?",
            options = listOf("0", "null", "undefined", "'0'"),
            correctAnswer = "'0'",
            explanation = "Non-empty strings are always truthy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_022",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which variable type allows reassignment but not redeclaration?",
            options = listOf("var", "const", "let", "static"),
            correctAnswer = "let",
            explanation = "let allows reassignment but not redeclaration in the same scope.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_023",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What does typeof function(){} return?",
            options = listOf("object", "function", "method", "undefined"),
            correctAnswer = "function",
            explanation = "Functions have a special type called function.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_024",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value will result in NaN?",
            options = listOf("10 / 2", "'10' - 2", "0 / 0", "true + 1"),
            correctAnswer = "0 / 0",
            explanation = "Division of zero by zero results in NaN.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_025",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which statement about JavaScript typing is correct?",
            options = listOf(
                "Statically typed",
                "Strongly typed",
                "Dynamically typed",
                "Loosely compiled"
            ),
            correctAnswer = "Dynamically typed",
            explanation = "Variable types are determined at runtime.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_026",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the value of typeof BigInt(10)?",
            options = listOf("number", "bigint", "object", "integer"),
            correctAnswer = "bigint",
            explanation = "BigInt has its own primitive type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_027",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which conversion happens in Boolean([])?",
            options = listOf("true", "false", "NaN", "error"),
            correctAnswer = "true",
            explanation = "Empty arrays are truthy in JavaScript.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_028",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value represents 'not a number'?",
            options = listOf("null", "undefined", "NaN", "false"),
            correctAnswer = "NaN",
            explanation = "NaN indicates an invalid numeric operation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_029",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the result of '5' + 2?",
            options = listOf("7", "52", "NaN", "error"),
            correctAnswer = "52",
            explanation = "The + operator concatenates when one operand is a string.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_030",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which keyword is hoisted with undefined value?",
            options = listOf("let", "const", "var", "class"),
            correctAnswer = "var",
            explanation = "var declarations are hoisted and initialized as undefined.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_031",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which data type stores key-value pairs?",
            options = listOf("Array", "Object", "String", "Set"),
            correctAnswer = "Object",
            explanation = "Objects store data as key-value pairs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_032",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the value of typeof Symbol('id')?",
            options = listOf("object", "symbol", "string", "unique"),
            correctAnswer = "symbol",
            explanation = "Symbol is a primitive data type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_033",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value is falsy?",
            options = listOf("{}", "[]", "' '", "null"),
            correctAnswer = "null",
            explanation = "null is a falsy value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_034",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which method converts value to string?",
            options = listOf("String()", "Number()", "parseInt()", "Boolean()"),
            correctAnswer = "String()",
            explanation = "String() explicitly converts values to string.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_035",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What does undefined indicate?",
            options = listOf(
                "Empty value",
                "Missing declaration",
                "Unassigned variable",
                "False condition"
            ),
            correctAnswer = "Unassigned variable",
            explanation = "undefined means a variable has no assigned value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_036",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which type is returned by typeof {}?",
            options = listOf("object", "map", "json", "dictionary"),
            correctAnswer = "object",
            explanation = "Plain objects return object as type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_037",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the value of Boolean(1)?",
            options = listOf("true", "false", "NaN", "undefined"),
            correctAnswer = "true",
            explanation = "Non-zero numbers are truthy.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_038",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value cannot be changed once assigned?",
            options = listOf("let variable", "var variable", "const variable", "global variable"),
            correctAnswer = "const variable",
            explanation = "const prevents reassignment.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_039",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the result of typeof (10 + '5')?",
            options = listOf("number", "string", "NaN", "undefined"),
            correctAnswer = "string",
            explanation = "Addition with string results in string concatenation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_040",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which primitive type represents unique identifiers?",
            options = listOf("String", "BigInt", "Symbol", "Object"),
            correctAnswer = "Symbol",
            explanation = "Symbol creates unique and immutable identifiers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_041",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the output of typeof false?",
            options = listOf("bool", "Boolean", "boolean", "logic"),
            correctAnswer = "boolean",
            explanation = "typeof returns lowercase boolean.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_042",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which value results in false when converted to Boolean?",
            options = listOf("[]", "{}", "1", "undefined"),
            correctAnswer = "undefined",
            explanation = "undefined is a falsy value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_043",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "What is the type of Infinity?",
            options = listOf("object", "number", "undefined", "NaN"),
            correctAnswer = "number",
            explanation = "Infinity is a numeric value in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_044",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which operator is used to assign a value?",
            options = listOf("==", "===", "=", "=>"),
            correctAnswer = "=",
            explanation = "The = operator assigns values to variables.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_variables_and_data_types_045",
            categoryId = categoryId,
            chapterId = JS_VARS_DATA_TYPES,
            questionText = "Which data type is mutable?",
            options = listOf("String", "Number", "Boolean", "Object"),
            correctAnswer = "Object",
            explanation = "Objects can be modified after creation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_operators_001",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is used to assign a value to a variable?",
            options = listOf("==", "===", "=", "=>"),
            correctAnswer = "=",
            explanation = "The assignment operator (=) is used to assign values to variables.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_002",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator checks both value and type?",
            options = listOf("==", "=", "===", "!="),
            correctAnswer = "===",
            explanation = "=== performs strict comparison without type conversion.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_003",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 5 == '5'?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "true",
            explanation = "== allows type coercion, so number and string are compared as equal.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_004",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 5 === '5'?",
            options = listOf("true", "false", "NaN", "error"),
            correctAnswer = "false",
            explanation = "=== does not allow type conversion, so number and string are not equal.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_005",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is used for string concatenation?",
            options = listOf("+", "-", "*", "&"),
            correctAnswer = "+",
            explanation = "+ concatenates strings when at least one operand is a string.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_006",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What will be the result of '10' + 5?",
            options = listOf("15", "105", "NaN", "error"),
            correctAnswer = "105",
            explanation = "The + operator converts number to string and concatenates.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_007",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is used to find remainder?",
            options = listOf("/", "%", "*", "//"),
            correctAnswer = "%",
            explanation = "% returns the remainder after division.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_008",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 10 % 3?",
            options = listOf("1", "3", "0", "10"),
            correctAnswer = "1",
            explanation = "10 divided by 3 leaves a remainder of 1.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_009",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator increments a value by 1?",
            options = listOf("--", "+=", "++", "+"),
            correctAnswer = "++",
            explanation = "The increment operator (++) increases value by one.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_010",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of let a = 5; a++; ?",
            options = listOf("5", "6", "error", "undefined"),
            correctAnswer = "6",
            explanation = "Post-increment increases the value after evaluation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_011",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator performs logical AND?",
            options = listOf("&", "&&", "|", "||"),
            correctAnswer = "&&",
            explanation = "&& returns true only if both operands are true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_012",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of true && false?",
            options = listOf("true", "false", "undefined", "error"),
            correctAnswer = "false",
            explanation = "Logical AND returns false if any operand is false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_013",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator performs logical OR?",
            options = listOf("||", "|", "&&", "&"),
            correctAnswer = "||",
            explanation = "|| returns true if at least one operand is true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_014",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What will false || true return?",
            options = listOf("false", "true", "null", "error"),
            correctAnswer = "true",
            explanation = "Logical OR returns true if any condition is true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_015",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator negates a boolean value?",
            options = listOf("~", "!", "&&", "^"),
            correctAnswer = "!",
            explanation = "! converts true to false and false to true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_016",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of !true?",
            options = listOf("true", "false", "undefined", "error"),
            correctAnswer = "false",
            explanation = "The NOT operator reverses the boolean value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_017",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator checks inequality with type?",
            options = listOf("!=", "!==", "==", "="),
            correctAnswer = "!==",
            explanation = "!== compares both value and type for inequality.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_018",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 5 != '5'?",
            options = listOf("true", "false", "error", "NaN"),
            correctAnswer = "false",
            explanation = "!= allows type coercion, so values are considered equal.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_019",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 5 !== '5'?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "true",
            explanation = "!== checks type as well, so number and string are different.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_020",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator has the highest precedence?",
            options = listOf("=", "*", "++", "+"),
            correctAnswer = "++",
            explanation = "Increment operator has higher precedence than arithmetic operators.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_021",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What will be the result of 2 * 3 + 4?",
            options = listOf("10", "14", "20", "24"),
            correctAnswer = "10",
            explanation = "Multiplication is evaluated before addition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_022",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is used for exponentiation?",
            options = listOf("^", "**", "pow", "exp"),
            correctAnswer = "**",
            explanation = "** raises the left operand to the power of right operand.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_023",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 2 ** 3?",
            options = listOf("6", "8", "9", "16"),
            correctAnswer = "8",
            explanation = "2 raised to the power of 3 equals 8.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_024",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is known as ternary operator?",
            options = listOf("?:", "??", "::", "&&"),
            correctAnswer = "?:",
            explanation = "The ternary operator is a shorthand for if-else.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_025",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator returns first truthy value?",
            options = listOf("&&", "||", "!", "??"),
            correctAnswer = "||",
            explanation = "Logical OR returns the first truthy operand.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_026",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 0 || 5?",
            options = listOf("0", "false", "5", "undefined"),
            correctAnswer = "5",
            explanation = "|| returns the first truthy value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_027",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator returns first falsy value?",
            options = listOf("||", "&&", "!", "??"),
            correctAnswer = "&&",
            explanation = "&& returns the first falsy operand.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_028",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 5 && 0?",
            options = listOf("5", "0", "true", "false"),
            correctAnswer = "0",
            explanation = "&& stops at the first falsy value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_029",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator checks for null or undefined only?",
            options = listOf("||", "&&", "??", "?:"),
            correctAnswer = "??",
            explanation = "Nullish coalescing checks only null or undefined.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_030",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of null ?? 'JS'?",
            options = listOf("null", "'JS'", "undefined", "error"),
            correctAnswer = "'JS'",
            explanation = "?? returns the right operand when left is null or undefined.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_031",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is used to check type?",
            options = listOf("instanceof", "typeof", "check", "is"),
            correctAnswer = "typeof",
            explanation = "typeof returns the data type of a value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_032",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of typeof NaN?",
            options = listOf("NaN", "number", "undefined", "object"),
            correctAnswer = "number",
            explanation = "NaN is considered a number type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_033",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator checks object instance?",
            options = listOf("typeof", "instanceof", "in", "is"),
            correctAnswer = "instanceof",
            explanation = "instanceof checks prototype relationship.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_034",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What does 'x' in obj check?",
            options = listOf(
                "Value comparison",
                "Key existence",
                "Type checking",
                "Index access"
            ),
            correctAnswer = "Key existence",
            explanation = "The in operator checks if a property exists in object.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_035",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is right associative?",
            options = listOf("=", "+", "*", "%"),
            correctAnswer = "=",
            explanation = "Assignment operators are right associative.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_036",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of let a = b = 5?",
            options = listOf(
                "Syntax error",
                "a = 5, b = 5",
                "a undefined, b 5",
                "a 5, b undefined"
            ),
            correctAnswer = "a = 5, b = 5",
            explanation = "Assignment is right associative in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_037",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator converts value to boolean implicitly?",
            options = listOf("!!", "!", "Boolean", "&&"),
            correctAnswer = "!!",
            explanation = "Double NOT converts any value to boolean.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_038",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of !!0?",
            options = listOf("true", "false", "0", "NaN"),
            correctAnswer = "false",
            explanation = "0 is falsy, double NOT converts it to false.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_039",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator performs bitwise AND?",
            options = listOf("&&", "&", "|", "^"),
            correctAnswer = "&",
            explanation = "& performs bitwise AND on numbers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_040",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What is the result of 5 & 1?",
            options = listOf("0", "1", "4", "5"),
            correctAnswer = "1",
            explanation = "Bitwise AND compares binary representations.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_041",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator performs bitwise OR?",
            options = listOf("||", "|", "&&", "&"),
            correctAnswer = "|",
            explanation = "| performs bitwise OR operation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_042",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator shifts bits to the left?",
            options = listOf(">>", "<<", ">>>", "^"),
            correctAnswer = "<<",
            explanation = "<< shifts bits to the left.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_043",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "What does the comma operator do?",
            options = listOf(
                "Separates arguments",
                "Evaluates multiple expressions",
                "Creates arrays",
                "Ends statements"
            ),
            correctAnswer = "Evaluates multiple expressions",
            explanation = "Comma operator evaluates expressions left to right.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_044",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator checks property existence in object?",
            options = listOf("has", "in", "of", "exists"),
            correctAnswer = "in",
            explanation = "The in operator checks if property exists in object.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_operators_045",
            categoryId = categoryId,
            chapterId = JS_OPERATORS,
            questionText = "Which operator is used to spread elements?",
            options = listOf("...", "::", "=>", "**"),
            correctAnswer = "...",
            explanation = "Spread operator expands iterable elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_conditional_statements_001",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which statement is used to execute code when a condition is true?",
            options = listOf("for", "while", "if", "switch"),
            correctAnswer = "if",
            explanation = "The if statement runs code only when its condition evaluates to true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_002",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which keyword is used to execute code when an if condition is false?",
            options = listOf("else", "elseif", "otherwise", "default"),
            correctAnswer = "else",
            explanation = "else runs when the associated if condition is false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_003",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which statement allows multiple conditions to be checked sequentially?",
            options = listOf("if-else", "else if", "switch", "for"),
            correctAnswer = "else if",
            explanation = "else if checks another condition if the previous one fails.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_004",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What is the output if condition is false and there is no else block?",
            options = listOf("Error", "undefined", "Nothing executes", "false"),
            correctAnswer = "Nothing executes",
            explanation = "If condition is false and no else exists, no code runs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_005",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which operator is commonly used inside if conditions?",
            options = listOf("=", "===", "+", "++"),
            correctAnswer = "===",
            explanation = "=== ensures strict comparison without type conversion.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_006",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What will if(0) evaluate to?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "false",
            explanation = "0 is a falsy value, so the condition fails.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_007",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which value will make an if condition true?",
            options = listOf("0", "null", "''", "'0'"),
            correctAnswer = "'0'",
            explanation = "Non-empty strings are truthy in JavaScript.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_008",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which statement is best for checking a single variable against many values?",
            options = listOf("if", "else if", "switch", "while"),
            correctAnswer = "switch",
            explanation = "switch compares one expression against multiple cases.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_009",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which keyword ends a case in switch?",
            options = listOf("stop", "break", "exit", "return"),
            correctAnswer = "break",
            explanation = "break prevents execution from falling into next cases.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_010",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What happens if break is omitted in a switch case?",
            options = listOf(
                "Error occurs",
                "Only that case runs",
                "Execution stops",
                "Fall-through occurs"
            ),
            correctAnswer = "Fall-through occurs",
            explanation = "Without break, execution continues to the next case.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_011",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which keyword defines the default case in switch?",
            options = listOf("else", "default", "otherwise", "none"),
            correctAnswer = "default",
            explanation = "default runs when no case matches.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_012",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What is the output of if(undefined)?",
            options = listOf("true", "false", "error", "NaN"),
            correctAnswer = "false",
            explanation = "undefined is a falsy value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_013",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional operator is also called ternary operator?",
            options = listOf("??", "::", "?:", "&&"),
            correctAnswer = "?:",
            explanation = "The ternary operator is a shorthand for if-else.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_014",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What is the syntax of ternary operator?",
            options = listOf(
                "condition ? true : false",
                "condition : true ? false",
                "condition ?? true : false",
                "condition && true || false"
            ),
            correctAnswer = "condition ? true : false",
            explanation = "It evaluates condition and returns one of two values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_015",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional statement supports strict comparison?",
            options = listOf("if", "switch", "ternary", "all of these"),
            correctAnswer = "all of these",
            explanation = "Strict comparison depends on operators, not the statement type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_016",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What will switch compare values using?",
            options = listOf("==", "===", "=", "!="),
            correctAnswer = "===",
            explanation = "switch uses strict comparison internally.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_017",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which value will NOT enter an if block?",
            options = listOf("1", "true", "'false'", "0"),
            correctAnswer = "0",
            explanation = "0 is falsy, others are truthy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_018",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What does if(NaN) evaluate to?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "false",
            explanation = "NaN is treated as falsy in conditions.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_019",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional statement is fastest for many fixed values?",
            options = listOf("if", "else if", "switch", "ternary"),
            correctAnswer = "switch",
            explanation = "switch is optimized for multiple fixed comparisons.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_020",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Can switch cases contain expressions?",
            options = listOf("Yes", "No", "Only numbers", "Only strings"),
            correctAnswer = "Yes",
            explanation = "Cases can contain expressions that resolve to values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_021",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional is best for simple two-way decision?",
            options = listOf("switch", "if-else", "nested if", "loop"),
            correctAnswer = "if-else",
            explanation = "if-else clearly handles true and false paths.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_022",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What is the output of if('')?",
            options = listOf("true", "false", "error", "null"),
            correctAnswer = "false",
            explanation = "Empty string is falsy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_023",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which keyword exits from a switch block?",
            options = listOf("stop", "return", "break", "exit"),
            correctAnswer = "break",
            explanation = "break stops execution of switch.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_024",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What happens if default is placed at the top in switch?",
            options = listOf(
                "Error",
                "Ignored",
                "Executes if matched",
                "Executes if no break before"
            ),
            correctAnswer = "Executes if no break before",
            explanation = "default behaves like any other case.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_025",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which condition checks multiple conditions together?",
            options = listOf("if", "nested if", "switch", "case"),
            correctAnswer = "nested if",
            explanation = "Nested if allows checking multiple dependent conditions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_026",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which operator is often used inside ternary condition?",
            options = listOf("=", "===", "+", "**"),
            correctAnswer = "===",
            explanation = "Strict comparison avoids type coercion issues.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_027",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What will if([]) evaluate to?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "true",
            explanation = "Empty arrays are truthy in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_028",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional avoids deep nesting?",
            options = listOf("nested if", "switch", "if only", "while"),
            correctAnswer = "switch",
            explanation = "switch reduces multiple else-if nesting.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_029",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which value will enter else block?",
            options = listOf("true", "1", "'0'", "false"),
            correctAnswer = "false",
            explanation = "else executes when condition is false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_030",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What is the output of if(null)?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "false",
            explanation = "null is a falsy value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_031",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional operator returns a value?",
            options = listOf("if", "switch", "ternary", "else"),
            correctAnswer = "ternary",
            explanation = "Ternary operator returns a value based on condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_032",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which is NOT a conditional statement?",
            options = listOf("if", "switch", "for", "else if"),
            correctAnswer = "for",
            explanation = "for is a loop, not a conditional statement.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_033",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Can ternary operator replace if-else?",
            options = listOf("Always", "Never", "Only simple cases", "Only loops"),
            correctAnswer = "Only simple cases",
            explanation = "Ternary is suitable for simple conditions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_034",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What will if('false') evaluate to?",
            options = listOf("true", "false", "error", "NaN"),
            correctAnswer = "true",
            explanation = "Non-empty strings are truthy.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_035",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which keyword is optional in switch?",
            options = listOf("case", "break", "default", "switch"),
            correctAnswer = "default",
            explanation = "default is optional if all cases are covered.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_036",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What is the output of if({})?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "true",
            explanation = "Objects are truthy values.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_037",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which condition executes first in if-else-if ladder?",
            options = listOf(
                "Last true condition",
                "All true conditions",
                "First true condition",
                "Random condition"
            ),
            correctAnswer = "First true condition",
            explanation = "Execution stops at the first true condition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_038",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Can switch work with strings?",
            options = listOf("Yes", "No", "Only numbers", "Only booleans"),
            correctAnswer = "Yes",
            explanation = "switch supports strings and numbers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_039",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which statement improves readability for multiple conditions?",
            options = listOf("nested if", "switch", "ternary", "while"),
            correctAnswer = "switch",
            explanation = "switch is cleaner for many fixed conditions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_040",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What happens if no case matches and no default exists?",
            options = listOf("Error", "Default executes", "Nothing executes", "Program stops"),
            correctAnswer = "Nothing executes",
            explanation = "Switch simply exits if nothing matches.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_041",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional supports expression-based return?",
            options = listOf("if", "switch", "ternary", "else"),
            correctAnswer = "ternary",
            explanation = "Ternary returns values directly.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_042",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which value is checked in switch expression?",
            options = listOf("Boolean", "Condition", "Expression result", "Case labels"),
            correctAnswer = "Expression result",
            explanation = "switch evaluates the expression once.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_043",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional statement can replace nested ifs cleanly?",
            options = listOf("switch", "ternary", "while", "do-while"),
            correctAnswer = "switch",
            explanation = "switch avoids deep nesting.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_044",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "What will if(false || true) evaluate to?",
            options = listOf("true", "false", "error", "undefined"),
            correctAnswer = "true",
            explanation = "Logical OR returns true if any operand is true.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_conditional_statements_045",
            categoryId = categoryId,
            chapterId = JS_CONDITIONAL_STATEMENTS,
            questionText = "Which conditional statement is evaluated at runtime?",
            options = listOf("if", "switch", "ternary", "all of these"),
            correctAnswer = "all of these",
            explanation = "All conditionals are evaluated during runtime.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_loops_001",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is used when the number of iterations is known?",
            options = listOf("while", "do-while", "for", "foreach"),
            correctAnswer = "for",
            explanation = "The for loop is ideal when the loop count is known in advance.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_002",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop checks the condition before executing the loop body?",
            options = listOf("for", "while", "do-while", "foreach"),
            correctAnswer = "while",
            explanation = "while loop checks the condition before executing the body.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_003",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop executes at least once even if condition is false?",
            options = listOf("for", "while", "do-while", "for-in"),
            correctAnswer = "do-while",
            explanation = "do-while executes the body first, then checks the condition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_004",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which keyword is used to stop a loop immediately?",
            options = listOf("stop", "exit", "break", "continue"),
            correctAnswer = "break",
            explanation = "break exits the loop immediately.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_005",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which keyword skips the current iteration and continues with next?",
            options = listOf("skip", "pass", "continue", "break"),
            correctAnswer = "continue",
            explanation = "continue skips the current iteration and moves to next.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_006",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "How many times will the loop run: for(let i=0;i<3;i++)?",
            options = listOf("2", "3", "4", "Infinite"),
            correctAnswer = "3",
            explanation = "The loop runs for i = 0,1,2 which is three times.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_007",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What is the output count of while(false)?",
            options = listOf("0", "1", "Infinite", "Error"),
            correctAnswer = "0",
            explanation = "Condition is false initially, so body never executes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_008",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is best suited for iterating object properties?",
            options = listOf("for", "for-in", "for-of", "while"),
            correctAnswer = "for-in",
            explanation = "for-in iterates over enumerable object keys.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_009",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is used to iterate over iterable values like arrays?",
            options = listOf("for-in", "for-of", "while", "do-while"),
            correctAnswer = "for-of",
            explanation = "for-of iterates over values of iterable objects.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_010",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What does for-in return when used on an array?",
            options = listOf("Values", "Indexes", "Objects", "Booleans"),
            correctAnswer = "Indexes",
            explanation = "for-in returns array indexes as strings.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_011",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What does for-of return when used on an array?",
            options = listOf("Indexes", "Keys", "Values", "Objects"),
            correctAnswer = "Values",
            explanation = "for-of iterates directly over array values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_012",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop can cause infinite loop if condition never becomes false?",
            options = listOf("for", "while", "do-while", "all of these"),
            correctAnswer = "all of these",
            explanation = "Any loop can become infinite if condition never fails.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_013",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What happens if break is used inside nested loops?",
            options = listOf(
                "Exits all loops",
                "Exits current loop",
                "Exits program",
                "Throws error"
            ),
            correctAnswer = "Exits current loop",
            explanation = "break exits only the nearest enclosing loop.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_014",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is preferred when condition is checked at end?",
            options = listOf("for", "while", "do-while", "for-of"),
            correctAnswer = "do-while",
            explanation = "do-while checks condition after executing the loop body.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_015",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What is the result of for(let i=0;i<0;i++)?",
            options = listOf("0 iterations", "1 iteration", "Infinite", "Error"),
            correctAnswer = "0 iterations",
            explanation = "Condition fails initially, so loop body never runs.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_016",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which keyword is mandatory in a for loop header?",
            options = listOf("Initialization", "Condition", "Increment", "None"),
            correctAnswer = "None",
            explanation = "All parts of for loop are optional in JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_017",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What will happen if continue is used in last iteration?",
            options = listOf("Error", "Loop stops", "Loop ends normally", "Infinite loop"),
            correctAnswer = "Loop ends normally",
            explanation = "continue only skips current iteration.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_018",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is not suitable for object iteration?",
            options = listOf("for-in", "for-of", "while", "for"),
            correctAnswer = "for-of",
            explanation = "for-of works on iterables, not plain objects.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_019",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What is the scope of let inside a loop?",
            options = listOf("Global", "Function", "Block", "Script"),
            correctAnswer = "Block",
            explanation = "let has block scope inside loops.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_020",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is best for iterating array index manually?",
            options = listOf("for", "for-of", "for-in", "do-while"),
            correctAnswer = "for",
            explanation = "for loop gives full control over index.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_021",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What happens if loop condition is always true?",
            options = listOf("Loop runs once", "Loop stops", "Infinite loop", "Syntax error"),
            correctAnswer = "Infinite loop",
            explanation = "The loop never terminates.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_022",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which statement is true about nested loops?",
            options = listOf(
                "They run once",
                "They share same iterator",
                "One loop inside another",
                "They cannot be broken"
            ),
            correctAnswer = "One loop inside another",
            explanation = "Nested loops mean loops inside loops.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_023",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "How many times will inner loop run if outer runs 3 times and inner 2 times?",
            options = listOf("2", "3", "5", "6"),
            correctAnswer = "6",
            explanation = "Inner loop runs fully for each outer iteration.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_024",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which keyword skips remaining code in current iteration?",
            options = listOf("break", "return", "continue", "pass"),
            correctAnswer = "continue",
            explanation = "continue skips remaining statements in iteration.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_025",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is safest to avoid infinite loops?",
            options = listOf("for", "while", "do-while", "none"),
            correctAnswer = "for",
            explanation = "for loop clearly defines start, condition, and update.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_026",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What does break do inside for-of loop?",
            options = listOf(
                "Skips value",
                "Stops iteration",
                "Restarts loop",
                "Throws error"
            ),
            correctAnswer = "Stops iteration",
            explanation = "break exits the loop immediately.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_027",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is preferred when condition depends on user input?",
            options = listOf("for", "while", "for-of", "for-in"),
            correctAnswer = "while",
            explanation = "while is useful when iterations depend on condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_028",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop works with iterable objects only?",
            options = listOf("for", "for-in", "for-of", "while"),
            correctAnswer = "for-of",
            explanation = "for-of works with iterable objects like arrays, strings.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_029",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What will happen if increment step is missing in for loop?",
            options = listOf("Compile error", "Infinite loop", "Runs once", "Skipped"),
            correctAnswer = "Infinite loop",
            explanation = "Without increment, condition may never become false.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_030",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is best for reading array values directly?",
            options = listOf("for", "for-in", "for-of", "while"),
            correctAnswer = "for-of",
            explanation = "for-of reads values directly without index.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_031",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What is the output of do{ }while(false)?",
            options = listOf("0 times", "1 time", "Infinite", "Error"),
            correctAnswer = "1 time",
            explanation = "do-while executes body once before checking condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_032",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop can be labeled in JavaScript?",
            options = listOf("for", "while", "do-while", "all of these"),
            correctAnswer = "all of these",
            explanation = "Labels can be applied to any loop.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_033",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What does labeled break do?",
            options = listOf(
                "Breaks all loops",
                "Breaks labeled loop",
                "Breaks inner loop",
                "Throws error"
            ),
            correctAnswer = "Breaks labeled loop",
            explanation = "Labeled break exits the specified loop.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_034",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is slower for large arrays?",
            options = listOf("for", "for-of", "while", "depends on use"),
            correctAnswer = "depends on use",
            explanation = "Performance depends on logic and engine optimization.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_035",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop uses iterator internally?",
            options = listOf("for", "for-in", "for-of", "while"),
            correctAnswer = "for-of",
            explanation = "for-of uses iterator protocol.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_036",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which statement exits both loop and function?",
            options = listOf("break", "continue", "return", "exit"),
            correctAnswer = "return",
            explanation = "return exits the function and loop together.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_037",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is most readable for fixed iterations?",
            options = listOf("for", "while", "do-while", "for-in"),
            correctAnswer = "for",
            explanation = "for loop clearly shows iteration control.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_038",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is suitable for menu-driven programs?",
            options = listOf("for", "while", "for-of", "for-in"),
            correctAnswer = "while",
            explanation = "while loop fits condition-based repetition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_039",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is NOT entry-controlled?",
            options = listOf("for", "while", "do-while", "for-of"),
            correctAnswer = "do-while",
            explanation = "do-while is exit-controlled loop.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_040",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What is the output of while(0)?",
            options = listOf("Runs once", "Runs zero times", "Infinite", "Error"),
            correctAnswer = "Runs zero times",
            explanation = "0 is falsy so loop never runs.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_041",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is best for traversing strings?",
            options = listOf("for", "for-in", "for-of", "while"),
            correctAnswer = "for-of",
            explanation = "for-of iterates characters in string.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_042",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop condition uses boolean expression?",
            options = listOf("for", "while", "do-while", "all of these"),
            correctAnswer = "all of these",
            explanation = "All loops depend on boolean conditions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_043",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop is preferred in modern JavaScript for arrays?",
            options = listOf("for", "for-in", "for-of", "while"),
            correctAnswer = "for-of",
            explanation = "for-of is cleaner and avoids index issues.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_044",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "What happens if break is used outside a loop?",
            options = listOf("Ignored", "Stops program", "Syntax error", "Returns value"),
            correctAnswer = "Syntax error",
            explanation = "break must be inside loop or switch.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_loops_045",
            categoryId = categoryId,
            chapterId = JS_LOOPS,
            questionText = "Which loop can replace recursion in some cases?",
            options = listOf("for", "while", "do-while", "any loop"),
            correctAnswer = "any loop",
            explanation = "Loops can often replace recursive logic.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_functions_001",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is a function in JavaScript?",
            options = listOf(
                "A block of code that runs automatically",
                "A reusable block of code designed to perform a task",
                "A variable that stores logic",
                "A conditional statement"
            ),
            correctAnswer = "A reusable block of code designed to perform a task",
            explanation = "Functions allow you to group code and reuse it whenever needed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_002",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which keyword is used to define a function?",
            options = listOf("func", "method", "function", "define"),
            correctAnswer = "function",
            explanation = "The function keyword is used to declare functions in JavaScript.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_003",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is the correct syntax to call a function named test?",
            options = listOf("call test()", "test()", "run test", "execute(test)"),
            correctAnswer = "test()",
            explanation = "Functions are invoked using parentheses after the name.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_004",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What are values passed to a function called?",
            options = listOf("Variables", "Arguments", "Parameters", "Constants"),
            correctAnswer = "Arguments",
            explanation = "Arguments are actual values passed to a function call.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_005",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What are variables listed in function definition called?",
            options = listOf("Arguments", "Parameters", "Operands", "Properties"),
            correctAnswer = "Parameters",
            explanation = "Parameters receive values passed as arguments.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_006",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What does a function return if no return statement is used?",
            options = listOf("null", "0", "undefined", "false"),
            correctAnswer = "undefined",
            explanation = "Functions return undefined by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_007",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function type is defined using an expression?",
            options = listOf(
                "Function declaration",
                "Arrow function",
                "Function expression",
                "Generator function"
            ),
            correctAnswer = "Function expression",
            explanation = "Function expressions store functions inside variables.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_008",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function can be called before its definition?",
            options = listOf(
                "Arrow function",
                "Function expression",
                "Function declaration",
                "Anonymous function"
            ),
            correctAnswer = "Function declaration",
            explanation = "Function declarations are hoisted.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_009",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which keyword is used to send a value back from a function?",
            options = listOf("break", "yield", "return", "output"),
            correctAnswer = "return",
            explanation = "return sends a value back to the caller.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_010",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What happens after return statement executes?",
            options = listOf(
                "Function pauses",
                "Function continues",
                "Function stops",
                "Loop stops"
            ),
            correctAnswer = "Function stops",
            explanation = "Code after return is not executed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_011",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function has no name?",
            options = listOf(
                "Named function",
                "Arrow function",
                "Anonymous function",
                "Generator function"
            ),
            correctAnswer = "Anonymous function",
            explanation = "Anonymous functions are defined without names.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_012",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which syntax defines an arrow function?",
            options = listOf("=>", "->", "::", "**"),
            correctAnswer = "=>",
            explanation = "Arrow functions use the => syntax.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_013",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Arrow functions do NOT have which feature?",
            options = listOf("arguments object", "return value", "parameters", "scope"),
            correctAnswer = "arguments object",
            explanation = "Arrow functions do not have their own arguments object.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_014",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function type binds its own this?",
            options = listOf(
                "Arrow function",
                "Normal function",
                "Anonymous function",
                "Callback function"
            ),
            correctAnswer = "Normal function",
            explanation = "Arrow functions do not have their own this.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_015",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is a callback function?",
            options = listOf(
                "A function calling itself",
                "A function passed as argument",
                "A function returning another function",
                "A function with no return"
            ),
            correctAnswer = "A function passed as argument",
            explanation = "Callbacks are passed to other functions to be executed later.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_016",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function calls itself?",
            options = listOf(
                "Callback function",
                "Anonymous function",
                "Recursive function",
                "Arrow function"
            ),
            correctAnswer = "Recursive function",
            explanation = "Recursive functions call themselves until a condition is met.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_017",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is mandatory in a recursive function?",
            options = listOf(
                "Loop",
                "Return value",
                "Base condition",
                "Arrow syntax"
            ),
            correctAnswer = "Base condition",
            explanation = "Base condition prevents infinite recursion.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_018",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What will typeof function test(){} return?",
            options = listOf("object", "method", "function", "undefined"),
            correctAnswer = "function",
            explanation = "Functions have their own type called function.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_019",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function is executed immediately after creation?",
            options = listOf(
                "Callback function",
                "Arrow function",
                "IIFE",
                "Recursive function"
            ),
            correctAnswer = "IIFE",
            explanation = "Immediately Invoked Function Expressions run instantly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_020",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is the syntax of IIFE?",
            options = listOf(
                "(function(){})()",
                "function(){}()",
                "call function()",
                "run()"
            ),
            correctAnswer = "(function(){})()",
            explanation = "IIFE is wrapped in parentheses and invoked immediately.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_021",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Functions in JavaScript are treated as?",
            options = listOf(
                "Statements",
                "Objects",
                "First-class citizens",
                "Methods only"
            ),
            correctAnswer = "First-class citizens",
            explanation = "Functions can be stored, passed, and returned like values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_022",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which feature allows function inside another function?",
            options = listOf("Hoisting", "Nesting", "Callback", "Recursion"),
            correctAnswer = "Nesting",
            explanation = "Functions can be defined inside other functions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_023",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is a higher-order function?",
            options = listOf(
                "Function with many lines",
                "Function inside loop",
                "Function that takes or returns a function",
                "Function with no parameters"
            ),
            correctAnswer = "Function that takes or returns a function",
            explanation = "Higher-order functions work with other functions.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_024",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which keyword accesses function arguments?",
            options = listOf("params", "arguments", "args", "values"),
            correctAnswer = "arguments",
            explanation = "arguments object contains all passed values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_025",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "arguments object is NOT available in?",
            options = listOf(
                "Normal function",
                "Arrow function",
                "Anonymous function",
                "Recursive function"
            ),
            correctAnswer = "Arrow function",
            explanation = "Arrow functions do not have arguments object.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_026",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which keyword defines default parameter?",
            options = listOf("=", "==", ":", "=>"),
            correctAnswer = "=",
            explanation = "Default parameters are assigned using =.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_027",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What happens if fewer arguments are passed?",
            options = listOf(
                "Error",
                "undefined assigned",
                "Function fails",
                "Null assigned"
            ),
            correctAnswer = "undefined assigned",
            explanation = "Missing parameters become undefined.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_028",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What happens if extra arguments are passed?",
            options = listOf(
                "Error",
                "Ignored",
                "Stored in arguments",
                "Function stops"
            ),
            correctAnswer = "Stored in arguments",
            explanation = "Extra arguments are accessible via arguments object.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_029",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which operator helps pass unlimited arguments?",
            options = listOf("...", "**", "??", "&&"),
            correctAnswer = "...",
            explanation = "Rest operator collects multiple arguments.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_030",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Rest parameter must be placed?",
            options = listOf(
                "At beginning",
                "In middle",
                "At end",
                "Anywhere"
            ),
            correctAnswer = "At end",
            explanation = "Rest parameter must be the last parameter.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_031",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function has lexical this?",
            options = listOf(
                "Normal function",
                "Arrow function",
                "Recursive function",
                "Generator function"
            ),
            correctAnswer = "Arrow function",
            explanation = "Arrow functions inherit this from surrounding scope.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_032",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is function hoisting?",
            options = listOf(
                "Calling function late",
                "Using arrow functions",
                "Moving function declarations to top",
                "Deleting functions"
            ),
            correctAnswer = "Moving function declarations to top",
            explanation = "Function declarations are hoisted during compilation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_033",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function cannot be hoisted?",
            options = listOf(
                "Function declaration",
                "Arrow function",
                "Named function",
                "Recursive function"
            ),
            correctAnswer = "Arrow function",
            explanation = "Arrow functions behave like variables and are not hoisted.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_034",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which statement is true about return?",
            options = listOf(
                "Returns multiple values",
                "Returns only once",
                "Returns function",
                "Returns loop"
            ),
            correctAnswer = "Returns only once",
            explanation = "After return, function execution stops.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_035",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What is the return type of a function?",
            options = listOf(
                "Fixed",
                "Always number",
                "Dynamic",
                "Boolean only"
            ),
            correctAnswer = "Dynamic",
            explanation = "Functions can return any data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_036",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function is commonly used in event handling?",
            options = listOf(
                "Recursive function",
                "Callback function",
                "IIFE",
                "Generator function"
            ),
            correctAnswer = "Callback function",
            explanation = "Callbacks execute in response to events.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_037",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function improves code reusability?",
            options = listOf(
                "Loop",
                "Conditional",
                "Function",
                "Variable"
            ),
            correctAnswer = "Function",
            explanation = "Functions allow reuse of logic.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_038",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function syntax is shortest?",
            options = listOf(
                "Normal function",
                "Function expression",
                "Arrow function",
                "Recursive function"
            ),
            correctAnswer = "Arrow function",
            explanation = "Arrow functions provide concise syntax.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_039",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function supports yield keyword?",
            options = listOf(
                "Arrow function",
                "Generator function",
                "Callback function",
                "Anonymous function"
            ),
            correctAnswer = "Generator function",
            explanation = "Generators pause and resume using yield.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_040",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which symbol is used with generator functions?",
            options = listOf("*", "&", "#", "@"),
            correctAnswer = "*",
            explanation = "Generator functions use function* syntax.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_041",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function allows delayed execution?",
            options = listOf(
                "Recursive function",
                "Callback function",
                "IIFE",
                "Generator function"
            ),
            correctAnswer = "Callback function",
            explanation = "Callbacks can be executed later.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_042",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "What will be returned by return;",
            options = listOf("null", "0", "undefined", "false"),
            correctAnswer = "undefined",
            explanation = "return without value returns undefined.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_043",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function is useful for mathematical operations?",
            options = listOf(
                "Recursive function",
                "Pure function",
                "Callback function",
                "IIFE"
            ),
            correctAnswer = "Pure function",
            explanation = "Pure functions give same output for same input.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_044",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which function does not modify external state?",
            options = listOf(
                "Impure function",
                "Arrow function",
                "Pure function",
                "Callback function"
            ),
            correctAnswer = "Pure function",
            explanation = "Pure functions avoid side effects.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_functions_045",
            categoryId = categoryId,
            chapterId = JS_FUNCTIONS,
            questionText = "Which concept allows function to remember its scope?",
            options = listOf(
                "Hoisting",
                "Closure",
                "Recursion",
                "Binding"
            ),
            correctAnswer = "Closure",
            explanation = "Closures allow functions to access outer variables.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_arrays_and_objects_001",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which data structure is used to store multiple values in a single variable?",
            options = listOf("Object", "Array", "Function", "String"),
            correctAnswer = "Array",
            explanation = "Arrays store multiple values in an ordered list.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_002",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which syntax is used to create an empty array?",
            options = listOf("{}", "[]", "()", "new Object()"),
            correctAnswer = "[]",
            explanation = "Square brackets are used to create arrays.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_003",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Array indexes in JavaScript start from?",
            options = listOf("1", "-1", "0", "Any number"),
            correctAnswer = "0",
            explanation = "JavaScript arrays are zero-indexed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_004",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which property returns the number of elements in an array?",
            options = listOf("size", "count", "length", "index"),
            correctAnswer = "length",
            explanation = "length gives total elements in the array.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_005",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method adds an element at the end of an array?",
            options = listOf("push()", "pop()", "shift()", "unshift()"),
            correctAnswer = "push()",
            explanation = "push() adds elements to the end of an array.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_006",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method removes the last element from an array?",
            options = listOf("shift()", "unshift()", "pop()", "splice()"),
            correctAnswer = "pop()",
            explanation = "pop() removes the last element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_007",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method removes the first element of an array?",
            options = listOf("pop()", "shift()", "splice()", "slice()"),
            correctAnswer = "shift()",
            explanation = "shift() removes the first element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_008",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method adds elements at the beginning of an array?",
            options = listOf("push()", "unshift()", "concat()", "splice()"),
            correctAnswer = "unshift()",
            explanation = "unshift() adds elements at the start.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_009",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method returns a new array without modifying the original?",
            options = listOf("splice()", "push()", "slice()", "pop()"),
            correctAnswer = "slice()",
            explanation = "slice() creates a shallow copy of array elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_010",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method can add or remove elements at any position?",
            options = listOf("slice()", "splice()", "concat()", "map()"),
            correctAnswer = "splice()",
            explanation = "splice() modifies array by adding or removing elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_011",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method combines two or more arrays?",
            options = listOf("join()", "concat()", "merge()", "push()"),
            correctAnswer = "concat()",
            explanation = "concat() returns a new combined array.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_012",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "What does typeof [] return?",
            options = listOf("array", "object", "list", "undefined"),
            correctAnswer = "object",
            explanation = "Arrays are treated as objects in JavaScript.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_013",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which loop is best to iterate array values?",
            options = listOf("for-in", "for-of", "while", "do-while"),
            correctAnswer = "for-of",
            explanation = "for-of iterates directly over array values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_014",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which array method executes a function for each element?",
            options = listOf("map()", "filter()", "forEach()", "reduce()"),
            correctAnswer = "forEach()",
            explanation = "forEach() runs a function on each element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_015",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which array method creates a new array by transforming elements?",
            options = listOf("map()", "forEach()", "reduce()", "some()"),
            correctAnswer = "map()",
            explanation = "map() transforms each element and returns a new array.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_016",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method filters elements based on a condition?",
            options = listOf("map()", "filter()", "reduce()", "every()"),
            correctAnswer = "filter()",
            explanation = "filter() returns elements that satisfy a condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_017",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method reduces array to a single value?",
            options = listOf("map()", "reduce()", "filter()", "join()"),
            correctAnswer = "reduce()",
            explanation = "reduce() combines all elements into one value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_018",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method checks if at least one element satisfies a condition?",
            options = listOf("every()", "some()", "includes()", "find()"),
            correctAnswer = "some()",
            explanation = "some() returns true if any element matches.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_019",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method checks if all elements satisfy a condition?",
            options = listOf("every()", "some()", "filter()", "map()"),
            correctAnswer = "every()",
            explanation = "every() returns true only if all elements match.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_020",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method finds the first matching element?",
            options = listOf("find()", "filter()", "some()", "includes()"),
            correctAnswer = "find()",
            explanation = "find() returns the first matching element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_021",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method checks if array contains a value?",
            options = listOf("has()", "exists()", "includes()", "contain()"),
            correctAnswer = "includes()",
            explanation = "includes() checks for value existence.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_022",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method converts array to string?",
            options = listOf("join()", "toString()", "both A and B", "stringify()"),
            correctAnswer = "both A and B",
            explanation = "join() and toString() convert arrays to strings.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_023",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which symbol is used to access object properties?",
            options = listOf(".", ":", "#", "@"),
            correctAnswer = ".",
            explanation = "Dot notation accesses object properties.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_024",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which syntax is used to create an object?",
            options = listOf("[]", "{}", "()", "new Array()"),
            correctAnswer = "{}",
            explanation = "Objects are created using curly braces.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_025",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "How are object properties stored?",
            options = listOf("Index-value", "Key-value", "Value-only", "Ordered list"),
            correctAnswer = "Key-value",
            explanation = "Objects store data as key-value pairs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_026",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which operator checks property existence in an object?",
            options = listOf("has", "in", "exists", "of"),
            correctAnswer = "in",
            explanation = "The in operator checks for property existence.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_027",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method returns all object keys?",
            options = listOf("Object.values()", "Object.entries()", "Object.keys()", "Object.get()"),
            correctAnswer = "Object.keys()",
            explanation = "Object.keys() returns an array of keys.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_028",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method returns key-value pairs as arrays?",
            options = listOf("Object.keys()", "Object.values()", "Object.entries()", "Object.pairs()"),
            correctAnswer = "Object.entries()",
            explanation = "Object.entries() returns key-value pairs.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_029",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method returns all values of an object?",
            options = listOf("Object.keys()", "Object.values()", "Object.entries()", "Object.data()"),
            correctAnswer = "Object.values()",
            explanation = "Object.values() returns property values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_030",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Objects in JavaScript are passed by?",
            options = listOf("Value", "Reference", "Copy", "Index"),
            correctAnswer = "Reference",
            explanation = "Objects are passed by reference.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_031",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Arrays in JavaScript are passed by?",
            options = listOf("Value", "Reference", "Index", "Pointer"),
            correctAnswer = "Reference",
            explanation = "Arrays are also objects and passed by reference.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_032",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which operator spreads array elements?",
            options = listOf("...", "**", "??", "::"),
            correctAnswer = "...",
            explanation = "Spread operator expands array elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_033",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method creates a shallow copy of an array?",
            options = listOf("slice()", "splice()", "push()", "pop()"),
            correctAnswer = "slice()",
            explanation = "slice() creates a shallow copy.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_034",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method freezes an object?",
            options = listOf("Object.seal()", "Object.freeze()", "Object.lock()", "Object.const()"),
            correctAnswer = "Object.freeze()",
            explanation = "freeze() prevents modification of object properties.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_035",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method prevents adding or removing properties but allows modification?",
            options = listOf("Object.freeze()", "Object.seal()", "Object.lock()", "Object.stop()"),
            correctAnswer = "Object.seal()",
            explanation = "seal() allows value changes but not structure changes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_036",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which keyword iterates object keys?",
            options = listOf("for-of", "for-in", "while", "map"),
            correctAnswer = "for-in",
            explanation = "for-in iterates over object keys.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_037",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which comparison is true?",
            options = listOf("[] == []", "{} == {}", "[] == ''", "{} == null"),
            correctAnswer = "[] == ''",
            explanation = "Loose comparison converts array to empty string.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_038",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which array method sorts elements?",
            options = listOf("order()", "arrange()", "sort()", "sequence()"),
            correctAnswer = "sort()",
            explanation = "sort() sorts elements as strings by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_039",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which array method reverses elements?",
            options = listOf("reverse()", "swap()", "invert()", "flip()"),
            correctAnswer = "reverse()",
            explanation = "reverse() reverses array order.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_040",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "What is the output of typeof {}?",
            options = listOf("object", "map", "json", "dictionary"),
            correctAnswer = "object",
            explanation = "Objects return type object.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_041",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method converts object to JSON string?",
            options = listOf("JSON.parse()", "JSON.stringify()", "Object.toJSON()", "toString()"),
            correctAnswer = "JSON.stringify()",
            explanation = "stringify() converts object to JSON string.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_042",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which method converts JSON string to object?",
            options = listOf("JSON.parse()", "JSON.stringify()", "Object.parse()", "convert()"),
            correctAnswer = "JSON.parse()",
            explanation = "parse() converts JSON string to object.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_043",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which array method mutates the original array?",
            options = listOf("map()", "filter()", "slice()", "splice()"),
            correctAnswer = "splice()",
            explanation = "splice() directly modifies the array.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_044",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which is true about object property order?",
            options = listOf(
                "Always sorted",
                "Insertion based",
                "Random",
                "Alphabetical"
            ),
            correctAnswer = "Insertion based",
            explanation = "Property order follows insertion rules.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_arrays_and_objects_045",
            categoryId = categoryId,
            chapterId = JS_ARRAYS_OBJECTS,
            questionText = "Which concept allows copying object properties into another?",
            options = listOf("Destructuring", "Cloning", "Spreading", "Inheritance"),
            correctAnswer = "Spreading",
            explanation = "Spread operator copies properties into new objects.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_dom_manipulation_001",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "What does DOM stand for in JavaScript?",
            options = listOf(
                "Document Object Model",
                "Data Object Method",
                "Document Oriented Model",
                "Dynamic Object Model"
            ),
            correctAnswer = "Document Object Model",
            explanation = "DOM represents the HTML document as a tree of objects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_002",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which object represents the entire HTML document?",
            options = listOf("window", "screen", "document", "navigator"),
            correctAnswer = "document",
            explanation = "document is the entry point to access DOM elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_003",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method selects an element by its id?",
            options = listOf(
                "getElementByClassName()",
                "querySelectorAll()",
                "getElementById()",
                "getElementsByTagName()"
            ),
            correctAnswer = "getElementById()",
            explanation = "getElementById() returns the element with the given id.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_004",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method returns multiple elements by class name?",
            options = listOf(
                "getElementById()",
                "getElementsByClassName()",
                "querySelector()",
                "getElementByName()"
            ),
            correctAnswer = "getElementsByClassName()",
            explanation = "It returns an HTMLCollection of matching elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_005",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method selects the first matching CSS selector?",
            options = listOf(
                "querySelector()",
                "querySelectorAll()",
                "getElementsByTagName()",
                "getElementById()"
            ),
            correctAnswer = "querySelector()",
            explanation = "querySelector() returns the first matching element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_006",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method returns all matching CSS selectors?",
            options = listOf(
                "querySelector()",
                "getElementById()",
                "querySelectorAll()",
                "getElementsByName()"
            ),
            correctAnswer = "querySelectorAll()",
            explanation = "querySelectorAll() returns a NodeList of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_007",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "What does document.getElementsByTagName() return?",
            options = listOf("Array", "Node", "HTMLCollection", "Object"),
            correctAnswer = "HTMLCollection",
            explanation = "It returns a live HTMLCollection.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_008",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property is used to change HTML content?",
            options = listOf("innerHTML", "textContent", "value", "nodeValue"),
            correctAnswer = "innerHTML",
            explanation = "innerHTML changes or reads HTML inside an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_009",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property changes only text without HTML parsing?",
            options = listOf("innerHTML", "textContent", "value", "innerText"),
            correctAnswer = "textContent",
            explanation = "textContent sets plain text safely.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_010",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property is commonly used with input elements?",
            options = listOf("innerHTML", "textContent", "value", "nodeName"),
            correctAnswer = "value",
            explanation = "value is used to get or set input field data.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_011",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method creates a new HTML element?",
            options = listOf(
                "createElement()",
                "appendChild()",
                "insertBefore()",
                "cloneNode()"
            ),
            correctAnswer = "createElement()",
            explanation = "createElement() creates a new DOM element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_012",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method adds a node as the last child?",
            options = listOf(
                "appendChild()",
                "prepend()",
                "insertBefore()",
                "replaceChild()"
            ),
            correctAnswer = "appendChild()",
            explanation = "appendChild() adds a node at the end.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_013",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method removes a child node?",
            options = listOf(
                "remove()",
                "removeChild()",
                "deleteNode()",
                "detach()"
            ),
            correctAnswer = "removeChild()",
            explanation = "removeChild() removes a specific child node.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_014",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method replaces an existing child node?",
            options = listOf(
                "replaceChild()",
                "swapChild()",
                "updateChild()",
                "changeNode()"
            ),
            correctAnswer = "replaceChild()",
            explanation = "replaceChild() replaces a child with a new node.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_015",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property is used to change CSS styles?",
            options = listOf("class", "css", "style", "design"),
            correctAnswer = "style",
            explanation = "style property modifies inline CSS.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_016",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method adds a CSS class to an element?",
            options = listOf(
                "addClass()",
                "className()",
                "classList.add()",
                "setClass()"
            ),
            correctAnswer = "classList.add()",
            explanation = "classList.add() adds a class safely.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_017",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method removes a CSS class?",
            options = listOf(
                "removeClass()",
                "classList.remove()",
                "deleteClass()",
                "unsetClass()"
            ),
            correctAnswer = "classList.remove()",
            explanation = "classList.remove() removes a specific class.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_018",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method toggles a CSS class?",
            options = listOf(
                "classList.toggle()",
                "toggleClass()",
                "switchClass()",
                "changeClass()"
            ),
            correctAnswer = "classList.toggle()",
            explanation = "toggle() adds or removes a class automatically.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_019",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which event occurs when an element is clicked?",
            options = listOf("hover", "load", "click", "change"),
            correctAnswer = "click",
            explanation = "click event triggers when user clicks an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_020",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method attaches an event handler?",
            options = listOf(
                "addEvent()",
                "attachEvent()",
                "addEventListener()",
                "onEvent()"
            ),
            correctAnswer = "addEventListener()",
            explanation = "addEventListener() attaches event listeners.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_021",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which parameter defines the event type?",
            options = listOf("handler", "callback", "event", "type"),
            correctAnswer = "type",
            explanation = "Event type specifies the event name like click.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_022",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which object contains event information?",
            options = listOf("this", "event", "document", "window"),
            correctAnswer = "event",
            explanation = "event object holds details of the triggered event.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_023",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method prevents default browser behavior?",
            options = listOf(
                "stop()",
                "preventDefault()",
                "cancelEvent()",
                "returnFalse()"
            ),
            correctAnswer = "preventDefault()",
            explanation = "preventDefault() stops default browser actions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_024",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method stops event propagation?",
            options = listOf(
                "stopPropagation()",
                "preventDefault()",
                "endEvent()",
                "cancelBubble()"
            ),
            correctAnswer = "stopPropagation()",
            explanation = "stopPropagation() prevents event bubbling.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_025",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which phase triggers first in event flow?",
            options = listOf(
                "Bubbling",
                "Target",
                "Capturing",
                "None"
            ),
            correctAnswer = "Capturing",
            explanation = "Event capturing happens before bubbling.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_026",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which phase triggers last in event flow?",
            options = listOf(
                "Capturing",
                "Target",
                "Bubbling",
                "Default"
            ),
            correctAnswer = "Bubbling",
            explanation = "Bubbling propagates events upward.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_027",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which argument enables capturing in addEventListener?",
            options = listOf("true", "false", "capture", "bubble"),
            correctAnswer = "true",
            explanation = "Passing true enables capture phase.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_028",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property returns the clicked element?",
            options = listOf("event.target", "event.type", "this", "event.current"),
            correctAnswer = "event.target",
            explanation = "event.target refers to the actual clicked element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_029",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property refers to element with listener attached?",
            options = listOf(
                "event.target",
                "event.currentTarget",
                "this.value",
                "event.node"
            ),
            correctAnswer = "event.currentTarget",
            explanation = "currentTarget is the element handling the event.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_030",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which DOM property returns parent element?",
            options = listOf(
                "parentNode",
                "childNode",
                "nextSibling",
                "previousSibling"
            ),
            correctAnswer = "parentNode",
            explanation = "parentNode returns the parent of a node.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_031",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property returns child elements only?",
            options = listOf(
                "childNodes",
                "children",
                "firstChild",
                "lastChild"
            ),
            correctAnswer = "children",
            explanation = "children excludes text and comment nodes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_032",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property returns the first child element?",
            options = listOf(
                "firstChild",
                "firstElementChild",
                "childNodes[0]",
                "children[0]"
            ),
            correctAnswer = "firstElementChild",
            explanation = "It returns the first element node only.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_033",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property returns next sibling element?",
            options = listOf(
                "nextSibling",
                "nextElementSibling",
                "nextNode",
                "siblingNext"
            ),
            correctAnswer = "nextElementSibling",
            explanation = "Returns next sibling that is an element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_034",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which DOM node type represents text?",
            options = listOf("1", "2", "3", "8"),
            correctAnswer = "3",
            explanation = "Node type 3 represents text nodes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_035",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which node type represents an element?",
            options = listOf("1", "2", "3", "9"),
            correctAnswer = "1",
            explanation = "Node type 1 represents element nodes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_036",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method clones a DOM node?",
            options = listOf(
                "copyNode()",
                "cloneNode()",
                "duplicateNode()",
                "replicate()"
            ),
            correctAnswer = "cloneNode()",
            explanation = "cloneNode() duplicates a node.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_037",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which argument clones child nodes as well?",
            options = listOf("false", "null", "true", "deep"),
            correctAnswer = "true",
            explanation = "true performs deep cloning including children.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_038",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property gets or sets an attribute?",
            options = listOf(
                "setAttribute()",
                "getAttribute()",
                "attribute",
                "attributes"
            ),
            correctAnswer = "setAttribute()",
            explanation = "setAttribute() assigns attribute values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_039",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method reads an attribute value?",
            options = listOf(
                "readAttribute()",
                "getAttribute()",
                "attributeValue()",
                "attr()"
            ),
            correctAnswer = "getAttribute()",
            explanation = "getAttribute() returns attribute value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_040",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method removes an attribute?",
            options = listOf(
                "removeAttr()",
                "deleteAttribute()",
                "removeAttribute()",
                "unsetAttribute()"
            ),
            correctAnswer = "removeAttribute()",
            explanation = "removeAttribute() deletes an attribute.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_041",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property accesses all attributes of an element?",
            options = listOf(
                "attrs",
                "attributes",
                "properties",
                "dataset"
            ),
            correctAnswer = "attributes",
            explanation = "attributes returns NamedNodeMap.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_042",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which property is used for custom data attributes?",
            options = listOf(
                "data",
                "dataset",
                "customData",
                "attributes"
            ),
            correctAnswer = "dataset",
            explanation = "dataset accesses data-* attributes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_043",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which method waits until DOM is fully loaded?",
            options = listOf(
                "window.onload",
                "DOMContentLoaded",
                "document.ready",
                "pageLoaded"
            ),
            correctAnswer = "DOMContentLoaded",
            explanation = "DOMContentLoaded fires when DOM is ready.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_044",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which object represents the browser window?",
            options = listOf("document", "screen", "window", "location"),
            correctAnswer = "window",
            explanation = "window represents the browser environment.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_dom_manipulation_045",
            categoryId = categoryId,
            chapterId = JS_DOM_MANIPULATION,
            questionText = "Which DOM concept improves performance by minimizing reflow?",
            options = listOf(
                "Event bubbling",
                "DocumentFragment",
                "Shadow DOM",
                "Virtual DOM"
            ),
            correctAnswer = "DocumentFragment",
            explanation = "DocumentFragment batches DOM updates efficiently.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_events_001",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "What is an event in JavaScript?",
            options = listOf(
                "A function call",
                "An action performed by user or browser",
                "A variable change",
                "A DOM element"
            ),
            correctAnswer = "An action performed by user or browser",
            explanation = "Events are actions like clicks, key presses, or page load.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_002",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event occurs when a user clicks on an element?",
            options = listOf("hover", "mouseover", "click", "change"),
            correctAnswer = "click",
            explanation = "click event fires when an element is clicked.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_003",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which method is used to attach an event handler?",
            options = listOf(
                "addEvent()",
                "attachEvent()",
                "addEventListener()",
                "bindEvent()"
            ),
            correctAnswer = "addEventListener()",
            explanation = "addEventListener() is the standard way to handle events.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_004",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event occurs when a page finishes loading?",
            options = listOf("ready", "DOMContentLoaded", "load", "init"),
            correctAnswer = "load",
            explanation = "load fires when the page and resources finish loading.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_005",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event occurs when an input value changes?",
            options = listOf("input", "change", "keyup", "submit"),
            correctAnswer = "change",
            explanation = "change fires when input loses focus after modification.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_006",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when a key is pressed down?",
            options = listOf("keypress", "keyup", "keydown", "keyhit"),
            correctAnswer = "keydown",
            explanation = "keydown fires when a key is pressed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_007",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when mouse pointer enters an element?",
            options = listOf("mouseover", "mouseenter", "mousemove", "mousedown"),
            correctAnswer = "mouseenter",
            explanation = "mouseenter triggers once when pointer enters element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_008",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires continuously while mouse moves?",
            options = listOf("mouseover", "mousemove", "mouseenter", "mouseleave"),
            correctAnswer = "mousemove",
            explanation = "mousemove fires repeatedly as the mouse moves.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_009",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event occurs when mouse leaves an element?",
            options = listOf("mouseout", "mouseleave", "mouseexit", "blur"),
            correctAnswer = "mouseleave",
            explanation = "mouseleave fires when pointer exits the element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_010",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event occurs when a form is submitted?",
            options = listOf("send", "click", "submit", "change"),
            correctAnswer = "submit",
            explanation = "submit fires when a form is submitted.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_011",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which method prevents default browser behavior?",
            options = listOf("stop()", "preventDefault()", "cancel()", "returnFalse()"),
            correctAnswer = "preventDefault()",
            explanation = "preventDefault() stops default browser actions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_012",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which method stops event bubbling?",
            options = listOf(
                "stop()",
                "preventDefault()",
                "stopPropagation()",
                "cancelEvent()"
            ),
            correctAnswer = "stopPropagation()",
            explanation = "stopPropagation() prevents event bubbling.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_013",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which phase of event flow comes first?",
            options = listOf("Bubbling", "Target", "Capturing", "Default"),
            correctAnswer = "Capturing",
            explanation = "Capturing phase occurs before bubbling.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_014",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which phase of event flow comes last?",
            options = listOf("Capturing", "Target", "Bubbling", "None"),
            correctAnswer = "Bubbling",
            explanation = "Bubbling phase propagates event upward.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_015",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which argument enables capturing in addEventListener?",
            options = listOf("true", "false", "capture", "bubble"),
            correctAnswer = "true",
            explanation = "Passing true enables capturing phase.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_016",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which property refers to the element that triggered the event?",
            options = listOf("this", "event.type", "event.target", "event.currentTarget"),
            correctAnswer = "event.target",
            explanation = "event.target is the actual element clicked.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_017",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which property refers to the element with event listener?",
            options = listOf("event.target", "event.currentTarget", "this.value", "event.node"),
            correctAnswer = "event.currentTarget",
            explanation = "currentTarget is the element handling the event.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_018",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when input value changes immediately?",
            options = listOf("change", "input", "keyup", "keydown"),
            correctAnswer = "input",
            explanation = "input fires instantly when value changes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_019",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when element gains focus?",
            options = listOf("focus", "blur", "click", "select"),
            correctAnswer = "focus",
            explanation = "focus fires when element gets focus.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_020",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when element loses focus?",
            options = listOf("focus", "blur", "mouseout", "mouseleave"),
            correctAnswer = "blur",
            explanation = "blur fires when focus is lost.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_021",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when mouse button is pressed?",
            options = listOf("mouseup", "mousedown", "click", "mousemove"),
            correctAnswer = "mousedown",
            explanation = "mousedown triggers when mouse button is pressed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_022",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when mouse button is released?",
            options = listOf("mousedown", "mouseup", "click", "mouseout"),
            correctAnswer = "mouseup",
            explanation = "mouseup triggers when mouse button is released.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_023",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event occurs when window is resized?",
            options = listOf("resize", "scroll", "load", "change"),
            correctAnswer = "resize",
            explanation = "resize fires when browser window size changes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_024",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event occurs when page is scrolled?",
            options = listOf("wheel", "scroll", "move", "drag"),
            correctAnswer = "scroll",
            explanation = "scroll fires when page is scrolled.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_025",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event is triggered by mouse wheel movement?",
            options = listOf("scroll", "wheel", "move", "rotate"),
            correctAnswer = "wheel",
            explanation = "wheel fires when mouse wheel is used.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_026",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when text is selected?",
            options = listOf("select", "focus", "input", "copy"),
            correctAnswer = "select",
            explanation = "select fires when text is selected.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_027",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when user copies content?",
            options = listOf("copy", "cut", "paste", "select"),
            correctAnswer = "copy",
            explanation = "copy fires when content is copied.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_028",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when user pastes content?",
            options = listOf("paste", "insert", "drop", "input"),
            correctAnswer = "paste",
            explanation = "paste fires when content is pasted.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_029",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event is fired when an element is dragged?",
            options = listOf("drag", "drop", "move", "dragstart"),
            correctAnswer = "drag",
            explanation = "drag fires continuously during dragging.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_030",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when dragged element is dropped?",
            options = listOf("drag", "drop", "dragend", "release"),
            correctAnswer = "drop",
            explanation = "drop fires when dragged element is dropped.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_031",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires repeatedly while dragging?",
            options = listOf("dragstart", "drag", "dragend", "drop"),
            correctAnswer = "drag",
            explanation = "drag fires continuously during drag.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_032",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires once when dragging starts?",
            options = listOf("drag", "dragstart", "dragend", "drop"),
            correctAnswer = "dragstart",
            explanation = "dragstart fires at beginning of drag.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_033",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when dragging ends?",
            options = listOf("drag", "drop", "dragend", "release"),
            correctAnswer = "dragend",
            explanation = "dragend fires after drag operation completes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_034",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when page visibility changes?",
            options = listOf("visibilitychange", "blur", "focus", "hide"),
            correctAnswer = "visibilitychange",
            explanation = "visibilitychange fires when tab visibility changes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_035",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when network goes offline?",
            options = listOf("offline", "disconnect", "close", "error"),
            correctAnswer = "offline",
            explanation = "offline fires when browser loses network.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_036",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when network comes online?",
            options = listOf("online", "connect", "open", "ready"),
            correctAnswer = "online",
            explanation = "online fires when network connection is restored.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_037",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when an error occurs?",
            options = listOf("exception", "error", "fail", "crash"),
            correctAnswer = "error",
            explanation = "error fires when resource or script error occurs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_038",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires before page unload?",
            options = listOf("beforeunload", "unload", "exit", "close"),
            correctAnswer = "beforeunload",
            explanation = "beforeunload fires before page unloads.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_039",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires after page unload?",
            options = listOf("load", "unload", "close", "finish"),
            correctAnswer = "unload",
            explanation = "unload fires when page is unloaded.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_040",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when media starts playing?",
            options = listOf("start", "play", "playing", "load"),
            correctAnswer = "play",
            explanation = "play fires when media playback starts.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_041",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when media playback pauses?",
            options = listOf("stop", "pause", "end", "break"),
            correctAnswer = "pause",
            explanation = "pause fires when media playback is paused.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_042",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when media playback ends?",
            options = listOf("stop", "finish", "end", "ended"),
            correctAnswer = "ended",
            explanation = "ended fires when media finishes playing.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_043",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when a checkbox value changes?",
            options = listOf("click", "change", "input", "toggle"),
            correctAnswer = "change",
            explanation = "change fires when checkbox state changes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_044",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event fires when form reset button is clicked?",
            options = listOf("clear", "reset", "change", "submit"),
            correctAnswer = "reset",
            explanation = "reset fires when form is reset.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_events_045",
            categoryId = categoryId,
            chapterId = JS_EVENTS,
            questionText = "Which event technique improves performance for many child elements?",
            options = listOf(
                "Inline events",
                "Event delegation",
                "Multiple listeners",
                "Global events"
            ),
            correctAnswer = "Event delegation",
            explanation = "Event delegation uses bubbling to handle events efficiently.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_es6_features_001",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which keyword introduced in ES6 provides block-level scope?",
            options = listOf("var", "static", "let", "final"),
            correctAnswer = "let",
            explanation = "let creates variables limited to the block where they are declared.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_002",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which keyword is used to declare a constant in ES6?",
            options = listOf("let", "const", "final", "static"),
            correctAnswer = "const",
            explanation = "const prevents reassignment of the variable reference.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_003",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows embedding variables directly inside strings?",
            options = listOf(
                "String concat",
                "Template literals",
                "Interpolation()",
                "join()"
            ),
            correctAnswer = "Template literals",
            explanation = "Template literals use backticks (`) instead of quotes. You place variables inside ${'$'}{expression} placeholders.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_es6_features_004",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which symbol is used to define template literals?",
            options = listOf("'", "\"", "`", "~"),
            correctAnswer = "`",
            explanation = "Backticks define template literal strings.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_005",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which syntax is used to insert expressions in template literals?",
            options = listOf(
                "${'$'}{}",
                "#{ }",
                "{{ }}",
                "@{}"
            ),
            correctAnswer = "${'$'}{}",
            explanation = "Expressions are embedded using ${'$'}{expression} inside template literals.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),



        jsQuestion(
            id = "javascript_es6_features_006",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows unpacking values from arrays or objects?",
            options = listOf("Spread", "Destructuring", "Rest", "Cloning"),
            correctAnswer = "Destructuring",
            explanation = "Destructuring extracts values into variables.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_007",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which operator is used as the spread operator?",
            options = listOf("...", "**", "??", "::"),
            correctAnswer = "...",
            explanation = "Spread operator expands iterable elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_008",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature collects remaining function arguments into an array?",
            options = listOf("Spread", "Rest", "arguments", "Default"),
            correctAnswer = "Rest",
            explanation = "Rest parameter gathers remaining arguments.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_009",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Where must the rest parameter be placed in a function?",
            options = listOf("Beginning", "Middle", "End", "Anywhere"),
            correctAnswer = "End",
            explanation = "Rest parameter must always be the last parameter.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_010",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which function syntax was introduced in ES6?",
            options = listOf("Anonymous function", "Arrow function", "Recursive function", "Callback function"),
            correctAnswer = "Arrow function",
            explanation = "Arrow functions provide shorter syntax and lexical this.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_011",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Arrow functions do NOT have their own?",
            options = listOf("this", "parameters", "return value", "scope"),
            correctAnswer = "this",
            explanation = "Arrow functions inherit this from surrounding scope.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_012",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which keyword is implicitly used in single-line arrow functions?",
            options = listOf("yield", "break", "return", "continue"),
            correctAnswer = "return",
            explanation = "Single-expression arrow functions return implicitly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_013",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows default values for function parameters?",
            options = listOf("Rest parameters", "Default parameters", "Spread", "Optional chaining"),
            correctAnswer = "Default parameters",
            explanation = "Default parameters provide fallback values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_014",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which loop was introduced in ES6 for iterables?",
            options = listOf("for-in", "for-of", "while", "do-while"),
            correctAnswer = "for-of",
            explanation = "for-of iterates over iterable values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_015",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature simplifies object property assignment?",
            options = listOf("Destructuring", "Object shorthand", "Spread", "Freeze"),
            correctAnswer = "Object shorthand",
            explanation = "Allows using variable names as keys directly.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_016",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows cloning objects easily?",
            options = listOf("Rest", "Spread", "Assign", "Freeze"),
            correctAnswer = "Spread",
            explanation = "Spread operator copies object properties.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_017",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature introduces block scope in loops?",
            options = listOf("var", "let", "const", "static"),
            correctAnswer = "let",
            explanation = "let creates block scope inside loops.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_018",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows multi-line strings?",
            options = listOf("Concatenation", "Template literals", "join()", "split()"),
            correctAnswer = "Template literals",
            explanation = "Template literals support multi-line text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_019",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows extracting object properties into variables?",
            options = listOf("Spread", "Destructuring", "Mapping", "Iteration"),
            correctAnswer = "Destructuring",
            explanation = "Object destructuring simplifies property extraction.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_020",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature introduces a new data structure for unique values?",
            options = listOf("Map", "Set", "WeakMap", "Array"),
            correctAnswer = "Set",
            explanation = "Set stores unique values only.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_021",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 collection stores key-value pairs with any data type as key?",
            options = listOf("Object", "Array", "Map", "Set"),
            correctAnswer = "Map",
            explanation = "Map allows keys of any type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_022",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which method is used to add values to a Set?",
            options = listOf("push()", "add()", "insert()", "set()"),
            correctAnswer = "add()",
            explanation = "add() inserts values into a Set.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_023",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which method retrieves a value from a Map?",
            options = listOf("get()", "fetch()", "read()", "value()"),
            correctAnswer = "get()",
            explanation = "get() returns the value for a given key.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_024",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature enables asynchronous iteration?",
            options = listOf("Promises", "Generators", "Async/Await", "Callbacks"),
            correctAnswer = "Generators",
            explanation = "Generators pause and resume execution using yield.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_025",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which keyword is used inside generator functions?",
            options = listOf("return", "yield", "await", "break"),
            correctAnswer = "yield",
            explanation = "yield pauses generator execution.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_026",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which symbol is used to define a generator function?",
            options = listOf("*", "&", "#", "@"),
            correctAnswer = "*",
            explanation = "Generator functions use function* syntax.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_027",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature improves readability of asynchronous code?",
            options = listOf("Callbacks", "Promises", "Async/Await", "Generators"),
            correctAnswer = "Promises",
            explanation = "Promises manage async operations more cleanly.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_028",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature represents a future value?",
            options = listOf("Callback", "Promise", "Generator", "Observer"),
            correctAnswer = "Promise",
            explanation = "Promises represent eventual completion or failure.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_029",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which Promise method runs on successful resolution?",
            options = listOf("catch()", "finally()", "then()", "resolve()"),
            correctAnswer = "then()",
            explanation = "then() handles fulfilled promises.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_030",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which Promise method handles errors?",
            options = listOf("then()", "error()", "catch()", "fail()"),
            correctAnswer = "catch()",
            explanation = "catch() handles rejected promises.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_031",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature ensures immutability of variable binding?",
            options = listOf("let", "var", "const", "static"),
            correctAnswer = "const",
            explanation = "const prevents reassignment of variables.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_032",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows shorter object method syntax?",
            options = listOf("Method shorthand", "Arrow functions", "Destructuring", "Spread"),
            correctAnswer = "Method shorthand",
            explanation = "Method shorthand removes the function keyword.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_033",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature helps avoid variable name conflicts?",
            options = listOf("Set", "Symbol", "Map", "WeakSet"),
            correctAnswer = "Symbol",
            explanation = "Symbols create unique identifiers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_034",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which type does Symbol() return?",
            options = listOf("string", "object", "symbol", "number"),
            correctAnswer = "symbol",
            explanation = "Symbol() returns a unique symbol type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_035",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows grouping multiple values as function output?",
            options = listOf("Destructuring", "Spread", "Rest", "Template literals"),
            correctAnswer = "Destructuring",
            explanation = "Destructuring extracts returned array/object values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_036",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature enables cleaner imports and exports?",
            options = listOf("Modules", "Namespaces", "Packages", "Libraries"),
            correctAnswer = "Modules",
            explanation = "ES6 modules use import and export keywords.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_037",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which keyword exports a default module?",
            options = listOf("export", "default", "export default", "module"),
            correctAnswer = "export default",
            explanation = "export default defines default module export.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_038",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which keyword imports named exports?",
            options = listOf("require", "include", "import", "load"),
            correctAnswer = "import",
            explanation = "import is used to access module exports.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_039",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature supports lazy execution?",
            options = listOf("Promises", "Generators", "Async/Await", "Callbacks"),
            correctAnswer = "Generators",
            explanation = "Generators execute lazily using yield.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_040",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows iterating over string characters?",
            options = listOf("for-in", "for-of", "map()", "reduce()"),
            correctAnswer = "for-of",
            explanation = "for-of works with iterable strings.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_041",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature introduces new numeric literals like binary?",
            options = listOf("Math API", "Number methods", "Binary literals", "Typed arrays"),
            correctAnswer = "Binary literals",
            explanation = "ES6 supports binary and octal literals.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_042",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature allows safe access to nested properties?",
            options = listOf("Spread", "Optional chaining", "Nullish coalescing", "Destructuring"),
            correctAnswer = "Optional chaining",
            explanation = "Optional chaining prevents runtime errors.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_043",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which operator provides fallback only for null or undefined?",
            options = listOf("||", "&&", "??", "?."),
            correctAnswer = "??",
            explanation = "Nullish coalescing handles null or undefined only.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_044",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature improves performance by avoiding re-declaration?",
            options = listOf("let", "const", "var", "static"),
            correctAnswer = "const",
            explanation = "const avoids accidental reassignment.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_es6_features_045",
            categoryId = categoryId,
            chapterId = JS_ES6,
            questionText = "Which ES6 feature modernizes JavaScript syntax the most?",
            options = listOf("Arrow functions", "Template literals", "Modules", "All of these"),
            correctAnswer = "All of these",
            explanation = "ES6 introduced multiple major syntax improvements.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_async_javascript_001",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "What does asynchronous programming mean in JavaScript?",
            options = listOf(
                "Code runs line by line only",
                "Multiple threads execute simultaneously",
                "Tasks run without blocking the main thread",
                "Code executes faster always"
            ),
            correctAnswer = "Tasks run without blocking the main thread",
            explanation = "Async programming allows long tasks to run without freezing execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_002",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which function is used to execute code after a delay?",
            options = listOf("setInterval()", "setTimeout()", "delay()", "wait()"),
            correctAnswer = "setTimeout()",
            explanation = "setTimeout() runs code once after a specified delay.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_003",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which function executes code repeatedly at fixed intervals?",
            options = listOf("setTimeout()", "repeat()", "setInterval()", "loop()"),
            correctAnswer = "setInterval()",
            explanation = "setInterval() runs code repeatedly after a given interval.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_004",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which function stops a setInterval execution?",
            options = listOf("stopInterval()", "clearInterval()", "clearTimeout()", "endInterval()"),
            correctAnswer = "clearInterval()",
            explanation = "clearInterval() stops an interval timer.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_005",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which function stops a setTimeout execution?",
            options = listOf("clearTimeout()", "stopTimeout()", "endTimeout()", "cancel()"),
            correctAnswer = "clearTimeout()",
            explanation = "clearTimeout() cancels a scheduled timeout.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_006",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which JavaScript feature represents a future value?",
            options = listOf("Callback", "Promise", "Event", "Observer"),
            correctAnswer = "Promise",
            explanation = "Promises represent a value that will be available later.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_007",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Promise state represents successful completion?",
            options = listOf("Pending", "Rejected", "Fulfilled", "Resolved"),
            correctAnswer = "Fulfilled",
            explanation = "Fulfilled means the promise completed successfully.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_008",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Promise state represents failure?",
            options = listOf("Pending", "Rejected", "Failed", "Error"),
            correctAnswer = "Rejected",
            explanation = "Rejected means the promise failed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_009",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Promise method handles success?",
            options = listOf("catch()", "then()", "finally()", "resolve()"),
            correctAnswer = "then()",
            explanation = "then() executes when a promise is fulfilled.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_010",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Promise method handles errors?",
            options = listOf("then()", "catch()", "finally()", "reject()"),
            correctAnswer = "catch()",
            explanation = "catch() executes when a promise is rejected.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_011",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Promise method runs regardless of result?",
            options = listOf("then()", "catch()", "finally()", "always()"),
            correctAnswer = "finally()",
            explanation = "finally() runs for both success and failure.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_012",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which keyword makes a function asynchronous?",
            options = listOf("await", "async", "promise", "defer"),
            correctAnswer = "async",
            explanation = "async defines a function that returns a promise.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_013",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which keyword pauses execution until a promise resolves?",
            options = listOf("pause", "wait", "await", "hold"),
            correctAnswer = "await",
            explanation = "await pauses execution until the promise settles.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_014",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Where can await be used?",
            options = listOf(
                "Anywhere",
                "Inside async functions only",
                "Inside promises only",
                "Inside loops only"
            ),
            correctAnswer = "Inside async functions only",
            explanation = "await works only inside async functions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_015",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "What does an async function always return?",
            options = listOf("Value", "Promise", "Boolean", "Object"),
            correctAnswer = "Promise",
            explanation = "Async functions always return a promise.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_016",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which is NOT an asynchronous API?",
            options = listOf("setTimeout()", "fetch()", "console.log()", "Promise"),
            correctAnswer = "console.log()",
            explanation = "console.log() runs synchronously.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_017",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Web API is used for HTTP requests?",
            options = listOf("XML", "fetch()", "request()", "http()"),
            correctAnswer = "fetch()",
            explanation = "fetch() is used for making HTTP requests.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_018",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "fetch() returns which type?",
            options = listOf("Data", "Promise", "Response", "Object"),
            correctAnswer = "Promise",
            explanation = "fetch() returns a promise that resolves to a Response.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_019",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which method converts fetch response to JSON?",
            options = listOf("toJSON()", "json()", "parse()", "convert()"),
            correctAnswer = "json()",
            explanation = "response.json() parses response body as JSON.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_020",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async issue causes nested callbacks?",
            options = listOf("Promise chaining", "Callback hell", "Event loop", "Microtasks"),
            correctAnswer = "Callback hell",
            explanation = "Deep nesting of callbacks leads to callback hell.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_021",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which feature solves callback hell effectively?",
            options = listOf("Callbacks", "Promises", "Intervals", "Events"),
            correctAnswer = "Promises",
            explanation = "Promises flatten asynchronous code structure.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_022",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which feature provides the cleanest async syntax?",
            options = listOf("Callbacks", "Promises", "Async/Await", "Generators"),
            correctAnswer = "Async/Await",
            explanation = "Async/Await makes async code look synchronous.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_023",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which queue handles resolved promises?",
            options = listOf("Callback queue", "Event queue", "Microtask queue", "Task stack"),
            correctAnswer = "Microtask queue",
            explanation = "Promises are handled in the microtask queue.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_024",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which queue handles setTimeout callbacks?",
            options = listOf("Microtask queue", "Call stack", "Callback queue", "Heap"),
            correctAnswer = "Callback queue",
            explanation = "Timers are placed in the callback queue.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_025",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which mechanism decides what runs next?",
            options = listOf("Heap", "Event loop", "Queue", "Stack"),
            correctAnswer = "Event loop",
            explanation = "Event loop manages execution order.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_026",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which runs first when both are ready?",
            options = listOf("setTimeout()", "Promise.then()", "setInterval()", "Event handler"),
            correctAnswer = "Promise.then()",
            explanation = "Microtasks run before callback queue tasks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_027",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async pattern executes tasks sequentially?",
            options = listOf("Promise.all()", "await", "setTimeout()", "setInterval()"),
            correctAnswer = "await",
            explanation = "await pauses execution until completion.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_028",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which method runs promises in parallel?",
            options = listOf("Promise.all()", "Promise.race()", "await", "then()"),
            correctAnswer = "Promise.all()",
            explanation = "Promise.all() executes promises concurrently.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_029",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Promise method resolves first promise only?",
            options = listOf("Promise.all()", "Promise.any()", "Promise.race()", "Promise.resolve()"),
            correctAnswer = "Promise.race()",
            explanation = "Promise.race() resolves with the first settled promise.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_030",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which Promise method ignores rejected promises?",
            options = listOf("Promise.all()", "Promise.race()", "Promise.any()", "Promise.resolve()"),
            correctAnswer = "Promise.any()",
            explanation = "Promise.any() resolves with first fulfilled promise.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_031",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which error occurs if all Promise.any() fail?",
            options = listOf("TypeError", "AggregateError", "SyntaxError", "RangeError"),
            correctAnswer = "AggregateError",
            explanation = "Promise.any() throws AggregateError if all fail.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_032",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async technique is older?",
            options = listOf("Promises", "Async/Await", "Callbacks", "Generators"),
            correctAnswer = "Callbacks",
            explanation = "Callbacks were the earliest async pattern.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_033",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async function handles exceptions using try-catch?",
            options = listOf("Promise", "Callback", "Async/Await", "setTimeout()"),
            correctAnswer = "Async/Await",
            explanation = "Async/Await allows try-catch for errors.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_034",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which error handling is cleaner?",
            options = listOf("Callbacks", "Promises", "Async/Await", "Events"),
            correctAnswer = "Async/Await",
            explanation = "Async/Await uses synchronous-like error handling.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_035",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which function executes after call stack is empty?",
            options = listOf("Synchronous code", "Microtasks", "Callbacks", "Promises"),
            correctAnswer = "Microtasks",
            explanation = "Microtasks run after stack but before callbacks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_036",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async feature improves non-blocking UI?",
            options = listOf("Loops", "Promises", "Variables", "Objects"),
            correctAnswer = "Promises",
            explanation = "Promises keep UI responsive.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_037",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async method executes after a delay of 0ms?",
            options = listOf("setTimeout(fn,0)", "Promise.then()", "await", "async"),
            correctAnswer = "setTimeout(fn,0)",
            explanation = "Even 0ms timeout goes to callback queue.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_038",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which is true about JavaScript execution?",
            options = listOf(
                "Multi-threaded",
                "Single-threaded",
                "Threadless",
                "Parallel only"
            ),
            correctAnswer = "Single-threaded",
            explanation = "JavaScript runs on a single thread.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_039",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which feature simulates concurrency?",
            options = listOf("Threads", "Event loop", "Promises", "Async/Await"),
            correctAnswer = "Event loop",
            explanation = "Event loop enables concurrent-like behavior.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_040",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async approach is easiest for beginners?",
            options = listOf("Callbacks", "Promises", "Async/Await", "Generators"),
            correctAnswer = "Async/Await",
            explanation = "Async/Await is easier to read and understand.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_041",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async issue blocks the UI?",
            options = listOf("Long synchronous tasks", "Promises", "Async/Await", "Callbacks"),
            correctAnswer = "Long synchronous tasks",
            explanation = "Blocking code freezes the UI.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_042",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which function schedules microtasks?",
            options = listOf("setTimeout()", "Promise.then()", "setInterval()", "addEventListener()"),
            correctAnswer = "Promise.then()",
            explanation = "then() callbacks go to microtask queue.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_043",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async feature improves error handling most?",
            options = listOf("Callbacks", "Promises", "Async/Await", "Intervals"),
            correctAnswer = "Async/Await",
            explanation = "Async/Await supports try-catch blocks.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_044",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async method executes tasks concurrently?",
            options = listOf("await", "Promise.all()", "then()", "setTimeout()"),
            correctAnswer = "Promise.all()",
            explanation = "Promise.all() runs promises in parallel.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_async_javascript_045",
            categoryId = categoryId,
            chapterId = JS_ASYNC,
            questionText = "Which async concept is essential for modern web apps?",
            options = listOf("Loops", "Async programming", "Variables", "Conditionals"),
            correctAnswer = "Async programming",
            explanation = "Modern apps rely heavily on asynchronous operations.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        jsQuestion(
            id = "javascript_error_handling_001",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "What is an error in JavaScript?",
            options = listOf(
                "A syntax feature",
                "A mistake that stops correct program execution",
                "A variable type",
                "A loop condition"
            ),
            correctAnswer = "A mistake that stops correct program execution",
            explanation = "Errors occur when something goes wrong during code execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_002",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which block is used to test code for errors?",
            options = listOf("check", "error", "try", "test"),
            correctAnswer = "try",
            explanation = "The try block contains code that may throw an error.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_003",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which block handles the error if it occurs?",
            options = listOf("throw", "finally", "catch", "error"),
            correctAnswer = "catch",
            explanation = "The catch block executes when an error is thrown in try.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_004",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which block always executes whether error occurs or not?",
            options = listOf("try", "catch", "throw", "finally"),
            correctAnswer = "finally",
            explanation = "finally always runs after try and catch blocks.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_005",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which keyword is used to create a custom error?",
            options = listOf("error", "throw", "catch", "exception"),
            correctAnswer = "throw",
            explanation = "throw is used to generate a custom error.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_006",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which object represents runtime errors in JavaScript?",
            options = listOf("Exception", "Bug", "Error", "Mistake"),
            correctAnswer = "Error",
            explanation = "Error is the built-in object for runtime errors.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_007",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error occurs due to invalid JavaScript syntax?",
            options = listOf("TypeError", "ReferenceError", "SyntaxError", "RangeError"),
            correctAnswer = "SyntaxError",
            explanation = "SyntaxError occurs when code syntax is invalid.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_008",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error occurs when accessing an undefined variable?",
            options = listOf("TypeError", "ReferenceError", "SyntaxError", "EvalError"),
            correctAnswer = "ReferenceError",
            explanation = "ReferenceError occurs when a variable is not defined.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_009",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error occurs when a value is not of expected type?",
            options = listOf("SyntaxError", "RangeError", "TypeError", "URIError"),
            correctAnswer = "TypeError",
            explanation = "TypeError happens when an operation uses wrong data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_010",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error occurs when a number is outside allowed range?",
            options = listOf("RangeError", "TypeError", "ReferenceError", "SyntaxError"),
            correctAnswer = "RangeError",
            explanation = "RangeError occurs when a value exceeds allowed limits.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_011",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error is related to encodeURI or decodeURI?",
            options = listOf("URIError", "EvalError", "TypeError", "SyntaxError"),
            correctAnswer = "URIError",
            explanation = "URIError occurs when URI functions receive invalid values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_012",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error is related to the eval() function?",
            options = listOf("EvalError", "TypeError", "SyntaxError", "RangeError"),
            correctAnswer = "EvalError",
            explanation = "EvalError represents errors related to eval().",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_013",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "What happens if an error is not handled?",
            options = listOf(
                "Program continues normally",
                "Program crashes or stops execution",
                "Error is ignored",
                "Compiler fixes it"
            ),
            correctAnswer = "Program crashes or stops execution",
            explanation = "Unhandled errors can terminate program execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_014",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which statement is optional in try-catch?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "finally",
            explanation = "finally block is optional in error handling.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_015",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Can a try block exist without a catch block?",
            options = listOf("Yes", "No", "Only in strict mode", "Only in ES6"),
            correctAnswer = "Yes",
            explanation = "try can exist with finally but without catch.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_016",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which keyword is used to manually stop execution?",
            options = listOf("stop", "exit", "throw", "break"),
            correctAnswer = "throw",
            explanation = "throw stops execution by creating an error.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_017",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "What type of value can be thrown in JavaScript?",
            options = listOf("Only Error objects", "Only strings", "Any value", "Only numbers"),
            correctAnswer = "Any value",
            explanation = "JavaScript allows throwing any value as an error.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_018",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which property gives error message?",
            options = listOf("error.text", "message", "description", "errorType"),
            correctAnswer = "message",
            explanation = "The message property describes the error.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_019",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which property gives error name?",
            options = listOf("type", "errorName", "name", "message"),
            correctAnswer = "name",
            explanation = "name property specifies the error type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_020",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which block executes first in error handling?",
            options = listOf("catch", "finally", "try", "throw"),
            correctAnswer = "try",
            explanation = "Execution always starts with the try block.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_021",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which block executes if no error occurs?",
            options = listOf("catch only", "finally only", "try only", "try and finally"),
            correctAnswer = "try and finally",
            explanation = "try runs and finally always executes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_022",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which statement is best for input validation?",
            options = listOf("console.log", "throw", "alert", "prompt"),
            correctAnswer = "throw",
            explanation = "throw is used to handle invalid input cases.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_023",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which approach prevents application crash?",
            options = listOf("Ignoring errors", "Using try-catch", "Using alerts", "Using comments"),
            correctAnswer = "Using try-catch",
            explanation = "try-catch handles errors safely.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_024",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error occurs at runtime?",
            options = listOf("SyntaxError", "Logical error", "Runtime error", "Compile error"),
            correctAnswer = "Runtime error",
            explanation = "Runtime errors occur during program execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_025",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error type is not built-in?",
            options = listOf("TypeError", "SyntaxError", "LogicalError", "ReferenceError"),
            correctAnswer = "LogicalError",
            explanation = "LogicalError is not a built-in JavaScript error.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_026",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "What is the main purpose of error handling?",
            options = listOf(
                "Improve UI",
                "Prevent crashes and handle failures",
                "Increase speed",
                "Reduce memory"
            ),
            correctAnswer = "Prevent crashes and handle failures",
            explanation = "Error handling makes programs more robust.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_027",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which block can be skipped if no error occurs?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "catch",
            explanation = "catch runs only when an error occurs.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_028",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which keyword rethrows an error?",
            options = listOf("return", "throw", "catch", "break"),
            correctAnswer = "throw",
            explanation = "throw can be used again inside catch to rethrow error.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_029",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which technique helps debugging errors?",
            options = listOf("try-catch", "console.log", "breakpoints", "All of these"),
            correctAnswer = "All of these",
            explanation = "Multiple techniques help identify and debug errors.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_030",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error handling method improves user experience?",
            options = listOf("Ignoring errors", "Showing raw errors", "Graceful handling", "Crashing app"),
            correctAnswer = "Graceful handling",
            explanation = "Graceful handling prevents exposing technical errors.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_031",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error type is caused by wrong logic?",
            options = listOf("SyntaxError", "Runtime error", "Logical error", "ReferenceError"),
            correctAnswer = "Logical error",
            explanation = "Logical errors produce wrong output without crashing.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_032",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which statement ensures cleanup code runs?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "finally",
            explanation = "finally is used for cleanup operations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_033",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error is thrown when calling something not a function?",
            options = listOf("ReferenceError", "TypeError", "SyntaxError", "EvalError"),
            correctAnswer = "TypeError",
            explanation = "Calling non-functions causes TypeError.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_034",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error is thrown when JSON.parse fails?",
            options = listOf("TypeError", "ReferenceError", "SyntaxError", "RangeError"),
            correctAnswer = "SyntaxError",
            explanation = "Invalid JSON causes SyntaxError.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_035",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which block can access the error object?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "catch",
            explanation = "catch receives the error object as parameter.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_036",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error occurs when stack size exceeds limit?",
            options = listOf("RangeError", "TypeError", "ReferenceError", "SyntaxError"),
            correctAnswer = "RangeError",
            explanation = "Stack overflow results in RangeError.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_037",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which method logs error details to console?",
            options = listOf("console.log", "console.error", "console.warn", "alert"),
            correctAnswer = "console.error",
            explanation = "console.error is used for error messages.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_038",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error type indicates invalid assignment?",
            options = listOf("TypeError", "ReferenceError", "SyntaxError", "EvalError"),
            correctAnswer = "TypeError",
            explanation = "Invalid assignments often cause TypeError.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_039",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error is thrown when accessing property of null?",
            options = listOf("ReferenceError", "TypeError", "RangeError", "SyntaxError"),
            correctAnswer = "TypeError",
            explanation = "Accessing null properties causes TypeError.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_040",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which statement is best practice for error handling?",
            options = listOf(
                "Ignore errors",
                "Use try-catch properly",
                "Use alerts everywhere",
                "Suppress all errors"
            ),
            correctAnswer = "Use try-catch properly",
            explanation = "Proper handling improves reliability.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_041",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error handling feature improves code stability?",
            options = listOf("Loops", "Conditions", "Error handling", "Variables"),
            correctAnswer = "Error handling",
            explanation = "Error handling prevents unexpected crashes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_042",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which keyword is used inside catch block?",
            options = listOf("error", "exception", "parameter", "throw"),
            correctAnswer = "parameter",
            explanation = "catch receives the error as a parameter.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_043",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error handling approach is safest?",
            options = listOf("Ignoring errors", "Partial handling", "Complete handling", "No handling"),
            correctAnswer = "Complete handling",
            explanation = "Complete handling ensures reliability.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_044",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which error occurs when variable is used before declaration?",
            options = listOf("TypeError", "ReferenceError", "SyntaxError", "RangeError"),
            correctAnswer = "ReferenceError",
            explanation = "Using undeclared variables causes ReferenceError.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        jsQuestion(
            id = "javascript_error_handling_045",
            categoryId = categoryId,
            chapterId = JS_ERROR_HANDLING,
            questionText = "Which concept makes JavaScript applications robust?",
            options = listOf("Loops", "Error handling", "Variables", "Operators"),
            correctAnswer = "Error handling",
            explanation = "Error handling improves stability and robustness.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),


        )
}
