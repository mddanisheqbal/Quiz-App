package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH DatabaseSeeder slug)
   =============================== */

// MUST MATCH DatabaseSeeder slug EXACTLY

const val CPP_BASICS = "cpp_basics_of_c"
const val CPP_DATA_TYPES = "cpp_data_types_and_variables"
const val CPP_CONTROL = "cpp_control_statements"
const val CPP_FUNCTIONS = "cpp_functions"
const val CPP_OOP = "cpp_oop_concepts"
const val CPP_CONSTRUCTORS = "cpp_constructors_and_destructors"
const val CPP_INHERITANCE = "cpp_inheritance"
const val CPP_POLYMORPHISM = "cpp_polymorphism"
const val CPP_TEMPLATES = "cpp_templates"
const val CPP_STL = "cpp_stl"
const val CPP_EXCEPTION = "cpp_exception_handling"
const val CPP_FILE = "cpp_file_handling"


/* ===============================
   HELPER FUNCTION
   =============================== */

private fun cppQuestion(
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
   MAIN ENTRY
   =============================== */

fun getCppQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    return listOf(

        // --------------------------------------------1️⃣ BASICS -----------------------------------------
        cppQuestion(
            "cpp_basics_001",
            categoryId,
            CPP_BASICS,
            "Who developed C++?",
            listOf("Bjarne Stroustrup", "Dennis Ritchie", "James Gosling", "Guido van Rossum"),
            "Bjarne Stroustrup",
            "C++ was developed by Bjarne Stroustrup at Bell Labs as an extension of the C language, adding object-oriented features.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_002",
            categoryId,
            CPP_BASICS,
            "C++ is an extension of which programming language?",
            listOf("C", "Java", "Python", "Pascal"),
            "C",
            "C++ was created by extending the C programming language, keeping most of its syntax and adding new features.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_003",
            categoryId,
            CPP_BASICS,
            "Which symbol is used to include header files in C++?",
            listOf("#", "$", "@", "&"),
            "#",
            "The # symbol is used with #include to tell the compiler to include header files before compilation.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_004",
            categoryId,
            CPP_BASICS,
            "Which header file is required for input and output in C++?",
            listOf("<iostream>", "<stdio.h>", "<input>", "<stream>"),
            "<iostream>",
            "<iostream> provides input and output objects like cin, cout, and cerr.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_005",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to define a namespace?",
            listOf("namespace", "package", "define", "scope"),
            "namespace",
            "The namespace keyword is used to group related identifiers and avoid name conflicts.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_006",
            categoryId,
            CPP_BASICS,
            "Which function is the entry point of a C++ program?",
            listOf("main()", "start()", "begin()", "init()"),
            "main()",
            "Every C++ program starts execution from the main() function.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_007",
            categoryId,
            CPP_BASICS,
            "Which operator is used to insert data into output stream?",
            listOf("<<", ">>", "==", "="),
            "<<",
            "The << operator sends data to the output stream, commonly used with cout.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_008",
            categoryId,
            CPP_BASICS,
            "Which operator is used to extract input from the user?",
            listOf(">>", "<<", "=", "::"),
            ">>",
            "The >> operator is used with cin to take input from the user.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_009",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to declare a constant variable?",
            listOf("const", "static", "final", "define"),
            "const",
            "The const keyword prevents a variable’s value from being changed after initialization.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_010",
            categoryId,
            CPP_BASICS,
            "Which data type is used to store whole numbers?",
            listOf("int", "float", "double", "char"),
            "int",
            "The int data type is used to store integer (whole number) values.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_011",
            categoryId,
            CPP_BASICS,
            "Which data type is used to store decimal values?",
            listOf("float", "int", "char", "bool"),
            "float",
            "float is used to store numbers with decimal points.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_012",
            categoryId,
            CPP_BASICS,
            "Which data type stores a single character?",
            listOf("char", "string", "int", "bool"),
            "char",
            "char stores a single character such as 'A' or '9'.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_013",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to declare a variable?",
            listOf("Data type", "var", "let", "define"),
            "Data type",
            "In C++, variables are declared by specifying a data type followed by the variable name.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_014",
            categoryId,
            CPP_BASICS,
            "Which symbol ends a C++ statement?",
            listOf(";", ":", ".", ","),
            ";",
            "Every C++ statement must end with a semicolon to indicate completion.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_015",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to take input from the user?",
            listOf("cin", "cout", "scanf", "input"),
            "cin",
            "cin reads input from the keyboard using the extraction operator.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_016",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to display output?",
            listOf("cout", "cin", "print", "output"),
            "cout",
            "cout sends output to the console using the insertion operator.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_017",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to return a value from a function?",
            listOf("return", "break", "exit", "continue"),
            "return",
            "The return keyword sends a value back from a function to the caller.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_018",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to define a constant macro?",
            listOf("#define", "const", "macro", "static"),
            "#define",
            "#define is a preprocessor directive used to create macros.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_019",
            categoryId,
            CPP_BASICS,
            "Which operator is used for assignment?",
            listOf("=", "==", "!=", "<"),
            "=",
            "The = operator assigns a value to a variable.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_020",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to exit from a loop?",
            listOf("break", "exit", "return", "stop"),
            "break",
            "break immediately terminates the loop execution.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_021",
            categoryId,
            CPP_BASICS,
            "Which keyword skips the current iteration of a loop?",
            listOf("continue", "break", "skip", "pass"),
            "continue",
            "continue skips the remaining code in the loop and moves to the next iteration.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_022",
            categoryId,
            CPP_BASICS,
            "Which operator compares two values for equality?",
            listOf("==", "=", "!=", "<"),
            "==",
            "The == operator checks whether two values are equal.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_023",
            categoryId,
            CPP_BASICS,
            "Which keyword defines a block of code?",
            listOf("{}", "()", "[]", "<>"),
            "{}",
            "Curly braces define a block of code in C++.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_024",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to include standard namespace?",
            listOf("using", "include", "import", "scope"),
            "using",
            "using namespace std allows access to standard library objects without prefix.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_025",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to define a boolean value?",
            listOf("bool", "boolean", "truefalse", "bit"),
            "bool",
            "bool stores true or false values in C++.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_026",
            categoryId,
            CPP_BASICS,
            "Which operator is used for logical AND?",
            listOf("&&", "&", "and", "||"),
            "&&",
            "&& returns true only if both conditions are true.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_027",
            categoryId,
            CPP_BASICS,
            "Which operator is used for logical OR?",
            listOf("||", "|", "or", "&&"),
            "||",
            "|| returns true if at least one condition is true.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_028",
            categoryId,
            CPP_BASICS,
            "Which operator is used to negate a condition?",
            listOf("!", "~", "not", "^"),
            "!",
            "! reverses the boolean value of a condition.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_029",
            categoryId,
            CPP_BASICS,
            "Which file extension is used for C++ programs?",
            listOf(".cpp", ".c", ".java", ".py"),
            ".cpp",
            ".cpp is the standard extension for C++ source files.",
            Difficulty.EASY,
            createdAt
        ),

        cppQuestion(
            "cpp_basics_030",
            categoryId,
            CPP_BASICS,
            "Which keyword is used to define a constant value that cannot be modified using preprocessor?",
            listOf("const", "#define", "static", "final"),
            "const",
            "The const keyword is used to declare variables whose values cannot be changed during program execution. Unlike #define, const follows type checking and scope rules, making it safer and more reliable.",
            Difficulty.EASY,
            createdAt
        ),

        //------------------------------------ 2️⃣ DATA TYPES AND VARIABLES --------------------------------

        cppQuestion(
            id = "cpp_datatype_001",
            categoryId = categoryId,
            chapterId = CPP_DATA_TYPES,
            questionText = "Which data type stores decimal values?",
            options = listOf("int", "float", "char", "bool"),
            correctAnswer = "float",
            explanation = "The float data type is used to store numbers with decimal points such as 3.14 or 5.6. It is commonly used for fractional values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

    cppQuestion(
        id = "cpp_datatype_002",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type is used to store whole numbers?",
        options = listOf("float", "double", "int", "char"),
        correctAnswer = "int",
        explanation = "The int data type is used to store integer values without decimal points, such as 10, -5, or 0.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_003",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type stores a single character?",
        options = listOf("string", "char", "int", "bool"),
        correctAnswer = "char",
        explanation = "The char data type stores a single character enclosed in single quotes, such as 'A' or '9'.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_004",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type is used to store true or false values?",
        options = listOf("int", "char", "bool", "float"),
        correctAnswer = "bool",
        explanation = "The bool data type stores logical values, either true or false, and is commonly used in conditions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_005",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which keyword is used to declare a constant variable?",
        options = listOf("static", "final", "const", "#define"),
        correctAnswer = "const",
        explanation = "The const keyword is used to declare variables whose values cannot be changed after initialization.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_006",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type occupies the least memory?",
        options = listOf("int", "float", "double", "char"),
        correctAnswer = "char",
        explanation = "The char data type usually occupies 1 byte of memory, making it the smallest basic data type.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_007",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type provides higher precision than float?",
        options = listOf("int", "char", "double", "bool"),
        correctAnswer = "double",
        explanation = "The double data type stores decimal values with higher precision and accuracy than float.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_008",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which of the following is a valid variable name?",
        options = listOf("2value", "int", "total_marks", "float"),
        correctAnswer = "total_marks",
        explanation = "Variable names can contain letters, digits, and underscores but cannot start with a digit or be keywords.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_009",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which operator is used to assign a value to a variable?",
        options = listOf("==", "=", "!=", "<"),
        correctAnswer = "=",
        explanation = "The assignment operator (=) is used to assign a value to a variable in C++.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_010",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "What is variable initialization?",
        options = listOf(
            "Declaring a variable",
            "Assigning value at declaration",
            "Deleting a variable",
            "Printing a variable"
        ),
        correctAnswer = "Assigning value at declaration",
        explanation = "Variable initialization means giving an initial value to a variable at the time of declaration.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_011",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type is best for storing age?",
        options = listOf("float", "char", "int", "double"),
        correctAnswer = "int",
        explanation = "Age is always a whole number, so the int data type is the most suitable choice.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_012",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type stores text like \"Hello\"?",
        options = listOf("char", "string", "int", "bool"),
        correctAnswer = "string",
        explanation = "The string data type is used to store multiple characters or text values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_013",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which header file is required to use string in C++?",
        options = listOf("<iostream>", "<string>", "<stdio.h>", "<stdlib.h>"),
        correctAnswer = "<string>",
        explanation = "The <string> header file provides support for string objects in C++.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_014",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which keyword checks the size of a data type?",
        options = listOf("sizeof", "length", "size", "count"),
        correctAnswer = "sizeof",
        explanation = "The sizeof operator returns the memory size (in bytes) of a data type or variable.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_015",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type is used to store memory addresses?",
        options = listOf("int", "pointer", "address", "reference"),
        correctAnswer = "pointer",
        explanation = "Pointers are variables that store the memory address of another variable.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_016",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which symbol is used to declare a pointer?",
        options = listOf("&", "*", "#", "%"),
        correctAnswer = "*",
        explanation = "The * symbol is used to declare a pointer variable in C++.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_017",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "What does unsigned int mean?",
        options = listOf(
            "Stores negative values",
            "Stores only positive values",
            "Stores decimal values",
            "Stores characters"
        ),
        correctAnswer = "Stores only positive values",
        explanation = "Unsigned int stores only non-negative integers, allowing a larger positive range.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_018",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type is best to store salary?",
        options = listOf("int", "char", "float", "bool"),
        correctAnswer = "float",
        explanation = "Salary may contain decimal values, so float is a suitable data type.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_019",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which variable declaration is correct?",
        options = listOf("int 1num;", "float total marks;", "char _grade;", "double %value;"),
        correctAnswer = "char _grade;",
        explanation = "Variable names can start with an underscore and must not contain spaces or special symbols.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_020",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type has the highest precision?",
        options = listOf("float", "int", "double", "char"),
        correctAnswer = "double",
        explanation = "Double provides higher precision for decimal values compared to float.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_021",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which keyword is used to declare multiple variables in one line?",
        options = listOf("comma", "semicolon", "colon", "dot"),
        correctAnswer = "comma",
        explanation = "Multiple variables of the same type can be declared using commas, such as int a, b, c;",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_022",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "What does sizeof(int) return?",
        options = listOf(
            "Value of integer",
            "Size of integer memory",
            "Number of digits",
            "Compiler version"
        ),
        correctAnswer = "Size of integer memory",
        explanation = "sizeof(int) returns the number of bytes required to store an integer.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_023",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which is NOT a built-in data type?",
        options = listOf("int", "float", "char", "array"),
        correctAnswer = "array",
        explanation = "Array is a derived data type, not a basic built-in data type.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_024",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type is used to store only one of two values?",
        options = listOf("int", "float", "char", "bool"),
        correctAnswer = "bool",
        explanation = "Bool can store only two values: true or false.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_025",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which is the correct initialization?",
        options = listOf("int x; x=10;", "int x = 10;", "x = int 10;", "int = x 10;"),
        correctAnswer = "int x = 10;",
        explanation = "This statement declares and initializes the variable in one line.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_026",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "What is the default value of an uninitialized local variable?",
        options = listOf("0", "null", "garbage value", "false"),
        correctAnswer = "garbage value",
        explanation = "Local variables contain garbage values if not initialized explicitly.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_027",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type can store both integers and decimals?",
        options = listOf("int", "float", "char", "bool"),
        correctAnswer = "float",
        explanation = "Float can store numbers with or without decimal points.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_028",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which data type is best to store percentage values?",
        options = listOf("int", "char", "float", "bool"),
        correctAnswer = "float",
        explanation = "Percentage values usually include decimals, so float is suitable.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_029",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "Which keyword prevents modification of a variable?",
        options = listOf("static", "final", "const", "#define"),
        correctAnswer = "const",
        explanation = "The const keyword makes a variable read-only after initialization.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_datatype_030",
        categoryId = categoryId,
        chapterId = CPP_DATA_TYPES,
        questionText = "What is a variable in C++?",
        options = listOf(
            "A keyword",
            "A constant value",
            "A named memory location",
            "A function"
        ),
        correctAnswer = "A named memory location",
        explanation = "A variable is a named memory location used to store data during program execution.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),


    // ---------------------------------------------3️⃣ CONTROL STATEMENTS -------------------------------------


        cppQuestion(
            id = "cpp_control_001",
            categoryId = categoryId,
            chapterId = CPP_CONTROL,
            questionText = "Which statement is used to make decisions in C++?",
            options = listOf("if", "for", "while", "goto"),
            correctAnswer = "if",
            explanation = "The if statement is used to execute code only when a given condition is true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

    cppQuestion(
        id = "cpp_control_002",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which statement is used when there are multiple conditions?",
        options = listOf("if", "if-else", "switch", "goto"),
        correctAnswer = "switch",
        explanation = "The switch statement is used to select one option from many based on an expression value.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_003",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which keyword is used to execute code when a condition is false?",
        options = listOf("else", "then", "false", "continue"),
        correctAnswer = "else",
        explanation = "The else block runs when the condition in the if statement evaluates to false.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_004",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop executes at least once even if the condition is false?",
        options = listOf("for", "while", "do-while", "if"),
        correctAnswer = "do-while",
        explanation = "The do-while loop checks the condition after executing the loop body once.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_005",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop is best when the number of iterations is known?",
        options = listOf("while", "do-while", "for", "if"),
        correctAnswer = "for",
        explanation = "The for loop is commonly used when the loop count is known in advance.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_006",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which keyword is used to terminate a loop immediately?",
        options = listOf("continue", "exit", "break", "stop"),
        correctAnswer = "break",
        explanation = "The break statement stops the loop execution and exits the loop completely.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_007",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which keyword skips the current loop iteration?",
        options = listOf("break", "continue", "skip", "next"),
        correctAnswer = "continue",
        explanation = "The continue statement skips the remaining code and moves to the next iteration.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_008",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which operator is used to compare two values?",
        options = listOf("=", "==", "!=", "<>"),
        correctAnswer = "==",
        explanation = "The == operator compares two values and checks if they are equal.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_009",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which condition must be true for an if statement to execute?",
        options = listOf("0", "false", "true", "null"),
        correctAnswer = "true",
        explanation = "The if block executes only when the condition evaluates to true.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_010",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which statement is optional in an if condition?",
        options = listOf("if", "else", "condition", "expression"),
        correctAnswer = "else",
        explanation = "The else block is optional and executes only if the if condition is false.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_011",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which keyword is used inside switch to stop case execution?",
        options = listOf("stop", "exit", "break", "continue"),
        correctAnswer = "break",
        explanation = "The break statement prevents execution from falling into the next case.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_012",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which keyword handles unmatched switch cases?",
        options = listOf("else", "default", "break", "case"),
        correctAnswer = "default",
        explanation = "The default case runs when no matching case is found in switch.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_013",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop checks the condition before executing the body?",
        options = listOf("do-while", "while", "for", "all of these"),
        correctAnswer = "while",
        explanation = "The while loop checks the condition first and executes only if it is true.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_014",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which symbol is used to group conditions?",
        options = listOf("{}", "()", "[]", "<>"),
        correctAnswer = "()",
        explanation = "Parentheses are used to group and evaluate conditions correctly.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_015",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop can run infinitely if condition never becomes false?",
        options = listOf("for", "while", "do-while", "all of these"),
        correctAnswer = "all of these",
        explanation = "Any loop can become infinite if its exit condition is never met.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_016",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which keyword is used for unconditional jump?",
        options = listOf("break", "continue", "goto", "exit"),
        correctAnswer = "goto",
        explanation = "The goto statement transfers control to a labeled statement in the program.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_017",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which statement is used to test multiple conditions sequentially?",
        options = listOf("if", "if-else-if", "switch", "for"),
        correctAnswer = "if-else-if",
        explanation = "The if-else-if ladder checks multiple conditions one by one.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_018",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop is also known as entry-controlled loop?",
        options = listOf("do-while", "while", "goto", "switch"),
        correctAnswer = "while",
        explanation = "The while loop checks the condition before entering the loop body.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_019",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop is exit-controlled?",
        options = listOf("for", "while", "do-while", "if"),
        correctAnswer = "do-while",
        explanation = "The do-while loop checks the condition after executing the loop body.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_020",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which operator is used for logical AND?",
        options = listOf("&", "&&", "|", "||"),
        correctAnswer = "&&",
        explanation = "The && operator returns true only if both conditions are true.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_021",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which operator is used for logical OR?",
        options = listOf("||", "|", "&", "&&"),
        correctAnswer = "||",
        explanation = "The || operator returns true if at least one condition is true.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_022",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which operator reverses a condition?",
        options = listOf("!", "~", "^", "not"),
        correctAnswer = "!",
        explanation = "The ! operator reverses the boolean result of a condition.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_023",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which statement is used to exit a function?",
        options = listOf("break", "continue", "return", "exit"),
        correctAnswer = "return",
        explanation = "The return statement exits a function and optionally returns a value.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_024",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop is best for array traversal?",
        options = listOf("for", "while", "do-while", "goto"),
        correctAnswer = "for",
        explanation = "The for loop is commonly used for iterating through arrays.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_025",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which statement groups multiple statements together?",
        options = listOf("{}", "()", "[]", "<>"),
        correctAnswer = "{}",
        explanation = "Curly braces are used to group multiple statements into a block.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_026",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which keyword is mandatory in every switch case?",
        options = listOf("default", "break", "case", "continue"),
        correctAnswer = "case",
        explanation = "Each switch option must begin with the case keyword.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_027",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which loop executes based on condition only?",
        options = listOf("for", "while", "do-while", "switch"),
        correctAnswer = "while",
        explanation = "The while loop executes repeatedly as long as the condition remains true.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_028",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which statement is discouraged but available in C++?",
        options = listOf("if", "for", "goto", "switch"),
        correctAnswer = "goto",
        explanation = "goto is discouraged because it makes code hard to read and maintain.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_029",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Which statement checks condition multiple times?",
        options = listOf("if", "switch", "loop", "case"),
        correctAnswer = "loop",
        explanation = "Loops repeatedly check conditions until they become false.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),

    cppQuestion(
        id = "cpp_control_030",
        categoryId = categoryId,
        chapterId = CPP_CONTROL,
        questionText = "Control statements are mainly used for?",
        options = listOf(
            "Data storage",
            "Decision making",
            "Memory allocation",
            "File handling"
        ),
        correctAnswer = "Decision making",
        explanation = "Control statements control the flow of execution based on conditions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ),


    // ------------------------------------4️⃣ FUNCTIONS -----------------------------
        cppQuestion(
            "cpp_func_001",
            categoryId,
            CPP_FUNCTIONS,
            "What is a function in C++?",
            listOf(
                "A block of code that performs a specific task",
                "A variable",
                "A data type",
                "A loop"
            ),
            "A block of code that performs a specific task",
            "A function is a reusable block of code designed to perform a specific operation. It helps reduce code repetition.",
            Difficulty.EASY,
            createdAt
        ),

    cppQuestion(
        "cpp_func_002",
        categoryId,
        CPP_FUNCTIONS,
        "Which function is the entry point of a C++ program?",
        listOf("start()", "main()", "begin()", "init()"),
        "main()",
        "The execution of every C++ program starts from the main() function. It is mandatory in every program.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_003",
        categoryId,
        CPP_FUNCTIONS,
        "Which keyword is used to return a value from a function?",
        listOf("break", "continue", "return", "exit"),
        "return",
        "The return keyword sends a value back to the calling function and ends function execution.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_004",
        categoryId,
        CPP_FUNCTIONS,
        "What is a function prototype?",
        listOf(
            "Function definition",
            "Function call",
            "Declaration of function",
            "Function execution"
        ),
        "Declaration of function",
        "A function prototype tells the compiler about the function name, return type, and parameters before its use.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_005",
        categoryId,
        CPP_FUNCTIONS,
        "Which part of a function specifies the data type of the value it returns?",
        listOf("Function name", "Return type", "Parameters", "Body"),
        "Return type",
        "The return type defines what kind of value the function will send back to the caller.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_006",
        categoryId,
        CPP_FUNCTIONS,
        "Which function does not return any value?",
        listOf("int", "float", "void", "double"),
        "void",
        "void functions perform tasks but do not return any value to the calling function.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_007",
        categoryId,
        CPP_FUNCTIONS,
        "What is a function call?",
        listOf(
            "Defining a function",
            "Executing a function",
            "Declaring a function",
            "Copying a function"
        ),
        "Executing a function",
        "A function call is used to execute the code inside a function.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_008",
        categoryId,
        CPP_FUNCTIONS,
        "Which symbol is used to pass arguments to a function?",
        listOf("{}", "()", "[]", "<>"),
        "()",
        "Arguments are passed to functions using parentheses () during the function call.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_009",
        categoryId,
        CPP_FUNCTIONS,
        "What are function parameters?",
        listOf(
            "Variables inside main()",
            "Values passed to a function",
            "Return values",
            "Global variables"
        ),
        "Values passed to a function",
        "Parameters receive values from the function call and are used inside the function body.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_func_010",
        categoryId,
        CPP_FUNCTIONS,
        "Which type of function is predefined in C++?",
        listOf("User-defined", "Library", "Recursive", "Inline"),
        "Library",
        "Library functions are predefined functions provided by C++ such as cout, sqrt(), and strlen().",
        Difficulty.EASY,
        createdAt
    ),

    // ---------- MEDIUM ----------

    cppQuestion(
        "cpp_func_011",
        categoryId,
        CPP_FUNCTIONS,
        "What is a user-defined function?",
        listOf(
            "Function provided by compiler",
            "Function created by programmer",
            "Function inside library",
            "System function"
        ),
        "Function created by programmer",
        "User-defined functions are written by programmers to perform specific tasks as needed.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_012",
        categoryId,
        CPP_FUNCTIONS,
        "What is function overloading?",
        listOf(
            "Multiple functions with same name but different parameters",
            "Multiple return types",
            "Calling a function many times",
            "Using recursion"
        ),
        "Multiple functions with same name but different parameters",
        "Function overloading allows multiple functions to have the same name but different parameter lists.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_013",
        categoryId,
        CPP_FUNCTIONS,
        "Which feature allows function calls within itself?",
        listOf("Overloading", "Inlining", "Recursion", "Abstraction"),
        "Recursion",
        "Recursion occurs when a function calls itself to solve a problem in smaller steps.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_014",
        categoryId,
        CPP_FUNCTIONS,
        "Which type of variable is declared inside a function?",
        listOf("Global", "Static", "Local", "External"),
        "Local",
        "Local variables are declared inside a function and can be used only within that function.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_015",
        categoryId,
        CPP_FUNCTIONS,
        "What happens if a function has no return statement?",
        listOf(
            "Compilation error",
            "Runtime error",
            "Returns garbage value",
            "Returns nothing"
        ),
        "Returns nothing",
        "If the return type is void, the function does not return any value.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_016",
        categoryId,
        CPP_FUNCTIONS,
        "What is call by value?",
        listOf(
            "Passing address to function",
            "Passing copy of value",
            "Using pointers",
            "Using references"
        ),
        "Passing copy of value",
        "In call by value, a copy of the actual argument is passed, so changes do not affect original data.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_017",
        categoryId,
        CPP_FUNCTIONS,
        "Which method allows modifying actual arguments?",
        listOf("Call by value", "Call by reference", "Inline call", "Static call"),
        "Call by reference",
        "Call by reference allows functions to modify the original variables passed to them.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_018",
        categoryId,
        CPP_FUNCTIONS,
        "Which keyword is used to make a function inline?",
        listOf("static", "inline", "virtual", "const"),
        "inline",
        "inline functions request the compiler to replace function calls with function code for faster execution.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_019",
        categoryId,
        CPP_FUNCTIONS,
        "Which function calls itself?",
        listOf("Inline", "Recursive", "Library", "Virtual"),
        "Recursive",
        "A recursive function calls itself repeatedly until a base condition is met.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_func_020",
        categoryId,
        CPP_FUNCTIONS,
        "Which part of a function contains executable statements?",
        listOf("Prototype", "Header", "Body", "Return type"),
        "Body",
        "The function body contains all executable instructions written inside curly braces.",
        Difficulty.MEDIUM,
        createdAt
    ),

    // ---------- HARD ----------

    cppQuestion(
        "cpp_func_021",
        categoryId,
        CPP_FUNCTIONS,
        "Which function is called automatically when the program starts?",
        listOf("user()", "main()", "auto()", "init()"),
        "main()",
        "The operating system automatically calls main() when the program starts execution.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_022",
        categoryId,
        CPP_FUNCTIONS,
        "What is the scope of a local variable?",
        listOf(
            "Entire program",
            "Inside the function only",
            "Outside function",
            "Global scope"
        ),
        "Inside the function only",
        "Local variables are accessible only within the function where they are declared.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_023",
        categoryId,
        CPP_FUNCTIONS,
        "Which function type improves performance by avoiding function calls?",
        listOf("Recursive", "Inline", "Virtual", "Static"),
        "Inline",
        "Inline functions reduce overhead by replacing function calls with actual code.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_024",
        categoryId,
        CPP_FUNCTIONS,
        "Which feature allows same function name with different arguments?",
        listOf("Inheritance", "Encapsulation", "Overloading", "Abstraction"),
        "Overloading",
        "Function overloading improves readability by using the same function name for similar operations.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_025",
        categoryId,
        CPP_FUNCTIONS,
        "Which type of function cannot be overloaded?",
        listOf("Inline", "Recursive", "main()", "Static"),
        "main()",
        "The main() function cannot be overloaded because it has a fixed signature.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_026",
        categoryId,
        CPP_FUNCTIONS,
        "What is the return type of main()?",
        listOf("void", "int", "float", "char"),
        "int",
        "main() returns an integer value to the operating system, usually 0 for successful execution.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_027",
        categoryId,
        CPP_FUNCTIONS,
        "Which function feature supports code reusability?",
        listOf("Loops", "Arrays", "Functions", "Pointers"),
        "Functions",
        "Functions allow reuse of code by calling the same block multiple times.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_028",
        categoryId,
        CPP_FUNCTIONS,
        "Which is NOT a function type?",
        listOf("Library", "User-defined", "Recursive", "Conditional"),
        "Conditional",
        "Conditional is a control statement, not a function type.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_029",
        categoryId,
        CPP_FUNCTIONS,
        "Which feature reduces memory usage in function calls?",
        listOf("Overloading", "Recursion", "Inline", "Virtual"),
        "Inline",
        "Inline functions reduce memory overhead by avoiding stack usage for function calls.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_func_030",
        categoryId,
        CPP_FUNCTIONS,
        "Which function mechanism breaks a problem into smaller sub-problems?",
        listOf("Overloading", "Inline", "Recursion", "Abstraction"),
        "Recursion",
        "Recursion solves complex problems by repeatedly breaking them into smaller simpler problems.",
        Difficulty.HARD,
        createdAt
    ),


    // ----------------------------5️⃣ OOP -----------------------------------------

            // ---------- EASY ----------
        cppQuestion(
                "cpp_oops_001",
                categoryId,
                CPP_OOP,
                "What does OOP stand for in C++?",
                listOf(
                    "Object Oriented Programming",
                    "Open Object Programming",
                    "Original Object Programming",
                    "Optional Oriented Programming"
                ),
                "Object Oriented Programming",
                "OOP stands for Object Oriented Programming. It is a programming approach based on objects and classes.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_oops_002",
        categoryId,
        CPP_OOP,
        "Which of the following is the basic unit of OOP?",
        listOf("Function", "Object", "Variable", "Loop"),
        "Object",
        "Object is the basic unit of OOP. It represents a real-world entity having data and behavior.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_003",
        categoryId,
        CPP_OOP,
        "What is a class in C++?",
        listOf(
            "A function",
            "A blueprint of an object",
            "A data type only",
            "A loop structure"
        ),
        "A blueprint of an object",
        "A class is a blueprint or template from which objects are created.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_004",
        categoryId,
        CPP_OOP,
        "Which keyword is used to create a class in C++?",
        listOf("class", "struct", "object", "define"),
        "class",
        "The class keyword is used to define a class in C++.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_005",
        categoryId,
        CPP_OOP,
        "Which keyword is used to create an object?",
        listOf("new", "class", "object", "create"),
        "new",
        "The new keyword is used to dynamically allocate memory for an object.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_006",
        categoryId,
        CPP_OOP,
        "Which OOP concept binds data and functions together?",
        listOf(
            "Inheritance",
            "Encapsulation",
            "Polymorphism",
            "Abstraction"
        ),
        "Encapsulation",
        "Encapsulation binds data members and member functions into a single unit called a class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_007",
        categoryId,
        CPP_OOP,
        "Which access specifier allows data to be accessed only inside the class?",
        listOf("public", "private", "protected", "default"),
        "private",
        "Private members are accessible only within the same class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_008",
        categoryId,
        CPP_OOP,
        "Which access specifier allows access anywhere?",
        listOf("private", "protected", "public", "default"),
        "public",
        "Public members can be accessed from anywhere in the program.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_009",
        categoryId,
        CPP_OOP,
        "Which feature of OOP supports code reusability?",
        listOf(
            "Encapsulation",
            "Inheritance",
            "Polymorphism",
            "Abstraction"
        ),
        "Inheritance",
        "Inheritance allows a class to reuse properties and methods of another class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_010",
        categoryId,
        CPP_OOP,
        "Which concept hides implementation details?",
        listOf(
            "Encapsulation",
            "Inheritance",
            "Polymorphism",
            "Abstraction"
        ),
        "Abstraction",
        "Abstraction hides internal implementation and shows only essential features.",
        Difficulty.EASY,
        createdAt
    ),

    // ---------- MEDIUM ----------

    cppQuestion(
        "cpp_oops_011",
        categoryId,
        CPP_OOP,
        "What is inheritance in C++?",
        listOf(
            "Creating objects",
            "Using one class inside another",
            "Deriving a new class from an existing class",
            "Hiding data"
        ),
        "Deriving a new class from an existing class",
        "Inheritance allows a new class to acquire properties and behavior of an existing class.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_012",
        categoryId,
        CPP_OOP,
        "Which symbol is used for inheritance?",
        listOf(":", "::", ".", "->"),
        ":",
        "The colon (:) symbol is used to inherit a class in C++.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_013",
        categoryId,
        CPP_OOP,
        "What is polymorphism?",
        listOf(
            "Many classes",
            "Many functions",
            "One function with many forms",
            "Many objects"
        ),
        "One function with many forms",
        "Polymorphism allows the same function name to behave differently in different situations.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_014",
        categoryId,
        CPP_OOP,
        "Which type of polymorphism is achieved at compile time?",
        listOf(
            "Runtime polymorphism",
            "Dynamic binding",
            "Function overloading",
            "Virtual functions"
        ),
        "Function overloading",
        "Function overloading is resolved at compile time and supports compile-time polymorphism.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_015",
        categoryId,
        CPP_OOP,
        "Which keyword is used to achieve runtime polymorphism?",
        listOf("static", "inline", "virtual", "const"),
        "virtual",
        "Virtual functions enable runtime polymorphism using base class pointers.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_016",
        categoryId,
        CPP_OOP,
        "What is an object?",
        listOf(
            "Instance of a class",
            "Function",
            "Data type",
            "Variable"
        ),
        "Instance of a class",
        "An object is a real-time entity created from a class.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_017",
        categoryId,
        CPP_OOP,
        "Which function is automatically called when an object is created?",
        listOf(
            "Destructor",
            "Constructor",
            "Virtual function",
            "Inline function"
        ),
        "Constructor",
        "A constructor initializes the object and is called automatically during object creation.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_018",
        categoryId,
        CPP_OOP,
        "Which function is automatically called when an object is destroyed?",
        listOf(
            "Constructor",
            "Destructor",
            "Delete",
            "Free"
        ),
        "Destructor",
        "Destructor releases resources and is called automatically when the object goes out of scope.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_019",
        categoryId,
        CPP_OOP,
        "Which keyword is used to prevent inheritance?",
        listOf("private", "protected", "final", "sealed"),
        "final",
        "The final keyword prevents further inheritance of a class.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_020",
        categoryId,
        CPP_OOP,
        "Which access specifier allows derived classes to access members?",
        listOf("private", "protected", "public", "default"),
        "protected",
        "Protected members are accessible within the class and its derived classes.",
        Difficulty.MEDIUM,
        createdAt
    ),

    // ---------- HARD ----------

    cppQuestion(
        "cpp_oops_021",
        categoryId,
        CPP_OOP,
        "Which OOP concept is also known as data hiding?",
        listOf(
            "Inheritance",
            "Encapsulation",
            "Polymorphism",
            "Overloading"
        ),
        "Encapsulation",
        "Encapsulation hides data by restricting direct access using access specifiers.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_022",
        categoryId,
        CPP_OOP,
        "Which binding happens at runtime?",
        listOf(
            "Static binding",
            "Compile-time binding",
            "Dynamic binding",
            "Early binding"
        ),
        "Dynamic binding",
        "Dynamic binding is resolved during program execution using virtual functions.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_023",
        categoryId,
        CPP_OOP,
        "Which feature improves program security?",
        listOf(
            "Inheritance",
            "Polymorphism",
            "Encapsulation",
            "Overloading"
        ),
        "Encapsulation",
        "Encapsulation restricts access to sensitive data, improving security.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_024",
        categoryId,
        CPP_OOP,
        "Which function cannot be virtual?",
        listOf(
            "Destructor",
            "Constructor",
            "Inline function",
            "Normal function"
        ),
        "Constructor",
        "Constructors cannot be virtual because they are called during object creation.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_025",
        categoryId,
        CPP_OOP,
        "What is multiple inheritance?",
        listOf(
            "One class inherits one class",
            "One class inherits multiple classes",
            "Multiple objects of same class",
            "Multiple functions in a class"
        ),
        "One class inherits multiple classes",
        "Multiple inheritance allows a class to inherit features from more than one base class.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_026",
        categoryId,
        CPP_OOP,
        "Which problem occurs in multiple inheritance?",
        listOf(
            "Runtime error",
            "Syntax error",
            "Diamond problem",
            "Memory leak"
        ),
        "Diamond problem",
        "Diamond problem occurs when multiple inheritance creates ambiguity in data members.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_027",
        categoryId,
        CPP_OOP,
        "Which keyword solves diamond problem?",
        listOf("static", "inline", "virtual", "const"),
        "virtual",
        "Virtual inheritance prevents duplication of base class data.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_028",
        categoryId,
        CPP_OOP,
        "Which OOP feature increases program flexibility?",
        listOf(
            "Encapsulation",
            "Inheritance",
            "Polymorphism",
            "Abstraction"
        ),
        "Polymorphism",
        "Polymorphism allows the same interface to behave differently, increasing flexibility.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_029",
        categoryId,
        CPP_OOP,
        "Which OOP concept reduces code duplication?",
        listOf(
            "Encapsulation",
            "Inheritance",
            "Polymorphism",
            "Abstraction"
        ),
        "Inheritance",
        "Inheritance avoids rewriting code by reusing existing class functionality.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_oops_030",
        categoryId,
        CPP_OOP,
        "Which OOP concept focuses on what an object does rather than how?",
        listOf(
            "Encapsulation",
            "Inheritance",
            "Abstraction",
            "Polymorphism"
        ),
        "Abstraction",
        "Abstraction focuses on essential features and hides internal implementation details.",
        Difficulty.HARD,
        createdAt
    ),


    // -------------------------------------------------6️⃣ CONSTRUCTORS -------------------------------------------

            // ---------- EASY ----------

            cppQuestion(
                "cpp_ctor_001",
                categoryId,
                CPP_CONSTRUCTORS,
                "What is a constructor in C++?",
                listOf(
                    "A function used to delete objects",
                    "A special function used to initialize objects",
                    "A loop inside a class",
                    "A data type"
                ),
                "A special function used to initialize objects",
                "A constructor is a special member function that initializes an object when it is created. It has the same name as the class.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_ctor_002",
        categoryId,
        CPP_CONSTRUCTORS,
        "When is a constructor called?",
        listOf(
            "When the program ends",
            "When an object is created",
            "When a function is called",
            "When memory is freed"
        ),
        "When an object is created",
        "A constructor is automatically called when an object of the class is created.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_003",
        categoryId,
        CPP_CONSTRUCTORS,
        "What is the name of a constructor?",
        listOf(
            "Any valid name",
            "Same as class name",
            "Different from class name",
            "main"
        ),
        "Same as class name",
        "In C++, a constructor must have the same name as its class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_004",
        categoryId,
        CPP_CONSTRUCTORS,
        "Does a constructor have a return type?",
        listOf(
            "Yes, int",
            "Yes, void",
            "No",
            "Depends on class"
        ),
        "No",
        "Constructors do not have any return type, not even void.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_005",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which access specifier is commonly used for constructors?",
        listOf("private", "protected", "public", "static"),
        "public",
        "Constructors are usually declared public so objects can be created outside the class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_006",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which constructor takes no arguments?",
        listOf(
            "Parameterized constructor",
            "Default constructor",
            "Copy constructor",
            "Virtual constructor"
        ),
        "Default constructor",
        "A default constructor does not take any parameters.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_007",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which constructor takes parameters?",
        listOf(
            "Default constructor",
            "Copy constructor",
            "Parameterized constructor",
            "Static constructor"
        ),
        "Parameterized constructor",
        "Parameterized constructors accept arguments to initialize data members.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_008",
        categoryId,
        CPP_CONSTRUCTORS,
        "Can a class have multiple constructors?",
        listOf("No", "Yes", "Only one", "Only two"),
        "Yes",
        "C++ allows constructor overloading, so a class can have multiple constructors.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_009",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which concept allows multiple constructors?",
        listOf(
            "Inheritance",
            "Polymorphism",
            "Constructor overloading",
            "Encapsulation"
        ),
        "Constructor overloading",
        "Constructor overloading allows multiple constructors with different parameters.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_010",
        categoryId,
        CPP_CONSTRUCTORS,
        "What happens if no constructor is defined?",
        listOf(
            "Program fails",
            "Compiler creates a default constructor",
            "Object cannot be created",
            "Runtime error occurs"
        ),
        "Compiler creates a default constructor",
        "If no constructor is defined, the compiler provides a default constructor automatically.",
        Difficulty.EASY,
        createdAt
    ),

    // ---------- MEDIUM ----------

    cppQuestion(
        "cpp_ctor_011",
        categoryId,
        CPP_CONSTRUCTORS,
        "What is a copy constructor?",
        listOf(
            "Constructor with parameters",
            "Constructor that copies one object to another",
            "Constructor with no arguments",
            "Constructor that deletes objects"
        ),
        "Constructor that copies one object to another",
        "A copy constructor initializes an object using another object of the same class.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_012",
        categoryId,
        CPP_CONSTRUCTORS,
        "When is a copy constructor called?",
        listOf(
            "When object is destroyed",
            "When object is passed by value",
            "When memory is freed",
            "When class is inherited"
        ),
        "When object is passed by value",
        "Copy constructor is called when an object is passed by value or copied.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_013",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which syntax is correct for a copy constructor?",
        listOf(
            "ClassName(ClassName obj)",
            "ClassName(ClassName &obj)",
            "ClassName(obj)",
            "ClassName(int obj)"
        ),
        "ClassName(ClassName &obj)",
        "Copy constructor takes a reference to an object of the same class.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_014",
        categoryId,
        CPP_CONSTRUCTORS,
        "What is constructor overloading?",
        listOf(
            "Using constructor inside loop",
            "Using multiple constructors with same name",
            "Using constructor in inheritance",
            "Using destructor multiple times"
        ),
        "Using multiple constructors with same name",
        "Constructor overloading means defining multiple constructors with different parameters.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_015",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which constructor is best for initializing values?",
        listOf(
            "Default constructor",
            "Parameterized constructor",
            "Copy constructor",
            "Virtual constructor"
        ),
        "Parameterized constructor",
        "Parameterized constructors allow values to be passed during object creation.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_016",
        categoryId,
        CPP_CONSTRUCTORS,
        "Can constructors be overloaded?",
        listOf("No", "Yes", "Only once", "Only in inheritance"),
        "Yes",
        "C++ supports constructor overloading using different parameter lists.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_017",
        categoryId,
        CPP_CONSTRUCTORS,
        "Can a constructor be private?",
        listOf("No", "Yes", "Only default", "Only copy"),
        "Yes",
        "Private constructors are used in singleton design pattern.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_018",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which operator is used to call a constructor?",
        listOf(
            "new",
            "create",
            "malloc",
            "alloc"
        ),
        "new",
        "The new keyword allocates memory and calls the constructor.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_019",
        categoryId,
        CPP_CONSTRUCTORS,
        "Can constructors be inherited?",
        listOf("Yes", "No", "Sometimes", "Only public"),
        "No",
        "Constructors are not inherited, but base class constructors can be called.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_020",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which constructor runs first in inheritance?",
        listOf(
            "Derived class constructor",
            "Base class constructor",
            "Both together",
            "Randomly"
        ),
        "Base class constructor",
        "Base class constructor executes before derived class constructor.",
        Difficulty.MEDIUM,
        createdAt
    ),

    // ---------- HARD ----------

    cppQuestion(
        "cpp_ctor_021",
        categoryId,
        CPP_CONSTRUCTORS,
        "Can a constructor be virtual?",
        listOf("Yes", "No", "Only default", "Only copy"),
        "No",
        "Constructors cannot be virtual because object creation happens before virtual dispatch.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_022",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which constructor is used when returning an object from a function?",
        listOf(
            "Default constructor",
            "Copy constructor",
            "Destructor",
            "Virtual constructor"
        ),
        "Copy constructor",
        "Copy constructor is used when objects are returned by value.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_023",
        categoryId,
        CPP_CONSTRUCTORS,
        "What is constructor delegation?",
        listOf(
            "Calling one constructor from another",
            "Calling destructor from constructor",
            "Calling constructor from main",
            "Calling constructor in loop"
        ),
        "Calling one constructor from another",
        "Constructor delegation allows one constructor to call another within the same class.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_024",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which C++11 feature allows constructor delegation?",
        listOf(
            "Lambda",
            "Delegating constructors",
            "Smart pointers",
            "Auto keyword"
        ),
        "Delegating constructors",
        "C++11 introduced delegating constructors for cleaner initialization.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_025",
        categoryId,
        CPP_CONSTRUCTORS,
        "What happens if copy constructor is deleted?",
        listOf(
            "Program crashes",
            "Object cannot be copied",
            "Object cannot be created",
            "Destructor fails"
        ),
        "Object cannot be copied",
        "Deleting copy constructor prevents copying of objects.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_026",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which keyword disables a constructor?",
        listOf("delete", "remove", "disable", "stop"),
        "delete",
        "The delete keyword explicitly disables a constructor.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_027",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which constructor is called in object initialization using assignment?",
        listOf(
            "Default constructor",
            "Copy constructor",
            "Parameterized constructor",
            "Destructor"
        ),
        "Copy constructor",
        "Assignment initialization invokes the copy constructor.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_028",
        categoryId,
        CPP_CONSTRUCTORS,
        "What is the purpose of initializer list?",
        listOf(
            "Initialize variables efficiently",
            "Create loops",
            "Delete memory",
            "Handle exceptions"
        ),
        "Initialize variables efficiently",
        "Initializer lists are used for faster and safer initialization of data members.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_029",
        categoryId,
        CPP_CONSTRUCTORS,
        "Which members must be initialized using initializer list?",
        listOf(
            "Static members",
            "Const members",
            "Normal variables",
            "Functions"
        ),
        "Const members",
        "Const and reference members must be initialized using initializer list.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_ctor_030",
        categoryId,
        CPP_CONSTRUCTORS,
        "What is the main purpose of a constructor?",
        listOf(
            "Free memory",
            "Initialize objects",
            "Call functions",
            "Create loops"
        ),
        "Initialize objects",
        "Constructors prepare objects by initializing their data members.",
        Difficulty.HARD,
        createdAt
    ),


    // -------------------------------------------------7️⃣ INHERITANCE --------------------------------------------------




            cppQuestion(
                "cpp_inheritance_001",
                categoryId,
                CPP_INHERITANCE,
                "What is inheritance in C++?",
                listOf(
                    "Deriving a new class from an existing class",
                    "Creating multiple objects",
                    "Hiding data",
                    "Overloading functions"
                ),
                "Deriving a new class from an existing class",
                "Inheritance allows a new class to acquire properties and behaviors of an existing class, promoting code reuse.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_inheritance_002",
        categoryId,
        CPP_INHERITANCE,
        "Which class is inherited by another class?",
        listOf("Base class", "Derived class", "Child class", "Object class"),
        "Base class",
        "The base class is the existing class whose properties are inherited by another class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_003",
        categoryId,
        CPP_INHERITANCE,
        "Which keyword is used to inherit a class in C++?",
        listOf("extends", "inherits", ":", "implements"),
        ":",
        "The colon (:) symbol is used to inherit a base class in C++.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_004",
        categoryId,
        CPP_INHERITANCE,
        "Which class inherits properties from a base class?",
        listOf("Derived class", "Base class", "Parent class", "Main class"),
        "Derived class",
        "The derived class gets properties and functions from the base class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_005",
        categoryId,
        CPP_INHERITANCE,
        "Which access specifier allows members to be inherited but not accessed outside?",
        listOf("private", "protected", "public", "default"),
        "protected",
        "Protected members are accessible in derived classes but not outside the class hierarchy.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_006",
        categoryId,
        CPP_INHERITANCE,
        "Which type of inheritance has one base class and one derived class?",
        listOf("Single inheritance", "Multiple inheritance", "Multilevel inheritance", "Hybrid inheritance"),
        "Single inheritance",
        "Single inheritance involves one base class and one derived class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_007",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance allows a class to inherit from multiple classes?",
        listOf("Multilevel inheritance", "Single inheritance", "Multiple inheritance", "Hierarchical inheritance"),
        "Multiple inheritance",
        "Multiple inheritance allows a derived class to inherit from more than one base class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_008",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance forms a chain of classes?",
        listOf("Multiple", "Multilevel", "Hierarchical", "Hybrid"),
        "Multilevel",
        "Multilevel inheritance forms a chain where one class inherits from another derived class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_009",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance has one base class and multiple derived classes?",
        listOf("Multiple", "Hierarchical", "Multilevel", "Hybrid"),
        "Hierarchical",
        "Hierarchical inheritance allows many derived classes to inherit from a single base class.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_010",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance is a combination of two or more types?",
        listOf("Multiple", "Multilevel", "Hybrid", "Single"),
        "Hybrid",
        "Hybrid inheritance combines more than one type of inheritance.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_011",
        categoryId,
        CPP_INHERITANCE,
        "Can private members of a base class be inherited?",
        listOf("Yes", "No", "Only with friend", "Only using protected"),
        "No",
        "Private members of a base class are not accessible directly in derived classes.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_012",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance can cause ambiguity problems?",
        listOf("Single", "Multilevel", "Multiple", "Hierarchical"),
        "Multiple",
        "Multiple inheritance can cause ambiguity when two base classes have the same member names.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_013",
        categoryId,
        CPP_INHERITANCE,
        "Which keyword resolves ambiguity in multiple inheritance?",
        listOf("virtual", "override", "scope resolution", "friend"),
        "scope resolution",
        "Scope resolution operator helps specify which base class member to use.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_014",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance uses the virtual keyword?",
        listOf("Multiple", "Virtual", "Hybrid", "Multilevel"),
        "Virtual",
        "Virtual inheritance prevents duplication of base class members in diamond inheritance.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_015",
        categoryId,
        CPP_INHERITANCE,
        "What problem does virtual inheritance solve?",
        listOf(
            "Runtime error",
            "Diamond problem",
            "Syntax error",
            "Memory leak"
        ),
        "Diamond problem",
        "Virtual inheritance avoids duplicate copies of a base class in multiple inheritance.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_016",
        categoryId,
        CPP_INHERITANCE,
        "Which operator is used to access base class members explicitly?",
        listOf("::", ".", "->", ":"),
        "::",
        "The scope resolution operator is used to access base class members explicitly.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_017",
        categoryId,
        CPP_INHERITANCE,
        "Can constructors be inherited in C++?",
        listOf("Yes", "No", "Only copy constructors", "Only default constructors"),
        "No",
        "Constructors are not inherited, but base class constructors are called automatically.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_018",
        categoryId,
        CPP_INHERITANCE,
        "Which constructor is called first in inheritance?",
        listOf("Derived class", "Base class", "Both simultaneously", "Random"),
        "Base class",
        "The base class constructor is always executed before the derived class constructor.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_019",
        categoryId,
        CPP_INHERITANCE,
        "Which destructor is called first?",
        listOf("Base class", "Derived class", "Both together", "Depends on compiler"),
        "Derived class",
        "The derived class destructor executes first, followed by the base class destructor.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_020",
        categoryId,
        CPP_INHERITANCE,
        "What happens if inheritance is declared private?",
        listOf(
            "Public members become private",
            "Protected members become public",
            "Private members become protected",
            "No inheritance occurs"
        ),
        "Public members become private",
        "Private inheritance makes public and protected members of base class private in derived class.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_021",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance is most flexible?",
        listOf("Single", "Multiple", "Hybrid", "Hierarchical"),
        "Hybrid",
        "Hybrid inheritance provides flexibility by combining different inheritance types.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_022",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance improves code reusability the most?",
        listOf("Single", "Multiple", "Any inheritance", "None"),
        "Any inheritance",
        "All inheritance types help reuse code by sharing common functionality.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_023",
        categoryId,
        CPP_INHERITANCE,
        "Which access specifier is best for inheritance?",
        listOf("private", "protected", "public", "default"),
        "protected",
        "Protected access allows derived classes to use members while hiding them from outside code.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_024",
        categoryId,
        CPP_INHERITANCE,
        "Can a derived class access base class private members?",
        listOf("Yes", "No", "Only using virtual", "Only using protected"),
        "No",
        "Private members are not accessible directly in derived classes.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_025",
        categoryId,
        CPP_INHERITANCE,
        "Which concept works closely with inheritance?",
        listOf("Encapsulation", "Polymorphism", "Abstraction", "All of the above"),
        "All of the above",
        "Inheritance works together with other OOP concepts to build structured programs.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_026",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance can increase complexity?",
        listOf("Single", "Multiple", "Multilevel", "Hierarchical"),
        "Multiple",
        "Multiple inheritance can increase complexity due to ambiguity and maintenance issues.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_027",
        categoryId,
        CPP_INHERITANCE,
        "Is inheritance compulsory in C++ OOP?",
        listOf("Yes", "No", "Only for large programs", "Only for classes"),
        "No",
        "Inheritance is optional and should be used only when it fits the design.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_028",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance supports runtime polymorphism?",
        listOf("Single", "Multiple", "Any inheritance", "No inheritance"),
        "Any inheritance",
        "Runtime polymorphism can be achieved using inheritance with virtual functions.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_029",
        categoryId,
        CPP_INHERITANCE,
        "Which inheritance creates a tree-like structure?",
        listOf("Hierarchical", "Multiple", "Hybrid", "Single"),
        "Hierarchical",
        "Hierarchical inheritance forms a tree structure with one base class and many derived classes.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_inheritance_030",
        categoryId,
        CPP_INHERITANCE,
        "What is the main advantage of inheritance?",
        listOf(
            "Faster execution",
            "Code reuse",
            "Less memory usage",
            "Better syntax"
        ),
        "Code reuse",
        "Inheritance helps reuse existing code, reducing duplication and improving maintainability.",
        Difficulty.HARD,
        createdAt
    ),


    // --------------------------------------------------------8️⃣ POLYMORPHISM ------------------------------------------

            cppQuestion(
                "cpp_poly_001",
                categoryId,
                CPP_POLYMORPHISM,
                "What is polymorphism in C++?",
                listOf(
                    "Ability of a function to take many forms",
                    "Ability to hide data",
                    "Ability to inherit classes",
                    "Ability to overload operators"
                ),
                "Ability of a function to take many forms",
                "Polymorphism allows the same function or operator to behave differently based on context.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_poly_002",
        categoryId,
        CPP_POLYMORPHISM,
        "Which concept is closely related to polymorphism?",
        listOf("Encapsulation", "Inheritance", "Abstraction", "All of the above"),
        "Inheritance",
        "Polymorphism mainly works with inheritance where derived classes redefine base class behavior.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_003",
        categoryId,
        CPP_POLYMORPHISM,
        "Which type of polymorphism is resolved at compile time?",
        listOf("Runtime polymorphism", "Dynamic polymorphism", "Compile-time polymorphism", "Late binding"),
        "Compile-time polymorphism",
        "Compile-time polymorphism is resolved during compilation using function overloading or operator overloading.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_004",
        categoryId,
        CPP_POLYMORPHISM,
        "Which feature supports compile-time polymorphism?",
        listOf("Function overloading", "Virtual functions", "Inheritance", "Pointers"),
        "Function overloading",
        "Function overloading allows multiple functions with the same name but different parameters.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_005",
        categoryId,
        CPP_POLYMORPHISM,
        "Which operator supports polymorphism in C++?",
        listOf("sizeof", "+", "::", "->"),
        "+",
        "Operators like + can behave differently depending on the data types used.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_006",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism is achieved using virtual functions?",
        listOf("Compile-time", "Static", "Runtime", "Early binding"),
        "Runtime",
        "Virtual functions enable runtime polymorphism using dynamic binding.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_007",
        categoryId,
        CPP_POLYMORPHISM,
        "Which keyword is used to achieve runtime polymorphism?",
        listOf("virtual", "static", "inline", "friend"),
        "virtual",
        "The virtual keyword ensures the correct function is called at runtime.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_008",
        categoryId,
        CPP_POLYMORPHISM,
        "Which binding occurs in runtime polymorphism?",
        listOf("Static binding", "Early binding", "Dynamic binding", "Compile-time binding"),
        "Dynamic binding",
        "Dynamic binding links function calls with definitions at runtime.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_009",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism improves code flexibility?",
        listOf("Compile-time", "Runtime", "Static", "None"),
        "Runtime",
        "Runtime polymorphism allows behavior to change dynamically based on object type.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_010",
        categoryId,
        CPP_POLYMORPHISM,
        "Which function call depends on object type at runtime?",
        listOf("Normal function", "Inline function", "Virtual function", "Static function"),
        "Virtual function",
        "Virtual functions ensure correct function execution based on the object type.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_011",
        categoryId,
        CPP_POLYMORPHISM,
        "Function overloading is an example of which polymorphism?",
        listOf("Runtime", "Dynamic", "Compile-time", "Late binding"),
        "Compile-time",
        "The compiler decides which function to call during compilation.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_012",
        categoryId,
        CPP_POLYMORPHISM,
        "Operator overloading belongs to which polymorphism?",
        listOf("Runtime", "Compile-time", "Dynamic", "Virtual"),
        "Compile-time",
        "Operator overloading is resolved during compilation.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_013",
        categoryId,
        CPP_POLYMORPHISM,
        "Which pointer is commonly used with runtime polymorphism?",
        listOf("Derived class pointer", "Base class pointer", "Void pointer", "Function pointer"),
        "Base class pointer",
        "Base class pointers can point to derived class objects to achieve polymorphism.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_014",
        categoryId,
        CPP_POLYMORPHISM,
        "Which keyword prevents function overriding?",
        listOf("final", "static", "const", "inline"),
        "final",
        "The final keyword stops a virtual function from being overridden.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_015",
        categoryId,
        CPP_POLYMORPHISM,
        "Which function cannot be virtual?",
        listOf("Constructor", "Destructor", "Member function", "Base function"),
        "Constructor",
        "Constructors cannot be virtual because they are called during object creation.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_016",
        categoryId,
        CPP_POLYMORPHISM,
        "Which function is usually declared virtual?",
        listOf("Main function", "Destructor", "Inline function", "Static function"),
        "Destructor",
        "Virtual destructors ensure proper cleanup of derived class objects.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_017",
        categoryId,
        CPP_POLYMORPHISM,
        "What happens if a base class function is not virtual?",
        listOf(
            "Derived function is ignored",
            "Base function is called",
            "Compilation error",
            "Runtime error"
        ),
        "Base function is called",
        "Without virtual keyword, function calls are resolved at compile time.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_018",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism is faster?",
        listOf("Runtime", "Compile-time", "Dynamic", "Virtual"),
        "Compile-time",
        "Compile-time polymorphism is faster because it avoids runtime overhead.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_019",
        categoryId,
        CPP_POLYMORPHISM,
        "Which concept allows same interface with different implementation?",
        listOf("Inheritance", "Polymorphism", "Encapsulation", "Abstraction"),
        "Polymorphism",
        "Polymorphism allows the same function name to behave differently.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_020",
        categoryId,
        CPP_POLYMORPHISM,
        "Which table is used internally for virtual functions?",
        listOf("Function table", "Virtual table", "Pointer table", "Class table"),
        "Virtual table",
        "The virtual table (vtable) stores addresses of virtual functions.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_021",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism increases runtime flexibility?",
        listOf("Compile-time", "Static", "Runtime", "Early binding"),
        "Runtime",
        "Runtime polymorphism allows decisions to be made during program execution.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_022",
        categoryId,
        CPP_POLYMORPHISM,
        "Which function call is resolved at runtime?",
        listOf("Inline function", "Virtual function", "Overloaded function", "Static function"),
        "Virtual function",
        "Virtual function calls are resolved using dynamic binding.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_023",
        categoryId,
        CPP_POLYMORPHISM,
        "Which keyword is mandatory for runtime polymorphism?",
        listOf("virtual", "override", "final", "inline"),
        "virtual",
        "The virtual keyword enables runtime method dispatch.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_024",
        categoryId,
        CPP_POLYMORPHISM,
        "What is early binding?",
        listOf(
            "Binding at runtime",
            "Binding at compile time",
            "Binding using virtual table",
            "Binding using pointers"
        ),
        "Binding at compile time",
        "Early binding resolves function calls during compilation.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_025",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism uses function signatures?",
        listOf("Runtime", "Compile-time", "Dynamic", "Virtual"),
        "Compile-time",
        "Function signatures decide which overloaded function is called.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_026",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism reduces code duplication?",
        listOf("Compile-time", "Runtime", "Both", "None"),
        "Both",
        "Both types help reuse function names and logic efficiently.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_027",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism is more memory efficient?",
        listOf("Runtime", "Compile-time", "Dynamic", "Virtual"),
        "Compile-time",
        "Compile-time polymorphism avoids extra memory used by vtables.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_028",
        categoryId,
        CPP_POLYMORPHISM,
        "Which polymorphism uses base class reference?",
        listOf("Compile-time", "Runtime", "Static", "Inline"),
        "Runtime",
        "Runtime polymorphism works using base class references or pointers.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_029",
        categoryId,
        CPP_POLYMORPHISM,
        "Which is NOT a type of polymorphism?",
        listOf("Compile-time", "Runtime", "Dynamic", "Hierarchical"),
        "Hierarchical",
        "Hierarchical is a type of inheritance, not polymorphism.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_poly_030",
        categoryId,
        CPP_POLYMORPHISM,
        "What is the main benefit of polymorphism?",
        listOf(
            "Faster execution",
            "Better memory usage",
            "Code flexibility and scalability",
            "Simpler syntax"
        ),
        "Code flexibility and scalability",
        "Polymorphism makes programs flexible, extensible, and easier to maintain.",
        Difficulty.HARD,
        createdAt
    ),


    // --------------------------------------------------------9️⃣ TEMPLATES ----------------------------------------

            cppQuestion(
                "cpp_template_001",
                categoryId,
                CPP_TEMPLATES,
                "What is a template in C++?",
                listOf(
                    "A function that runs at runtime",
                    "A blueprint for creating functions or classes",
                    "A data type",
                    "A header file"
                ),
                "A blueprint for creating functions or classes",
                "Templates allow writing generic code that works with different data types.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_template_002",
        categoryId,
        CPP_TEMPLATES,
        "Which keyword is used to define a template in C++?",
        listOf("template", "typename", "generic", "define"),
        "template",
        "The template keyword is used to declare function or class templates.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_003",
        categoryId,
        CPP_TEMPLATES,
        "Templates help in achieving which concept?",
        listOf("Encapsulation", "Polymorphism", "Generic programming", "Inheritance"),
        "Generic programming",
        "Templates allow writing type-independent code, known as generic programming.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_004",
        categoryId,
        CPP_TEMPLATES,
        "Which symbol is used to pass template parameters?",
        listOf("< >", "( )", "{ }", "[ ]"),
        "< >",
        "Angle brackets < > are used to specify template parameters.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_005",
        categoryId,
        CPP_TEMPLATES,
        "What is a function template?",
        listOf(
            "A function with no return type",
            "A function that works with one data type",
            "A function that works with multiple data types",
            "A recursive function"
        ),
        "A function that works with multiple data types",
        "Function templates allow the same function logic to work with different data types.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_006",
        categoryId,
        CPP_TEMPLATES,
        "Which keyword can be used instead of class in templates?",
        listOf("typename", "struct", "object", "var"),
        "typename",
        "typename and class are interchangeable when declaring template parameters.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_007",
        categoryId,
        CPP_TEMPLATES,
        "Templates are expanded at which time?",
        listOf("Runtime", "Compile time", "Link time", "Execution time"),
        "Compile time",
        "Templates are processed by the compiler during compilation.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_008",
        categoryId,
        CPP_TEMPLATES,
        "Which template is used to create generic classes?",
        listOf("Function template", "Class template", "Inline template", "Static template"),
        "Class template",
        "Class templates allow classes to work with different data types.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_009",
        categoryId,
        CPP_TEMPLATES,
        "Which header heavily uses templates?",
        listOf("<iostream>", "<vector>", "<stdio.h>", "<string.h>"),
        "<vector>",
        "STL containers like vector are implemented using templates.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_010",
        categoryId,
        CPP_TEMPLATES,
        "Templates reduce which problem?",
        listOf("Runtime errors", "Code duplication", "Syntax errors", "Memory leaks"),
        "Code duplication",
        "Templates avoid writing the same code again for different data types.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_template_011",
        categoryId,
        CPP_TEMPLATES,
        "Which is a correct template declaration?",
        listOf(
            "template <class T>",
            "template (T)",
            "template [T]",
            "template {T}"
        ),
        "template <class T>",
        "This syntax declares a template with a generic type T.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_012",
        categoryId,
        CPP_TEMPLATES,
        "Templates support which type of polymorphism?",
        listOf("Runtime", "Dynamic", "Compile-time", "Late binding"),
        "Compile-time",
        "Templates achieve polymorphism during compilation.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_013",
        categoryId,
        CPP_TEMPLATES,
        "What happens if template type is not specified explicitly?",
        listOf(
            "Compilation fails",
            "Compiler deduces type automatically",
            "Runtime error occurs",
            "Program crashes"
        ),
        "Compiler deduces type automatically",
        "C++ can automatically determine the data type from arguments.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_014",
        categoryId,
        CPP_TEMPLATES,
        "Which STL concept is based on templates?",
        listOf("Pointers", "Containers", "Loops", "Recursion"),
        "Containers",
        "STL containers like vector, map, and set use templates internally.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_015",
        categoryId,
        CPP_TEMPLATES,
        "Can templates be overloaded?",
        listOf("Yes", "No", "Only functions", "Only classes"),
        "Yes",
        "Both function templates and class templates can be overloaded.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_016",
        categoryId,
        CPP_TEMPLATES,
        "Which error is common with templates?",
        listOf("Syntax error", "Linker error", "Complex compile-time error", "Runtime error"),
        "Complex compile-time error",
        "Template errors are often long and complex during compilation.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_017",
        categoryId,
        CPP_TEMPLATES,
        "Templates increase which aspect of code?",
        listOf("Size", "Reusability", "Execution time", "Memory usage"),
        "Reusability",
        "Templates allow writing reusable and flexible code.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_018",
        categoryId,
        CPP_TEMPLATES,
        "Which keyword prevents template specialization?",
        listOf("final", "const", "static", "virtual"),
        "final",
        "final prevents further specialization or overriding in templates.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_019",
        categoryId,
        CPP_TEMPLATES,
        "Template specialization means?",
        listOf(
            "General template definition",
            "Custom behavior for specific data type",
            "Runtime binding",
            "Function overriding"
        ),
        "Custom behavior for specific data type",
        "Specialization allows changing behavior for a particular type.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_020",
        categoryId,
        CPP_TEMPLATES,
        "Which symbol is used for template specialization?",
        listOf("< >", "::", "*", "&"),
        "< >",
        "Angle brackets are used again to specify specialized types.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_template_021",
        categoryId,
        CPP_TEMPLATES,
        "Templates increase which compilation cost?",
        listOf("Runtime", "Memory", "Compile time", "Execution speed"),
        "Compile time",
        "Templates may increase compilation time due to code generation.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_022",
        categoryId,
        CPP_TEMPLATES,
        "Which template allows multiple data types?",
        listOf(
            "Single parameter template",
            "Multiple parameter template",
            "Static template",
            "Inline template"
        ),
        "Multiple parameter template",
        "Templates can accept more than one type parameter.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_023",
        categoryId,
        CPP_TEMPLATES,
        "Which STL algorithm uses templates?",
        listOf("sort()", "main()", "printf()", "scanf()"),
        "sort()",
        "STL algorithms are implemented using templates to work with various types.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_024",
        categoryId,
        CPP_TEMPLATES,
        "Which feature makes templates type-safe?",
        listOf("Compiler checking", "Runtime checking", "Manual checking", "Casting"),
        "Compiler checking",
        "The compiler ensures correct data types during compilation.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_025",
        categoryId,
        CPP_TEMPLATES,
        "Templates are mainly used in which library?",
        listOf("STL", "stdio", "math", "string"),
        "STL",
        "The Standard Template Library is built completely using templates.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_026",
        categoryId,
        CPP_TEMPLATES,
        "Which template increases binary size?",
        listOf("Inline template", "Multiple instantiations", "Virtual template", "Static template"),
        "Multiple instantiations",
        "Each type instantiation generates separate code, increasing size.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_027",
        categoryId,
        CPP_TEMPLATES,
        "Which polymorphism do templates support?",
        listOf("Runtime", "Dynamic", "Compile-time", "Late"),
        "Compile-time",
        "Templates are resolved entirely during compilation.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_028",
        categoryId,
        CPP_TEMPLATES,
        "Which keyword defines template parameter?",
        listOf("class", "typename", "Both A and B", "None"),
        "Both A and B",
        "Both class and typename can be used for template parameters.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_029",
        categoryId,
        CPP_TEMPLATES,
        "Templates help avoid which practice?",
        listOf("Overloading", "Inheritance", "Code repetition", "Encapsulation"),
        "Code repetition",
        "Templates prevent rewriting similar logic for different data types.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_template_030",
        categoryId,
        CPP_TEMPLATES,
        "What is the biggest advantage of templates?",
        listOf(
            "Faster runtime",
            "Less memory",
            "Generic and reusable code",
            "Simple syntax"
        ),
        "Generic and reusable code",
        "Templates allow writing flexible, reusable, and type-safe generic code.",
        Difficulty.HARD,
        createdAt
    ),


    // --------------------------------------------------------------🔟 STL --------------------------------------------

            cppQuestion(
                "cpp_stl_001",
                categoryId,
                CPP_STL,
                "What does STL stand for in C++?",
                listOf(
                    "Standard Type Library",
                    "System Template Library",
                    "Standard Template Library",
                    "Structured Template Language"
                ),
                "Standard Template Library",
                "STL is a powerful library in C++ that provides ready-made data structures and algorithms.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_stl_002",
        categoryId,
        CPP_STL,
        "Which STL component stores data?",
        listOf("Algorithms", "Iterators", "Containers", "Functors"),
        "Containers",
        "Containers are used to store and manage collections of data.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_003",
        categoryId,
        CPP_STL,
        "Which STL container allows duplicate values?",
        listOf("set", "map", "vector", "unordered_set"),
        "vector",
        "vector allows duplicate elements and maintains insertion order.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_004",
        categoryId,
        CPP_STL,
        "Which container stores elements in contiguous memory?",
        listOf("vector", "list", "set", "map"),
        "vector",
        "vector stores elements in contiguous memory, allowing fast access using index.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_005",
        categoryId,
        CPP_STL,
        "Which STL container is a dynamic array?",
        listOf("array", "vector", "deque", "list"),
        "vector",
        "vector behaves like a dynamic array that can grow or shrink in size.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_006",
        categoryId,
        CPP_STL,
        "Which header file is required for vector?",
        listOf("<vector>", "<array>", "<list>", "<map>"),
        "<vector>",
        "The <vector> header file provides the vector container.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_007",
        categoryId,
        CPP_STL,
        "Which STL container does NOT allow duplicate elements?",
        listOf("vector", "list", "set", "deque"),
        "set",
        "set stores unique elements only and automatically sorts them.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_008",
        categoryId,
        CPP_STL,
        "Which STL container stores key-value pairs?",
        listOf("vector", "list", "map", "stack"),
        "map",
        "map stores elements as key-value pairs with unique keys.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_009",
        categoryId,
        CPP_STL,
        "Which container works on LIFO principle?",
        listOf("queue", "stack", "deque", "vector"),
        "stack",
        "Stack follows Last In First Out (LIFO) order.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_010",
        categoryId,
        CPP_STL,
        "Which container works on FIFO principle?",
        listOf("stack", "priority_queue", "queue", "set"),
        "queue",
        "Queue follows First In First Out (FIFO) order.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_011",
        categoryId,
        CPP_STL,
        "Which STL component connects containers and algorithms?",
        listOf("Containers", "Iterators", "Algorithms", "Functors"),
        "Iterators",
        "Iterators act like pointers and help access container elements.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_012",
        categoryId,
        CPP_STL,
        "Which algorithm is used to sort elements?",
        listOf("find()", "sort()", "count()", "merge()"),
        "sort()",
        "sort() arranges elements in ascending order by default.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_013",
        categoryId,
        CPP_STL,
        "Which STL container allows fast insertion at both ends?",
        listOf("vector", "list", "deque", "set"),
        "deque",
        "deque allows insertion and deletion from both front and back.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_014",
        categoryId,
        CPP_STL,
        "Which container is implemented using a doubly linked list?",
        listOf("vector", "list", "deque", "array"),
        "list",
        "list is implemented as a doubly linked list.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_015",
        categoryId,
        CPP_STL,
        "Which STL algorithm searches for an element?",
        listOf("find()", "sort()", "reverse()", "copy()"),
        "find()",
        "find() searches for a specific element in a range.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_016",
        categoryId,
        CPP_STL,
        "Which container provides fast key-based access?",
        listOf("vector", "map", "list", "deque"),
        "map",
        "map provides fast access using keys with balanced tree structure.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_017",
        categoryId,
        CPP_STL,
        "Which container does priority_queue belong to?",
        listOf("Sequence container", "Associative container", "Container adapter", "Iterator"),
        "Container adapter",
        "priority_queue is a container adapter built on other containers.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_018",
        categoryId,
        CPP_STL,
        "Which STL container allows random access?",
        listOf("list", "set", "vector", "map"),
        "vector",
        "vector allows accessing elements directly using index.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_019",
        categoryId,
        CPP_STL,
        "Which container stores elements in sorted order?",
        listOf("vector", "set", "deque", "stack"),
        "set",
        "set automatically stores elements in sorted order.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_020",
        categoryId,
        CPP_STL,
        "Which STL header is needed for algorithms?",
        listOf("<algorithm>", "<container>", "<iterator>", "<utility>"),
        "<algorithm>",
        "The <algorithm> header provides common algorithms like sort and find.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_021",
        categoryId,
        CPP_STL,
        "Which container has the fastest insertion in the middle?",
        listOf("vector", "deque", "list", "array"),
        "list",
        "list allows fast insertion anywhere because of linked list structure.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_022",
        categoryId,
        CPP_STL,
        "Which container adapter is based on FIFO?",
        listOf("stack", "queue", "priority_queue", "set"),
        "queue",
        "queue follows FIFO order and is a container adapter.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_023",
        categoryId,
        CPP_STL,
        "Which container uses hashing internally?",
        listOf("set", "map", "unordered_map", "vector"),
        "unordered_map",
        "unordered_map uses hash tables for fast access.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_024",
        categoryId,
        CPP_STL,
        "Which iterator moves only forward?",
        listOf("Input iterator", "Random iterator", "Bidirectional iterator", "Reverse iterator"),
        "Input iterator",
        "Input iterators can only move forward and read elements once.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_025",
        categoryId,
        CPP_STL,
        "Which container consumes more memory?",
        listOf("vector", "array", "list", "deque"),
        "list",
        "list uses extra memory due to pointers for each node.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_026",
        categoryId,
        CPP_STL,
        "Which algorithm reverses elements?",
        listOf("sort()", "reverse()", "rotate()", "copy()"),
        "reverse()",
        "reverse() changes the order of elements in a range.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_027",
        categoryId,
        CPP_STL,
        "Which STL container is best for frequent insertions and deletions?",
        listOf("vector", "array", "list", "map"),
        "list",
        "list handles frequent insertions and deletions efficiently.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_028",
        categoryId,
        CPP_STL,
        "Which container adapter uses heap internally?",
        listOf("stack", "queue", "priority_queue", "deque"),
        "priority_queue",
        "priority_queue uses heap structure to maintain priority order.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_029",
        categoryId,
        CPP_STL,
        "Which STL feature improves code reusability?",
        listOf("Macros", "Templates", "Pointers", "References"),
        "Templates",
        "STL is built using templates, making it generic and reusable.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_stl_030",
        categoryId,
        CPP_STL,
        "What is the biggest advantage of STL?",
        listOf(
            "Less syntax",
            "Faster runtime",
            "Reusable and efficient code",
            "Less memory usage"
        ),
        "Reusable and efficient code",
        "STL provides ready-made, optimized data structures and algorithms.",
        Difficulty.HARD,
        createdAt
    ),


    // -------------------------------------------------------1️⃣1️⃣ EXCEPTION ------------------------------------------

            cppQuestion(
                "cpp_exception_001",
                categoryId,
                CPP_EXCEPTION,
                "What is an exception in C++?",
                listOf(
                    "A syntax error",
                    "A runtime error",
                    "A logical error",
                    "A compilation error"
                ),
                "A runtime error",
                "An exception is an abnormal condition that occurs during program execution.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_exception_002",
        categoryId,
        CPP_EXCEPTION,
        "Which keyword is used to detect exceptions?",
        listOf("throw", "catch", "try", "exception"),
        "try",
        "The try block contains code that may generate an exception.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_003",
        categoryId,
        CPP_EXCEPTION,
        "Which keyword is used to handle exceptions?",
        listOf("throw", "try", "catch", "handle"),
        "catch",
        "The catch block handles the exception thrown in the try block.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_004",
        categoryId,
        CPP_EXCEPTION,
        "Which keyword is used to generate an exception?",
        listOf("throw", "try", "catch", "error"),
        "throw",
        "The throw keyword is used to explicitly generate an exception.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_005",
        categoryId,
        CPP_EXCEPTION,
        "Which block must follow a try block?",
        listOf("throw", "finally", "catch", "exit"),
        "catch",
        "A try block must be followed by one or more catch blocks.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_006",
        categoryId,
        CPP_EXCEPTION,
        "Which type of error can be handled using exceptions?",
        listOf("Compile-time error", "Syntax error", "Runtime error", "Logical error"),
        "Runtime error",
        "Exceptions are mainly used to handle runtime errors safely.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_007",
        categoryId,
        CPP_EXCEPTION,
        "Can multiple catch blocks be used with a single try?",
        listOf("Yes", "No", "Only two", "Only one"),
        "Yes",
        "Multiple catch blocks can handle different types of exceptions.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_008",
        categoryId,
        CPP_EXCEPTION,
        "Which catch block executes first?",
        listOf(
            "Any random one",
            "The last one",
            "The matching one",
            "All catch blocks"
        ),
        "The matching one",
        "The catch block whose type matches the exception executes.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_009",
        categoryId,
        CPP_EXCEPTION,
        "Which header file supports standard exceptions?",
        listOf("<exception>", "<iostream>", "<error>", "<stdexcept>"),
        "<exception>",
        "The <exception> header defines standard exception classes.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_010",
        categoryId,
        CPP_EXCEPTION,
        "What happens if an exception is not caught?",
        listOf(
            "Program continues",
            "Program terminates",
            "Compiler error",
            "Warning only"
        ),
        "Program terminates",
        "If an exception is uncaught, the program terminates abnormally.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_011",
        categoryId,
        CPP_EXCEPTION,
        "Which block is used to write risky code?",
        listOf("catch", "throw", "try", "finally"),
        "try",
        "The try block contains code that might cause an exception.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_012",
        categoryId,
        CPP_EXCEPTION,
        "Can exceptions be thrown from a function?",
        listOf("Yes", "No", "Only constructors", "Only destructors"),
        "Yes",
        "Functions can throw exceptions to signal errors to the caller.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_013",
        categoryId,
        CPP_EXCEPTION,
        "Which keyword rethrows an exception?",
        listOf("throw", "catch", "retry", "continue"),
        "throw",
        "Using throw without arguments rethrows the current exception.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_014",
        categoryId,
        CPP_EXCEPTION,
        "Which exception is thrown for division by zero?",
        listOf(
            "runtime_error",
            "logic_error",
            "undefined behavior",
            "No automatic exception"
        ),
        "No automatic exception",
        "C++ does not automatically throw an exception for division by zero.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_015",
        categoryId,
        CPP_EXCEPTION,
        "Which class is the base of all standard exceptions?",
        listOf("exception", "error", "runtime_error", "logic_error"),
        "exception",
        "The exception class is the base class for all standard exceptions.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_016",
        categoryId,
        CPP_EXCEPTION,
        "Which block is optional in exception handling?",
        listOf("try", "catch", "throw", "All are optional"),
        "throw",
        "Throw is optional because exceptions may occur automatically.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_017",
        categoryId,
        CPP_EXCEPTION,
        "Can a try block exist without catch?",
        listOf("Yes", "No", "Only in C++11", "Only with finally"),
        "No",
        "A try block must be followed by at least one catch block.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_018",
        categoryId,
        CPP_EXCEPTION,
        "Which keyword handles all exception types?",
        listOf(
            "catch()",
            "catch(all)",
            "catch(...)",
            "catch(*)"
        ),
        "catch(...)",
        "catch(...) is used to catch all types of exceptions.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_019",
        categoryId,
        CPP_EXCEPTION,
        "Which exception class represents logical errors?",
        listOf("runtime_error", "logic_error", "bad_alloc", "exception"),
        "logic_error",
        "logic_error represents errors in program logic.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_020",
        categoryId,
        CPP_EXCEPTION,
        "Which exception is thrown when memory allocation fails?",
        listOf("runtime_error", "logic_error", "bad_alloc", "bad_cast"),
        "bad_alloc",
        "bad_alloc is thrown when dynamic memory allocation fails.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_021",
        categoryId,
        CPP_EXCEPTION,
        "Exception handling improves which aspect?",
        listOf(
            "Program speed",
            "Program security",
            "Program reliability",
            "Program size"
        ),
        "Program reliability",
        "Exception handling makes programs more robust and reliable.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_022",
        categoryId,
        CPP_EXCEPTION,
        "Which exception occurs during dynamic casting failure?",
        listOf("bad_alloc", "bad_cast", "runtime_error", "logic_error"),
        "bad_cast",
        "bad_cast occurs when a dynamic_cast fails.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_023",
        categoryId,
        CPP_EXCEPTION,
        "Which block executes when an exception occurs?",
        listOf("try", "throw", "catch", "finally"),
        "catch",
        "The catch block executes when a matching exception is thrown.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_024",
        categoryId,
        CPP_EXCEPTION,
        "Which exception is related to runtime errors?",
        listOf("logic_error", "runtime_error", "compile_error", "syntax_error"),
        "runtime_error",
        "runtime_error represents errors detected during execution.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_025",
        categoryId,
        CPP_EXCEPTION,
        "What is stack unwinding?",
        listOf(
            "Clearing memory",
            "Destroying local objects",
            "Ending program",
            "Restarting execution"
        ),
        "Destroying local objects",
        "Stack unwinding destroys local objects when an exception is thrown.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_026",
        categoryId,
        CPP_EXCEPTION,
        "Which C++ feature works closely with destructors?",
        listOf("Inheritance", "Templates", "Exception handling", "Overloading"),
        "Exception handling",
        "Destructors are called during stack unwinding.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_027",
        categoryId,
        CPP_EXCEPTION,
        "Which exception class is used for invalid arguments?",
        listOf("invalid_argument", "logic_error", "runtime_error", "bad_alloc"),
        "invalid_argument",
        "invalid_argument indicates invalid parameters passed to functions.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_028",
        categoryId,
        CPP_EXCEPTION,
        "Which exception occurs if array index goes out of range?",
        listOf(
            "out_of_range",
            "runtime_error",
            "logic_error",
            "bad_alloc"
        ),
        "out_of_range",
        "out_of_range is thrown when accessing invalid container indexes.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_029",
        categoryId,
        CPP_EXCEPTION,
        "Which keyword stops exception propagation?",
        listOf("throw", "catch", "return", "break"),
        "catch",
        "The catch block handles the exception and stops further propagation.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_exception_030",
        categoryId,
        CPP_EXCEPTION,
        "What is the main purpose of exception handling?",
        listOf(
            "Improve performance",
            "Avoid runtime errors",
            "Handle runtime errors safely",
            "Reduce memory usage"
        ),
        "Handle runtime errors safely",
        "Exception handling allows safe recovery from runtime errors.",
        Difficulty.HARD,
        createdAt
    ),


    // ------------------------------------------------------------1️⃣2️⃣ FILE HANDLING --------------------------------------------

            cppQuestion(
                "cpp_file_001",
                categoryId,
                CPP_FILE,
                "Which header file is required for file handling in C++?",
                listOf("<file>", "<fstream>", "<iostream>", "<stdio.h>"),
                "<fstream>",
                "The <fstream> header file provides classes for reading and writing files in C++.",
                Difficulty.EASY,
                createdAt
            ),

    cppQuestion(
        "cpp_file_002",
        categoryId,
        CPP_FILE,
        "Which class is used to read data from a file?",
        listOf("ofstream", "ifstream", "fstream", "file"),
        "ifstream",
        "ifstream is used to open and read data from a file.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_003",
        categoryId,
        CPP_FILE,
        "Which class is used to write data into a file?",
        listOf("ifstream", "ostream", "ofstream", "fstream"),
        "ofstream",
        "ofstream is used to create and write data to a file.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_004",
        categoryId,
        CPP_FILE,
        "Which class can be used for both reading and writing files?",
        listOf("ifstream", "ofstream", "fstream", "iostream"),
        "fstream",
        "fstream supports both input and output file operations.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_005",
        categoryId,
        CPP_FILE,
        "Which function is used to open a file?",
        listOf("start()", "open()", "read()", "create()"),
        "open()",
        "The open() function is used to open a file in a specific mode.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_006",
        categoryId,
        CPP_FILE,
        "Which function is used to close a file?",
        listOf("stop()", "end()", "close()", "exit()"),
        "close()",
        "The close() function releases the file from the program.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_007",
        categoryId,
        CPP_FILE,
        "Which mode opens a file for reading?",
        listOf("ios::out", "ios::in", "ios::app", "ios::binary"),
        "ios::in",
        "ios::in opens a file in read mode.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_008",
        categoryId,
        CPP_FILE,
        "Which mode opens a file for writing?",
        listOf("ios::in", "ios::out", "ios::ate", "ios::binary"),
        "ios::out",
        "ios::out opens a file in write mode.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_009",
        categoryId,
        CPP_FILE,
        "Which mode appends data to the end of a file?",
        listOf("ios::in", "ios::out", "ios::app", "ios::trunc"),
        "ios::app",
        "ios::app adds new data at the end of the file without deleting old data.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_010",
        categoryId,
        CPP_FILE,
        "Which mode deletes existing content before writing?",
        listOf("ios::app", "ios::in", "ios::trunc", "ios::binary"),
        "ios::trunc",
        "ios::trunc clears existing file content before writing new data.",
        Difficulty.EASY,
        createdAt
    ),

    cppQuestion(
        "cpp_file_011",
        categoryId,
        CPP_FILE,
        "Which operator is commonly used to write data into a file?",
        listOf(">>", "<<", "==", "="),
        "<<",
        "The insertion operator << is used to write data into a file.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_012",
        categoryId,
        CPP_FILE,
        "Which operator is used to read data from a file?",
        listOf("<<", ">>", "==", "="),
        ">>",
        "The extraction operator >> reads data from a file.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_013",
        categoryId,
        CPP_FILE,
        "Which function reads a line from a file?",
        listOf("read()", "getline()", "get()", "scan()"),
        "getline()",
        "getline() reads a full line including spaces from a file.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_014",
        categoryId,
        CPP_FILE,
        "Which function checks whether a file opened successfully?",
        listOf("good()", "fail()", "is_open()", "open()"),
        "is_open()",
        "is_open() returns true if the file is successfully opened.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_015",
        categoryId,
        CPP_FILE,
        "Which mode opens a file in binary format?",
        listOf("ios::in", "ios::out", "ios::binary", "ios::text"),
        "ios::binary",
        "ios::binary opens files in binary mode instead of text.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_016",
        categoryId,
        CPP_FILE,
        "Which function returns end-of-file status?",
        listOf("end()", "eof()", "close()", "tell()"),
        "eof()",
        "eof() checks whether the end of the file has been reached.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_017",
        categoryId,
        CPP_FILE,
        "Which function gets the current file pointer position?",
        listOf("tellg()", "seekg()", "move()", "pos()"),
        "tellg()",
        "tellg() returns the current position of the file pointer.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_018",
        categoryId,
        CPP_FILE,
        "Which function moves the file pointer?",
        listOf("tellg()", "seekg()", "shift()", "locate()"),
        "seekg()",
        "seekg() is used to move the file read pointer.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_019",
        categoryId,
        CPP_FILE,
        "Which class is best for both reading and writing binary files?",
        listOf("ifstream", "ofstream", "fstream", "iostream"),
        "fstream",
        "fstream supports both reading and writing in binary mode.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_020",
        categoryId,
        CPP_FILE,
        "Which function writes a single character to a file?",
        listOf("put()", "get()", "write()", "send()"),
        "put()",
        "put() writes a single character to a file.",
        Difficulty.MEDIUM,
        createdAt
    ),

    cppQuestion(
        "cpp_file_021",
        categoryId,
        CPP_FILE,
        "Which function reads a single character from a file?",
        listOf("get()", "put()", "read()", "scan()"),
        "get()",
        "get() reads a single character from a file.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_022",
        categoryId,
        CPP_FILE,
        "Which function writes a block of data to a binary file?",
        listOf("write()", "put()", "print()", "send()"),
        "write()",
        "write() is used to write binary data blocks to a file.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_023",
        categoryId,
        CPP_FILE,
        "Which function reads binary data from a file?",
        listOf("read()", "get()", "getline()", "scan()"),
        "read()",
        "read() reads raw binary data from a file.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_024",
        categoryId,
        CPP_FILE,
        "Which mode opens a file and moves pointer to end?",
        listOf("ios::app", "ios::ate", "ios::in", "ios::trunc"),
        "ios::ate",
        "ios::ate opens the file and sets pointer at the end initially.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_025",
        categoryId,
        CPP_FILE,
        "Which operation is unsafe without checking file open status?",
        listOf("Writing", "Reading", "Closing", "Opening"),
        "Reading",
        "Reading from a file without checking may cause runtime errors.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_026",
        categoryId,
        CPP_FILE,
        "Which file handling concept improves data persistence?",
        listOf("Loops", "Files", "Pointers", "Functions"),
        "Files",
        "Files allow data to be stored permanently on disk.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_027",
        categoryId,
        CPP_FILE,
        "Which file type stores data in human-readable form?",
        listOf("Binary file", "Text file", "Object file", "Executable file"),
        "Text file",
        "Text files store data in readable characters.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_028",
        categoryId,
        CPP_FILE,
        "Binary files are faster than text files because?",
        listOf(
            "Less conversion",
            "More security",
            "More memory",
            "Readable format"
        ),
        "Less conversion",
        "Binary files avoid character conversion, making them faster.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_029",
        categoryId,
        CPP_FILE,
        "Which function flushes output buffer to file?",
        listOf("flush()", "clear()", "close()", "sync()"),
        "flush()",
        "flush() forces buffered output to be written immediately.",
        Difficulty.HARD,
        createdAt
    ),

    cppQuestion(
        "cpp_file_030",
        categoryId,
        CPP_FILE,
        "What is the main use of file handling?",
        listOf(
            "Temporary storage",
            "Permanent storage",
            "Faster execution",
            "Memory optimization"
        ),
        "Permanent storage",
        "File handling allows permanent storage of data for later use.",
        Difficulty.HARD,
        createdAt
    )
    )
}
