package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID

public fun getJavaQuestions(categoryId: String, createdAt: String): List<Question> {
    return listOf(
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the main purpose of the JVM?",
            options = listOf("To compile Java code", "To run compiled Java bytecode", "To write Java code", "To debug Java code"),
            correctAnswer = "To run compiled Java bytecode", explanation = "The Java Virtual Machine (JVM) is an abstract machine that enables a computer to run a Java program.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to declare a constant in Java?",
            options = listOf("const", "static", "final", "let"),
            correctAnswer = "final", explanation = "The 'final' keyword is used to declare a variable that cannot be changed.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is NOT a primitive data type in Java?",
            options = listOf("int", "boolean", "String", "char"),
            correctAnswer = "String", explanation = "String is a class (Reference type), while int, boolean, and char are primitives.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the extension of compiled Java classes?",
            options = listOf(".java", ".class", ".txt", ".exe"),
            correctAnswer = ".class", explanation = "Java source files (.java) are compiled into bytecode files (.class).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which operator is used to compare two values for equality?",
            options = listOf("=", "==", "equals", "is"),
            correctAnswer = "==", explanation = "The '==' operator compares values for primitives and memory addresses for objects.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which loop is guaranteed to execute at least once?",
            options = listOf("for", "while", "do-while", "foreach"),
            correctAnswer = "do-while", explanation = "The do-while loop checks the condition after executing the body.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'break' statement?",
            options = listOf("To exit a loop or switch", "To skip one iteration", "To stop the program", "To restart a loop"),
            correctAnswer = "To exit a loop or switch", explanation = "The break statement terminates the innermost loop or switch statement immediately.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Blueprint' for creating objects called?",
            options = listOf("Method", "Variable", "Class", "Package"),
            correctAnswer = "Class", explanation = "A class defines the properties and behaviors that the objects created from it will have.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which OOP concept focuses on wrapping data and code together?",
            options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
            correctAnswer = "Encapsulation", explanation = "Encapsulation keeps data safe by restricting direct access and using getters/setters.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword refers to the current instance of a class?",
            options = listOf("super", "this", "self", "current"),
            correctAnswer = "this", explanation = "'this' is a reference variable that refers to the current object.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'void' mean in a method signature?",
            options = listOf("Returns an integer", "Returns nothing", "Returns null", "The method is empty"),
            correctAnswer = "Returns nothing", explanation = "The void keyword specifies that a method should not return a value.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a valid variable name in Java?",
            options = listOf("2ndVariable", "_myVar", "class", "my-Var"),
            correctAnswer = "_myVar", explanation = "Variable names can start with letters, underscores (_), or dollar signs ($), but not numbers.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the index of the first element in a Java array?",
            options = listOf("1", "0", "-1", "Depends on size"),
            correctAnswer = "0", explanation = "Java arrays are zero-indexed.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you find the length of an array named 'arr'?'",
            options = listOf("arr.size()", "arr.length()", "arr.length", "arr.count"),
            correctAnswer = "arr.length", explanation = "In Java, 'length' is a property of an array, not a method.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is used to compare two strings for content equality?",
            options = listOf("==", "equals()", "compare()", "isEqual()"),
            correctAnswer = "equals()", explanation = "The equals() method compares the actual characters inside the String objects.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method converts a string to uppercase?",
            options = listOf("upper()", "toUpper()", "toUpperCase()", "setUpper()"),
            correctAnswer = "toUpperCase()", explanation = "The toUpperCase() method returns a new string with all characters in capital letters.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to explicitly throw an exception?",
            options = listOf("throws", "throw", "catch", "try"),
            correctAnswer = "throw", explanation = "The 'throw' keyword is used to signal the occurrence of an exception.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a checked exception?",
            options = listOf("NullPointerException", "IOException", "ArithmeticException", "ArrayIndexOutOfBoundsException"),
            correctAnswer = "IOException", explanation = "IOException is a checked exception and must be handled or declared.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to include a package in a program?",
            options = listOf("package", "import", "include", "use"),
            correctAnswer = "import", explanation = "The 'import' keyword makes classes from other packages available to your code.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct way to declare a package?",
            options = listOf("import my.package;", "package my.package;", "new package my.package;", "include my.package;"),
            correctAnswer = "package my.package;", explanation = "The 'package' statement must be the first line in a Java source file.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does WORA stand for in Java?",
            options = listOf("Write Only, Read Anywhere", "Work On Real Applications", "Write Once, Run Anywhere", "World of Rich Applications"),
            correctAnswer = "Write Once, Run Anywhere", explanation = "The 'Write Once, Run Anywhere' (WORA) philosophy makes it platform independent.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What converts Java bytecode into machine-specific code?",
            options = listOf("Compiler", "JVM", "IDE", "Linker"),
            correctAnswer = "JVM", explanation = "The Java Virtual Machine (JVM) interprets/compiles bytecode into native machine code.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a valid comment in Java?",
            options = listOf("# Comment", "// Comment", "/* Comment", "Both // and /* */"),
            correctAnswer = "Both // and /* */", explanation = "// is for single-line comments and /* */ is for multi-line.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the size of 'char' in Java?",
            options = listOf("1 byte", "2 bytes", "4 bytes", "8 bytes"),
            correctAnswer = "2 bytes", explanation = "Java uses Unicode for characters, which takes 16 bits (2 bytes).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which access modifier allows access within the same package and subclasses?",
            options = listOf("private", "protected", "public", "default"),
            correctAnswer = "protected", explanation = "Protected members are accessible within the same package and by subclasses in other packages.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you declare a method that belongs to the class rather than an instance?",
            options = listOf("void", "static", "final", "abstract"),
            correctAnswer = "static", explanation = "Static methods can be called without creating an object of the class.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does IDE stand for?",
            options = listOf("Internal Data Engine", "Integrated Development Environment", "Integrated Desktop Editor", "Intelligent Design Element"),
            correctAnswer = "Integrated Development Environment", explanation = "Examples include IntelliJ IDEA, Eclipse, and NetBeans.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to create an object?",
            options = listOf("create", "new", "init", "object"),
            correctAnswer = "new", explanation = "The 'new' keyword allocates memory for a new object on the heap.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Can a class have multiple constructors?",
            options = listOf("Yes", "No", "Only if they have different names", "Only one"),
            correctAnswer = "Yes", explanation = "This is called Constructor Overloading.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the base class for all classes in Java?",
            options = listOf("Main", "Java", "Object", "Root"),
            correctAnswer = "Object", explanation = "java.lang.Object is the ultimate superclass of every class in Java.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is used to handle exceptions?",
            options = listOf("try-catch", "if-else", "for-each", "switch-case"),
            correctAnswer = "try-catch", explanation = "The try-catch block is used to enclose code that might throw an exception.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which data type is used to store fractional numbers?",
            options = listOf("int", "double", "long", "short"),
            correctAnswer = "double", explanation = "Double and float are used for decimal (floating-point) numbers.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is true about a 'finally' block?",
            options = listOf("It only runs if an exception is caught", "It runs even if there is a return statement in the try block", "It is used to handle checked exceptions", "It must follow a catch block"),
            correctAnswer = "It runs even if there is a return statement in the try block", explanation = "The finally block is designed for cleanup and will execute even if the try or catch block contains a return, break, or continue statement.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Loose Coupling' in Java achieved through?",
            options = listOf("Inheritance", "Interfaces", "Encapsulation", "Static Methods"),
            correctAnswer = "Interfaces", explanation = "Interfaces allow objects to interact without knowing the internal implementation details of each other, promoting loose coupling.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which memory area stores local variables and method calls?",
            options = listOf("Heap Memory", "Stack Memory", "Method Area", "Static Area"),
            correctAnswer = "Stack Memory", explanation = "Stack memory is used for static memory allocation and the execution of a thread; it contains primitive values and references to objects.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the result of '10' + 20 + 30 in Java?",
            options = listOf("60", "102030", "1050", "Error"),
            correctAnswer = "102030", explanation = "String concatenation happens from left to right. Once a String is encountered, the '+' operator acts as a concatenator for the rest.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these cannot be used for a 'switch' statement expression?",
            options = listOf("int", "String", "enum", "double"),
            correctAnswer = "double", explanation = "Switch statements support byte, short, char, int, Enums, and Strings. Floating-point numbers are not allowed.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Method Hiding' in Java?",
            options = listOf("Overriding an instance method", "Redefining a static method in a subclass", "Making a method private", "Using the 'hidden' keyword"),
            correctAnswer = "Redefining a static method in a subclass", explanation = "When a subclass defines a static method with the same signature as one in the superclass, it hides the superclass method.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which collection class allows null as a key?",
            options = listOf("Hashtable", "HashMap", "TreeMap", "Vector"),
            correctAnswer = "HashMap", explanation = "HashMap allows one null key and multiple null values, whereas Hashtable does not allow any nulls.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the use of the 'transient' keyword?",
            options = listOf("To make a variable thread-safe", "To prevent a variable from being serialized", "To share a variable between classes", "To make a variable constant"),
            correctAnswer = "To prevent a variable from being serialized", explanation = "Variables marked as transient are ignored by the serialization mechanism during the object saving process.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What happens if a class implements an interface but doesn't provide method bodies?",
            options = listOf("It will compile fine", "It must be declared as abstract", "The compiler provides default bodies", "It results in a runtime error"),
            correctAnswer = "It must be declared as abstract", explanation = "If a class does not implement all methods of an interface, it must be declared abstract to avoid compilation errors.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is true about 'StringPool'?",
            options = listOf("It is located in Stack memory", "It helps in memory optimization", "It stores objects created with 'new String()'", "It is a part of the Garbage Collector"),
            correctAnswer = "It helps in memory optimization", explanation = "The String Pool is a special storage area in the Heap that reuses string literals to save memory.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'volatile' keyword?",
            options = listOf("To store variables in CPU cache", "To ensure a variable is read from main memory", "To lock a block of code", "To prevent inheritance"),
            correctAnswer = "To ensure a variable is read from main memory", explanation = "Volatile guarantees visibility of changes to variables across threads by ensuring they are read from/written to main memory directly.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a read-only List in Java?",
            options = listOf("List.setReadOnly()", "Collections.unmodifiableList()", "new ReadOnlyList()", "List.freeze()"),
            correctAnswer = "Collections.unmodifiableList()", explanation = "The Collections utility class provides a method to wrap a list into an unmodifiable view.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which class is more efficient for reading input from the console than Scanner?",
            options = listOf("ConsoleReader", "BufferedReader", "SystemReader", "InputStream"),
            correctAnswer = "BufferedReader", explanation = "BufferedReader is faster because it has a larger buffer and doesn't perform regex parsing on every token.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In multi-level inheritance, which constructor is executed first?",
            options = listOf("The subclass constructor", "The intermediate class constructor", "The Object class constructor", "The immediate parent constructor"),
            correctAnswer = "The Object class constructor", explanation = "Constructor chaining always goes up to the top of the hierarchy, starting execution from java.lang.Object.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Diamond Problem' in Java?",
            options = listOf("A problem with multiple inheritance of classes", "A problem with recursive methods", "A memory leak issue", "A syntax error in generics"),
            correctAnswer = "A problem with multiple inheritance of classes", explanation = "Java avoids the Diamond Problem (ambiguity in inheriting multiple classes) by not supporting multiple inheritance for classes.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which Object class method is called just before garbage collection?",
            options = listOf("delete()", "finalize()", "destroy()", "clean()"),
            correctAnswer = "finalize()", explanation = "The finalize() method is called by the Garbage Collector when it determines no more references to the object exist.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is true about 'StringBuilder' compared to 'StringBuffer'?",
            options = listOf("It is synchronized", "It is immutable", "It is faster", "It cannot be modified"),
            correctAnswer = "It is faster", explanation = "StringBuilder is not thread-safe (not synchronized), making it faster than the synchronized StringBuffer.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Functional Interface'?",
            options = listOf("An interface with only static methods", "An interface with exactly one abstract method", "An interface with no methods", "An interface with only default methods"),
            correctAnswer = "An interface with exactly one abstract method", explanation = "Functional interfaces have exactly one abstract method and are often used with Lambda expressions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the default initial capacity of an ArrayList in Java?",
            options = listOf("5", "10", "16", "20"),
            correctAnswer = "10", explanation = "When initialized without a specified size, an ArrayList starts with a default capacity of 10.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is NOT a valid Java access modifier?",
            options = listOf("internal", "private", "protected", "public"),
            correctAnswer = "internal", explanation = "Java does not have an 'internal' keyword; it uses 'default' (package-private) when no modifier is specified.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Upcasting' in Java?",
            options = listOf("Casting a superclass to a subclass", "Casting a subclass to a superclass", "Converting a primitive to a String", "Converting an int to a double"),
            correctAnswer = "Casting a subclass to a superclass", explanation = "Upcasting is automatic and allows a subclass object to be treated as an instance of its parent class.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these allows safe access to shared resources by multiple threads?",
            options = listOf("Aggregation", "Serialization", "Synchronization", "Encapsulation"),
            correctAnswer = "Synchronization", explanation = "Synchronization ensures that only one thread can access a resource or block of code at a time.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'native' keyword indicate in a method declaration?",
            options = listOf("Written in Java only", "Implemented in another language like C++", "Private to the hardware", "It cannot be overridden"),
            correctAnswer = "Implemented in another language like C++", explanation = "The native keyword allows Java to interface with libraries written in other languages via JNI.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which design pattern is used by the java.lang.Runtime class?",
            options = listOf("Factory", "Singleton", "Observer", "Decorator"),
            correctAnswer = "Singleton", explanation = "The Runtime class uses the Singleton pattern to ensure only one instance of the runtime exists per application.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Autoboxing'?",
            options = listOf("Converting a string to an int", "Automatic conversion of primitive to wrapper object", "Automatic creation of a class", "Converting a float to a double"),
            correctAnswer = "Automatic conversion of primitive to wrapper object", explanation = "Autoboxing is the automatic conversion the compiler makes between primitives and their corresponding wrapper classes.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Can a constructor be declared as 'private'?",
            options = listOf("No", "Yes, to prevent instantiation", "Only in interfaces", "Only if it is empty"),
            correctAnswer = "Yes, to prevent instantiation", explanation = "Private constructors are used in Utility classes or Singleton patterns to prevent external object creation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'this()' used for inside a constructor?",
            options = listOf("To call the parent constructor", "To call another constructor in the same class", "To refer to the current class name", "To create a new object"),
            correctAnswer = "To call another constructor in the same class", explanation = "this() is used for constructor chaining within the same class and must be the first statement.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a marker interface?",
            options = listOf("Runnable", "Serializable", "Comparable", "List"),
            correctAnswer = "Serializable", explanation = "A marker interface has no methods and is used to provide metadata to the JVM about the class.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the return type of the 'hashCode()' method?",
            options = listOf("String", "long", "int", "void"),
            correctAnswer = "int", explanation = "The hashCode() method returns an integer representation of the object's memory address or content.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to prevent method overriding?",
            options = listOf("static", "final", "private", "constant"),
            correctAnswer = "final", explanation = "A method declared as final cannot be overridden by any subclass.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Double Brace Initialization' in Java?",
            options = listOf("A way to initialize two variables", "An anonymous inner class with an instance initializer block", "A feature for faster memory allocation", "A syntax for double-dimension arrays"),
            correctAnswer = "An anonymous inner class with an instance initializer block", explanation = "It creates an anonymous inner class of the collection and uses the instance initializer block to add elements.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which JVM area is shared among all threads?",
            options = listOf("Stack Area", "PC Register", "Heap Area", "Native Method Stack"),
            correctAnswer = "Heap Area", explanation = "The Heap and Method Area are shared by all threads, while Stack, PC Register, and Native Method Stacks are thread-private.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'invokedynamic' instruction added in Java 7?",
            options = listOf("To run static methods faster", "To support dynamic typing for JVM languages", "To optimize Garbage Collection", "To call private methods from other classes"),
            correctAnswer = "To support dynamic typing for JVM languages", explanation = "It allows the compiler to defer method linking until runtime, which is crucial for dynamic languages like Groovy or JRuby on the JVM.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which Garbage Collector is the default in Java 17?",
            options = listOf("Serial GC", "Parallel GC", "G1 GC", "ZGC"),
            correctAnswer = "G1 GC", explanation = "The G1 (Garbage First) collector became the default since Java 9, replacing the Parallel GC.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Type Erasure' in Java Generics?",
            options = listOf("A way to hide private types", "The process where the compiler removes type parameters after compilation", "A runtime error when types don't match", "Converting all objects to the Object class"),
            correctAnswer = "The process where the compiler removes type parameters after compilation", explanation = "To ensure backward compatibility, the JVM replaces generic types with their bounds or 'Object' during compilation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In Java memory management, what is a 'Phantom Reference' used for?",
            options = listOf("To prevent an object from being collected", "To cache large images", "To perform pre-mortem cleanup actions more flexibly than finalize()", "To create a deep copy of an object"),
            correctAnswer = "To perform pre-mortem cleanup actions more flexibly than finalize()", explanation = "Phantom references are used to track when an object has been removed from memory to perform low-level resource cleanup.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is a valid way to prevent 'Deadlock' in Java?",
            options = listOf("Use more threads", "Acquire locks in a consistent order", "Always use the synchronized keyword", "Increase the Heap size"),
            correctAnswer = "Acquire locks in a consistent order", explanation = "Deadlocks occur when threads wait for each other's locks; a strict locking order breaks the circular wait condition.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'intern()' method of the String class do?",
            options = listOf("Converts a string to a char array", "Returns a canonical representation from the string pool", "Encodes the string into UTF-8", "Checks if the string is empty"),
            correctAnswer = "Returns a canonical representation from the string pool", explanation = "If the pool already contains a string equal to this String object, then the string from the pool is returned.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Happens-Before' relationship in the Java Memory Model?",
            options = listOf("A guarantee that memory writes by one thread are visible to another", "A way to speed up the CPU", "A garbage collection algorithm", "The time it takes to initialize a class"),
            correctAnswer = "A guarantee that memory writes by one thread are visible to another", explanation = "It defines a set of rules that ensure thread-safe visibility and ordering of operations in multi-threaded environments.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which interface should be used for a collection that needs to maintain insertion order and allow fast search by key?",
            options = listOf("TreeMap", "HashMap", "LinkedHashMap", "IdentityHashMap"),
            correctAnswer = "LinkedHashMap", explanation = "LinkedHashMap combines a hash table and a linked list to provide predictable iteration order.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Spliterator' introduced in Java 8?",
            options = listOf("A tool to split strings", "An object for traversing and partitioning elements of a source", "A new type of Exception", "A way to join two threads"),
            correctAnswer = "An object for traversing and partitioning elements of a source", explanation = "Spliterators are designed to support parallel iteration of data streams.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of the following is true about 'ReentrantLock' compared to 'synchronized'?",
            options = listOf("It is slower", "It allows for timed lock attempts", "It cannot be interrupted", "It is only available in Java 1.4"),
            correctAnswer = "It allows for timed lock attempts", explanation = "ReentrantLock provides advanced features like tryLock(), lockInterruptibly(), and fairness policies.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'flatmap' and 'map' in Java Streams?",
            options = listOf("Map is for objects, flatmap is for primitives", "Flatmap transforms each element into a stream and flattens them", "Map is faster than flatmap", "Map is used for filtering"),
            correctAnswer = "Flatmap transforms each element into a stream and flattens them", explanation = "Map produces one output for one input, whereas flatmap can produce multiple outputs for one input by flattening nested streams.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'VarHandle' API (introduced in Java 9) replace in many scenarios?",
            options = listOf("The Scanner class", "sun.misc.Unsafe", "The Reflection API", "Both sun.misc.Unsafe and Reflection for variable access"),
            correctAnswer = "Both sun.misc.Unsafe and Reflection for variable access", explanation = "VarHandles provide a safer and more performant way to perform atomic and memory-ordered operations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How does the 'CompletableFuture' handle asynchronous exceptions?",
            options = listOf("Using try-catch blocks", "Using the exceptionally() or handle() methods", "By stopping the JVM", "It cannot handle exceptions"),
            correctAnswer = "Using the exceptionally() or handle() methods", explanation = "CompletableFuture provides a functional approach to recover from exceptions in an asynchronous pipeline.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the maximum number of dimensions a Java array can have?",
            options = listOf("2", "255", "Unlimited", "1024"),
            correctAnswer = "255", explanation = "The JVM specification limits the number of dimensions in an array to 255.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In a HashMap, what happens when a 'collision' occurs?",
            options = listOf("The program crashes", "The new value replaces the old one", "Objects are stored in a linked list or tree at the same bucket", "A new hash table is created"),
            correctAnswer = "Objects are stored in a linked list or tree at the same bucket", explanation = "Java 8+ converts the linked list to a Red-Black tree if the bucket becomes too crowded (TREESHIFY_THRESHOLD).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Biased Locking' in the JVM?",
            options = listOf("Locking only public methods", "An optimization for locks that are mostly acquired by a single thread", "A way to prevent inheritance", "A security feature for networks"),
            correctAnswer = "An optimization for locks that are mostly acquired by a single thread", explanation = "It reduces the overhead of atomic operations by 'biasing' the lock toward the first thread that acquires it.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of the following is a 'Checked' Exception that occurs during Class Loading?",
            options = listOf("ClassNotFoundException", "NoClassDefFoundError", "ClassCastException", "NullPointerException"),
            correctAnswer = "ClassNotFoundException", explanation = "ClassNotFoundException is a checked exception, while NoClassDefFoundError is an Error (unchecked).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Stop-the-world' event in Java?",
            options = listOf("When the program finishes", "When all application threads are paused for Garbage Collection", "A network timeout", "When an infinite loop occurs"),
            correctAnswer = "When all application threads are paused for Garbage Collection", explanation = "Most GC algorithms require pausing all application threads to safely identify and clear unreachable objects.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Fork/Join' framework used for?",
            options = listOf("To fork a new process in the OS", "To parallelize tasks that can be broken into smaller subtasks", "To join two different databases", "To prevent memory leaks"),
            correctAnswer = "To parallelize tasks that can be broken into smaller subtasks", explanation = "It uses a work-stealing algorithm to balance tasks across multiple processors.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword was introduced in Java 14 to reduce boilerplate code for data-carrying classes?",
            options = listOf("struct", "data", "record", "sealed"),
            correctAnswer = "record", explanation = "Records are a special kind of class intended to be used as immutable data carriers with automatic getters, hashCode, and equals.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In Java 17, what do 'Sealed Classes' provide?",
            options = listOf("A way to make classes private", "Control over which other classes can extend or implement them", "Encryption for class files", "Automatic serialization"),
            correctAnswer = "Control over which other classes can extend or implement them", explanation = "Sealed classes allow a class to specify its allowed subclasses using the 'permits' keyword.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'ThreadLocal' variables?",
            options = listOf("To share data between all threads", "To provide a separate instance of a variable for each thread", "To make variables final", "To increase thread speed"),
            correctAnswer = "To provide a separate instance of a variable for each thread", explanation = "ThreadLocal allows you to store data that is only accessible by a specific thread.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'False Sharing' in Java multi-threading?",
            options = listOf("When threads share the wrong data", "When threads on different cores update variables on the same cache line", "A bug in the compiler", "When a variable is shared across JVMs"),
            correctAnswer = "When threads on different cores update variables on the same cache line", explanation = "This causes the CPU to refresh the cache unnecessarily, leading to significant performance degradation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of the following is NOT part of the Java Platform Module System (Project Jigsaw)?",
            options = listOf("module-info.java", "exports", "requires", "includes"),
            correctAnswer = "includes", explanation = "The module system uses 'requires', 'exports', 'opens', and 'provides' but not 'includes'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Reference Counting' algorithm's primary weakness in GC?",
            options = listOf("It is too slow", "It cannot handle cyclic references", "It uses too much memory", "It only works for strings"),
            correctAnswer = "It cannot handle cyclic references", explanation = "If two objects point to each other, their reference counts never reach zero, even if they are unreachable.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Class Data Sharing' (CDS) in the JVM?",
            options = listOf("Sharing variables between classes", "An optimization that maps metadata into memory to reduce startup time", "A way to use private methods in other classes", "A feature for sharing code on GitHub"),
            correctAnswer = "An optimization that maps metadata into memory to reduce startup time", explanation = "CDS reduces startup time and memory footprint by sharing common class metadata across multiple JVM processes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method should you override to use a class as a key in a HashMap?",
            options = listOf("toString()", "clone()", "equals() and hashCode()", "compareTo()"),
            correctAnswer = "equals() and hashCode()", explanation = "Both must be overridden to ensure the HashMap can correctly locate and identify the key.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'G1 GC' region-based memory layout?",
            options = listOf("One large block for all objects", "Dividing the heap into many small fixed-size regions", "Separating strings from numbers", "Storing objects in the stack"),
            correctAnswer = "Dividing the heap into many small fixed-size regions", explanation = "G1 divides the heap into regions (Eden, Survivor, Old) to perform collection in parallel and prioritize regions with the most garbage.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to stop the current iteration of a loop and start the next one?",
            options = listOf("break", "continue", "return", "stop"),
            correctAnswer = "continue", explanation = "The continue statement skips the rest of the loop body for the current iteration.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which collection does not allow duplicate elements?",
            options = listOf("List", "Set", "Queue", "Stack"),
            correctAnswer = "Set", explanation = "The Set interface represents a collection that contains no duplicate elements.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of 'System.out.println(5/2);' in Java?",
            options = listOf("2.5", "2", "3", "Error"),
            correctAnswer = "2", explanation = "In integer division, the fractional part is discarded.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method of the String class returns a substring from a specified index to the end?",
            options = listOf("slice()", "substring()", "split()", "trim()"),
            correctAnswer = "substring()", explanation = "The substring(int beginIndex) method returns the part of the string starting from the given index.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which of these is NOT a functional interface in the java.util.function package?",
            options = listOf("Predicate", "Consumer", "Supplier", "Iterator"),
            correctAnswer = "Iterator", explanation = "Predicate, Consumer, and Supplier are functional interfaces; Iterator is a standard interface for traversing collections.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'Object.wait()' method?",
            options = listOf("To make the thread sleep for a specific time", "To make a thread wait until another thread notifies it", "To stop the JVM", "To wait for I/O operations"),
            correctAnswer = "To make a thread wait until another thread notifies it", explanation = "Wait() must be called from a synchronized context and releases the lock while waiting.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In Java, what is an 'Intrinsic Lock'?",
            options = listOf("A lock provided by a database", "The built-in synchronization lock associated with every object", "A lock on the CPU core", "A final variable"),
            correctAnswer = "The built-in synchronization lock associated with every object", explanation = "Every Java object has an implicit lock used by the synchronized keyword.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'String Deduplication' feature in G1 GC?",
            options = listOf("Deleting duplicate files", "Identifying and pointing identical string char arrays to the same memory to save space", "Shortening string lengths", "Converting all strings to lowercase"),
            correctAnswer = "Identifying and pointing identical string char arrays to the same memory to save space", explanation = "It helps reduce the memory footprint by removing redundant character arrays in the heap.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        )

    )
}