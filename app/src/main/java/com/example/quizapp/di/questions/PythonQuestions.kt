package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID

public fun getPythonQuestions(categoryId: String, createdAt: String): List<Question> {
    return listOf(
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct file extension for Python files?",
            options = listOf(".pyth", ".pt", ".py", ".pyc"),
            correctAnswer = ".py", explanation = "Python files have a .py extension.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 20, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a function in Python?",
            options = listOf("function myFunction():", "def myFunction():", "create myFunction():", "function = myFunction():"),
            correctAnswer = "def myFunction():", explanation = "The 'def' keyword is used to define a function in Python.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 25, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct file extension for Python files?",
            options = listOf(".pyth", ".pt", ".py", ".pyc"),
            correctAnswer = ".py", explanation = "Python source files use the .py extension.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to display text on the screen in Python?",
            options = listOf("echo()", "print()", "printf()", "display()"),
            correctAnswer = "print()", explanation = "The print() function sends data to the standard output device (screen).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you start a single-line comment in Python?",
            options = listOf("//", "/*", "#", "--"),
            correctAnswer = "#", explanation = "In Python, the hash symbol (#) is used to begin a single-line comment.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which data type is used to store a sequence of characters?",
            options = listOf("int", "float", "str", "bool"),
            correctAnswer = "str", explanation = "The 'str' (string) type represents text in Python.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a variable in Python?",
            options = listOf("var x = 5", "int x = 5", "x = 5", "declare x = 5"),
            correctAnswer = "x = 5", explanation = "Python is dynamically typed; you create a variable by simply assigning a value to a name.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a valid Python list?",
            options = listOf("[1, 2, 3]", "(1, 2, 3)", "{1, 2, 3}", "<1, 2, 3>"),
            correctAnswer = "[1, 2, 3]", explanation = "Lists in Python are defined using square brackets [].",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which operator is used for exponentiation (power) in Python?",
            options = listOf("^", "**", "pow", "//"),
            correctAnswer = "**", explanation = "The double asterisk (**) is the power operator in Python.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of 3 + 2 * 2 in Python?",
            options = listOf("10", "7", "8", "9"),
            correctAnswer = "7", explanation = "Python follows operator precedence (PEMDAS/BODMAS), performing multiplication before addition.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a function in Python?",
            options = listOf("function myFunc():", "def myFunc():", "create myFunc():", "func myFunc():"),
            correctAnswer = "def myFunc():", explanation = "The 'def' keyword is used to define a function in Python.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which collection is ordered, changeable, and allows duplicate members?",
            options = listOf("List", "Tuple", "Set", "Dictionary"),
            correctAnswer = "List", explanation = "Lists are ordered and mutable (changeable) sequences.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct way to get the length of a list 'my_list'?",
            options = listOf("my_list.length()", "len(my_list)", "my_list.size()", "count(my_list)"),
            correctAnswer = "len(my_list)", explanation = "The len() function returns the number of items in an object.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to check a condition in Python?",
            options = listOf("check", "case", "if", "select"),
            correctAnswer = "if", explanation = "The 'if' statement is used for conditional execution.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the default return value of a function that does not return anything?",
            options = listOf("0", "False", "None", "null"),
            correctAnswer = "None", explanation = "Python functions return the special value 'None' by default.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is used to define a block of code in Python?",
            options = listOf("Curly braces", "Parentheses", "Indentation", "Quotation marks"),
            correctAnswer = "Indentation", explanation = "Python uses whitespace indentation to define code blocks instead of braces.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'input()' function do?",
            options = listOf("Prints data", "Gets user input from the keyboard", "Imports a library", "Calculates a value"),
            correctAnswer = "Gets user input from the keyboard", explanation = "input() allows the program to pause and wait for the user to type something.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which collection is unchangeable (immutable)?",
            options = listOf("List", "Dictionary", "Tuple", "Set"),
            correctAnswer = "Tuple", explanation = "Tuples are ordered but immutable, meaning they cannot be modified after creation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct syntax for a 'for' loop in Python?",
            options = listOf("for x in y:", "for x to y:", "for (x; y):", "for each x in y:"),
            correctAnswer = "for x in y:", explanation = "The 'for...in' syntax is used to iterate over a sequence.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you check if a key exists in a dictionary?",
            options = listOf("if key in dict:", "if dict.has(key):", "if key exists:", "if key.in(dict):"),
            correctAnswer = "if key in dict:", explanation = "The 'in' operator is the standard way to check for key existence in a dictionary.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to import a module?",
            options = listOf("using", "include", "import", "require"),
            correctAnswer = "import", explanation = "The 'import' statement is used to bring code from other modules into the current script.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'bool(0)' evaluate to in Python?",
            options = listOf("True", "False", "None", "Error"),
            correctAnswer = "False", explanation = "Zero is considered 'Falsy' in Python, so bool(0) is False.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you add an element to the end of a list?",
            options = listOf("list.add()", "list.insert()", "list.append()", "list.push()"),
            correctAnswer = "list.append()", explanation = "The append() method adds a single item to the end of the list.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a valid way to define a string?",
            options = listOf("'Hello'", "\"Hello\"", "\"\"\"Hello\"\"\"", "All of the above"),
            correctAnswer = "All of the above", explanation = "Python supports single, double, and triple quotes for string definition.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the index of the first item in a Python list?",
            options = listOf("1", "0", "-1", "Depends on the list"),
            correctAnswer = "0", explanation = "Like many programming languages, Python uses zero-based indexing.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which operator is used for floor division (integer division)?",
            options = listOf("/", "//", "%", "div"),
            correctAnswer = "//", explanation = "The // operator divides two numbers and rounds down to the nearest whole number.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you handle exceptions in Python?",
            options = listOf("try-catch", "try-except", "do-except", "try-handle"),
            correctAnswer = "try-except", explanation = "Python uses try-except blocks to catch and handle errors.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a Python data type for storing key-value pairs?",
            options = listOf("List", "Set", "Dictionary", "Tuple"),
            correctAnswer = "Dictionary", explanation = "Dictionaries store data in {key: value} format.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you convert a string '123' to an integer?",
            options = listOf("int('123')", "str(123)", "convert('123')", "Integer('123')"),
            correctAnswer = "int('123')", explanation = "The int() function converts a compatible value into an integer.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to return a value from a function?",
            options = listOf("send", "return", "exit", "give"),
            correctAnswer = "return", explanation = "The return statement exits a function and sends a value back to the caller.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of 'print(type(5.5))'?",
            options = listOf("<class 'int'>", "<class 'float'>", "<class 'str'>", "<class 'double'>"),
            correctAnswer = "<class 'float'>", explanation = "Numbers with decimals are identified as the 'float' type in Python.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to define a class in Python?",
            options = listOf("define", "struct", "class", "object"),
            correctAnswer = "class", explanation = "The 'class' keyword is used to create a blueprint for objects.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the result of the expression: [x for x in range(5) if x % 2 == 0]?",
            options = listOf("[0, 1, 2, 3, 4]", "[1, 3]", "[0, 2, 4]", "[2, 4]"),
            correctAnswer = "[0, 2, 4]", explanation = "This is a list comprehension that filters the range to include only even numbers.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is used to remove and return the last element from a list?",
            options = listOf("remove()", "delete()", "pop()", "discard()"),
            correctAnswer = "pop()", explanation = "The pop() method removes the item at the given index (default is last) and returns it.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of the following slice: 'Python'[1:4]?",
            options = listOf("'Pyt'", "'yth'", "'ytho'", "'Pyth'"),
            correctAnswer = "'yth'", explanation = "Slicing [start:stop] includes the start index but excludes the stop index. 'y' is at 1, 't' at 2, 'h' at 3.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you merge two dictionaries in Python 3.9+?",
            options = listOf("dict1 + dict2", "dict1.merge(dict2)", "dict1 | dict2", "dict1 & dict2"),
            correctAnswer = "dict1 | dict2", explanation = "Python 3.9 introduced the union operator (|) for dictionaries.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword allows you to modify a variable outside of the current function's scope?",
            options = listOf("extern", "global", "outside", "volatile"),
            correctAnswer = "global", explanation = "The 'global' keyword is used to declare that a variable inside a function refers to the global scope.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the primary difference between a List and a Tuple?",
            options = listOf("Lists are faster", "Tuples are mutable", "Lists are mutable, Tuples are immutable", "Tuples allow duplicates"),
            correctAnswer = "Lists are mutable, Tuples are immutable", explanation = "Once a tuple is created, its elements cannot be changed, unlike a list.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of 'print(0.1 + 0.2 == 0.3)'?",
            options = listOf("True", "False", "None", "Error"),
            correctAnswer = "False", explanation = "Due to floating-point precision issues, 0.1 + 0.2 results in 0.30000000000000004.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which built-in function can be used to iterate over a list while keeping track of the index?",
            options = listOf("counter()", "enumerate()", "track()", "index()"),
            correctAnswer = "enumerate()", explanation = "enumerate() returns an iterable of tuples containing the index and the value.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'pass' statement do in Python?",
            options = listOf("Exits the loop", "Skips the current iteration", "Does nothing (placeholder)", "Returns a value"),
            correctAnswer = "Does nothing (placeholder)", explanation = "The 'pass' statement is used when a statement is syntactically required but you don't want any command or code to execute.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is used to add all elements of one list into another list?",
            options = listOf("append()", "add()", "extend()", "concat()"),
            correctAnswer = "extend()", explanation = "append() adds the list as a single object, while extend() iterates over its elements and adds them individually.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the '__init__' method in a Python class?",
            options = listOf("To destroy an object", "To initialize the object's attributes", "To define a private method", "To inherit from a parent class"),
            correctAnswer = "To initialize the object's attributes", explanation = "It is the constructor method called when an instance of a class is created.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What will 'bool([])' return?",
            options = listOf("True", "False", "None", "Error"),
            correctAnswer = "False", explanation = "Empty collections (lists, tuples, sets, strings) are considered Falsy in Python.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which module in Python is used for regular expressions?",
            options = listOf("regex", "re", "exp", "regexp"),
            correctAnswer = "re", explanation = "The 're' module provides support for regular expressions in Python.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of 2 ** 3 ** 2?",
            options = listOf("64", "512", "128", "Error"),
            correctAnswer = "512", explanation = "Exponentiation in Python is right-associative, so it evaluates as 2 ** (3 ** 2) = 2 ** 9.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to convert a character to its Unicode integer value?",
            options = listOf("chr()", "ord()", "unicode()", "int()"),
            correctAnswer = "ord()", explanation = "ord('a') returns 97, while chr(97) returns 'a'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a set in Python?",
            options = listOf("[1, 2]", "(1, 2)", "{1, 2}", "<1, 2>"),
            correctAnswer = "{1, 2}", explanation = "Sets are defined using curly braces without key-value pairs.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the result of 'abc' * 2?",
            options = listOf("'abcabc'", "'aabbcc'", "Error", "'abc2'"),
            correctAnswer = "'abcabc'", explanation = "The multiplication operator repeats a string N times.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What happens if you use a key that doesn't exist in a dictionary using the get() method?",
            options = listOf("KeyError", "Returns None", "Returns 0", "Program crashes"),
            correctAnswer = "Returns None", explanation = "Unlike square bracket access [key], get() returns None (or a default value) if the key is missing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to skip the rest of the code inside a loop for the current iteration?",
            options = listOf("break", "stop", "continue", "skip"),
            correctAnswer = "continue", explanation = "continue returns the control to the start of the loop for the next iteration.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you open a file for writing in Python?",
            options = listOf("open('file.txt', 'r')", "open('file.txt', 'w')", "open('file.txt', 'a')", "open('file.txt', 'x')"),
            correctAnswer = "open('file.txt', 'w')", explanation = "'w' opens for writing (overwrites), 'a' opens for appending, and 'r' for reading.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is used to generate a sequence of numbers?",
            options = listOf("list()", "range()", "sequence()", "generate()"),
            correctAnswer = "range()", explanation = "range() returns an immutable sequence of numbers, commonly used in loops.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of print('Hello'[::-1])?",
            options = listOf("'Hello'", "'olleH'", "'H'", "'o'"),
            correctAnswer = "'olleH'", explanation = "The slice [::-1] is a common Python idiom for reversing a string or list.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these allows you to run code after the try/except blocks regardless of an error?",
            options = listOf("catch", "final", "finally", "always"),
            correctAnswer = "finally", explanation = "The finally block is used for cleanup actions and runs no matter what.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you remove an item from a set without raising an error if the item is not present?",
            options = listOf("remove()", "discard()", "pop()", "clear()"),
            correctAnswer = "discard()", explanation = "discard() removes the element if it exists; remove() raises a KeyError if it does not.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a valid way to create a list of squares from 0 to 4?",
            options = listOf("[x*x for x in range(5)]", "(x*x for x in range(5))", "{x*x for x in range(5)}", "[x^2 for x in range(5)]"),
            correctAnswer = "[x*x for x in range(5)]", explanation = "This is a list comprehension. (x*x...) would create a generator.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'self' in Python class methods?",
            options = listOf("A keyword like 'this' in Java", "The first parameter representing the instance", "A static reference to the class", "An optional parameter"),
            correctAnswer = "The first parameter representing the instance", explanation = "By convention, 'self' refers to the instance of the object being acted upon.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of print(type(lambda x: x))?",
            options = listOf("<class 'function'>", "<class 'lambda'>", "<class 'object'>", "Error"),
            correctAnswer = "<class 'function'>", explanation = "Lambda expressions create function objects.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method returns a list of all keys in a dictionary?",
            options = listOf("all_keys()", "keys()", "get_keys()", "list_keys()"),
            correctAnswer = "keys()", explanation = "dict.keys() returns a view object of all keys in the dictionary.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'nonlocal' do in Python?",
            options = listOf("Declares a global variable", "Accesses a variable in the nearest enclosing scope (not global)", "Imports a local module", "Declares a private variable"),
            correctAnswer = "Accesses a variable in the nearest enclosing scope (not global)", explanation = "It is used in nested functions to modify a variable in the outer (non-global) scope.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function returns both the quotient and the remainder of a division?",
            options = listOf("div()", "mod()", "divmod()", "split()"),
            correctAnswer = "divmod()", explanation = "divmod(a, b) returns a tuple (a // b, a % b).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the '__slots__' attribute in a Python class?",
            options = listOf("To define private methods", "To reduce memory footprint by preventing the creation of __dict__", "To enable multiple inheritance", "To speed up function calls"),
            correctAnswer = "To reduce memory footprint by preventing the creation of __dict__", explanation = "__slots__ tells Python not to use a dynamic dictionary for each instance, saving significant memory for millions of objects.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these best describes a 'Closure' in Python?",
            options = listOf("A function that closes the program", "A nested function that remembers variables from its enclosing scope", "A method that deletes an object", "A way to hide code from the user"),
            correctAnswer = "A nested function that remembers variables from its enclosing scope", explanation = "Closures allow a function to retain access to local variables from the scope in which it was created even after that scope has finished executing.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'GIL' (Global Interpreter Lock) in CPython?",
            options = listOf("A lock that prevents multiple processes from running", "A mutex that allows only one thread to execute Python bytecode at a time", "A security feature for web servers", "A garbage collection algorithm"),
            correctAnswer = "A mutex that allows only one thread to execute Python bytecode at a time", explanation = "The GIL is necessary because CPython's memory management is not thread-safe, though it limits true parallel execution of threads.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the Method Resolution Order (MRO) algorithm used in Python 3?",
            options = listOf("Depth-First Search", "C3 Linearization", "Breadth-First Search", "Linear Regression"),
            correctAnswer = "C3 Linearization", explanation = "Python 3 uses the C3 Linearization algorithm to determine the order in which base classes are searched during lookup.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does a 'Generator' function return when called?",
            options = listOf("The final calculated value", "A list of all results", "An iterator object", "None"),
            correctAnswer = "An iterator object", explanation = "Calling a generator function does not run the code; it returns an iterator that yields values one by one using the yield keyword.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Metaclass' in Python?",
            options = listOf("A class that inherits from multiple classes", "A class that defines how other classes behave (a class of a class)", "A private class in a module", "The root Object class"),
            correctAnswer = "A class that defines how other classes behave (a class of a class)", explanation = "Just as an object is an instance of a class, a class is an instance of a metaclass (usually 'type').",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In the 'multiprocessing' module, how is data shared between processes by default?",
            options = listOf("Shared memory addresses", "Via serialization (pickling)", "Through global variables", "Using the GIL"),
            correctAnswer = "Via serialization (pickling)", explanation = "Because processes have separate memory spaces, data must be 'pickled' (serialized) to be sent between them.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which decorator is used to define a method that can be called on the class itself, rather than an instance?",
            options = listOf("@staticmethod", "@classmethod", "@property", "@instancemethod"),
            correctAnswer = "@classmethod", explanation = "@classmethod receives the class (cls) as the first argument, whereas @staticmethod receives no implicit first argument.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'functools.wraps' decorator?",
            options = listOf("To speed up function execution", "To preserve the original function's metadata (like name and docstrings)", "To encrypt function code", "To convert a function into a class"),
            correctAnswer = "To preserve the original function's metadata (like name and docstrings)", explanation = "When writing decorators, wraps ensures the decorated function still looks like the original function to tools and users.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How does Python's Garbage Collector handle cyclic references?",
            options = listOf("It cannot handle them", "Reference counting only", "Using a generational cyclic garbage collector", "By restarting the interpreter"),
            correctAnswer = "Using a generational cyclic garbage collector", explanation = "Python uses reference counting for immediate cleanup but has a cyclic GC to find and delete groups of objects that point to each other.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What will happen if you modify a list while iterating over it with a 'for' loop?",
            options = listOf("It works perfectly", "It may skip elements or cause unexpected behavior", "Python raises a ConcurrentModificationError", "The list becomes immutable automatically"),
            correctAnswer = "It may skip elements or cause unexpected behavior", explanation = "Modifying the length of a collection during iteration shifts indices, often leading to skipped items or infinite loops.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between '__str__' and '__repr__'?",
            options = listOf("No difference", "__str__ is for users, __repr__ is for developers/debugging", "__repr__ is for users, __str__ is for debugging", "__str__ is faster"),
            correctAnswer = "__str__ is for users, __repr__ is for developers/debugging", explanation = "__repr__ should ideally return a string that could recreate the object, while __str__ is a readable version.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Monkey Patching' in Python?",
            options = listOf("Writing code that looks like a monkey", "Dynamically replacing attributes or methods at runtime", "A way to optimize loops", "Using a specific library for monkeys"),
            correctAnswer = "Dynamically replacing attributes or methods at runtime", explanation = "Monkey patching allows you to change the behavior of a module or class without modifying the source code.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'yield from' expression do?",
            options = listOf("Restarts a generator", "Delegates part of its operations to another generator or iterable", "Stops the generator forever", "Returns a value to the global scope"),
            correctAnswer = "Delegates part of its operations to another generator or iterable", explanation = "Introduced in Python 3.3, it simplifies nesting generators and creates a transparent pathway to sub-generators.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Abstract Base Class' (abc) module used for?",
            options = listOf("To create faster lists", "To define interfaces and ensure subclasses implement specific methods", "To hide class logic", "To create anonymous classes"),
            correctAnswer = "To define interfaces and ensure subclasses implement specific methods", explanation = "Using @abstractmethod within an ABC prevents instantiation unless all abstract methods are overridden.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function in the 'sys' module returns the size of an object in bytes?",
            options = listOf("sys.size()", "sys.getsizeof()", "sys.mem()", "sys.bytes()"),
            correctAnswer = "sys.getsizeof()", explanation = "This returns the memory consumption of an object, though it may not include the size of nested objects.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'with' statement and context managers?",
            options = listOf("To speed up file reading", "To ensure resources are properly acquired and released (like closing files)", "To create a loop", "To define a private scope"),
            correctAnswer = "To ensure resources are properly acquired and released (like closing files)", explanation = "Context managers use __enter__ and __exit__ methods to handle setup and teardown automatically.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Descriptor' in Python?",
            options = listOf("A string that describes a function", "An object that defines __get__, __set__, or __delete__ methods", "A documentation tool", "A type of variable"),
            correctAnswer = "An object that defines __get__, __set__, or __delete__ methods", explanation = "Descriptors power features like @property, @classmethod, and even how methods work in classes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you achieve 'Deep Copy' of a nested list in Python?",
            options = listOf("list.copy()", "list[:]", "copy.deepcopy(list)", "list(list)"),
            correctAnswer = "copy.deepcopy(list)", explanation = "A shallow copy (like .copy()) only copies the outer list; deepcopy recursively copies all objects found within.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is called when an attribute lookup fails?",
            options = listOf("__getattribute__", "__getattr__", "__setattr__", "__lookup__"),
            correctAnswer = "__getattr__", explanation = "__getattribute__ is called for every access, whereas __getattr__ is only called if the attribute isn't found through normal means.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'weakref' module used for?",
            options = listOf("To make Python code run slower", "To create references to objects that don't prevent them from being garbage collected", "To delete variables permanently", "To handle weak encryption"),
            correctAnswer = "To create references to objects that don't prevent them from being garbage collected", explanation = "Weak references are useful for caches where you don't want the cache itself to keep an object alive.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of: print(issubclass(bool, int))?",
            options = listOf("True", "False", "Error", "None"),
            correctAnswer = "True", explanation = "In Python, the bool class is a subclass of the int class (True is 1, False is 0).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Interning' in Python regarding integers?",
            options = listOf("Storing integers in a list", "The JVM-like optimization of caching small integers (-5 to 256)", "A way to convert floats to ints", "A security feature for math"),
            correctAnswer = "The JVM-like optimization of caching small integers (-5 to 256)", explanation = "CPython pre-allocates small integers so they always refer to the same memory address, saving space and time.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'asyncio' provide in Python?",
            options = listOf("True multi-core parallelism", "Single-threaded concurrent code using coroutines", "A way to run Java code", "Automatic error correction"),
            correctAnswer = "Single-threaded concurrent code using coroutines", explanation = "Asyncio uses an event loop to handle I/O-bound tasks without the overhead of multiple OS threads.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the '__call__' method?",
            options = listOf("To call a phone number", "To make an instance of a class callable like a function", "To call the superclass constructor", "To define a static method"),
            correctAnswer = "To make an instance of a class callable like a function", explanation = "If a class implements __call__, you can write 'obj()' to execute logic inside that method.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Partial Function Application' in Python?",
            options = listOf("Only writing half of a function", "Creating a new function by fixing some arguments of an existing function", "A function that only runs sometimes", "A bug in the compiler"),
            correctAnswer = "Creating a new function by fixing some arguments of an existing function", explanation = "The 'functools.partial' tool allows you to pre-fill arguments of a function to create a new, simpler version.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which built-in function is used to dynamically execute Python code stored in a string?",
            options = listOf("run()", "exec()", "eval()", "Both exec() and eval()"),
            correctAnswer = "Both exec() and eval()", explanation = "eval() is for expressions (returning a value), while exec() is for blocks of code (statements).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What are 'Dunder' methods in Python?",
            options = listOf("Methods named after 'Dunder Mifflin'", "Double underscore methods like __init__", "Private methods", "Methods that only run once"),
            correctAnswer = "Double underscore methods like __init__", explanation = "Short for 'Double Under', these are special methods that Python calls automatically for specific operations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'sys.setrecursionlimit()'?",
            options = listOf("To make recursion faster", "To change the maximum depth of the Python interpreter stack", "To stop all loops", "To limit memory usage"),
            correctAnswer = "To change the maximum depth of the Python interpreter stack", explanation = "By default, Python limits recursion to ~1000 calls to prevent a stack overflow from infinite recursion.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'is' and '=='?",
            options = listOf("No difference", "'is' checks identity (memory address), '==' checks equality (value)", "'==' checks identity, 'is' checks value", "'is' is only for strings"),
            correctAnswer = "'is' checks identity (memory address), '==' checks equality (value)", explanation = "Two lists might be equal [1,2] == [1,2], but they are different objects in memory (is returns False).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to find the minimum value in a list?",
            options = listOf("min()", "small()", "lowest()", "less()"),
            correctAnswer = "min()", explanation = "The min() function returns the item with the lowest value in an iterable.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'break' do in a loop?",
            options = listOf("Restarts the loop", "Exits the loop entirely", "Skips one iteration", "Pauses the loop"),
            correctAnswer = "Exits the loop entirely", explanation = "The break statement terminates the current loop immediately.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you check if a string contains only numeric characters?",
            options = listOf("s.isnumber()", "s.isdigit()", "s.numeric()", "s.isint()"),
            correctAnswer = "s.isdigit()", explanation = "isdigit() returns True if all characters in the string are digits.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of: list(range(1, 10, 2))?",
            options = listOf("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", "[1, 3, 5, 7, 9]", "[2, 4, 6, 8]", "[1, 10, 2]"),
            correctAnswer = "[1, 3, 5, 7, 9]", explanation = "range(start, stop, step) generates numbers from start to stop-1, jumping by step.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which collection is used to store unique elements in no particular order?",
            options = listOf("List", "Set", "Tuple", "Dictionary"),
            correctAnswer = "Set", explanation = "Sets automatically remove duplicates and do not maintain a specific order.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of print(bool('False'))?",
            options = listOf("True", "False", "Error", "None"),
            correctAnswer = "True", explanation = "Any non-empty string evaluates to True in Python, even if the content of the string is the word 'False'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Currying' in Python?",
            options = listOf("A type of Indian dish", "Transforming a function with multiple arguments into a sequence of functions each with one argument", "Speeding up code", "Deleting memory"),
            correctAnswer = "Transforming a function with multiple arguments into a sequence of functions each with one argument", explanation = "Currying allows you to partially apply functions and is a core concept in functional programming.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the '@property' decorator?",
            options = listOf("To make a method private", "To define a method as a getter for an attribute, allowing it to be accessed like a variable", "To speed up variable access", "To create a constant"),
            correctAnswer = "To define a method as a getter for an attribute, allowing it to be accessed like a variable", explanation = "@property allows you to add logic (like validation) to attribute access without changing the calling syntax.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        )
    )
}
