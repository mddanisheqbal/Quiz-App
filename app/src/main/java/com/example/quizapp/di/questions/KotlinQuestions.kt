package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID

public fun getKotlinQuestions(categoryId: String, createdAt: String): List<Question> {
    return listOf(
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to declare a variable that cannot be changed in Kotlin?",
            options = listOf("val", "var", "const", "let"),
            correctAnswer = "val", explanation = "'val' is used for read-only (immutable) variables, while 'var' is for mutable variables.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 20, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a data class in Kotlin?",
            options = listOf("A class that holds data", "A class for database connections", "A class for UI elements", "A class for networking"),
            correctAnswer = "A class that holds data", explanation = "Data classes are designed to hold data and automatically provide `equals()`, `hashCode()`, `toString()`, etc.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 35, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to declare a read-only variable in Kotlin?",
            options = listOf("var", "val", "const", "let"),
            correctAnswer = "val", explanation = "In Kotlin, 'val' is used for immutable (read-only) variables, while 'var' is for mutable ones.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you define a nullable variable in Kotlin?",
            options = listOf("String", "String!", "String?", "nullable String"),
            correctAnswer = "String?", explanation = "Appending a question mark to a type name makes it nullable in Kotlin.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is the entry point for a Kotlin application?",
            options = listOf("start()", "init()", "main()", "void()"),
            correctAnswer = "main()", explanation = "The main function is the standard entry point for Kotlin programs.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a string template in Kotlin?",
            options = listOf("Hello {name}", "Hello (name)", "Hello \$name", "Hello #name"),
            correctAnswer = "Hello \$name", explanation = "Kotlin uses the dollar sign (\$) for string interpolation.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to define a function in Kotlin?",
            options = listOf("func", "def", "fun", "function"),
            correctAnswer = "fun", explanation = "Functions in Kotlin are declared using the 'fun' keyword.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the primary purpose of a 'data class' in Kotlin?",
            options = listOf("To handle UI logic", "To hold data with automatically generated methods like equals() and hashCode()", "To create a singleton", "To manage database connections"),
            correctAnswer = "To hold data with automatically generated methods like equals() and hashCode()", explanation = "Data classes are designed to store data, and Kotlin provides toString, copy, and other methods automatically.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which operator is known as the 'Elvis Operator' in Kotlin?",
            options = listOf("!!", "?.", "?:", "as?"),
            correctAnswer = "?:", explanation = "The ?: operator allows you to provide a default value if the expression on the left is null.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the default visibility modifier in Kotlin?",
            options = listOf("private", "protected", "internal", "public"),
            correctAnswer = "public", explanation = "In Kotlin, if no modifier is specified, the member is public by default.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to handle inheritance in Kotlin class headers?",
            options = listOf("extends", "implements", "inherits", ":"),
            correctAnswer = ":", explanation = "Kotlin uses a colon (:) for both extending a class and implementing an interface.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a range of numbers from 1 to 5?",
            options = listOf("1..5", "1 to 5", "range(1, 5)", "1-5"),
            correctAnswer = "1..5", explanation = "The double-dot operator (..) creates a range that includes both the start and end values.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword replaces the 'switch' statement in Kotlin?",
            options = listOf("match", "select", "when", "case"),
            correctAnswer = "when", explanation = "The 'when' expression is a more powerful and concise version of the traditional switch statement.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the return type of a function that returns nothing useful in Kotlin?",
            options = listOf("void", "Null", "Unit", "Nothing"),
            correctAnswer = "Unit", explanation = "Unit is the Kotlin equivalent to Java's 'void'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you perform a safe call to a property on a nullable object?",
            options = listOf("obj!!prop", "obj?prop", "obj?.prop", "obj->prop"),
            correctAnswer = "obj?.prop", explanation = "The safe call operator (?.) returns null if the object is null, instead of throwing an exception.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to create a singleton object in Kotlin?",
            options = listOf("single", "static", "instance", "object"),
            correctAnswer = "object", explanation = "The 'object' keyword declares a class and creates a single instance of it at the same time.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "By default, are Kotlin classes open or final?",
            options = listOf("open", "final", "abstract", "static"),
            correctAnswer = "final", explanation = "All classes in Kotlin are 'final' by default and cannot be inherited unless marked with 'open'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to create an immutable list in Kotlin?",
            options = listOf("mutableListOf()", "arrayListOf()", "listOf()", "newList()"),
            correctAnswer = "listOf()", explanation = "listOf() creates a read-only list, whereas mutableListOf() creates one that can be modified.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the result of 5 / 2 in Kotlin if both are Integers?",
            options = listOf("2.5", "2", "3", "Error"),
            correctAnswer = "2", explanation = "Integer division in Kotlin discards the remainder.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to declare a constant at the top level or inside an object?",
            options = listOf("val", "const val", "final val", "static val"),
            correctAnswer = "const val", explanation = "const val is used for compile-time constants.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which check is used for type checking in Kotlin?",
            options = listOf("instanceof", "is", "as", "typeof"),
            correctAnswer = "is", explanation = "The 'is' operator checks if an expression is an instance of a specific type.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you force-unwrap a nullable type (assert that it is not null)?",
            options = listOf("?.", "?:", "!!", "as"),
            correctAnswer = "!!", explanation = "The not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which collection type stores unique elements in Kotlin?",
            options = listOf("List", "Map", "Set", "Array"),
            correctAnswer = "Set", explanation = "A Set is a collection that does not allow duplicate elements.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a primary constructor in Kotlin?",
            options = listOf("A constructor defined in the class header", "The first constructor called in a class", "A constructor that only takes one argument", "The default empty constructor"),
            correctAnswer = "A constructor defined in the class header", explanation = "Kotlin allows you to declare the primary constructor directly after the class name.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used for string comparison in Kotlin (value equality)?",
            options = listOf("==", "===", "equals", ".compare"),
            correctAnswer = "==", explanation = "In Kotlin, == is used for structural equality (checks values), while === checks referential equality (memory address).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you iterate over a list 'items' in Kotlin?",
            options = listOf("for items in i", "for i in items", "foreach i in items", "loop i in items"),
            correctAnswer = "for i in items", explanation = "The standard for-loop in Kotlin uses the 'in' keyword to iterate over collections.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'init' blocks in Kotlin classes?",
            options = listOf("To create a new instance", "To initialize a class and run code during object creation", "To destroy an object", "To define static variables"),
            correctAnswer = "To initialize a class and run code during object creation", explanation = "The 'init' block is executed immediately after the primary constructor is called.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to import a class in Kotlin?",
            options = listOf("package", "use", "include", "import"),
            correctAnswer = "import", explanation = "The 'import' keyword is used to bring other classes or functions into the scope.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the Kotlin file extension?",
            options = listOf(".ko", ".kt", ".kl", ".kotlin"),
            correctAnswer = ".kt", explanation = "Kotlin source files use the .kt extension, and script files use .kts.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you declare a variable that can be changed later?",
            options = listOf("val", "var", "let", "const"),
            correctAnswer = "var", explanation = "The 'var' keyword is used for mutable variables.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which type represents a 64-bit signed integer in Kotlin?",
            options = listOf("Int", "Short", "Long", "Double"),
            correctAnswer = "Long", explanation = "Long is a 64-bit integer, while Int is 32-bit.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'arrayOf(1, 2, 3)' do?",
            options = listOf("Creates a list", "Creates an array", "Creates a set", "Creates a map"),
            correctAnswer = "Creates an array", explanation = "The arrayOf function is the standard way to initialize an array in Kotlin.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is an 'Extension Function' in Kotlin?",
            options = listOf("A function that can only be defined inside a class", "A way to add new functions to existing classes without inheritance", "A function that automatically expands array size", "A function used for multi-threading"),
            correctAnswer = "A way to add new functions to existing classes without inheritance", explanation = "Extension functions allow you to 'extend' a class with new functionality without modifying its source code.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which scope function returns the result of the lambda expression?",
            options = listOf("also", "apply", "run", "takeIf"),
            correctAnswer = "run", explanation = "Both 'run' and 'let' return the result of the lambda, whereas 'apply' and 'also' return the context object.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'lateinit' modifier?",
            options = listOf("To make a variable nullable", "To delay initialization of a non-null property", "To make a variable immutable", "To initialize a variable in a background thread"),
            correctAnswer = "To delay initialization of a non-null property", explanation = "lateinit is used for non-null properties that are initialized after the constructor (e.g., in dependency injection).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to transform elements in a list into a new list?",
            options = listOf("filter", "map", "forEach", "flatMap"),
            correctAnswer = "map", explanation = "The map function applies a transformation to each element and returns a list of the results.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Higher-Order Function' in Kotlin?",
            options = listOf("A function that is prioritized by the OS", "A function that takes another function as a parameter or returns one", "A function defined at the top level", "A function with a high memory limit"),
            correctAnswer = "A function that takes another function as a parameter or returns one", explanation = "Kotlin treats functions as first-class citizens, allowing them to be passed as arguments.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'inline' keyword do when used with higher-order functions?",
            options = listOf("Makes the function private", "Tells the compiler to copy the function code to the call site", "Runs the function in a single line", "Prevents the function from being called from Java"),
            correctAnswer = "Tells the compiler to copy the function code to the call site", explanation = "Inlining reduces the memory overhead of creating function objects for lambdas.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these describes a 'Sealed Class'?",
            options = listOf("A class that cannot be inherited", "A class hierarchy where subclasses are known at compile-time", "A class that is encrypted", "A class that automatically saves data to disk"),
            correctAnswer = "A class hierarchy where subclasses are known at compile-time", explanation = "Sealed classes provide a closed inheritance hierarchy, perfect for representing restricted states.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the primary difference between 'lazy' and 'lateinit'?",
            options = listOf("Lazy is for var, lateinit is for val", "Lazy is for val, lateinit is for var", "There is no difference", "Lazy is only for strings"),
            correctAnswer = "Lazy is for val, lateinit is for var", explanation = "Lazy initializes a read-only property on first access, while lateinit is for mutable properties initialized later.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Companion Object' in Kotlin?",
            options = listOf("A secondary class", "An object inside a class that acts like static members in Java", "A class that must be initialized with another", "A hidden profiler tool"),
            correctAnswer = "An object inside a class that acts like static members in Java", explanation = "Companion objects allow you to define members that belong to the class itself rather than instances.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you check if a nullable variable 'name' is NOT null and get its length safely?",
            options = listOf("name!!.length", "name?.length ?: 0", "name.length", "name.length()"),
            correctAnswer = "name?.length ?: 0", explanation = "This uses a safe call and the Elvis operator to provide a default value if the variable is null.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Smart Casting' in Kotlin?",
            options = listOf("Casting an object using AI", "Automatic casting after a type check with 'is'", "Manually casting using 'as'", "Casting a String to an Int automatically"),
            correctAnswer = "Automatic casting after a type check with 'is'", explanation = "The compiler tracks type checks and automatically casts the variable within that scope.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which scope function is used to configure an object and returns the object itself?",
            options = listOf("let", "run", "apply", "with"),
            correctAnswer = "apply", explanation = "The 'apply' function is used for object configuration and returns the receiver object.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'backing field' in Kotlin properties?",
            options = listOf("The hidden field that stores the property value", "A secondary constructor", "A field used for background threads", "The parent class field"),
            correctAnswer = "The hidden field that stores the property value", explanation = "Kotlin uses the 'field' identifier inside custom getters/setters to access the actual data storage.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to filter a list based on a condition?",
            options = listOf("map", "filter", "sort", "find"),
            correctAnswer = "filter", explanation = "The filter function returns a list containing only elements matching the given predicate.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Tailrec' function?",
            options = listOf("A function that runs at the end of the program", "A recursive function optimized to prevent StackOverflowError", "A function that handles strings", "A private function"),
            correctAnswer = "A recursive function optimized to prevent StackOverflowError", explanation = "The tailrec modifier allows the compiler to optimize recursion into a loop.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you handle multiple conditions in a 'when' expression?",
            options = listOf("using if-else", "Separating values with commas", "Using nested whens", "It is not possible"),
            correctAnswer = "Separating values with commas", explanation = "You can combine multiple branches into one by separating them with commas (e.g., 0, 1 -> ...).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is an 'Inner Class' in Kotlin?",
            options = listOf("A class defined inside another that cannot access outer class members", "A class defined inside another that can access outer class members", "A private class", "A class with no name"),
            correctAnswer = "A class defined inside another that can access outer class members", explanation = "Adding the 'inner' keyword allows a nested class to reference its outer class instance.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to explicitly cast an object?",
            options = listOf("is", "as", "to", "cast"),
            correctAnswer = "as", explanation = "The 'as' operator is used for explicit casting. Use 'as?' for a safe cast that returns null on failure.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'by' keyword represent in Kotlin?",
            options = listOf("Inheritance", "Delegation", "Multiplication", "Function call"),
            correctAnswer = "Delegation", explanation = "The 'by' keyword is used for property delegation and class delegation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function returns only the first element matching a predicate, or null if none match?",
            options = listOf("filter", "find", "first", "take"),
            correctAnswer = "find", explanation = "find returns the first matching element or null, whereas first() throws an exception if no element is found.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Vararg' parameter?",
            options = listOf("A variable that is always an argument", "A parameter that accepts a variable number of arguments", "A constant parameter", "A private parameter"),
            correctAnswer = "A parameter that accepts a variable number of arguments", explanation = "Using 'vararg' allows you to pass multiple arguments of the same type as a comma-separated list.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is used to define a 'Singleton' that can be initialized with parameters?",
            options = listOf("object", "Companion object with a custom method", "data class", "enum class"),
            correctAnswer = "Companion object with a custom method", explanation = "Since 'object' cannot have constructors, companion objects are used with patterns like 'getInstance(param)'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a range that excludes the last element (1 to 4)?",
            options = listOf("1..4", "1 until 5", "1..5", "range(1, 4)"),
            correctAnswer = "1 until 5", explanation = "The 'until' keyword creates a range that is exclusive of the end value.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Type Alias'?",
            options = listOf("A way to rename a variable", "Providing an alternative name for an existing type", "A new data type", "A private class name"),
            correctAnswer = "Providing an alternative name for an existing type", explanation = "Type aliases help make complex types (like nested generics) more readable without creating a new class.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'requireNotNull()'?",
            options = listOf("To make a variable nullable", "To throw an exception if the value is null", "To convert null to a string", "To ignore null values"),
            correctAnswer = "To throw an exception if the value is null", explanation = "It is a utility function for defensive programming that asserts a value is not null.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is true about Kotlin Interfaces?",
            options = listOf("They cannot have property declarations", "They can have default method implementations", "They cannot be implemented by multiple classes", "They can store state"),
            correctAnswer = "They can have default method implementations", explanation = "Unlike older versions of Java, Kotlin interfaces can provide bodies for methods.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Destructuring Declaration'?",
            options = listOf("Deleting a class", "Unpacking an object into multiple variables", "Converting a class to a string", "Breaking a loop"),
            correctAnswer = "Unpacking an object into multiple variables", explanation = "It allows you to assign multiple variables from a single object (e.g., val (id, name) = user).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to indicate that a function should be executed as a coroutine?",
            options = listOf("async", "launch", "suspend", "yield"),
            correctAnswer = "suspend", explanation = "The 'suspend' modifier marks a function as capable of being paused and resumed without blocking the thread.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'it' represent in a Kotlin lambda?",
            options = listOf("The return value", "The default name for a single parameter", "The current class instance", "A keyword for iteration"),
            correctAnswer = "The default name for a single parameter", explanation = "If a lambda has only one argument, you can omit its declaration and refer to it as 'it'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which collection function returns a single value by accumulating elements?",
            options = listOf("map", "filter", "reduce", "flatten"),
            correctAnswer = "reduce", explanation = "Reduce (and fold) accumulate values to produce a single result (like a sum).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'launch' and 'async' in Kotlin Coroutines?",
            options = listOf("Launch returns a value, async does not", "Async returns a Deferred result, launch returns a Job", "Launch is thread-safe, async is not", "Async can only be used in the GlobalScope"),
            correctAnswer = "Async returns a Deferred result, launch returns a Job", explanation = "Use 'async' when you need a result back (using .await()), and 'launch' for fire-and-forget tasks.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'reified' keyword allow you to do in Kotlin?",
            options = listOf("Access the generic type T at runtime inside an inline function", "Make a variable immutable across threads", "Force a function to return null", "Create a new instance of a private class"),
            correctAnswer = "Access the generic type T at runtime inside an inline function", explanation = "Normally, generic types are erased at runtime; 'reified' combined with 'inline' preserves the type information.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In Kotlin Generics, what does the 'out' keyword (Declaration-site variance) signify?",
            options = listOf("The type is a consumer and can be passed as an argument", "The type is a producer and can only be returned from methods", "The type is both a producer and consumer", "The type is excluded from obfuscation"),
            correctAnswer = "The type is a producer and can only be returned from methods", explanation = " 'out' makes a type covariant, meaning you can use a more specific type than requested for reading/producing.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'CoroutineDispatcher'?",
            options = listOf("To debug coroutine leaks", "To determine which thread or thread pool the coroutine runs on", "To cancel a coroutine", "To store coroutine local data"),
            correctAnswer = "To determine which thread or thread pool the coroutine runs on", explanation = "Dispatchers like Main, IO, and Default control the execution context of coroutines.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Value Class' (formerly Inline Class)?",
            options = listOf("A class that only holds numbers", "A class wrapped around a value that the compiler optimizes away to avoid allocation", "A class used for JSON parsing only", "A class that cannot be inherited"),
            correctAnswer = "A class wrapped around a value that the compiler optimizes away to avoid allocation", explanation = "Value classes provide type safety without the performance overhead of additional object instantiation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'crossinline' signify in an inline function?",
            options = listOf("The function can be called from Java", "The lambda parameter cannot have a non-local return", "The function is thread-safe", "The lambda can return to the outer function scope"),
            correctAnswer = "The lambda parameter cannot have a non-local return", explanation = "It ensures that the lambda cannot use 'return' to exit the calling function, which is necessary if the lambda is called in another context.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which Coroutine builder is used to bridge non-coroutine worlds to coroutines (blocking the current thread)?",
            options = listOf("launch", "async", "runBlocking", "withContext"),
            correctAnswer = "runBlocking", explanation = "runBlocking blocks the current thread until the coroutine finishes, mostly used in main functions and unit tests.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Structured Concurrency' in Kotlin?",
            options = listOf("Using classes to organize coroutines", "A guarantee that child coroutines are completed before the parent finishes", "Running coroutines in alphabetical order", "Strict memory limits for coroutines"),
            correctAnswer = "A guarantee that child coroutines are completed before the parent finishes", explanation = "Structured concurrency ensures that when a scope is cancelled, all its children are cancelled too, preventing leaks.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'in' keyword (contravariance) do in Kotlin Generics?",
            options = listOf("Allows the type to be returned only", "Allows the type to be passed as an argument but not returned", "Allows the type to be null", "It is used for loops only"),
            correctAnswer = "Allows the type to be passed as an argument but not returned", explanation = "Contravariance ('in') allows you to use a more generic type than originally specified when consuming data.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'Select' expression in coroutines?",
            options = listOf("To choose a database", "To wait for multiple suspending computations and use the first one that finishes", "To filter a list", "To select a thread dispatcher"),
            correctAnswer = "To wait for multiple suspending computations and use the first one that finishes", explanation = "Select allows you to wait for multiple channels or deferred values simultaneously.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Contract API' used for in Kotlin?",
            options = listOf("Defining legal agreements", "Informing the compiler about function behavior to improve smart casting", "Managing database migrations", "Securing API keys"),
            correctAnswer = "Informing the compiler about function behavior to improve smart casting", explanation = "Contracts let functions tell the compiler things like 'if this returns true, the parameter is not null'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Flow' in Kotlin Coroutines?",
            options = listOf("A UI design tool", "A cold asynchronous data stream that emits multiple values", "A synchronous list of items", "A type of network request"),
            correctAnswer = "A cold asynchronous data stream that emits multiple values", explanation = "Flows are similar to sequences but support coroutines and are used for reactive-style programming.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'Sequence' and 'Iterable'?",
            options = listOf("Sequences are eager, Iterables are lazy", "Iterables are eager, Sequences are lazy", "Sequences can only hold numbers", "Iterables cannot be transformed"),
            correctAnswer = "Iterables are eager, Sequences are lazy", explanation = "Sequences perform transformations one element at a time only when requested, which is more efficient for large data sets.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Context Receiver' (Experimental)?",
            options = listOf("A tool for dependency injection", "A way to define functions that require multiple receiver scopes", "A network interceptor", "A new type of constructor"),
            correctAnswer = "A way to define functions that require multiple receiver scopes", explanation = "Context receivers allow a function to be called only when multiple contexts (like a scope and a logger) are present.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does '@DslMarker' do?",
            options = listOf("Marks a class as a data class", "Prevents calling methods of outer receivers in nested DSL blocks", "Highlights code in the IDE", "Allows code to run on a server"),
            correctAnswer = "Prevents calling methods of outer receivers in nested DSL blocks", explanation = "DslMarker is used to maintain scope safety when building complex Type-Safe Builders (DSLs).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Nothing' type used for?",
            options = listOf("To represent a null value", "To represent a function that never returns (e.g., throws an error)", "To clear a variable", "To represent a void return"),
            correctAnswer = "To represent a function that never returns (e.g., throws an error)", explanation = "Nothing has no instances; it is used to mark code locations that are unreachable or functions that always throw exceptions.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'Cold' and 'Hot' streams?",
            options = listOf("Cold streams start only when collected; Hot streams produce data regardless", "Hot streams are for strings, Cold for numbers", "Cold streams are thread-safe", "Hot streams are always synchronous"),
            correctAnswer = "Cold streams start only when collected; Hot streams produce data regardless", explanation = "Flow is a cold stream. SharedFlow and StateFlow are examples of hot streams.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Operator Overloading' for the 'invoke' function?",
            options = listOf("Calling an object as a function", "Changing how addition works", "Creating a new constructor", "Updating a variable"),
            correctAnswer = "Calling an object as a function", explanation = "If an object has an 'operator fun invoke', you can use 'obj()' syntax to trigger it.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Delegated Property' using 'Observable'?",
            options = listOf("A property that is only visible to one class", "A property that triggers a callback every time it is modified", "A property used for background tasks", "A static property"),
            correctAnswer = "A property that triggers a callback every time it is modified", explanation = "Delegates.observable allows you to react to changes in a property value instantly.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to access the outer class instance from an inner class?",
            options = listOf("super", "this@OuterClassName", "this", "parent"),
            correctAnswer = "this@OuterClassName", explanation = "Qualified 'this' allows you to resolve ambiguity in nested or inner scopes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Backing Property' pattern used for?",
            options = listOf("To create a backup of the database", "To expose a read-only property while keeping a mutable one private", "To share data with Java code", "To optimize memory"),
            correctAnswer = "To expose a read-only property while keeping a mutable one private", explanation = "It ensures encapsulation by allowing the class to modify the data internally while external callers only see an immutable view.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the '@JvmField' annotation do?",
            options = listOf("Makes a field static", "Exposes a Kotlin property as a public field in Java without getters/setters", "Protects a field from obfuscation", "Converts a field to a JSON key"),
            correctAnswer = "Exposes a Kotlin property as a public field in Java without getters/setters", explanation = "It instructs the compiler not to generate getters/setters and instead expose the field directly to Java.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'yield()' in a coroutine?",
            options = listOf("To stop the coroutine", "To give other coroutines a chance to run on the same dispatcher", "To return a final value", "To restart the loop"),
            correctAnswer = "To give other coroutines a chance to run on the same dispatcher", explanation = "Yield cooperatively yields the thread to other coroutines waiting to execute.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Type Projection' in Kotlin generics?",
            options = listOf("Projecting a type onto a screen", "Restricting a generic type at the usage site (e.g., Array<out T>)", "Converting a type to a string", "A memory leak prevention tool"),
            correctAnswer = "Restricting a generic type at the usage site (e.g., Array<out T>)", explanation = "Usage-site variance allows you to restrict how a generic type is used for a specific instance.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'CoroutineScope'?",
            options = listOf("A tool for viewing coroutines", "An interface providing a context for new coroutines", "A library for networking", "A specific thread"),
            correctAnswer = "An interface providing a context for new coroutines", explanation = "Every coroutine builder is an extension on CoroutineScope, which manages its lifecycle.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the '@JvmOverloads' annotation do?",
            options = listOf("Speeds up functions", "Instructs the compiler to generate multiple Java overloads for functions with default parameters", "Prevents function overloading", "Makes functions private"),
            correctAnswer = "Instructs the compiler to generate multiple Java overloads for functions with default parameters", explanation = "Java doesn't support default parameters; this annotation makes Kotlin functions more Java-friendly.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Channel' in coroutines?",
            options = listOf("A TV channel", "A communication primitive for passing streams of values between coroutines", "A type of network socket", "A way to lock variables"),
            correctAnswer = "A communication primitive for passing streams of values between coroutines", explanation = "Channels are like non-blocking queues used to transfer data between sender and receiver coroutines.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'noinline' keyword?",
            options = listOf("To make a function non-inlineable", "To prevent a specific lambda parameter of an inline function from being inlined", "To make a function static", "To hide a function"),
            correctAnswer = "To prevent a specific lambda parameter of an inline function from being inlined", explanation = "Use 'noinline' if you need to store the lambda or pass it to another non-inline function.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Reified' type parameter useful for?",
            options = listOf("Creating private variables", "Type checking (is T) and reflections on generics inside inline functions", "Defining constants", "Multi-threading"),
            correctAnswer = "Type checking (is T) and reflections on generics inside inline functions", explanation = "Since T is normally erased, reified parameters are the only way to check types at runtime directly.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which annotation is used to tell the Kotlin compiler that a function is intended to be used as a DSL?",
            options = listOf("@DslMarker", "@Dsl", "@Builder", "@KotlinDsl"),
            correctAnswer = "@DslMarker", explanation = "Annotations annotated with @DslMarker define a DSL scope to prevent accidental use of members from outer receivers.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you define a variable that can be reassigned?",
            options = listOf("val", "var", "const", "let"),
            correctAnswer = "var", explanation = "'var' is used for mutable variables, while 'val' is for read-only ones.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to declare a package in Kotlin?",
            options = listOf("import", "namespace", "package", "module"),
            correctAnswer = "package", explanation = "The 'package' keyword is used to organize code into groups.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which scope function is used to transform a nullable object and returns the result?",
            options = listOf("apply", "let", "also", "with"),
            correctAnswer = "let", explanation = " 'let' is frequently used for null-checks and transformations, returning the lambda result.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the benefit of using a 'Data Class'?",
            options = listOf("It makes the class private", "It automatically generates equals(), hashCode(), and copy() methods", "It speeds up network calls", "It allows multiple inheritance"),
            correctAnswer = "It automatically generates equals(), hashCode(), and copy() methods", explanation = "Data classes save boilerplate code for classes that primarily store data.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you filter a list to keep only non-null elements?",
            options = listOf("list.filterNotNull()", "list.removeNulls()", "list.clean()", "list.filter { it != null }"),
            correctAnswer = "list.filterNotNull()", explanation = "filterNotNull() is a standard library function that returns a list of non-null elements.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the result of using 'GlobalScope.launch'?",
            options = listOf("It launches a thread-safe coroutine", "It launches a coroutine that lives as long as the application", "It is the recommended way to use coroutines", "It is for UI updates only"),
            correctAnswer = "It launches a coroutine that lives as long as the application", explanation = "GlobalScope is generally discouraged because it doesn't support structured concurrency and can cause memory leaks.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'CoroutineContext'?",
            options = listOf("A set of elements defining the coroutine behavior (Job, Dispatcher, etc.)", "The memory allocated to a coroutine", "A list of strings", "The parent class of all coroutines"),
            correctAnswer = "A set of elements defining the coroutine behavior (Job, Dispatcher, etc.)", explanation = "CoroutineContext is a persistent dataset of elements used to control coroutine execution.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Lifting' of an 'if' or 'when' expression?",
            options = listOf("Moving it to another file", "Using it to return a value directly to a variable", "Making it static", "A UI animation"),
            correctAnswer = "Using it to return a value directly to a variable", explanation = "In Kotlin, if and when are expressions; they can return a value that can be assigned directly to a property.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        )
    )
}