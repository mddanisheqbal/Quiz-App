package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID

fun getCppQuestions(categoryId: String, createdAt: String): List<Question> {
    val basicQuestions = listOf(
        // 1. ENTRY POINT
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the entry point of every C++ program?",
            options = listOf("start()", "main()", "init()", "program()"),
            correctAnswer = "main()",
            explanation = "Execution always begins at 'main'. This is the standard entry block in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which routine is called by the OS to run the code?",
            options = listOf("main", "start", "_init", "boot"),
            correctAnswer = "main",
            explanation = "The 'main' block is the starting point defined by Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What value does 'main' usually send back to the system on success?",
            options = listOf("0", "1", "-1", "void"),
            correctAnswer = "0",
            explanation = "Sending 0 back to the system indicates success in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the standard result type for 'main'?",
            options = listOf("void", "int", "float", "double"),
            correctAnswer = "int",
            explanation = "Core Syntax mandates that 'main' results in a whole number.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // 2. OUTPUT (IOSTREAM)
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which library file is needed for 'cout'?",
            options = listOf("<iostream>", "<stdio.h>", "<conio.h>", "<output>"),
            correctAnswer = "<iostream>",
            explanation = "The <iostream> header is required for standard output operations.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What represents the 'standard output stream'?",
            options = listOf("cin", "cerr", "cout", "clog"),
            correctAnswer = "cout",
            explanation = "'cout' is the entity used for standard output display.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which symbol sends data to 'cout'?",
            options = listOf(">>", "<<", "::", "->"),
            correctAnswer = "<<",
            explanation = "The insertion operator (<<) is used for standard output.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you print \"Hello World\"?",
            options = listOf("cout << \"Hello World\";", "print(\"Hello World\");", "cout >> \"Hello World\";", "write(\"Hello World\");"),
            correctAnswer = "cout << \"Hello World\";",
            explanation = "Using 'cout' is the correct Core Syntax for printing.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'std::endl' do?",
            options = listOf("Stops code", "Inserts newline and flushes", "Deletes line", "Inputs data"),
            correctAnswer = "Inserts newline and flushes",
            explanation = "It manipulates standard output to start a new line.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which escape sequence creates a new line?",
            options = listOf("\\n", "/n", "\\l", "\\r"),
            correctAnswer = "\\n",
            explanation = "\\n is the Core Syntax character for a new line.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // 3. INPUT (CIN)
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which object handles keyboard input?",
            options = listOf("cout", "cin", "scanf", "input"),
            correctAnswer = "cin",
            explanation = "'cin' is the iostream object for standard input.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which symbol gets data from 'cin'?",
            options = listOf("<<", ">>", "::", "&"),
            correctAnswer = ">>",
            explanation = "The extraction operator (>>) is used with iostream input.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'cin' read spaces by default?",
            options = listOf("Yes", "No", "Depends on OS", "Only tabs"),
            correctAnswer = "No",
            explanation = "'cin' stops at whitespace. This is a rule of Core Syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which header defines 'cin'?",
            options = listOf("<iostream>", "<input>", "<stdio>", "<cin>"),
            correctAnswer = "<iostream>",
            explanation = "The <iostream> header contains the definition for 'cin'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What standard device is 'cin' connected to?",
            options = listOf("Keyboard", "Screen", "Printer", "Mouse"),
            correctAnswer = "Keyboard",
            explanation = "The standard input usually refers to the keyboard in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // 4. COMMENTS & SYNTAX
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which symbol starts a single-line note?",
            options = listOf("/*", "//", "#", "--"),
            correctAnswer = "//",
            explanation = "Double slashes (//) start comments in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you close a '/*' block?",
            options = listOf("*/", "//", "*/", "-->"),
            correctAnswer = "*/",
            explanation = "It ends with */. This describes multi-line comments.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does the computer run text inside comments?",
            options = listOf("Yes", "No", "Sometimes", "Only main ones"),
            correctAnswer = "No",
            explanation = "Comments are ignored during compilation. This is Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What character ends a command in C++?",
            options = listOf(":", ".", ";", "}"),
            correctAnswer = ";",
            explanation = "The semicolon (;) is the mandatory terminator in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is C++ case-sensitive?",
            options = listOf("Yes", "No", "Only for values", "Only for commands"),
            correctAnswer = "Yes",
            explanation = "Core Syntax treats 'Main' and 'main' as different things.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // 5. BLOCKS, NAMESPACES & MORE
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are { } used for?",
            options = listOf("Lists", "Notes", "Blocks of code", "Headers"),
            correctAnswer = "Blocks of code",
            explanation = "Curly braces define scope in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'using namespace std;'?",
            options = listOf("A value", "A shortcut to avoid std:: prefix", "A command", "A class"),
            correctAnswer = "A shortcut to avoid std:: prefix",
            explanation = "It helps access standard output without typing 'std::' every time.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does #include do?",
            options = listOf("Compiles", "Inserts file contents", "Links", "Runs"),
            correctAnswer = "Inserts file contents",
            explanation = "It is a preprocessor directive in Core Syntax to add libraries.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'std'?",
            options = listOf("A class", "A routine", "The standard namespace", "A file"),
            correctAnswer = "The standard namespace",
            explanation = "Standard output lives in the 'std' namespace.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which code makes a tab space?",
            options = listOf("\\t", "\\n", "\\b", "\\s"),
            correctAnswer = "\\t",
            explanation = "\\t is the Core Syntax for a tab.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you enclose text?",
            options = listOf("'Hi'", "\"Hi\"", "`Hi`", "(Hi)"),
            correctAnswer = "\"Hi\"",
            explanation = "Double quotes are used for text strings in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you enclose a single letter?",
            options = listOf("'A'", "\"A\"", "`A`", "*A*"),
            correctAnswer = "'A'",
            explanation = "Single quotes are used for single characters in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'printf'?",
            options = listOf("Input", "C-style output", "A value", "A loop"),
            correctAnswer = "C-style output",
            explanation = "It is an older way to do standard output.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which file extension is standard for C++?",
            options = listOf(".cpp", ".h", ".txt", ".exe"),
            correctAnswer = ".cpp",
            explanation = ".cpp is the extension for Core Syntax source files.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'token'?",
            options = listOf("A coin", "Smallest unit of code", "A hardware key", "A password"),
            correctAnswer = "Smallest unit of code",
            explanation = "Keywords and identifiers are tokens in Core Syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // 6. ERRORS & MISC
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a syntax error?",
            options = listOf("Bad logic", "Grammar violation", "Crash", "Disk error"),
            correctAnswer = "Grammar violation",
            explanation = "Breaking Core Syntax rules causes a syntax error.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Where do error messages go?",
            options = listOf("cin", "cout", "cerr", "file"),
            correctAnswer = "cerr",
            explanation = "'cerr' is the standard output for errors.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is 'cerr' buffered?",
            options = listOf("Yes", "No", "Usually", "Always"),
            correctAnswer = "No",
            explanation = "Core Syntax defines 'cerr' as unbuffered.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does '::' do?",
            options = listOf("Math", "Scope Resolution", "Nothing", "Comment"),
            correctAnswer = "Scope Resolution",
            explanation = "It finds names in the Core Syntax standard namespace.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you print a backslash?",
            options = listOf("\\", "\\\\", "/\\", "//"),
            correctAnswer = "\\\\",
            explanation = "Escaping it is required by Core Syntax rules.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What handles exceptions in C++?",
            options = listOf("if-else", "try-catch", "do-while", "switch"),
            correctAnswer = "try-catch",
            explanation = "Core Syntax uses try-catch blocks for errors.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which loop checks condition after running?",
            options = listOf("while", "for", "do-while", "foreach"),
            correctAnswer = "do-while",
            explanation = "Core Syntax ensures the body runs before the check.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'argc'?",
            options = listOf("Argument Count", "Array Count", "Argument Char", "Code"),
            correctAnswer = "Argument Count",
            explanation = "It counts inputs to the entry block in Core Syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why avoid 'using namespace std;' in big projects?",
            options = listOf("It is slow", "Name collisions", "Memory usage", "Crashes"),
            correctAnswer = "Name collisions",
            explanation = "It can mix up names, which is a risk in Core Syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which of these is a valid name?",
            options = listOf("1val", "_val", "val-1", "class"),
            correctAnswer = "_val",
            explanation = "Core Syntax allows underscores at the start.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can main be 'void' in strict C++?",
            options = listOf("Yes", "No", "Sometimes", "In Linux"),
            correctAnswer = "No",
            explanation = "Core Syntax requires an integer result.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which command stops a loop?",
            options = listOf("stop", "break", "end", "exit"),
            correctAnswer = "break",
            explanation = "The break keyword exits a loop in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which command skips one loop step?",
            options = listOf("break", "continue", "skip", "next"),
            correctAnswer = "continue",
            explanation = "The continue keyword skips the current iteration in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the escape for a backspace?",
            options = listOf("\\b", "\\n", "\\t", "\\s"),
            correctAnswer = "\\b",
            explanation = "\\b moves the cursor back in Core Syntax output.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'clog'?",
            options = listOf("Buffered error stream", "Input", "File", "Log file"),
            correctAnswer = "Buffered error stream",
            explanation = "It is used for logging in Core Syntax.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the range of a boolean?",
            options = listOf("True/False", "0-100", "A-Z", "Any number"),
            correctAnswer = "True/False",
            explanation = "Booleans hold logic states in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the modulo operator?",
            options = listOf("%", "/", "*", "#"),
            correctAnswer = "%",
            explanation = "The % symbol gives the remainder in Core Syntax math.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does '++' do?",
            options = listOf("Adds 2", "Increments by 1", "Adds 10", "Squares"),
            correctAnswer = "Increments by 1",
            explanation = "The increment operator raises a value by one in Core Syntax.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which side does '=' assign to?",
            options = listOf("Left", "Right", "Both", "Random"),
            correctAnswer = "Left",
            explanation = "Core Syntax assigns the right value to the left side.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'ASCII'?",
            options = listOf("Coding standard", "A variable", "A loop", "A syntax"),
            correctAnswer = "Coding standard",
            explanation = "It maps numbers to characters in standard Core Syntax.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val typesQuestions = listOf(
        // 1. DATA TYPES
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the size of a 'char'?",
            options = listOf("1 byte", "2 bytes", "4 bytes", "8 bytes"),
            correctAnswer = "1 byte",
            explanation = "A 'char' is 1 byte in C++ Data Types.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which type stores true/false?",
            options = listOf("bool", "int", "char", "void"),
            correctAnswer = "bool",
            explanation = "The 'bool' is a fundamental Data Type.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'double' used for?",
            options = listOf("Integers", "Strings", "Floating point numbers", "Booleans"),
            correctAnswer = "Floating point numbers",
            explanation = "It is a precision floating point Data Type.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'unsigned' mean?",
            options = listOf("Only positive numbers", "Only negative", "Both", "No numbers"),
            correctAnswer = "Only positive numbers",
            explanation = "Unsigned Data Types cannot hold negative values.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Size of 'int' on 32-bit system?",
            options = listOf("2 bytes", "4 bytes", "8 bytes", "1 byte"),
            correctAnswer = "4 bytes",
            explanation = "Usually 4 bytes for integer Data Types.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'auto'?",
            options = listOf("Car", "Type inference", "Loop", "Array"),
            correctAnswer = "Type inference",
            explanation = "It deduces Data Types automatically.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'void'?",
            options = listOf("Empty type", "Integer", "String", "Loop"),
            correctAnswer = "Empty type",
            explanation = "It represents the absence of Data Types.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'wchar_t'?",
            options = listOf("Wide character", "Whole number", "Word count", "Wait time"),
            correctAnswer = "Wide character",
            explanation = "It is used for extended character Data Types.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What suffix makes a float literal?",
            options = listOf("f", "d", "l", "u"),
            correctAnswer = "f",
            explanation = "The 'f' suffix specifies float Data Types.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is type casting?",
            options = listOf("Changing types", "Fishing", "Printing", "Looping"),
            correctAnswer = "Changing types",
            explanation = "It converts one Data Type to another.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // 2. POINTERS
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does a pointer store?",
            options = listOf("Value", "Memory address", "Name", "Type"),
            correctAnswer = "Memory address",
            explanation = "Pointer Logic revolves around addresses.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which operator gets an address?",
            options = listOf("&", "*", "->", "::"),
            correctAnswer = "&",
            explanation = "The '&' operator is central to Pointer Logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which operator dereferences?",
            options = listOf("*", "&", "->", "."),
            correctAnswer = "*",
            explanation = "The '*' operator accesses value in Pointer Logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'nullptr'?",
            options = listOf("Zero", "Null pointer constant", "Void", "Error"),
            correctAnswer = "Null pointer constant",
            explanation = "It is the modern safe null in Pointer Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'int* p'?",
            options = listOf("Pointer to int", "Int value", "Array", "Reference"),
            correctAnswer = "Pointer to int",
            explanation = "It declares a variable using Pointer Logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Size of a pointer on 64-bit?",
            options = listOf("4 bytes", "8 bytes", "16 bytes", "2 bytes"),
            correctAnswer = "8 bytes",
            explanation = "Addresses are 64-bit in 64-bit Pointer Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a void pointer?",
            options = listOf("Generic pointer", "Null", "Error", "Int"),
            correctAnswer = "Generic pointer",
            explanation = "It can point to anything in Pointer Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a dangling pointer?",
            options = listOf("Points to deleted memory", "Null", "Valid", "Global"),
            correctAnswer = "Points to deleted memory",
            explanation = "It is a dangerous error in Pointer Logic.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to access object member via pointer?",
            options = listOf(".", "->", "::", "&"),
            correctAnswer = "->",
            explanation = "The arrow operator is used in Pointer Logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you add to pointers?",
            options = listOf("Yes", "No", "Only multiply", "Only divide"),
            correctAnswer = "Yes",
            explanation = "Pointer arithmetic is allowed in Pointer Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is '**p'?",
            options = listOf("Pointer to pointer", "Double", "Error", "Reference"),
            correctAnswer = "Pointer to pointer",
            explanation = "It is a double indirection in Pointer Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'const int* p'?",
            options = listOf("Pointer to const int", "Const pointer", "Both", "None"),
            correctAnswer = "Pointer to const int",
            explanation = "The data is constant in this Pointer Logic.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'int* const p'?",
            options = listOf("Const pointer", "Pointer to const", "Both", "None"),
            correctAnswer = "Const pointer",
            explanation = "The address is constant in this Pointer Logic.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Dereferencing null causes?",
            options = listOf("Crash", "Nothing", "Zero", "Warning"),
            correctAnswer = "Crash",
            explanation = "It is undefined behavior in Pointer Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'this'?",
            options = listOf("Pointer to current object", "Reference", "Null", "Type"),
            correctAnswer = "Pointer to current object",
            explanation = "It is a special pointer in Class Pointer Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // 3. ARRAYS
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "First index of array?",
            options = listOf("0", "1", "-1", "size"),
            correctAnswer = "0",
            explanation = "Array Indexing starts at zero.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Last index of 'arr[5]'?",
            options = listOf("4", "5", "6", "0"),
            correctAnswer = "4",
            explanation = "It is size minus one in Array Indexing.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to declare array of 10 ints?",
            options = listOf("int a[10];", "int a;", "array a;", "int a{10};"),
            correctAnswer = "int a[10];",
            explanation = "Square brackets denote Array Indexing size.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Are arrays fixed size?",
            options = listOf("Yes", "No", "Sometimes", "Only chars"),
            correctAnswer = "Yes",
            explanation = "Standard arrays have fixed dimensions in Array Indexing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Accessing out of bounds?",
            options = listOf("Undefined behavior", "Error", "Zero", "Wrap around"),
            correctAnswer = "Undefined behavior",
            explanation = "It is unsafe in Array Indexing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "2D array declaration?",
            options = listOf("a[3][3]", "a(3,3)", "a{3}{3}", "a[3,3]"),
            correctAnswer = "a[3][3]",
            explanation = "Two sets of brackets are used in Array Indexing.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Memory layout of arrays?",
            options = listOf("Contiguous", "Scattered", "Linked", "Random"),
            correctAnswer = "Contiguous",
            explanation = "Elements are next to each other in Array Indexing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Array name decays to?",
            options = listOf("Pointer to first element", "Int", "Size", "Null"),
            correctAnswer = "Pointer to first element",
            explanation = "This links Pointer Logic and Arrays.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "String literal type?",
            options = listOf("Char array", "Int", "Bool", "Void"),
            correctAnswer = "Char array",
            explanation = "Strings are arrays of chars in legacy Array Indexing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Terminator for C-strings?",
            options = listOf("Null char \\0", "Period", "Space", "End"),
            correctAnswer = "Null char \\0",
            explanation = "It marks the end in char Array Indexing.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Initialize array?",
            options = listOf("{1,2,3}", "(1,2,3)", "[1,2,3]", "1,2,3"),
            correctAnswer = "{1,2,3}",
            explanation = "Curly braces are used for initializing Array Indexing.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can arrays change size?",
            options = listOf("No", "Yes", "With realloc", "Automatic"),
            correctAnswer = "No",
            explanation = "Static Array Indexing is fixed.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Row-major or Column-major?",
            options = listOf("Row-major", "Column-major", "Random", "None"),
            correctAnswer = "Row-major",
            explanation = "C++ uses row-major Array Indexing.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "sizeof(array) returns?",
            options = listOf("Total bytes", "Number of elements", "Pointer size", "1"),
            correctAnswer = "Total bytes",
            explanation = "It includes all elements in Array Indexing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Access via pointer?",
            options = listOf("*(a + i)", "a . i", "&a", "a->i"),
            correctAnswer = "*(a + i)",
            explanation = "This is equivalent to a[i] in Array Indexing.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val refStructQuestions = listOf(
        // ================= REFERENCES (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What symbol is used to declare a reference?",
            options = listOf("&", "*", "->", "#"),
            correctAnswer = "&",
            explanation = "The ampersand (&) is used to create a Reference Variable.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a reference essentially?",
            options = listOf("A new variable", "An alias for an existing variable", "A pointer", "A null value"),
            correctAnswer = "An alias for an existing variable",
            explanation = "A reference acts as an alias for another variable.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a reference be null?",
            options = listOf("Yes", "No", "Only if static", "Only if const"),
            correctAnswer = "No",
            explanation = "A Reference Variable must always refer to a valid object; it cannot be null.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Must a reference be initialized when declared?",
            options = listOf("Yes", "No", "Depends on compiler", "Only in classes"),
            correctAnswer = "Yes",
            explanation = "A Reference Variable requires initialization at the point of declaration.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if you assign a new value to a reference?",
            options = listOf("The reference changes", "The original variable changes", "Error", "Nothing"),
            correctAnswer = "The original variable changes",
            explanation = "Since it is an alias, assigning to it updates the original variable.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you rebind a reference to a different variable after initialization?",
            options = listOf("Yes", "No", "Yes, with a cast", "Yes, if const"),
            correctAnswer = "No",
            explanation = "Once established, a Reference Variable cannot be made to refer to a different object.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How does passing by reference help functions?",
            options = listOf("Avoids copying large objects", "Speeds up compilation", "Prevents changes", "Uses less CPU cycles"),
            correctAnswer = "Avoids copying large objects",
            explanation = "Using a Reference Variable avoids the overhead of copying data.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between pointer and reference?",
            options = listOf("Pointers can be null, references cannot", "References use *", "Pointers are aliases", "No difference"),
            correctAnswer = "Pointers can be null, references cannot",
            explanation = "A Reference Variable is safer as it is never null.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Syntax to pass 'x' by reference to 'void func'?",
            options = listOf("void func(int x)", "void func(int &x)", "void func(int *x)", "void func(&x)"),
            correctAnswer = "void func(int &x)",
            explanation = "The '&' symbol in the parameter list creates a Reference Variable parameter.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a const reference?",
            options = listOf("Read-only alias", "Writable alias", "Null alias", "Static alias"),
            correctAnswer = "Read-only alias",
            explanation = "A const Reference Variable prevents modification of the referred object.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you have a reference to a reference?",
            options = listOf("Yes", "No", "In C++11 (rvalue refs)", "Only pointers"),
            correctAnswer = "No",
            explanation = "You cannot standardly declare a reference to a reference, only an alias to a type.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'int& r = x;' do?",
            options = listOf("Copies x to r", "Creates r as an alias for x", "Points r to x", "Error"),
            correctAnswer = "Creates r as an alias for x",
            explanation = "This is the syntax for defining an alias.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a function return a reference?",
            options = listOf("Yes", "No", "Only main", "Only void"),
            correctAnswer = "Yes",
            explanation = "Returning a Reference Variable allows using function calls on the left side of assignments.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Danger of returning reference to local variable?",
            options = listOf("Dangling reference", "Memory leak", "Syntax error", "Slow code"),
            correctAnswer = "Dangling reference",
            explanation = "The local Reference Variable is destroyed when the function exits.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Size of a reference in memory?",
            options = listOf("Same as pointer", "0 bytes", "4 bytes", "1 byte"),
            correctAnswer = "Same as pointer",
            explanation = "Under the hood, a Reference Variable usually takes the same space as a pointer.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you have an array of references?",
            options = listOf("Yes", "No", "Only static", "Only dynamic"),
            correctAnswer = "No",
            explanation = "C++ does not allow arrays of Reference Variable types.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an r-value reference?",
            options = listOf("int &&", "int &", "int *", "int"),
            correctAnswer = "int &&",
            explanation = "The double ampersand denotes a reference to a temporary, not a standard Reference Variable.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which takes precedence: Pointer or Reference?",
            options = listOf("None", "Pointer", "Reference", "They are different concepts"),
            correctAnswer = "They are different concepts",
            explanation = "A Reference Variable is an alias; a pointer is an address holder.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a reference refer to a constant?",
            options = listOf("Yes, if it is const", "No", "Yes, always", "Only ints"),
            correctAnswer = "Yes, if it is const",
            explanation = "A const Reference Variable can bind to a literal or constant.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why use references over pointers?",
            options = listOf("Cleaner syntax", "No null checks needed", "Both A and B", "Neither"),
            correctAnswer = "Both A and B",
            explanation = "Using an alias simplifies code and improves safety.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= STRUCTURES (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword to define a structure?",
            options = listOf("class", "struct", "object", "type"),
            correctAnswer = "struct",
            explanation = "The 'struct' keyword begins a Structure Definition.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Default access modifier in a struct?",
            options = listOf("public", "private", "protected", "internal"),
            correctAnswer = "public",
            explanation = "In a Structure Definition, members are public by default.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between class and struct?",
            options = listOf("Default visibility", "Memory size", "Functions allowed", "Inheritance"),
            correctAnswer = "Default visibility",
            explanation = "A Structure Definition defaults to public, a class to private.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to access a member 'age' of struct 's'?",
            options = listOf("s.age", "s->age", "s:age", "s::age"),
            correctAnswer = "s.age",
            explanation = "Standard struct usage involves the dot operator.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to access member 'age' via a pointer 'ptr'?",
            options = listOf("ptr.age", "ptr->age", "ptr::age", "ptr:age"),
            correctAnswer = "ptr->age",
            explanation = "The -> operator is used when accessing struct members via a pointer.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can structs have functions?",
            options = listOf("Yes", "No", "Only in C", "Only static"),
            correctAnswer = "Yes",
            explanation = "In C++, a Structure Definition can include member functions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can structs inherit from other structs?",
            options = listOf("Yes", "No", "Only private inheritance", "Only classes can"),
            correctAnswer = "Yes",
            explanation = "Struct usage supports inheritance just like classes.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What ends a structure definition?",
            options = listOf("}", "};", ")", "];"),
            correctAnswer = "};",
            explanation = "A semicolon is required after the closing brace of a Structure Definition.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is padding in structs?",
            options = listOf("Extra memory for alignment", "Extra variables", "Comments", "Errors"),
            correctAnswer = "Extra memory for alignment",
            explanation = "Structure Definition often involves padding bytes for memory alignment.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a struct have a constructor?",
            options = listOf("Yes", "No", "Only destructors", "Only default"),
            correctAnswer = "Yes",
            explanation = "Struct usage in C++ allows constructors for initialization.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is 'typedef struct' needed in C++?",
            options = listOf("Yes", "No", "Only for pointers", "For compilation"),
            correctAnswer = "No",
            explanation = "In C++ Structure Definition, the 'typedef' is optional unlike in C.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you define an array of structs?",
            options = listOf("Struct arr[10];", "Struct arr;", "List<Struct>", "Array<Struct>"),
            correctAnswer = "Struct arr[10];",
            explanation = "Standard struct usage allows creating arrays of structure objects.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can structs have private members?",
            options = listOf("Yes", "No", "Only protected", "Only static"),
            correctAnswer = "Yes",
            explanation = "Although public by default, a Structure Definition can contain private sections.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a bit-field in a struct?",
            options = listOf("Specifying variable size in bits", "A boolean", "A pointer", "A large field"),
            correctAnswer = "Specifying variable size in bits",
            explanation = "Struct usage allows defining members with specific bit widths.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you copy one struct variable to another?",
            options = listOf("Yes, using =", "No", "Only manually", "Using memcpy only"),
            correctAnswer = "Yes, using =",
            explanation = "Struct usage supports default member-wise assignment.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does '(*ptr).member' equal?",
            options = listOf("ptr->member", "ptr.member", "ptr::member", "member"),
            correctAnswer = "ptr->member",
            explanation = "The -> operator is shorthand for dereferencing and accessing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a struct contain a pointer to itself?",
            options = listOf("Yes", "No", "Only in classes", "Only static"),
            correctAnswer = "Yes",
            explanation = "A Structure Definition can contain a pointer to its own type (e.g., linked list).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an anonymous struct?",
            options = listOf("A struct with no name", "A hidden struct", "A private struct", "A deleted struct"),
            correctAnswer = "A struct with no name",
            explanation = "Struct usage allows defining unnamed structures for temporary use.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Size of an empty struct in C++?",
            options = listOf("1 byte", "0 bytes", "4 bytes", "Undefined"),
            correctAnswer = "1 byte",
            explanation = "A Structure Definition must have a non-zero size to be addressable.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can structs implement polymorphism?",
            options = listOf("Yes, with virtual functions", "No", "Only classes", "Only interfaces"),
            correctAnswer = "Yes, with virtual functions",
            explanation = "Since structs are just classes with public default access, struct usage supports polymorphism.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val functionQuestions = listOf(
        // ================= FUNCTIONS (40 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a function prototype?",
            options = listOf("The function body", "A declaration of the function's name and type", "A variable", "A loop"),
            correctAnswer = "A declaration of the function's name and type",
            explanation = "A Function Prototype declares the signature before the definition.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does the 'void' keyword mean as a return type?",
            options = listOf("Returns 0", "Returns nothing", "Returns null", "Returns error"),
            correctAnswer = "Returns nothing",
            explanation = "Void is a special Return Type indicating no value is sent back.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens during a function call?",
            options = listOf("Program stops", "Control transfers to the function", "Variable is deleted", "Memory is cleared"),
            correctAnswer = "Control transfers to the function",
            explanation = "A Function Call pauses the current execution to run the function code.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are actual parameters?",
            options = listOf("Variables defined in function", "Values passed during a call", "Return values", "Global variables"),
            correctAnswer = "Values passed during a call",
            explanation = "These are the specific values provided in the Parameters list during a call.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is recursion?",
            options = listOf("A loop", "A function calling itself", "A syntax error", "A variable type"),
            correctAnswer = "A function calling itself",
            explanation = "Recursion occurs when a function invokes itself to solve a problem.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What keyword suggests the compiler to optimize small functions?",
            options = listOf("static", "inline", "const", "fast"),
            correctAnswer = "inline",
            explanation = "An Inline Function request aims to reduce function call overhead.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Where should a function prototype be placed?",
            options = listOf("Inside main", "After main", "Before main (or in header)", "In a loop"),
            correctAnswer = "Before main (or in header)",
            explanation = "The Function Prototype must be visible before the function is called.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a default parameter?",
            options = listOf("A constant", "A value used if none is provided", "An error", "A reference"),
            correctAnswer = "A value used if none is provided",
            explanation = "Parameters can have default values assigned in the prototype.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a function return multiple values directly?",
            options = listOf("Yes", "No", "Using arrays", "Using tuples"),
            correctAnswer = "No",
            explanation = "A C++ function has a single Return Type, though structs/pairs can wrap multiple values.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the base case in recursion?",
            options = listOf("The first call", "The condition to stop recursion", "The error case", "The loop start"),
            correctAnswer = "The condition to stop recursion",
            explanation = "Without a base case, Recursion leads to a stack overflow.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which storage class is the default for function variables?",
            options = listOf("static", "auto", "register", "extern"),
            correctAnswer = "auto",
            explanation = "Local variables in a Function Call are automatic by default.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'return 0' indicate in main?",
            options = listOf("Error", "Success", "Null", "Void"),
            correctAnswer = "Success",
            explanation = "The int Return Type of main conventionally uses 0 for success.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is pass by value?",
            options = listOf("Passing address", "Passing a copy of the data", "Passing alias", "Passing nothing"),
            correctAnswer = "Passing a copy of the data",
            explanation = "Parameters are copied into the function's memory space.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can inline functions contain loops?",
            options = listOf("Yes, but not recommended", "No, never", "Yes, always", "Only while loops"),
            correctAnswer = "Yes, but not recommended",
            explanation = "Complex logic makes an Inline Function inefficient or ignored by the compiler.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What identifies a function signature?",
            options = listOf("Return type", "Name and parameter types", "Body", "Variables"),
            correctAnswer = "Name and parameter types",
            explanation = "The Function Prototype signature defines uniqueness.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if return type is missing in declaration?",
            options = listOf("Defaults to int (old C++)", "Error (Standard C++)", "Defaults to void", "Warning"),
            correctAnswer = "Error (Standard C++)",
            explanation = "Modern C++ strictly requires an explicit Return Type.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How are arrays passed to functions?",
            options = listOf("By value", "By reference (pointer)", "By copy", "Not allowed"),
            correctAnswer = "By reference (pointer)",
            explanation = "Array Parameters decay to pointers in function calls.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is infinite recursion?",
            options = listOf("A loop", "Recursion without a terminating condition", "A large stack", "An inline function"),
            correctAnswer = "Recursion without a terminating condition",
            explanation = "Infinite Recursion leads to a stack overflow crash.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can two functions have the same name?",
            options = listOf("No", "Yes (Overloading)", "Yes (Overwriting)", "Only in C"),
            correctAnswer = "Yes (Overloading)",
            explanation = "If Parameters differ, functions can share a name.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'exit(0)' do?",
            options = listOf("Returns from function", "Terminates the program immediately", "Pauses", "Skips loop"),
            correctAnswer = "Terminates the program immediately",
            explanation = "Unlike a return, it ends the entire program during a Function Call.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are formal parameters?",
            options = listOf("Values passed", "Variables declared in the function definition", "Global vars", "Constants"),
            correctAnswer = "Variables declared in the function definition",
            explanation = "Formal Parameters act as placeholders in the function code.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a function call another function?",
            options = listOf("Yes", "No", "Only main", "Only inline"),
            correctAnswer = "Yes",
            explanation = "A Function Call can be nested within another function.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword to force pass-by-reference?",
            options = listOf("*", "&", "ref", "->"),
            correctAnswer = "&",
            explanation = "Using '&' in Parameters allows modifying the original argument.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Advantage of inline functions?",
            options = listOf("Less memory", "Faster execution for small code", "More flexible", "Recursion support"),
            correctAnswer = "Faster execution for small code",
            explanation = "An Inline Function avoids the overhead of stack frame creation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Stack overflow is caused by?",
            options = listOf("Too many loops", "Deep or infinite recursion", "Large arrays", "Pointers"),
            correctAnswer = "Deep or infinite recursion",
            explanation = "Excessive Recursion consumes all stack memory.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a function be defined inside another function?",
            options = listOf("Yes", "No (Standard C++)", "Yes (Lambdas)", "Yes (Classes)"),
            correctAnswer = "No (Standard C++)",
            explanation = "Standard C++ does not support nested function definitions, though lambdas are similar. Relates to Function Prototype rules.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a pure function?",
            options = listOf("No return", "Deterministic output for input, no side effects", "Virtual", "Void"),
            correctAnswer = "Deterministic output for input, no side effects",
            explanation = "This concept relates to the predictability of a Function Call.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Return type of main in C?",
            options = listOf("void", "int", "float", "any"),
            correctAnswer = "int",
            explanation = "Like C++, C requires 'int' as the Return Type for main.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Parameter passing order?",
            options = listOf("Left to right", "Right to left", "Undefined/Compiler dependent", "Random"),
            correctAnswer = "Undefined/Compiler dependent",
            explanation = "The evaluation order of Parameters is not guaranteed by the standard.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'void *' return type?",
            options = listOf("Returns nothing", "Returns a generic pointer", "Error", "Null"),
            correctAnswer = "Returns a generic pointer",
            explanation = "This Return Type allows returning a pointer to any data type.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Tail recursion is?",
            options = listOf("Recursion at the start", "Recursion as the last action", "Looping", "Error"),
            correctAnswer = "Recursion as the last action",
            explanation = "Tail Recursion can be optimized by the compiler into a loop.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can inline functions be recursive?",
            options = listOf("Yes", "No", "Compiler ignores inline", "Causes error"),
            correctAnswer = "Compiler ignores inline",
            explanation = "Recursion usually prevents a function from being an Inline Function.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'variadic' function?",
            options = listOf("Fixed parameters", "Accepts variable number of parameters", "No return", "Inline"),
            correctAnswer = "Accepts variable number of parameters",
            explanation = "Variadic Parameters allow functions like printf to work.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword 'extern' with function?",
            options = listOf("Defines function", "Declares function defined elsewhere", "Local scope", "Static"),
            correctAnswer = "Declares function defined elsewhere",
            explanation = "It is used in a Function Prototype to link across files.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'static' function?",
            options = listOf("Global visibility", "Limited to file scope", "Fast execution", "Inline"),
            correctAnswer = "Limited to file scope",
            explanation = "A static Function Prototype restricts visibility to the current translation unit.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'const' parameter protect data?",
            options = listOf("Yes", "No", "Only for copy", "Only for main"),
            correctAnswer = "Yes",
            explanation = "Const Parameters prevent the function from modifying the argument.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the scope of function parameters?",
            options = listOf("Global", "Function block", "File", "Main"),
            correctAnswer = "Function block",
            explanation = "Parameters are local to the Function Call context.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Function overloading relies on?",
            options = listOf("Return type", "Number/Type of parameters", "Keywords", "Names"),
            correctAnswer = "Number/Type of parameters",
            explanation = "The compiler uses Parameters to distinguish overloaded functions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can return type differ in overloading?",
            options = listOf("Yes, if parameters differ", "Yes, always", "No", "Only in C"),
            correctAnswer = "Yes, if parameters differ",
            explanation = "Return Type alone is not sufficient to distinguish overloaded functions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a lambda?",
            options = listOf("Unnamed function object", "Recursion", "Inline", "Macro"),
            correctAnswer = "Unnamed function object",
            explanation = "It acts like a Function Call defined inline.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )


    val namespaceQuestions = listOf(
        // ================= NAMESPACES (30 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the primary purpose of a namespace?",
            options = listOf("To increase memory", "To prevent name conflicts", "To define classes", "To link files"),
            correctAnswer = "To prevent name conflicts",
            explanation = "Namespaces are designed to avoid Name Collision between identifiers.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which keyword defines a namespace?",
            options = listOf("def", "package", "namespace", "scope"),
            correctAnswer = "namespace",
            explanation = "The 'namespace' keyword creates a new Namespace Scope.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you access a member 'x' in namespace 'A'?",
            options = listOf("A.x", "A->x", "A::x", "A:x"),
            correctAnswer = "A::x",
            explanation = "The scope resolution operator accesses the Namespace Scope.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the global namespace?",
            options = listOf("The std namespace", "The scope outside all other namespaces", "The main function", "A library"),
            correctAnswer = "The scope outside all other namespaces",
            explanation = "Identifiers defined outside any block are in the Global Scope.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'using namespace std;' do?",
            options = listOf("Imports a file", "Brings all std members into current scope", "Deletes std", "Renames std"),
            correctAnswer = "Brings all std members into current scope",
            explanation = "The using keyword imports symbols to avoid typing prefixes.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'std'?",
            options = listOf("Standard library namespace", "Standard function", "Standard class", "Global variable"),
            correctAnswer = "Standard library namespace",
            explanation = "C++ standard library features are contained in the std namespace.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can namespaces be nested?",
            options = listOf("Yes", "No", "Only in C", "Only in headers"),
            correctAnswer = "Yes",
            explanation = "You can define a Namespace Scope inside another namespace.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is '::x' (unary scope resolution)?",
            options = listOf("Error", "Access x in global scope", "Access x in main", "Access local x"),
            correctAnswer = "Access x in global scope",
            explanation = "It forces the lookup to happen in the Global Scope.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a namespace alias?",
            options = listOf("Renaming a namespace", "Deleting a namespace", "Copying a namespace", "Hiding a namespace"),
            correctAnswer = "Renaming a namespace",
            explanation = "Aliases shorten long names to avoid Name Collision or typing fatigue.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Syntax for namespace alias?",
            options = listOf("namespace New = Old;", "alias New = Old;", "using New = Old;", "typedef Old New;"),
            correctAnswer = "namespace New = Old;",
            explanation = "This creates an alternate name for an existing Namespace Scope.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an anonymous namespace?",
            options = listOf("Unnamed namespace", "Hidden namespace", "Public namespace", "Global namespace"),
            correctAnswer = "Unnamed namespace",
            explanation = "It restricts identifier visibility to the file, similar to static in Global Scope.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is 'using namespace' recommended in header files?",
            options = listOf("Yes", "No", "Always", "Sometimes"),
            correctAnswer = "No",
            explanation = "It forces the using keyword on everyone who includes the header, causing pollution.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you split a namespace across multiple files?",
            options = listOf("Yes", "No", "Only if static", "Only if const"),
            correctAnswer = "Yes",
            explanation = "A Namespace Scope can be additive and span multiple translation units.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'using declaration' (e.g., using std::cout)?",
            options = listOf("Imports everything", "Imports only specific member", "Defines variable", "Error"),
            correctAnswer = "Imports only specific member",
            explanation = "The using keyword can be selective to keep scopes clean.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Ambiguity error occurs when?",
            options = listOf("Two namespaces have same function name and both are used", "One namespace is empty", "No namespaces used", "Main is missing"),
            correctAnswer = "Two namespaces have same function name and both are used",
            explanation = "This is a classic Name Collision scenario.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does namespace affect object lifetime?",
            options = listOf("Yes", "No", "Only static", "Only heap"),
            correctAnswer = "No",
            explanation = "Namespace Scope only affects visibility, not storage duration.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the scope of 'cout' without 'using'?",
            options = listOf("Global", "std", "Local", "File"),
            correctAnswer = "std",
            explanation = "It resides inside the std namespace.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you define a namespace inside a function?",
            options = listOf("Yes", "No", "Only main", "Only void functions"),
            correctAnswer = "No",
            explanation = "A Namespace Scope cannot be defined inside a local block.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Are class names affected by namespaces?",
            options = listOf("Yes", "No", "Only structs", "Only unions"),
            correctAnswer = "Yes",
            explanation = "Classes inside a namespace avoid Name Collision with classes outside.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you add to the 'std' namespace?",
            options = listOf("Yes", "No (Undefined Behavior)", "Yes, always", "Only functions"),
            correctAnswer = "No (Undefined Behavior)",
            explanation = "Modifying the std namespace is generally forbidden.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does C language have namespaces?",
            options = listOf("Yes", "No", "In C99", "In C11"),
            correctAnswer = "No",
            explanation = "Lack of namespaces in C often leads to Name Collision.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to handle conflicting libraries?",
            options = listOf("Wrap them in namespaces", "Rename files", "Delete code", "Use macros"),
            correctAnswer = "Wrap them in namespaces",
            explanation = "Namespaces allow encapsulating code to prevent Name Collision.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can variables be declared in namespaces?",
            options = listOf("Yes", "No", "Only functions", "Only classes"),
            correctAnswer = "Yes",
            explanation = "Any identifier can exist within a Namespace Scope.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword to use a specific identifier?",
            options = listOf("import", "using", "include", "define"),
            correctAnswer = "using",
            explanation = "The using keyword introduces a name into the current scope.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Are static globals part of the global namespace?",
            options = listOf("Yes", "No", "They are file scope", "They are local"),
            correctAnswer = "Yes",
            explanation = "They exist in the Global Scope but have internal linkage.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can namespaces contain typedefs?",
            options = listOf("Yes", "No", "Only C++11", "Only C"),
            correctAnswer = "Yes",
            explanation = "Typedefs are valid members of a Namespace Scope.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you implement a namespace function outside the namespace block?",
            options = listOf("Yes, using ::", "No", "Only if inline", "Only if static"),
            correctAnswer = "Yes, using ::",
            explanation = "You can define members outside using the Namespace Scope operator.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is inline namespace (C++11)?",
            options = listOf("Members appear in parent scope", "Hidden namespace", "Faster namespace", "Error"),
            correctAnswer = "Members appear in parent scope",
            explanation = "It creates a transparent Namespace Scope for versioning.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if you define the same namespace twice?",
            options = listOf("Error", "Merges them", "Overwrites", "Warning"),
            correctAnswer = "Merges them",
            explanation = "Namespace Scope is additive; new members are added to the existing namespace.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why use '::' before a function call?",
            options = listOf("To call global function", "To call local function", "To call std function", "To error"),
            correctAnswer = "To call global function",
            explanation = "It specifies the function in the Global Scope, overriding local hiding.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= EXCEPTIONS IN STD/GLOBAL CONTEXT (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Where is the 'exception' class defined?",
            options = listOf("Global scope", "std namespace", "io namespace", "local scope"),
            correctAnswer = "std namespace",
            explanation = "Standard exceptions reside in the std namespace.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can exceptions traverse namespaces?",
            options = listOf("Yes", "No", "Only in same file", "Only in main"),
            correctAnswer = "Yes",
            explanation = "Exceptions propagate up the stack regardless of Namespace Scope.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'std::runtime_error'?",
            options = listOf("A function", "A class in std namespace", "A variable", "A macro"),
            correctAnswer = "A class in std namespace",
            explanation = "It is a standard exception class in the std namespace.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Do unhandled exceptions reach global scope?",
            options = listOf("Yes, terminating program", "No", "They disappear", "They loop"),
            correctAnswer = "Yes, terminating program",
            explanation = "If not caught, they bubble up to the Global Scope/main and call terminate.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword to throw an exception?",
            options = listOf("throw", "catch", "try", "raise"),
            correctAnswer = "throw",
            explanation = "The throw keyword starts exception handling, avoiding Name Collision with return codes.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Header for standard exceptions?",
            options = listOf("<exception>", "<std>", "<error>", "<global>"),
            correctAnswer = "<exception>",
            explanation = "This header defines base classes in the std namespace.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'using namespace std;' affect regarding exceptions?",
            options = listOf("Makes exception classes visible without prefix", "Disables exceptions", "Enables exceptions", "Nothing"),
            correctAnswer = "Makes exception classes visible without prefix",
            explanation = "It allows typing 'runtime_error' instead of 'std::runtime_error' via the using keyword.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you define custom exceptions in a namespace?",
            options = listOf("Yes", "No", "Only global", "Only std"),
            correctAnswer = "Yes",
            explanation = "Custom exceptions should be in a Namespace Scope to organize code.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is 'std::bad_alloc' an exception?",
            options = listOf("Yes", "No", "It is a function", "It is a variable"),
            correctAnswer = "Yes",
            explanation = "It is thrown by 'new' and lives in the std namespace.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'try-catch' create a scope?",
            options = listOf("Yes", "No", "Only try", "Only catch"),
            correctAnswer = "Yes",
            explanation = "Blocks in exception handling create a local scope, distinct from Global Scope.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val classOpQuestions = listOf(
        // ================= CLASSES & OBJECTS (25 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a class in C++?",
            options = listOf("A blueprint for objects", "A variable", "A function", "A header"),
            correctAnswer = "A blueprint for objects",
            explanation = "A Class Definition serves as a template to create objects.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you declare a class?",
            options = listOf("class MyClass {};", "struct MyClass", "object MyClass", "def MyClass"),
            correctAnswer = "class MyClass {};",
            explanation = "The 'class' keyword starts a Class Definition.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Default access specifier in a class?",
            options = listOf("private", "public", "protected", "internal"),
            correctAnswer = "private",
            explanation = "Access Specifiers default to private in classes (unlike structs).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is encapsulation?",
            options = listOf("Hiding data and bundling it with methods", "Inheritance", "Polymorphism", "Looping"),
            correctAnswer = "Hiding data and bundling it with methods",
            explanation = "Encapsulation is a core OOP principle enforced by classes.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to make members accessible from outside?",
            options = listOf("Use 'public:'", "Use 'private:'", "Use 'hidden:'", "Use 'global:'"),
            correctAnswer = "Use 'public:'",
            explanation = "Public Access Specifiers allow external code to reach members.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a member function?",
            options = listOf("A function inside a class", "A global function", "A friend function", "A main function"),
            correctAnswer = "A function inside a class",
            explanation = "A Member Function operates on the class's data.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which keyword refers to the current object?",
            options = listOf("self", "this", "me", "obj"),
            correctAnswer = "this",
            explanation = "'this' is a pointer available in every non-static Member Function.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you define a function outside the class?",
            options = listOf("Yes, using ::", "No", "Only static", "Only friends"),
            correctAnswer = "Yes, using ::",
            explanation = "You can define a Member Function externally using scope resolution.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Size of an empty class?",
            options = listOf("1 byte", "0 bytes", "4 bytes", "8 bytes"),
            correctAnswer = "1 byte",
            explanation = "A Class Definition must have non-zero size to be unique in memory.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'const' member function?",
            options = listOf("Cannot modify object state", "Returns const", "Static function", "Fast function"),
            correctAnswer = "Cannot modify object state",
            explanation = "It guarantees Encapsulation safety by not changing members.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Syntax for const member function?",
            options = listOf("void func() const;", "const void func();", "void const func();", "static void func();"),
            correctAnswer = "void func() const;",
            explanation = "The 'const' goes after the parameter list in a Member Function.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a static data member?",
            options = listOf("Shared by all objects", "Unique to each object", "Constant", "Global"),
            correctAnswer = "Shared by all objects",
            explanation = "Static members belong to the Class Definition itself, not instances.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to access static members?",
            options = listOf("Class::Member", "Object.Member", "Both", "None"),
            correctAnswer = "Both",
            explanation = "You can use the class name or an object, but Class::Member is preferred in Class Definition.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'friend' class?",
            options = listOf("Access private members of another class", "Inherits from class", "Helper class", "Public class"),
            correctAnswer = "Access private members of another class",
            explanation = "It breaks Encapsulation to allow access to privates.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a class be defined inside another class?",
            options = listOf("Yes (Nested class)", "No", "Only structs", "Only in Java"),
            correctAnswer = "Yes (Nested class)",
            explanation = "A Class Definition can be nested for scoping reasons.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the 'mutable' keyword?",
            options = listOf("Allows modification in const function", "Makes variable static", "Changes type", "Deletes variable"),
            correctAnswer = "Allows modification in const function",
            explanation = "It relaxes Encapsulation rules for specific members like caches.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are Access Specifiers?",
            options = listOf("public, private, protected", "static, dynamic", "void, int", "class, struct"),
            correctAnswer = "public, private, protected",
            explanation = "Access Specifiers control visibility of class members.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'protected' mean?",
            options = listOf("Accessible to derived classes", "Private", "Public", "Global"),
            correctAnswer = "Accessible to derived classes",
            explanation = "Protected Access Specifiers allow inheritance but block external access.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you initialize members in class definition (C++11)?",
            options = listOf("Yes", "No", "Only static", "Only const"),
            correctAnswer = "Yes",
            explanation = "In-class initialization is valid in modern Class Definition.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'local class'?",
            options = listOf("Defined inside a function", "Defined in a file", "Defined in main", "Private class"),
            correctAnswer = "Defined inside a function",
            explanation = "A Class Definition can exist locally within a function scope.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does a static member function have 'this' pointer?",
            options = listOf("No", "Yes", "Sometimes", "Only in debug"),
            correctAnswer = "No",
            explanation = "Static members are not tied to an instance, so no 'this' in Member Function.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you create an array of objects?",
            options = listOf("Yes", "No", "Only pointers", "Only via malloc"),
            correctAnswer = "Yes",
            explanation = "Class Definition allows array creation just like primitives.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an abstract class?",
            options = listOf("Has pure virtual function", "Has no variables", "Cannot compile", "Is empty"),
            correctAnswer = "Has pure virtual function",
            explanation = "It serves as a base Class Definition and cannot be instantiated.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is struct and class the same binary-wise?",
            options = listOf("Yes, mostly", "No", "Different memory", "Different speed"),
            correctAnswer = "Yes, mostly",
            explanation = "The only difference in Class Definition is default access level.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why use getters and setters?",
            options = listOf("To enforce Encapsulation", "To make code slower", "To use more memory", "No reason"),
            correctAnswer = "To enforce Encapsulation",
            explanation = "They control access to private members, a key part of Encapsulation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= OPERATOR OVERLOADING (15 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is Operator Overloading?",
            options = listOf("Customizing operators for classes", "Creating new operators", "Deleting operators", "Hiding operators"),
            correctAnswer = "Customizing operators for classes",
            explanation = "Operator Overloading allows standard symbols like + to work on objects.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword for overloading?",
            options = listOf("operator", "overload", "override", "new"),
            correctAnswer = "operator",
            explanation = "The 'operator' keyword defines the function for Operator Overloading.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload the '.' (dot) operator?",
            options = listOf("No", "Yes", "In C++20", "Only for friends"),
            correctAnswer = "No",
            explanation = "The dot operator is one of the few forbidden in Operator Overloading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you create new operators like **?",
            options = listOf("No", "Yes", "Only in macros", "Maybe"),
            correctAnswer = "No",
            explanation = "Operator Overloading works only on existing C++ operators.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to overload '+' for two objects?",
            options = listOf("MyClass operator+(MyClass)", "MyClass +(MyClass)", "void operator+", "add(MyClass)"),
            correctAnswer = "MyClass operator+(MyClass)",
            explanation = "This is the signature for binary Operator Overloading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload 'new' and 'delete'?",
            options = listOf("Yes", "No", "Only new", "Only delete"),
            correctAnswer = "Yes",
            explanation = "Operator Overloading allows custom memory management.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why return reference in assignment operator (=)?",
            options = listOf("To allow chaining (a=b=c)", "To save memory", "To speed up", "Required by syntax"),
            correctAnswer = "To allow chaining (a=b=c)",
            explanation = "This is a standard pattern in Operator Overloading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which operators cannot be overloaded?",
            options = listOf("., .*, ::, ?:", "+, -, *, /", "new, delete", "[], ()"),
            correctAnswer = "., .*, ::, ?:",
            explanation = "These four are strictly forbidden in Operator Overloading.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload '&&' and '||'?",
            options = listOf("Yes, but you lose short-circuiting", "No", "Yes, fully", "Only &&"),
            correctAnswer = "Yes, but you lose short-circuiting",
            explanation = "Operator Overloading them changes their fundamental behavior (dangerous).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is operator overloading compile-time polymorphism?",
            options = listOf("Yes", "No", "Runtime", "Dynamic"),
            correctAnswer = "Yes",
            explanation = "The compiler decides which function to call based on types, a key part of Operator Overloading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can unary operators be overloaded?",
            options = listOf("Yes (e.g., ++)", "No", "Only --", "Only !"),
            correctAnswer = "Yes (e.g., ++)",
            explanation = "Operator Overloading supports unary forms like increment.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to distinguish prefix vs postfix ++?",
            options = listOf("Postfix takes a dummy int argument", "Prefix takes int", "Different names", "Cannot distinguish"),
            correctAnswer = "Postfix takes a dummy int argument",
            explanation = "This dummy parameter is a quirk of Operator Overloading syntax.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload '[]' (subscript)?",
            options = listOf("Yes", "No", "Only for vectors", "Only for ints"),
            correctAnswer = "Yes",
            explanation = "Operator Overloading of [] creates array-like objects.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload '()' (function call)?",
            options = listOf("Yes (Functors)", "No", "Only for lambdas", "Only for voids"),
            correctAnswer = "Yes (Functors)",
            explanation = "This creates 'function objects' via Operator Overloading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Must assignment (=) be a member function?",
            options = listOf("Yes", "No", "Can be friend", "Can be static"),
            correctAnswer = "Yes",
            explanation = "Operator Overloading for '=' must happen inside the class.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val ctorDtorQuestions = listOf(
        // ================= CONSTRUCTORS (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the primary job of a constructor?",
            options = listOf("Initialize objects", "Destroy objects", "Allocate heap memory only", "Return values"),
            correctAnswer = "Initialize objects",
            explanation = "Constructor Logic is automatically triggered to set initial values when an object is created. It ensures the object starts in a valid state.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a default constructor?",
            options = listOf("Takes no arguments", "Takes one argument", "Is private", "Is static"),
            correctAnswer = "Takes no arguments",
            explanation = "A Default Constructor can be called with no arguments. If you don't define one, the compiler may generate it for you.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "When is the copy constructor called?",
            options = listOf("When copying an object", "When creating a new class", "When deleting", "When moving"),
            correctAnswer = "When copying an object",
            explanation = "The Copy Constructor is invoked when initializing a new object from an existing one, such as passing by value.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the syntax for an initialization list?",
            options = listOf(": member(value)", ":: member(value)", "-> member(value)", "= member(value)"),
            correctAnswer = ": member(value)",
            explanation = "The Initialization List appears after the constructor signature (preceded by a colon) to initialize members before the body runs.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why use an initialization list for const members?",
            options = listOf("They cannot be assigned in the body", "It is faster", "It is required syntax", "All of the above"),
            correctAnswer = "All of the above",
            explanation = "Const members must be initialized at creation. An Initialization List is the only place to do this since assignment in the body is illegal.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can constructors return a value?",
            options = listOf("No", "Yes, int", "Yes, void", "Yes, the object"),
            correctAnswer = "No",
            explanation = "Constructor Logic does not allow a return type, not even void. Its sole purpose is initialization.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a conversion constructor?",
            options = listOf("Single-argument constructor", "Destructor", "Static function", "Copy constructor"),
            correctAnswer = "Single-argument constructor",
            explanation = "A single-argument constructor (without 'explicit') defines a conversion from that type to the class type. This is part of Constructor Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How do you prevent implicit conversion?",
            options = listOf("Use 'explicit'", "Use 'const'", "Use 'static'", "Use 'private'"),
            correctAnswer = "Use 'explicit'",
            explanation = "Marking a constructor 'explicit' prevents the compiler from using Constructor Logic for implicit type conversions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a constructor be private?",
            options = listOf("Yes", "No", "Only in structs", "Only in C"),
            correctAnswer = "Yes",
            explanation = "Private Constructor Logic restricts object creation, often used in Singleton patterns.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a delegating constructor (C++11)?",
            options = listOf("Calls another constructor of same class", "Calls destructor", "Calls parent", "Calls friend"),
            correctAnswer = "Calls another constructor of same class",
            explanation = "It allows one constructor to reuse the Constructor Logic of another to avoid code duplication.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does a static class have a constructor?",
            options = listOf("No", "Yes", "Only static constructor", "Only destructor"),
            correctAnswer = "Yes",
            explanation = "C++ classes are not 'static' like in C#. Even if used statically, standard Constructor Logic applies to instances.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Order of initialization in a list?",
            options = listOf("Order of declaration in class", "Order in the list", "Random", "Reverse declaration"),
            correctAnswer = "Order of declaration in class",
            explanation = "The Initialization List executes based on member declaration order, not the list order. This prevents dependency bugs.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a deep copy?",
            options = listOf("Copying pointed-to data", "Copying just the pointer", "Moving data", "Deleting data"),
            correctAnswer = "Copying pointed-to data",
            explanation = "A deep copy (implemented in Copy Constructor) duplicates the actual data on the heap, ensuring independence.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a shallow copy?",
            options = listOf("Copying just pointers/values", "Copying heap data", "Cloning", "Deep copy"),
            correctAnswer = "Copying just pointers/values",
            explanation = "The default Copy Constructor performs a shallow copy, which can lead to double-free errors if pointers are involved.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can constructors be virtual?",
            options = listOf("No", "Yes", "Only pure virtual", "Only in abstract classes"),
            correctAnswer = "No",
            explanation = "Virtual tables exist per object, but an object doesn't exist until Constructor Logic finishes. Thus, they cannot be virtual.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload constructors?",
            options = listOf("Yes", "No", "Only destructors", "Only copy constructors"),
            correctAnswer = "Yes",
            explanation = "Constructor Logic supports overloading, allowing objects to be initialized in multiple ways.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the 'Rule of Three'?",
            options = listOf("Destructor, Copy Constructor, Copy Assignment", "Public, Private, Protected", "Try, Catch, Throw", "Int, Float, Double"),
            correctAnswer = "Destructor, Copy Constructor, Copy Assignment",
            explanation = "If you define one (like a Copy Constructor), you likely need to define all three to manage resources correctly.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What initializes reference members?",
            options = listOf("Initialization List", "Constructor body", "Destructor", "Anywhere"),
            correctAnswer = "Initialization List",
            explanation = "References cannot be null or uninitialized, so they must be set in the Initialization List.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which constructor is 'T(T&&)'?",
            options = listOf("Move Constructor", "Copy Constructor", "Default Constructor", "Virtual Constructor"),
            correctAnswer = "Move Constructor",
            explanation = "This Constructor Logic transfers resources from a temporary object instead of copying them.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can constructor throw exceptions?",
            options = listOf("Yes", "No", "Only destructors", "Only default"),
            correctAnswer = "Yes",
            explanation = "Constructor Logic can throw. If it does, the destructor is not called, so you must handle partial cleanup.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= DESTRUCTORS (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What symbol precedes a destructor?",
            options = listOf("~", "!", "#", "-"),
            correctAnswer = "~",
            explanation = "The tilde (~) identifies Destructor Logic in C++.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can destructors take arguments?",
            options = listOf("No", "Yes", "Only int", "Only void"),
            correctAnswer = "No",
            explanation = "Destructor Logic is called automatically; you cannot pass arguments to it.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "When is a destructor called?",
            options = listOf("Object goes out of scope", "Program starts", "Loop begins", "Variable defined"),
            correctAnswer = "Object goes out of scope",
            explanation = "Destructor Logic runs automatically to clean up when the object's lifetime ends.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can destructors be virtual?",
            options = listOf("Yes", "No", "Only constructors", "Only static"),
            correctAnswer = "Yes",
            explanation = "Virtual Destructor Logic ensures derived class destructors are called when deleting via a base pointer.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if a base destructor is not virtual?",
            options = listOf("Derived destructor may not run (Undefined Behavior)", "Compilation error", "Nothing bad", "Program speeds up"),
            correctAnswer = "Derived destructor may not run (Undefined Behavior)",
            explanation = "Deleting a derived object via a base pointer without a virtual destructor skips Derived Destructor Logic.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload a destructor?",
            options = listOf("No", "Yes", "Only with int", "Only with void"),
            correctAnswer = "No",
            explanation = "A class can have only one Destructor Logic implementation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Should destructors throw exceptions?",
            options = listOf("No, never", "Yes, always", "Only logic errors", "If needed"),
            correctAnswer = "No, never",
            explanation = "Throwing from Destructor Logic during stack unwinding (another exception) causes immediate program termination.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a pure virtual destructor?",
            options = listOf("virtual ~T() = 0;", "virtual ~T();", "pure ~T();", "static ~T();"),
            correctAnswer = "virtual ~T() = 0;",
            explanation = "It makes the class abstract, but Destructor Logic must still be implemented for the base class.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Order of destruction in inheritance?",
            options = listOf("Derived first, then Base", "Base first, then Derived", "Random", "Parallel"),
            correctAnswer = "Derived first, then Base",
            explanation = "Destructor Logic works in reverse order of construction: child is destroyed before parent.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Order of destruction for members?",
            options = listOf("Reverse of declaration", "Order of declaration", "Random", "Alphabetical"),
            correctAnswer = "Reverse of declaration",
            explanation = "Destructor Logic destroys member variables in the exact reverse order they were created.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you call a destructor explicitly?",
            options = listOf("Yes (e.g., ptr->~T())", "No", "Only compiler can", "Only in main"),
            correctAnswer = "Yes (e.g., ptr->~T())",
            explanation = "Explicit Destructor Logic is rarely needed, usually only with placement new.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does the default destructor do?",
            options = listOf("Does nothing / Calls member destructors", "Deletes memory", "Prints output", "Zeros memory"),
            correctAnswer = "Does nothing / Calls member destructors",
            explanation = "Default Destructor Logic simply calls destructors for non-static members and bases.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is RAII in context of destructors?",
            options = listOf("Release resources in destructor", "Allocate in destructor", "Ignore resources", "Random Access"),
            correctAnswer = "Release resources in destructor",
            explanation = "RAII relies on Destructor Logic to automatically release locks, memory, or handles.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is the destructor called for malloc'd objects?",
            options = listOf("No", "Yes", "Depends on OS", "If passed to free"),
            correctAnswer = "No",
            explanation = "Malloc/free does not invoke Destructor Logic; only new/delete does.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'private destructor'?",
            options = listOf("Prevents stack allocation", "Prevents heap allocation", "Compiler error", "Default"),
            correctAnswer = "Prevents stack allocation",
            explanation = "If Destructor Logic is private, the object cannot go out of scope, forcing usage of 'delete' by a friend/member.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a destructor be static?",
            options = listOf("No", "Yes", "Only in C", "Only in Java"),
            correctAnswer = "No",
            explanation = "Destructor Logic operates on specific instances, so it cannot be static.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if a destructor is deleted (= delete)?",
            options = listOf("Object cannot be destroyed (compiler error)", "Runs faster", "No op", "Leak"),
            correctAnswer = "Object cannot be destroyed (compiler error)",
            explanation = "Disabling Destructor Logic prevents creating the object in any way that requires destruction.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does a union have a destructor?",
            options = listOf("Yes (C++11)", "No", "Only if int", "Only if static"),
            correctAnswer = "Yes (C++11)",
            explanation = "Destructor Logic works for unions, but you must manually handle active member destruction.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "When deleting a null pointer?",
            options = listOf("Safe (No-op)", "Crash", "Undefined Behavior", "Memory leak"),
            correctAnswer = "Safe (No-op)",
            explanation = "Destructor Logic checks for null; calling delete on nullptr is perfectly safe.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a destructor be 'const'?",
            options = listOf("No", "Yes", "Only virtual", "Only static"),
            correctAnswer = "No",
            explanation = "Destructor Logic modifies the object (by destroying it), so it cannot be const.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val derivedTemplateQuestions = listOf(
        // ================= INHERITANCE (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What symbol is used for inheritance?",
            options = listOf(":", "::", "->", "."),
            correctAnswer = ":",
            explanation = "The colon (:) is used in Inheritance Logic to specify the relationship between classes.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a Base Class?",
            options = listOf("The parent class", "The child class", "The main function", "A template"),
            correctAnswer = "The parent class",
            explanation = "A Base Class is the original class whose properties are inherited by another class.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a Derived Class?",
            options = listOf("A class that inherits from another", "The top-most class", "A static class", "A private class"),
            correctAnswer = "A class that inherits from another",
            explanation = "A Derived Class extends functionality by inheriting members from a parent.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "If you inherit as 'private', what happens to public members?",
            options = listOf("They become private", "They stay public", "They become protected", "They are deleted"),
            correctAnswer = "They become private",
            explanation = "In private Inheritance Logic, all public members of the parent become private in the child.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a Derived Class access private members of the Base Class?",
            options = listOf("No", "Yes", "Only if static", "Only if initialized"),
            correctAnswer = "No",
            explanation = "Private members of a Base Class are never accessible to the child directly.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is Multiple Inheritance?",
            options = listOf("One class inherits from multiple base classes", "Multiple classes inherit from one", "Nested inheritance", "Template inheritance"),
            correctAnswer = "One class inherits from multiple base classes",
            explanation = "Inheritance Logic supports a single Derived Class having more than one parent.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What problem does Virtual Inheritance solve?",
            options = listOf("Diamond Problem", "Memory leak", "Slow compilation", "Stack overflow"),
            correctAnswer = "Diamond Problem",
            explanation = "It ensures only one copy of the Base Class exists when using multiple inheritance.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Order of constructor calls in inheritance?",
            options = listOf("Base first, then Derived", "Derived first, then Base", "Random", "Simultaneous"),
            correctAnswer = "Base first, then Derived",
            explanation = "The Base Class must be fully initialized before the Derived Class constructor runs.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Order of destructor calls in inheritance?",
            options = listOf("Derived first, then Base", "Base first, then Derived", "Random", "Parallel"),
            correctAnswer = "Derived first, then Base",
            explanation = "Inheritance Logic dictates that destruction happens in exact reverse order of construction.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which keyword creates a subclass?",
            options = listOf("extends", "sub", ":", "implements"),
            correctAnswer = ":",
            explanation = "C++ uses the colon to denote a Derived Class relationship.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'protected' inheritance?",
            options = listOf("Public/Protected become Protected", "Everything becomes private", "Everything becomes public", "Error"),
            correctAnswer = "Public/Protected become Protected",
            explanation = "This Inheritance Logic restricts access levels for further derived classes.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is object slicing?",
            options = listOf("Assigning Derived to Base by value", "Cutting memory", "Deleting object", "Splitting arrays"),
            correctAnswer = "Assigning Derived to Base by value",
            explanation = "Only the Base Class part is copied, 'slicing' off the Derived Class data.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you inherit from a 'final' class (C++11)?",
            options = listOf("No", "Yes", "Only if public", "Only if virtual"),
            correctAnswer = "No",
            explanation = "Inheritance Logic forbids deriving from a class marked as 'final'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Do friends inherit?",
            options = listOf("No", "Yes", "Only if public", "Only if protected"),
            correctAnswer = "No",
            explanation = "Friendship is not transitive or inherited in standard Inheritance Logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to call a Base function overridden in Derived?",
            options = listOf("Base::func()", "super.func()", "parent.func()", "func()"),
            correctAnswer = "Base::func()",
            explanation = "You must explicitly qualify the Base Class scope to bypass the override.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'using' declaration in inheritance?",
            options = listOf("Exposes hidden base members", "Imports library", "Defines variable", "Error"),
            correctAnswer = "Exposes hidden base members",
            explanation = "It restores visibility of Base Class members hidden by name shadowing.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does a Derived Class inherit the constructor?",
            options = listOf("No (unless using Base::Base)", "Yes, always", "Only default", "Only copy"),
            correctAnswer = "No (unless using Base::Base)",
            explanation = "Constructors are not inherited by default in basic Inheritance Logic without 'using'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can static members be inherited?",
            options = listOf("Yes", "No", "Only if public", "Only if const"),
            correctAnswer = "Yes",
            explanation = "Static members of the Base Class are shared with the Derived Class.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'multilevel' inheritance?",
            options = listOf("A inherits B, B inherits C", "A inherits B and C", "A inherits nothing", "Loop inheritance"),
            correctAnswer = "A inherits B, B inherits C",
            explanation = "It is a chain of Inheritance Logic forming a hierarchy.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a hierarchical inheritance?",
            options = listOf("Multiple classes inherit from one base", "One class inherits from many", "Chain", "Loop"),
            correctAnswer = "Multiple classes inherit from one base",
            explanation = "Multiple Derived Class types share a single common Base Class.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= TEMPLATES (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the purpose of templates?",
            options = listOf("Generic Programming", "Faster compilation", "Code hiding", "Memory management"),
            correctAnswer = "Generic Programming",
            explanation = "Templates allow writing code independent of data types, enabling Generic Programming.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Keyword to declare a template?",
            options = listOf("template", "generic", "typename", "class"),
            correctAnswer = "template",
            explanation = "The 'template' keyword starts a Template Function or class declaration.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'template <typename T>'?",
            options = listOf("Defines a generic type T", "Defines a variable T", "Defines a class T", "Error"),
            correctAnswer = "Defines a generic type T",
            explanation = "It introduces 'T' as a placeholder type for a Template Function.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can templates have multiple parameters?",
            options = listOf("Yes (template <class T, class U>)", "No", "Only int parameters", "Only same types"),
            correctAnswer = "Yes (template <class T, class U>)",
            explanation = "Generic Programming allows multiple type placeholders.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is template specialization?",
            options = listOf("Custom logic for specific data type", "Deleting a template", "Compiling faster", "Using void"),
            correctAnswer = "Custom logic for specific data type",
            explanation = "It overrides the generic Template Function for a specific type like 'int' or 'char*'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Are templates compiled if not used?",
            options = listOf("No", "Yes", "Partially", "Always"),
            correctAnswer = "No",
            explanation = "A Template Function is instantiated by the compiler only when used.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you pass non-type arguments to templates?",
            options = listOf("Yes (e.g., template <int N>)", "No", "Only floats", "Only strings"),
            correctAnswer = "Yes (e.g., template <int N>)",
            explanation = "Generic Programming supports fixed values (like array size) as parameters.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which keyword is interchangeable with 'typename'?",
            options = listOf("class", "struct", "object", "type"),
            correctAnswer = "class",
            explanation = "In a Template Function declaration, 'class' and 'typename' mean the same thing.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a Function Template?",
            options = listOf("A blueprint for a function", "A generic variable", "A class", "A macro"),
            correctAnswer = "A blueprint for a function",
            explanation = "A Template Function allows generating functions for different types automatically.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can templates be split into .h and .cpp?",
            options = listOf("No (usually caused linker errors)", "Yes, easily", "Always required", "Only in C"),
            correctAnswer = "No (usually caused linker errors)",
            explanation = "Generic Programming usually requires definitions to be visible in headers for instantiation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is explicit instantiation?",
            options = listOf("Forcing compiler to create a version", "Deleting template", "Automatic creation", "Specialization"),
            correctAnswer = "Forcing compiler to create a version",
            explanation = "You can manually tell the compiler to build a Template Function for a type.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is partial specialization?",
            options = listOf("Specializing some parameters but not all", "Specializing function body", "Error", "Inheritance"),
            correctAnswer = "Specializing some parameters but not all",
            explanation = "It allows Generic Programming logic to be customized for subsets of types.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can virtual functions be templates?",
            options = listOf("No", "Yes", "Only in abstract classes", "Only if static"),
            correctAnswer = "No",
            explanation = "A Template Function cannot be virtual because the vtable size must be fixed.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'CRTP'?",
            options = listOf("Curiously Recurring Template Pattern", "Class Runtime Template", "Compile Time Pointer", "Code Reuse"),
            correctAnswer = "Curiously Recurring Template Pattern",
            explanation = "A Derived Class inherits from a template using itself as the argument.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a variadic template (C++11)?",
            options = listOf("Takes arbitrary number of arguments", "Takes variable types", "Takes no arguments", "Recursive"),
            correctAnswer = "Takes arbitrary number of arguments",
            explanation = "It enables Generic Programming with infinite parameter lists using '...'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is type deduction?",
            options = listOf("Compiler guesses T from arguments", "Programmer types T", "Error", "Runtime check"),
            correctAnswer = "Compiler guesses T from arguments",
            explanation = "In a Template Function, you often don't need to specify <int> explicitly.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you overload function templates?",
            options = listOf("Yes", "No", "Only with macros", "Only in classes"),
            correctAnswer = "Yes",
            explanation = "A Template Function can co-exist with regular functions or other templates.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Benefit of Generic Programming?",
            options = listOf("Code Reusability", "Less memory", "Faster runtime", "Simpler syntax"),
            correctAnswer = "Code Reusability",
            explanation = "Generic Programming allows one algorithm (like sort) to work on any data type.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is SFINAE?",
            options = listOf("Substitution Failure Is Not An Error", "Template Error", "System Fail", "Standard Input"),
            correctAnswer = "Substitution Failure Is Not An Error",
            explanation = "Advanced Template Function logic where invalid substitutions are silently ignored.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can static members exist in class templates?",
            options = listOf("Yes, separate copy for each type", "No", "Yes, one shared copy", "Only constants"),
            correctAnswer = "Yes, separate copy for each type",
            explanation = "In Generic Programming, each instantiated type gets its own static variables.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val exceptionQuestions = listOf(
        // ================= EXCEPTION BASICS (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the purpose of exception handling?",
            options = listOf("To handle runtime errors gracefully", "To fix compile errors", "To speed up code", "To ignore errors"),
            correctAnswer = "To handle runtime errors gracefully",
            explanation = "Exception Handling provides a mechanism to detect and resolve a runtime error without crashing the program.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which keyword signals an exception?",
            options = listOf("try", "catch", "throw", "signal"),
            correctAnswer = "throw",
            explanation = "The throw statement is used to raise an exception when a runtime error occurs.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Where do you place code that might fail?",
            options = listOf("In a try block", "In a catch block", "In a throw block", "In main only"),
            correctAnswer = "In a try block",
            explanation = "A try-catch block starts with 'try', wrapping code that might generate a runtime error.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What handles the exception?",
            options = listOf("The catch block", "The try block", "The compiler", "The OS"),
            correctAnswer = "The catch block",
            explanation = "The try-catch block concludes with 'catch', which executes code to recover from the exception.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you throw primitive types (int, char)?",
            options = listOf("Yes", "No", "Only int", "Only strings"),
            correctAnswer = "Yes",
            explanation = "The throw statement supports any type, though classes are preferred for better Exception Handling.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'catch(...)'?",
            options = listOf("Catch all handler", "Syntax error", "Catch null", "Catch void"),
            correctAnswer = "Catch all handler",
            explanation = "The ellipsis (...) acts as a catch all handler for any type of thrown exception.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if an exception is not caught?",
            options = listOf("Program terminates (abort)", "It is ignored", "Returns 0", "Compiler error"),
            correctAnswer = "Program terminates (abort)",
            explanation = "If Exception Handling fails to find a handler, std::terminate is called on the runtime error.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you have multiple catch blocks?",
            options = listOf("Yes", "No", "Only two", "Only nested"),
            correctAnswer = "Yes",
            explanation = "A try-catch block can have multiple catch clauses to handle different exception types.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Order of catch blocks matters because?",
            options = listOf("First match is executed", "All matches execute", "Random order", "Last match executes"),
            correctAnswer = "First match is executed",
            explanation = "Exception Handling checks catch blocks sequentially; derived classes must appear before base classes.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is stack unwinding?",
            options = listOf("Destructing objects as stack frames are removed", "Creating stack frames", "Memory leak", "Stack overflow"),
            correctAnswer = "Destructing objects as stack frames are removed",
            explanation = "During Exception Handling, local objects are destroyed automatically as the function stack exits.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a constructor throw an exception?",
            options = listOf("Yes", "No", "Only default", "Only copy"),
            correctAnswer = "Yes",
            explanation = "A throw statement in a constructor is valid; it cancels object creation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can a destructor throw an exception?",
            options = listOf("Should avoid (Dangerous)", "Yes, always", "No, never compiles", "Only virtual"),
            correctAnswer = "Should avoid (Dangerous)",
            explanation = "Throwing during stack unwinding (another runtime error) causes double-exception termination.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'rethrowing'?",
            options = listOf("throw;", "throw e;", "return;", "catch;"),
            correctAnswer = "throw;",
            explanation = "A bare throw statement inside a catch block passes the exception up the stack.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between 'throw e' and 'throw'?",
            options = listOf("Copy vs Original", "Same", "Throw is invalid", "Throw e is invalid"),
            correctAnswer = "Copy vs Original",
            explanation = "A bare throw statement preserves the original polymorphic type; 'throw e' might slice it.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which header defines standard exceptions?",
            options = listOf("<exception>", "<std>", "<error>", "<catch>"),
            correctAnswer = "<exception>",
            explanation = "This header is essential for standard Exception Handling classes like std::exception.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What function is called if no catch matches?",
            options = listOf("std::terminate", "main", "exit", "abort"),
            correctAnswer = "std::terminate",
            explanation = "When Exception Handling fails to find a handler, the runtime calls terminate.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can exceptions be thrown from global variables?",
            options = listOf("Yes, during initialization", "No", "Only functions", "Only int"),
            correctAnswer = "Yes, during initialization",
            explanation = "A runtime error can occur during static initialization before main starts.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Best practice for catching exceptions?",
            options = listOf("By reference (const &)", "By value", "By pointer", "By copy"),
            correctAnswer = "By reference (const &)",
            explanation = "Exception Handling by reference prevents object slicing and unnecessary copying.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the 'noexcept' keyword?",
            options = listOf("Function throws nothing", "Function throws everything", "Ignore errors", "Optimize"),
            correctAnswer = "Function throws nothing",
            explanation = "It promises no runtime error will escape, allowing compiler optimizations.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What if a noexcept function throws?",
            options = listOf("std::terminate is called immediately", "It is caught", "Ignored", "Warning"),
            correctAnswer = "std::terminate is called immediately",
            explanation = "Violating the noexcept guarantee bypasses normal Exception Handling stack unwinding.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= ADVANCED EXCEPTIONS (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'std::bad_alloc'?",
            options = listOf("Memory allocation failed", "File error", "Math error", "Type error"),
            correctAnswer = "Memory allocation failed",
            explanation = "This runtime error is thrown by 'new' when memory is exhausted.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is exception handling slow?",
            options = listOf("Only when exception is thrown", "Always slow", "Zero cost", "Faster than if"),
            correctAnswer = "Only when exception is thrown",
            explanation = "Modern Exception Handling has zero overhead on the 'happy path' (when no error occurs).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'function-try-block'?",
            options = listOf("Try block around entire function body", "Try inside loop", "Try in main", "Try in class"),
            correctAnswer = "Try block around entire function body",
            explanation = "It wraps the constructor body and initialization list in a try-catch block.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why use standard exceptions?",
            options = listOf("Consistency", "Speed", "Required", "Less memory"),
            correctAnswer = "Consistency",
            explanation = "Using std exceptions improves Exception Handling interoperability between libraries.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you throw 'nullptr'?",
            options = listOf("Yes", "No", "As int", "As void"),
            correctAnswer = "Yes",
            explanation = "A throw statement can take any value, even a null pointer.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is Exception Safety?",
            options = listOf("Code behaves correctly when exceptions occur", "Removing exceptions", "Catching everything", "Using noexcept"),
            correctAnswer = "Code behaves correctly when exceptions occur",
            explanation = "Effective Exception Handling ensures no leaks or corruption during a runtime error.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the Strong Guarantee?",
            options = listOf("Commit or rollback (no side effects on failure)", "No throw", "Basic guarantee", "No leaks"),
            correctAnswer = "Commit or rollback (no side effects on failure)",
            explanation = "If a runtime error occurs, the program state remains unchanged.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the No-Throw Guarantee?",
            options = listOf("Function never throws", "Function might throw", "Function catches all", "Function terminates"),
            correctAnswer = "Function never throws",
            explanation = "This is often enforced by 'noexcept' in Exception Handling.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does C support exceptions?",
            options = listOf("No", "Yes", "In C11", "In C99"),
            correctAnswer = "No",
            explanation = "C uses error codes; Exception Handling via try-catch is a C++ feature.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you try-catch across threads?",
            options = listOf("No, exceptions are thread-local", "Yes", "Using std::future", "Sometimes"),
            correctAnswer = "No, exceptions are thread-local",
            explanation = "A runtime error in one thread must be caught there, or transferred manually.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if new fails?",
            options = listOf("Throws std::bad_alloc", "Returns null", "Crashes", "Nothing"),
            correctAnswer = "Throws std::bad_alloc",
            explanation = "Standard 'new' uses the throw statement on failure.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'std::nothrow'?",
            options = listOf("Argument to new to return null on failure", "A macro", "A keyword", "A function"),
            correctAnswer = "Argument to new to return null on failure",
            explanation = "It suppresses the throw statement for allocation failures.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Purpose of 'what()' method?",
            options = listOf("Returns error description string", "Returns error code", "Returns type", "Returns nothing"),
            correctAnswer = "Returns error description string",
            explanation = "Standard exceptions provide 'what()' to describe the runtime error.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you inherit from std::exception?",
            options = listOf("Yes", "No", "Only in std", "Only if static"),
            correctAnswer = "Yes",
            explanation = "Custom classes often inherit it to integrate with standard Exception Handling.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'logic_error'?",
            options = listOf("Error due to bug in logic (e.g., invalid arg)", "Hardware failure", "Memory error", "IO error"),
            correctAnswer = "Error due to bug in logic (e.g., invalid arg)",
            explanation = "It represents a preventable runtime error caused by bad logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why should 'catch all' be last?",
            options = listOf("It hides specific handlers", "It is syntax rule", "It is faster", "It is safer"),
            correctAnswer = "It hides specific handlers",
            explanation = "If placed first, the catch all block intercepts everything, breaking polymorphic Exception Handling.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is 'throw' an expression or statement?",
            options = listOf("Expression (can be used in ternary)", "Statement only", "Function", "Variable"),
            correctAnswer = "Expression (can be used in ternary)",
            explanation = "The throw statement can technically be used as an expression in certain contexts.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'longjmp' respect C++ destructors?",
            options = listOf("No", "Yes", "Sometimes", "Only in C"),
            correctAnswer = "No",
            explanation = "Longjmp bypasses stack unwinding, breaking C++ Exception Handling safety.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can exceptions be nested?",
            options = listOf("Yes (try within catch)", "No", "Only one level", "Only in main"),
            correctAnswer = "Yes (try within catch)",
            explanation = "A try-catch block can contain another try-block inside it.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'std::current_exception'?",
            options = listOf("Captures exception pointer", "Returns int", "Throws exception", "Stops exception"),
            correctAnswer = "Captures exception pointer",
            explanation = "It captures the active runtime error to pass between threads.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val stlQuestions = listOf(
        // ================= VECTORS (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::vector essentially?",
            options = listOf("A dynamic array", "A linked list", "A hash map", "A binary tree"),
            correctAnswer = "A dynamic array",
            explanation = "std::vector represents a resizable array that manages memory automatically in Vector usage.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Time complexity of random access in a vector?",
            options = listOf("O(1)", "O(n)", "O(log n)", "O(n log n)"),
            correctAnswer = "O(1)",
            explanation = "Like C-arrays, Vector usage allows accessing elements by index in constant time.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens when a vector exceeds its capacity?",
            options = listOf("Reallocates larger block, copies elements", "Throws error", "Overwrites old data", "Stops working"),
            correctAnswer = "Reallocates larger block, copies elements",
            explanation = "Vector usage involves automatic reallocation when the internal buffer is full.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Benefit of 'vector::reserve()'?",
            options = listOf("Prevents unnecessary reallocations", "Sorts vector", "Clears vector", "Deletes vector"),
            correctAnswer = "Prevents unnecessary reallocations",
            explanation = "Optimizing Vector usage by pre-allocating memory reduces expensive copy operations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between size() and capacity()?",
            options = listOf("Elements used vs Total memory allocated", "Same thing", "Bytes vs Bits", "Height vs Width"),
            correctAnswer = "Elements used vs Total memory allocated",
            explanation = "In Vector usage, size is current count, capacity is potential count before resize.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is vector memory contiguous?",
            options = listOf("Yes, always", "No", "Only if static", "Only if int"),
            correctAnswer = "Yes, always",
            explanation = "Vector usage guarantees contiguous memory, allowing pointer arithmetic compatibility.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'vector::push_back' do?",
            options = listOf("Adds element to end", "Adds to front", "Removes from end", "Sorts"),
            correctAnswer = "Adds element to end",
            explanation = "This is the primary method for adding data in Vector usage.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'vector::at()' check bounds?",
            options = listOf("Yes, throws exception", "No, undefined behavior", "Yes, returns null", "No, crashes"),
            correctAnswer = "Yes, throws exception",
            explanation = "Safe Vector usage prefers 'at()' over '[]' to catch out-of-range errors.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Complexity of inserting at the beginning of a vector?",
            options = listOf("O(n)", "O(1)", "O(log n)", "O(n^2)"),
            correctAnswer = "O(n)",
            explanation = "Vector usage requires shifting all subsequent elements, making front insertion slow.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to access the raw pointer of a vector?",
            options = listOf("vec.data()", "vec.ptr()", "&vec", "vec.raw()"),
            correctAnswer = "vec.data()",
            explanation = "This function bridges Vector usage with C-style APIs expecting arrays.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= LISTS (8 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What data structure is std::list?",
            options = listOf("Doubly linked list", "Array", "Stack", "Queue"),
            correctAnswer = "Doubly linked list",
            explanation = "List usage allows efficient insertion/deletion anywhere but slow lookup.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Complexity of insertion in std::list?",
            options = listOf("O(1) (if iterator known)", "O(n)", "O(log n)", "O(n^2)"),
            correctAnswer = "O(1) (if iterator known)",
            explanation = "List usage excels at modification since it only involves pointer swaps.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does std::list support random access?",
            options = listOf("No", "Yes", "Only if sorted", "Only small lists"),
            correctAnswer = "No",
            explanation = "List usage requires sequential traversal; you cannot use index [] operators.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::forward_list?",
            options = listOf("Singly linked list", "Vector", "Double list", "Stack"),
            correctAnswer = "Singly linked list",
            explanation = "It is a specialized STL Container optimized for smaller memory overhead than std::list.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What keeps iterators valid after deletion?",
            options = listOf("List (except deleted node)", "Vector", "Deque", "None"),
            correctAnswer = "List (except deleted node)",
            explanation = "Stable iterators are a key advantage of List usage over vectors.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to sort a std::list?",
            options = listOf("list.sort() member function", "std::sort(list.begin, list.end)", "qsort", "Cannot sort"),
            correctAnswer = "list.sort() member function",
            explanation = "Standard algorithms don't work on List usage because iterators aren't random access.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'splice' in list?",
            options = listOf("Transfers elements from one list to another", "Cuts string", "Joins threads", "Copies list"),
            correctAnswer = "Transfers elements from one list to another",
            explanation = "Splice is a powerful List usage feature that moves nodes without copying data.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Memory overhead of list vs vector?",
            options = listOf("Higher (pointers per node)", "Lower", "Same", "Zero"),
            correctAnswer = "Higher (pointers per node)",
            explanation = "List usage consumes more RAM due to storing next/prev pointers.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= MAPS & SETS (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What underlies std::map?",
            options = listOf("Balanced Binary Search Tree (Red-Black)", "Hash Table", "Array", "Linked List"),
            correctAnswer = "Balanced Binary Search Tree (Red-Black)",
            explanation = "The Map container is typically implemented as a self-balancing tree.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Are map keys unique?",
            options = listOf("Yes", "No (use multimap)", "Only integers", "Only strings"),
            correctAnswer = "Yes",
            explanation = "Standard Map container enforces unique keys; duplicates overwrite old values.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Complexity of search in std::map?",
            options = listOf("O(log n)", "O(1)", "O(n)", "O(n^2)"),
            correctAnswer = "O(log n)",
            explanation = "Tree-based Map container structure ensures logarithmic lookup times.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does map[key] do if key is missing?",
            options = listOf("Inserts default value", "Throws error", "Returns null", "Crashes"),
            correctAnswer = "Inserts default value",
            explanation = "The [] operator in a Map container side-effect is creating an entry if not found.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between map and unordered_map?",
            options = listOf("Tree vs Hash Table", "Int vs Float", "Sorted vs Random", "None"),
            correctAnswer = "Tree vs Hash Table",
            explanation = "A standard Map container is sorted; unordered_map uses hashing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::set store?",
            options = listOf("Unique sorted keys", "Duplicates", "Key-Value pairs", "Arrays"),
            correctAnswer = "Unique sorted keys",
            explanation = "A set is an STL Container similar to a map but contains only keys.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::pair?",
            options = listOf("Holds two values", "Holds array", "A map", "A tree"),
            correctAnswer = "Holds two values",
            explanation = "It is a utility used heavily inside the Map container to store key-value tuples.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to check if key exists in map without adding?",
            options = listOf("map.find(key)", "map[key]", "map.exists()", "map.has()"),
            correctAnswer = "map.find(key)",
            explanation = "Using find() avoids the insertion side-effect of the [] operator in a Map container.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can map keys be modified?",
            options = listOf("No, keys are const", "Yes", "Only if int", "Only via pointer"),
            correctAnswer = "No, keys are const",
            explanation = "Modifying keys breaks the sorting order of the Map container.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is multimap?",
            options = listOf("Allows duplicate keys", "Multiple maps", "Fast map", "Small map"),
            correctAnswer = "Allows duplicate keys",
            explanation = "It is a Map container variant permitting multiple values for one key.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= GENERAL STL & HIERARCHY (12 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::deque?",
            options = listOf("Double-ended queue", "Single queue", "Stack", "Tree"),
            correctAnswer = "Double-ended queue",
            explanation = "The deque is an STL Container allowing fast insertion at both front and back.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an Adapter Container?",
            options = listOf("Stack, Queue, Priority Queue", "Vector", "List", "Map"),
            correctAnswer = "Stack, Queue, Priority Queue",
            explanation = "They restrict an underlying STL Container to a specific interface (e.g., LIFO).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Underlying container for std::stack by default?",
            options = listOf("deque", "vector", "list", "array"),
            correctAnswer = "deque",
            explanation = "The stack is an STL Container adapter that defaults to using a deque.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the 'diamond problem' in hierarchies?",
            options = listOf("Multiple inheritance ambiguity", "Memory leak", "UI issue", "Tree sort"),
            correctAnswer = "Multiple inheritance ambiguity",
            explanation = "It occurs in a Class Hierarchy when two parents share a common ancestor.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to solve diamond problem?",
            options = listOf("Virtual inheritance", "Static casting", "Private inheritance", "Deleting classes"),
            correctAnswer = "Virtual inheritance",
            explanation = "Virtual inheritance ensures the Class Hierarchy shares a single base instance.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'dynamic_cast' used for?",
            options = listOf("Safe downcasting in polymorphism", "Casting ints", "Allocating memory", "Static cast"),
            correctAnswer = "Safe downcasting in polymorphism",
            explanation = "It navigates a Class Hierarchy safely at runtime checking types.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an abstract base class?",
            options = listOf("Contains pure virtual function", "Hidden class", "Private class", "Template"),
            correctAnswer = "Contains pure virtual function",
            explanation = "It defines an interface in a Class Hierarchy without implementation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'std::array'?",
            options = listOf("Fixed size stack-based array wrapper", "Dynamic array", "List", "Pointer"),
            correctAnswer = "Fixed size stack-based array wrapper",
            explanation = "It is a safer, STL Container compatible version of C-style arrays.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'emplace_back'?",
            options = listOf("Constructs element in-place", "Copies element", "Moves element", "Deletes element"),
            correctAnswer = "Constructs element in-place",
            explanation = "It optimizes STL Container insertion by avoiding temporary object creation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does 'priority_queue' sort elements?",
            options = listOf("Keeps largest/smallest at top", "Fully sorts", "No order", "Random"),
            correctAnswer = "Keeps largest/smallest at top",
            explanation = "This STL Container adapter maintains heap property, usually max-heap.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'final' keyword for classes?",
            options = listOf("Prevents inheritance", "Prevents instantiation", "Makes constant", "Ends program"),
            correctAnswer = "Prevents inheritance",
            explanation = "It seals a Class Hierarchy, stopping further derivation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Iterator category of std::vector?",
            options = listOf("Random Access Iterator", "Bidirectional", "Forward", "Input"),
            correctAnswer = "Random Access Iterator",
            explanation = "Vector usage supports the most powerful iterator type.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val algoQuestions = listOf(
        // ================= ALGORITHMS (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which header file is needed for std::sort?",
            options = listOf("<algorithm>", "<vector>", "<math>", "<stdlib>"),
            correctAnswer = "<algorithm>",
            explanation = "The <algorithm> header defines the standard Sort function and others.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the time complexity of std::sort?",
            options = listOf("O(N log N)", "O(N^2)", "O(N)", "O(log N)"),
            correctAnswer = "O(N log N)",
            explanation = "The standard Sort function usually implements Introsort (QuickSort + HeapSort).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::find return if element is not found?",
            options = listOf("end() iterator", "begin() iterator", "NULL", "0"),
            correctAnswer = "end() iterator",
            explanation = "The Find function returns the 'end' iterator to signal failure.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which algorithm counts occurrences of a value?",
            options = listOf("std::count", "std::find", "std::size", "std::search"),
            correctAnswer = "std::count",
            explanation = "This STL Algorithm iterates through the range to count matches.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::binary_search do?",
            options = listOf("Checks if value exists in sorted range", "Sorts array", "Finds index", "Splits array"),
            correctAnswer = "Checks if value exists in sorted range",
            explanation = "It is an efficient STL Algorithm requiring O(log N) on sorted data.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Prerequisite for std::binary_search?",
            options = listOf("Range must be sorted", "Range must be random", "Size must be even", "None"),
            correctAnswer = "Range must be sorted",
            explanation = "This STL Algorithm fails or gives wrong results if data is unsorted.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::accumulate used for?",
            options = listOf("Summing elements", "Sorting", "Finding max", "Removing duplicates"),
            correctAnswer = "Summing elements",
            explanation = "It is a numeric STL Algorithm (found in <numeric>) for aggregation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::transform do?",
            options = listOf("Applies operation to range", "Moves elements", "Sorts range", "Deletes range"),
            correctAnswer = "Applies operation to range",
            explanation = "This STL Algorithm modifies elements based on a function or lambda.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between std::sort and std::stable_sort?",
            options = listOf("Stable sort preserves order of equal elements", "Sort is slower", "No difference", "Stable sort is recursive"),
            correctAnswer = "Stable sort preserves order of equal elements",
            explanation = "The Sort function variant 'stable_sort' guarantees relative ordering.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does std::remove actually delete elements?",
            options = listOf("No, it shifts elements and returns new end", "Yes, resizes container", "Yes, deletes memory", "Depends on OS"),
            correctAnswer = "No, it shifts elements and returns new end",
            explanation = "The STL Algorithm only moves data; you must call erase() to resize.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a predicate in algorithms?",
            options = listOf("Function returning bool", "Sorting order", "Iterator type", "Variable"),
            correctAnswer = "Function returning bool",
            explanation = "Many STL Algorithm functions use predicates to test conditions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::reverse do?",
            options = listOf("Inverses element order", "Sorts descending", "Swaps two items", "Clears range"),
            correctAnswer = "Inverses element order",
            explanation = "This STL Algorithm swaps elements to flip the sequence.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can std::sort work on a std::list?",
            options = listOf("No, list needs list::sort", "Yes", "Only if small", "Only with flags"),
            correctAnswer = "No, list needs list::sort",
            explanation = "The global Sort function requires random access iterators, which lists lack.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::unique used for?",
            options = listOf("Removes consecutive duplicates", "Finds unique element", "Sorts unique", "Counts unique"),
            correctAnswer = "Removes consecutive duplicates",
            explanation = "This STL Algorithm shifts unique elements to the front.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Algorithm to find max element?",
            options = listOf("std::max_element", "std::find_max", "std::top", "std::sort"),
            correctAnswer = "std::max_element",
            explanation = "This STL Algorithm returns an iterator to the largest item.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::copy do?",
            options = listOf("Copies range to destination", "Clones object", "Prints array", "Moves file"),
            correctAnswer = "Copies range to destination",
            explanation = "This STL Algorithm duplicates a sequence into an output iterator.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which algorithm shuffles a range?",
            options = listOf("std::shuffle", "std::random", "std::mix", "std::sort_random"),
            correctAnswer = "std::shuffle",
            explanation = "This STL Algorithm reorders elements randomly.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the lower_bound function?",
            options = listOf("First element not less than value", "Smallest element", "First element equal to value", "Index 0"),
            correctAnswer = "First element not less than value",
            explanation = "This specific Find function logic is used for binary searches.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::next_permutation?",
            options = listOf("Rearranges to next lexicographical order", "Sorts", "Randomizes", "Finds next pointer"),
            correctAnswer = "Rearranges to next lexicographical order",
            explanation = "It is a combinatorial STL Algorithm useful in competitive programming.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::fill?",
            options = listOf("Sets all elements to a value", "Fills memory with zeros", "Allocates memory", "Inputs data"),
            correctAnswer = "Sets all elements to a value",
            explanation = "This STL Algorithm assigns a specific value to every item in a range.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= ITERATORS & OBJECTS (20 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an iterator?",
            options = listOf("Object traversing a container", "A pointer to int", "A loop counter", "A function"),
            correctAnswer = "Object traversing a container",
            explanation = "Iterator logic generalizes the concept of pointers for containers.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does begin() return?",
            options = listOf("Iterator to first element", "Value of first element", "Size", "Void"),
            correctAnswer = "Iterator to first element",
            explanation = "It is the starting point for Iterator logic traversal.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does end() point to?",
            options = listOf("Past-the-last element", "Last element", "Null", "First element"),
            correctAnswer = "Past-the-last element",
            explanation = "Iterator logic uses a sentinel value, not the actual last item.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which iterator category is most powerful?",
            options = listOf("Random Access", "Forward", "Bidirectional", "Input"),
            correctAnswer = "Random Access",
            explanation = "Random Access Iterator logic supports constant time jumps (e.g., it + 5).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a const_iterator?",
            options = listOf("Cannot modify element pointed to", "Cannot move iterator", "Fast iterator", "Null iterator"),
            correctAnswer = "Cannot modify element pointed to",
            explanation = "This Iterator logic enforces read-only access to data.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a reverse_iterator?",
            options = listOf("Traverses backwards", "Inverse pointer", "Slow iterator", "Stack iterator"),
            correctAnswer = "Traverses backwards",
            explanation = "Used via rbegin()/rend(), this Iterator logic moves in reverse.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you subtract two Random Access Iterators?",
            options = listOf("Yes, gives distance", "No", "Only if const", "Only in list"),
            correctAnswer = "Yes, gives distance",
            explanation = "Advanced Iterator logic allows arithmetic like 'end - begin'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is iterator invalidation?",
            options = listOf("Iterator points to deleted/moved memory", "Iterator is null", "Iterator is finished", "Loop end"),
            correctAnswer = "Iterator points to deleted/moved memory",
            explanation = "Modifying containers can break existing Iterator logic pointers.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which loop uses iterators implicitly?",
            options = listOf("Range-based for loop", "While loop", "Do-while", "Goto"),
            correctAnswer = "Range-based for loop",
            explanation = "The For-each loop syntax (for x : container) uses begin/end under the hood.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a Functor (Function Object)?",
            options = listOf("Class overloading operator()", "A normal function", "A pointer", "A macro"),
            correctAnswer = "Class overloading operator()",
            explanation = "It is an object that acts like a function, often passed to a Sort function.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why use a functor over a function pointer?",
            options = listOf("Can hold state", "Faster syntax", "Less code", "Compulsory"),
            correctAnswer = "Can hold state",
            explanation = "Functors can store member variables, unlike raw pointers in STL Algorithm calls.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::distance do?",
            options = listOf("Calculates elements between iterators", "Sorts iterators", "Moves iterator", "Deletes range"),
            correctAnswer = "Calculates elements between iterators",
            explanation = "It helps calculate size using generic Iterator logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::advance?",
            options = listOf("Moves iterator by N steps", "Speeds up code", "Allocates memory", "Resets iterator"),
            correctAnswer = "Moves iterator by N steps",
            explanation = "It manually increments an iterator using appropriate Iterator logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'auto' do in a range loop?",
            options = listOf("Deduces element type", "Makes it faster", "Makes it const", "Nothing"),
            correctAnswer = "Deduces element type",
            explanation = "In a For-each loop, 'auto' avoids explicit type definitions.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to modify elements in a range loop?",
            options = listOf("Use reference (auto&)", "Use pointer", "Use const", "Cannot modify"),
            correctAnswer = "Use reference (auto&)",
            explanation = "A For-each loop works on copies unless you use a reference.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a stream iterator?",
            options = listOf("Iterates over IO streams", "Iterates memory", "Iterates video", "Null iterator"),
            correctAnswer = "Iterates over IO streams",
            explanation = "Iterator logic allows treating input/output like standard containers.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::back_inserter?",
            options = listOf("Iterator that pushes back", "Removes from back", "Sorts back", "Reads back"),
            correctAnswer = "Iterator that pushes back",
            explanation = "It creates a specialized iterator to append data in STL Algorithm usage.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is a pointer an iterator?",
            options = listOf("Yes, it is a Random Access Iterator", "No", "Only for char", "Only for void"),
            correctAnswer = "Yes, it is a Random Access Iterator",
            explanation = "Pointers natively satisfy all requirements of Iterator logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::for_each?",
            options = listOf("Applies function to range", "Loop keyword", "Sorts range", "Counts items"),
            correctAnswer = "Applies function to range",
            explanation = "It is an STL Algorithm version of a standard loop.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::bind?",
            options = listOf("Binds arguments to function", "Links files", "Merges lists", "Locks thread"),
            correctAnswer = "Binds arguments to function",
            explanation = "It creates a function object, often used with STL Algorithm calls.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val stringStreamQuestions = listOf(
        // ================= STRINGS (15 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which header defines the C++ string class?",
            options = listOf("<string>", "<cstring>", "<string.h>", "<text>"),
            correctAnswer = "<string>",
            explanation = "The <string> header is the standard library file required for C++ String Manipulation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What operator concatenates two C++ strings?",
            options = listOf("+", "&", ".", "cat"),
            correctAnswer = "+",
            explanation = "The '+' operator is overloaded to support easy joining in String Manipulation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to get the C-style string from std::string?",
            options = listOf(".c_str()", ".char()", ".toC()", ".ptr()"),
            correctAnswer = ".c_str()",
            explanation = "This function returns a const char* for compatibility with legacy String Manipulation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Difference between size() and length() in string?",
            options = listOf("None, they are synonyms", "Size includes null", "Length is bytes", "Size is capacity"),
            correctAnswer = "None, they are synonyms",
            explanation = "Both functions return the count of characters, a convenience in String Manipulation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is std::string mutable?",
            options = listOf("Yes", "No (Immutable)", "Only if static", "Only if global"),
            correctAnswer = "Yes",
            explanation = "Unlike Java or Python strings, C++ allows direct modification for efficient String Manipulation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does string::npos represent?",
            options = listOf("Not found / Invalid position", "Null pointer", "Zero", "End of string"),
            correctAnswer = "Not found / Invalid position",
            explanation = "It is returned by find functions to indicate failure in String Manipulation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to compare two C++ strings?",
            options = listOf("Using == operator", "Using strcmp", "Using .equals()", "Using compareTo"),
            correctAnswer = "Using == operator",
            explanation = "The == operator is overloaded to compare contents, simplifying String Manipulation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does substr(pos, len) do?",
            options = listOf("Returns substring starting at pos", "Deletes substring", "Finds substring", "Inserts substring"),
            correctAnswer = "Returns substring starting at pos",
            explanation = "It creates a new string from a portion of the original, vital for String Manipulation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is std::string null-terminated internally?",
            options = listOf("Usually yes (implementation detail)", "No", "Always no", "Only in C++98"),
            correctAnswer = "Usually yes (implementation detail)",
            explanation = "While .c_str() guarantees it, internal storage depends on String Manipulation implementation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the small string optimization (SSO)?",
            options = listOf("Storing short strings on stack/inside object", "Compression", "Caching", "Removing nulls"),
            correctAnswer = "Storing short strings on stack/inside object",
            explanation = "It avoids heap allocation for small text, speeding up String Manipulation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does string::at() check bounds?",
            options = listOf("Yes, throws exception", "No", "Returns null", "Crashes"),
            correctAnswer = "Yes, throws exception",
            explanation = "Safe String Manipulation uses at() to prevent accessing invalid memory.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to clear a string?",
            options = listOf(".clear()", ".empty()", ".delete()", ".remove()"),
            correctAnswer = ".clear()",
            explanation = "This function removes all characters, resetting the String Manipulation object.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What converts a number to string?",
            options = listOf("std::to_string()", "itoa", "sprintf", "str()"),
            correctAnswer = "std::to_string()",
            explanation = "Introduced in C++11, this helper simplifies numeric to String Manipulation conversion.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What converts string to integer?",
            options = listOf("std::stoi()", "atoi", "parse", "to_int"),
            correctAnswer = "std::stoi()",
            explanation = "It parses text into an integer, a common task in String Manipulation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::string_view (C++17)?",
            options = listOf("Lightweight non-owning reference to string", "A new string type", "A file viewer", "A copy"),
            correctAnswer = "Lightweight non-owning reference to string",
            explanation = "It provides read-only access without copying, optimizing String Manipulation performance.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= STREAMS & FILES (15 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which class handles output file stream?",
            options = listOf("ofstream", "ifstream", "fstream", "ostream"),
            correctAnswer = "ofstream",
            explanation = "The ofstream class is specific to output operations in a File Stream.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::getline do?",
            options = listOf("Reads a full line including spaces", "Reads one word", "Reads one char", "Writes a line"),
            correctAnswer = "Reads a full line including spaces",
            explanation = "The getline function extracts characters until a newline is found.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if file open fails?",
            options = listOf("Stream state sets failbit", "Throws exception (default)", "Crashes", "Creates file"),
            correctAnswer = "Stream state sets failbit",
            explanation = "You must check the File Stream state (e.g., is_open()) to detect errors.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Default mode for ofstream?",
            options = listOf("Truncate (overwrite)", "Append", "Read only", "Binary"),
            correctAnswer = "Truncate (overwrite)",
            explanation = "By default, opening an output File Stream clears existing content.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to open file for appending?",
            options = listOf("ios::app", "ios::add", "ios::end", "ios::trunc"),
            correctAnswer = "ios::app",
            explanation = "The app flag ensures all File Stream writes go to the end of the file.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is stringstream?",
            options = listOf("Treats string like a stream", "A file stream", "A specialized string", "A faster cout"),
            correctAnswer = "Treats string like a stream",
            explanation = "It allows using Input Stream operators (>> and <<) on string data.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'cin'?",
            options = listOf("Standard input stream object", "A function", "A file", "A keyword"),
            correctAnswer = "Standard input stream object",
            explanation = "It is the global instance of istream used for standard Input Stream operations.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Why use getline over cin >> s?",
            options = listOf("To read strings with spaces", "It is faster", "It uses less memory", "It handles ints"),
            correctAnswer = "To read strings with spaces",
            explanation = "The extraction operator >> stops at whitespace, while getline reads the whole line.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'eof()' check?",
            options = listOf("End of File reached", "Error on file", "Empty file", "End of line"),
            correctAnswer = "End of File reached",
            explanation = "It returns true if a File Stream read attempted to go past the end.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::cerr?",
            options = listOf("Unbuffered error stream", "Buffered output", "Input stream", "File stream"),
            correctAnswer = "Unbuffered error stream",
            explanation = "It writes immediately to the error output, distinct from the buffered Input Stream.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to reset stream error flags?",
            options = listOf("stream.clear()", "stream.reset()", "stream.ignore()", "stream.fix()"),
            correctAnswer = "stream.clear()",
            explanation = "You must call clear() to restore a File Stream to a working state after an error.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which manipulator sets float precision?",
            options = listOf("setprecision", "setw", "fixed", "hex"),
            correctAnswer = "setprecision",
            explanation = "Used with output streams to format floating point display in Input Stream logic.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does 'cin.ignore()' do?",
            options = listOf("Discards characters from input buffer", "Closes stream", "Resets flags", "Reads line"),
            correctAnswer = "Discards characters from input buffer",
            explanation = "It is useful to skip newline characters left in the Input Stream buffer.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can fstream handle both input and output?",
            options = listOf("Yes", "No, use ifstream/ofstream", "Only text", "Only binary"),
            correctAnswer = "Yes",
            explanation = "fstream derives from iostream, supporting read/write File Stream operations.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'binary' mode in files?",
            options = listOf("No newline translation", "Only 0s and 1s", "Faster", "Encrypted"),
            correctAnswer = "No newline translation",
            explanation = "Binary File Stream mode prevents OS-specific formatting of bytes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= NUMERICS (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which header defines numeric limits?",
            options = listOf("<limits>", "<numeric>", "<math>", "<int>"),
            correctAnswer = "<limits>",
            explanation = "The <limits> header is essential for finding the Numeric limit of types.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to find max int value?",
            options = listOf("numeric_limits<int>::max()", "INT_MAX", "max(int)", "limit(int)"),
            correctAnswer = "numeric_limits<int>::max()",
            explanation = "This is the C++ standard way to query a Numeric limit.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'NaN'?",
            options = listOf("Not a Number", "Null", "Negative", "Nine"),
            correctAnswer = "Not a Number",
            explanation = "It represents an undefined floating point value in Numeric limit standards.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'epsilon'?",
            options = listOf("Smallest difference between 1.0 and next float", "Zero", "Infinity", "Error code"),
            correctAnswer = "Smallest difference between 1.0 and next float",
            explanation = "It measures the precision capability of a floating point Numeric limit.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::iota do?",
            options = listOf("Fills range with sequential values", "Sorts", "Sums", "Randomizes"),
            correctAnswer = "Fills range with sequential values",
            explanation = "Found in <numeric>, it increments values sequentially.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is integer overflow standard behavior?",
            options = listOf("Undefined Behavior (signed), Wrap (unsigned)", "Always wraps", "Throws exception", "Crashes"),
            correctAnswer = "Undefined Behavior (signed), Wrap (unsigned)",
            explanation = "Exceeding the signed Numeric limit causes UB, while unsigned wraps around.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'infinity()' used for?",
            options = listOf("Returns representation of infinity", "Loops forever", "Max integer", "Error"),
            correctAnswer = "Returns representation of infinity",
            explanation = "Used with floating point types to check the Numeric limit for infinity.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Header for gcd and lcm (C++17)?",
            options = listOf("<numeric>", "<algorithm>", "<math>", "<limits>"),
            correctAnswer = "<numeric>",
            explanation = "Greatest Common Divisor is a function provided in the numeric header.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Result of numeric_limits<bool>::digits?",
            options = listOf("1", "8", "0", "2"),
            correctAnswer = "1",
            explanation = "A boolean stores only 1 bit of information (value), a specific Numeric limit.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Does numeric_limits work for custom classes?",
            options = listOf("Only if specialized", "Yes, automatically", "No, never", "Partially"),
            correctAnswer = "Only if specialized",
            explanation = "You must define the Numeric limit traits manually for user-defined types.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )


    val advancedQuestions = listOf(
        // ================= SMART POINTERS (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which smart pointer has exclusive ownership?",
            options = listOf("std::unique_ptr", "std::shared_ptr", "std::weak_ptr", "std::auto_ptr"),
            correctAnswer = "std::unique_ptr",
            explanation = "A Smart Pointer that cannot be copied, only moved, ensuring one owner.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::shared_ptr use to manage lifetime?",
            options = listOf("Reference counting", "Garbage collection", "Manual delete", "Stack allocation"),
            correctAnswer = "Reference counting",
            explanation = "This Smart Pointer tracks how many pointers own the object and deletes it when the count hits zero.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What problem does std::weak_ptr solve?",
            options = listOf("Cyclic references", "Memory leaks in unique_ptr", "Slow performance", "Null pointers"),
            correctAnswer = "Cyclic references",
            explanation = "It creates a non-owning reference, preventing the reference count from locking in a cycle.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What replaces std::auto_ptr in C++11?",
            options = listOf("std::unique_ptr", "std::scoped_ptr", "std::smart_ptr", "std::ptr"),
            correctAnswer = "std::unique_ptr",
            explanation = "Advanced C++ deprecated auto_ptr because its copy semantics were unsafe.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::make_shared?",
            options = listOf("Efficiently creates shared_ptr", "Creates unique_ptr", "Copies pointer", "Deletes pointer"),
            correctAnswer = "Efficiently creates shared_ptr",
            explanation = "It performs a single allocation for both the object and the control block.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can you pass a unique_ptr by value?",
            options = listOf("No, only by move", "Yes", "Only if const", "Only to void functions"),
            correctAnswer = "No, only by move",
            explanation = "Copying is disabled for unique_ptr to enforce exclusive ownership logic.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What happens if you copy a shared_ptr?",
            options = listOf("Ref count increments", "Deep copy", "Ref count decrements", "Compilation error"),
            correctAnswer = "Ref count increments",
            explanation = "Advanced C++ allows multiple owners sharing the same underlying resource.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "How to access the object in weak_ptr?",
            options = listOf(".lock()", ".get()", "Direct access", ".ptr()"),
            correctAnswer = ".lock()",
            explanation = "You must convert it to a shared_ptr using lock() to ensure the object exists.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is shared_ptr thread-safe?",
            options = listOf("Control block yes, access no", "Yes fully", "No", "Only for ints"),
            correctAnswer = "Control block yes, access no",
            explanation = "Reference counting is atomic, but modifying the object itself requires synchronization.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Size of unique_ptr vs raw pointer?",
            options = listOf("Same (usually)", "Double", "Triple", "Half"),
            correctAnswer = "Same (usually)",
            explanation = "A unique_ptr has zero overhead compared to a raw pointer in typical implementations.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= MOVE SEMANTICS & R-VALUES (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an Rvalue?",
            options = listOf("Temporary value (no name)", "Named variable", "Const variable", "Pointer"),
            correctAnswer = "Temporary value (no name)",
            explanation = "An Rvalue usually appears on the right side of an assignment.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::move do?",
            options = listOf("Casts to r-value reference", "Moves memory", "Copies data", "Deletes object"),
            correctAnswer = "Casts to r-value reference",
            explanation = "Move Semantics relies on casting to allow 'stealing' resources.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What implies Move Semantics?",
            options = listOf("&& operator", "& operator", "* operator", ":: operator"),
            correctAnswer = "&& operator",
            explanation = "Double ampersand (&&) denotes an r-value reference in function signatures.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Benefit of Move Constructor?",
            options = listOf("Eliminates deep copies", "Creates deep copies", "Allocates memory", "Thread safety"),
            correctAnswer = "Eliminates deep copies",
            explanation = "It transfers ownership of pointers, making vector resizing much faster.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "State of a moved-from object?",
            options = listOf("Valid but unspecified", "Null", "Deleted", "Unchanged"),
            correctAnswer = "Valid but unspecified",
            explanation = "Move Semantics leaves the source empty but safe to destroy.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is perfect forwarding?",
            options = listOf("Preserving value category (l/r-value)", "Perfect copying", "Fast moving", "Recursion"),
            correctAnswer = "Preserving value category (l/r-value)",
            explanation = "It uses std::forward to pass arguments exactly as received.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the Rule of Five?",
            options = listOf("Ctor, Dtor, Copy Ctor, Copy Assign, Move Ctor, Move Assign", "5 classes", "5 pointers", "5 threads"),
            correctAnswer = "Ctor, Dtor, Copy Ctor, Copy Assign, Move Ctor, Move Assign",
            explanation = "Advanced C++ requires defining move operations if you define copy operations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can 'const' objects be moved?",
            options = listOf("No, falls back to copy", "Yes, always", "Yes, dangerous", "Only ints"),
            correctAnswer = "No, falls back to copy",
            explanation = "Move Semantics requires modifying the source, which const prevents.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Is std::move expensive?",
            options = listOf("No, it's just a cast", "Yes, memory copy", "Depends on OS", "Uses heap"),
            correctAnswer = "No, it's just a cast",
            explanation = "The function itself does nothing at runtime; the optimization happens in the constructor it calls.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is an x-value?",
            options = listOf("Expiring value", "Unknown value", "Extra value", "Hex value"),
            correctAnswer = "Expiring value",
            explanation = "It is an object near the end of its lifetime, suitable for moving.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= LAMBDAS & FUNCTIONAL (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Syntax for a lambda?",
            options = listOf("[](){}", "(){}", "lambda {}", "func {}"),
            correctAnswer = "[](){}",
            explanation = "A Lambda Expression starts with a capture clause [].",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does [=] capture?",
            options = listOf("All local variables by value", "By reference", "Nothing", "Only this"),
            correctAnswer = "All local variables by value",
            explanation = "Lambda Expression capture lists control environment access.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does [&] capture?",
            options = listOf("All local variables by reference", "By value", "Global vars", "Static vars"),
            correctAnswer = "All local variables by reference",
            explanation = "It allows the Lambda Expression to modify local variables.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can lambdas be recursive?",
            options = listOf("Yes, with 'auto' (C++14)", "No", "Only in C", "Only if void"),
            correctAnswer = "Yes, with 'auto' (C++14)",
            explanation = "Using 'auto' for the parameter allows generic lambdas in Advanced C++.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a 'mutable' lambda?",
            options = listOf("Allows modifying value-captured variables", "Captures pointers", "Returns void", "Runs threads"),
            correctAnswer = "Allows modifying value-captured variables",
            explanation = "By default, value captures are const. Mutable removes this restriction.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::function?",
            options = listOf("Wrapper for any callable", "A function pointer", "A macro", "A thread"),
            correctAnswer = "Wrapper for any callable",
            explanation = "It stores lambdas, functors, or pointers in Advanced C++.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Type of a lambda expression?",
            options = listOf("Closure object (unnamed compiler type)", "std::function", "void*", "int"),
            correctAnswer = "Closure object (unnamed compiler type)",
            explanation = "Every Lambda Expression has a unique, anonymous type generated by the compiler.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Can lambdas return values?",
            options = listOf("Yes, deduced automatically", "No", "Only int", "Only string"),
            correctAnswer = "Yes, deduced automatically",
            explanation = "Advanced C++ infers the return type of the lambda body.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'init capture' (C++14)?",
            options = listOf("[x = 1]", "[x]", "[&x]", "[=]"),
            correctAnswer = "[x = 1]",
            explanation = "It allows creating new variables inside the capture clause of a Lambda Expression.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Lambda equivalent to function pointer?",
            options = listOf("Captureless lambda", "Mutable lambda", "Generic lambda", "All lambdas"),
            correctAnswer = "Captureless lambda",
            explanation = "A lambda with empty [] can decay to a raw function pointer.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),

        // ================= MULTITHREADING (10 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "Which header enables threading?",
            options = listOf("<thread>", "<process>", "<task>", "<parallel>"),
            correctAnswer = "<thread>",
            explanation = "The <thread> header introduced native Multithreading in C++11.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What must you do before a thread object destroys?",
            options = listOf("join() or detach()", "delete()", "stop()", "kill()"),
            correctAnswer = "join() or detach()",
            explanation = "Failing to join or detach causes std::terminate in Multithreading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::mutex?",
            options = listOf("Mutual exclusion lock", "A thread", "A variable", "A list"),
            correctAnswer = "Mutual exclusion lock",
            explanation = "It protects shared data from race conditions in Multithreading.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::lock_guard?",
            options = listOf("RAII wrapper for mutex", "A manual lock", "A thread killer", "A spinner"),
            correctAnswer = "RAII wrapper for mutex",
            explanation = "It automatically unlocks the mutex when scope ends, preventing deadlocks.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::atomic?",
            options = listOf("Thread-safe variable without locks", "A small int", "A bomb", "A mutex"),
            correctAnswer = "Thread-safe variable without locks",
            explanation = "It allows lock-free synchronization in Multithreading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What does std::async do?",
            options = listOf("Runs function asynchronously", "Sleeps", "Waits", "Locks"),
            correctAnswer = "Runs function asynchronously",
            explanation = "It simplifies Multithreading by managing thread creation and return values.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a Race Condition?",
            options = listOf("Concurrent access corrupting data", "Fast code", "Thread competition", "Winning thread"),
            correctAnswer = "Concurrent access corrupting data",
            explanation = "It is a critical bug in Multithreading when unsynchronized writes occur.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is Deadlock?",
            options = listOf("Threads waiting on each other forever", "Thread crash", "Thread finish", "Mutex lock"),
            correctAnswer = "Threads waiting on each other forever",
            explanation = "It happens when circular dependencies on locks exist.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::future?",
            options = listOf("Holds result of async operation", "A predicted value", "A thread", "A clock"),
            correctAnswer = "Holds result of async operation",
            explanation = "It allows retrieving values from a thread once execution finishes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is thread_local storage?",
            options = listOf("Variable unique to each thread", "Global variable", "Shared variable", "Local variable"),
            correctAnswer = "Variable unique to each thread",
            explanation = "In Multithreading, it gives every thread its own independent copy of a variable.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )

    val moreAdvancedQuestions = listOf(
        // ================= MODERN C++ FEATURES (25 Questions) =================
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a C++20 Concept?",
            options = listOf("Constrains template parameters", "New class type", "A documentation tool", "A multithreading tool"),
            correctAnswer = "Constrains template parameters",
            explanation = "Concepts in Advanced C++ restrict which types can be used in templates for better error messages.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is the spaceship operator (<=>)?",
            options = listOf("Three-way comparison", "Pointer to pointer", "Rocket launch", "Shift operator"),
            correctAnswer = "Three-way comparison",
            explanation = "Introduced in Advanced C++ (C++20), it simplifies comparison logic significantly.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::optional?",
            options = listOf("Wrapper that may or may not hold a value", "A pointer", "An option menu", "A thread"),
            correctAnswer = "Wrapper that may or may not hold a value",
            explanation = "It is a typesafe feature in Advanced C++ (C++17) avoiding the need for sentinel values or null pointers.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::variant?",
            options = listOf("Type-safe union", "A variable", "A template", "A list"),
            correctAnswer = "Type-safe union",
            explanation = "In Advanced C++, this holds one value from a set of types, replacing unsafe C-unions.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are Structured Bindings (C++17)?",
            options = listOf("Unpacking objects into variables", "Binding sockets", "Linking libraries", "Constructors"),
            correctAnswer = "Unpacking objects into variables",
            explanation = "A syntax in Advanced C++ like 'auto [x, y] = pair' to simplify accessing tuple-like structures.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::any?",
            options = listOf("Container for single value of any type", "A void pointer", "A template", "A boolean"),
            correctAnswer = "Container for single value of any type",
            explanation = "It provides type-safe storage for any copyable type in Advanced C++.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are Coroutines (C++20)?",
            options = listOf("Functions that can suspend/resume", "Threads", "Lambdas", "Virtual functions"),
            correctAnswer = "Functions that can suspend/resume",
            explanation = "An Advanced C++ feature enabling cooperative multitasking and generators.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is a Fold Expression (C++17)?",
            options = listOf("Simplifies operations on parameter packs", "Folds code", "Hides functions", "Recursive macro"),
            correctAnswer = "Simplifies operations on parameter packs",
            explanation = "It replaces recursive template instantiation for variadic templates in Advanced C++.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::filesystem?",
            options = listOf("Library for file/path operations", "System command", "Database", "Network"),
            correctAnswer = "Library for file/path operations",
            explanation = "Standardized in Advanced C++ (C++17) to handle directories and files portably.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'if constexpr'?",
            options = listOf("Compile-time conditional branching", "Runtime check", "A macro", "A loop"),
            correctAnswer = "Compile-time conditional branching",
            explanation = "It allows discarding dead branches at compile-time in Advanced C++ templates.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What implies 'Rvalue' category?",
            options = listOf("Can be moved from", "Must be copied", "Is constant", "Is static"),
            correctAnswer = "Can be moved from",
            explanation = "Advanced C++ uses Rvalue references to optimize resource transfer.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::string_view?",
            options = listOf("Non-owning string reference", "New string type", "Pointer", "Copy of string"),
            correctAnswer = "Non-owning string reference",
            explanation = "It avoids allocation overhead in Advanced C++ when passing strings read-only.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'consteval' (C++20)?",
            options = listOf("Function must execute at compile-time", "Same as constexpr", "Evaluates constants", "Runtime check"),
            correctAnswer = "Function must execute at compile-time",
            explanation = "It enforces stricter compile-time evaluation than constexpr in Advanced C++.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are C++20 Modules?",
            options = listOf("Replacement for header files", "Classes", "Namespaces", "Libraries"),
            correctAnswer = "Replacement for header files",
            explanation = "Advanced C++ modules improve compilation speed and isolation compared to includes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::invoke?",
            options = listOf("Uniformly calls any callable", "Starts thread", "Calls main", "Imports file"),
            correctAnswer = "Uniformly calls any callable",
            explanation = "It abstracts the difference between function pointers and member pointers in Advanced C++.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'decltype(auto)'?",
            options = listOf("Preserves ref/const qualifiers", "Same as auto", "Error", "Int type"),
            correctAnswer = "Preserves ref/const qualifiers",
            explanation = "It provides exact type deduction in Advanced C++ generic code.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::scoped_lock (C++17)?",
            options = listOf("Locks multiple mutexes safely", "Single lock", "Global lock", "Spinlock"),
            correctAnswer = "Locks multiple mutexes safely",
            explanation = "It prevents deadlocks in Multithreading when acquiring multiple locks at once.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::jthread (C++20)?",
            options = listOf("Auto-joining thread", "Java thread", "Jump thread", "Fast thread"),
            correctAnswer = "Auto-joining thread",
            explanation = "It simplifies Multithreading by automatically joining on destruction.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What are Ranges (C++20)?",
            options = listOf("Composable algorithms/views", "Arrays", "Lists", "Limits"),
            correctAnswer = "Composable algorithms/views",
            explanation = "They modernize STL algorithms in Advanced C++ allowing pipe syntax.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::byte (C++17)?",
            options = listOf("Type-safe byte representation", "Char", "Int", "Bit"),
            correctAnswer = "Type-safe byte representation",
            explanation = "It replaces 'char' or 'unsigned char' for raw memory access in Advanced C++.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'nodiscard'?",
            options = listOf("Warns if return value is ignored", "Prevents deletion", "Optimizes code", "Error"),
            correctAnswer = "Warns if return value is ignored",
            explanation = "An attribute in Advanced C++ encouraging better error handling hygiene.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is explicit bool operator?",
            options = listOf("Prevents unsafe conversions to int", "Converts to int", "Error", "Standard cast"),
            correctAnswer = "Prevents unsafe conversions to int",
            explanation = "It makes Smart Pointer logic safer in boolean contexts.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is std::launder?",
            options = listOf("Access memory reused within lifetime", "Cleans pointers", "Deletes memory", "Nulls memory"),
            correctAnswer = "Access memory reused within lifetime",
            explanation = "A niche Advanced C++ tool for optimization barriers and pointer safety.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is Copy Elision?",
            options = listOf("Compiler optimization removing copies", "Deleting copy constructor", "Shallow copy", "Deep copy"),
            correctAnswer = "Compiler optimization removing copies",
            explanation = "Guaranteed in C++17, it relates to Move Semantics and return value optimization.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId,
            questionText = "What is 'reference collapsing'?",
            options = listOf("Rule determining final ref type", "Deleting reference", "Null reference", "Stack error"),
            correctAnswer = "Rule determining final ref type",
            explanation = "It is fundamental to perfect forwarding and Rvalue logic in templates.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        )
    )


    return basicQuestions + typesQuestions + refStructQuestions + functionQuestions + namespaceQuestions + classOpQuestions + ctorDtorQuestions + derivedTemplateQuestions + exceptionQuestions + stlQuestions + algoQuestions + stringStreamQuestions + advancedQuestions + moreAdvancedQuestions
}