package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

// =====================================================
// C CHAPTER IDS (MUST MATCH ChapterScreen + filtering)
// =====================================================
const val C_BASICS = "c_basics_of_c"
const val C_DATA_TYPES = "c_data_types_and_variables"
const val C_OPERATORS = "c_operators_and_expressions"
const val C_CONTROL_FLOW = "c_conditional_statements"
const val C_LOOPS = "c_loops"
const val C_ARRAYS = "c_arrays"
const val C_STRINGS = "c_strings"
const val C_FUNCTIONS = "c_functions"
const val C_POINTERS = "c_pointers"
const val C_STRUCTURES = "c_structures_and_unions"
const val C_FILE_HANDLING = "c_file_handling"
const val C_DYNAMIC_MEMORY = "c_dynamic_memory_allocation"

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
    return listOf(
        cQuestion(
            id = "c_basics_001",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Who developed the C programming language?",
            options = listOf("Dennis Ritchie", "Ken Thompson", "James Gosling", "Bjarne Stroustrup"),
            correctAnswer = "Dennis Ritchie",
            explanation = "C was developed by Dennis Ritchie at Bell Labs. It was mainly designed for system programming.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_002",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which operator is used to get the address of a variable?",
            options = listOf("*", "&", "%", "#"),
            correctAnswer = "&",
            explanation = "& operator returns the memory address of a variable.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_003",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Output of: printf(\"%d\", 7 / 2);",
            options = listOf("3.5", "3", "4", "Error"),
            correctAnswer = "3",
            explanation = "Both values are integers, so integer division is performed.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_004",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which function is the starting point of a C program?",
            options = listOf("start()", "main()", "begin()", "init()"),
            correctAnswer = "main()",
            explanation = "Execution of every C program starts from the main() function.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_005",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following is a valid C identifier?",
            options = listOf("int", "2sum", "_count", "total-value"),
            correctAnswer = "_count",
            explanation = "Identifiers can start with underscore but not with digits or symbols.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_006",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which data type occupies 1 byte in C?",
            options = listOf("int", "char", "float", "double"),
            correctAnswer = "char",
            explanation = "char stores a single character and occupies 1 byte of memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_007",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following is NOT a C keyword?",
            options = listOf("register", "volatile", "boolean", "auto"),
            correctAnswer = "boolean",
            explanation = "C does not have a boolean keyword. It uses int for true or false.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_008",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which symbol is used to end a statement in C?",
            options = listOf(",", ".", ":", ";"),
            correctAnswer = ";",
            explanation = "Semicolon marks the end of a statement in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_009",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which header file is required for scanf()?",
            options = listOf("<math.h>", "<stdlib.h>", "<stdio.h>", "<string.h>"),
            correctAnswer = "<stdio.h>",
            explanation = "scanf() is declared in stdio.h for standard input.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_010",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which loop executes at least once?",
            options = listOf("for", "while", "do-while", "nested for"),
            correctAnswer = "do-while",
            explanation = "do-while checks the condition after executing the loop body.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_011",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What is the default return type of main()?",
            options = listOf("void", "float", "int", "double"),
            correctAnswer = "int",
            explanation = "main() returns an integer value to the operating system.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_012",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which operator has the highest precedence?",
            options = listOf("+", "*", "()", "="),
            correctAnswer = "()",
            explanation = "Expressions inside parentheses are evaluated first.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_013",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which keyword is used to declare a constant?",
            options = listOf("static", "const", "final", "define"),
            correctAnswer = "const",
            explanation = "const makes a variable read-only after initialization.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_014",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "C language is mainly used for?",
            options = listOf("Web development", "System programming", "Mobile apps", "AI development"),
            correctAnswer = "System programming",
            explanation = "C is widely used for operating systems and embedded systems.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_015",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What does continue do in a loop?",
            options = listOf("Stops loop", "Skips current iteration", "Exits program", "Repeats loop"),
            correctAnswer = "Skips current iteration",
            explanation = "continue skips remaining statements and moves to next iteration.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_basics_016",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which symbol is used for single-line comment in C?",
            options = listOf("/*", "//", "#", "--"),
            correctAnswer = "//",
            explanation = "// is used to write single-line comments in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_017",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following is a correct printf format specifier for int?",
            options = listOf("%f", "%c", "%d", "%s"),
            correctAnswer = "%d",
            explanation = "%d is used to print integer values in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_018",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What will be the output of: printf(\"%d\", 5 == 5);",
            options = listOf("true", "false", "1", "0"),
            correctAnswer = "1",
            explanation = "Relational expressions return 1 if true and 0 if false.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_019",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which loop is best suited when number of iterations is known?",
            options = listOf("while", "do-while", "for", "infinite loop"),
            correctAnswer = "for",
            explanation = "for loop is commonly used when the number of iterations is fixed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_020",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which keyword is used to exit from a loop immediately?",
            options = listOf("stop", "exit", "break", "continue"),
            correctAnswer = "break",
            explanation = "break terminates the loop and control moves outside the loop.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_021",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which operator is used for logical AND?",
            options = listOf("&", "&&", "|", "||"),
            correctAnswer = "&&",
            explanation = "&& checks multiple conditions and returns true only if all are true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_022",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following correctly declares a variable?",
            options = listOf("int x;", "int = x;", "x int;", "declare int x;"),
            correctAnswer = "int x;",
            explanation = "Variable declaration follows: data_type variable_name;",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_023",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What is the output of: printf(\"%d\", 10 > 20);",
            options = listOf("1", "0", "true", "false"),
            correctAnswer = "0",
            explanation = "The condition is false, so result is 0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_024",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which header file is used for string functions?",
            options = listOf("<stdio.h>", "<stdlib.h>", "<string.h>", "<math.h>"),
            correctAnswer = "<string.h>",
            explanation = "string.h contains functions like strlen() and strcpy().",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_025",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which data type is best for decimal values?",
            options = listOf("int", "char", "float", "long"),
            correctAnswer = "float",
            explanation = "float is used to store numbers with decimal points.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_026",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What is the output of: printf(\"%d\", !0);",
            options = listOf("0", "1", "Error", "-1"),
            correctAnswer = "1",
            explanation = "!0 means NOT false, which gives true (1).",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_027",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which keyword is used to return a value from a function?",
            options = listOf("break", "continue", "return", "exit"),
            correctAnswer = "return",
            explanation = "return sends a value back to the calling function.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_028",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of these is a relational operator?",
            options = listOf("=", "+", "==", "&&"),
            correctAnswer = "==",
            explanation = "== is used to compare two values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_029",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What will be the output of: printf(\"%d\", 3 + 2 * 2);",
            options = listOf("10", "7", "8", "9"),
            correctAnswer = "7",
            explanation = "Multiplication has higher precedence than addition.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_030",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following is used to read input?",
            options = listOf("printf()", "scanf()", "output()", "read()"),
            correctAnswer = "scanf()",
            explanation = "scanf() is used to take input from the user.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_031",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which keyword is used to declare a variable globally?",
            options = listOf("auto", "extern", "static", "register"),
            correctAnswer = "extern",
            explanation = "extern allows a variable to be accessed across files.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_032",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which loop checks condition before executing body?",
            options = listOf("do-while", "while", "infinite", "nested"),
            correctAnswer = "while",
            explanation = "while checks the condition first, then executes the loop.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_033",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which operator is used to assign value?",
            options = listOf("==", "=", "!=", ">"),
            correctAnswer = "=",
            explanation = "= assigns a value to a variable.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_034",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which statement skips remaining loop body and continues?",
            options = listOf("break", "exit", "continue", "return"),
            correctAnswer = "continue",
            explanation = "continue skips current iteration and moves to next loop cycle.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_035",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following is NOT a data type in C?",
            options = listOf("int", "float", "string", "char"),
            correctAnswer = "string",
            explanation = "C does not have a built-in string data type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_036",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which file extension is used for C programs?",
            options = listOf(".cpp", ".java", ".c", ".py"),
            correctAnswer = ".c",
            explanation = "C source code files use the .c extension.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_037",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What does sizeof operator return?",
            options = listOf("Value", "Address", "Data type", "Size in bytes"),
            correctAnswer = "Size in bytes",
            explanation = "sizeof returns the memory size of a variable or data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_038",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which operator is called unary operator?",
            options = listOf("+", "-", "++", "*"),
            correctAnswer = "++",
            explanation = "Unary operators work on a single operand.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_039",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which keyword is used to define a function with no return value?",
            options = listOf("null", "empty", "void", "return"),
            correctAnswer = "void",
            explanation = "void indicates that a function does not return any value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_040",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following is a logical operator?",
            options = listOf(">", "&&", "=", "+"),
            correctAnswer = "&&",
            explanation = "&& is a logical AND operator.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_041",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "What is the output of: printf(\"%d\", 0 && 1);",
            options = listOf("0", "1", "true", "Error"),
            correctAnswer = "0",
            explanation = "Logical AND returns false if any operand is false.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_042",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which keyword is used for decision making?",
            options = listOf("loop", "switch", "if", "case"),
            correctAnswer = "if",
            explanation = "if is used to execute code based on a condition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_043",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which statement is used inside switch?",
            options = listOf("break", "continue", "exit", "return"),
            correctAnswer = "break",
            explanation = "break prevents fall-through in switch cases.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_044",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "Which of the following causes infinite loop?",
            options = listOf("for(;;)", "while(0)", "do-while(0)", "break"),
            correctAnswer = "for(;;)",
            explanation = "for(;;) has no condition, so it runs infinitely.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_basics_045",
            categoryId = categoryId,
            chapterId = C_BASICS,
            questionText = "C language is best described as?",
            options = listOf("High-level", "Low-level", "Middle-level", "Machine-level"),
            correctAnswer = "Middle-level",
            explanation = "C supports both high-level features and low-level memory access.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

    // -------------------- DATA TYPES --------------------
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
            questionText = "Which data type is used to store whole numbers?",
            options = listOf("float", "double", "int", "char"),
            correctAnswer = "int",
            explanation = "int is used to store integer values without decimals.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_003",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is suitable for decimal values?",
            options = listOf("int", "char", "float", "short"),
            correctAnswer = "float",
            explanation = "float stores numbers with decimal points.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_004",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type uses more memory?",
            options = listOf("float", "double", "char", "short"),
            correctAnswer = "double",
            explanation = "double uses more memory than float and provides higher precision.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_005",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type modifier increases storage size?",
            options = listOf("short", "signed", "long", "const"),
            correctAnswer = "long",
            explanation = "long increases the storage size of a data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_006",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is NOT a basic data type in C?",
            options = listOf("int", "float", "char", "string"),
            correctAnswer = "string",
            explanation = "C does not have a built-in string data type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_007",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type modifier allows negative values?",
            options = listOf("unsigned", "signed", "long", "short"),
            correctAnswer = "signed",
            explanation = "signed allows both positive and negative values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_008",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which modifier restricts values to non-negative only?",
            options = listOf("signed", "long", "unsigned", "const"),
            correctAnswer = "unsigned",
            explanation = "unsigned allows only zero and positive values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_009",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "What is the size of char in C?",
            options = listOf("1 byte", "2 bytes", "4 bytes", "8 bytes"),
            correctAnswer = "1 byte",
            explanation = "char is always 1 byte in C, regardless of system.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_010",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type consumes the least memory?",
            options = listOf("char", "int", "float", "double"),
            correctAnswer = "char",
            explanation = "char occupies the least memory among basic data types.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_011",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is best for high precision decimal values?",
            options = listOf("float", "double", "int", "char"),
            correctAnswer = "double",
            explanation = "double provides more precision than float.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_012",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is a valid declaration?",
            options = listOf("unsigned int x;", "unsigned float y;", "signed float z;", "long char c;"),
            correctAnswer = "unsigned int x;",
            explanation = "unsigned is valid only with integer types.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_013",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which keyword is used to make a variable constant?",
            options = listOf("final", "static", "const", "fixed"),
            correctAnswer = "const",
            explanation = "const prevents modification of variable value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_014",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type can store the largest integer value?",
            options = listOf("short", "int", "long", "char"),
            correctAnswer = "long",
            explanation = "long can store larger integer values than int.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_015",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is used for storing characters?",
            options = listOf("char", "int", "float", "double"),
            correctAnswer = "char",
            explanation = "char is designed to store character values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_016",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which modifier cannot be applied to float?",
            options = listOf("signed", "const", "volatile", "static"),
            correctAnswer = "signed",
            explanation = "signed and unsigned are not applicable to float.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_017",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following increases precision?",
            options = listOf("float to int", "int to char", "float to double", "double to float"),
            correctAnswer = "float to double",
            explanation = "double has higher precision than float.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_018",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type stores only true or false values in C?",
            options = listOf("bool", "int", "char", "float"),
            correctAnswer = "int",
            explanation = "C uses int to represent boolean values (0 or 1).",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_019",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is a user-defined data type?",
            options = listOf("int", "float", "struct", "double"),
            correctAnswer = "struct",
            explanation = "struct is a user-defined data type in C.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_020",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which keyword is used to define a new data type?",
            options = listOf("define", "typedef", "struct", "enum"),
            correctAnswer = "typedef",
            explanation = "typedef creates an alias for an existing data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_021",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type occupies more space than int?",
            options = listOf("char", "short", "long", "signed"),
            correctAnswer = "long",
            explanation = "long uses more memory compared to int.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_022",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is NOT a type modifier?",
            options = listOf("short", "long", "signed", "static"),
            correctAnswer = "static",
            explanation = "static is a storage class, not a type modifier.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_023",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is fastest to access?",
            options = listOf("char", "int", "float", "double"),
            correctAnswer = "int",
            explanation = "int is generally fastest due to CPU alignment.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_024",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which type is returned by sizeof operator?",
            options = listOf("int", "long", "unsigned int", "size_t"),
            correctAnswer = "size_t",
            explanation = "sizeof returns a value of type size_t.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_025",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type can be modified using signed and unsigned?",
            options = listOf("float", "double", "char", "void"),
            correctAnswer = "char",
            explanation = "char can be signed or unsigned in C.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_026",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type has implementation-defined size?",
            options = listOf("char", "int", "float", "double"),
            correctAnswer = "int",
            explanation = "Size of int depends on compiler and system.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_027",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type represents no value?",
            options = listOf("null", "void", "empty", "none"),
            correctAnswer = "void",
            explanation = "void represents absence of any value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_028",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which is the correct declaration of unsigned char?",
            options = listOf("char unsigned x;", "unsigned char x;", "char x unsigned;", "unsigned x char;"),
            correctAnswer = "unsigned char x;",
            explanation = "unsigned comes before the data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_029",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is best for memory efficiency?",
            options = listOf("double", "float", "int", "char"),
            correctAnswer = "char",
            explanation = "char consumes the least memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_030",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is an invalid data type?",
            options = listOf("long int", "signed char", "unsigned float", "short int"),
            correctAnswer = "unsigned float",
            explanation = "float cannot be signed or unsigned.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_data_types_031",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is used to represent real numbers with more precision?",
            options = listOf("float", "double", "int", "char"),
            correctAnswer = "double",
            explanation = "double can store decimal values with higher precision than float, so it is used when accuracy matters.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_032",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following data types can store both positive and negative values?",
            options = listOf("unsigned int", "unsigned char", "signed int", "unsigned long"),
            correctAnswer = "signed int",
            explanation = "signed int allows both negative and positive numbers. Unsigned types allow only non-negative values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_033",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is generally used to store ASCII values?",
            options = listOf("int", "char", "float", "double"),
            correctAnswer = "char",
            explanation = "Characters in C are stored as ASCII values, and char is designed for this purpose.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_034",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which modifier reduces the storage size of an integer?",
            options = listOf("long", "signed", "short", "unsigned"),
            correctAnswer = "short",
            explanation = "short reduces the size of an integer compared to a normal int.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_035",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is a correct declaration?",
            options = listOf("short float x;", "long double y;", "unsigned double z;", "signed float a;"),
            correctAnswer = "long double y;",
            explanation = "long double is valid and provides higher precision. float and double cannot be unsigned or signed.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_036",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is best suited to store a very large integer value?",
            options = listOf("int", "short", "long int", "char"),
            correctAnswer = "long int",
            explanation = "long int can store larger integer values than int and short.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_037",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is a derived data type?",
            options = listOf("int", "float", "array", "char"),
            correctAnswer = "array",
            explanation = "Array is a derived data type because it is built using basic data types.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_038",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type has the smallest range?",
            options = listOf("int", "char", "long", "double"),
            correctAnswer = "char",
            explanation = "char uses only 1 byte of memory, so it has the smallest range of values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_039",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which keyword is used to create an alias name for a data type?",
            options = listOf("define", "struct", "typedef", "enum"),
            correctAnswer = "typedef",
            explanation = "typedef allows you to create a new name for an existing data type to improve readability.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_040",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is returned by the expression sizeof(int)?",
            options = listOf("int", "long", "size_t", "unsigned int"),
            correctAnswer = "size_t",
            explanation = "sizeof returns a value of type size_t, which represents size in bytes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_041",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following is an example of a floating-point data type?",
            options = listOf("int", "char", "float", "short"),
            correctAnswer = "float",
            explanation = "float is used to store numbers with decimal values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_042",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type should be used to store the result of sizeof operator?",
            options = listOf("int", "float", "size_t", "char"),
            correctAnswer = "size_t",
            explanation = "size_t is designed to safely store memory sizes returned by sizeof.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_043",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which of the following combinations is invalid?",
            options = listOf("signed char", "unsigned int", "long float", "short int"),
            correctAnswer = "long float",
            explanation = "float cannot be combined with long. Only double supports long (long double).",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_044",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type category does enum belong to?",
            options = listOf("Basic", "Derived", "User-defined", "Void"),
            correctAnswer = "User-defined",
            explanation = "enum is created by the programmer, so it is a user-defined data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_data_types_045",
            categoryId = categoryId,
            chapterId = C_DATA_TYPES,
            questionText = "Which data type is most suitable when memory usage must be minimal?",
            options = listOf("double", "float", "int", "char"),
            correctAnswer = "char",
            explanation = "char occupies the least memory (1 byte), so it is best when memory is limited.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
    // -------------------- OPERATORS --------------------
        cQuestion(
            id = "c_operators_001",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator gives the remainder?",
            options = listOf("%", "/", "*", "+"),
            correctAnswer = "%",
            explanation = "% is the modulus operator. It returns the remainder after division.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_002",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used for division in C?",
            options = listOf("%", "/", "*", "-"),
            correctAnswer = "/",
            explanation = "/ is used to divide one operand by another.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_003",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is called unary operator?",
            options = listOf("+", "++", "*", "/"),
            correctAnswer = "++",
            explanation = "++ works on a single operand, so it is a unary operator.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_004",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 10 % 3);",
            options = listOf("1", "3", "0", "Error"),
            correctAnswer = "1",
            explanation = "10 divided by 3 gives remainder 1, which is returned by %.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_005",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used to assign a value?",
            options = listOf("==", "=", "!=", ">"),
            correctAnswer = "=",
            explanation = "= assigns a value to a variable.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_006",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator checks equality?",
            options = listOf("=", "==", "<=", "!="),
            correctAnswer = "==",
            explanation = "== compares two values and checks if they are equal.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_007",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which of the following is a relational operator?",
            options = listOf("&&", "||", ">", "="),
            correctAnswer = ">",
            explanation = "Relational operators compare two values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_008",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 5 > 10);",
            options = listOf("1", "0", "true", "false"),
            correctAnswer = "0",
            explanation = "The condition is false, so the result is 0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_009",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator performs logical AND?",
            options = listOf("&", "&&", "|", "||"),
            correctAnswer = "&&",
            explanation = "&& returns true only if both conditions are true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_010",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator performs logical OR?",
            options = listOf("|", "||", "&", "^"),
            correctAnswer = "||",
            explanation = "|| returns true if at least one condition is true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_011",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 0 && 1);",
            options = listOf("1", "0", "true", "Error"),
            correctAnswer = "0",
            explanation = "Logical AND returns false if any operand is false.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_012",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used for bitwise AND?",
            options = listOf("&", "&&", "|", "||"),
            correctAnswer = "&",
            explanation = "& performs bit-by-bit AND operation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_013",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator shifts bits to the left?",
            options = listOf(">>", "<<", "&", "^"),
            correctAnswer = "<<",
            explanation = "<< shifts bits to the left side.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_014",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator shifts bits to the right?",
            options = listOf("<<", ">>", "|", "~"),
            correctAnswer = ">>",
            explanation = ">> shifts bits to the right side.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_015",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used to invert bits?",
            options = listOf("!", "~", "^", "&"),
            correctAnswer = "~",
            explanation = "~ flips each bit of the operand.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_016",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator has the highest precedence?",
            options = listOf("*", "+", "()", "="),
            correctAnswer = "()",
            explanation = "Expressions inside parentheses are evaluated first.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_017",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", !0);",
            options = listOf("0", "1", "-1", "Error"),
            correctAnswer = "1",
            explanation = "!0 means NOT false, so the result is true (1).",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_018",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is called ternary operator?",
            options = listOf("?", "?:", "&&", "||"),
            correctAnswer = "?:",
            explanation = "The conditional operator ?: works with three operands.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_019",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used to find size of a variable?",
            options = listOf("length", "size", "sizeof", "bytes"),
            correctAnswer = "sizeof",
            explanation = "sizeof returns the memory size of a variable or data type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_020",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator combines assignment and addition?",
            options = listOf("=+", "+=", "++", "+"),
            correctAnswer = "+=",
            explanation = "+= adds a value and assigns the result.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_021",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator has the lowest precedence?",
            options = listOf("*", "+", "=", "()"),
            correctAnswer = "=",
            explanation = "Assignment operator has lower precedence than arithmetic operators.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_022",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 5 + 2 * 3);",
            options = listOf("21", "11", "17", "13"),
            correctAnswer = "11",
            explanation = "Multiplication happens first, then addition.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_023",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used for inequality check?",
            options = listOf("==", "!=", "<>", "="),
            correctAnswer = "!=",
            explanation = "!= checks whether two values are not equal.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_024",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator performs bitwise XOR?",
            options = listOf("&", "|", "^", "~"),
            correctAnswer = "^",
            explanation = "^ performs bitwise exclusive OR operation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_025",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator increases value by 1?",
            options = listOf("+", "++", "+=", "="),
            correctAnswer = "++",
            explanation = "++ increments the value of a variable by one.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_026",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator decreases value by 1?",
            options = listOf("--", "-", "-=", "/"),
            correctAnswer = "--",
            explanation = "-- decrements the value of a variable by one.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_027",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is evaluated first?",
            options = listOf("+", "*", "=", "-"),
            correctAnswer = "*",
            explanation = "Multiplication has higher precedence than addition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_028",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 3 < 5 && 5 < 2);",
            options = listOf("1", "0", "true", "false"),
            correctAnswer = "0",
            explanation = "Second condition is false, so AND returns false.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_029",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator converts true to false and false to true?",
            options = listOf("~", "!", "^", "&"),
            correctAnswer = "!",
            explanation = "! is the logical NOT operator.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_030",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used to compare two values?",
            options = listOf("=", "==", "+", "%"),
            correctAnswer = "==",
            explanation = "== compares two values and returns true or false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_operators_031",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 5 == 5 == 1);",
            options = listOf("1", "0", "True", "Error"),
            correctAnswer = "1",
            explanation = "5==5 gives 1, then 1==1 is also true, so output is 1. This is a common exam trap.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_032",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator has higher precedence?",
            options = listOf("&&", "||", "!", "="),
            correctAnswer = "!",
            explanation = "Logical NOT (!) has higher precedence than AND (&&) and OR (||).",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_033",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 10 & 3);",
            options = listOf("2", "3", "1", "0"),
            correctAnswer = "2",
            explanation = "10 (1010) & 3 (0011) gives 0010, which is 2 in decimal.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_034",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is evaluated last?",
            options = listOf("*", "+", "=", "()"),
            correctAnswer = "=",
            explanation = "Assignment operator has very low precedence and is evaluated last.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_035",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 5 | 3);",
            options = listOf("7", "6", "5", "3"),
            correctAnswer = "7",
            explanation = "5 (0101) | 3 (0011) gives 0111, which is 7.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_036",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used to check multiple conditions?",
            options = listOf("&", "&&", "|", "^"),
            correctAnswer = "&&",
            explanation = "&& is the logical AND operator used to combine conditions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_037",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 4 << 1);",
            options = listOf("8", "4", "2", "16"),
            correctAnswer = "8",
            explanation = "Left shift moves bits left by one position. 4 becomes 8.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_038",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator can be used as a shortcut for addition assignment?",
            options = listOf("=+", "+=", "++", "+"),
            correctAnswer = "+=",
            explanation = "+= adds a value to a variable and assigns it back.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_039",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 2 > 1 ? 5 : 10);",
            options = listOf("10", "5", "1", "0"),
            correctAnswer = "5",
            explanation = "Condition is true, so the first value after ? is selected.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_040",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator is used only with integers?",
            options = listOf("/", "%", "*", "+"),
            correctAnswer = "%",
            explanation = "Modulus operator works only with integer operands in C.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_041",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", ~1);",
            options = listOf("-2", "0", "1", "-1"),
            correctAnswer = "-2",
            explanation = "~1 flips all bits. In two’s complement, result becomes -2.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_042",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator associates from right to left?",
            options = listOf("+", "*", "=", "&&"),
            correctAnswer = "=",
            explanation = "Assignment operator associates from right to left.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_043",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "What is the output of: printf(\"%d\", 5 ^ 3);",
            options = listOf("6", "8", "2", "1"),
            correctAnswer = "6",
            explanation = "5 (0101) XOR 3 (0011) gives 0110, which is 6.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_044",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator can replace an if-else statement?",
            options = listOf("?:", "&&", "||", "=="),
            correctAnswer = "?:",
            explanation = "Conditional (ternary) operator works like a short if-else.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_operators_045",
            categoryId = categoryId,
            chapterId = C_OPERATORS,
            questionText = "Which operator causes short-circuit evaluation?",
            options = listOf("&", "|", "&&", "^"),
            correctAnswer = "&&",
            explanation = "&& stops evaluation if the first condition is false. This is very important in exams.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
    // -------------------- CONTROL FLOW --------------------
        cQuestion(
            id = "c_control_flow_001",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword starts a conditional statement?",
            options = listOf("if", "for", "switch", "goto"),
            correctAnswer = "if",
            explanation = "The if keyword is used to execute code based on a condition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_002",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement is used to select one option from many?",
            options = listOf("if", "switch", "goto", "break"),
            correctAnswer = "switch",
            explanation = "switch is used when multiple choices depend on a single variable.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_003",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword is used to execute code when condition is false?",
            options = listOf("else", "default", "break", "continue"),
            correctAnswer = "else",
            explanation = "else runs when the if condition evaluates to false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_004",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What is the output of: if(0) printf(\"Hi\");",
            options = listOf("Hi", "No output", "0", "Error"),
            correctAnswer = "No output",
            explanation = "0 is treated as false, so the if body is not executed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_005",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword is mandatory in switch statement?",
            options = listOf("break", "case", "default", "continue"),
            correctAnswer = "case",
            explanation = "case labels are required to define different execution paths.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_006",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What happens if break is missing in switch?",
            options = listOf(
                "Compilation error",
                "Only one case executes",
                "Fall-through occurs",
                "Program stops"
            ),
            correctAnswer = "Fall-through occurs",
            explanation = "Without break, execution continues to the next case.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_007",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword handles unmatched cases in switch?",
            options = listOf("else", "break", "default", "continue"),
            correctAnswer = "default",
            explanation = "default runs when no case matches.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_008",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which expression type is allowed in if condition?",
            options = listOf("Only boolean", "Only relational", "Any non-zero value", "Only logical"),
            correctAnswer = "Any non-zero value",
            explanation = "In C, any non-zero value is treated as true.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_009",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What is the output of: if(5) printf(\"Yes\");",
            options = listOf("Yes", "No", "5", "Error"),
            correctAnswer = "Yes",
            explanation = "Any non-zero value is considered true in C.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_010",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement allows jumping to a labeled statement?",
            options = listOf("break", "continue", "goto", "switch"),
            correctAnswer = "goto",
            explanation = "goto transfers control to a labeled statement.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_011",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which of the following is called nested if?",
            options = listOf(
                "if inside loop",
                "if inside if",
                "if inside switch",
                "switch inside if"
            ),
            correctAnswer = "if inside if",
            explanation = "Nested if means one if statement inside another.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_012",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which condition is checked first in if-else-if ladder?",
            options = listOf("Last condition", "Middle condition", "First condition", "Random"),
            correctAnswer = "First condition",
            explanation = "Conditions are checked from top to bottom.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_013",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What is the output of: if(-1) printf(\"True\");",
            options = listOf("True", "False", "0", "Error"),
            correctAnswer = "True",
            explanation = "-1 is non-zero, so it is treated as true.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_014",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword exits from switch?",
            options = listOf("exit", "continue", "break", "return"),
            correctAnswer = "break",
            explanation = "break stops execution of the switch block.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_015",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which is faster for multiple fixed choices?",
            options = listOf("if-else ladder", "switch", "goto", "nested if"),
            correctAnswer = "switch",
            explanation = "switch is faster and clearer for fixed choices.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_016",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which of the following is NOT allowed in switch expression?",
            options = listOf("int", "char", "enum", "float"),
            correctAnswer = "float",
            explanation = "switch does not support floating-point expressions.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_017",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What happens if default is missing in switch?",
            options = listOf(
                "Compilation error",
                "Runtime error",
                "Nothing happens",
                "Program crashes"
            ),
            correctAnswer = "Nothing happens",
            explanation = "If no case matches and default is missing, switch does nothing.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_018",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement can replace simple if-else?",
            options = listOf("goto", "?:", "switch", "break"),
            correctAnswer = "?:",
            explanation = "Ternary operator can replace simple if-else logic.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_019",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What is dangling else problem related to?",
            options = listOf("loops", "switch", "nested if", "goto"),
            correctAnswer = "nested if",
            explanation = "Dangling else occurs when else matches the wrong if.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_020",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which condition is false in C?",
            options = listOf("1", "-1", "5", "0"),
            correctAnswer = "0",
            explanation = "Only 0 is treated as false in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_021",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword transfers control back to calling function?",
            options = listOf("break", "continue", "return", "goto"),
            correctAnswer = "return",
            explanation = "return sends control back to the calling function.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_022",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which of these is mandatory in if statement?",
            options = listOf("else", "condition", "break", "default"),
            correctAnswer = "condition",
            explanation = "if must have a condition to evaluate.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_023",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which block executes only when all if conditions fail?",
            options = listOf("if", "else if", "else", "default"),
            correctAnswer = "else",
            explanation = "else executes when all previous conditions are false.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_024",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control statement is discouraged in structured programming?",
            options = listOf("if", "switch", "goto", "else"),
            correctAnswer = "goto",
            explanation = "goto makes code hard to read and maintain.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_025",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What is the output of: if(printf(\"Hi\")) {}",
            options = listOf("Hi", "No output", "Error", "0"),
            correctAnswer = "Hi",
            explanation = "printf returns number of characters printed, which is non-zero.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_026",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control structure is best for range checking?",
            options = listOf("switch", "if-else", "goto", "break"),
            correctAnswer = "if-else",
            explanation = "if-else is suitable for checking ranges of values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_027",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement can exit from both loop and switch?",
            options = listOf("continue", "goto", "break", "return"),
            correctAnswer = "return",
            explanation = "return exits the function, leaving loop and switch.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_028",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control statement has no condition?",
            options = listOf("if", "switch", "goto", "else"),
            correctAnswer = "else",
            explanation = "else does not have its own condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_029",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement decides execution flow?",
            options = listOf("Control statement", "Data type", "Operator", "Function"),
            correctAnswer = "Control statement",
            explanation = "Control statements decide which code block executes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_030",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control structure avoids multiple if conditions?",
            options = listOf("switch", "if", "goto", "else"),
            correctAnswer = "switch",
            explanation = "switch avoids long if-else chains.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_031",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which is evaluated first in nested if?",
            options = listOf("Inner if", "Outer if", "Random", "Compiler decides"),
            correctAnswer = "Outer if",
            explanation = "Outer if condition is evaluated before entering inner if.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_032",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control statement has optional default part?",
            options = listOf("if", "switch", "goto", "else"),
            correctAnswer = "switch",
            explanation = "default in switch is optional.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_033",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which condition causes else to execute?",
            options = listOf("True", "Non-zero", "False", "Positive"),
            correctAnswer = "False",
            explanation = "else executes when if condition is false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_034",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement is compulsory in switch cases to stop fall-through?",
            options = listOf("continue", "exit", "break", "return"),
            correctAnswer = "break",
            explanation = "break prevents execution of next case.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_035",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control statement improves readability?",
            options = listOf("goto", "nested if", "switch", "multiple goto"),
            correctAnswer = "switch",
            explanation = "switch improves readability for fixed choices.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_036",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement can exist without if?",
            options = listOf("else", "default", "break", "continue"),
            correctAnswer = "default",
            explanation = "default exists independently inside switch.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_037",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "What is the output of: if(printf(\"0\")) printf(\"1\");",
            options = listOf("01", "0", "1", "No output"),
            correctAnswer = "01",
            explanation = "printf(\"0\") returns 1, which is true, so second printf runs.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_038",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement executes exactly once?",
            options = listOf("if", "switch", "else", "default"),
            correctAnswer = "if",
            explanation = "if executes at most once depending on condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_039",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which keyword is used for multiple conditions?",
            options = listOf("if", "else if", "switch", "goto"),
            correctAnswer = "else if",
            explanation = "else if allows checking multiple conditions sequentially.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_040",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which is NOT a control statement?",
            options = listOf("if", "switch", "return", "printf"),
            correctAnswer = "printf",
            explanation = "printf is a function, not a control statement.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_041",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control statement selects one path from many?",
            options = listOf("if", "switch", "goto", "else"),
            correctAnswer = "switch",
            explanation = "switch selects execution path based on value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_042",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control structure can be nested?",
            options = listOf("if", "switch", "both if and switch", "none"),
            correctAnswer = "both if and switch",
            explanation = "Both if and switch can be nested inside each other.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_043",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control statement causes unconditional jump?",
            options = listOf("if", "switch", "goto", "else"),
            correctAnswer = "goto",
            explanation = "goto jumps without checking any condition.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_044",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which statement executes when all if and else if fail?",
            options = listOf("if", "else", "default", "case"),
            correctAnswer = "else",
            explanation = "else executes when all previous conditions are false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_control_flow_045",
            categoryId = categoryId,
            chapterId = C_CONTROL_FLOW,
            questionText = "Which control statement is most prone to logical errors?",
            options = listOf("if", "switch", "goto", "else"),
            correctAnswer = "goto",
            explanation = "goto can break program flow and cause hard-to-find bugs.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        // -------------------- LOOPS --------------------

        cQuestion(
            id = "c_loops_001",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is run at least one time?",
            options = listOf("for", "while", "do-while", "foreach"),
            correctAnswer = "do-while",
            explanation = "do-while executes the loop body first and checks the condition later.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_002",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop checks condition before executing the body?",
            options = listOf("do-while", "while", "foreach", "repeat"),
            correctAnswer = "while",
            explanation = "while loop checks the condition first and then executes the body.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_003",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is best when number of iterations is known?",
            options = listOf("while", "do-while", "for", "infinite"),
            correctAnswer = "for",
            explanation = "for loop is commonly used when iterations are fixed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_004",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "How many times will this loop run? for(i=0;i<5;i++)",
            options = listOf("4", "5", "6", "Infinite"),
            correctAnswer = "5",
            explanation = "The loop runs from i = 0 to i = 4, total 5 times.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_005",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which keyword is used to stop a loop immediately?",
            options = listOf("continue", "exit", "break", "return"),
            correctAnswer = "break",
            explanation = "break terminates the loop instantly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_006",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which keyword skips the current iteration?",
            options = listOf("break", "exit", "continue", "skip"),
            correctAnswer = "continue",
            explanation = "continue skips remaining statements and moves to next iteration.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_007",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output count? for(i=1;i<=3;i++);",
            options = listOf("0", "1", "3", "Infinite"),
            correctAnswer = "0",
            explanation = "Semicolon ends the loop. Body does not execute.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_008",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop can be infinite by default?",
            options = listOf("for(;;)", "while(0)", "do-while(0)", "for(i=0;i<0;i++)"),
            correctAnswer = "for(;;)",
            explanation = "for(;;) has no condition, so it runs infinitely.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_009",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "How many times does do{ }while(0) execute?",
            options = listOf("0", "1", "Infinite", "Compilation error"),
            correctAnswer = "1",
            explanation = "do-while executes the body once before checking condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_010",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is preferred when condition may be false initially?",
            options = listOf("for", "while", "do-while", "nested"),
            correctAnswer = "do-while",
            explanation = "do-while executes once even if condition is false.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_011",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? for(i=0;i<3;i++) printf(\"%d\",i);",
            options = listOf("012", "123", "013", "Infinite"),
            correctAnswer = "012",
            explanation = "i starts from 0 and prints until 2.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_012",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop supports initialization, condition, and increment in one line?",
            options = listOf("while", "do-while", "for", "switch"),
            correctAnswer = "for",
            explanation = "for loop contains all three parts in one statement.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_013",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is best for menu-driven programs?",
            options = listOf("for", "while", "do-while", "nested for"),
            correctAnswer = "do-while",
            explanation = "do-while is used when menu must appear at least once.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_014",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop condition causes infinite loop?",
            options = listOf("while(1)", "while(0)", "for(i=0;i<0;i++)", "do-while(0)"),
            correctAnswer = "while(1)",
            explanation = "Condition is always true, so loop never stops.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_015",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "How many times will loop run? for(i=5;i>0;i--)",
            options = listOf("4", "5", "6", "Infinite"),
            correctAnswer = "5",
            explanation = "Loop runs from 5 to 1, total 5 iterations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_016",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop executes fastest in most cases?",
            options = listOf("for", "while", "do-while", "depends on compiler"),
            correctAnswer = "depends on compiler",
            explanation = "Modern compilers optimize loops, so speed depends on implementation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_017",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is entry-controlled?",
            options = listOf("do-while", "while", "repeat", "foreach"),
            correctAnswer = "while",
            explanation = "while checks condition before entering loop body.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_018",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? for(i=0;i<3;i++) continue; printf(\"Hi\");",
            options = listOf("Hi", "No output", "HiHiHi", "Error"),
            correctAnswer = "Hi",
            explanation = "printf is outside loop, so it executes once.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_019",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop can be nested?",
            options = listOf("for", "while", "do-while", "all of these"),
            correctAnswer = "all of these",
            explanation = "Any loop can be nested inside another loop.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_020",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? while(0) printf(\"Hello\");",
            options = listOf("Hello", "No output", "Error", "Infinite"),
            correctAnswer = "No output",
            explanation = "Condition is false, so loop body never executes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_021",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is exit-controlled?",
            options = listOf("for", "while", "do-while", "nested"),
            correctAnswer = "do-while",
            explanation = "Condition is checked after executing the body.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_022",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "How many times will loop run? for(i=1;i<=1;i++)",
            options = listOf("0", "1", "2", "Infinite"),
            correctAnswer = "1",
            explanation = "Condition is true only once.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_023",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop statement is invalid?",
            options = listOf("for(;;)", "while(1)", "do{}", "loop()"),
            correctAnswer = "loop()",
            explanation = "loop() is not a valid loop syntax in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_024",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? for(i=0;i<3;i++) { if(i==1) break; printf(\"%d\",i); }",
            options = listOf("0", "01", "012", "1"),
            correctAnswer = "0",
            explanation = "Loop breaks when i becomes 1, so only 0 is printed.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_025",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is most readable for fixed repetition?",
            options = listOf("for", "while", "do-while", "nested"),
            correctAnswer = "for",
            explanation = "for loop clearly shows start, end, and increment.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_026",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? do{printf(\"X\");}while(0);",
            options = listOf("X", "No output", "XX", "Error"),
            correctAnswer = "X",
            explanation = "do-while executes body once before checking condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_027",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop causes minimum confusion in exams?",
            options = listOf("for", "while", "do-while", "nested for"),
            correctAnswer = "for",
            explanation = "for loop structure is clear and predictable.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_028",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? for(i=0;i<3;i++) printf(\"A\");",
            options = listOf("A", "AA", "AAA", "Infinite"),
            correctAnswer = "AAA",
            explanation = "Loop runs three times and prints A each time.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_029",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is commonly used for infinite loops?",
            options = listOf("for(;;)", "while(0)", "do-while(0)", "for(i=0;i<0;i++)"),
            correctAnswer = "for(;;)",
            explanation = "for(;;) has no exit condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_030",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop executes body zero or more times?",
            options = listOf("for", "while", "do-while", "foreach"),
            correctAnswer = "while",
            explanation = "while may execute zero times if condition is false initially.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_031",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What happens if loop condition never becomes false?",
            options = listOf("Compilation error", "Runtime error", "Infinite loop", "Loop skips"),
            correctAnswer = "Infinite loop",
            explanation = "Loop keeps executing endlessly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_032",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is preferred for unknown number of iterations?",
            options = listOf("for", "while", "do-while", "nested"),
            correctAnswer = "while",
            explanation = "while is used when iteration count is not known in advance.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_033",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which keyword can exit only current iteration?",
            options = listOf("break", "continue", "return", "exit"),
            correctAnswer = "continue",
            explanation = "continue skips only the current iteration.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_034",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? for(i=1;i<=3;i++) if(i==2) continue; printf(\"%d\",i);",
            options = listOf("123", "13", "12", "23"),
            correctAnswer = "13",
            explanation = "When i is 2, continue skips printing.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_035",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop executes maximum once?",
            options = listOf("for", "while", "do-while", "none"),
            correctAnswer = "do-while",
            explanation = "do-while executes at least once, but may stop after that.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_036",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop condition is invalid?",
            options = listOf("while(1)", "while(0)", "while(i<5)", "while(i=5)"),
            correctAnswer = "while(i=5)",
            explanation = "Assignment in condition causes logic error in exams.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_037",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is easiest to debug?",
            options = listOf("for", "while", "do-while", "nested loops"),
            correctAnswer = "for",
            explanation = "for loop clearly shows control variables.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_038",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop may execute zero times?",
            options = listOf("do-while", "for", "while", "nested"),
            correctAnswer = "while",
            explanation = "while checks condition before execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_039",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is mostly used with counters?",
            options = listOf("for", "while", "do-while", "switch"),
            correctAnswer = "for",
            explanation = "for loop naturally supports counters.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_040",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "What is the output? for(i=0;i<3;i++) for(j=0;j<1;j++) printf(\"*\");",
            options = listOf("*", "**", "***", "****"),
            correctAnswer = "***",
            explanation = "Outer loop runs 3 times, inner loop runs once each time.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_041",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop uses semicolon after condition?",
            options = listOf("for", "while", "do-while", "nested"),
            correctAnswer = "do-while",
            explanation = "do-while ends with a semicolon after condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_042",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop statement is missing in C?",
            options = listOf("for", "while", "repeat-until", "do-while"),
            correctAnswer = "repeat-until",
            explanation = "repeat-until does not exist in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_043",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop condition creates logical error?",
            options = listOf("i<10", "i<=10", "i=10", "i!=10"),
            correctAnswer = "i=10",
            explanation = "Assignment instead of comparison is a common exam trap.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_044",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop is mostly used in arrays?",
            options = listOf("for", "while", "do-while", "switch"),
            correctAnswer = "for",
            explanation = "for loop is commonly used to traverse arrays.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_loops_045",
            categoryId = categoryId,
            chapterId = C_LOOPS,
            questionText = "Which loop-related mistake is most common in exams?",
            options = listOf("Missing braces", "Wrong condition", "Wrong increment", "All of these"),
            correctAnswer = "All of these",
            explanation = "All listed mistakes commonly appear as exam traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

    // -------------------- ARRAYS --------------------

        cQuestion(
            id = "c_arrays_001",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which of the following is NOT a valid array declaration?",
            options = listOf(
                "int arr[3];",
                "int arr[3] = {1, 2, 3};",
                "int arr[] = {4, 1, 2};",
                "int arr[3] = {1, 2};"
            ),
            correctAnswer = "None of the above",
            explanation = "All given declarations are valid in C. Missing values are set to 0 automatically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_002",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Array index in C starts from?",
            options = listOf("0", "1", "-1", "Depends on compiler"),
            correctAnswer = "0",
            explanation = "C arrays are zero-indexed, meaning first element is at index 0.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_003",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "How many elements does int arr[5] contain?",
            options = listOf("4", "5", "6", "Depends on initialization"),
            correctAnswer = "5",
            explanation = "The size inside brackets defines number of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_004",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the index of last element in int arr[10]?",
            options = listOf("10", "9", "8", "1"),
            correctAnswer = "9",
            explanation = "Index starts from 0, so last index is size − 1.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_005",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which data type is used to declare an array?",
            options = listOf("int", "char", "float", "Any data type"),
            correctAnswer = "Any data type",
            explanation = "Arrays can be created using any data type in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_006",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What happens if we access arr[10] in int arr[5]?",
            options = listOf(
                "Compilation error",
                "Runtime error",
                "Garbage value",
                "Automatically resized"
            ),
            correctAnswer = "Garbage value",
            explanation = "C does not check array bounds. Accessing out of range gives garbage value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_007",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which loop is most commonly used to traverse an array?",
            options = listOf("for", "while", "do-while", "switch"),
            correctAnswer = "for",
            explanation = "for loop is best suited for array traversal using index.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_008",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the output? int a[3]={1,2,3}; printf(\"%d\", a[0]);",
            options = listOf("1", "2", "3", "0"),
            correctAnswer = "1",
            explanation = "a[0] refers to the first element of the array.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_009",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which of the following is a two-dimensional array?",
            options = listOf("int a[5];", "int a[2][3];", "int a();", "int *a;"),
            correctAnswer = "int a[2][3];",
            explanation = "Two sets of brackets indicate a 2D array.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_010",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "How many elements are there in int a[2][3]?",
            options = listOf("2", "3", "5", "6"),
            correctAnswer = "6",
            explanation = "Total elements = rows × columns = 2 × 3.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_011",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which of the following initializes all elements to 0?",
            options = listOf(
                "int a[5] = {0};",
                "int a[5];",
                "int a[] = {};",
                "int a[5] = {1};"
            ),
            correctAnswer = "int a[5] = {0};",
            explanation = "Initializing first element as 0 sets all others to 0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_012",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the output? int a[]={1,2,3}; printf(\"%d\", sizeof(a));",
            options = listOf("3", "6", "12", "Depends on compiler"),
            correctAnswer = "12",
            explanation = "Array has 3 integers. Each int is 4 bytes → 3×4=12.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_013",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which is true about arrays in C?",
            options = listOf(
                "Size can change at runtime",
                "Elements are stored randomly",
                "All elements have same data type",
                "Index starts from 1"
            ),
            correctAnswer = "All elements have same data type",
            explanation = "Array stores multiple values of same data type.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_014",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which memory stores array elements?",
            options = listOf("Heap", "Stack", "Contiguous memory", "Registers"),
            correctAnswer = "Contiguous memory",
            explanation = "Array elements are stored in continuous memory locations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_015",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the base address of an array?",
            options = listOf(
                "Address of last element",
                "Address of first element",
                "Random address",
                "Depends on compiler"
            ),
            correctAnswer = "Address of first element",
            explanation = "Array name represents address of its first element.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_016",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which of the following is invalid?",
            options = listOf(
                "int a[0];",
                "int a[5];",
                "int a[]={1,2};",
                "int a[3]={1,2,3};"
            ),
            correctAnswer = "int a[0];",
            explanation = "Array size cannot be zero in standard C.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_017",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is printed? int a[3]={1}; printf(\"%d\", a[2]);",
            options = listOf("1", "0", "Garbage", "Error"),
            correctAnswer = "0",
            explanation = "Uninitialized elements are set to 0 when partial initialization is used.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_018",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which array declaration lets compiler decide size?",
            options = listOf(
                "int a[5];",
                "int a[]={1,2,3};",
                "int a[ ];",
                "int a={1,2,3};"
            ),
            correctAnswer = "int a[]={1,2,3};",
            explanation = "Compiler counts initializer elements to decide size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_019",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which operation is fastest on arrays?",
            options = listOf("Insertion", "Deletion", "Access by index", "Search"),
            correctAnswer = "Access by index",
            explanation = "Direct indexing gives constant time access.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_020",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which is true for 2D arrays?",
            options = listOf(
                "Stored randomly",
                "Stored row-wise",
                "Stored column-wise",
                "Stored diagonally"
            ),
            correctAnswer = "Stored row-wise",
            explanation = "C stores 2D arrays in row-major order.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_021",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which expression gives address of first element?",
            options = listOf("a", "&a", "&a[0]", "Both a and &a[0]"),
            correctAnswer = "Both a and &a[0]",
            explanation = "Array name and address of first element are same.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_022",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the output? int a[2][2]={1,2,3,4}; printf(\"%d\", a[1][0]);",
            options = listOf("1", "2", "3", "4"),
            correctAnswer = "3",
            explanation = "Row-major order fills first row then second.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_023",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which function is commonly used to input array elements?",
            options = listOf("printf", "scanf", "gets", "puts"),
            correctAnswer = "scanf",
            explanation = "scanf is used to take user input for array elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_024",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which is NOT possible with arrays?",
            options = listOf(
                "Random access",
                "Dynamic resizing",
                "Contiguous storage",
                "Index-based access"
            ),
            correctAnswer = "Dynamic resizing",
            explanation = "Array size is fixed once declared.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_025",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which array index causes runtime issue?",
            options = listOf("a[0]", "a[1]", "a[-1]", "a[2]"),
            correctAnswer = "a[-1]",
            explanation = "Negative index accesses invalid memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_026",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which loop is best for multidimensional arrays?",
            options = listOf("single for", "nested for", "while", "do-while"),
            correctAnswer = "nested for",
            explanation = "Nested loops are needed for rows and columns.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_027",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is sizeof(a)/sizeof(a[0]) used for?",
            options = listOf(
                "Find sum",
                "Find size in bytes",
                "Find number of elements",
                "Find index"
            ),
            correctAnswer = "Find number of elements",
            explanation = "This formula calculates total elements in array.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_028",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which of the following is a jagged array in C?",
            options = listOf(
                "int a[3][3];",
                "Not supported in C",
                "int a[][];",
                "int *a[3];"
            ),
            correctAnswer = "Not supported in C",
            explanation = "Jagged arrays are not directly supported in C.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_029",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which error is most common with arrays?",
            options = listOf(
                "Syntax error",
                "Logical error",
                "Boundary overflow",
                "Compilation error"
            ),
            correctAnswer = "Boundary overflow",
            explanation = "Accessing out-of-range index is very common.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_030",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which array property improves performance?",
            options = listOf(
                "Dynamic size",
                "Contiguous memory",
                "Random storage",
                "Multiple types"
            ),
            correctAnswer = "Contiguous memory",
            explanation = "Continuous memory improves cache performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_arrays_031",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which statement about array size in C is correct?",
            options = listOf(
                "Array size can change at runtime",
                "Array size must be constant at declaration",
                "Array size is decided by compiler randomly",
                "Array size depends on loop"
            ),
            correctAnswer = "Array size must be constant at declaration",
            explanation = "In C, array size must be known at compile time for static arrays.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_032",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the output? int a[5]={1,2}; printf(\"%d\", a[3]);",
            options = listOf("2", "1", "0", "Garbage"),
            correctAnswer = "0",
            explanation = "Missing elements in partial initialization are automatically set to 0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_033",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which index access is always invalid?",
            options = listOf("a[0]", "a[1]", "a[-1]", "a[2]"),
            correctAnswer = "a[-1]",
            explanation = "Negative index accesses memory before the array, which is invalid.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_034",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which of the following best describes an array?",
            options = listOf(
                "Collection of different data types",
                "Collection of same data type",
                "Dynamic memory structure",
                "Linked memory blocks"
            ),
            correctAnswer = "Collection of same data type",
            explanation = "All elements of an array must be of the same data type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_035",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the output? int a[]={10,20,30}; printf(\"%d\", a[1]);",
            options = listOf("10", "20", "30", "0"),
            correctAnswer = "20",
            explanation = "Array index starts from 0, so a[1] is the second element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_036",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which of the following causes array index out of bounds?",
            options = listOf(
                "Accessing a[size-1]",
                "Accessing a[size]",
                "Accessing a[0]",
                "Accessing a[1]"
            ),
            correctAnswer = "Accessing a[size]",
            explanation = "Last valid index is size-1. Accessing size goes out of bounds.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_037",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which array declaration is correct?",
            options = listOf(
                "int a[3] = {1,2,3,4};",
                "int a[3] = {1,2};",
                "int a[];",
                "int a = {1,2,3};"
            ),
            correctAnswer = "int a[3] = {1,2};",
            explanation = "Partial initialization is allowed; remaining elements become 0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_038",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "How many elements are in int a[][3] = {{1,2,3},{4,5,6}};",
            options = listOf("3", "6", "2", "9"),
            correctAnswer = "6",
            explanation = "There are 2 rows and 3 columns, so total elements = 6.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_039",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which is true about array name?",
            options = listOf(
                "It stores last element",
                "It stores array size",
                "It represents address of first element",
                "It stores number of elements"
            ),
            correctAnswer = "It represents address of first element",
            explanation = "Array name acts as a pointer to the first element.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_040",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which loop is least preferred for array traversal?",
            options = listOf("for", "while", "do-while", "switch"),
            correctAnswer = "switch",
            explanation = "switch is not designed for repeated sequential access.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_041",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "What is the output? int a[3]={1,2,3}; printf(\"%d\", a[3]);",
            options = listOf("3", "0", "Garbage", "Compilation error"),
            correctAnswer = "Garbage",
            explanation = "a[3] is out of bounds. C does not perform bounds checking.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_042",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which array feature makes access fast?",
            options = listOf(
                "Dynamic memory",
                "Contiguous memory",
                "Linked storage",
                "Random allocation"
            ),
            correctAnswer = "Contiguous memory",
            explanation = "Elements are stored in continuous memory, enabling fast indexing.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_043",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which expression gives the size of entire array?",
            options = listOf("sizeof(a)", "sizeof(a[0])", "a", "&a"),
            correctAnswer = "sizeof(a)",
            explanation = "sizeof(a) returns total memory occupied by the array.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_044",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which array mistake is most common in exams?",
            options = listOf(
                "Wrong data type",
                "Wrong index",
                "Wrong loop",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "Index errors, loop errors, and type confusion are common traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_arrays_045",
            categoryId = categoryId,
            chapterId = C_ARRAYS,
            questionText = "Which array access is always safe?",
            options = listOf("a[size]", "a[-1]", "a[0]", "a[size+1]"),
            correctAnswer = "a[0]",
            explanation = "Index 0 is always valid for a non-empty array.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),


// -------------------- STRINGS --------------------

        cQuestion(
            id = "c_strings_001",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which of the following is NOT a valid string declaration?",
            options = listOf(
                "char str[6] = \"Hello\";",
                "char str[] = \"Hello\";",
                "string str = \"Hello\";",
                "char str[] = {'H','e','l','l','o','\\0'};"
            ),
            correctAnswer = "string str = \"Hello\";",
            explanation = "C does not have a built-in string data type. Strings are handled using char arrays.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_002",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which character marks the end of a string in C?",
            options = listOf("\\n", "\\t", "\\0", "\\a"),
            correctAnswer = "\\0",
            explanation = "Every C string ends with a null character \\0.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_003",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which header file is required for string functions?",
            options = listOf("<stdio.h>", "<stdlib.h>", "<string.h>", "<ctype.h>"),
            correctAnswer = "<string.h>",
            explanation = "String handling functions like strlen and strcpy are declared in string.h.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_004",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the output? printf(\"%d\", strlen(\"Hello\"));",
            options = listOf("4", "5", "6", "Error"),
            correctAnswer = "5",
            explanation = "strlen counts characters excluding the null character.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_005",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the size of \"Hello\" including null character?",
            options = listOf("5", "6", "7", "Depends on compiler"),
            correctAnswer = "6",
            explanation = "String has 5 characters plus 1 null character.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_006",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function copies one string into another?",
            options = listOf("strlen()", "strcmp()", "strcpy()", "strcat()"),
            correctAnswer = "strcpy()",
            explanation = "strcpy copies the source string into the destination string.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_007",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function compares two strings?",
            options = listOf("strcmp()", "strcpy()", "strlen()", "strcat()"),
            correctAnswer = "strcmp()",
            explanation = "strcmp compares two strings lexicographically.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_008",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the output? strcmp(\"abc\",\"abc\");",
            options = listOf("0", "1", "-1", "Garbage"),
            correctAnswer = "0",
            explanation = "strcmp returns 0 when both strings are equal.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_009",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function joins two strings?",
            options = listOf("strcmp()", "strcpy()", "strcat()", "strlen()"),
            correctAnswer = "strcat()",
            explanation = "strcat appends one string to the end of another.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_010",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the output? char s[]=\"Hi\"; printf(\"%d\", sizeof(s));",
            options = listOf("2", "3", "4", "Depends"),
            correctAnswer = "3",
            explanation = "sizeof includes the null character, so size is 3.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_011",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function returns length excluding null character?",
            options = listOf("sizeof()", "strlen()", "strcpy()", "strcmp()"),
            correctAnswer = "strlen()",
            explanation = "strlen counts only visible characters, not \\0.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_012",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which input function is unsafe for strings?",
            options = listOf("gets()", "fgets()", "scanf()", "puts()"),
            correctAnswer = "gets()",
            explanation = "gets does not check buffer size and can cause overflow.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_013",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function safely reads a string?",
            options = listOf("gets()", "scanf()", "fgets()", "puts()"),
            correctAnswer = "fgets()",
            explanation = "fgets limits input size, making it safer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_014",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which format specifier is used for string input?",
            options = listOf("%c", "%d", "%s", "%f"),
            correctAnswer = "%s",
            explanation = "%s is used to read or print strings.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_015",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What happens if string has no null character?",
            options = listOf(
                "Compilation error",
                "Runtime error",
                "Garbage output",
                "Automatically fixed"
            ),
            correctAnswer = "Garbage output",
            explanation = "Without \\0, functions keep reading memory until they find one.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_016",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which of the following stores string literals?",
            options = listOf("char array", "int array", "float variable", "enum"),
            correctAnswer = "char array",
            explanation = "Strings in C are stored in character arrays.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_017",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which is correct way to read a full line with spaces?",
            options = listOf("scanf(\"%s\")", "gets()", "fgets()", "puts()"),
            correctAnswer = "fgets()",
            explanation = "fgets can read spaces until newline or size limit.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_018",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the output? printf(\"%d\", strcmp(\"abc\",\"abd\"));",
            options = listOf("0", "Positive", "Negative", "1"),
            correctAnswer = "Negative",
            explanation = "strcmp returns negative when first string is smaller.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_019",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function converts string to lowercase?",
            options = listOf("strlwr()", "strupr()", "tolower()", "toupper()"),
            correctAnswer = "strlwr()",
            explanation = "strlwr converts all characters to lowercase (compiler dependent).",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_020",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function is NOT standard in C?",
            options = listOf("strlen()", "strcpy()", "strrev()", "strcmp()"),
            correctAnswer = "strrev()",
            explanation = "strrev is not part of standard C library.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_021",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the output? char s[]=\"A\"; printf(\"%d\", strlen(s));",
            options = listOf("0", "1", "2", "Garbage"),
            correctAnswer = "1",
            explanation = "strlen counts visible characters only.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_022",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function prints a string?",
            options = listOf("puts()", "gets()", "scanf()", "strlen()"),
            correctAnswer = "puts()",
            explanation = "puts prints a string followed by a newline.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_023",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function appends one string to another?",
            options = listOf("strcpy()", "strcmp()", "strcat()", "strlen()"),
            correctAnswer = "strcat()",
            explanation = "strcat concatenates strings.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_024",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which error is most common with strings?",
            options = listOf(
                "Syntax error",
                "Null character missing",
                "Wrong loop",
                "Wrong header file"
            ),
            correctAnswer = "Null character missing",
            explanation = "Missing \\0 causes undefined behavior.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_025",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function calculates string length?",
            options = listOf("sizeof()", "strlen()", "strcmp()", "strcpy()"),
            correctAnswer = "strlen()",
            explanation = "strlen returns number of characters before \\0.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_026",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is sizeof(\"Hello\")?",
            options = listOf("5", "6", "7", "Depends"),
            correctAnswer = "6",
            explanation = "String literal includes null character.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_027",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string input stops at whitespace?",
            options = listOf("gets()", "scanf(\"%s\")", "fgets()", "puts()"),
            correctAnswer = "scanf(\"%s\")",
            explanation = "scanf with %s stops reading at space.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_028",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function is safer alternative to gets()?",
            options = listOf("scanf()", "puts()", "fgets()", "strlen()"),
            correctAnswer = "fgets()",
            explanation = "fgets prevents buffer overflow.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_029",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function returns integer value?",
            options = listOf("strlen()", "strcmp()", "strcpy()", "strcat()"),
            correctAnswer = "strcmp()",
            explanation = "strcmp returns integer indicating comparison result.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_030",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function copies including null character?",
            options = listOf("strcpy()", "strlen()", "strcmp()", "strcat()"),
            correctAnswer = "strcpy()",
            explanation = "strcpy copies all characters including \\0.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_strings_031",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which character is automatically added at the end of a string literal?",
            options = listOf("\\n", "\\t", "\\0", "\\b"),
            correctAnswer = "\\0",
            explanation = "C automatically adds a null character \\0 at the end of every string literal.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_032",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the output? char s[] = \"Hello\"; printf(\"%d\", sizeof(s));",
            options = listOf("5", "6", "7", "Depends on compiler"),
            correctAnswer = "6",
            explanation = "sizeof counts total memory including the null character.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_033",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function compares characters until a mismatch is found?",
            options = listOf("strcpy()", "strcmp()", "strlen()", "strcat()"),
            correctAnswer = "strcmp()",
            explanation = "strcmp compares strings character by character until difference or \\0.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_034",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What happens if destination array is smaller in strcpy()?",
            options = listOf(
                "Compilation error",
                "Runtime error",
                "Buffer overflow",
                "Automatic resizing"
            ),
            correctAnswer = "Buffer overflow",
            explanation = "strcpy does not check size, which can overwrite memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_035",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function appends \\0 automatically?",
            options = listOf("strcat()", "strcmp()", "strlen()", "sizeof()"),
            correctAnswer = "strcat()",
            explanation = "strcat appends characters and ensures the final string ends with \\0.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_036",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string input method reads until newline or size limit?",
            options = listOf("scanf(\"%s\")", "gets()", "fgets()", "puts()"),
            correctAnswer = "fgets()",
            explanation = "fgets stops at newline or when buffer size is reached.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_037",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "What is the output? printf(\"%d\", strlen(\"\"));",
            options = listOf("0", "1", "Garbage", "Error"),
            correctAnswer = "0",
            explanation = "Empty string has zero characters before the null character.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_038",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string representation is correct?",
            options = listOf(
                "char s = \"ABC\";",
                "char s[] = \"ABC\";",
                "int s[] = \"ABC\";",
                "char s = {'A','B','C'};"
            ),
            correctAnswer = "char s[] = \"ABC\";",
            explanation = "Strings must be stored in character arrays.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_039",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function adds one string at the end of another?",
            options = listOf("strcpy()", "strcmp()", "strcat()", "strlen()"),
            correctAnswer = "strcat()",
            explanation = "strcat concatenates two strings.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_040",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which of the following causes undefined behavior?",
            options = listOf(
                "Missing null character",
                "Using strlen()",
                "Using strcpy() correctly",
                "Using fgets()"
            ),
            correctAnswer = "Missing null character",
            explanation = "Without \\0, string functions read beyond intended memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_041",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function returns the length as integer?",
            options = listOf("strcmp()", "strlen()", "strcpy()", "strcat()"),
            correctAnswer = "strlen()",
            explanation = "strlen returns number of characters excluding null character.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_042",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function prints string and moves cursor to new line?",
            options = listOf("printf()", "puts()", "gets()", "strlen()"),
            correctAnswer = "puts()",
            explanation = "puts prints string followed by a newline automatically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_043",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string-related error is most common in exams?",
            options = listOf(
                "Syntax error",
                "Wrong header file",
                "Missing null character",
                "Wrong format specifier"
            ),
            correctAnswer = "Missing null character",
            explanation = "Most string errors happen due to missing or overwritten \\0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_044",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which function is used to convert string to uppercase?",
            options = listOf("strupr()", "toupper()", "strlwr()", "tolower()"),
            correctAnswer = "strupr()",
            explanation = "strupr converts all characters to uppercase (non-standard but common).",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_strings_045",
            categoryId = categoryId,
            chapterId = C_STRINGS,
            questionText = "Which string function should be avoided for safety reasons?",
            options = listOf("fgets()", "scanf()", "gets()", "puts()"),
            correctAnswer = "gets()",
            explanation = "gets is unsafe because it does not check input size and can overflow memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

// ----------------------------------------- FUNCTIONS -----------------------------------------

        cQuestion(
            id = "c_functions_001",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which of the following is NOT a valid function declaration?",
            options = listOf(
                "int add(int a, int b);",
                "void add(int a, int b);",
                "int add(int a, int b);",
                "int add(int a, int b, int c);"
            ),
            correctAnswer = "None of the above",
            explanation = "All given statements are valid function declarations in C.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_002",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which keyword is used to return a value from a function?",
            options = listOf("break", "continue", "return", "goto"),
            correctAnswer = "return",
            explanation = "return sends a value back to the calling function.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_003",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What is a function prototype?",
            options = listOf(
                "Function body",
                "Function call",
                "Function declaration",
                "Function definition"
            ),
            correctAnswer = "Function declaration",
            explanation = "A prototype tells the compiler about function name, return type, and parameters.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_004",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which part of function is optional?",
            options = listOf("Return type", "Function name", "Parameter list", "Function body"),
            correctAnswer = "Parameter list",
            explanation = "Functions may or may not take parameters.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_005",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What happens if return statement is missing in non-void function?",
            options = listOf(
                "Compilation error",
                "Runtime error",
                "Garbage value returned",
                "Program stops"
            ),
            correctAnswer = "Garbage value returned",
            explanation = "If return is missing, the returned value is undefined.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_006",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function does not return any value?",
            options = listOf("int", "char", "float", "void"),
            correctAnswer = "void",
            explanation = "void functions do not return any value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_007",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which is the correct way to call a function?",
            options = listOf(
                "call add();",
                "add;",
                "add();",
                "function add();"
            ),
            correctAnswer = "add();",
            explanation = "Function is called using its name followed by parentheses.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_008",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which concept allows a function to call itself?",
            options = listOf("Iteration", "Recursion", "Looping", "Nesting"),
            correctAnswer = "Recursion",
            explanation = "Recursion is when a function calls itself.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_009",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What is mandatory for recursion to stop?",
            options = listOf(
                "Loop",
                "Base condition",
                "Global variable",
                "Return type"
            ),
            correctAnswer = "Base condition",
            explanation = "Base condition prevents infinite recursive calls.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_010",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which type of parameter passing is used in C?",
            options = listOf(
                "Call by value",
                "Call by reference",
                "Call by name",
                "Call by pointer"
            ),
            correctAnswer = "Call by value",
            explanation = "C uses call by value by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_011",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "How can we simulate call by reference in C?",
            options = listOf(
                "Using arrays",
                "Using pointers",
                "Using global variables",
                "Using static variables"
            ),
            correctAnswer = "Using pointers",
            explanation = "Pointers allow modifying original variables.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_012",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which variable has scope limited to function?",
            options = listOf("Global", "Static", "Local", "External"),
            correctAnswer = "Local",
            explanation = "Local variables are accessible only inside the function.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_013",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function is called first in a C program?",
            options = listOf("start()", "main()", "init()", "first()"),
            correctAnswer = "main()",
            explanation = "Program execution starts from main().",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_014",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function can return multiple values?",
            options = listOf(
                "Using return",
                "Using pointers",
                "Using recursion",
                "Using loops"
            ),
            correctAnswer = "Using pointers",
            explanation = "Pointers allow returning multiple values indirectly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_015",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which storage class keeps function variable alive?",
            options = listOf("auto", "register", "static", "extern"),
            correctAnswer = "static",
            explanation = "Static variables retain their value between function calls.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_016",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What is the output? int f(){ return 10; } printf(\"%d\", f());",
            options = listOf("10", "0", "Garbage", "Error"),
            correctAnswer = "10",
            explanation = "Function returns 10 which is printed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_017",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function feature improves code reusability?",
            options = listOf("Loops", "Functions", "Arrays", "Pointers"),
            correctAnswer = "Functions",
            explanation = "Functions allow reuse of code logic.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_018",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which is NOT a type of function?",
            options = listOf(
                "Library function",
                "User-defined function",
                "Recursive function",
                "Dynamic function"
            ),
            correctAnswer = "Dynamic function",
            explanation = "Dynamic function is not a recognized type in C.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_019",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which header file is required for printf()?",
            options = listOf("<stdlib.h>", "<stdio.h>", "<string.h>", "<math.h>"),
            correctAnswer = "<stdio.h>",
            explanation = "printf is declared in stdio.h.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_020",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function executes faster?",
            options = listOf(
                "Recursive function",
                "Non-recursive function",
                "Depends on compiler",
                "Depends on loop"
            ),
            correctAnswer = "Non-recursive function",
            explanation = "Recursive calls add overhead, so non-recursive is faster.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_021",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which variable is shared across all function calls?",
            options = listOf("Local", "Static", "Global", "Register"),
            correctAnswer = "Global",
            explanation = "Global variables are accessible to all functions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_022",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What is the default return type of a function in C?",
            options = listOf("void", "int", "float", "double"),
            correctAnswer = "int",
            explanation = "If return type is not specified, it defaults to int (old C standard).",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_023",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function can modify actual parameter value?",
            options = listOf(
                "Call by value",
                "Call by reference",
                "Inline function",
                "Recursive function"
            ),
            correctAnswer = "Call by reference",
            explanation = "Call by reference allows modifying original values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_024",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function has no parameters and no return value?",
            options = listOf(
                "void f()",
                "int f()",
                "char f(int)",
                "float f()"
            ),
            correctAnswer = "void f()",
            explanation = "void f() neither takes parameters nor returns a value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_025",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which is correct function definition?",
            options = listOf(
                "int add();",
                "add(int a,int b){return a+b;}",
                "int add(int a,int b){return a+b;}",
                "int add(int,int);"
            ),
            correctAnswer = "int add(int a,int b){return a+b;}",
            explanation = "Definition includes return type, name, parameters, and body.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_026",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function is called without arguments?",
            options = listOf("Parameterized", "Non-parameterized", "Recursive", "Inline"),
            correctAnswer = "Non-parameterized",
            explanation = "Non-parameterized functions do not take arguments.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_027",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function-related error is common in exams?",
            options = listOf(
                "Missing return",
                "Wrong prototype",
                "Parameter mismatch",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All listed mistakes are common exam traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_028",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function executes repeatedly?",
            options = listOf("main()", "Recursive", "Inline", "Static"),
            correctAnswer = "Recursive",
            explanation = "Recursive function keeps calling itself until base condition.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_029",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function concept reduces program size?",
            options = listOf("Recursion", "Inline function", "Loop", "Macro"),
            correctAnswer = "Inline function",
            explanation = "Inline functions reduce function call overhead.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_030",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function returns control to operating system?",
            options = listOf("exit()", "return", "break", "continue"),
            correctAnswer = "exit()",
            explanation = "exit() terminates program and returns control to OS.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        cQuestion(
            id = "c_functions_031",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What is the output? int f(int x){ return x+1; } printf(\"%d\", f(5));",
            options = listOf("5", "6", "Error", "Garbage"),
            correctAnswer = "6",
            explanation = "Function adds 1 to the argument and returns the result.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_032",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which is required before calling a function?",
            options = listOf(
                "Function definition only",
                "Function prototype or definition",
                "Header file only",
                "Main function"
            ),
            correctAnswer = "Function prototype or definition",
            explanation = "Compiler must know function signature before it is called.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_033",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What happens if function arguments do not match parameters?",
            options = listOf(
                "Always compilation error",
                "Always runtime error",
                "Undefined behavior",
                "Program stops"
            ),
            correctAnswer = "Undefined behavior",
            explanation = "Mismatch can cause wrong values or crashes depending on case.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_034",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function variable retains its value between calls?",
            options = listOf("auto", "register", "static", "extern"),
            correctAnswer = "static",
            explanation = "Static variables keep their value even after function ends.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_035",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What is the output? int f(){ static int x=0; x++; return x; } printf(\"%d %d\", f(), f());",
            options = listOf("1 1", "1 2", "2 1", "2 2"),
            correctAnswer = "1 2",
            explanation = "Static variable keeps value between calls, so x becomes 1 then 2.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_036",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function call passes actual values?",
            options = listOf(
                "Call by reference",
                "Call by pointer",
                "Call by value",
                "Call by address"
            ),
            correctAnswer = "Call by value",
            explanation = "C passes a copy of actual arguments by default.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_037",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function cannot return a value?",
            options = listOf("int", "float", "void", "char"),
            correctAnswer = "void",
            explanation = "void functions do not return any value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_038",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "What is the output? int f(int x){ if(x==0) return 0; return f(x-1); } printf(\"%d\", f(3));",
            options = listOf("3", "1", "0", "Error"),
            correctAnswer = "0",
            explanation = "Recursive calls finally reach base condition and return 0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_039",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function feature improves modularity?",
            options = listOf("Loops", "Arrays", "Functions", "Pointers"),
            correctAnswer = "Functions",
            explanation = "Functions break program into manageable modules.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_040",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which is true about recursive functions?",
            options = listOf(
                "Always faster than loops",
                "Needs base condition",
                "Uses no stack memory",
                "Cannot return value"
            ),
            correctAnswer = "Needs base condition",
            explanation = "Without base condition, recursion causes infinite calls.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_041",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function-related error is hardest to debug?",
            options = listOf(
                "Syntax error",
                "Logical error",
                "Missing header",
                "Wrong return type"
            ),
            correctAnswer = "Logical error",
            explanation = "Logical errors compile fine but give wrong output.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_042",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function ends program execution immediately?",
            options = listOf("return", "break", "exit()", "continue"),
            correctAnswer = "exit()",
            explanation = "exit() terminates the program and returns control to OS.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_043",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function concept reduces repetition of code?",
            options = listOf("Recursion", "Function calls", "Inline function", "Macros"),
            correctAnswer = "Function calls",
            explanation = "Functions allow reuse of the same logic multiple times.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_044",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which is a valid recursive function condition?",
            options = listOf(
                "Function calling itself without base case",
                "Function calling itself conditionally",
                "Function calling another function",
                "Function inside main"
            ),
            correctAnswer = "Function calling itself conditionally",
            explanation = "Recursion must stop using a base condition.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_functions_045",
            categoryId = categoryId,
            chapterId = C_FUNCTIONS,
            questionText = "Which function mistake is most common in exams?",
            options = listOf(
                "Wrong return type",
                "Missing prototype",
                "Parameter mismatch",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All listed issues are common exam traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

//------------------------------------------ POINTERS -------------------------------------------

        cQuestion(
            id = "c_pointers_001",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which of the following is NOT a valid pointer declaration?",
            options = listOf(
                "int *ptr;",
                "int *ptr = NULL;",
                "int *ptr = &x;",
                "int *ptr = x;"
            ),
            correctAnswer = "int *ptr = x;",
            explanation = "Pointer must store an address, not a normal variable value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_002",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What does a pointer store?",
            options = listOf("Value", "Address", "Data type", "Function"),
            correctAnswer = "Address",
            explanation = "A pointer stores the memory address of another variable.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_003",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which operator is used to get address of a variable?",
            options = listOf("*", "&", "%", "#"),
            correctAnswer = "&",
            explanation = "& gives the memory address of a variable.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_004",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which operator is used to access value at address?",
            options = listOf("&", "*", "->", "."),
            correctAnswer = "*",
            explanation = "* dereferences a pointer to access the stored value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_005",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is the output? int x=10; int *p=&x; printf(\"%d\", *p);",
            options = listOf("10", "Address of x", "Garbage", "Error"),
            correctAnswer = "10",
            explanation = "*p gives the value stored at address of x.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_006",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer is safest to initialize?",
            options = listOf("Uninitialized pointer", "Dangling pointer", "NULL pointer", "Wild pointer"),
            correctAnswer = "NULL pointer",
            explanation = "NULL pointer clearly indicates it points to nothing.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_007",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What happens if an uninitialized pointer is used?",
            options = listOf("Compilation error", "Runtime error", "Garbage address access", "Program stops"),
            correctAnswer = "Garbage address access",
            explanation = "Uninitialized pointers may point to random memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_008",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer points to nothing?",
            options = listOf("Void pointer", "Wild pointer", "NULL pointer", "Dangling pointer"),
            correctAnswer = "NULL pointer",
            explanation = "NULL pointer explicitly points to no valid memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_009",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is a dangling pointer?",
            options = listOf(
                "Pointer not initialized",
                "Pointer pointing to freed memory",
                "Pointer with NULL value",
                "Pointer to pointer"
            ),
            correctAnswer = "Pointer pointing to freed memory",
            explanation = "Dangling pointer refers to memory that is no longer valid.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_010",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is the size of int* on a 64-bit system?",
            options = listOf("2 bytes", "4 bytes", "8 bytes", "Depends on int"),
            correctAnswer = "8 bytes",
            explanation = "Pointer size depends on architecture, not data type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_011",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer can store address of any data type?",
            options = listOf("int pointer", "char pointer", "void pointer", "float pointer"),
            correctAnswer = "void pointer",
            explanation = "Void pointer is a generic pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_012",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is the output? int a=5; int *p=&a; printf(\"%d\", ++(*p));",
            options = listOf("5", "6", "Garbage", "Error"),
            correctAnswer = "6",
            explanation = "Pointer dereference value is incremented.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_013",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which operator is used with structures and pointers?",
            options = listOf(".", "*", "->", "&"),
            correctAnswer = "->",
            explanation = "-> is used to access structure members using pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_014",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is pointer arithmetic?",
            options = listOf(
                "Adding two pointers",
                "Subtracting two pointers",
                "Incrementing pointer address",
                "Multiplying pointer"
            ),
            correctAnswer = "Incrementing pointer address",
            explanation = "Pointer arithmetic moves pointer based on data type size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_015",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What does p+1 mean for int *p?",
            options = listOf(
                "Add 1 byte",
                "Add size of int",
                "Add address of next pointer",
                "Invalid operation"
            ),
            correctAnswer = "Add size of int",
            explanation = "Pointer arithmetic jumps by size of data type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_016",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer is used in call by reference?",
            options = listOf("Normal variable", "Function pointer", "Pointer variable", "Array"),
            correctAnswer = "Pointer variable",
            explanation = "Pointers allow modifying original variable.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_017",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is the output? int x=10; int *p=&x; *p=20; printf(\"%d\",x);",
            options = listOf("10", "20", "Garbage", "Error"),
            correctAnswer = "20",
            explanation = "Pointer modifies the original variable value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_018",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer type does not require dereferencing?",
            options = listOf("int pointer", "char pointer", "void pointer", "NULL pointer"),
            correctAnswer = "NULL pointer",
            explanation = "NULL pointer should not be dereferenced.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_019",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer points to array base address?",
            options = listOf("arr", "&arr", "*arr", "arr[0]"),
            correctAnswer = "arr",
            explanation = "Array name represents base address.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_020",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is a wild pointer?",
            options = listOf(
                "Pointer pointing to NULL",
                "Pointer pointing to freed memory",
                "Uninitialized pointer",
                "Pointer to pointer"
            ),
            correctAnswer = "Uninitialized pointer",
            explanation = "Wild pointer points to random memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_021",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer allows generic programming?",
            options = listOf("int*", "char*", "void*", "float*"),
            correctAnswer = "void*",
            explanation = "void pointer can hold address of any data type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_022",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is the output? int a[]={1,2,3}; int *p=a; printf(\"%d\", *(p+1));",
            options = listOf("1", "2", "3", "Garbage"),
            correctAnswer = "2",
            explanation = "p+1 moves to next element.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_023",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer error is most dangerous?",
            options = listOf("NULL pointer", "Dangling pointer", "Wild pointer", "Void pointer"),
            correctAnswer = "Wild pointer",
            explanation = "Wild pointers access unpredictable memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_024",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which operation is invalid on pointers?",
            options = listOf("Increment", "Decrement", "Addition", "Multiplication"),
            correctAnswer = "Multiplication",
            explanation = "Pointers cannot be multiplied.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_025",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer mistake is most common in exams?",
            options = listOf(
                "Missing dereference",
                "Wrong address operator",
                "Using uninitialized pointer",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All listed mistakes are common exam traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_026",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer allows function to modify variable?",
            options = listOf("Local variable", "Global variable", "Pointer parameter", "Return value"),
            correctAnswer = "Pointer parameter",
            explanation = "Pointer parameters enable call by reference.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_027",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer points to pointer?",
            options = listOf("int *p", "int **p", "int p*", "int &p"),
            correctAnswer = "int **p",
            explanation = "Double pointer stores address of another pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_028",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is the output? int x=5; int *p=&x; int **pp=&p; printf(\"%d\", **pp);",
            options = listOf("5", "Address", "Garbage", "Error"),
            correctAnswer = "5",
            explanation = "Double dereference gives value of x.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_029",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer is returned by malloc()?",
            options = listOf("int*", "char*", "void*", "float*"),
            correctAnswer = "void*",
            explanation = "malloc returns a void pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_030",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer error causes memory leak?",
            options = listOf(
                "Dangling pointer",
                "Wild pointer",
                "Lost pointer reference",
                "NULL pointer"
            ),
            correctAnswer = "Lost pointer reference",
            explanation = "Losing reference prevents freeing allocated memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_031",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer arithmetic is valid?",
            options = listOf("p*p", "p+p", "p+1", "p/2"),
            correctAnswer = "p+1",
            explanation = "Only addition or subtraction with integers is allowed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_032",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What is sizeof(char*)?",
            options = listOf("1", "2", "4", "Depends on system"),
            correctAnswer = "Depends on system",
            explanation = "Pointer size depends on system architecture.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_033",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer is safest to free?",
            options = listOf("Wild pointer", "Dangling pointer", "NULL pointer", "Valid pointer"),
            correctAnswer = "Valid pointer",
            explanation = "Only valid allocated pointers should be freed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_034",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "What happens if NULL pointer is dereferenced?",
            options = listOf(
                "Compilation error",
                "Runtime crash",
                "Garbage value",
                "Ignored"
            ),
            correctAnswer = "Runtime crash",
            explanation = "Dereferencing NULL causes segmentation fault.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_035",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer stores address of function?",
            options = listOf("Data pointer", "Array pointer", "Function pointer", "Void pointer"),
            correctAnswer = "Function pointer",
            explanation = "Function pointers store address of functions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_036",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer concept allows callback functions?",
            options = listOf("Array", "Function pointer", "Void pointer", "NULL pointer"),
            correctAnswer = "Function pointer",
            explanation = "Callbacks are implemented using function pointers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_037",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer should be set to NULL after free()?",
            options = listOf(
                "Dangling pointer",
                "Valid pointer",
                "Wild pointer",
                "Void pointer"
            ),
            correctAnswer = "Dangling pointer",
            explanation = "Setting to NULL avoids accidental access.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_038",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer helps in dynamic memory allocation?",
            options = listOf("Static pointer", "Auto pointer", "Heap pointer", "Register pointer"),
            correctAnswer = "Heap pointer",
            explanation = "Dynamic memory is allocated in heap.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_039",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer error is hardest to detect?",
            options = listOf("Syntax error", "NULL pointer", "Wild pointer", "Dangling pointer"),
            correctAnswer = "Wild pointer",
            explanation = "Wild pointers cause unpredictable behavior.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_040",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer operation is safest?",
            options = listOf(
                "Dereferencing NULL",
                "Using initialized pointer",
                "Using wild pointer",
                "Using dangling pointer"
            ),
            correctAnswer = "Using initialized pointer",
            explanation = "Initialized pointers reduce runtime errors.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_041",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer can cause segmentation fault?",
            options = listOf(
                "NULL pointer",
                "Wild pointer",
                "Dangling pointer",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All invalid pointers can crash program.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_042",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer concept passes array to function?",
            options = listOf("Value passing", "Pointer passing", "Reference passing", "Macro"),
            correctAnswer = "Pointer passing",
            explanation = "Arrays decay to pointers when passed to functions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_043",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer arithmetic moves backward?",
            options = listOf("p+1", "p-1", "p*1", "p/1"),
            correctAnswer = "p-1",
            explanation = "Subtracting moves pointer backward.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_044",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer is used to access array elements?",
            options = listOf("Array index", "Pointer arithmetic", "Both", "None"),
            correctAnswer = "Both",
            explanation = "Array indexing internally uses pointer arithmetic.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_pointers_045",
            categoryId = categoryId,
            chapterId = C_POINTERS,
            questionText = "Which pointer topic is most important for exams?",
            options = listOf(
                "Declaration",
                "Dereferencing",
                "Pointer arithmetic",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "Exams combine all pointer concepts together.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

//------------------------------------------ STRUCTURES -------------------------------------------

        cQuestion(
            id = "c_su_001",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which keyword is used to define a structure?",
            options = listOf("struct", "structure", "record", "class"),
            correctAnswer = "struct",
            explanation = "The struct keyword is used to define a structure in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_002",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which keyword is used to define a union?",
            options = listOf("union", "struct", "enum", "typedef"),
            correctAnswer = "union",
            explanation = "The union keyword defines a union in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_003",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "How many union members can store values at the same time?",
            options = listOf("All", "Two", "One", "None"),
            correctAnswer = "One",
            explanation = "All union members share the same memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_004",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which operator is used to access structure members?",
            options = listOf(".", "->", "*", "&"),
            correctAnswer = ".",
            explanation = "Dot operator is used with structure variables.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_005",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which operator is used to access structure or union members using pointer?",
            options = listOf(".", "->", "*", "&"),
            correctAnswer = "->",
            explanation = "Arrow operator is used when accessing members through pointer.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_006",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which of the following stores different data types together?",
            options = listOf("Array", "Structure", "Enum", "Macro"),
            correctAnswer = "Structure",
            explanation = "Structure groups variables of different data types.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_007",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which feature of union saves memory?",
            options = listOf("Separate memory", "Shared memory", "Dynamic memory", "Stack memory"),
            correctAnswer = "Shared memory",
            explanation = "Union members share the same memory location.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_008",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure member access is invalid?",
            options = listOf("a.x", "p->x", "(*p).x", "p.x"),
            correctAnswer = "p.x",
            explanation = "Dot operator cannot be used directly with pointers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_009",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Union size is equal to the size of which member?",
            options = listOf("First", "Last", "Smallest", "Largest"),
            correctAnswer = "Largest",
            explanation = "Union size depends on the largest member.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_010",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Can a structure contain another structure?",
            options = listOf("Yes", "No", "Only array", "Only pointer"),
            correctAnswer = "Yes",
            explanation = "Nested structures are allowed in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_011",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which operation is NOT allowed on structures?",
            options = listOf("Assignment", "Passing to function", "Comparison using ==", "Member access"),
            correctAnswer = "Comparison using ==",
            explanation = "Structures cannot be compared using == operator.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_012",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "What happens when a new value is assigned to a union member?",
            options = listOf("Old value preserved", "Only that member changes", "All members change", "Old value overwritten"),
            correctAnswer = "Old value overwritten",
            explanation = "Union shares memory, so previous data is lost.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_013",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure passing allows modification of original data?",
            options = listOf("Pass by value", "Pass by pointer", "Pass by copy", "Return by value"),
            correctAnswer = "Pass by pointer",
            explanation = "Passing address allows modifying original structure.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_014",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which keyword is used to create alias for structure?",
            options = listOf("typedef", "define", "alias", "struct"),
            correctAnswer = "typedef",
            explanation = "typedef creates user-defined type names.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_015",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure member causes padding?",
            options = listOf("Alignment", "Pointer", "Array", "Function"),
            correctAnswer = "Alignment",
            explanation = "Padding is added to align data types.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_016",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union member should be accessed safely?",
            options = listOf("Any member", "First member", "Last written member", "Smallest member"),
            correctAnswer = "Last written member",
            explanation = "Only last assigned union member is valid.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_017",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure member order minimizes padding?",
            options = listOf("char then int", "int then char", "random", "pointer then char"),
            correctAnswer = "int then char",
            explanation = "Larger data types first reduce padding.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_018",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union concept is used in device drivers?",
            options = listOf("Type punning", "Sorting", "Recursion", "Searching"),
            correctAnswer = "Type punning",
            explanation = "Union allows interpreting memory in multiple ways.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_019",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which declaration is invalid?",
            options = listOf(
                "struct A { int x; };",
                "union B { int y; };",
                "struct A int x;",
                "union { int z; } u;"
            ),
            correctAnswer = "struct A int x;",
            explanation = "Structure body must be inside braces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_020",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure allows multiple records?",
            options = listOf("Single structure", "Array of structures", "Union", "Enum"),
            correctAnswer = "Array of structures",
            explanation = "Array of structures stores multiple records.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_021",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union is best when only one value is needed?",
            options = listOf("Structure", "Union", "Array", "Enum"),
            correctAnswer = "Union",
            explanation = "Union is ideal when only one member is used.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_022",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which operation copies entire structure data?",
            options = listOf("Assignment", "Comparison", "Access", "Declaration"),
            correctAnswer = "Assignment",
            explanation = "Structure assignment copies all members.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_023",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union cannot exist?",
            options = listOf(
                "Union with int",
                "Union with array",
                "Union with function",
                "Union with pointer"
            ),
            correctAnswer = "Union with function",
            explanation = "Functions cannot be union members.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_024",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure mistake causes compilation error?",
            options = listOf("Missing semicolon", "Wrong access", "Padding", "Wrong size"),
            correctAnswer = "Missing semicolon",
            explanation = "Structure definition must end with semicolon.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_025",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union assignment is valid?",
            options = listOf("u1 = u2;", "u1 == u2;", "u1 + u2;", "u1 / u2;"),
            correctAnswer = "u1 = u2;",
            explanation = "Union assignment copies memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_026",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure cannot contain itself directly?",
            options = listOf("Nested structure", "Self-referential structure", "Union", "Enum"),
            correctAnswer = "Self-referential structure",
            explanation = "Direct self reference is not allowed.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_027",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure allows indirect self-reference?",
            options = listOf("Normal structure", "Structure with pointer", "Union", "Enum"),
            correctAnswer = "Structure with pointer",
            explanation = "Pointer allows indirect self-reference.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_028",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union member defines alignment?",
            options = listOf("First", "Last", "Largest", "Smallest"),
            correctAnswer = "Largest",
            explanation = "Largest data type decides alignment.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_029",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure is best for student record?",
            options = listOf("Array", "Structure", "Union", "Enum"),
            correctAnswer = "Structure",
            explanation = "Structure groups related fields.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_030",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union error causes garbage output?",
            options = listOf("Wrong member access", "Wrong size", "Wrong declaration", "All"),
            correctAnswer = "Wrong member access",
            explanation = "Accessing inactive member gives garbage.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_031",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure feature improves readability?",
            options = listOf("Grouping data", "Pointers", "Loops", "Macros"),
            correctAnswer = "Grouping data",
            explanation = "Structures group related data logically.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_032",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union feature makes debugging difficult?",
            options = listOf("Shared memory", "Syntax", "Keyword", "Declaration"),
            correctAnswer = "Shared memory",
            explanation = "Data overwriting makes debugging hard.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_033",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure member can store address?",
            options = listOf("int", "char", "pointer", "float"),
            correctAnswer = "pointer",
            explanation = "Pointer members store addresses.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_034",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union feature trades safety for memory?",
            options = listOf("Shared memory", "Assignment", "Access", "Declaration"),
            correctAnswer = "Shared memory",
            explanation = "Union saves memory but reduces safety.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_035",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure array declaration is correct?",
            options = listOf(
                "struct S a[5];",
                "struct a[5] S;",
                "S struct a[5];",
                "array struct S a[5];"
            ),
            correctAnswer = "struct S a[5];",
            explanation = "Correct syntax for array of structures.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_036",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union supports type punning?",
            options = listOf("Union", "Structure", "Enum", "Array"),
            correctAnswer = "Union",
            explanation = "Union allows same memory to be read as different types.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_037",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure comparison is valid?",
            options = listOf("a == b", "memcmp()", "a > b", "a < b"),
            correctAnswer = "memcmp()",
            explanation = "Structures cannot be compared using ==.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_038",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union is preferred in embedded systems?",
            options = listOf("Structure", "Union", "Array", "Enum"),
            correctAnswer = "Union",
            explanation = "Union saves memory in embedded systems.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_039",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure topic is most exam-repeated?",
            options = listOf("Declaration", "Member access", "Padding", "All of these"),
            correctAnswer = "All of these",
            explanation = "Exams mix all structure concepts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_040",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union topic is most exam-tricky?",
            options = listOf("Size", "Member overwrite", "Memory sharing", "All of these"),
            correctAnswer = "All of these",
            explanation = "Union questions combine multiple traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_041",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure can be returned from function?",
            options = listOf("Structure", "Pointer to structure", "Both", "None"),
            correctAnswer = "Both",
            explanation = "Functions can return structure or pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_042",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union usage is unsafe?",
            options = listOf("Wrong member access", "Type punning", "Shared memory", "All"),
            correctAnswer = "All",
            explanation = "Incorrect union usage causes bugs.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_043",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which structure feature improves program design?",
            options = listOf("Encapsulation", "Recursion", "Looping", "Macros"),
            correctAnswer = "Encapsulation",
            explanation = "Structures group related data.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_044",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which union member access gives undefined behavior?",
            options = listOf("Last written", "Previously written", "Pointer member", "Array member"),
            correctAnswer = "Previously written",
            explanation = "Only last written member is valid.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_su_045",
            categoryId = categoryId,
            chapterId = C_STRUCTURES,
            questionText = "Which chapter concept is most important for exams?",
            options = listOf("Structures", "Unions", "Memory behavior", "All of these"),
            correctAnswer = "All of these",
            explanation = "Exams mix structures and unions deeply.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

//  -------------------------------------------------- FILE HANDLING ----------------------------------------
        cQuestion(
            id = "c_file_handling_001",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which of the following is NOT a valid file operation in C?",
            options = listOf("open()", "close()", "read()", "write()"),
            correctAnswer = "open()",
            explanation = "C uses fopen() to open files, not open().",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_002",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function is used to open a file?",
            options = listOf("open()", "fopen()", "fileopen()", "openfile()"),
            correctAnswer = "fopen()",
            explanation = "fopen() is used to open a file in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_003",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "What does fopen() return on failure?",
            options = listOf("0", "-1", "NULL", "EOF"),
            correctAnswer = "NULL",
            explanation = "fopen() returns NULL if file opening fails.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_004",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which pointer is used for file handling?",
            options = listOf("FILE", "file*", "FILE*", "fptr"),
            correctAnswer = "FILE*",
            explanation = "FILE* is used to handle files in C.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_005",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function is used to close a file?",
            options = listOf("close()", "fclose()", "fileclose()", "endfile()"),
            correctAnswer = "fclose()",
            explanation = "fclose() closes the opened file.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_006",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which mode opens a file for reading?",
            options = listOf("r", "w", "a", "rb"),
            correctAnswer = "r",
            explanation = "Mode r opens file in read-only mode.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_007",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which mode creates a new file or overwrites existing file?",
            options = listOf("r", "a", "w", "rb"),
            correctAnswer = "w",
            explanation = "Mode w creates or overwrites a file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_008",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which mode appends data at the end of file?",
            options = listOf("r", "w", "a", "rw"),
            correctAnswer = "a",
            explanation = "Append mode adds data at the end of file.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_009",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function writes a string to a file?",
            options = listOf("fputs()", "fgets()", "fprintf()", "puts()"),
            correctAnswer = "fputs()",
            explanation = "fputs() writes a string to a file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_010",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function reads a string from file?",
            options = listOf("fgets()", "fputs()", "scanf()", "gets()"),
            correctAnswer = "fgets()",
            explanation = "fgets() reads a line from file safely.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_011",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function writes formatted output to file?",
            options = listOf("fprintf()", "fputs()", "printf()", "puts()"),
            correctAnswer = "fprintf()",
            explanation = "fprintf() writes formatted data to file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_012",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function reads formatted input from file?",
            options = listOf("fscanf()", "scanf()", "fgets()", "gets()"),
            correctAnswer = "fscanf()",
            explanation = "fscanf() reads formatted data from file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_013",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "What does EOF indicate?",
            options = listOf(
                "Beginning of file",
                "End of file",
                "File error",
                "File open success"
            ),
            correctAnswer = "End of file",
            explanation = "EOF indicates end of file has been reached.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_014",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function checks end of file?",
            options = listOf("feof()", "fend()", "eof()", "fileend()"),
            correctAnswer = "feof()",
            explanation = "feof() checks if end of file is reached.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_015",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which header file is required for file handling?",
            options = listOf("<stdlib.h>", "<stdio.h>", "<string.h>", "<file.h>"),
            correctAnswer = "<stdio.h>",
            explanation = "File handling functions are declared in stdio.h.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_016",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function writes a single character to file?",
            options = listOf("fputc()", "putc()", "fprintf()", "Both fputc() and putc()"),
            correctAnswer = "Both fputc() and putc()",
            explanation = "Both functions write a single character.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_017",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function reads a single character from file?",
            options = listOf("fgetc()", "getc()", "fscanf()", "Both fgetc() and getc()"),
            correctAnswer = "Both fgetc() and getc()",
            explanation = "Both read one character from file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_018",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which mode opens file for both reading and writing?",
            options = listOf("r", "w", "r+", "a"),
            correctAnswer = "r+",
            explanation = "r+ opens file for reading and writing.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_019",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function moves file pointer?",
            options = listOf("fseek()", "rewind()", "ftell()", "All of these"),
            correctAnswer = "All of these",
            explanation = "fseek, rewind, and ftell work with file pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_020",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "What does rewind() do?",
            options = listOf(
                "Closes file",
                "Moves pointer to start",
                "Deletes file",
                "Moves pointer to end"
            ),
            correctAnswer = "Moves pointer to start",
            explanation = "rewind() sets file pointer to beginning.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_021",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function returns current file pointer position?",
            options = listOf("fseek()", "ftell()", "rewind()", "feof()"),
            correctAnswer = "ftell()",
            explanation = "ftell() returns current file pointer position.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_022",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file mode is used for binary files?",
            options = listOf("r", "rb", "b", "binary"),
            correctAnswer = "rb",
            explanation = "rb opens file in binary read mode.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_023",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function is used to write binary data?",
            options = listOf("fprintf()", "fputs()", "fwrite()", "puts()"),
            correctAnswer = "fwrite()",
            explanation = "fwrite writes binary data to file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_024",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function reads binary data?",
            options = listOf("fread()", "fscanf()", "fgets()", "scanf()"),
            correctAnswer = "fread()",
            explanation = "fread reads binary data from file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_025",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function deletes a file?",
            options = listOf("delete()", "remove()", "erase()", "unlinkfile()"),
            correctAnswer = "remove()",
            explanation = "remove() deletes a file.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_026",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function renames a file?",
            options = listOf("rename()", "move()", "change()", "modify()"),
            correctAnswer = "rename()",
            explanation = "rename() changes file name.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_027",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "What happens if fclose() is not called?",
            options = listOf(
                "Compilation error",
                "Runtime error",
                "Data loss possible",
                "Nothing happens"
            ),
            correctAnswer = "Data loss possible",
            explanation = "Buffer may not flush properly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_028",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function flushes output buffer?",
            options = listOf("fflush()", "fclose()", "flush()", "clear()"),
            correctAnswer = "fflush()",
            explanation = "fflush writes buffered data immediately.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_029",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file pointer position is returned by ftell() at start?",
            options = listOf("0", "1", "-1", "EOF"),
            correctAnswer = "0",
            explanation = "File pointer starts at position 0.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_030",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file mode allows reading and appending?",
            options = listOf("a+", "r+", "w+", "ra"),
            correctAnswer = "a+",
            explanation = "a+ allows reading and appending.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_031",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file error is hardest to detect?",
            options = listOf(
                "File not found",
                "Permission denied",
                "Logical file error",
                "Syntax error"
            ),
            correctAnswer = "Logical file error",
            explanation = "Program runs but produces wrong file output.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_032",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function checks file error?",
            options = listOf("ferror()", "feof()", "error()", "fileerror()"),
            correctAnswer = "ferror()",
            explanation = "ferror checks for file stream errors.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_033",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file is safer for structured data?",
            options = listOf("Text file", "Binary file", "CSV file", "Log file"),
            correctAnswer = "Binary file",
            explanation = "Binary files preserve exact data format.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_034",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function is faster for large data?",
            options = listOf("fprintf()", "fputs()", "fwrite()", "puts()"),
            correctAnswer = "fwrite()",
            explanation = "Binary operations are faster.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_035",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file pointer is invalid?",
            options = listOf("FILE *fp;", "FILE fp;", "FILE *fp=NULL;", "FILE *fp=fopen(...)"),
            correctAnswer = "FILE fp;",
            explanation = "FILE must be used as pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_036",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function repositions file pointer absolutely?",
            options = listOf("rewind()", "ftell()", "fseek()", "feof()"),
            correctAnswer = "fseek()",
            explanation = "fseek moves pointer to a specific position.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_037",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file handling mistake is common in exams?",
            options = listOf(
                "Wrong mode",
                "Not checking NULL",
                "Wrong EOF usage",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All listed mistakes are common traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_038",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function is used before reading file contents?",
            options = listOf("fopen()", "fclose()", "fflush()", "remove()"),
            correctAnswer = "fopen()",
            explanation = "File must be opened before reading.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_039",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file mode truncates existing file?",
            options = listOf("r", "a", "w", "r+"),
            correctAnswer = "w",
            explanation = "w mode erases existing content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_040",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function should be used to read file till end?",
            options = listOf(
                "while(!feof(fp))",
                "while(fscanf()!=EOF)",
                "while(fgets()!=NULL)",
                "All are valid"
            ),
            correctAnswer = "while(fgets()!=NULL)",
            explanation = "This is the safest and correct approach.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_041",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file operation is buffered?",
            options = listOf("Read", "Write", "Both", "None"),
            correctAnswer = "Both",
            explanation = "Both reading and writing are buffered.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_042",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file handling concept improves performance?",
            options = listOf("Buffering", "EOF", "Pointer", "Mode"),
            correctAnswer = "Buffering",
            explanation = "Buffering reduces disk I/O calls.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_043",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which function is unsafe for file input?",
            options = listOf("fgets()", "fscanf()", "gets()", "fread()"),
            correctAnswer = "gets()",
            explanation = "gets is unsafe and should never be used.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_044",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file handling concept prevents data loss?",
            options = listOf("fclose()", "fflush()", "Checking NULL", "All of these"),
            correctAnswer = "All of these",
            explanation = "All help ensure safe file operations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_file_handling_045",
            categoryId = categoryId,
            chapterId = C_FILE_HANDLING,
            questionText = "Which file handling topic is most important for exams?",
            options = listOf(
                "File modes",
                "EOF handling",
                "Binary vs text files",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "Exams mix all file handling concepts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

//  ----------------------------------------------------------- DYNAMIC MEMORY ----------------------------------

        cQuestion(
            id = "c_dynamic_memory_001",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which is safer when passing large dynamically allocated data?",
            options = listOf(
                "Pass by value",
                "Pass by pointer",
                "Return by value",
                "Global"
            ),
            correctAnswer = "Pass by pointer",
            explanation = "Passing pointer avoids copying large memory blocks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_002",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which function is used for dynamic memory allocation?",
            options = listOf("malloc()", "alloc()", "memalloc()", "new()"),
            correctAnswer = "malloc()",
            explanation = "malloc allocates memory at runtime.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_003",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which header file is required for malloc()?",
            options = listOf("<stdio.h>", "<stdlib.h>", "<memory.h>", "<alloc.h>"),
            correctAnswer = "<stdlib.h>",
            explanation = "malloc, calloc, realloc, free are declared in stdlib.h.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_004",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "What does malloc() return on failure?",
            options = listOf("0", "-1", "NULL", "EOF"),
            correctAnswer = "NULL",
            explanation = "malloc returns NULL if memory allocation fails.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_005",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which memory area is used by malloc()?",
            options = listOf("Stack", "Heap", "Register", "Code"),
            correctAnswer = "Heap",
            explanation = "Dynamic memory is allocated in heap.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_006",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which function allocates and initializes memory to zero?",
            options = listOf("malloc()", "calloc()", "realloc()", "free()"),
            correctAnswer = "calloc()",
            explanation = "calloc initializes allocated memory to zero.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_007",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "What is the difference between malloc() and calloc()?",
            options = listOf(
                "malloc initializes memory",
                "calloc initializes memory",
                "malloc allocates multiple blocks",
                "No difference"
            ),
            correctAnswer = "calloc initializes memory",
            explanation = "calloc sets allocated memory to zero, malloc does not.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_008",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which function changes the size of allocated memory?",
            options = listOf("malloc()", "calloc()", "realloc()", "resize()"),
            correctAnswer = "realloc()",
            explanation = "realloc resizes previously allocated memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_009",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which function releases allocated memory?",
            options = listOf("delete()", "remove()", "free()", "clear()"),
            correctAnswer = "free()",
            explanation = "free releases heap memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_010",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "What happens if free() is not used?",
            options = listOf(
                "Compilation error",
                "Runtime error",
                "Memory leak",
                "Program stops"
            ),
            correctAnswer = "Memory leak",
            explanation = "Allocated memory remains occupied.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_011",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which pointer remains after free()?",
            options = listOf("NULL pointer", "Dangling pointer", "Wild pointer", "Valid pointer"),
            correctAnswer = "Dangling pointer",
            explanation = "Pointer still holds freed address.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_012",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "What should be done after free(ptr)?",
            options = listOf(
                "Reuse ptr",
                "Ignore ptr",
                "Set ptr to NULL",
                "Print ptr"
            ),
            correctAnswer = "Set ptr to NULL",
            explanation = "Prevents accidental access to freed memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_013",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "What is sizeof(ptr) when ptr is int*?",
            options = listOf("4", "8", "Size of int", "Depends on system"),
            correctAnswer = "Depends on system",
            explanation = "Pointer size depends on architecture, not data type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_014",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which allocation is faster?",
            options = listOf("malloc()", "calloc()", "realloc()", "Depends on compiler"),
            correctAnswer = "malloc()",
            explanation = "malloc does not initialize memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_015",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which allocation clears memory?",
            options = listOf("malloc()", "calloc()", "realloc()", "free()"),
            correctAnswer = "calloc()",
            explanation = "calloc sets all bytes to zero.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_016",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "What is the output? int *p=(int*)malloc(2*sizeof(int));",
            options = listOf(
                "Allocates 2 integers",
                "Allocates 2 bytes",
                "Allocates 1 integer",
                "Error"
            ),
            correctAnswer = "Allocates 2 integers",
            explanation = "sizeof(int) ensures correct memory size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_017",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which function returns void pointer?",
            options = listOf("malloc()", "calloc()", "realloc()", "All of these"),
            correctAnswer = "All of these",
            explanation = "All allocation functions return void pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_018",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which memory error is hardest to debug?",
            options = listOf(
                "Syntax error",
                "Memory leak",
                "Dangling pointer",
                "Logical error"
            ),
            correctAnswer = "Memory leak",
            explanation = "Program runs but memory usage grows silently.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_019",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "What happens if realloc() fails?",
            options = listOf(
                "Old memory freed",
                "Program crashes",
                "Returns NULL and old memory unchanged",
                "Returns garbage"
            ),
            correctAnswer = "Returns NULL and old memory unchanged",
            explanation = "Original memory remains intact on failure.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_020",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which is safest way to use realloc()?",
            options = listOf(
                "ptr = realloc(ptr,size)",
                "Use temporary pointer",
                "Ignore return value",
                "Free first"
            ),
            correctAnswer = "Use temporary pointer",
            explanation = "Prevents losing original memory on failure.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_021",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which allocation does NOT initialize memory?",
            options = listOf("malloc()", "calloc()", "realloc()", "free()"),
            correctAnswer = "malloc()",
            explanation = "malloc leaves memory uninitialized.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_022",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which allocation is best for arrays?",
            options = listOf("malloc()", "calloc()", "realloc()", "free()"),
            correctAnswer = "calloc()",
            explanation = "calloc initializes array elements to zero.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_023",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which memory is faster to access?",
            options = listOf("Heap", "Stack", "Register", "Depends"),
            correctAnswer = "Stack",
            explanation = "Stack memory access is faster than heap.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_024",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory error causes crash?",
            options = listOf(
                "Memory leak",
                "Dangling pointer dereference",
                "Unused memory",
                "Over-allocation"
            ),
            correctAnswer = "Dangling pointer dereference",
            explanation = "Accessing freed memory causes crash.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_025",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which is correct order?",
            options = listOf(
                "malloc → use → free",
                "free → use → malloc",
                "use → malloc → free",
                "malloc → free → use"
            ),
            correctAnswer = "malloc → use → free",
            explanation = "Memory must be allocated before use and freed after.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_026",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory concept saves memory?",
            options = listOf("malloc()", "free()", "Proper deallocation", "Over-allocation"),
            correctAnswer = "Proper deallocation",
            explanation = "Freeing unused memory prevents leaks.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_027",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which pointer should be checked after malloc()?",
            options = listOf("Data pointer", "Return pointer", "Stack pointer", "Frame pointer"),
            correctAnswer = "Return pointer",
            explanation = "Must check for NULL to avoid crashes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_028",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which memory allocation is safest?",
            options = listOf(
                "malloc without check",
                "calloc without check",
                "malloc with NULL check",
                "realloc without temp"
            ),
            correctAnswer = "malloc with NULL check",
            explanation = "Always check allocation success.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_029",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory topic is most confusing?",
            options = listOf(
                "malloc vs calloc",
                "realloc behavior",
                "free usage",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "Exams mix these concepts together.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_030",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory issue affects long-running programs?",
            options = listOf(
                "Syntax error",
                "Memory leak",
                "Wrong pointer type",
                "Compilation error"
            ),
            correctAnswer = "Memory leak",
            explanation = "Memory usage grows over time.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_031",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory function should be avoided in loop without free?",
            options = listOf("malloc()", "calloc()", "realloc()", "All of these"),
            correctAnswer = "All of these",
            explanation = "Causes memory leak if not freed.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_032",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which memory is released automatically?",
            options = listOf("Heap", "Stack", "Both", "None"),
            correctAnswer = "Stack",
            explanation = "Stack memory is freed automatically.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_033",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory error gives garbage value?",
            options = listOf(
                "Uninitialized memory",
                "Memory leak",
                "Freeing twice",
                "Correct allocation"
            ),
            correctAnswer = "Uninitialized memory",
            explanation = "malloc does not initialize memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_034",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which function deallocates memory but keeps pointer unchanged?",
            options = listOf("free()", "malloc()", "realloc()", "calloc()"),
            correctAnswer = "free()",
            explanation = "Pointer still holds freed address.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_035",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which memory error occurs when pointer is reused after free?",
            options = listOf(
                "Memory leak",
                "Dangling pointer",
                "Wild pointer",
                "NULL pointer"
            ),
            correctAnswer = "Dangling pointer",
            explanation = "Pointer refers to freed memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_036",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory practice is best?",
            options = listOf(
                "Allocate large blocks",
                "Free memory early",
                "Never free memory",
                "Reuse freed pointer"
            ),
            correctAnswer = "Free memory early",
            explanation = "Reduces memory usage and leaks.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_037",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory issue causes segmentation fault?",
            options = listOf(
                "Memory leak",
                "Dangling pointer access",
                "calloc usage",
                "Proper allocation"
            ),
            correctAnswer = "Dangling pointer access",
            explanation = "Accessing freed memory crashes program.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_038",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory is slowest?",
            options = listOf("Heap", "Stack", "Register", "Cache"),
            correctAnswer = "Heap",
            explanation = "Heap allocation is slower than stack.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_039",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory concept improves stability?",
            options = listOf(
                "Checking NULL",
                "Freeing memory",
                "Avoiding dangling pointers",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "Good practices improve program stability.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_040",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory call should be paired?",
            options = listOf(
                "malloc() and free()",
                "calloc() and free()",
                "realloc() and free()",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "Every allocation must be freed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_041",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory function is safest for resizing?",
            options = listOf(
                "malloc() again",
                "realloc() with temp pointer",
                "calloc() again",
                "free() then malloc()"
            ),
            correctAnswer = "realloc() with temp pointer",
            explanation = "Prevents memory loss on failure.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_042",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory topic is most important for exams?",
            options = listOf(
                "malloc vs calloc",
                "free and dangling pointer",
                "realloc behavior",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "Exams mix all DMA concepts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_043",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory error causes undefined behavior?",
            options = listOf(
                "Double free",
                "Memory leak",
                "calloc",
                "Proper free"
            ),
            correctAnswer = "Double free",
            explanation = "Freeing memory twice leads to undefined behavior.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_044",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which memory should be freed manually?",
            options = listOf("Stack", "Heap", "Register", "Code"),
            correctAnswer = "Heap",
            explanation = "Heap memory must be freed explicitly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cQuestion(
            id = "c_dynamic_memory_045",
            categoryId = categoryId,
            chapterId = C_DYNAMIC_MEMORY,
            questionText = "Which dynamic memory mistake is most common in exams?",
            options = listOf(
                "Wrong sizeof",
                "Missing free",
                "Dangling pointer",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All are common exam traps.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        )

    )
}
