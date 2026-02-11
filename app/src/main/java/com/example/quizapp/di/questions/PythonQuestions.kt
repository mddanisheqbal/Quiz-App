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
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Who developed the Python programming language?",
        options = listOf("Dennis Ritchie", "Guido van Rossum", "James Gosling", "Bjarne Stroustrup"),
        correctAnswer = "Guido van Rossum",
        explanation = "Python was created by Guido van Rossum and released in 1991. He focused on simplicity and readability.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_002",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which symbol is used to start a comment in Python?",
        options = listOf("//", "#", "/*", "--"),
        correctAnswer = "#",
        explanation = "In Python, any text after # on a line is treated as a comment and ignored by the interpreter.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_003",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following is a valid Python variable name?",
        options = listOf("2value", "value-2", "_value2", "value 2"),
        correctAnswer = "_value2",
        explanation = "Variable names can start with an underscore and contain letters or digits, but not spaces or hyphens.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_004",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the output of: print(type(10))?",
        options = listOf("<class 'float'>", "<class 'str'>", "<class 'int'>", "<class 'bool'>"),
        correctAnswer = "<class 'int'>",
        explanation = "The value 10 is an integer literal, so its type is int.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_005",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which keyword is used to define a function in Python?",
        options = listOf("function", "def", "define", "fun"),
        correctAnswer = "def",
        explanation = "Functions in Python are defined using the def keyword followed by the function name.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_006",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What will be the output of: print(5 // 2)?",
        options = listOf("2.5", "2", "3", "Error"),
        correctAnswer = "2",
        explanation = "The // operator performs floor division and returns the integer quotient.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_007",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following data types is immutable?",
        options = listOf("List", "Dictionary", "Set", "Tuple"),
        correctAnswer = "Tuple",
        explanation = "Tuples cannot be modified after creation, unlike lists, sets, and dictionaries.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_008",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What does the input() function return?",
        options = listOf("Integer", "Float", "String", "Boolean"),
        correctAnswer = "String",
        explanation = "The input() function always returns user input as a string, even for numbers.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_009",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which operator is used for exponentiation in Python?",
        options = listOf("^", "**", "//", "%"),
        correctAnswer = "**",
        explanation = "Python uses the ** operator to raise a number to a power.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_010",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the output of: print(bool(0))?",
        options = listOf("True", "False", "0", "Error"),
        correctAnswer = "False",
        explanation = "In Python, 0 is treated as False when converted to boolean.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_011",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following is used to take multiple inputs in one line?",
        options = listOf("input()", "split()", "map()", "Both split() and map()"),
        correctAnswer = "Both split() and map()",
        explanation = "split() divides input into parts and map() converts them to desired types.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_012",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What will be the output of: print('Python'[1:4])?",
        options = listOf("Pyt", "yth", "tho", "ytho"),
        correctAnswer = "yth",
        explanation = "Slicing starts at index 1 and stops before index 4.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_013",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which statement is true about Python indentation?",
        options = listOf(
            "Indentation is optional",
            "Indentation is used only for readability",
            "Indentation defines code blocks",
            "Indentation is ignored by Python"
        ),
        correctAnswer = "Indentation defines code blocks",
        explanation = "Python uses indentation instead of braces to define blocks of code.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_014",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What will be the output of: print(type(True))?",
        options = listOf("<class 'bool'>", "<class 'int'>", "<class 'str'>", "<class 'float'>"),
        correctAnswer = "<class 'bool'>",
        explanation = "True is a boolean literal in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_015",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following will raise an error?",
        options = listOf("print(10)", "print('10')", "print(10 + 20)", "print(10 + '20')"),
        correctAnswer = "print(10 + '20')",
        explanation = "Python does not allow addition between int and string without conversion.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_016",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which keyword is used to check membership?",
        options = listOf("in", "has", "contains", "exists"),
        correctAnswer = "in",
        explanation = "The in keyword checks whether a value exists in a sequence.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_017",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the result of: type([])?",
        options = listOf("<class 'tuple'>", "<class 'list'>", "<class 'set'>", "<class 'dict'>"),
        correctAnswer = "<class 'list'>",
        explanation = "Square brackets [] represent a list in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_018",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following is NOT a Python keyword?",
        options = listOf("pass", "assert", "lambda", "eval"),
        correctAnswer = "eval",
        explanation = "eval is a built-in function, not a keyword.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_019",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What does len() return?",
        options = listOf("Total memory size", "Number of elements", "Index value", "Data type"),
        correctAnswer = "Number of elements",
        explanation = "len() returns the count of elements in a sequence or collection.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_020",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the output of: print(3 == 3.0)?",
        options = listOf("False", "Error", "True", "None"),
        correctAnswer = "True",
        explanation = "Python compares values, not types, when using ==.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_021",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which function converts a string to an integer?",
        options = listOf("str()", "float()", "int()", "bool()"),
        correctAnswer = "int()",
        explanation = "int() converts a numeric string into an integer.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_022",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What will be the output of: print('A' * 3)?",
        options = listOf("AAA", "A3", "Error", "None"),
        correctAnswer = "AAA",
        explanation = "String repetition is done using the * operator.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_023",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which statement about Python is correct?",
        options = listOf(
            "Python is compiled only",
            "Python is interpreted only",
            "Python is both compiled and interpreted",
            "Python is machine-level language"
        ),
        correctAnswer = "Python is both compiled and interpreted",
        explanation = "Python code is compiled to bytecode and then interpreted by the interpreter.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_024",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following creates an empty set?",
        options = listOf("{}", "[]", "set()", "()"),
        correctAnswer = "set()",
        explanation = "{} creates an empty dictionary, not a set.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_025",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the default value returned by a function without return?",
        options = listOf("0", "False", "None", "Error"),
        correctAnswer = "None",
        explanation = "If no return statement is used, Python returns None by default.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_026",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which operator has the highest precedence?",
        options = listOf("+", "*", "**", "//"),
        correctAnswer = "**",
        explanation = "Exponentiation has higher precedence than multiplication or addition.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_027",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the output of: print(bool('False'))?",
        options = listOf("False", "True", "Error", "None"),
        correctAnswer = "True",
        explanation = "Any non-empty string is considered True in boolean context.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_028",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following is used to get ASCII value?",
        options = listOf("ascii()", "ord()", "chr()", "hex()"),
        correctAnswer = "ord()",
        explanation = "ord() returns the ASCII value of a character.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_029",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which statement is correct about Python variables?",
        options = listOf(
            "Variables must be declared",
            "Variables are dynamically typed",
            "Variables store data types permanently",
            "Variables cannot change type"
        ),
        correctAnswer = "Variables are dynamically typed",
        explanation = "Python determines variable type at runtime and can change it later.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_030",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What will be the output of: print(10 % 3)?",
        options = listOf("1", "3", "0", "Error"),
        correctAnswer = "1",
        explanation = "The modulus operator returns the remainder after division.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_031",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following is a valid Python boolean?",
        options = listOf("true", "false", "TRUE", "True"),
        correctAnswer = "True",
        explanation = "Python boolean values are True and False with capital first letter.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_032",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What does id() return?",
        options = listOf("Value of variable", "Type of variable", "Memory address", "Size of variable"),
        correctAnswer = "Memory address",
        explanation = "id() returns the unique identity of an object, usually its memory address.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_033",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which function is used to get user output?",
        options = listOf("print()", "input()", "write()", "display()"),
        correctAnswer = "print()",
        explanation = "print() displays output to the screen.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_034",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the output of: print(type(None))?",
        options = listOf("<class 'NoneType'>", "<class 'null'>", "<class 'None'>", "<class 'void'>"),
        correctAnswer = "<class 'NoneType'>",
        explanation = "None is an object of NoneType in Python.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_035",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which symbol is used for logical AND?",
        options = listOf("&", "and", "&&", "AND"),
        correctAnswer = "and",
        explanation = "Python uses the word and as the logical AND operator.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_036",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the result of: 5 > 3 and 2 > 4?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "False",
        explanation = "The second condition is false, so the entire expression is false.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_037",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following statements is invalid?",
        options = listOf(
            "x = 10",
            "x, y = 1, 2",
            "x = y = 5",
            "x + y = 10"
        ),
        correctAnswer = "x + y = 10",
        explanation = "Assignment is not allowed to expressions in Python.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_038",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which function returns the Unicode character?",
        options = listOf("ord()", "ascii()", "chr()", "unicode()"),
        correctAnswer = "chr()",
        explanation = "chr() converts an ASCII or Unicode value to its character.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_039",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the output of: print(type(3.14))?",
        options = listOf("<class 'int'>", "<class 'float'>", "<class 'double'>", "<class 'decimal'>"),
        correctAnswer = "<class 'float'>",
        explanation = "Decimal numbers in Python are of type float.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_040",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following causes infinite loop?",
        options = listOf(
            "while True:",
            "for i in range(5):",
            "while False:",
            "for i in []:"
        ),
        correctAnswer = "while True:",
        explanation = "The condition True never becomes false unless explicitly broken.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_041",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which built-in function checks object identity?",
        options = listOf("==", "equals()", "is", "id"),
        correctAnswer = "is",
        explanation = "The is operator checks whether two variables refer to the same object.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_042",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What will be the output of: print(not 0)?",
        options = listOf("True", "False", "0", "Error"),
        correctAnswer = "True",
        explanation = "0 is False in boolean context, and not False becomes True.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_043",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which of the following is a Python literal?",
        options = listOf("x", "10", "print", "input"),
        correctAnswer = "10",
        explanation = "A literal directly represents a fixed value in code.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_044",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "What is the output of: print(type(type(int)))?",
        options = listOf("<class 'type'>", "<class 'int'>", "<class 'object'>", "<class 'meta'>"),
        correctAnswer = "<class 'type'>",
        explanation = "In Python, everything is an object, and type itself is of type 'type'.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_basics_045",
        categoryId = "python_python_basics",
        chapterId = PY_BASICS,
        questionText = "Which statement about Python is correct?",
        options = listOf(
            "Python uses braces for blocks",
            "Python does not support OOP",
            "Python is case-sensitive",
            "Python variables are fixed type"
        ),
        correctAnswer = "Python is case-sensitive",
        explanation = "Variable names like age and Age are treated as different in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))


    /* ---------- 2. Variables & Data Types ---------- */
    questions.add(pythonQuestion(
        id = "py_vars_001",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following correctly assigns a value to a variable in Python?",
        options = listOf("int a = 5", "a := 5", "a = 5", "5 = a"),
        correctAnswer = "a = 5",
        explanation = "Python assigns values using the = operator without declaring data types.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_002",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the data type of x after executing: x = 10?",
        options = listOf("float", "str", "int", "bool"),
        correctAnswer = "int",
        explanation = "The value 10 is an integer literal, so x becomes an int.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_003",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following variable names is INVALID?",
        options = listOf("_count", "count2", "2count", "count_2"),
        correctAnswer = "2count",
        explanation = "Variable names cannot start with a digit in Python.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_004",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the type of variable x after: x = 5.0?",
        options = listOf("int", "float", "double", "complex"),
        correctAnswer = "float",
        explanation = "Any number with a decimal point is treated as a float in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_005",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which data type is used to store True or False?",
        options = listOf("int", "str", "bool", "float"),
        correctAnswer = "bool",
        explanation = "Boolean data type stores only True or False values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_006",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the output of: type(3+4j)?",
        options = listOf("int", "float", "complex", "str"),
        correctAnswer = "complex",
        explanation = "Numbers with a real and imaginary part are of complex type.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_007",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is a mutable data type?",
        options = listOf("tuple", "str", "list", "int"),
        correctAnswer = "list",
        explanation = "Lists can be modified after creation, so they are mutable.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_008",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the default data type of input()?",
        options = listOf("int", "float", "str", "bool"),
        correctAnswer = "str",
        explanation = "input() always returns user input as a string.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_009",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following represents a tuple?",
        options = listOf("[1,2,3]", "{1,2,3}", "(1,2,3)", "{a:1}"),
        correctAnswer = "(1,2,3)",
        explanation = "Tuples are created using parentheses ().",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_010",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the type of x after: x = '10'?",
        options = listOf("int", "float", "str", "bool"),
        correctAnswer = "str",
        explanation = "Values inside quotes are treated as strings.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_011",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which function is used to check the data type of a variable?",
        options = listOf("datatype()", "type()", "id()", "check()"),
        correctAnswer = "type()",
        explanation = "type() returns the data type of the given variable.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_012",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which data type stores key-value pairs?",
        options = listOf("list", "tuple", "set", "dict"),
        correctAnswer = "dict",
        explanation = "Dictionary stores data in key-value pair format.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_013",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the output of: type(True)?",
        options = listOf("int", "bool", "str", "float"),
        correctAnswer = "bool",
        explanation = "True is a boolean literal in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_014",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is an immutable data type?",
        options = listOf("list", "set", "dict", "tuple"),
        correctAnswer = "tuple",
        explanation = "Tuples cannot be changed after creation.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_015",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the result of: x = y = 5?",
        options = listOf(
            "x gets 5, y gets 0",
            "y gets 5, x gets 0",
            "Both x and y get 5",
            "Syntax Error"
        ),
        correctAnswer = "Both x and y get 5",
        explanation = "Python allows multiple assignment in a single statement.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_016",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following creates an empty dictionary?",
        options = listOf("{}", "[]", "()", "set()"),
        correctAnswer = "{}",
        explanation = "{} represents an empty dictionary in Python.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_017",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the type of: None?",
        options = listOf("null", "void", "NoneType", "bool"),
        correctAnswer = "NoneType",
        explanation = "None is a special object of type NoneType.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_018",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which conversion converts a string '123' into integer?",
        options = listOf("str()", "float()", "int()", "bool()"),
        correctAnswer = "int()",
        explanation = "int() converts numeric strings into integers.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_019",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is NOT a numeric data type?",
        options = listOf("int", "float", "complex", "str"),
        correctAnswer = "str",
        explanation = "Strings store text, not numeric values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_020",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the output of: type(5/2)?",
        options = listOf("int", "float", "complex", "bool"),
        correctAnswer = "float",
        explanation = "Division using / always returns a float in Python.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_021",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which data type does not allow duplicate values?",
        options = listOf("list", "tuple", "set", "str"),
        correctAnswer = "set",
        explanation = "Sets store only unique elements.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_022",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is a dynamic typing feature?",
        options = listOf(
            "Variables need declaration",
            "Same variable can change type",
            "Fixed memory allocation",
            "Compile-time typing"
        ),
        correctAnswer = "Same variable can change type",
        explanation = "Python allows variables to change data type during execution.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_023",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the type of x after: x = True + 1?",
        options = listOf("bool", "int", "float", "error"),
        correctAnswer = "int",
        explanation = "True is treated as 1 in arithmetic operations.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_024",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which function returns the memory identity of an object?",
        options = listOf("type()", "id()", "hash()", "mem()"),
        correctAnswer = "id()",
        explanation = "id() returns the unique identity of an object.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_025",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which data type is ordered?",
        options = listOf("set", "dict", "list", "NoneType"),
        correctAnswer = "list",
        explanation = "Lists maintain insertion order of elements.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_026",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What does type casting mean?",
        options = listOf(
            "Creating variables",
            "Changing variable names",
            "Converting one data type to another",
            "Deleting variables"
        ),
        correctAnswer = "Converting one data type to another",
        explanation = "Type casting converts data from one type to another.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_027",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following cannot be a dictionary key?",
        options = listOf("int", "str", "tuple", "list"),
        correctAnswer = "list",
        explanation = "Dictionary keys must be immutable, and lists are mutable.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_028",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the result of: bool('')?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "False",
        explanation = "An empty string is treated as False in boolean context.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_029",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following represents a float?",
        options = listOf("5", "5.0", "'5.0'", "True"),
        correctAnswer = "5.0",
        explanation = "A number with decimal point is a float.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_030",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which statement about Python variables is correct?",
        options = listOf(
            "Variables are statically typed",
            "Variables store memory addresses",
            "Variables can change type",
            "Variables need declaration"
        ),
        correctAnswer = "Variables can change type",
        explanation = "Python supports dynamic typing.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_031",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the type of: x = (1)?",
        options = listOf("tuple", "int", "list", "set"),
        correctAnswer = "int",
        explanation = "(1) is treated as integer, not a tuple.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_032",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following creates a tuple with one element?",
        options = listOf("(1)", "(1,)", "[1]", "{1}"),
        correctAnswer = "(1,)",
        explanation = "A trailing comma is required for single-element tuples.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_033",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is an integer literal?",
        options = listOf("3.14", "'10'", "10", "True"),
        correctAnswer = "10",
        explanation = "10 directly represents an integer value.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_034",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the output of: type([])?",
        options = listOf("list", "tuple", "set", "dict"),
        correctAnswer = "list",
        explanation = "Square brackets represent a list.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_035",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is a numeric data type?",
        options = listOf("str", "list", "bool", "int"),
        correctAnswer = "int",
        explanation = "int represents numeric integer values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_036",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the output of: type({})?",
        options = listOf("set", "dict", "list", "tuple"),
        correctAnswer = "dict",
        explanation = "{} creates an empty dictionary.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_037",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which data type supports indexing?",
        options = listOf("set", "int", "list", "NoneType"),
        correctAnswer = "list",
        explanation = "Lists allow indexed access to elements.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_038",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following represents a set?",
        options = listOf("{1,2,3}", "[1,2,3]", "(1,2,3)", "{a:1}"),
        correctAnswer = "{1,2,3}",
        explanation = "Sets are written using curly braces without key-value pairs.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_039",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the type of: x = 5 < 3?",
        options = listOf("int", "bool", "float", "str"),
        correctAnswer = "bool",
        explanation = "Comparison operations return boolean values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_040",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is NOT mutable?",
        options = listOf("list", "set", "dict", "str"),
        correctAnswer = "str",
        explanation = "Strings cannot be modified once created.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_041",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What does dynamic typing mean in Python?",
        options = listOf(
            "Type checking at compile time",
            "Variable type fixed forever",
            "Type decided at runtime",
            "Manual memory allocation"
        ),
        correctAnswer = "Type decided at runtime",
        explanation = "Python assigns data types during execution.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_042",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following is a valid multiple assignment?",
        options = listOf("a = b = c = 5", "a,b = 5", "a == b == 5", "a => b"),
        correctAnswer = "a = b = c = 5",
        explanation = "Python allows chaining assignments.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_043",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What is the type of: x = {1,2,2,3}?",
        options = listOf("list", "tuple", "set", "dict"),
        correctAnswer = "set",
        explanation = "Duplicate values are automatically removed in sets.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_044",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "Which of the following statements is true?",
        options = listOf(
            "Python variables need declaration",
            "Python is statically typed",
            "Python supports dynamic typing",
            "Python has no data types"
        ),
        correctAnswer = "Python supports dynamic typing",
        explanation = "Variable types are decided at runtime in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_vars_045",
        categoryId = "python_variables_and_data_types",
        chapterId = PY_VARS_DATA_TYPES,
        questionText = "What will be the output of: type(10 == 10)?",
        options = listOf("int", "bool", "float", "str"),
        correctAnswer = "bool",
        explanation = "Comparison expressions always return boolean values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))


    /* ---------- 3. Operators ---------- */
    questions.add(pythonQuestion(
        id = "py_ops_001",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used for addition in Python?",
        options = listOf("*", "+", "-", "/"),
        correctAnswer = "+",
        explanation = "The + operator is used to add two operands in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_002",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What will be the output of: 10 / 2?",
        options = listOf("5", "5.0", "Error", "None"),
        correctAnswer = "5.0",
        explanation = "The / operator always returns a float in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_003",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator gives the remainder of division?",
        options = listOf("/", "//", "%", "**"),
        correctAnswer = "%",
        explanation = "The modulus operator % returns the remainder.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_004",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 7 // 2?",
        options = listOf("3.5", "4", "3", "Error"),
        correctAnswer = "3",
        explanation = "// performs floor division and returns the integer result.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_005",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used for exponentiation?",
        options = listOf("^", "**", "//", "%"),
        correctAnswer = "**",
        explanation = "** raises a number to the power of another.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_006",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What will be the output of: 2 ** 3 ** 2?",
        options = listOf("64", "512", "16", "256"),
        correctAnswer = "512",
        explanation = "Exponentiation is right-associative: 2 ** (3 ** 2).",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_007",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator checks equality of values?",
        options = listOf("=", "==", "!=", "is"),
        correctAnswer = "==",
        explanation = "== compares values for equality.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_008",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the result of: 5 != 3?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "True",
        explanation = "!= checks for inequality between values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_009",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator checks object identity?",
        options = listOf("==", "equals", "is", "id"),
        correctAnswer = "is",
        explanation = "is checks whether two variables refer to the same object.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_010",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What will be the output of: 3 < 5 <= 5?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "True",
        explanation = "Python supports chained comparisons.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_011",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used for logical AND?",
        options = listOf("&", "&&", "and", "AND"),
        correctAnswer = "and",
        explanation = "Python uses the keyword and for logical AND.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_012",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: True and False?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "False",
        explanation = "Logical AND returns True only if both operands are True.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_013",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used for logical OR?",
        options = listOf("|", "||", "or", "OR"),
        correctAnswer = "or",
        explanation = "or returns True if at least one condition is True.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_014",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What will be the output of: not True?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "False",
        explanation = "not negates the boolean value.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_015",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used to assign a value?",
        options = listOf("==", "=", ":=", "=>"),
        correctAnswer = "=",
        explanation = "= assigns a value to a variable.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_016",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What does the += operator do?",
        options = listOf(
            "Adds two variables",
            "Assigns value",
            "Adds and assigns",
            "Compares values"
        ),
        correctAnswer = "Adds and assigns",
        explanation = "+= adds the value and assigns it back to the variable.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_017",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: x=5; x+=3; print(x)?",
        options = listOf("8", "5", "3", "Error"),
        correctAnswer = "8",
        explanation = "x+=3 adds 3 to x and stores the result.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_018",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator performs bitwise AND?",
        options = listOf("and", "&&", "&", "|"),
        correctAnswer = "&",
        explanation = "& performs bitwise AND on integers.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_019",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 5 & 3?",
        options = listOf("1", "5", "3", "0"),
        correctAnswer = "1",
        explanation = "5 (101) & 3 (011) gives 001.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_020",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator performs bitwise OR?",
        options = listOf("or", "||", "|", "&"),
        correctAnswer = "|",
        explanation = "| performs bitwise OR operation.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_021",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator performs left shift?",
        options = listOf("<<", ">>", "&", "^"),
        correctAnswer = "<<",
        explanation = "<< shifts bits to the left.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_022",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 4 << 1?",
        options = listOf("2", "4", "8", "16"),
        correctAnswer = "8",
        explanation = "Left shift multiplies the number by 2.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_023",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator checks membership in a sequence?",
        options = listOf("has", "in", "contains", "exists"),
        correctAnswer = "in",
        explanation = "in checks whether a value exists in a sequence.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_024",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 'a' in 'apple'?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "True",
        explanation = "'a' exists in the string 'apple'.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_025",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator checks non-membership?",
        options = listOf("!", "not in", "is not", "!="),
        correctAnswer = "not in",
        explanation = "not in checks if a value is absent from a sequence.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_026",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator has the highest precedence?",
        options = listOf("+", "*", "**", "//"),
        correctAnswer = "**",
        explanation = "Exponentiation has the highest precedence.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_027",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 10 > 5 and 5 > 20?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "False",
        explanation = "The second condition is false, so the result is False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_028",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator performs bitwise XOR?",
        options = listOf("^", "|", "&", "~"),
        correctAnswer = "^",
        explanation = "^ performs XOR on binary values.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_029",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 5 ^ 3?",
        options = listOf("6", "8", "1", "15"),
        correctAnswer = "6",
        explanation = "5 (101) XOR 3 (011) gives 110 which is 6.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_030",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator performs bitwise NOT?",
        options = listOf("!", "~", "^", "-"),
        correctAnswer = "~",
        explanation = "~ inverts all bits of the number.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_031",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: ~5?",
        options = listOf("5", "-6", "6", "-5"),
        correctAnswer = "-6",
        explanation = "~x equals -(x+1) in Python.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_032",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator compares both value and type?",
        options = listOf("==", "!=", "is", "="),
        correctAnswer = "is",
        explanation = "is checks object identity, not just value.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_033",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 3 == 3.0?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "True",
        explanation = "== compares values, not data types.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_034",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used for floor division?",
        options = listOf("/", "%", "//", "**"),
        correctAnswer = "//",
        explanation = "// returns the integer quotient.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_035",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What will be the output of: 9 // 2?",
        options = listOf("4", "4.5", "5", "Error"),
        correctAnswer = "4",
        explanation = "Floor division discards the decimal part.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_036",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is used for string repetition?",
        options = listOf("+", "*", "%", "**"),
        correctAnswer = "*",
        explanation = "* repeats the string specified number of times.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_037",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 'Hi' * 3?",
        options = listOf("HiHiHi", "Hi3", "Error", "None"),
        correctAnswer = "HiHiHi",
        explanation = "String repetition works using * operator.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_038",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator has lower precedence?",
        options = listOf("**", "*", "+", "/"),
        correctAnswer = "+",
        explanation = "Addition has lower precedence than multiplication and exponentiation.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_039",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: not 0?",
        options = listOf("True", "False", "0", "Error"),
        correctAnswer = "True",
        explanation = "0 is False in boolean context, so not False is True.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_040",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is overloaded for concatenating strings?",
        options = listOf("*", "+", "%", "//"),
        correctAnswer = "+",
        explanation = "+ concatenates strings in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_041",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 'A' + 'B'?",
        options = listOf("AB", "A B", "Error", "None"),
        correctAnswer = "AB",
        explanation = "The + operator joins strings.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_042",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator cannot be overloaded?",
        options = listOf("+", "*", "=", "**"),
        correctAnswer = "=",
        explanation = "Assignment operator cannot be overloaded in Python.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_043",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the output of: 10 >= 10?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "True",
        explanation = ">= checks greater than or equal to.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_044",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "Which operator is evaluated last?",
        options = listOf("**", "*", "+", "//"),
        correctAnswer = "+",
        explanation = "Addition has the lowest precedence among these.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ops_045",
        categoryId = "python_operators",
        chapterId = PY_OPERATORS,
        questionText = "What is the result of: False or True and False?",
        options = listOf("True", "False", "Error", "None"),
        correctAnswer = "False",
        explanation = "and is evaluated before or, so True and False gives False.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))


    /* ---------- 4. Conditional Statements ---------- */
    questions.add(pythonQuestion(
        id = "py_cond_001",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which keyword is used to check a condition in Python?",
        options = listOf("check", "if", "when", "case"),
        correctAnswer = "if",
        explanation = "The if keyword is used to execute code based on a condition.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_002",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which keyword is used when the if condition is false?",
        options = listOf("elif", "else", "otherwise", "default"),
        correctAnswer = "else",
        explanation = "else runs when the if condition evaluates to False.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_003",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which keyword is used to check multiple conditions?",
        options = listOf("elseif", "elif", "else if", "switch"),
        correctAnswer = "elif",
        explanation = "elif allows checking multiple conditions sequentially.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_004",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What will be the output of: if 0: print('Hi') else: print('Bye')?",
        options = listOf("Hi", "Bye", "0", "Error"),
        correctAnswer = "Bye",
        explanation = "0 is treated as False, so else block executes.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_005",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which data type is evaluated as False in condition?",
        options = listOf("1", "'False'", "[]", "True"),
        correctAnswer = "[]",
        explanation = "Empty collections like lists evaluate to False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_006",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if True: print(1); print(2)?",
        options = listOf("1", "2", "1 2", "Error"),
        correctAnswer = "1 2",
        explanation = "Both print statements execute since condition is True.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_007",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which of the following is mandatory in an if statement?",
        options = listOf("else", "elif", "condition", "indentation"),
        correctAnswer = "condition",
        explanation = "An if statement must have a condition to evaluate.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_008",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What will be the output of: if '': print('Yes') else: print('No')?",
        options = listOf("Yes", "No", "Error", "None"),
        correctAnswer = "No",
        explanation = "Empty string is treated as False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_009",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which symbol ends an if condition line?",
        options = listOf(";", "{", ":", "."),
        correctAnswer = ":",
        explanation = "A colon is required after if, elif, and else conditions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_010",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What happens if indentation is incorrect in if block?",
        options = listOf("Logical error", "Runtime error", "IndentationError", "Ignored"),
        correctAnswer = "IndentationError",
        explanation = "Python strictly enforces indentation rules.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_011",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which of the following is a valid if statement?",
        options = listOf(
            "if x > 5 print(x)",
            "if (x > 5): print(x)",
            "if x > 5: print(x)",
            "if x > 5 then print(x)"
        ),
        correctAnswer = "if x > 5: print(x)",
        explanation = "Python does not require parentheses around conditions.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_012",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if None: print('A') else: print('B')?",
        options = listOf("A", "B", "None", "Error"),
        correctAnswer = "B",
        explanation = "None is treated as False in conditions.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_013",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "How many else blocks can an if statement have?",
        options = listOf("0", "1", "2", "Unlimited"),
        correctAnswer = "1",
        explanation = "An if statement can have only one else block.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_014",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "How many elif blocks are allowed?",
        options = listOf("0", "1", "2", "Unlimited"),
        correctAnswer = "Unlimited",
        explanation = "Multiple elif blocks can be used after if.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_015",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if 5 > 3: print('Yes')?",
        options = listOf("Yes", "No", "Error", "None"),
        correctAnswer = "Yes",
        explanation = "The condition evaluates to True.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_016",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which operator is commonly used in conditions?",
        options = listOf("=", "==", ":=", "=>"),
        correctAnswer = "==",
        explanation = "== compares values inside conditions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_017",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What will be the output of: if 3: print('Hi')?",
        options = listOf("Hi", "False", "Error", "Nothing"),
        correctAnswer = "Hi",
        explanation = "Any non-zero number is treated as True.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_018",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which of the following is False in Python?",
        options = listOf("0", "1", "'0'", "True"),
        correctAnswer = "0",
        explanation = "0 is considered False in boolean context.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_019",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is nested if?",
        options = listOf(
            "if inside else",
            "if inside if",
            "else inside if",
            "all of the above"
        ),
        correctAnswer = "all of the above",
        explanation = "Nested if means one conditional inside another.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_020",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What will be the output of: if False: print('A') elif True: print('B')?",
        options = listOf("A", "B", "Error", "None"),
        correctAnswer = "B",
        explanation = "elif executes when if condition is False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_021",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which statement is true?",
        options = listOf(
            "else is mandatory",
            "elif is mandatory",
            "if is mandatory",
            "elif comes before if"
        ),
        correctAnswer = "if is mandatory",
        explanation = "Every conditional structure must start with if.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_022",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if not True: print('A') else: print('B')?",
        options = listOf("A", "B", "Error", "None"),
        correctAnswer = "B",
        explanation = "not True becomes False, so else executes.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_023",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which keyword is NOT used in conditional statements?",
        options = listOf("if", "elif", "else", "switch"),
        correctAnswer = "switch",
        explanation = "Python does not use switch (before Python 3.10).",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_024",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if 5 < 3: print('A') else: print('B')?",
        options = listOf("A", "B", "Error", "None"),
        correctAnswer = "B",
        explanation = "The condition evaluates to False.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_025",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Can an if statement exist without else?",
        options = listOf("Yes", "No", "Only with elif", "Only in loops"),
        correctAnswer = "Yes",
        explanation = "else is optional in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_026",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which value is treated as True?",
        options = listOf("0", "None", "[]", "' '"),
        correctAnswer = "' '",
        explanation = "A non-empty string is treated as True.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_027",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What will be the output of: if 1 == True: print('Yes')?",
        options = listOf("Yes", "No", "Error", "None"),
        correctAnswer = "Yes",
        explanation = "True is internally treated as 1.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_028",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which operator is often used inside conditions?",
        options = listOf("+", "-", ">", "*"),
        correctAnswer = ">",
        explanation = "Relational operators are commonly used in conditions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_029",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What happens if no condition is True in if-elif chain?",
        options = listOf(
            "Error occurs",
            "Program stops",
            "else executes",
            "Nothing executes"
        ),
        correctAnswer = "else executes",
        explanation = "else runs when all conditions are False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_030",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if False: pass else: print('Done')?",
        options = listOf("pass", "Done", "False", "Error"),
        correctAnswer = "Done",
        explanation = "pass does nothing, else executes.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_031",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which statement skips execution without error?",
        options = listOf("break", "continue", "pass", "exit"),
        correctAnswer = "pass",
        explanation = "pass is a null statement in Python.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_032",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Can we use logical operators inside if condition?",
        options = listOf("Yes", "No", "Only AND", "Only OR"),
        correctAnswer = "Yes",
        explanation = "Logical operators are commonly used in conditions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_033",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if True and False: print('A') else: print('B')?",
        options = listOf("A", "B", "Error", "None"),
        correctAnswer = "B",
        explanation = "True and False evaluates to False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_034",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which conditional statement is checked first?",
        options = listOf("else", "elif", "if", "all together"),
        correctAnswer = "if",
        explanation = "Execution always starts with if.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_035",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What will be output of: if not 0: print('Yes')?",
        options = listOf("Yes", "No", "Error", "None"),
        correctAnswer = "Yes",
        explanation = "0 is False, not False becomes True.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_036",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which of the following causes conditional branching?",
        options = listOf("Loops", "Functions", "if-else", "Modules"),
        correctAnswer = "if-else",
        explanation = "if-else controls decision making.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_037",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if []: print('A') else: print('B')?",
        options = listOf("A", "B", "Error", "None"),
        correctAnswer = "B",
        explanation = "Empty list evaluates to False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_038",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which condition always evaluates to True?",
        options = listOf("0", "None", "1", "[]"),
        correctAnswer = "1",
        explanation = "Any non-zero number evaluates to True.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_039",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Can elif be used without if?",
        options = listOf("Yes", "No", "Sometimes", "Only once"),
        correctAnswer = "No",
        explanation = "elif must always follow an if.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_040",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which block executes if all conditions fail?",
        options = listOf("if", "elif", "else", "none"),
        correctAnswer = "else",
        explanation = "else runs when no condition is True.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_041",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if True: if False: print('A') else: print('B')?",
        options = listOf("A", "B", "Error", "None"),
        correctAnswer = "B",
        explanation = "Inner else executes because inner if is False.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_042",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which statement improves readability in conditions?",
        options = listOf("pass", "nested if", "indentation", "semicolon"),
        correctAnswer = "indentation",
        explanation = "Indentation clearly defines blocks in Python.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_043",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which keyword represents an empty conditional block?",
        options = listOf("null", "skip", "pass", "void"),
        correctAnswer = "pass",
        explanation = "pass is used as a placeholder.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_044",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "Which condition checks multiple expressions together?",
        options = listOf("relational", "logical", "assignment", "membership"),
        correctAnswer = "logical",
        explanation = "Logical operators combine multiple conditions.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_cond_045",
        categoryId = "python_conditional_statements",
        chapterId = PY_CONDITIONAL_STATEMENTS,
        questionText = "What is the output of: if 10: print('X') else: print('Y')?",
        options = listOf("X", "Y", "Error", "None"),
        correctAnswer = "X",
        explanation = "Any non-zero number evaluates to True.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))


    /* ---------- 5. Loops ---------- */
    questions.add(pythonQuestion(
        id = "py_loops_001",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop is used to iterate over a sequence in Python?",
        options = listOf("while", "do-while", "for", "repeat"),
        correctAnswer = "for",
        explanation = "The for loop is commonly used to iterate over sequences like lists or strings.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_002",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop executes as long as a condition is true?",
        options = listOf("for", "while", "if", "switch"),
        correctAnswer = "while",
        explanation = "The while loop runs repeatedly while its condition remains True.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_003",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(3): print(i)?",
        options = listOf("0 1 2", "1 2 3", "0 1 2 3", "Error"),
        correctAnswer = "0 1 2",
        explanation = "range(3) generates values from 0 to 2.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_004",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which function is commonly used with for loops?",
        options = listOf("input()", "type()", "range()", "id()"),
        correctAnswer = "range()",
        explanation = "range() generates a sequence of numbers for looping.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_005",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What will be the output of: for i in range(1,4): print(i)?",
        options = listOf("0 1 2", "1 2 3", "1 2 3 4", "Error"),
        correctAnswer = "1 2 3",
        explanation = "range(1,4) starts at 1 and stops before 4.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_006",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which keyword is used to stop a loop immediately?",
        options = listOf("stop", "exit", "break", "pass"),
        correctAnswer = "break",
        explanation = "break terminates the loop execution immediately.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_007",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which keyword skips the current iteration?",
        options = listOf("skip", "continue", "break", "pass"),
        correctAnswer = "continue",
        explanation = "continue skips the remaining code of the current iteration.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_008",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What does the pass statement do in loops?",
        options = listOf("Stops loop", "Skips iteration", "Does nothing", "Raises error"),
        correctAnswer = "Does nothing",
        explanation = "pass is a placeholder that performs no action.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_009",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(0): print(i)?",
        options = listOf("0", "Nothing", "Error", "None"),
        correctAnswer = "Nothing",
        explanation = "range(0) produces no values, so loop does not run.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_010",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop is best when number of iterations is unknown?",
        options = listOf("for", "while", "nested", "infinite"),
        correctAnswer = "while",
        explanation = "while loop is suitable when iterations depend on a condition.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_011",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What will be the output of: i=1; while i<=3: print(i); i+=1?",
        options = listOf("1 2 3", "0 1 2", "1 2", "Error"),
        correctAnswer = "1 2 3",
        explanation = "The loop runs while i is less than or equal to 3.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_012",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop can become infinite easily?",
        options = listOf("for", "while", "range", "nested"),
        correctAnswer = "while",
        explanation = "Improper condition update can cause infinite while loops.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_013",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What will be the output of: while False: print('Hi')?",
        options = listOf("Hi", "False", "Nothing", "Error"),
        correctAnswer = "Nothing",
        explanation = "The condition is False, so loop body never executes.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_014",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop supports else block in Python?",
        options = listOf("for", "while", "both for and while", "none"),
        correctAnswer = "both for and while",
        explanation = "Both loops support else when loop ends normally.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_015",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "When does loop else block execute?",
        options = listOf(
            "When break is used",
            "When loop ends normally",
            "When continue is used",
            "Always"
        ),
        correctAnswer = "When loop ends normally",
        explanation = "else executes only if loop is not terminated by break.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_016",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is nested loop?",
        options = listOf(
            "Loop inside condition",
            "Condition inside loop",
            "Loop inside another loop",
            "Infinite loop"
        ),
        correctAnswer = "Loop inside another loop",
        explanation = "Nested loop means one loop inside another loop.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_017",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "How many times will this run: for i in range(2,10,2)?",
        options = listOf("3", "4", "5", "6"),
        correctAnswer = "4",
        explanation = "Values are 2,4,6,8 — four iterations.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_018",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which keyword exits only the current iteration?",
        options = listOf("break", "exit", "continue", "pass"),
        correctAnswer = "continue",
        explanation = "continue skips to the next iteration.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_019",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in 'abc': print(i)?",
        options = listOf("abc", "a b c", "a\nb\nc", "Error"),
        correctAnswer = "a\nb\nc",
        explanation = "Each character is printed on a new line.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_020",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop is preferred for iterating lists?",
        options = listOf("while", "for", "do-while", "repeat"),
        correctAnswer = "for",
        explanation = "for loop is ideal for sequences like lists.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_021",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What happens if break is executed?",
        options = listOf(
            "Skips iteration",
            "Terminates loop",
            "Restarts loop",
            "Raises error"
        ),
        correctAnswer = "Terminates loop",
        explanation = "break exits the loop immediately.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_022",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which of the following creates an infinite loop?",
        options = listOf(
            "while True:",
            "for i in range(5):",
            "while False:",
            "for i in []:"
        ),
        correctAnswer = "while True:",
        explanation = "The condition never becomes False.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_023",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(1,1): print(i)?",
        options = listOf("1", "0", "Nothing", "Error"),
        correctAnswer = "Nothing",
        explanation = "Start and stop are same, so no iteration occurs.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_024",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop checks condition before execution?",
        options = listOf("for", "while", "do-while", "repeat"),
        correctAnswer = "while",
        explanation = "while loop checks condition before each iteration.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_025",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "How many times will this loop run: for i in range(5)?",
        options = listOf("4", "5", "6", "Infinite"),
        correctAnswer = "5",
        explanation = "range(5) generates 0 to 4, five values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_026",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which statement is used as a placeholder in loops?",
        options = listOf("break", "continue", "pass", "exit"),
        correctAnswer = "pass",
        explanation = "pass allows empty loop blocks without error.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_027",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(5,0,-1): print(i)?",
        options = listOf("5 4 3 2 1", "1 2 3 4 5", "5 4 3", "Error"),
        correctAnswer = "5 4 3 2 1",
        explanation = "Negative step decrements the value each time.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_028",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop variable is optional in for loop?",
        options = listOf("iterator", "sequence", "range", "none"),
        correctAnswer = "none",
        explanation = "Both iterator and sequence are mandatory.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_029",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What will be the output of: for i in range(3): pass; print(i)?",
        options = listOf("0", "2", "3", "Error"),
        correctAnswer = "2",
        explanation = "i retains last value after loop completes.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_030",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which statement skips loop iteration based on condition?",
        options = listOf("break", "continue", "pass", "return"),
        correctAnswer = "continue",
        explanation = "continue jumps to the next iteration.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_031",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(1,10,3)?",
        options = listOf("1 4 7", "1 3 5 7 9", "1 4 7 10", "Error"),
        correctAnswer = "1 4 7",
        explanation = "Step size of 3 skips values accordingly.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_032",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop is faster for fixed iterations?",
        options = listOf("while", "for", "nested", "infinite"),
        correctAnswer = "for",
        explanation = "for loops are optimized for fixed ranges.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_033",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What does range(1,5,2) produce?",
        options = listOf("1 3", "1 2 3 4", "1 3 5", "2 4"),
        correctAnswer = "1 3",
        explanation = "Starts at 1, increments by 2, stops before 5.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_034",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop can iterate over dictionary keys by default?",
        options = listOf("for", "while", "do-while", "repeat"),
        correctAnswer = "for",
        explanation = "for loop iterates over dictionary keys by default.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_035",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What happens if continue is inside while loop?",
        options = listOf(
            "Loop terminates",
            "Iteration skipped",
            "Error occurs",
            "Loop restarts"
        ),
        correctAnswer = "Iteration skipped",
        explanation = "continue skips to the next iteration.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_036",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop is entry-controlled?",
        options = listOf("for", "while", "both", "none"),
        correctAnswer = "both",
        explanation = "Both for and while check condition before execution.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_037",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(2): for j in range(2): print(i,j)?",
        options = listOf("00 01 10 11", "0 1 2", "00 11", "Error"),
        correctAnswer = "00 01 10 11",
        explanation = "Nested loops print all combinations.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_038",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which keyword is used to exit program inside loop?",
        options = listOf("break", "exit", "quit", "return"),
        correctAnswer = "exit",
        explanation = "exit() terminates program execution.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_039",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What will be output of: while 1: break; print('Hi')?",
        options = listOf("Hi", "Nothing", "Error", "Infinite"),
        correctAnswer = "Nothing",
        explanation = "break exits loop before print executes.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_040",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop can iterate over string characters?",
        options = listOf("for", "while", "both", "none"),
        correctAnswer = "for",
        explanation = "for loop iterates directly over strings.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_041",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(3): print(i,end='')?",
        options = listOf("012", "0 1 2", "123", "Error"),
        correctAnswer = "012",
        explanation = "end='' prints output without newline.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_042",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which loop variable scope is local?",
        options = listOf("for", "while", "both", "none"),
        correctAnswer = "both",
        explanation = "Loop variables exist within the function scope.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_043",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which statement prevents infinite loop?",
        options = listOf("break", "continue", "pass", "else"),
        correctAnswer = "break",
        explanation = "break stops the loop execution.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_044",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "What is the output of: for i in range(1): print('A') else: print('B')?",
        options = listOf("A B", "A", "B", "Error"),
        correctAnswer = "A B",
        explanation = "Loop runs once and ends normally, so else executes.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_loops_045",
        categoryId = "python_loops",
        chapterId = PY_LOOPS,
        questionText = "Which statement is true about Python loops?",
        options = listOf(
            "do-while exists",
            "for loop needs index",
            "loops support else",
            "loops are infinite by default"
        ),
        correctAnswer = "loops support else",
        explanation = "Python loops support an optional else block.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))


    /* ---------- 6. Lists & Tuples ---------- */
    questions.add(pythonQuestion(
        id = "py_lt_001",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which of the following creates a list in Python?",
        options = listOf("(1,2,3)", "{1,2,3}", "[1,2,3]", "list{1,2,3}"),
        correctAnswer = "[1,2,3]",
        explanation = "Lists are created using square brackets [].",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_002",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which of the following creates a tuple?",
        options = listOf("[1,2]", "{1,2}", "(1,2)", "tuple[1,2]"),
        correctAnswer = "(1,2)",
        explanation = "Tuples are defined using parentheses ().",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_003",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which data type is mutable?",
        options = listOf("tuple", "list", "str", "int"),
        correctAnswer = "list",
        explanation = "Lists can be modified after creation.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_004",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which data type is immutable?",
        options = listOf("list", "set", "dict", "tuple"),
        correctAnswer = "tuple",
        explanation = "Tuples cannot be changed once created.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_005",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: len([1,2,3])?",
        options = listOf("2", "3", "4", "Error"),
        correctAnswer = "3",
        explanation = "len() returns the number of elements in the list.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_006",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What will be the output of: [1,2,3][1]?",
        options = listOf("1", "2", "3", "Error"),
        correctAnswer = "2",
        explanation = "Indexing starts from 0, so index 1 gives second element.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_007",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which method is used to add an element at the end of a list?",
        options = listOf("add()", "append()", "insert()", "extend()"),
        correctAnswer = "append()",
        explanation = "append() adds one element at the end of the list.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_008",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which method adds elements of another list?",
        options = listOf("append()", "add()", "extend()", "insert()"),
        correctAnswer = "extend()",
        explanation = "extend() adds all elements of another iterable.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_009",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: [1,2] + [3,4]?",
        options = listOf("[1,2,3,4]", "[4,6]", "Error", "[1,2][3,4]"),
        correctAnswer = "[1,2,3,4]",
        explanation = "+ concatenates two lists.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_010",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What does list slicing return?",
        options = listOf("Single value", "Boolean", "New list", "Error"),
        correctAnswer = "New list",
        explanation = "Slicing creates a new list.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_011",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: [1,2,3][1:3]?",
        options = listOf("[1,2]", "[2,3]", "[3]", "Error"),
        correctAnswer = "[2,3]",
        explanation = "Slicing includes start index and excludes end index.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_012",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which operation is NOT allowed on tuples?",
        options = listOf("Indexing", "Slicing", "Concatenation", "Item assignment"),
        correctAnswer = "Item assignment",
        explanation = "Tuples are immutable, so items cannot be changed.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_013",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "How do you create a single-element tuple?",
        options = listOf("(1)", "(1,)", "[1]", "{1}"),
        correctAnswer = "(1,)",
        explanation = "A trailing comma is required for single-element tuples.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_014",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: type([])?",
        options = listOf("tuple", "list", "set", "dict"),
        correctAnswer = "list",
        explanation = "Square brackets create a list.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_015",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which function converts a tuple into a list?",
        options = listOf("list()", "tuple()", "set()", "dict()"),
        correctAnswer = "list()",
        explanation = "list() converts iterable objects into a list.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_016",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: len((1,2,3))?",
        options = listOf("2", "3", "4", "Error"),
        correctAnswer = "3",
        explanation = "len() returns number of elements in tuple.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_017",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which method removes the last element from a list?",
        options = listOf("remove()", "delete()", "pop()", "clear()"),
        correctAnswer = "pop()",
        explanation = "pop() removes and returns the last element by default.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_018",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: [1,2,3].pop()?",
        options = listOf("1", "2", "3", "[1,2]"),
        correctAnswer = "3",
        explanation = "pop() returns the last element.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_019",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which method removes a specific value from list?",
        options = listOf("pop()", "delete()", "remove()", "clear()"),
        correctAnswer = "remove()",
        explanation = "remove() deletes the first occurrence of a value.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_020",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What happens if remove() value is not found?",
        options = listOf("Nothing", "Returns False", "ValueError", "IndexError"),
        correctAnswer = "ValueError",
        explanation = "remove() raises ValueError if item is absent.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_021",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which method deletes all elements of a list?",
        options = listOf("remove()", "pop()", "clear()", "del"),
        correctAnswer = "clear()",
        explanation = "clear() empties the list completely.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_022",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which operator repeats a list?",
        options = listOf("+", "*", "%", "//"),
        correctAnswer = "*",
        explanation = "* repeats list elements.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_023",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: [1]*3?",
        options = listOf("[1,1,1]", "[3]", "Error", "[1*3]"),
        correctAnswer = "[1,1,1]",
        explanation = "List repetition duplicates elements.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_024",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which function sorts a list permanently?",
        options = listOf("sort()", "sorted()", "order()", "arrange()"),
        correctAnswer = "sort()",
        explanation = "sort() modifies the list in place.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_025",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What does sorted() return?",
        options = listOf("Modified list", "New list", "Tuple", "None"),
        correctAnswer = "New list",
        explanation = "sorted() returns a new sorted list.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_026",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which operation is fastest for accessing list elements?",
        options = listOf("Searching", "Indexing", "Sorting", "Appending"),
        correctAnswer = "Indexing",
        explanation = "Indexing provides direct access.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_027",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: (1,2)+(3,4)?",
        options = listOf("(1,2,3,4)", "(4,6)", "Error", "[1,2,3,4]"),
        correctAnswer = "(1,2,3,4)",
        explanation = "Tuple concatenation combines tuples.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_028",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Can tuples be used as dictionary keys?",
        options = listOf("Yes", "No", "Sometimes", "Only lists"),
        correctAnswer = "Yes",
        explanation = "Tuples are immutable and hashable.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_029",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which list method returns index of an element?",
        options = listOf("find()", "search()", "index()", "locate()"),
        correctAnswer = "index()",
        explanation = "index() returns position of first occurrence.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_030",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What happens if index() value not found?",
        options = listOf("Returns -1", "None", "ValueError", "IndexError"),
        correctAnswer = "ValueError",
        explanation = "index() raises ValueError if element not present.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_031",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which of the following supports slicing?",
        options = listOf("list", "tuple", "both", "none"),
        correctAnswer = "both",
        explanation = "Both lists and tuples support slicing.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_032",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: [1,2,3][-1]?",
        options = listOf("1", "2", "3", "Error"),
        correctAnswer = "3",
        explanation = "Negative index accesses elements from end.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_033",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which method counts occurrences of an element?",
        options = listOf("count()", "total()", "freq()", "number()"),
        correctAnswer = "count()",
        explanation = "count() returns number of occurrences.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_034",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which of the following is true?",
        options = listOf(
            "Lists are faster than tuples",
            "Tuples use less memory",
            "Lists are immutable",
            "Tuples are mutable"
        ),
        correctAnswer = "Tuples use less memory",
        explanation = "Tuples are more memory-efficient than lists.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_035",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which operation deletes a list completely?",
        options = listOf("clear()", "remove()", "pop()", "del"),
        correctAnswer = "del",
        explanation = "del removes the list object itself.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_036",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: type(())?",
        options = listOf("tuple", "list", "set", "dict"),
        correctAnswer = "tuple",
        explanation = "Empty parentheses create an empty tuple.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_037",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which operation is faster for iteration?",
        options = listOf("list", "tuple", "both same", "depends"),
        correctAnswer = "tuple",
        explanation = "Tuples are slightly faster due to immutability.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_038",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: tuple([1,2,3])?",
        options = listOf("[1,2,3]", "(1,2,3)", "{1,2,3}", "Error"),
        correctAnswer = "(1,2,3)",
        explanation = "tuple() converts iterable to tuple.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_039",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which of the following allows duplicate values?",
        options = listOf("set", "dict", "list", "none"),
        correctAnswer = "list",
        explanation = "Lists allow duplicate elements.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_040",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which list method reverses elements?",
        options = listOf("reverse()", "sort()", "swap()", "invert()"),
        correctAnswer = "reverse()",
        explanation = "reverse() reverses list in place.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_041",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: [1,2,3].clear()?",
        options = listOf("[]", "None", "Error", "[1,2,3]"),
        correctAnswer = "None",
        explanation = "clear() returns None after emptying list.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_042",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which of the following supports unpacking?",
        options = listOf("list", "tuple", "both", "none"),
        correctAnswer = "both",
        explanation = "Both lists and tuples support unpacking.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_043",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "What is the output of: a,b = (1,2)?",
        options = listOf("a=1,b=2", "a=2,b=1", "Error", "None"),
        correctAnswer = "a=1,b=2",
        explanation = "Tuple unpacking assigns values in order.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_044",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which structure is preferred for fixed data?",
        options = listOf("list", "tuple", "set", "dict"),
        correctAnswer = "tuple",
        explanation = "Tuples are ideal for fixed, read-only data.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_lt_045",
        categoryId = "python_lists_and_tuples",
        chapterId = PY_LISTS_TUPLES,
        questionText = "Which statement about lists and tuples is correct?",
        options = listOf(
            "Lists are immutable",
            "Tuples are mutable",
            "Lists are dynamic",
            "Tuples support item assignment"
        ),
        correctAnswer = "Lists are dynamic",
        explanation = "Lists can grow or shrink dynamically.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))


    /* ---------- 7. Sets & Dictionaries ---------- */
    questions.add(pythonQuestion(
        id = "py_sd_001",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which of the following creates a set?",
        options = listOf("{1,2,3}", "[1,2,3]", "(1,2,3)", "{}"),
        correctAnswer = "{1,2,3}",
        explanation = "Curly braces with values create a set.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_002",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which statement creates an empty set?",
        options = listOf("{}", "[]", "()", "set()"),
        correctAnswer = "set()",
        explanation = "{} creates an empty dictionary, not a set.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_003",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which data structure stores key-value pairs?",
        options = listOf("set", "list", "tuple", "dictionary"),
        correctAnswer = "dictionary",
        explanation = "Dictionaries store data in key-value format.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_004",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which of the following creates a dictionary?",
        options = listOf("{1,2,3}", "{'a':1}", "[1:2]", "(a=1)"),
        correctAnswer = "{'a':1}",
        explanation = "Dictionary uses key:value pairs inside {}.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_005",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which data type does not allow duplicate values?",
        options = listOf("list", "tuple", "set", "dictionary"),
        correctAnswer = "set",
        explanation = "Sets automatically remove duplicate elements.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_006",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What is the output of: {1,2,2,3}?",
        options = listOf("{1,2,3}", "{1,2,2,3}", "Error", "[1,2,3]"),
        correctAnswer = "{1,2,3}",
        explanation = "Duplicate values are removed in sets.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_007",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method adds an element to a set?",
        options = listOf("append()", "add()", "insert()", "extend()"),
        correctAnswer = "add()",
        explanation = "add() inserts a single element into a set.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_008",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method adds multiple elements to a set?",
        options = listOf("add()", "append()", "update()", "extend()"),
        correctAnswer = "update()",
        explanation = "update() adds elements from another iterable.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_009",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which operation finds common elements between sets?",
        options = listOf("union", "difference", "intersection", "update"),
        correctAnswer = "intersection",
        explanation = "intersection returns common elements.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_010",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which operator is used for set union?",
        options = listOf("&", "|", "-", "^"),
        correctAnswer = "|",
        explanation = "| returns union of two sets.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_011",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What does the - operator do on sets?",
        options = listOf(
            "Intersection",
            "Union",
            "Difference",
            "Symmetric difference"
        ),
        correctAnswer = "Difference",
        explanation = "It returns elements present in first set only.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_012",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which operator performs symmetric difference?",
        options = listOf("&", "|", "^", "-"),
        correctAnswer = "^",
        explanation = "^ returns elements not common to both sets.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_013",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which data type is unordered?",
        options = listOf("list", "tuple", "set", "string"),
        correctAnswer = "set",
        explanation = "Sets do not maintain order.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_014",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method removes a specific element from set?",
        options = listOf("pop()", "delete()", "remove()", "clear()"),
        correctAnswer = "remove()",
        explanation = "remove() deletes a specified element.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_015",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What happens if remove() element is not present in set?",
        options = listOf("Nothing", "Returns False", "KeyError", "ValueError"),
        correctAnswer = "KeyError",
        explanation = "remove() raises KeyError if element not found.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_016",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method removes and returns a random set element?",
        options = listOf("remove()", "delete()", "pop()", "discard()"),
        correctAnswer = "pop()",
        explanation = "pop() removes an arbitrary element.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_017",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method removes element without error if missing?",
        options = listOf("remove()", "discard()", "pop()", "clear()"),
        correctAnswer = "discard()",
        explanation = "discard() does not raise error if element missing.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_018",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method deletes all elements from a set?",
        options = listOf("remove()", "pop()", "clear()", "delete()"),
        correctAnswer = "clear()",
        explanation = "clear() empties the set.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_019",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which data type is mutable?",
        options = listOf("tuple", "string", "set", "int"),
        correctAnswer = "set",
        explanation = "Sets can be modified after creation.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_020",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which keys are allowed in dictionary?",
        options = listOf("mutable keys", "list keys", "immutable keys", "duplicate keys"),
        correctAnswer = "immutable keys",
        explanation = "Dictionary keys must be immutable.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_021",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which of the following can be a dictionary key?",
        options = listOf("list", "set", "tuple", "dict"),
        correctAnswer = "tuple",
        explanation = "Tuples are immutable and hashable.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_022",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method returns all keys of dictionary?",
        options = listOf("keys()", "values()", "items()", "get()"),
        correctAnswer = "keys()",
        explanation = "keys() returns all dictionary keys.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_023",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method returns all values of dictionary?",
        options = listOf("keys()", "values()", "items()", "fetch()"),
        correctAnswer = "values()",
        explanation = "values() returns dictionary values.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_024",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method returns key-value pairs?",
        options = listOf("keys()", "values()", "items()", "pairs()"),
        correctAnswer = "items()",
        explanation = "items() returns key-value tuples.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_025",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What happens if duplicate keys are used?",
        options = listOf(
            "Error",
            "Both stored",
            "Last value overwrites",
            "Ignored"
        ),
        correctAnswer = "Last value overwrites",
        explanation = "Duplicate keys overwrite previous values.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_026",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method accesses value safely?",
        options = listOf("dict[key]", "fetch()", "get()", "value()"),
        correctAnswer = "get()",
        explanation = "get() avoids KeyError if key missing.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_027",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What does dict.get('x') return if key missing?",
        options = listOf("Error", "0", "None", "False"),
        correctAnswer = "None",
        explanation = "get() returns None by default.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_028",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which operator checks key existence?",
        options = listOf("has", "in", "exists", "find"),
        correctAnswer = "in",
        explanation = "in checks if key exists in dictionary.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_029",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method removes a key-value pair?",
        options = listOf("remove()", "delete()", "pop()", "clear()"),
        correctAnswer = "pop()",
        explanation = "pop() removes specified key.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_030",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What happens if pop() key not found?",
        options = listOf("None", "KeyError", "Ignored", "False"),
        correctAnswer = "KeyError",
        explanation = "pop() raises KeyError if key missing.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_031",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method removes all dictionary items?",
        options = listOf("remove()", "clear()", "pop()", "del"),
        correctAnswer = "clear()",
        explanation = "clear() empties the dictionary.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_032",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which of the following is ordered in Python 3.7+?",
        options = listOf("set", "dictionary", "tuple", "frozenset"),
        correctAnswer = "dictionary",
        explanation = "Dictionaries preserve insertion order.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_033",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which function converts list to set?",
        options = listOf("list()", "tuple()", "set()", "dict()"),
        correctAnswer = "set()",
        explanation = "set() removes duplicates.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_034",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which set is immutable?",
        options = listOf("set", "list", "frozenset", "tuple"),
        correctAnswer = "frozenset",
        explanation = "frozenset cannot be modified.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_035",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which operation is fastest for lookup?",
        options = listOf("list", "tuple", "set", "string"),
        correctAnswer = "set",
        explanation = "Sets use hash-based lookup.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_036",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What does set() do with duplicates?",
        options = listOf("Keeps all", "Removes duplicates", "Raises error", "Sorts values"),
        correctAnswer = "Removes duplicates",
        explanation = "Sets store unique elements only.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_037",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method copies a dictionary?",
        options = listOf("copy()", "clone()", "duplicate()", "replica()"),
        correctAnswer = "copy()",
        explanation = "copy() creates shallow copy.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_038",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What is the output of: len({'a':1,'b':2})?",
        options = listOf("1", "2", "3", "Error"),
        correctAnswer = "2",
        explanation = "len() counts key-value pairs.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_039",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which operation merges two dictionaries (Python 3.9+)?",
        options = listOf("+", "|", "&", "^"),
        correctAnswer = "|",
        explanation = "| merges dictionaries in Python 3.9+.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_040",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method updates dictionary with another?",
        options = listOf("merge()", "extend()", "update()", "append()"),
        correctAnswer = "update()",
        explanation = "update() adds key-value pairs.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_041",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "What happens if update() overwrites a key?",
        options = listOf(
            "Error",
            "Ignored",
            "Value replaced",
            "Key removed"
        ),
        correctAnswer = "Value replaced",
        explanation = "Existing key gets new value.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_042",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which structure is best for unique elements?",
        options = listOf("list", "tuple", "set", "dict"),
        correctAnswer = "set",
        explanation = "Sets store only unique elements.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_043",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which statement about dictionary is true?",
        options = listOf(
            "Keys can be duplicated",
            "Keys are ordered randomly",
            "Keys must be immutable",
            "Values must be unique"
        ),
        correctAnswer = "Keys must be immutable",
        explanation = "Only immutable types can be keys.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_044",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which method returns and removes last inserted key-value?",
        options = listOf("pop()", "popitem()", "remove()", "delete()"),
        correctAnswer = "popitem()",
        explanation = "popitem() removes last inserted item.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_sd_045",
        categoryId = "python_sets_and_dictionaries",
        chapterId = PY_SETS_DICTS,
        questionText = "Which is the correct statement about sets and dictionaries?",
        options = listOf(
            "Both are ordered",
            "Both allow duplicates",
            "Both are mutable",
            "Both use indexing"
        ),
        correctAnswer = "Both are mutable",
        explanation = "Sets and dictionaries can be modified.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))


    /* ---------- 8. Functions ---------- */
    questions.add(pythonQuestion(
        id = "py_fn_001",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which keyword is used to define a function in Python?",
        options = listOf("func", "define", "def", "function"),
        correctAnswer = "def",
        explanation = "Functions in Python are defined using the def keyword.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_002",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is the correct syntax to define a function?",
        options = listOf(
            "def myFunc[]:",
            "function myFunc():",
            "def myFunc():",
            "define myFunc():"
        ),
        correctAnswer = "def myFunc():",
        explanation = "Function definition requires def, name, parentheses, and colon.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_003",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is a function parameter?",
        options = listOf(
            "Value passed to function",
            "Variable in function definition",
            "Return value",
            "Function name"
        ),
        correctAnswer = "Variable in function definition",
        explanation = "Parameters receive values when function is called.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_004",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is a function argument?",
        options = listOf(
            "Variable name",
            "Value passed to function",
            "Function keyword",
            "Return statement"
        ),
        correctAnswer = "Value passed to function",
        explanation = "Arguments supply actual values to parameters.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_005",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which statement is used to return a value from a function?",
        options = listOf("break", "print", "return", "yield"),
        correctAnswer = "return",
        explanation = "return sends a value back to the caller.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_006",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What does a function return by default?",
        options = listOf("0", "False", "None", "Error"),
        correctAnswer = "None",
        explanation = "Functions return None if no return statement is used.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_007",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is the output of: def f(): pass; print(f())?",
        options = listOf("pass", "0", "None", "Error"),
        correctAnswer = "None",
        explanation = "Function without return returns None.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_008",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function allows variable number of arguments?",
        options = listOf("*args", "**kwargs", "both", "none"),
        correctAnswer = "both",
        explanation = "*args and **kwargs allow variable arguments.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_009",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What does *args store?",
        options = listOf("Dictionary", "Set", "Tuple", "List"),
        correctAnswer = "Tuple",
        explanation = "*args stores arguments as a tuple.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_010",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What does **kwargs store?",
        options = listOf("Tuple", "List", "Set", "Dictionary"),
        correctAnswer = "Dictionary",
        explanation = "**kwargs stores keyword arguments as dictionary.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_011",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which argument is assigned by position?",
        options = listOf("Keyword", "Default", "Positional", "Variable"),
        correctAnswer = "Positional",
        explanation = "Positional arguments match parameters by order.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_012",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which argument uses parameter name during call?",
        options = listOf("Positional", "Keyword", "Default", "Variable"),
        correctAnswer = "Keyword",
        explanation = "Keyword arguments specify parameter names explicitly.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_013",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is a default argument?",
        options = listOf(
            "Mandatory argument",
            "Argument with predefined value",
            "Variable argument",
            "Keyword-only argument"
        ),
        correctAnswer = "Argument with predefined value",
        explanation = "Default arguments have preset values if not passed.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_014",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "When are default argument values evaluated?",
        options = listOf(
            "At runtime",
            "At function call",
            "At function definition",
            "Every iteration"
        ),
        correctAnswer = "At function definition",
        explanation = "Default values are evaluated once at definition time.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_015",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which statement is true about mutable default arguments?",
        options = listOf(
            "They reset each call",
            "They persist between calls",
            "They cause error",
            "They are copied"
        ),
        correctAnswer = "They persist between calls",
        explanation = "Mutable defaults retain changes across calls.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_016",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which keyword creates an anonymous function?",
        options = listOf("def", "func", "lambda", "anon"),
        correctAnswer = "lambda",
        explanation = "lambda creates small anonymous functions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_017",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "How many expressions can lambda have?",
        options = listOf("One", "Two", "Multiple", "None"),
        correctAnswer = "One",
        explanation = "Lambda functions allow only one expression.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_018",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What does lambda x: x+1 return?",
        options = listOf("Function", "Value", "Error", "None"),
        correctAnswer = "Function",
        explanation = "Lambda expression returns a function object.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_019",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function applies another function to all items?",
        options = listOf("map()", "filter()", "reduce()", "apply()"),
        correctAnswer = "map()",
        explanation = "map() applies a function to each item.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_020",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function filters elements based on condition?",
        options = listOf("map()", "filter()", "reduce()", "select()"),
        correctAnswer = "filter()",
        explanation = "filter() selects elements matching condition.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_021",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Where is reduce() defined?",
        options = listOf(
            "math module",
            "functools module",
            "itertools module",
            "operator module"
        ),
        correctAnswer = "functools module",
        explanation = "reduce() is available in functools.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_022",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What does return statement do?",
        options = listOf(
            "Ends function",
            "Sends value",
            "Both",
            "None"
        ),
        correctAnswer = "Both",
        explanation = "return ends function and sends value back.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_023",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is recursion?",
        options = listOf(
            "Looping",
            "Function calling itself",
            "Nested loop",
            "Lambda call"
        ),
        correctAnswer = "Function calling itself",
        explanation = "Recursion occurs when function calls itself.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_024",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which condition stops recursion?",
        options = listOf("return", "base case", "break", "continue"),
        correctAnswer = "base case",
        explanation = "Base case terminates recursive calls.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_025",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What happens without base case in recursion?",
        options = listOf(
            "Stops automatically",
            "Returns None",
            "Infinite recursion",
            "Syntax error"
        ),
        correctAnswer = "Infinite recursion",
        explanation = "Missing base case leads to infinite calls.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_026",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which error occurs due to deep recursion?",
        options = listOf("TypeError", "ValueError", "RecursionError", "IndexError"),
        correctAnswer = "RecursionError",
        explanation = "Python limits recursion depth.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_027",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which keyword makes variable local to function?",
        options = listOf("local", "static", "private", "none"),
        correctAnswer = "none",
        explanation = "Variables inside functions are local by default.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_028",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which keyword makes global variable modifiable inside function?",
        options = listOf("global", "extern", "public", "static"),
        correctAnswer = "global",
        explanation = "global allows modifying global variables.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_029",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which keyword accesses enclosing function variable?",
        options = listOf("global", "outer", "nonlocal", "static"),
        correctAnswer = "nonlocal",
        explanation = "nonlocal accesses enclosing scope variables.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_030",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is function docstring?",
        options = listOf(
            "Comment",
            "String describing function",
            "Variable",
            "Decorator"
        ),
        correctAnswer = "String describing function",
        explanation = "Docstring explains purpose of function.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_031",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which attribute accesses docstring?",
        options = listOf("__doc__", "__name__", "__str__", "__init__"),
        correctAnswer = "__doc__",
        explanation = "__doc__ stores function documentation.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_032",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function returns number of parameters?",
        options = listOf("len()", "count()", "inspect()", "none"),
        correctAnswer = "none",
        explanation = "No direct built-in returns parameter count.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_033",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function can return multiple values?",
        options = listOf("lambda", "normal function", "generator", "none"),
        correctAnswer = "normal function",
        explanation = "Functions return multiple values as tuples.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_034",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is the return type of multiple values?",
        options = listOf("list", "tuple", "dict", "set"),
        correctAnswer = "tuple",
        explanation = "Multiple return values form a tuple.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_035",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function delays execution until needed?",
        options = listOf("normal", "recursive", "generator", "lambda"),
        correctAnswer = "generator",
        explanation = "Generators yield values lazily.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_036",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which keyword is used in generators?",
        options = listOf("return", "yield", "pass", "break"),
        correctAnswer = "yield",
        explanation = "yield produces generator values.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_037",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What happens when yield is executed?",
        options = listOf(
            "Function ends",
            "Value returned and paused",
            "Error occurs",
            "Loop breaks"
        ),
        correctAnswer = "Value returned and paused",
        explanation = "yield pauses function execution.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_038",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which statement is true?",
        options = listOf(
            "Lambda can have statements",
            "Lambda supports loops",
            "Lambda has no name",
            "Lambda uses return"
        ),
        correctAnswer = "Lambda has no name",
        explanation = "Lambda functions are anonymous.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_039",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function decorator adds functionality?",
        options = listOf("wrapper", "decorator", "@", "#"),
        correctAnswer = "@",
        explanation = "@ symbol is used to apply decorators.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_040",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which of the following improves code reuse?",
        options = listOf("loops", "functions", "conditions", "variables"),
        correctAnswer = "functions",
        explanation = "Functions help reuse logic.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_041",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which function helps modular programming?",
        options = listOf("lambda", "function", "loop", "class"),
        correctAnswer = "function",
        explanation = "Functions break code into modules.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_042",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which statement about functions is correct?",
        options = listOf(
            "Functions must return value",
            "Functions cannot be nested",
            "Functions can be nested",
            "Functions cannot call other functions"
        ),
        correctAnswer = "Functions can be nested",
        explanation = "Python allows nested functions.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_043",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "What is a higher-order function?",
        options = listOf(
            "Function inside loop",
            "Function returning function",
            "Recursive function",
            "Lambda only"
        ),
        correctAnswer = "Function returning function",
        explanation = "Higher-order functions accept or return functions.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_044",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which built-in returns function name?",
        options = listOf("__doc__", "__name__", "__func__", "__call__"),
        correctAnswer = "__name__",
        explanation = "__name__ stores function name.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fn_045",
        categoryId = "python_functions",
        chapterId = PY_FUNCTIONS,
        questionText = "Which is NOT a valid function feature?",
        options = listOf(
            "Recursion",
            "Overloading by signature",
            "Default arguments",
            "Returning multiple values"
        ),
        correctAnswer = "Overloading by signature",
        explanation = "Python does not support traditional function overloading.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))


    /* ---------- 9. Modules & Packages ---------- */
    questions.add(pythonQuestion(
        id = "py_mp_001",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "What is a module in Python?",
        options = listOf("A function", "A file containing Python code", "A class", "A package"),
        correctAnswer = "A file containing Python code",
        explanation = "A module is a Python file that contains code such as variables and functions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_002",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which keyword is used to import a module?",
        options = listOf("include", "require", "import", "load"),
        correctAnswer = "import",
        explanation = "The import keyword is used to access modules.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_003",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which statement imports only specific names from a module?",
        options = listOf(
            "import module",
            "import module as m",
            "from module import name",
            "include module"
        ),
        correctAnswer = "from module import name",
        explanation = "This imports specific attributes from a module.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_004",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which keyword gives an alias to a module?",
        options = listOf("alias", "rename", "as", "with"),
        correctAnswer = "as",
        explanation = "as assigns an alternate name to a module.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_005",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "What is a package?",
        options = listOf(
            "Collection of modules",
            "Single module",
            "Class library",
            "Function group"
        ),
        correctAnswer = "Collection of modules",
        explanation = "A package organizes multiple modules.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_006",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which file indicates a directory is a package (traditionally)?",
        options = listOf("__init__.py", "__main__.py", "__package__.py", "__file__.py"),
        correctAnswer = "__init__.py",
        explanation = "__init__.py marks a directory as a package.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_007",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module is imported by default at startup?",
        options = listOf("sys", "os", "builtins", "math"),
        correctAnswer = "builtins",
        explanation = "builtins is automatically available.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_008",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which function lists names defined in a module?",
        options = listOf("dir()", "list()", "vars()", "help()"),
        correctAnswer = "dir()",
        explanation = "dir() returns attributes of a module.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_009",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which attribute gives the module name?",
        options = listOf("__file__", "__doc__", "__name__", "__path__"),
        correctAnswer = "__name__",
        explanation = "__name__ stores the module name.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_010",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "What does __name__ equal in the main script?",
        options = listOf("main", "__main__", "script", "__file__"),
        correctAnswer = "__main__",
        explanation = "__name__ is '__main__' for the entry script.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_011",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which statement prevents code from running on import?",
        options = listOf(
            "if __file__ == '__main__'",
            "if __name__ == '__main__'",
            "if main():",
            "if name == main"
        ),
        correctAnswer = "if __name__ == '__main__'",
        explanation = "This guard runs code only when executed directly.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_012",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module provides system-specific parameters?",
        options = listOf("os", "sys", "math", "time"),
        correctAnswer = "sys",
        explanation = "sys provides access to interpreter variables.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_013",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module provides OS-level operations?",
        options = listOf("sys", "os", "platform", "path"),
        correctAnswer = "os",
        explanation = "os offers functions for OS interaction.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_014",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module is used for mathematical functions?",
        options = listOf("cmath", "math", "numbers", "calc"),
        correctAnswer = "math",
        explanation = "math provides standard math functions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_015",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "What happens when a module is imported multiple times?",
        options = listOf(
            "Reloaded every time",
            "Error occurs",
            "Loaded once and cached",
            "Ignored completely"
        ),
        correctAnswer = "Loaded once and cached",
        explanation = "Python caches imported modules.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_016",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which variable stores module search paths?",
        options = listOf("sys.path", "os.path", "path.sys", "env.path"),
        correctAnswer = "sys.path",
        explanation = "sys.path lists directories searched for modules.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_017",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which keyword imports everything from a module?",
        options = listOf("import *", "from module import *", "include *", "use *"),
        correctAnswer = "from module import *",
        explanation = "This imports all public names.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_018",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which is a drawback of 'from module import *'?",
        options = listOf(
            "Faster execution",
            "Namespace pollution",
            "Syntax error",
            "Limited access"
        ),
        correctAnswer = "Namespace pollution",
        explanation = "It can overwrite existing names.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_019",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module helps with date and time?",
        options = listOf("time", "datetime", "calendar", "all of the above"),
        correctAnswer = "all of the above",
        explanation = "Multiple modules support date and time.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_020",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which function displays module documentation?",
        options = listOf("doc()", "help()", "info()", "dir()"),
        correctAnswer = "help()",
        explanation = "help() shows documentation.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_021",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which attribute gives module file location?",
        options = listOf("__name__", "__file__", "__path__", "__doc__"),
        correctAnswer = "__file__",
        explanation = "__file__ stores the path to module file.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_022",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which type of package has no __init__.py in Python 3.3+?",
        options = listOf("Namespace package", "Regular package", "Built-in package", "System package"),
        correctAnswer = "Namespace package",
        explanation = "Namespace packages do not require __init__.py.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_023",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module is used for random numbers?",
        options = listOf("math", "random", "secrets", "rand"),
        correctAnswer = "random",
        explanation = "random generates pseudo-random numbers.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_024",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module is recommended for cryptographic randomness?",
        options = listOf("random", "math", "secrets", "hashlib"),
        correctAnswer = "secrets",
        explanation = "secrets is designed for security-sensitive use.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_025",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module handles file path operations?",
        options = listOf("sys", "os", "pathlib", "io"),
        correctAnswer = "pathlib",
        explanation = "pathlib provides object-oriented path handling.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_026",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which keyword is used to import a submodule?",
        options = listOf("import", "from", "both", "none"),
        correctAnswer = "both",
        explanation = "Both import and from can import submodules.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_027",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module is used for regular expressions?",
        options = listOf("regex", "re", "pattern", "string"),
        correctAnswer = "re",
        explanation = "re provides regex support.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_028",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module helps with command-line arguments?",
        options = listOf("os", "sys", "argparse", "both sys and argparse"),
        correctAnswer = "both sys and argparse",
        explanation = "Both can parse command-line arguments.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_029",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which statement best describes packages?",
        options = listOf(
            "Single file",
            "Collection of files",
            "Compiled library",
            "Executable"
        ),
        correctAnswer = "Collection of files",
        explanation = "Packages group related modules.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_030",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module helps with JSON data?",
        options = listOf("pickle", "json", "marshal", "csv"),
        correctAnswer = "json",
        explanation = "json handles JSON serialization.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_031",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module serializes Python objects?",
        options = listOf("json", "pickle", "csv", "yaml"),
        correctAnswer = "pickle",
        explanation = "pickle serializes Python objects.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_032",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module helps with CSV files?",
        options = listOf("json", "csv", "io", "pickle"),
        correctAnswer = "csv",
        explanation = "csv supports CSV file handling.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_033",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which import style is recommended for clarity?",
        options = listOf(
            "from module import *",
            "import module",
            "dynamic import",
            "relative import only"
        ),
        correctAnswer = "import module",
        explanation = "It avoids namespace collisions.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_034",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module helps with threading?",
        options = listOf("thread", "threading", "multiprocessing", "asyncio"),
        correctAnswer = "threading",
        explanation = "threading provides threading support.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_035",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module supports asynchronous programming?",
        options = listOf("async", "threading", "asyncio", "concurrent"),
        correctAnswer = "asyncio",
        explanation = "asyncio supports async programming.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_036",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which function reloads a module?",
        options = listOf("reload()", "import()", "refresh()", "reimport()"),
        correctAnswer = "reload()",
        explanation = "reload() reloads an already imported module.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_037",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "reload() is defined in which module?",
        options = listOf("sys", "os", "importlib", "builtins"),
        correctAnswer = "importlib",
        explanation = "reload() is available in importlib.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_038",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module measures execution time?",
        options = listOf("time", "datetime", "clock", "timer"),
        correctAnswer = "time",
        explanation = "time provides timing functions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_039",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module helps with logging?",
        options = listOf("debug", "trace", "logging", "log"),
        correctAnswer = "logging",
        explanation = "logging provides logging facilities.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_040",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which statement about modules is true?",
        options = listOf(
            "Modules must be compiled",
            "Modules can be reused",
            "Modules are single-use",
            "Modules cannot import others"
        ),
        correctAnswer = "Modules can be reused",
        explanation = "Modules promote code reuse.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_041",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module provides environment variables?",
        options = listOf("sys", "os", "env", "platform"),
        correctAnswer = "os",
        explanation = "os.environ accesses environment variables.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_042",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which import is relative?",
        options = listOf(
            "import module",
            "from . import module",
            "from module import x",
            "import module as m"
        ),
        correctAnswer = "from . import module",
        explanation = "Dot denotes relative import.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_043",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which module helps inspect live objects?",
        options = listOf("inspect", "sys", "gc", "types"),
        correctAnswer = "inspect",
        explanation = "inspect provides introspection tools.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_044",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which statement best describes __all__?",
        options = listOf(
            "List of private names",
            "Controls import *",
            "Defines module path",
            "Stores version"
        ),
        correctAnswer = "Controls import *",
        explanation = "__all__ defines public names for wildcard imports.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_mp_045",
        categoryId = "python_modules_and_packages",
        chapterId = PY_MODULES_PACKAGES,
        questionText = "Which is NOT a benefit of using packages?",
        options = listOf(
            "Better organization",
            "Code reuse",
            "Namespace management",
            "Faster execution always"
        ),
        correctAnswer = "Faster execution always",
        explanation = "Packages organize code but don’t guarantee speed.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))


    /* ---------- 10. File Handling ---------- */
    questions.add(pythonQuestion(
        id = "py_fh_001",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function is used to open a file in Python?",
        options = listOf("open()", "file()", "load()", "read()"),
        correctAnswer = "open()",
        explanation = "open() is used to open files in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_002",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode opens a file for reading?",
        options = listOf("w", "a", "r", "rw"),
        correctAnswer = "r",
        explanation = "r mode opens a file for reading.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_003",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode opens a file for writing?",
        options = listOf("r", "w", "a", "x"),
        correctAnswer = "w",
        explanation = "w mode opens a file for writing.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_004",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode appends data at the end of file?",
        options = listOf("w", "r", "a", "x"),
        correctAnswer = "a",
        explanation = "a mode appends data without overwriting.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_005",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode creates a file but fails if it exists?",
        options = listOf("w", "a", "x", "r"),
        correctAnswer = "x",
        explanation = "x mode creates a new file and fails if file exists.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_006",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "What happens if a file opened in 'w' mode already exists?",
        options = listOf("Error", "Data appended", "Data overwritten", "Nothing"),
        correctAnswer = "Data overwritten",
        explanation = "w mode truncates the existing file.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_007",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method reads the entire file at once?",
        options = listOf("read()", "readline()", "readlines()", "load()"),
        correctAnswer = "read()",
        explanation = "read() reads complete file content.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_008",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method reads one line at a time?",
        options = listOf("read()", "readline()", "readlines()", "next()"),
        correctAnswer = "readline()",
        explanation = "readline() reads a single line.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_009",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method reads all lines into a list?",
        options = listOf("read()", "readline()", "readlines()", "split()"),
        correctAnswer = "readlines()",
        explanation = "readlines() returns a list of lines.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_010",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method is used to write data to a file?",
        options = listOf("write()", "writeline()", "append()", "put()"),
        correctAnswer = "write()",
        explanation = "write() writes data to a file.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_011",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method writes multiple lines at once?",
        options = listOf("write()", "writelines()", "append()", "lines()"),
        correctAnswer = "writelines()",
        explanation = "writelines() writes a list of strings.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_012",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function closes an open file?",
        options = listOf("close()", "end()", "stop()", "exit()"),
        correctAnswer = "close()",
        explanation = "close() releases file resources.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_013",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which keyword automatically closes a file?",
        options = listOf("with", "using", "try", "finally"),
        correctAnswer = "with",
        explanation = "with ensures file is closed automatically.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_014",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "What is the default file mode in open()?",
        options = listOf("w", "a", "r", "rb"),
        correctAnswer = "r",
        explanation = "open() defaults to read mode.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_015",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode opens file in binary read?",
        options = listOf("rb", "br", "r", "b"),
        correctAnswer = "rb",
        explanation = "rb opens file in binary read mode.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_016",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode opens file in binary write?",
        options = listOf("bw", "wb", "w", "br"),
        correctAnswer = "wb",
        explanation = "wb writes binary data to file.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_017",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "What does file.tell() return?",
        options = listOf("File size", "Current cursor position", "Line number", "Mode"),
        correctAnswer = "Current cursor position",
        explanation = "tell() returns current file pointer position.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_018",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method moves file pointer?",
        options = listOf("tell()", "move()", "seek()", "shift()"),
        correctAnswer = "seek()",
        explanation = "seek() changes file cursor position.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_019",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which argument of seek() specifies position?",
        options = listOf("offset", "mode", "path", "file"),
        correctAnswer = "offset",
        explanation = "offset indicates number of bytes to move.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_020",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which exception occurs if file is not found?",
        options = listOf("IOError", "FileError", "FileNotFoundError", "ValueError"),
        correctAnswer = "FileNotFoundError",
        explanation = "Raised when file does not exist.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_021",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which module is used for file path handling?",
        options = listOf("sys", "os", "pathlib", "io"),
        correctAnswer = "pathlib",
        explanation = "pathlib provides object-oriented file paths.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_022",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function checks if file exists?",
        options = listOf("os.check()", "os.exists()", "os.path.exists()", "path.exists()"),
        correctAnswer = "os.path.exists()",
        explanation = "os.path.exists() checks file existence.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_023",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode allows both reading and writing?",
        options = listOf("r", "w", "r+", "x"),
        correctAnswer = "r+",
        explanation = "r+ allows reading and writing.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_024",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode appends and reads?",
        options = listOf("a", "a+", "r+", "w+"),
        correctAnswer = "a+",
        explanation = "a+ allows appending and reading.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_025",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which mode truncates file before reading and writing?",
        options = listOf("r+", "w+", "a+", "x+"),
        correctAnswer = "w+",
        explanation = "w+ truncates file and allows read/write.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_026",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method flushes internal buffer?",
        options = listOf("clear()", "flush()", "sync()", "refresh()"),
        correctAnswer = "flush()",
        explanation = "flush() writes buffered data to disk.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_027",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which file object attribute returns file name?",
        options = listOf("name", "filename", "path", "file"),
        correctAnswer = "name",
        explanation = "File object has name attribute.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_028",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which encoding is default in text files?",
        options = listOf("ascii", "utf-8", "unicode", "latin-1"),
        correctAnswer = "utf-8",
        explanation = "UTF-8 is default encoding in most systems.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_029",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which argument specifies file encoding?",
        options = listOf("type", "mode", "encode", "encoding"),
        correctAnswer = "encoding",
        explanation = "encoding parameter sets file encoding.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_030",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which method reads file line by line efficiently?",
        options = listOf("read()", "readlines()", "for loop", "split()"),
        correctAnswer = "for loop",
        explanation = "Iterating file object reads line by line.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_031",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which module handles CSV files?",
        options = listOf("json", "csv", "pickle", "io"),
        correctAnswer = "csv",
        explanation = "csv module handles CSV files.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_032",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which module serializes Python objects to file?",
        options = listOf("json", "pickle", "csv", "marshal"),
        correctAnswer = "pickle",
        explanation = "pickle serializes Python objects.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_033",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which pickle function writes object to file?",
        options = listOf("dump()", "load()", "write()", "save()"),
        correctAnswer = "dump()",
        explanation = "dump() writes object to file.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_034",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which pickle function reads object from file?",
        options = listOf("dump()", "load()", "read()", "open()"),
        correctAnswer = "load()",
        explanation = "load() reads object from file.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_035",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which file operation is safest?",
        options = listOf("Manual close", "with statement", "try-except", "flush"),
        correctAnswer = "with statement",
        explanation = "with ensures proper file closing.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_036",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which exception handles file permission issues?",
        options = listOf("IOError", "PermissionError", "OSError", "AccessError"),
        correctAnswer = "PermissionError",
        explanation = "PermissionError occurs on access denial.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_037",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function deletes a file?",
        options = listOf("os.delete()", "remove()", "os.remove()", "del file"),
        correctAnswer = "os.remove()",
        explanation = "os.remove() deletes a file.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_038",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function renames a file?",
        options = listOf("os.rename()", "rename()", "file.rename()", "mv()"),
        correctAnswer = "os.rename()",
        explanation = "os.rename() renames files.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_039",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which module handles directory operations?",
        options = listOf("sys", "os", "pathlib", "both os and pathlib"),
        correctAnswer = "both os and pathlib",
        explanation = "Both can manage directories.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_040",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function creates a directory?",
        options = listOf("os.mkdir()", "os.makedirs()", "mkdir()", "both os.mkdir() and os.makedirs()"),
        correctAnswer = "both os.mkdir() and os.makedirs()",
        explanation = "Both can create directories.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_041",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function removes an empty directory?",
        options = listOf("os.remove()", "os.delete()", "os.rmdir()", "os.unlink()"),
        correctAnswer = "os.rmdir()",
        explanation = "os.rmdir() removes empty directory.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_042",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function removes directory with content?",
        options = listOf("os.rmdir()", "shutil.rmtree()", "os.remove()", "del dir"),
        correctAnswer = "shutil.rmtree()",
        explanation = "rmtree() deletes directory recursively.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_043",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which module copies files and directories?",
        options = listOf("os", "sys", "shutil", "pathlib"),
        correctAnswer = "shutil",
        explanation = "shutil supports high-level file operations.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_044",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which function copies a file?",
        options = listOf("shutil.copy()", "os.copy()", "file.copy()", "copyfile()"),
        correctAnswer = "shutil.copy()",
        explanation = "shutil.copy() copies files.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_fh_045",
        categoryId = "python_file_handling",
        chapterId = PY_FILE_HANDLING,
        questionText = "Which statement about file handling is correct?",
        options = listOf(
            "Files close automatically always",
            "Binary files store text",
            "with statement is recommended",
            "seek() reads data"
        ),
        correctAnswer = "with statement is recommended",
        explanation = "with ensures safe and clean file handling.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))


    /* ---------- 11. Exception Handling ---------- */
    questions.add(pythonQuestion(
        id = "py_ex_001",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "What is an exception in Python?",
        options = listOf("Syntax error", "Logical error", "Runtime error", "Compile time error"),
        correctAnswer = "Runtime error",
        explanation = "Exceptions are errors that occur during program execution.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_002",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which keyword is used to handle exceptions?",
        options = listOf("catch", "handle", "except", "error"),
        correctAnswer = "except",
        explanation = "except block handles exceptions in Python.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_003",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which keyword is used to wrap risky code?",
        options = listOf("check", "try", "test", "run"),
        correctAnswer = "try",
        explanation = "try block contains code that may raise exception.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_004",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block executes when no exception occurs?",
        options = listOf("except", "finally", "else", "pass"),
        correctAnswer = "else",
        explanation = "else runs only if no exception occurs.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_005",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block always executes?",
        options = listOf("try", "except", "else", "finally"),
        correctAnswer = "finally",
        explanation = "finally executes whether exception occurs or not.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_006",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when dividing by zero?",
        options = listOf("ValueError", "ZeroDivisionError", "TypeError", "ArithmeticError"),
        correctAnswer = "ZeroDivisionError",
        explanation = "Raised when division by zero occurs.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_007",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when wrong data type is used?",
        options = listOf("ValueError", "IndexError", "TypeError", "KeyError"),
        correctAnswer = "TypeError",
        explanation = "TypeError occurs due to incompatible data types.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_008",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when converting invalid string to int?",
        options = listOf("TypeError", "IndexError", "ValueError", "KeyError"),
        correctAnswer = "ValueError",
        explanation = "ValueError occurs due to invalid value conversion.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_009",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when list index is out of range?",
        options = listOf("IndexError", "KeyError", "ValueError", "TypeError"),
        correctAnswer = "IndexError",
        explanation = "IndexError occurs when index is invalid.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_010",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when dictionary key is missing?",
        options = listOf("IndexError", "KeyError", "ValueError", "TypeError"),
        correctAnswer = "KeyError",
        explanation = "KeyError occurs when key is not found.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_011",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which keyword is used to raise an exception manually?",
        options = listOf("throw", "raise", "error", "except"),
        correctAnswer = "raise",
        explanation = "raise keyword is used to trigger exceptions manually.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_012",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which statement raises a custom error?",
        options = listOf("throw Error", "raise Exception()", "error()", "except Error"),
        correctAnswer = "raise Exception()",
        explanation = "raise Exception() creates a custom exception.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_013",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block is mandatory in exception handling?",
        options = listOf("try", "except", "finally", "else"),
        correctAnswer = "try",
        explanation = "try block is required to catch exceptions.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_014",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Can a try block exist without except?",
        options = listOf("Yes, always", "Yes, with finally", "No", "Only with else"),
        correctAnswer = "Yes, with finally",
        explanation = "try must have either except or finally.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_015",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block executes after try if no exception?",
        options = listOf("finally", "except", "else", "pass"),
        correctAnswer = "else",
        explanation = "else executes only if try succeeds.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_016",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is the base class of all exceptions?",
        options = listOf("Error", "BaseException", "Exception", "SystemExit"),
        correctAnswer = "BaseException",
        explanation = "BaseException is the root of exception hierarchy.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_017",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised for invalid file operations?",
        options = listOf("FileError", "IOError", "PermissionError", "FileNotFoundError"),
        correctAnswer = "IOError",
        explanation = "IOError occurs for input/output failures.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_018",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised when file does not exist?",
        options = listOf("IOError", "FileError", "FileNotFoundError", "PermissionError"),
        correctAnswer = "FileNotFoundError",
        explanation = "Raised when file path is invalid.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_019",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception handles permission issues?",
        options = listOf("IOError", "PermissionError", "OSError", "AccessError"),
        correctAnswer = "PermissionError",
        explanation = "PermissionError occurs due to access denial.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_020",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when recursion exceeds limit?",
        options = listOf("StackError", "RecursionError", "OverflowError", "RuntimeError"),
        correctAnswer = "RecursionError",
        explanation = "Raised when recursion depth exceeds limit.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_021",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when memory is exhausted?",
        options = listOf("OverflowError", "MemoryError", "RuntimeError", "SystemError"),
        correctAnswer = "MemoryError",
        explanation = "MemoryError occurs when memory allocation fails.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_022",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs for numeric overflow?",
        options = listOf("OverflowError", "ArithmeticError", "ValueError", "RuntimeError"),
        correctAnswer = "OverflowError",
        explanation = "Raised when arithmetic result is too large.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_023",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception class handles arithmetic errors?",
        options = listOf("ArithmeticError", "MathError", "ZeroDivisionError", "NumberError"),
        correctAnswer = "ArithmeticError",
        explanation = "ArithmeticError is base for math-related errors.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_024",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Can multiple except blocks be used?",
        options = listOf("No", "Yes", "Only two", "Only one"),
        correctAnswer = "Yes",
        explanation = "Multiple except blocks can handle different errors.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_025",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which except block executes first?",
        options = listOf(
            "Last one",
            "Most specific",
            "Random",
            "Base class"
        ),
        correctAnswer = "Most specific",
        explanation = "Specific exceptions should be handled first.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_026",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception catches all standard exceptions?",
        options = listOf("BaseException", "Error", "Exception", "All"),
        correctAnswer = "Exception",
        explanation = "Exception catches most runtime errors.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_027",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception should generally NOT be caught?",
        options = listOf("Exception", "IOError", "SystemExit", "ValueError"),
        correctAnswer = "SystemExit",
        explanation = "SystemExit should usually propagate.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_028",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which keyword is used to define custom exception?",
        options = listOf("class", "def", "raise", "error"),
        correctAnswer = "class",
        explanation = "Custom exceptions are defined using class.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_029",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Custom exception should inherit from which class?",
        options = listOf("BaseException", "Exception", "Error", "RuntimeError"),
        correctAnswer = "Exception",
        explanation = "Custom exceptions should inherit from Exception.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_030",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "What happens if exception is not handled?",
        options = listOf(
            "Ignored",
            "Program continues",
            "Program crashes",
            "Returns None"
        ),
        correctAnswer = "Program crashes",
        explanation = "Unhandled exceptions terminate program.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_031",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block is optional?",
        options = listOf("try", "except", "else", "finally"),
        correctAnswer = "else",
        explanation = "else block is optional in exception handling.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_032",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block is optional but recommended?",
        options = listOf("try", "except", "finally", "raise"),
        correctAnswer = "finally",
        explanation = "finally ensures cleanup code execution.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_033",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which statement ends program execution?",
        options = listOf("exit()", "quit()", "SystemExit", "return"),
        correctAnswer = "SystemExit",
        explanation = "SystemExit terminates interpreter.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_034",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised for assertion failure?",
        options = listOf("AssertionError", "LogicError", "ValueError", "RuntimeError"),
        correctAnswer = "AssertionError",
        explanation = "AssertionError is raised when assert fails.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_035",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which keyword is used for debugging checks?",
        options = listOf("assert", "check", "debug", "verify"),
        correctAnswer = "assert",
        explanation = "assert is used for debugging conditions.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_036",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised by assert?",
        options = listOf("AssertionError", "ValueError", "RuntimeError", "LogicError"),
        correctAnswer = "AssertionError",
        explanation = "assert raises AssertionError if condition fails.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_037",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which block should release resources?",
        options = listOf("try", "except", "else", "finally"),
        correctAnswer = "finally",
        explanation = "finally is used for cleanup tasks.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_038",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised for invalid attribute access?",
        options = listOf("AttributeError", "KeyError", "IndexError", "TypeError"),
        correctAnswer = "AttributeError",
        explanation = "AttributeError occurs when attribute is missing.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_039",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised for importing missing module?",
        options = listOf("ModuleError", "ImportError", "FileNotFoundError", "SystemError"),
        correctAnswer = "ImportError",
        explanation = "ImportError occurs when module import fails.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_040",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised when name is undefined?",
        options = listOf("NameError", "KeyError", "IndexError", "ValueError"),
        correctAnswer = "NameError",
        explanation = "NameError occurs when variable is undefined.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_041",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception occurs when iterating beyond iterator?",
        options = listOf("StopIteration", "IterationError", "IndexError", "RuntimeError"),
        correctAnswer = "StopIteration",
        explanation = "StopIteration signals end of iteration.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_042",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised for invalid indentation?",
        options = listOf("IndentError", "SyntaxError", "TabError", "All of these"),
        correctAnswer = "All of these",
        explanation = "Indentation issues raise IndentError or TabError under SyntaxError.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_043",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which exception is raised when memory allocation fails?",
        options = listOf("OverflowError", "MemoryError", "SystemError", "RuntimeError"),
        correctAnswer = "MemoryError",
        explanation = "MemoryError occurs due to insufficient memory.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_044",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which practice is recommended for exception handling?",
        options = listOf(
            "Catch all exceptions",
            "Ignore exceptions",
            "Handle specific exceptions",
            "Avoid try block"
        ),
        correctAnswer = "Handle specific exceptions",
        explanation = "Specific handling avoids hiding bugs.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_ex_045",
        categoryId = "python_exception_handling",
        chapterId = PY_EXCEPTION_HANDLING,
        questionText = "Which statement about exception handling is correct?",
        options = listOf(
            "Exceptions improve performance",
            "finally is optional but useful",
            "try cannot be nested",
            "raise cannot be used inside except"
        ),
        correctAnswer = "finally is optional but useful",
        explanation = "finally ensures cleanup even on errors.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))


    /* ---------- 12. OOP in Python ---------- */
    questions.add(pythonQuestion(
        id = "py_oops_001",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What does OOP stand for?",
        options = listOf("Object Oriented Process", "Object Oriented Programming", "Open Object Programming", "Operational Object Program"),
        correctAnswer = "Object Oriented Programming",
        explanation = "OOP is a programming paradigm based on objects and classes.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_002",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which keyword is used to define a class in Python?",
        options = listOf("class", "struct", "define", "object"),
        correctAnswer = "class",
        explanation = "Classes in Python are defined using the class keyword.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_003",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What is an object?",
        options = listOf("A blueprint", "An instance of a class", "A function", "A module"),
        correctAnswer = "An instance of a class",
        explanation = "Objects are instances created from a class.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_004",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What is a class?",
        options = listOf("An instance", "A variable", "A blueprint for objects", "A function"),
        correctAnswer = "A blueprint for objects",
        explanation = "A class defines properties and behavior of objects.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_005",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method is automatically called when an object is created?",
        options = listOf("__init__", "__new__", "__start__", "__create__"),
        correctAnswer = "__init__",
        explanation = "__init__ initializes object data.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_006",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What is self in Python?",
        options = listOf("Keyword", "Class name", "Reference to current object", "Global variable"),
        correctAnswer = "Reference to current object",
        explanation = "self refers to the current instance of the class.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_007",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which pillar of OOP hides internal details?",
        options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
        correctAnswer = "Encapsulation",
        explanation = "Encapsulation bundles data and methods together.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_008",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which OOP concept allows one class to acquire properties of another?",
        options = listOf("Encapsulation", "Abstraction", "Inheritance", "Polymorphism"),
        correctAnswer = "Inheritance",
        explanation = "Inheritance enables reuse of code.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_009",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which OOP concept allows same method name with different behavior?",
        options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
        correctAnswer = "Polymorphism",
        explanation = "Polymorphism means many forms.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_010",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which OOP concept focuses on essential features only?",
        options = listOf("Inheritance", "Encapsulation", "Abstraction", "Polymorphism"),
        correctAnswer = "Abstraction",
        explanation = "Abstraction hides implementation details.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_011",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which symbol is used for inheritance?",
        options = listOf(":", "()", "[]", "<>"),
        correctAnswer = "()",
        explanation = "Parent class is passed inside parentheses.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_012",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which inheritance type is supported by Python?",
        options = listOf("Single", "Multiple", "Multilevel", "All of these"),
        correctAnswer = "All of these",
        explanation = "Python supports all common inheritance types.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_013",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method resolves method calls in multiple inheritance?",
        options = listOf("DFS", "BFS", "MRO", "LIFO"),
        correctAnswer = "MRO",
        explanation = "MRO stands for Method Resolution Order.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_014",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which function returns method resolution order?",
        options = listOf("order()", "mro()", "dir()", "help()"),
        correctAnswer = "mro()",
        explanation = "mro() shows method lookup order.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_015",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which keyword is used to access parent class methods?",
        options = listOf("this", "parent", "super", "base"),
        correctAnswer = "super",
        explanation = "super() calls parent class methods.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_016",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which variable is shared among all objects?",
        options = listOf("Local variable", "Instance variable", "Class variable", "Global variable"),
        correctAnswer = "Class variable",
        explanation = "Class variables are shared across instances.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_017",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which variable is unique to each object?",
        options = listOf("Class variable", "Static variable", "Instance variable", "Global variable"),
        correctAnswer = "Instance variable",
        explanation = "Each object has its own instance variables.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_018",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method is called before __init__?",
        options = listOf("__start__", "__new__", "__create__", "__begin__"),
        correctAnswer = "__new__",
        explanation = "__new__ creates the object.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_019",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which keyword is used to create abstract classes?",
        options = listOf("abstract", "interface", "ABC", "virtual"),
        correctAnswer = "ABC",
        explanation = "ABC is used from abc module.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_020",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which decorator is used for abstract methods?",
        options = listOf("@abstract", "@abstractmethod", "@virtual", "@override"),
        correctAnswer = "@abstractmethod",
        explanation = "It marks methods that must be implemented.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_021",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Can we create object of abstract class?",
        options = listOf("Yes", "No", "Only once", "Only if empty"),
        correctAnswer = "No",
        explanation = "Abstract classes cannot be instantiated.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_022",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method is used for operator overloading?",
        options = listOf("__add__", "__sum__", "__plus__", "__calc__"),
        correctAnswer = "__add__",
        explanation = "__add__ overloads + operator.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_023",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What is operator overloading?",
        options = listOf(
            "Same operator different meaning",
            "Multiple operators",
            "Overwriting operators",
            "Removing operators"
        ),
        correctAnswer = "Same operator different meaning",
        explanation = "Operator overloading customizes operator behavior.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_024",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method is called when object is deleted?",
        options = listOf("__del__", "__remove__", "__delete__", "__free__"),
        correctAnswer = "__del__",
        explanation = "__del__ is destructor method.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_025",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which access modifier is not supported directly in Python?",
        options = listOf("Public", "Protected", "Private", "Static"),
        correctAnswer = "Private",
        explanation = "Python does not enforce true private access.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_026",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which naming convention indicates protected members?",
        options = listOf("__var", "_var", "var_", "var__"),
        correctAnswer = "_var",
        explanation = "Single underscore indicates protected members.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_027",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which naming convention indicates private members?",
        options = listOf("_var", "__var", "var__", "__var__"),
        correctAnswer = "__var",
        explanation = "Double underscore triggers name mangling.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_028",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What is name mangling?",
        options = listOf(
            "Renaming methods",
            "Hiding variables",
            "Changing class name",
            "Optimizing code"
        ),
        correctAnswer = "Hiding variables",
        explanation = "Name mangling avoids name clashes.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_029",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method converts object to string?",
        options = listOf("__str__", "__repr__", "__print__", "__show__"),
        correctAnswer = "__str__",
        explanation = "__str__ returns readable string representation.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_030",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method returns official representation of object?",
        options = listOf("__str__", "__repr__", "__name__", "__doc__"),
        correctAnswer = "__repr__",
        explanation = "__repr__ is developer-oriented representation.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_031",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which function checks object type?",
        options = listOf("type()", "id()", "dir()", "isinstance()"),
        correctAnswer = "isinstance()",
        explanation = "isinstance() checks object-class relationship.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_032",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which function returns memory address of object?",
        options = listOf("type()", "id()", "addr()", "memory()"),
        correctAnswer = "id()",
        explanation = "id() returns unique object identifier.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_033",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What is multiple inheritance?",
        options = listOf(
            "One parent one child",
            "Multiple parents one child",
            "One parent multiple children",
            "No inheritance"
        ),
        correctAnswer = "Multiple parents one child",
        explanation = "A class inherits from more than one parent.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_034",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which inheritance may cause diamond problem?",
        options = listOf("Single", "Multilevel", "Multiple", "Hierarchical"),
        correctAnswer = "Multiple",
        explanation = "Multiple inheritance can cause ambiguity.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_035",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "How does Python solve diamond problem?",
        options = listOf("DFS", "BFS", "MRO", "Overloading"),
        correctAnswer = "MRO",
        explanation = "MRO defines method resolution order.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_036",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which concept binds data and methods together?",
        options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
        correctAnswer = "Encapsulation",
        explanation = "Encapsulation bundles data and behavior.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_037",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which keyword checks class inheritance?",
        options = listOf("isinstance", "issubclass", "type", "super"),
        correctAnswer = "issubclass",
        explanation = "issubclass() checks class inheritance.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_038",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method is common to all Python objects?",
        options = listOf("__init__", "__str__", "__class__", "__new__"),
        correctAnswer = "__class__",
        explanation = "__class__ gives class of object.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_039",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which keyword is used to define static methods?",
        options = listOf("@staticmethod", "@classmethod", "@static", "@method"),
        correctAnswer = "@staticmethod",
        explanation = "Static methods don’t use self or cls.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_040",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which keyword defines class methods?",
        options = listOf("@classmethod", "@staticmethod", "@method", "@class"),
        correctAnswer = "@classmethod",
        explanation = "Class methods receive class reference.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_041",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "What does cls refer to?",
        options = listOf("Current object", "Parent class", "Current class", "Base object"),
        correctAnswer = "Current class",
        explanation = "cls refers to the class itself.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_042",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which method is called when attribute is accessed?",
        options = listOf("__getattr__", "__get__", "__fetch__", "__access__"),
        correctAnswer = "__getattr__",
        explanation = "__getattr__ is called for missing attributes.",
        difficulty = Difficulty.HARD,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_043",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which feature allows same interface different behavior?",
        options = listOf("Inheritance", "Abstraction", "Encapsulation", "Polymorphism"),
        correctAnswer = "Polymorphism",
        explanation = "Polymorphism enables method overriding.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_044",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which statement about Python OOP is correct?",
        options = listOf(
            "Python supports interfaces only",
            "Everything is an object",
            "Classes are optional",
            "OOP is mandatory"
        ),
        correctAnswer = "Everything is an object",
        explanation = "In Python, everything is treated as an object.",
        difficulty = Difficulty.EASY,
        createdAt = createdAt
    ))

    questions.add(pythonQuestion(
        id = "py_oops_045",
        categoryId = "python_oops",
        chapterId = PY_OOP,
        questionText = "Which concept improves code reusability the most?",
        options = listOf("Encapsulation", "Inheritance", "Polymorphism", "Abstraction"),
        correctAnswer = "Inheritance",
        explanation = "Inheritance promotes reuse of existing code.",
        difficulty = Difficulty.MEDIUM,
        createdAt = createdAt
    ))


    return questions
}
