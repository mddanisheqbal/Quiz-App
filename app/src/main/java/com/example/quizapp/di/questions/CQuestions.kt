package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID


fun getCQuestions(categoryId: String, createdAt: String): List<Question> {
    val basicQuestions = listOf(
        // ================= C BASICS (50 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Who developed the C language?",
            options = listOf("Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", "Guido van Rossum"),
            correctAnswer = "Dennis Ritchie",
            explanation = "Dennis Ritchie developed C at Bell Labs. This is C Basics history.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which function is the entry point of a C program?",
            options = listOf("start()", "main()", "init()", "begin()"),
            correctAnswer = "main()",
            explanation = "Execution always begins at the main function in C.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What ends every C statement?",
            options = listOf(":", ".", ";", "}"),
            correctAnswer = ";",
            explanation = "The semicolon (;) is the statement terminator in C syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which header file is required for printf?",
            options = listOf("<stdio.h>", "<conio.h>", "<stdlib.h>", "<iostream>"),
            correctAnswer = "<stdio.h>",
            explanation = "Standard Input/Output header (stdio.h) defines printf logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you write a single-line comment in C?",
            options = listOf("// comment", "/* comment */", "# comment", "-- comment"),
            correctAnswer = "// comment",
            explanation = "C99 standardized // for single-line comments.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the return type of main()?",
            options = listOf("void", "int", "float", "char"),
            correctAnswer = "int",
            explanation = "The standard main function must return an integer.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which character starts a preprocessor directive?",
            options = listOf("#", "@", "$", "&"),
            correctAnswer = "#",
            explanation = "The hash symbol (#) initiates a preprocessor command.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'return 0' in main imply?",
            options = listOf("Program Failed", "Program Success", "Null", "Nothing"),
            correctAnswer = "Program Success",
            explanation = "Returning 0 from the main function indicates successful execution.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the extension of a C source file?",
            options = listOf(".c", ".cpp", ".h", ".obj"),
            correctAnswer = ".c",
            explanation = ".c is the standard extension for C Basics source files.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which of these is a valid variable name?",
            options = listOf("var_1", "1var", "var-1", "int"),
            correctAnswer = "var_1",
            explanation = "C syntax allows letters, digits, and underscores, but no starting digit.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does #include <stdio.h> do?",
            options = listOf("Includes file contents", "Compiles code", "Links code", "Runs code"),
            correctAnswer = "Includes file contents",
            explanation = "The preprocessor copies the header file content into the source.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is C case-sensitive?",
            options = listOf("Yes", "No", "Only functions", "Only variables"),
            correctAnswer = "Yes",
            explanation = "C Basics dictate that 'Main' and 'main' are different.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which format specifier prints an integer?",
            options = listOf("%d", "%f", "%c", "%s"),
            correctAnswer = "%d",
            explanation = "%d is the placeholder for decimal integers in printf.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a token in C?",
            options = listOf("Smallest unit of code", "A key", "A password", "A loop"),
            correctAnswer = "Smallest unit of code",
            explanation = "Keywords, identifiers, and literals are tokens in C syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the result of 10 % 3?",
            options = listOf("1", "3", "0", "10"),
            correctAnswer = "1",
            explanation = "The modulus operator returns the remainder. Basic C syntax math.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are braces { } used for?",
            options = listOf("Defining a scope block", "Arrays", "Comments", "Directives"),
            correctAnswer = "Defining a scope block",
            explanation = "Curly braces delimit code blocks in C Basics.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a compilation error?",
            options = listOf("Syntax mistake preventing build", "Logic error", "Crash", "Warning"),
            correctAnswer = "Syntax mistake preventing build",
            explanation = "Errors in syntax prevent the code from compiling.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you print a newline?",
            options = listOf("\\n", "/n", "\\l", "endl"),
            correctAnswer = "\\n",
            explanation = "\\n is the escape sequence for newline in printf.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does the linker do?",
            options = listOf("Combines object files", "Compiles code", "Writes code", "Debugs"),
            correctAnswer = "Combines object files",
            explanation = "Linking is the final stage of compilation before execution.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which is a valid keyword?",
            options = listOf("auto", "integer", "real", "loop"),
            correctAnswer = "auto",
            explanation = "'auto' is a standard keyword in C Basics.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a multi-line comment?",
            options = listOf("/* ... */", "// ...", "# ...", "-- ..."),
            correctAnswer = "/* ... */",
            explanation = "This syntax allows comments spanning multiple lines.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the value of 'false' in C?",
            options = listOf("0", "1", "-1", "null"),
            correctAnswer = "0",
            explanation = "In C Basics, zero represents false logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the value of 'true' in C?",
            options = listOf("Non-zero", "1 only", "0", "-1"),
            correctAnswer = "Non-zero",
            explanation = "Any non-zero value is considered true in C syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'void'?",
            options = listOf("Data type with no value", "Integer", "Error", "Loop"),
            correctAnswer = "Data type with no value",
            explanation = "Void indicates absence of type in C Basics.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can variables start with an underscore?",
            options = listOf("Yes", "No", "Only global", "Only constants"),
            correctAnswer = "Yes",
            explanation = "C syntax allows underscores, but system vars usually use them.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a syntax error example?",
            options = listOf("Missing semicolon", "Divide by zero", "Wrong output", "Infinite loop"),
            correctAnswer = "Missing semicolon",
            explanation = "This violates C syntax rules and stops compilation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'scanf' do?",
            options = listOf("Reads input", "Prints output", "Allocates memory", "Exits"),
            correctAnswer = "Reads input",
            explanation = "It is the standard function for input in C Basics.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Correct format for double in printf?",
            options = listOf("%lf", "%d", "%c", "%i"),
            correctAnswer = "%lf",
            explanation = "%lf stands for long float, used for doubles in printf.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does C support namespaces?",
            options = listOf("No", "Yes", "Since C99", "Since C11"),
            correctAnswer = "No",
            explanation = "C Basics relies on global scope, leading to name collisions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an escape sequence?",
            options = listOf("Characters starting with \\", "Exit code", "A loop", "A comment"),
            correctAnswer = "Characters starting with \\",
            explanation = "Escape sequences represent special chars in C syntax strings.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a runtime error?",
            options = listOf("Error during execution", "Syntax error", "Typo", "Linker error"),
            correctAnswer = "Error during execution",
            explanation = "Unlike syntax errors, these happen after compilation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is whitespace significant in C?",
            options = listOf("No", "Yes", "Only newlines", "Only tabs"),
            correctAnswer = "No",
            explanation = "C syntax largely ignores extra spaces and newlines.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What defines a block of code?",
            options = listOf("{ }", "( )", "[ ]", "< >"),
            correctAnswer = "{ }",
            explanation = "Curly braces group statements in C Basics.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the size of char?",
            options = listOf("1 byte", "2 bytes", "4 bytes", "8 bytes"),
            correctAnswer = "1 byte",
            explanation = "In C Basics, a char is always 1 byte.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does '&' do in scanf?",
            options = listOf("Passes address", "Passes value", "Passes array", "Nothing"),
            correctAnswer = "Passes address",
            explanation = "scanf requires the memory address to modify variables in C syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can main take arguments?",
            options = listOf("Yes (argc, argv)", "No", "Only int", "Only strings"),
            correctAnswer = "Yes (argc, argv)",
            explanation = "The main function supports command line arguments.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a header file?",
            options = listOf("File containing declarations", "Executable", "Database", "Image"),
            correctAnswer = "File containing declarations",
            explanation = "Included via preprocessor, it shares code definitions.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which function prints a single char?",
            options = listOf("putchar", "print", "cout", "write"),
            correctAnswer = "putchar",
            explanation = "It is a standard C Basics function for character output.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'argc'?",
            options = listOf("Argument count", "Array count", "Char count", "Code"),
            correctAnswer = "Argument count",
            explanation = "It holds the number of inputs to the main function.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'argv'?",
            options = listOf("Argument vector (strings)", "Argument value", "Array variable", "Void"),
            correctAnswer = "Argument vector (strings)",
            explanation = "It holds the actual command line strings in the main function.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does \\t represent?",
            options = listOf("Tab", "Newline", "Time", "Terminate"),
            correctAnswer = "Tab",
            explanation = "Horizontal tab character in C syntax strings.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is main() mandatory?",
            options = listOf("Yes", "No", "Only for executable", "Only for libraries"),
            correctAnswer = "Only for executable",
            explanation = "Executable C programs require a main function entry point.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the standard input stream?",
            options = listOf("stdin", "stdout", "stderr", "stdlog"),
            correctAnswer = "stdin",
            explanation = "C Basics defines stdin for input handling.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the standard output stream?",
            options = listOf("stdout", "stdin", "stderr", "file"),
            correctAnswer = "stdout",
            explanation = "printf writes to stdout by default in C syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to declare a constant in C?",
            options = listOf("const int x = 5;", "int const x = 5;", "#define X 5", "All of above"),
            correctAnswer = "All of above",
            explanation = "C Basics supports const keyword and preprocessor macros.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is variable initialization?",
            options = listOf("Assigning value at declaration", "Declaring type", "Printing value", "Deleting"),
            correctAnswer = "Assigning value at declaration",
            explanation = "Setting a starting value is good practice in C syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can comments be nested in C?",
            options = listOf("No", "Yes", "Only //", "Depends on compiler"),
            correctAnswer = "No",
            explanation = "Standard C syntax forbids nesting block comments.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What creates an object file?",
            options = listOf("Compiler", "Linker", "Loader", "Editor"),
            correctAnswer = "Compiler",
            explanation = "Compilation transforms source into object code.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 0 mean in boolean context?",
            options = listOf("False", "True", "Null", "Void"),
            correctAnswer = "False",
            explanation = "Zero is the definition of false in C Basics logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is C statically typed?",
            options = listOf("Yes", "No", "Partially", "Only variables"),
            correctAnswer = "Yes",
            explanation = "Types are checked at compilation in C syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val dataTypeQuestions = listOf(
        // ================= DATA TYPES (15 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What represents a single byte in C?",
            options = listOf("char", "int", "float", "double"),
            correctAnswer = "char",
            explanation = "The 'char' type is defined to be exactly one byte in C Data Types.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Format specifier for float?",
            options = listOf("%f", "%d", "%c", "%i"),
            correctAnswer = "%f",
            explanation = "The %f format string is used for printing 'float' variables.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Range of 'unsigned char'?",
            options = listOf("0 to 255", "-128 to 127", "0 to 65535", "-32768 to 32767"),
            correctAnswer = "0 to 255",
            explanation = "An unsigned 'char' uses all 8 bits for magnitude, doubling the positive range.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which type stores true/false in C99?",
            options = listOf("_Bool", "boolean", "logic", "bit"),
            correctAnswer = "_Bool",
            explanation = "C99 introduced _Bool as one of the standard Data Types for logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the size of 'double' usually?",
            options = listOf("8 bytes", "4 bytes", "10 bytes", "2 bytes"),
            correctAnswer = "8 bytes",
            explanation = "A double precision 'float' (double) typically occupies 8 bytes.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'void' type?",
            options = listOf("Incomplete type", "Integer", "Error", "String"),
            correctAnswer = "Incomplete type",
            explanation = "Void represents the absence of Data Types or values.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between float and double?",
            options = listOf("Precision and range", "No difference", "Syntax only", "Double is integer"),
            correctAnswer = "Precision and range",
            explanation = "Double offers more precision than a standard 'float' type.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'short int'?",
            options = listOf("Smaller range integer", "Larger integer", "Floating point", "Character"),
            correctAnswer = "Smaller range integer",
            explanation = "It optimizes memory when the full range of 'int' is not needed.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'long long int'?",
            options = listOf("At least 64 bits", "32 bits", "128 bits", "Infinite"),
            correctAnswer = "At least 64 bits",
            explanation = "C99 added this to the list of integer Data Types for large numbers.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Are enum constants integers?",
            options = listOf("Yes", "No", "They are strings", "They are floats"),
            correctAnswer = "Yes",
            explanation = "Enums are treated as 'int' types under the hood in C.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the sign bit?",
            options = listOf("Most significant bit", "Least significant bit", "Middle bit", "Parity bit"),
            correctAnswer = "Most significant bit",
            explanation = "It determines if signed Data Types are positive or negative.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'char' default to signed or unsigned?",
            options = listOf("Implementation defined", "Signed", "Unsigned", "Both"),
            correctAnswer = "Implementation defined",
            explanation = "Unlike 'int', the sign of a plain 'char' depends on the compiler.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword to define a new type name?",
            options = listOf("typedef", "def", "type", "alias"),
            correctAnswer = "typedef",
            explanation = "It creates an alias for existing Data Types.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is size_t?",
            options = listOf("Unsigned integer for sizes", "Signed int", "Float", "Void"),
            correctAnswer = "Unsigned integer for sizes",
            explanation = "Returned by 'sizeof', it is guaranteed to hold the largest object size.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Literal suffix for float?",
            options = listOf("F or f", "L", "U", "D"),
            correctAnswer = "F or f",
            explanation = "Without 'f', a floating literal acts as a double, not a 'float'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= OPERATORS (15 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which operator returns remainder?",
            options = listOf("%", "/", "#", "*"),
            correctAnswer = "%",
            explanation = "The modulus operator (%) works on 'int' types to find remainders.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the ternary operator?",
            options = listOf("?:", "if-else", "switch", "&&"),
            correctAnswer = "?:",
            explanation = "It is the only conditional logic among C Operators taking three operands.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Result of 5 / 2 in C?",
            options = listOf("2", "2.5", "3", "Error"),
            correctAnswer = "2",
            explanation = "Integer division truncates decimals when using 'int' operands.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does ++x do?",
            options = listOf("Increments then uses value", "Uses value then increments", "Adds 2", "Errors"),
            correctAnswer = "Increments then uses value",
            explanation = "Pre-increment is one of the unary Operators in C.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which is logical AND?",
            options = listOf("&&", "&", "and", "||"),
            correctAnswer = "&&",
            explanation = "&& compares boolean logic, distinct from bitwise Operators.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Precedence of * vs +?",
            options = listOf("* is higher", "+ is higher", "Same", "Undefined"),
            correctAnswer = "* is higher",
            explanation = "Multiplication Operators bind tighter than addition.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the comma operator?",
            options = listOf("Evaluates left, then right, returns right", "Separator", "List maker", "Error"),
            correctAnswer = "Evaluates left, then right, returns right",
            explanation = "It has the lowest precedence of all C Operators.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is assignment (=) an operator?",
            options = listOf("Yes", "No", "Statement", "Function"),
            correctAnswer = "Yes",
            explanation = "Assignment is one of the Operators and returns the assigned value.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Result of !0?",
            options = listOf("1", "0", "-1", "Error"),
            correctAnswer = "1",
            explanation = "Logical NOT (!) inverts the truth value of 'int' logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Associativity of assignment (=)?",
            options = listOf("Right to left", "Left to right", "Random", "None"),
            correctAnswer = "Right to left",
            explanation = "Operators like assignment evaluate from right to left.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does sizeof return?",
            options = listOf("Bytes occupied", "Bits occupied", "Address", "Value"),
            correctAnswer = "Bytes occupied",
            explanation = "The 'sizeof' operator calculates memory size.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Short-circuit evaluation applies to?",
            options = listOf("&& and ||", "+ and -", "* and /", "& and |"),
            correctAnswer = "&& and ||",
            explanation = "Logical Operators stop if the result is already known.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a unary operator?",
            options = listOf("Takes one operand", "Takes two", "Takes three", "Takes none"),
            correctAnswer = "Takes one operand",
            explanation = "Operators like ++, --, and sizeof are unary.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Result of 1 << 2?",
            options = listOf("4", "2", "1", "8"),
            correctAnswer = "4",
            explanation = "Bitwise Operators like left shift multiply by powers of 2.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Bitwise XOR operator?",
            options = listOf("^", "|", "&", "~"),
            correctAnswer = "^",
            explanation = "The caret (^) is one of the bitwise Operators.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= SIZEOF & CASTING (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is sizeof a function?",
            options = listOf("No, operator", "Yes", "Macro", "Compiler directive"),
            correctAnswer = "No, operator",
            explanation = "'sizeof' is a compile-time operator, not a function call.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Result of (int)3.14?",
            options = listOf("3", "3.14", "4", "Error"),
            correctAnswer = "3",
            explanation = "Explicit 'cast' truncates the fractional part of a float.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is implicit casting?",
            options = listOf("Automatic conversion by compiler", "Manual conversion", "Error", "Warning"),
            correctAnswer = "Automatic conversion by compiler",
            explanation = "The compiler can 'cast' smaller types to larger types automatically.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "sizeof(char) is always?",
            options = listOf("1", "2", "4", "Machine dependent"),
            correctAnswer = "1",
            explanation = "By definition, 'sizeof' char is exactly 1 byte.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Result of sizeof(int)?",
            options = listOf("Platform dependent (usually 4)", "Always 4", "Always 2", "8"),
            correctAnswer = "Platform dependent (usually 4)",
            explanation = "'sizeof' for 'int' varies by system architecture.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you cast pointers?",
            options = listOf("Yes", "No", "Only to void*", "Only to int*"),
            correctAnswer = "Yes",
            explanation = "You can 'cast' any pointer type to another, though it may be unsafe.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Type of result: 5 + 2.0?",
            options = listOf("double", "int", "float", "Error"),
            correctAnswer = "double",
            explanation = "Implicit 'cast' promotes the 'int' to double to match the 2.0.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does sizeof evaluate expressions?",
            options = listOf("No, compile time only", "Yes", "Sometimes", "Only functions"),
            correctAnswer = "No, compile time only",
            explanation = "'sizeof(i++)' will not increment 'i' because it is not executed.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is truncation warning?",
            options = listOf("Loss of data during cast", "Memory error", "Disk full", "Syntax error"),
            correctAnswer = "Loss of data during cast",
            explanation = "Occurs when you 'cast' a large type (like int) to a small type (like char).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Syntax for casting?",
            options = listOf("(type)value", "type(value)", "cast<type>(value)", "[type]value"),
            correctAnswer = "(type)value",
            explanation = "C uses parenthesis notation for an explicit 'cast'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )


    val controlFlowQuestions = listOf(
        // ================= CONTROL FLOW (40 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which keyword starts a conditional block?",
            options = listOf("if", "loop", "jump", "check"),
            correctAnswer = "if",
            explanation = "The 'if statement' is the fundamental building block of Control Flow.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What terminates a switch case?",
            options = listOf("break", "stop", "end", "exit"),
            correctAnswer = "break",
            explanation = "Without 'break', the Control Flow falls through to the next case.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which loop checks condition after execution?",
            options = listOf("do-while", "while", "for", "foreach"),
            correctAnswer = "do-while",
            explanation = "The do-while loops guarantee at least one execution of the body.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'continue' do?",
            options = listOf("Skips to next iteration", "Stops loop", "Exits program", "Restarts function"),
            correctAnswer = "Skips to next iteration",
            explanation = "'continue' bypasses the rest of the loop body and jumps to the condition check.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which loop is best for fixed iterations?",
            options = listOf("for", "while", "do-while", "goto"),
            correctAnswer = "for",
            explanation = "The 'for' loops are designed for scenarios where the count is known.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Syntax for an infinite while loop?",
            options = listOf("while(1)", "while(0)", "while(true)", "loop()"),
            correctAnswer = "while(1)",
            explanation = "In C Control Flow, a non-zero value (1) is always true.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can 'switch' handle float values?",
            options = listOf("No, only int/char", "Yes", "Only double", "Only arrays"),
            correctAnswer = "No, only int/char",
            explanation = "The 'switch' statement requires integral types for its cases.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the 'default' case?",
            options = listOf("Executes if no case matches", "First case", "Last case", "Error case"),
            correctAnswer = "Executes if no case matches",
            explanation = "It acts as the 'else' logic within a 'switch' block.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if 'break' is missing in switch?",
            options = listOf("Fallthrough occurs", "Compilation error", "Loop stops", "Runtime error"),
            correctAnswer = "Fallthrough occurs",
            explanation = "Control Flow continues into the next case automatically.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'goto'?",
            options = listOf("Jumps to a label", "Loops", "Functions", "Variables"),
            correctAnswer = "Jumps to a label",
            explanation = "It provides an unconditional jump in Control Flow, but is generally discouraged.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is 'else if' a separate keyword?",
            options = listOf("No, just else followed by if", "Yes", "In C99", "In C11"),
            correctAnswer = "No, just else followed by if",
            explanation = "It is technically a nested 'if statement' inside an 'else' block.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Condition for 'for' loop syntax?",
            options = listOf("init; condition; update", "start, end, step", "init, check", "None"),
            correctAnswer = "init; condition; update",
            explanation = "These three parts define the standard C 'for' loops structure.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can 'if' statements be nested?",
            options = listOf("Yes", "No", "Only 2 levels", "Only 3 levels"),
            correctAnswer = "Yes",
            explanation = "Complex Control Flow is often built using nested conditions.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'sentinel' loop?",
            options = listOf("Loop ending on specific value", "Infinite loop", "Empty loop", "Broken loop"),
            correctAnswer = "Loop ending on specific value",
            explanation = "loops that terminate when a special value (like -1) is input.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Result of: if(a=5) ?",
            options = listOf("Always true", "Checks equality", "Error", "Always false"),
            correctAnswer = "Always true",
            explanation = "Assignment (=) returns the value assigned (5), which is true. Equality uses ==.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you use empty 'for(;;)'?",
            options = listOf("Yes, infinite loop", "No, syntax error", "Runs once", "Compiler warning"),
            correctAnswer = "Yes, infinite loop",
            explanation = "This is a standard idiom for infinite 'loops' in C.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Valid expression in 'if'?",
            options = listOf("Any expression evaluating to scalar", "Only boolean", "Only int", "Only comparisons"),
            correctAnswer = "Any expression evaluating to scalar",
            explanation = "The 'if statement' accepts pointers, ints, and floats; 0 is false, others true.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Scope of variable declared in 'for' loop (C99)?",
            options = listOf("Loop body only", "Function scope", "Global", "File"),
            correctAnswer = "Loop body only",
            explanation = "C99 allows declaration inside the loop header, restricting scope to the loop.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is unreachable code?",
            options = listOf("Code after return/break", "Comments", "Loops", "Functions"),
            correctAnswer = "Code after return/break",
            explanation = "Control Flow never reaches statements immediately following a return.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can switch be nested?",
            options = listOf("Yes", "No", "Only if cases differ", "Only in main"),
            correctAnswer = "Yes",
            explanation = "You can place a 'switch' inside another case.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'exit(0)' do?",
            options = listOf("Terminates program", "Breaks loop", "Returns", "Pauses"),
            correctAnswer = "Terminates program",
            explanation = "It halts all Control Flow and returns status to the OS.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between break and continue?",
            options = listOf("Break exits loop, continue skips iteration", "No difference", "Continue exits", "Break restarts"),
            correctAnswer = "Break exits loop, continue skips iteration",
            explanation = "Fundamental difference in manipulating 'loops'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you switch on a string?",
            options = listOf("No", "Yes", "Only in C11", "Only constant strings"),
            correctAnswer = "No",
            explanation = "C 'switch' statements do not support string comparisons.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Maximum cases in a switch?",
            options = listOf("Compiler dependent", "255", "10", "Infinite"),
            correctAnswer = "Compiler dependent",
            explanation = "The limit depends on implementation, but is usually very large.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a compound statement?",
            options = listOf("Block in { }", "Macro", "Function", "Complex math"),
            correctAnswer = "Block in { }",
            explanation = "A group of statements treated as one unit in Control Flow.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'if' require braces for one line?",
            options = listOf("No", "Yes", "Always recommended", "Only for int"),
            correctAnswer = "No",
            explanation = "The 'if statement' applies to the immediate next statement by default.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'dangling else'?",
            options = listOf("Ambiguity of matching else to if", "Syntax error", "Missing else", "Loop error"),
            correctAnswer = "Ambiguity of matching else to if",
            explanation = "In C, an 'else' matches the nearest preceding 'if statement'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you declare variables in a switch case?",
            options = listOf("Yes, but inside a block { }", "No", "Anywhere", "Only int"),
            correctAnswer = "Yes, but inside a block { }",
            explanation = "To avoid scope issues in 'switch', wrap declarations in braces.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Effect of '; ' after 'if(...)'?",
            options = listOf("Empty statement executed (null body)", "Syntax error", "Loop", "Crash"),
            correctAnswer = "Empty statement executed (null body)",
            explanation = "The 'if statement' does nothing because the semicolon ends it immediately.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Comma operator in for loop?",
            options = listOf("Allows multiple initializations/updates", "Separator", "Error", "Pause"),
            correctAnswer = "Allows multiple initializations/updates",
            explanation = "Commonly used in 'for' loops: for(i=0, j=10; ...; i++, j--).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Do 'while' loops execute at least once?",
            options = listOf("No", "Yes", "Only if condition met", "Only do-while"),
            correctAnswer = "No",
            explanation = "Standard 'while' loops check the condition *before* entry.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a duplicate case error?",
            options = listOf("Two cases with same value in switch", "Two loops", "Two ifs", "Recursion"),
            correctAnswer = "Two cases with same value in switch",
            explanation = "Values in a 'switch' must be unique constant expressions.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you use floats in 'if' condition?",
            options = listOf("Yes", "No", "Only double", "Only int"),
            correctAnswer = "Yes",
            explanation = "Any non-zero float is treated as true in Control Flow.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is 'goto' always bad?",
            options = listOf("Mostly, but useful for error cleanup", "Always bad", "Always good", "Deprecated"),
            correctAnswer = "Mostly, but useful for error cleanup",
            explanation = "It handles deep nested loop exits or error states in C Control Flow.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a labeled statement?",
            options = listOf("Target for goto", "Switch case", "Function", "Variable"),
            correctAnswer = "Target for goto",
            explanation = "Labels (name:) mark destinations for Control Flow jumps.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can 'continue' be used in 'switch'?",
            options = listOf("No, only in loops", "Yes", "If inside a loop", "Only in main"),
            correctAnswer = "No, only in loops",
            explanation = "'continue' affects loop iterations; it has no meaning for 'switch'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Short-circuit in 'if(A && B)'?",
            options = listOf("If A is false, B is not checked", "B is always checked", "A is skipped", "Both skipped"),
            correctAnswer = "If A is false, B is not checked",
            explanation = "Optimization in Control Flow to save processing time.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you compare pointers in 'if'?",
            options = listOf("Yes", "No", "Only void*", "Only null"),
            correctAnswer = "Yes",
            explanation = "Pointers can be compared for equality or relative position in Control Flow.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the loop counter?",
            options = listOf("Variable controlling iterations", "A function", "A switch", "A macro"),
            correctAnswer = "Variable controlling iterations",
            explanation = "Typical 'for' loops use an integer counter.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Are recursive calls control flow?",
            options = listOf("Yes", "No", "Data flow", "Memory"),
            correctAnswer = "Yes",
            explanation = "Recursion is a form of repetitive Control Flow managed by the stack.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    // IMPORTANT: Include all 3 lists!
    return basicQuestions + dataTypeQuestions + controlFlowQuestions
}