package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val JAVA_BASICS = "java_java_basics"
const val JAVA_JVM_JDK = "java_jvm_and_jdk"
const val JAVA_DATA_TYPES = "java_data_types_and_variables"
const val JAVA_CONTROL = "java_control_statements"
const val JAVA_OOP = "java_oop_concepts"
const val JAVA_INHERITANCE = "java_inheritance_and_polymorphism"
const val JAVA_INTERFACES = "java_interfaces_and_abstract_classes"
const val JAVA_EXCEPTIONS = "java_exception_handling"
const val JAVA_COLLECTIONS = "java_collections_framework"
const val JAVA_THREADS = "java_multithreading"
const val JAVA_FILES = "java_file_handling"
const val JAVA_8 = "java_java_8_features"

/* ===============================
   HELPER FUNCTION
   =============================== */

private fun javaQuestion(
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
   MAIN ENTRY FUNCTION
   =============================== */

fun getJavaQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    /* ---------- JAVA BASICS ---------- */
    return listOf(
        javaQuestion(
            id = "java_java_basics_001",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which keyword is used to declare a constant in Java?",
            options = listOf("const", "static", "final", "let"),
            correctAnswer = "final",
            explanation = "Final variables cannot be reassigned once initialized.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_002",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which method is the entry point of any Java program?",
            options = listOf("start()", "main()", "run()", "init()"),
            correctAnswer = "main()",
            explanation = "Execution of a Java program always starts from the main method.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_003",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of the following is NOT a Java primitive data type?",
            options = listOf("int", "boolean", "String", "char"),
            correctAnswer = "String",
            explanation = "String is a class, not a primitive data type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_004",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What is the size of int data type in Java?",
            options = listOf("16 bits", "32 bits", "64 bits", "Depends on system"),
            correctAnswer = "32 bits",
            explanation = "In Java, int is always 32-bit regardless of platform.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_005",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which symbol is used to end a statement in Java?",
            options = listOf(":", ";", ".", ","),
            correctAnswer = ";",
            explanation = "Every Java statement ends with a semicolon.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_006",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these is a valid variable name in Java?",
            options = listOf("2value", "_value", "value-1", "class"),
            correctAnswer = "_value",
            explanation = "Variable names can start with underscore but not digits or keywords.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_007",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which keyword is used to create an object in Java?",
            options = listOf("class", "new", "this", "object"),
            correctAnswer = "new",
            explanation = "The new keyword allocates memory and creates objects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_008",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which data type is used to store true or false values?",
            options = listOf("int", "char", "boolean", "byte"),
            correctAnswer = "boolean",
            explanation = "Boolean stores only true or false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_009",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What will be the default value of an instance int variable?",
            options = listOf("0", "null", "undefined", "garbage"),
            correctAnswer = "0",
            explanation = "Instance variables get default values; int defaults to 0.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_010",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of the following is case-sensitive in Java?",
            options = listOf("Keywords", "Identifiers", "Comments", "Packages"),
            correctAnswer = "Identifiers",
            explanation = "Java identifiers are case-sensitive; Value and value are different.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_011",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What is the default value of a reference variable?",
            options = listOf("0", "undefined", "null", "empty"),
            correctAnswer = "null",
            explanation = "Reference variables default to null if not initialized.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_012",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which operator is used to compare two values?",
            options = listOf("=", "==", "!=", ":="),
            correctAnswer = "==",
            explanation = "The == operator compares values for equality.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_013",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these literals is of type char?",
            options = listOf("\"A\"", "'A'", "A", "65"),
            correctAnswer = "'A'",
            explanation = "Character literals are written using single quotes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_014",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What will be the output of: System.out.print(10 + 20 + \"Java\");",
            options = listOf("30Java", "1020Java", "Java30", "Error"),
            correctAnswer = "30Java",
            explanation = "Addition happens first, then string concatenation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_015",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which keyword prevents inheritance?",
            options = listOf("static", "private", "final", "sealed"),
            correctAnswer = "final",
            explanation = "A final class cannot be inherited.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_016",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of the following is not a Java keyword?",
            options = listOf("volatile", "strictfp", "unsigned", "transient"),
            correctAnswer = "unsigned",
            explanation = "Java does not support unsigned keyword explicitly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_017",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What is the range of byte data type?",
            options = listOf("-128 to 127", "-256 to 255", "0 to 255", "Depends on system"),
            correctAnswer = "-128 to 127",
            explanation = "Byte is an 8-bit signed integer in Java.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_018",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which conversion is done automatically in Java?",
            options = listOf("int to byte", "double to int", "int to long", "long to int"),
            correctAnswer = "int to long",
            explanation = "Widening conversions happen automatically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_019",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which operator has the highest precedence?",
            options = listOf("+", "*", "=", "&&"),
            correctAnswer = "*",
            explanation = "Multiplication has higher precedence than addition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_020",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What happens if main method is declared private?",
            options = listOf("Program runs", "Compile error", "Runtime error", "JVM can't access it"),
            correctAnswer = "JVM can't access it",
            explanation = "JVM must access main method, so it must be public.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_021",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these is not allowed in Java identifiers?",
            options = listOf("_", "$", "Digit at start", "Unicode characters"),
            correctAnswer = "Digit at start",
            explanation = "Identifiers cannot start with digits.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_022",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What is the default value of boolean instance variable?",
            options = listOf("true", "false", "null", "0"),
            correctAnswer = "false",
            explanation = "Boolean instance variables default to false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_023",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which statement is true about Java?",
            options = listOf("Platform dependent", "Uses pointers", "Supports multiple inheritance", "Platform independent"),
            correctAnswer = "Platform independent",
            explanation = "Java runs on JVM, making it platform independent.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_024",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What will be the output of: System.out.println(5/2);",
            options = listOf("2", "2.5", "3", "Compilation error"),
            correctAnswer = "2",
            explanation = "Integer division discards decimal part.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_025",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which keyword is used to access current object?",
            options = listOf("this", "super", "self", "object"),
            correctAnswer = "this",
            explanation = "This refers to the current object instance.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_026",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What is the extension of Java bytecode file?",
            options = listOf(".java", ".class", ".exe", ".jar"),
            correctAnswer = ".class",
            explanation = "The compiler generates .class bytecode files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_027",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which one causes loss of data?",
            options = listOf("Widening", "Narrowing", "Auto boxing", "Upcasting"),
            correctAnswer = "Narrowing",
            explanation = "Narrowing conversions may lose data.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_028",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these can be overloaded?",
            options = listOf("Variables", "Constructors", "Classes", "Packages"),
            correctAnswer = "Constructors",
            explanation = "Constructors can have multiple parameter lists.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_029",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What will be the output of: System.out.println('A' + 1);",
            options = listOf("A1", "66", "B", "Compilation error"),
            correctAnswer = "66",
            explanation = "Character is converted to ASCII value before addition.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_030",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which keyword is used to stop execution of a loop?",
            options = listOf("exit", "stop", "break", "return"),
            correctAnswer = "break",
            explanation = "Break immediately exits the loop.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_031",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these statements is true?",
            options = listOf("Local variables get default values", "Instance variables get default values", "Static block runs after main", "Java supports goto"),
            correctAnswer = "Instance variables get default values",
            explanation = "Local variables must be initialized explicitly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_032",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which operator is used for logical AND?",
            options = listOf("&", "&&", "|", "||"),
            correctAnswer = "&&",
            explanation = "&& is the short-circuit logical AND operator.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_033",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What is the result of 10 + \"20\" + 30?",
            options = listOf("102030", "3020", "102030", "102030"),
            correctAnswer = "102030",
            explanation = "Once string appears, all values concatenate.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_034",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of the following is mandatory in a Java program?",
            options = listOf("At least one class", "main method", "Package statement", "Import statement"),
            correctAnswer = "At least one class",
            explanation = "Java programs must have at least one class.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_035",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these is a compile-time constant?",
            options = listOf("final int x = 10", "int y = 10", "static int z = 10", "volatile int a = 10"),
            correctAnswer = "final int x = 10",
            explanation = "Final primitive values are compile-time constants.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_036",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What does JVM stand for?",
            options = listOf("Java Virtual Machine", "Java Visual Model", "Joint Virtual Machine", "Java Variable Manager"),
            correctAnswer = "Java Virtual Machine",
            explanation = "JVM executes Java bytecode.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_037",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which literal represents a floating-point number?",
            options = listOf("10", "10L", "10.5", "'10'"),
            correctAnswer = "10.5",
            explanation = "Floating-point literals contain decimal values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_038",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of the following is evaluated first?",
            options = listOf("()", "*", "+", "&&"),
            correctAnswer = "()",
            explanation = "Parentheses have the highest precedence.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_039",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What will happen if no main method is present?",
            options = listOf("Compile error", "Runtime error", "Program runs", "JVM error"),
            correctAnswer = "Runtime error",
            explanation = "Compilation succeeds, but JVM fails at runtime.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_040",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these keywords is used to define a constant variable?",
            options = listOf("static", "final", "const", "immutable"),
            correctAnswer = "final",
            explanation = "Final variables cannot be modified after assignment.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_041",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which data type occupies the smallest memory?",
            options = listOf("int", "short", "byte", "long"),
            correctAnswer = "byte",
            explanation = "Byte uses only 1 byte of memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_042",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of these cannot be declared static?",
            options = listOf("Method", "Variable", "Constructor", "Block"),
            correctAnswer = "Constructor",
            explanation = "Constructors are tied to objects, not classes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_043",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which statement about Java is correct?",
            options = listOf("Java uses pointers", "Java is compiled only", "Java uses bytecode", "Java is purely interpreted"),
            correctAnswer = "Java uses bytecode",
            explanation = "Java source is compiled into bytecode.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_044",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which operator checks object reference equality?",
            options = listOf("equals()", "==", "=", "!="),
            correctAnswer = "==",
            explanation = "== checks reference equality for objects.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_basics_045",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which of the following is not a valid Java comment?",
            options = listOf("// comment", "/* comment */", "/** comment */", "# comment"),
            correctAnswer = "# comment",
            explanation = "Java does not support # for comments.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_java_jvm_and_jdk_001",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "What does JVM stand for in Java?",
            options = listOf("Java Variable Machine", "Java Virtual Machine", "Java Visual Model", "Java Verified Module"),
            correctAnswer = "Java Virtual Machine",
            explanation = "JVM is responsible for executing Java bytecode on any platform.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_002",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which component converts Java source code into bytecode?",
            options = listOf("JVM", "JRE", "JDK", "Compiler"),
            correctAnswer = "Compiler",
            explanation = "The Java compiler (javac) converts source code into bytecode.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_003",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which file is executed by the JVM?",
            options = listOf(".java", ".class", ".jar", ".exe"),
            correctAnswer = ".class",
            explanation = "JVM executes the bytecode stored in .class files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_004",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which of the following contains JVM?",
            options = listOf("JDK only", "JRE only", "Both JDK and JRE", "None"),
            correctAnswer = "Both JDK and JRE",
            explanation = "JRE includes JVM, and JDK includes JRE.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_005",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "What is the main role of JDK?",
            options = listOf("Run Java programs", "Compile Java programs", "Develop Java applications", "Execute bytecode"),
            correctAnswer = "Develop Java applications",
            explanation = "JDK provides tools needed to develop, compile, and run Java programs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_006",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which tool is used to compile Java programs?",
            options = listOf("java", "javac", "javadoc", "jar"),
            correctAnswer = "javac",
            explanation = "javac compiles .java files into .class files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_007",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which command is used to run a Java program?",
            options = listOf("javac", "java", "jvm", "execute"),
            correctAnswer = "java",
            explanation = "The java command launches the JVM to run bytecode.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_008",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which component provides runtime environment for Java?",
            options = listOf("JDK", "JRE", "JVM", "Compiler"),
            correctAnswer = "JRE",
            explanation = "JRE provides libraries and JVM required to run Java programs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_009",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which of the following is NOT part of JRE?",
            options = listOf("JVM", "Core libraries", "Development tools", "Runtime environment"),
            correctAnswer = "Development tools",
            explanation = "Development tools are part of JDK, not JRE.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_010",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM component loads class files?",
            options = listOf("Execution Engine", "Class Loader", "Garbage Collector", "Heap"),
            correctAnswer = "Class Loader",
            explanation = "Class Loader loads .class files into memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_011",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which memory area stores class-level data?",
            options = listOf("Heap", "Stack", "Method Area", "PC Register"),
            correctAnswer = "Method Area",
            explanation = "Method Area stores class metadata and static variables.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_012",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM memory area is shared among threads?",
            options = listOf("Stack", "PC Register", "Heap", "Native Stack"),
            correctAnswer = "Heap",
            explanation = "Heap memory is shared across all threads.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_013",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM component performs garbage collection?",
            options = listOf("Class Loader", "Execution Engine", "Garbage Collector", "Interpreter"),
            correctAnswer = "Garbage Collector",
            explanation = "Garbage Collector removes unused objects from memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_014",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "What does JIT stand for?",
            options = listOf("Java Interpreter Tool", "Just In Time", "Java In Thread", "Just In Thread"),
            correctAnswer = "Just In Time",
            explanation = "JIT compiles bytecode to native code at runtime.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_015",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which part of JVM executes bytecode?",
            options = listOf("Class Loader", "Heap", "Execution Engine", "Method Area"),
            correctAnswer = "Execution Engine",
            explanation = "Execution Engine interprets and executes bytecode.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_016",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which memory area stores method calls and local variables?",
            options = listOf("Heap", "Stack", "Method Area", "PC Register"),
            correctAnswer = "Stack",
            explanation = "Stack stores method frames and local variables.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_017",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which of these tools is NOT part of JDK?",
            options = listOf("javac", "java", "javadoc", "jvm"),
            correctAnswer = "jvm",
            explanation = "JVM is part of JRE, not a standalone JDK tool.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_018",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "What happens if JRE is not installed?",
            options = listOf("Java programs can compile", "Java programs cannot run", "JDK fails to install", "JVM still runs"),
            correctAnswer = "Java programs cannot run",
            explanation = "JRE is required to run Java applications.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_019",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which statement about JVM is true?",
            options = listOf("Platform dependent", "Written in Java", "Executes source code", "Same for all OS"),
            correctAnswer = "Platform dependent",
            explanation = "JVM is platform dependent, enabling Java portability.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_020",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM memory area is thread-specific?",
            options = listOf("Heap", "Method Area", "Stack", "Code Cache"),
            correctAnswer = "Stack",
            explanation = "Each thread has its own stack.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_021",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which command shows Java version installed?",
            options = listOf("javac -v", "java -version", "jdk -version", "jre -v"),
            correctAnswer = "java -version",
            explanation = "This command displays installed Java version.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_022",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM component verifies bytecode?",
            options = listOf("Interpreter", "Class Loader", "Bytecode Verifier", "Garbage Collector"),
            correctAnswer = "Bytecode Verifier",
            explanation = "It checks bytecode for security violations.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_023",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which tool creates API documentation?",
            options = listOf("javac", "java", "javadoc", "jar"),
            correctAnswer = "javadoc",
            explanation = "javadoc generates HTML documentation from comments.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_024",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which memory error occurs when heap is full?",
            options = listOf("StackOverflowError", "OutOfMemoryError", "ClassNotFoundException", "IOException"),
            correctAnswer = "OutOfMemoryError",
            explanation = "This occurs when JVM cannot allocate heap memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_025",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which part of JVM stores native method information?",
            options = listOf("Native Method Stack", "Heap", "Method Area", "PC Register"),
            correctAnswer = "Native Method Stack",
            explanation = "It stores native method calls written in C or C++.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_026",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which of the following improves JVM performance?",
            options = listOf("Interpreter", "JIT Compiler", "Class Loader", "Garbage Collector"),
            correctAnswer = "JIT Compiler",
            explanation = "JIT converts bytecode to native code for faster execution.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_027",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which environment variable points to JDK installation?",
            options = listOf("PATH", "CLASSPATH", "JAVA_HOME", "JRE_HOME"),
            correctAnswer = "JAVA_HOME",
            explanation = "JAVA_HOME stores the JDK installation path.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_028",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which of these is responsible for memory cleanup?",
            options = listOf("JIT", "Class Loader", "Garbage Collector", "Interpreter"),
            correctAnswer = "Garbage Collector",
            explanation = "Garbage Collector frees unused objects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_029",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "What is bytecode?",
            options = listOf("Machine code", "Source code", "Intermediate code", "Binary code"),
            correctAnswer = "Intermediate code",
            explanation = "Bytecode is an intermediate code executed by JVM.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_030",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM component decides memory allocation?",
            options = listOf("Class Loader", "Heap Manager", "Garbage Collector", "Execution Engine"),
            correctAnswer = "Garbage Collector",
            explanation = "GC manages memory allocation and deallocation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_031",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which tool packages multiple class files?",
            options = listOf("javac", "java", "jar", "javadoc"),
            correctAnswer = "jar",
            explanation = "jar bundles classes into a single archive.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_032",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which memory error occurs due to deep recursion?",
            options = listOf("OutOfMemoryError", "StackOverflowError", "RuntimeException", "NullPointerException"),
            correctAnswer = "StackOverflowError",
            explanation = "Occurs when stack memory exceeds its limit.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_033",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM register stores current instruction address?",
            options = listOf("Stack Pointer", "PC Register", "Heap Pointer", "Frame Pointer"),
            correctAnswer = "PC Register",
            explanation = "PC register tracks the current instruction.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_034",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which Java edition is used for enterprise applications?",
            options = listOf("Java SE", "Java ME", "Java EE", "Java FX"),
            correctAnswer = "Java EE",
            explanation = "Java EE is used for enterprise-level applications.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_035",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM component links classes?",
            options = listOf("Verifier", "Linker", "Loader", "Executor"),
            correctAnswer = "Linker",
            explanation = "Linker performs verification, preparation, and resolution.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_036",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which is mandatory to run Java programs?",
            options = listOf("JDK", "JRE", "Compiler", "Source code"),
            correctAnswer = "JRE",
            explanation = "JRE provides runtime environment for Java.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_037",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which Java tool checks syntax errors?",
            options = listOf("java", "javac", "javadoc", "jar"),
            correctAnswer = "javac",
            explanation = "javac reports compile-time errors.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_038",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which memory area stores objects?",
            options = listOf("Stack", "Method Area", "Heap", "PC Register"),
            correctAnswer = "Heap",
            explanation = "Objects are stored in heap memory.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_039",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which statement about JDK is correct?",
            options = listOf("It contains only JVM", "It is optional for developers", "It includes JRE", "It runs bytecode directly"),
            correctAnswer = "It includes JRE",
            explanation = "JDK contains JRE plus development tools.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_040",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM component handles exceptions?",
            options = listOf("Interpreter", "Execution Engine", "Class Loader", "Garbage Collector"),
            correctAnswer = "Execution Engine",
            explanation = "Execution Engine manages execution and exceptions.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_041",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which tool sets classpath during execution?",
            options = listOf("javac", "java", "jar", "javadoc"),
            correctAnswer = "java",
            explanation = "java command uses classpath to locate classes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_042",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM phase allocates memory for static variables?",
            options = listOf("Loading", "Linking", "Initialization", "Execution"),
            correctAnswer = "Linking",
            explanation = "Memory is allocated during linking phase.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_043",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which JVM component ensures security?",
            options = listOf("Garbage Collector", "Bytecode Verifier", "JIT Compiler", "Interpreter"),
            correctAnswer = "Bytecode Verifier",
            explanation = "It prevents illegal and unsafe code execution.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_044",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Which Java tool generates executable archives?",
            options = listOf("javac", "java", "jar", "jvm"),
            correctAnswer = "jar",
            explanation = "jar creates executable and non-executable archives.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_jvm_and_jdk_045",
            categoryId = categoryId,
            chapterId = JAVA_JVM_JDK,
            questionText = "Why Java is called platform independent?",
            options = listOf("Uses C compiler", "Uses bytecode and JVM", "Runs only on Windows", "Compiled at runtime"),
            correctAnswer = "Uses bytecode and JVM",
            explanation = "Bytecode runs on any JVM regardless of OS.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_data_types_and_variables_001",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of the following is a primitive data type in Java?",
            options = listOf("String", "Array", "int", "Object"),
            correctAnswer = "int",
            explanation = "int is a primitive data type used to store integers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_002",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "How many primitive data types are there in Java?",
            options = listOf("6", "7", "8", "9"),
            correctAnswer = "8",
            explanation = "Java has 8 primitive data types like int, float, char, etc.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_003",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type is used to store a single character?",
            options = listOf("String", "char", "byte", "boolean"),
            correctAnswer = "char",
            explanation = "char stores a single Unicode character.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_004",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What is the size of byte data type in Java?",
            options = listOf("4 bytes", "2 bytes", "1 byte", "8 bytes"),
            correctAnswer = "1 byte",
            explanation = "byte occupies 1 byte or 8 bits of memory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_005",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type can store decimal values?",
            options = listOf("int", "char", "float", "boolean"),
            correctAnswer = "float",
            explanation = "float is used to store decimal numbers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_006",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which keyword is used to declare a variable?",
            options = listOf("var", "define", "datatype", "No keyword needed"),
            correctAnswer = "No keyword needed",
            explanation = "Variables are declared directly using a data type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_007",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of the following is a valid variable declaration?",
            options = listOf("int 1num;", "int num1;", "int-num;", "int @num;"),
            correctAnswer = "int num1;",
            explanation = "Variable names cannot start with digits or special symbols.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_008",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What is the default value of int instance variable?",
            options = listOf("null", "0", "undefined", "garbage"),
            correctAnswer = "0",
            explanation = "Instance int variables are initialized to 0 by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_009",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type has the largest size?",
            options = listOf("int", "float", "double", "long"),
            correctAnswer = "double",
            explanation = "double occupies 8 bytes and supports large decimals.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_010",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of the following is not a primitive data type?",
            options = listOf("long", "float", "String", "boolean"),
            correctAnswer = "String",
            explanation = "String is a non-primitive reference type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_011",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which type conversion is done automatically?",
            options = listOf("double to int", "int to byte", "int to long", "long to int"),
            correctAnswer = "int to long",
            explanation = "Widening conversions are done automatically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_012",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type should be used to store true or false?",
            options = listOf("int", "boolean", "char", "byte"),
            correctAnswer = "boolean",
            explanation = "boolean stores only true or false values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_013",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What is the range of short data type?",
            options = listOf("-128 to 127", "-32768 to 32767", "0 to 65535", "Depends on OS"),
            correctAnswer = "-32768 to 32767",
            explanation = "short is a 16-bit signed integer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_014",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable is declared inside a method?",
            options = listOf("Instance variable", "Static variable", "Local variable", "Global variable"),
            correctAnswer = "Local variable",
            explanation = "Local variables exist only within a method.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_015",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable gets memory at object creation?",
            options = listOf("Local", "Instance", "Static", "Temporary"),
            correctAnswer = "Instance",
            explanation = "Instance variables are created with objects.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_016",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable is shared among all objects?",
            options = listOf("Local", "Instance", "Static", "Final"),
            correctAnswer = "Static",
            explanation = "Static variables belong to the class.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_017",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What will be the default value of boolean instance variable?",
            options = listOf("true", "false", "null", "0"),
            correctAnswer = "false",
            explanation = "boolean instance variables default to false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_018",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of the following causes data loss?",
            options = listOf("Widening", "Narrowing", "Auto-boxing", "Upcasting"),
            correctAnswer = "Narrowing",
            explanation = "Narrowing conversion may lose data.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_019",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What is the default value of reference variables?",
            options = listOf("0", "empty", "null", "undefined"),
            correctAnswer = "null",
            explanation = "Reference variables default to null.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_020",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which keyword makes a variable constant?",
            options = listOf("static", "const", "final", "immutable"),
            correctAnswer = "final",
            explanation = "final variables cannot be reassigned.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_021",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which primitive type occupies 2 bytes?",
            options = listOf("byte", "short", "char", "Both short and char"),
            correctAnswer = "Both short and char",
            explanation = "Both short and char use 2 bytes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_022",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable must be initialized before use?",
            options = listOf("Static", "Instance", "Local", "Class"),
            correctAnswer = "Local",
            explanation = "Local variables have no default values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_023",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type is best for storing large whole numbers?",
            options = listOf("int", "float", "double", "long"),
            correctAnswer = "long",
            explanation = "long stores large integer values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_024",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What will be the output of: int x; System.out.print(x);",
            options = listOf("0", "null", "Compile-time error", "Runtime error"),
            correctAnswer = "Compile-time error",
            explanation = "Local variables must be initialized.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_025",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which is a valid float literal?",
            options = listOf("10.5", "10.5d", "10.5f", "10"),
            correctAnswer = "10.5f",
            explanation = "Float literals must end with f or F.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_026",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which primitive type stores Unicode characters?",
            options = listOf("byte", "char", "short", "int"),
            correctAnswer = "char",
            explanation = "char supports Unicode characters.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_027",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which conversion requires explicit casting?",
            options = listOf("int to long", "char to int", "double to float", "byte to short"),
            correctAnswer = "double to float",
            explanation = "Narrowing conversions require casting.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_028",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable lifetime is limited to method execution?",
            options = listOf("Static", "Instance", "Local", "Class"),
            correctAnswer = "Local",
            explanation = "Local variables exist only during method execution.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_029",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type uses the least memory?",
            options = listOf("int", "short", "byte", "boolean"),
            correctAnswer = "byte",
            explanation = "byte occupies only 1 byte.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_030",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What is the default value of static int variable?",
            options = listOf("null", "undefined", "0", "garbage"),
            correctAnswer = "0",
            explanation = "Static int variables default to 0.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_031",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of these is a reference type?",
            options = listOf("int", "char", "boolean", "Array"),
            correctAnswer = "Array",
            explanation = "Arrays are reference types.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_032",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable is stored in heap memory?",
            options = listOf("Local", "Instance", "Loop", "Temporary"),
            correctAnswer = "Instance",
            explanation = "Instance variables are stored in heap.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_033",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of the following is invalid?",
            options = listOf("int a=10;", "float b=10.0f;", "char c=\"A\";", "boolean d=true;"),
            correctAnswer = "char c=\"A\";",
            explanation = "char must use single quotes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_034",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which primitive data type is signed?",
            options = listOf("byte", "short", "int", "All of these"),
            correctAnswer = "All of these",
            explanation = "All numeric primitives in Java are signed.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_035",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which keyword is used to declare class-level variables?",
            options = listOf("static", "final", "public", "this"),
            correctAnswer = "static",
            explanation = "static variables belong to the class.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_036",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "What happens if narrowing is done without casting?",
            options = listOf("Runtime error", "Compile-time error", "Data loss", "No error"),
            correctAnswer = "Compile-time error",
            explanation = "Explicit casting is required for narrowing.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_037",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type is best for precise decimal calculations?",
            options = listOf("float", "double", "BigDecimal", "long"),
            correctAnswer = "BigDecimal",
            explanation = "BigDecimal provides high-precision arithmetic.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_038",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable can be accessed without creating object?",
            options = listOf("Instance", "Local", "Static", "Final"),
            correctAnswer = "Static",
            explanation = "Static variables belong to class.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_039",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which data type stores whole numbers with decimals?",
            options = listOf("int", "float", "double", "char"),
            correctAnswer = "double",
            explanation = "double stores decimal numbers with high precision.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_040",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of the following is immutable?",
            options = listOf("int", "Array", "String", "Object"),
            correctAnswer = "String",
            explanation = "String objects cannot be changed once created.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_041",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which variable scope is within class but outside methods?",
            options = listOf("Local", "Global", "Instance", "Temporary"),
            correctAnswer = "Instance",
            explanation = "Instance variables are declared inside class.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_042",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of these has no default value?",
            options = listOf("Static", "Instance", "Local", "Class"),
            correctAnswer = "Local",
            explanation = "Local variables must be initialized manually.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_043",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which primitive type supports fractional values?",
            options = listOf("byte", "int", "float", "short"),
            correctAnswer = "float",
            explanation = "float supports decimal values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_044",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which is a valid double literal?",
            options = listOf("10.5", "10.5f", "10", "'10.5'"),
            correctAnswer = "10.5",
            explanation = "Decimal values default to double.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_data_types_and_variables_045",
            categoryId = categoryId,
            chapterId = JAVA_DATA_TYPES,
            questionText = "Which of these variables is created only once?",
            options = listOf("Local", "Instance", "Static", "Block"),
            correctAnswer = "Static",
            explanation = "Static variables are created once per class.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_control_statements_001",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which control statement is used to execute code based on a condition?",
            options = listOf("for", "if", "break", "continue"),
            correctAnswer = "if",
            explanation = "if executes code only when the condition is true.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_002",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is guaranteed to execute at least once?",
            options = listOf("for", "while", "do-while", "enhanced for"),
            correctAnswer = "do-while",
            explanation = "do-while checks the condition after execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_003",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword is used to exit a loop immediately?",
            options = listOf("exit", "stop", "break", "return"),
            correctAnswer = "break",
            explanation = "break terminates the nearest loop.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_004",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword skips the current iteration of a loop?",
            options = listOf("break", "pass", "continue", "skip"),
            correctAnswer = "continue",
            explanation = "continue skips remaining code in current iteration.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_005",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is best when number of iterations is known?",
            options = listOf("while", "do-while", "for", "infinite"),
            correctAnswer = "for",
            explanation = "for loop is ideal when iteration count is fixed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_006",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement selects execution paths based on values?",
            options = listOf("if", "switch", "for", "while"),
            correctAnswer = "switch",
            explanation = "switch selects cases based on expression value.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_007",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which data type is NOT allowed in switch expression?",
            options = listOf("int", "char", "String", "float"),
            correctAnswer = "float",
            explanation = "float and double are not allowed in switch.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_008",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "What happens if break is missing in switch case?",
            options = listOf("Compile error", "Runtime error", "Fall-through", "Exit switch"),
            correctAnswer = "Fall-through",
            explanation = "Execution continues to next case.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_009",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop checks condition before executing body?",
            options = listOf("do-while", "for", "while", "Both for and while"),
            correctAnswer = "Both for and while",
            explanation = "Both for and while are entry-controlled loops.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_010",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword terminates method execution?",
            options = listOf("break", "continue", "exit", "return"),
            correctAnswer = "return",
            explanation = "return exits the current method.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_011",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is called entry-controlled loop?",
            options = listOf("do-while", "while", "none", "infinite"),
            correctAnswer = "while",
            explanation = "while checks condition before execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_012",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement can replace multiple if-else?",
            options = listOf("for", "while", "switch", "break"),
            correctAnswer = "switch",
            explanation = "switch simplifies multiple condition checks.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_013",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "What will happen if condition in while loop is false initially?",
            options = listOf("Executes once", "Executes twice", "Does not execute", "Infinite loop"),
            correctAnswer = "Does not execute",
            explanation = "while loop checks condition first.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_014",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is suitable for infinite loop?",
            options = listOf("for(;;)", "while(true)", "do-while(true)", "All of these"),
            correctAnswer = "All of these",
            explanation = "All forms can create infinite loops.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_015",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement is optional in for loop?",
            options = listOf("Initialization", "Condition", "Increment", "All of these"),
            correctAnswer = "All of these",
            explanation = "All three parts of for loop are optional.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_016",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which control statement is used for decision making?",
            options = listOf("if", "switch", "Both if and switch", "loop"),
            correctAnswer = "Both if and switch",
            explanation = "Both are decision-making statements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_017",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is best for iterating arrays?",
            options = listOf("while", "do-while", "enhanced for", "switch"),
            correctAnswer = "enhanced for",
            explanation = "Enhanced for simplifies array traversal.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_018",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword is used in switch default case?",
            options = listOf("default", "else", "none", "case"),
            correctAnswer = "default",
            explanation = "default executes when no case matches.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_019",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop executes body first then checks condition?",
            options = listOf("for", "while", "do-while", "none"),
            correctAnswer = "do-while",
            explanation = "do-while is exit-controlled loop.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_020",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword can be used inside switch?",
            options = listOf("continue", "break", "return", "All of these"),
            correctAnswer = "All of these",
            explanation = "All can be used based on context.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_021",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement causes loop to skip remaining code?",
            options = listOf("break", "return", "continue", "exit"),
            correctAnswer = "continue",
            explanation = "continue skips current iteration.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_022",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is preferred when condition is checked later?",
            options = listOf("for", "while", "do-while", "enhanced for"),
            correctAnswer = "do-while",
            explanation = "do-while checks condition at the end.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_023",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement can exit both loop and method?",
            options = listOf("break", "continue", "return", "switch"),
            correctAnswer = "return",
            explanation = "return exits the method entirely.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_024",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop variable scope is limited to loop?",
            options = listOf("Instance", "Static", "For-loop variable", "Global"),
            correctAnswer = "For-loop variable",
            explanation = "For-loop variables exist only inside loop.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_025",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement executes when all if conditions fail?",
            options = listOf("else", "default", "break", "continue"),
            correctAnswer = "else",
            explanation = "else executes when if condition is false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_026",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which control structure allows nesting?",
            options = listOf("if", "loops", "switch", "All of these"),
            correctAnswer = "All of these",
            explanation = "All control structures support nesting.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_027",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which is mandatory in while loop?",
            options = listOf("Initialization", "Condition", "Increment", "break"),
            correctAnswer = "Condition",
            explanation = "while loop must have a condition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_028",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is most compact?",
            options = listOf("for", "while", "do-while", "enhanced for"),
            correctAnswer = "enhanced for",
            explanation = "Enhanced for reduces boilerplate code.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_029",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which condition creates infinite while loop?",
            options = listOf("while(false)", "while(1)", "while(true)", "while(0)"),
            correctAnswer = "while(true)",
            explanation = "true condition never becomes false.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_030",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement is evaluated only once in for loop?",
            options = listOf("Condition", "Initialization", "Increment", "Body"),
            correctAnswer = "Initialization",
            explanation = "Initialization runs once before loop starts.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_031",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword is mandatory in switch cases?",
            options = listOf("case", "break", "default", "continue"),
            correctAnswer = "case",
            explanation = "Each switch block uses case labels.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_032",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is slower generally?",
            options = listOf("for", "while", "enhanced for", "do-while"),
            correctAnswer = "No difference",
            explanation = "Performance depends on logic, not loop type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_033",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement transfers control to loop condition?",
            options = listOf("break", "return", "continue", "exit"),
            correctAnswer = "continue",
            explanation = "continue jumps to next iteration.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_034",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which control statement cannot be nested?",
            options = listOf("if", "switch", "loops", "None"),
            correctAnswer = "None",
            explanation = "All control statements can be nested.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_035",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword skips switch execution?",
            options = listOf("continue", "exit", "break", "return"),
            correctAnswer = "break",
            explanation = "break exits the switch block.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_036",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop variable updates automatically?",
            options = listOf("while", "do-while", "for", "enhanced for"),
            correctAnswer = "enhanced for",
            explanation = "Enhanced for updates variable automatically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_037",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement is compulsory in do-while?",
            options = listOf("break", "continue", "condition", "increment"),
            correctAnswer = "condition",
            explanation = "do-while must have condition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_038",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which is true about enhanced for loop?",
            options = listOf("Index based", "Works on arrays", "Allows modification", "Supports break only"),
            correctAnswer = "Works on arrays",
            explanation = "Enhanced for works on arrays and collections.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_039",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is best for unknown iterations?",
            options = listOf("for", "while", "enhanced for", "switch"),
            correctAnswer = "while",
            explanation = "while is best when iterations are unknown.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_040",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement can be labeled?",
            options = listOf("if", "break", "continue", "Both break and continue"),
            correctAnswer = "Both break and continue",
            explanation = "Labels can be used with break and continue.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_041",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop executes fastest conceptually?",
            options = listOf("for", "while", "do-while", "Depends on logic"),
            correctAnswer = "Depends on logic",
            explanation = "Execution speed depends on implementation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_042",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which control statement supports fall-through?",
            options = listOf("if", "switch", "loop", "while"),
            correctAnswer = "switch",
            explanation = "Switch allows fall-through without break.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_043",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which keyword ends entire program?",
            options = listOf("break", "return", "System.exit()", "continue"),
            correctAnswer = "System.exit()",
            explanation = "System.exit() terminates JVM.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_044",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which loop is suitable for menu-driven programs?",
            options = listOf("for", "while", "do-while", "switch"),
            correctAnswer = "do-while",
            explanation = "Menu must execute at least once.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_control_statements_045",
            categoryId = categoryId,
            chapterId = JAVA_CONTROL,
            questionText = "Which statement checks multiple conditions sequentially?",
            options = listOf("switch", "nested if", "loop", "break"),
            correctAnswer = "nested if",
            explanation = "Nested if checks conditions step by step.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_oop_concepts_001",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "What does OOP stand for?",
            options = listOf("Object Oriented Programming", "Objective Oriented Process", "Object Operating Program", "Open Object Protocol"),
            correctAnswer = "Object Oriented Programming",
            explanation = "OOP is a programming paradigm based on objects and classes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_002",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which is the basic unit of Object Oriented Programming?",
            options = listOf("Method", "Class", "Object", "Package"),
            correctAnswer = "Object",
            explanation = "Objects represent real-world entities in OOP.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_003",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is used to create an object in Java?",
            options = listOf("this", "new", "create", "object"),
            correctAnswer = "new",
            explanation = "The new keyword allocates memory for an object.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_004",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "What is a class in Java?",
            options = listOf("An object", "A method", "A blueprint of objects", "A package"),
            correctAnswer = "A blueprint of objects",
            explanation = "Class defines properties and behavior of objects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_005",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which OOP concept binds data and methods together?",
            options = listOf("Inheritance", "Polymorphism", "Encapsulation", "Abstraction"),
            correctAnswer = "Encapsulation",
            explanation = "Encapsulation wraps data and methods into a single unit.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_006",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which access modifier makes members accessible everywhere?",
            options = listOf("private", "protected", "default", "public"),
            correctAnswer = "public",
            explanation = "Public members can be accessed from anywhere.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_007",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is used to inherit a class?",
            options = listOf("implements", "extends", "inherits", "super"),
            correctAnswer = "extends",
            explanation = "extends is used for class inheritance.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_008",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "What is method overloading?",
            options = listOf("Same method name with different parameters", "Same method name with same parameters", "Different method names", "Method inside method"),
            correctAnswer = "Same method name with different parameters",
            explanation = "Overloading is compile-time polymorphism.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_009",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "What is method overriding?",
            options = listOf("Same method name and parameters in same class", "Same method name and parameters in subclass", "Different method name", "Private method"),
            correctAnswer = "Same method name and parameters in subclass",
            explanation = "Overriding provides runtime polymorphism.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_010",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is used to refer to parent class object?",
            options = listOf("this", "parent", "super", "base"),
            correctAnswer = "super",
            explanation = "super refers to the immediate parent class object.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_011",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which OOP concept allows same method name with different behavior?",
            options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
            correctAnswer = "Polymorphism",
            explanation = "Polymorphism means many forms of a method.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_012",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which of the following is not an OOP concept?",
            options = listOf("Encapsulation", "Polymorphism", "Compilation", "Inheritance"),
            correctAnswer = "Compilation",
            explanation = "Compilation is not an OOP principle.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_013",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which access modifier is most restrictive?",
            options = listOf("public", "protected", "default", "private"),
            correctAnswer = "private",
            explanation = "Private members are accessible only within the class.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_014",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword prevents method overriding?",
            options = listOf("static", "final", "private", "abstract"),
            correctAnswer = "final",
            explanation = "Final methods cannot be overridden.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_015",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "What is abstraction in Java?",
            options = listOf("Hiding implementation details", "Hiding data", "Hiding methods", "Hiding objects"),
            correctAnswer = "Hiding implementation details",
            explanation = "Abstraction shows only essential features.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_016",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is used to declare an abstract class?",
            options = listOf("interface", "abstract", "extends", "implements"),
            correctAnswer = "abstract",
            explanation = "Abstract keyword is used for abstract classes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_017",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which of the following supports multiple inheritance?",
            options = listOf("Class", "Abstract class", "Interface", "Constructor"),
            correctAnswer = "Interface",
            explanation = "Java supports multiple inheritance through interfaces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_018",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Can constructors be overridden?",
            options = listOf("Yes", "No", "Only private", "Only public"),
            correctAnswer = "No",
            explanation = "Constructors are not inherited, so cannot be overridden.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_019",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which feature allows code reusability?",
            options = listOf("Encapsulation", "Inheritance", "Abstraction", "Polymorphism"),
            correctAnswer = "Inheritance",
            explanation = "Inheritance allows reuse of existing class features.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_020",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which method cannot be overridden?",
            options = listOf("public", "protected", "final", "default"),
            correctAnswer = "final",
            explanation = "Final methods cannot be overridden.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_021",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which binding occurs at runtime?",
            options = listOf("Static binding", "Dynamic binding", "Early binding", "Compile binding"),
            correctAnswer = "Dynamic binding",
            explanation = "Dynamic binding happens during runtime.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_022",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is used to implement an interface?",
            options = listOf("extends", "implements", "inherit", "override"),
            correctAnswer = "implements",
            explanation = "implements is used to implement interfaces.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_023",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which class is at the top of Java class hierarchy?",
            options = listOf("System", "Class", "Object", "Main"),
            correctAnswer = "Object",
            explanation = "Object is the root class of all Java classes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_024",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which methods are allowed in interfaces (Java 8+)?",
            options = listOf("Only abstract", "Only static", "Abstract, default, static", "Private only"),
            correctAnswer = "Abstract, default, static",
            explanation = "Java 8 allows default and static methods in interfaces.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_025",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which OOP concept improves security?",
            options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Abstraction"),
            correctAnswer = "Encapsulation",
            explanation = "Encapsulation restricts direct data access.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_026",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which access modifier allows access within package only?",
            options = listOf("public", "private", "protected", "default"),
            correctAnswer = "default",
            explanation = "Default access is package-private.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_027",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Can abstract class have constructors?",
            options = listOf("Yes", "No", "Only default", "Only parameterized"),
            correctAnswer = "Yes",
            explanation = "Abstract classes can have constructors.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_028",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which is true about constructors?",
            options = listOf("They have return type", "They initialize objects", "They are static", "They are inherited"),
            correctAnswer = "They initialize objects",
            explanation = "Constructors initialize object state.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_029",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is used to call current class constructor?",
            options = listOf("super()", "this()", "new()", "constructor()"),
            correctAnswer = "this()",
            explanation = "this() invokes another constructor of same class.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_030",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which type of inheritance is not supported by Java classes?",
            options = listOf("Single", "Multilevel", "Hierarchical", "Multiple"),
            correctAnswer = "Multiple",
            explanation = "Java does not support multiple inheritance with classes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_031",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which method is implicitly called when object is created?",
            options = listOf("main()", "start()", "constructor", "finalize()"),
            correctAnswer = "constructor",
            explanation = "Constructor is called during object creation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_032",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which variable belongs to object?",
            options = listOf("Local", "Static", "Instance", "Temporary"),
            correctAnswer = "Instance",
            explanation = "Instance variables are object-specific.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_033",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which concept is achieved using interfaces?",
            options = listOf("Encapsulation", "Inheritance", "Multiple inheritance", "Abstraction"),
            correctAnswer = "Multiple inheritance",
            explanation = "Interfaces allow multiple inheritance in Java.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_034",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is used to prevent inheritance?",
            options = listOf("static", "private", "final", "abstract"),
            correctAnswer = "final",
            explanation = "Final classes cannot be inherited.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_035",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which method cannot be static?",
            options = listOf("main()", "abstract method", "final method", "overloaded method"),
            correctAnswer = "abstract method",
            explanation = "Abstract methods cannot be static.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_036",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which access modifier allows subclass access outside package?",
            options = listOf("private", "default", "protected", "public"),
            correctAnswer = "protected",
            explanation = "Protected allows subclass access even outside package.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_037",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which concept hides internal details from user?",
            options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Overloading"),
            correctAnswer = "Encapsulation",
            explanation = "Encapsulation hides internal data using access modifiers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_038",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which of these is compile-time polymorphism?",
            options = listOf("Method overriding", "Dynamic binding", "Method overloading", "Inheritance"),
            correctAnswer = "Method overloading",
            explanation = "Overloading is resolved at compile time.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_039",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which keyword is mandatory in abstract method?",
            options = listOf("final", "static", "abstract", "public"),
            correctAnswer = "abstract",
            explanation = "Abstract methods must be declared abstract.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_040",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which relationship represents IS-A?",
            options = listOf("Association", "Aggregation", "Inheritance", "Composition"),
            correctAnswer = "Inheritance",
            explanation = "Inheritance represents IS-A relationship.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_041",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which relationship represents HAS-A?",
            options = listOf("Inheritance", "Association", "Interface", "Package"),
            correctAnswer = "Association",
            explanation = "HAS-A relationship is achieved using association.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_042",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Can interface have variables?",
            options = listOf("No", "Yes, non-final", "Yes, static final", "Only private"),
            correctAnswer = "Yes, static final",
            explanation = "Interface variables are implicitly public static final.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_043",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which method is used to access hidden data?",
            options = listOf("Constructor", "Setter/Getter", "Overloaded method", "Static method"),
            correctAnswer = "Setter/Getter",
            explanation = "Getters and setters provide controlled access.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_044",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which is true about abstract class?",
            options = listOf("Cannot have methods", "Cannot have constructors", "Can have abstract and non-abstract methods", "Cannot be extended"),
            correctAnswer = "Can have abstract and non-abstract methods",
            explanation = "Abstract class can contain both types of methods.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_concepts_045",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which concept improves flexibility and scalability?",
            options = listOf("Encapsulation", "Polymorphism", "Inheritance", "Abstraction"),
            correctAnswer = "Polymorphism",
            explanation = "Polymorphism allows flexible behavior at runtime.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_inheritance_and_polymorphism_001",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Inheritance in Java represents which relationship?",
            options = listOf("HAS-A", "USES-A", "IS-A", "PART-OF"),
            correctAnswer = "IS-A",
            explanation = "Inheritance establishes an IS-A relationship between classes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_002",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which keyword is used to inherit a class in Java?",
            options = listOf("implements", "inherits", "extends", "super"),
            correctAnswer = "extends",
            explanation = "extends is used by a subclass to inherit a superclass.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_003",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Polymorphism means:",
            options = listOf("Many classes", "Many objects", "Many forms", "Many packages"),
            correctAnswer = "Many forms",
            explanation = "Polymorphism allows one method or object to take many forms.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_004",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which polymorphism is resolved at compile time?",
            options = listOf("Runtime polymorphism", "Method overriding", "Method overloading", "Dynamic binding"),
            correctAnswer = "Method overloading",
            explanation = "Overloading is resolved during compilation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_005",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which polymorphism is resolved at runtime?",
            options = listOf("Method overloading", "Static binding", "Method overriding", "Constructor overloading"),
            correctAnswer = "Method overriding",
            explanation = "Overriding uses dynamic method dispatch at runtime.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_006",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which keyword is used to access parent class members?",
            options = listOf("this", "parent", "super", "base"),
            correctAnswer = "super",
            explanation = "super refers to the immediate parent class object.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_007",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which class is the root of Java class hierarchy?",
            options = listOf("System", "Class", "Object", "Main"),
            correctAnswer = "Object",
            explanation = "Object is the topmost superclass in Java.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_008",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which method call is decided at runtime?",
            options = listOf("Static method", "Private method", "Final method", "Overridden method"),
            correctAnswer = "Overridden method",
            explanation = "Overridden methods use dynamic binding.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_009",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance type is NOT supported by Java classes?",
            options = listOf("Single", "Multilevel", "Hierarchical", "Multiple"),
            correctAnswer = "Multiple",
            explanation = "Java avoids multiple inheritance with classes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_010",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Multiple inheritance is supported in Java using:",
            options = listOf("Classes", "Abstract classes", "Interfaces", "Objects"),
            correctAnswer = "Interfaces",
            explanation = "Interfaces enable multiple inheritance.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_011",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which concept allows parent reference to refer to child object?",
            options = listOf("Encapsulation", "Inheritance", "Polymorphism", "Abstraction"),
            correctAnswer = "Polymorphism",
            explanation = "Polymorphism allows parent reference-child object behavior.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_012",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which binding happens at runtime?",
            options = listOf("Static binding", "Early binding", "Dynamic binding", "Compile binding"),
            correctAnswer = "Dynamic binding",
            explanation = "Dynamic binding resolves method calls at runtime.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_013",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which methods cannot be overridden?",
            options = listOf("public", "protected", "final", "abstract"),
            correctAnswer = "final",
            explanation = "Final methods are locked and cannot be overridden.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_014",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which members are NOT inherited?",
            options = listOf("Public", "Protected", "Private", "Default"),
            correctAnswer = "Private",
            explanation = "Private members are accessible only within the same class.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_015",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which constructor is executed first during inheritance?",
            options = listOf("Child", "Parent", "Both simultaneously", "None"),
            correctAnswer = "Parent",
            explanation = "Superclass constructor runs before subclass constructor.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_016",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which keyword prevents inheritance?",
            options = listOf("static", "private", "final", "abstract"),
            correctAnswer = "final",
            explanation = "Final classes cannot be extended.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_017",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which feature resolves method call based on object type?",
            options = listOf("Overloading", "Static binding", "Overriding", "Encapsulation"),
            correctAnswer = "Overriding",
            explanation = "Runtime polymorphism uses method overriding.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_018",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which problem is avoided by Java using interfaces?",
            options = listOf("Memory leak", "Stack overflow", "Diamond problem", "Deadlock"),
            correctAnswer = "Diamond problem",
            explanation = "Interfaces prevent ambiguity in multiple inheritance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_019",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which method is bound at compile time?",
            options = listOf("Overridden method", "Virtual method", "Static method", "Interface method"),
            correctAnswer = "Static method",
            explanation = "Static methods use compile-time binding.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_020",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance forms a chain of classes?",
            options = listOf("Single", "Hierarchical", "Multilevel", "Multiple"),
            correctAnswer = "Multilevel",
            explanation = "Multilevel inheritance forms parent-child chains.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_021",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which feature improves flexibility and scalability?",
            options = listOf("Encapsulation", "Inheritance", "Polymorphism", "Compilation"),
            correctAnswer = "Polymorphism",
            explanation = "Polymorphism allows behavior to change dynamically.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_022",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which keyword is used to call parent constructor?",
            options = listOf("this()", "parent()", "super()", "new()"),
            correctAnswer = "super()",
            explanation = "super() invokes the parent class constructor.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_023",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance type has one parent and many children?",
            options = listOf("Single", "Multilevel", "Hierarchical", "Multiple"),
            correctAnswer = "Hierarchical",
            explanation = "Hierarchical inheritance has one parent and multiple subclasses.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_024",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which access modifier allows inheritance across packages?",
            options = listOf("private", "default", "protected", "static"),
            correctAnswer = "protected",
            explanation = "Protected members are accessible in subclasses across packages.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_025",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which is NOT required for runtime polymorphism?",
            options = listOf("Inheritance", "Method overriding", "Dynamic binding", "Method overloading"),
            correctAnswer = "Method overloading",
            explanation = "Overloading is compile-time polymorphism.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_026",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which statement is true about method overriding?",
            options = listOf(
                "Return type must be different",
                "Access level can be reduced",
                "Method signature must be same",
                "Method must be static"
            ),
            correctAnswer = "Method signature must be same",
            explanation = "Overriding requires same method name and parameters.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_027",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which access modifier cannot be used in method overriding?",
            options = listOf("public", "protected", "private", "default"),
            correctAnswer = "private",
            explanation = "Private methods are not inherited, so cannot be overridden.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_028",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which concept allows same method call to behave differently?",
            options = listOf("Encapsulation", "Inheritance", "Polymorphism", "Abstraction"),
            correctAnswer = "Polymorphism",
            explanation = "Polymorphism enables different behavior for same method call.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_029",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which method cannot participate in runtime polymorphism?",
            options = listOf("Overridden method", "Static method", "Interface method", "Abstract method"),
            correctAnswer = "Static method",
            explanation = "Static methods are resolved at compile time.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_030",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which binding is used for method overriding?",
            options = listOf("Static binding", "Early binding", "Dynamic binding", "Compile binding"),
            correctAnswer = "Dynamic binding",
            explanation = "Overridden methods are resolved at runtime.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_031",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which keyword is used to restrict method overriding?",
            options = listOf("static", "abstract", "final", "protected"),
            correctAnswer = "final",
            explanation = "Final methods cannot be overridden.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_032",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which scenario demonstrates runtime polymorphism?",
            options = listOf(
                "Method overloading",
                "Constructor overloading",
                "Parent reference holding child object",
                "Static method call"
            ),
            correctAnswer = "Parent reference holding child object",
            explanation = "Runtime polymorphism uses parent reference and child object.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_033",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance type increases complexity the most?",
            options = listOf("Single", "Hierarchical", "Multilevel", "None"),
            correctAnswer = "Multilevel",
            explanation = "Deep inheritance chains increase complexity.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_034",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which method is inherited from Object class?",
            options = listOf("main()", "start()", "toString()", "run()"),
            correctAnswer = "toString()",
            explanation = "toString() is available to all Java objects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_035",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance type is achieved using interfaces?",
            options = listOf("Single", "Multilevel", "Multiple", "Hierarchical"),
            correctAnswer = "Multiple",
            explanation = "Interfaces allow multiple inheritance.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_036",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which call is resolved based on reference type?",
            options = listOf("Overridden method", "Instance method", "Static method", "Interface method"),
            correctAnswer = "Static method",
            explanation = "Static methods depend on reference type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_037",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which feature promotes loose coupling?",
            options = listOf("Inheritance", "Polymorphism", "Encapsulation", "Tight binding"),
            correctAnswer = "Polymorphism",
            explanation = "Polymorphism reduces dependency on concrete implementations.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_038",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance level constructor executes last?",
            options = listOf("Parent", "Grandparent", "Child", "Object"),
            correctAnswer = "Child",
            explanation = "Constructors execute from top to bottom.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_039",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which rule must be followed in method overriding?",
            options = listOf(
                "Return type must be void",
                "Access level cannot be reduced",
                "Method must be static",
                "Parameters must change"
            ),
            correctAnswer = "Access level cannot be reduced",
            explanation = "Overridden method cannot have weaker access.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_040",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance form avoids deep class hierarchy?",
            options = listOf("Multilevel", "Hierarchical", "Multiple", "Hybrid"),
            correctAnswer = "Hierarchical",
            explanation = "Hierarchical inheritance keeps depth shallow.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_041",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which polymorphism improves code maintainability?",
            options = listOf("Compile-time", "Runtime", "Constructor", "Static"),
            correctAnswer = "Runtime",
            explanation = "Runtime polymorphism allows flexible behavior changes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_042",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which keyword ensures method belongs to class?",
            options = listOf("final", "abstract", "static", "protected"),
            correctAnswer = "static",
            explanation = "Static methods belong to the class, not objects.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_043",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which concept allows behavior change without modifying code?",
            options = listOf("Inheritance", "Encapsulation", "Polymorphism", "Compilation"),
            correctAnswer = "Polymorphism",
            explanation = "Polymorphism allows extension without modification.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_044",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which inheritance approach is most recommended in Java?",
            options = listOf("Deep inheritance", "Multiple inheritance with classes", "Composition over inheritance", "Tight coupling"),
            correctAnswer = "Composition over inheritance",
            explanation = "Composition reduces complexity and improves flexibility.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_inheritance_and_polymorphism_045",
            categoryId = categoryId,
            chapterId = JAVA_INHERITANCE,
            questionText = "Which problem arises with excessive inheritance usage?",
            options = listOf("Faster execution", "Better readability", "Tight coupling", "Less code"),
            correctAnswer = "Tight coupling",
            explanation = "Deep inheritance tightly couples classes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_interfaces_and_abstract_classes_001",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "What is an interface in Java?",
            options = listOf(
                "A concrete class",
                "A blueprint containing only method declarations",
                "An object",
                "A package"
            ),
            correctAnswer = "A blueprint containing only method declarations",
            explanation = "An interface defines method signatures without implementation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_002",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword is used to implement an interface?",
            options = listOf("extends", "implements", "inherit", "super"),
            correctAnswer = "implements",
            explanation = "Classes use implements to implement interfaces.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_003",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword is used to declare an abstract class?",
            options = listOf("interface", "abstract", "extends", "final"),
            correctAnswer = "abstract",
            explanation = "The abstract keyword is mandatory for abstract classes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_004",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Can an abstract class have non-abstract methods?",
            options = listOf("No", "Yes", "Only static", "Only final"),
            correctAnswer = "Yes",
            explanation = "Abstract classes can have both abstract and concrete methods.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_005",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which of the following supports multiple inheritance?",
            options = listOf("Class", "Abstract class", "Interface", "Constructor"),
            correctAnswer = "Interface",
            explanation = "Interfaces allow multiple inheritance in Java.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_006",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Can we create an object of an abstract class?",
            options = listOf("Yes", "No", "Only inside package", "Only using interface"),
            correctAnswer = "No",
            explanation = "Abstract classes cannot be instantiated.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_007",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which methods are allowed in an interface (Java 8+)?",
            options = listOf(
                "Only abstract",
                "Abstract and static",
                "Abstract, default, static",
                "Only default"
            ),
            correctAnswer = "Abstract, default, static",
            explanation = "Java 8 introduced default and static methods in interfaces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_008",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which variable type is allowed in an interface?",
            options = listOf(
                "Instance variable",
                "Non-final variable",
                "Static final variable",
                "Local variable"
            ),
            correctAnswer = "Static final variable",
            explanation = "Interface variables are implicitly public static final.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_009",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which access modifier is implicit for interface methods?",
            options = listOf("private", "protected", "public", "default"),
            correctAnswer = "public",
            explanation = "All interface methods are implicitly public.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_010",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword is used to inherit an interface?",
            options = listOf("implements", "extends", "inherits", "super"),
            correctAnswer = "extends",
            explanation = "Interfaces extend other interfaces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_011",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which class can have abstract methods?",
            options = listOf("Concrete class", "Final class", "Abstract class", "Static class"),
            correctAnswer = "Abstract class",
            explanation = "Only abstract classes can have abstract methods.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_012",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword is used to prevent inheritance?",
            options = listOf("abstract", "static", "final", "private"),
            correctAnswer = "final",
            explanation = "Final classes cannot be inherited.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_013",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Can an interface have a constructor?",
            options = listOf("Yes", "No", "Only default", "Only private"),
            correctAnswer = "No",
            explanation = "Interfaces cannot have constructors.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_014",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which concept is achieved using abstract classes?",
            options = listOf("Encapsulation", "Abstraction", "Compilation", "Binding"),
            correctAnswer = "Abstraction",
            explanation = "Abstract classes hide implementation details.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_015",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which is true about abstract methods?",
            options = listOf(
                "They have body",
                "They are static",
                "They must be overridden",
                "They are final"
            ),
            correctAnswer = "They must be overridden",
            explanation = "Subclasses must implement abstract methods.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_016",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which class must implement all interface methods?",
            options = listOf(
                "Abstract class",
                "Concrete class",
                "Final class",
                "Static class"
            ),
            correctAnswer = "Concrete class",
            explanation = "Concrete classes must implement all interface methods.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_017",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword is used to inherit an abstract class?",
            options = listOf("implements", "extends", "super", "this"),
            correctAnswer = "extends",
            explanation = "Abstract classes are inherited using extends.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_018",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Can an abstract class implement an interface?",
            options = listOf("Yes", "No", "Only one", "Only default"),
            correctAnswer = "Yes",
            explanation = "Abstract classes may partially implement interfaces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_019",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which method in interface provides implementation?",
            options = listOf("Abstract method", "Default method", "Static method", "Private method"),
            correctAnswer = "Default method",
            explanation = "Default methods contain method body in interfaces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_020",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which Java feature solves the diamond problem?",
            options = listOf(
                "Abstract classes",
                "Interfaces with default methods",
                "Inheritance",
                "Packages"
            ),
            correctAnswer = "Interfaces with default methods",
            explanation = "Interfaces resolve ambiguity using explicit override.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_021",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which access modifier is NOT allowed for interface methods?",
            options = listOf("public", "private", "protected", "default"),
            correctAnswer = "protected",
            explanation = "Interface methods cannot be protected.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_022",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which method cannot be abstract?",
            options = listOf("Constructor", "Instance method", "Interface method", "Class method"),
            correctAnswer = "Constructor",
            explanation = "Constructors cannot be abstract.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_023",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which class can be instantiated?",
            options = listOf(
                "Abstract class",
                "Interface",
                "Concrete class",
                "Anonymous interface"
            ),
            correctAnswer = "Concrete class",
            explanation = "Only concrete classes can be instantiated.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_024",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword forces a class to remain incomplete?",
            options = listOf("final", "static", "abstract", "default"),
            correctAnswer = "abstract",
            explanation = "Abstract keyword makes a class incomplete.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_025",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which approach is preferred in Java?",
            options = listOf(
                "Deep inheritance",
                "Multiple inheritance with classes",
                "Interfaces with implementation",
                "Composition over inheritance"
            ),
            correctAnswer = "Composition over inheritance",
            explanation = "Composition reduces coupling and increases flexibility.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_026",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which method must be implemented by child class?",
            options = listOf(
                "Static method",
                "Final method",
                "Abstract method",
                "Private method"
            ),
            correctAnswer = "Abstract method",
            explanation = "Abstract methods must be implemented by subclasses.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_027",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which interface feature was introduced in Java 8?",
            options = listOf(
                "Variables",
                "Constructors",
                "Default methods",
                "Abstract methods"
            ),
            correctAnswer = "Default methods",
            explanation = "Java 8 introduced default methods in interfaces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_028",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which method is implicitly public in interface?",
            options = listOf("Abstract method", "Static method", "Default method", "All of these"),
            correctAnswer = "All of these",
            explanation = "All interface methods are public by default.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_029",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword allows partial implementation?",
            options = listOf("final", "abstract", "static", "private"),
            correctAnswer = "abstract",
            explanation = "Abstract allows incomplete implementation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_030",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which is faster generally?",
            options = listOf(
                "Interface call",
                "Abstract class call",
                "Depends on JVM",
                "Always interface"
            ),
            correctAnswer = "Depends on JVM",
            explanation = "Performance depends on JVM optimizations.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_031",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword hides implementation details?",
            options = listOf("Inheritance", "Abstraction", "Polymorphism", "Encapsulation"),
            correctAnswer = "Abstraction",
            explanation = "Abstraction hides internal details.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_032",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which method cannot be overridden?",
            options = listOf("abstract", "static", "default", "public"),
            correctAnswer = "static",
            explanation = "Static methods cannot be overridden.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_033",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which feature promotes loose coupling?",
            options = listOf("Inheritance", "Encapsulation", "Interfaces", "Static binding"),
            correctAnswer = "Interfaces",
            explanation = "Interfaces reduce dependency on implementations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_034",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which interface method is inherited automatically?",
            options = listOf(
                "Default method",
                "Static method",
                "Private method",
                "Constructor"
            ),
            correctAnswer = "Default method",
            explanation = "Default methods are inherited by implementing classes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_035",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which Java principle is violated by deep inheritance?",
            options = listOf(
                "Loose coupling",
                "High cohesion",
                "Low coupling",
                "Encapsulation"
            ),
            correctAnswer = "Low coupling",
            explanation = "Deep inheritance increases tight coupling.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_036",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword prevents method implementation?",
            options = listOf("final", "abstract", "static", "private"),
            correctAnswer = "abstract",
            explanation = "Abstract methods have no implementation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_037",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which feature allows future extensibility?",
            options = listOf(
                "Abstract class",
                "Interface",
                "Static class",
                "Final class"
            ),
            correctAnswer = "Interface",
            explanation = "Interfaces support extensible design.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_038",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which inheritance is preferred with interfaces?",
            options = listOf(
                "Single",
                "Multiple",
                "Hierarchical",
                "Multilevel"
            ),
            correctAnswer = "Multiple",
            explanation = "Interfaces allow safe multiple inheritance.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_039",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which keyword allows class to remain incomplete?",
            options = listOf("final", "static", "abstract", "default"),
            correctAnswer = "abstract",
            explanation = "Abstract classes may have unimplemented methods.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_040",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which concept avoids diamond problem?",
            options = listOf(
                "Multiple inheritance",
                "Interfaces",
                "Abstract classes",
                "Packages"
            ),
            correctAnswer = "Interfaces",
            explanation = "Interfaces avoid ambiguity using explicit overrides.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_041",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which method must not have body?",
            options = listOf(
                "Default method",
                "Static method",
                "Abstract method",
                "Private method"
            ),
            correctAnswer = "Abstract method",
            explanation = "Abstract methods have no body.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_042",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which design principle is improved by interfaces?",
            options = listOf(
                "Tight coupling",
                "Low cohesion",
                "Loose coupling",
                "Static binding"
            ),
            correctAnswer = "Loose coupling",
            explanation = "Interfaces reduce dependency between components.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_043",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which class cannot be extended?",
            options = listOf(
                "Abstract class",
                "Concrete class",
                "Final class",
                "Interface"
            ),
            correctAnswer = "Final class",
            explanation = "Final classes cannot be inherited.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_044",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which is true about interface variables?",
            options = listOf(
                "They are instance variables",
                "They can change value",
                "They are static final",
                "They are private"
            ),
            correctAnswer = "They are static final",
            explanation = "Interface variables are constants.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_interfaces_and_abstract_classes_045",
            categoryId = categoryId,
            chapterId = JAVA_INTERFACES,
            questionText = "Which approach is best for long-term maintenance?",
            options = listOf(
                "Deep inheritance",
                "Tight coupling",
                "Interfaces with composition",
                "Final-heavy design"
            ),
            correctAnswer = "Interfaces with composition",
            explanation = "Composition with interfaces gives flexibility and maintainability.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_exception_handling_001",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "What is an exception in Java?",
            options = listOf(
                "A syntax error",
                "An event that disrupts normal program flow",
                "A compiler warning",
                "A logical mistake"
            ),
            correctAnswer = "An event that disrupts normal program flow",
            explanation = "Exceptions occur during runtime and disturb normal execution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_002",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which keyword is used to handle exceptions?",
            options = listOf("throw", "throws", "try-catch", "final"),
            correctAnswer = "try-catch",
            explanation = "try-catch is used to handle runtime exceptions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_003",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block always executes whether exception occurs or not?",
            options = listOf("try", "catch", "throw", "finally"),
            correctAnswer = "finally",
            explanation = "finally block always executes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_004",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which keyword is used to explicitly throw an exception?",
            options = listOf("throws", "throw", "try", "catch"),
            correctAnswer = "throw",
            explanation = "throw is used to explicitly raise an exception.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_005",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which keyword declares exceptions in method signature?",
            options = listOf("throw", "throws", "catch", "final"),
            correctAnswer = "throws",
            explanation = "throws informs caller about possible exceptions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_006",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is checked at compile time?",
            options = listOf(
                "NullPointerException",
                "ArrayIndexOutOfBoundsException",
                "IOException",
                "ArithmeticException"
            ),
            correctAnswer = "IOException",
            explanation = "Checked exceptions are verified at compile time.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_007",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when dividing by zero?",
            options = listOf(
                "NullPointerException",
                "NumberFormatException",
                "ArithmeticException",
                "ClassCastException"
            ),
            correctAnswer = "ArithmeticException",
            explanation = "Division by zero causes ArithmeticException.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_008",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when accessing array with invalid index?",
            options = listOf(
                "ArrayStoreException",
                "ArrayIndexOutOfBoundsException",
                "IndexOutOfBoundsException",
                "NullPointerException"
            ),
            correctAnswer = "ArrayIndexOutOfBoundsException",
            explanation = "Occurs when array index is invalid.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_009",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which is the superclass of all exceptions?",
            options = listOf("Error", "Throwable", "RuntimeException", "Exception"),
            correctAnswer = "Throwable",
            explanation = "Throwable is the root class of exception hierarchy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_010",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is unchecked?",
            options = listOf("IOException", "SQLException", "ClassNotFoundException", "NullPointerException"),
            correctAnswer = "NullPointerException",
            explanation = "Unchecked exceptions occur at runtime.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_011",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Can we have multiple catch blocks?",
            options = listOf("No", "Yes", "Only one allowed", "Only for checked exceptions"),
            correctAnswer = "Yes",
            explanation = "Multiple catch blocks are allowed for different exceptions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_012",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block must come after try?",
            options = listOf("finally", "throw", "catch or finally", "throws"),
            correctAnswer = "catch or finally",
            explanation = "try must be followed by catch or finally.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_013",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is thrown when object is null?",
            options = listOf(
                "IllegalArgumentException",
                "NullPointerException",
                "ClassCastException",
                "RuntimeException"
            ),
            correctAnswer = "NullPointerException",
            explanation = "Occurs when accessing a null object.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_014",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which keyword is used for custom exception?",
            options = listOf("throws", "throw", "extends Exception", "catch"),
            correctAnswer = "extends Exception",
            explanation = "Custom exceptions extend Exception class.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_015",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block is optional?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "finally",
            explanation = "finally block is optional.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_016",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs during class loading?",
            options = listOf(
                "IOException",
                "ClassNotFoundException",
                "NoClassDefFoundError",
                "ClassCastException"
            ),
            correctAnswer = "ClassNotFoundException",
            explanation = "Occurs when class is not found at runtime.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_017",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which is a checked exception?",
            options = listOf(
                "ArithmeticException",
                "ArrayIndexOutOfBoundsException",
                "IOException",
                "NullPointerException"
            ),
            correctAnswer = "IOException",
            explanation = "Checked exceptions must be handled.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_018",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when casting fails?",
            options = listOf(
                "ClassCastException",
                "IllegalArgumentException",
                "ArithmeticException",
                "NumberFormatException"
            ),
            correctAnswer = "ClassCastException",
            explanation = "Occurs during invalid type casting.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_019",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception belongs to Error category?",
            options = listOf(
                "IOException",
                "StackOverflowError",
                "SQLException",
                "ClassNotFoundException"
            ),
            correctAnswer = "StackOverflowError",
            explanation = "Errors are serious problems not meant to be caught.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_020",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block executes first?",
            options = listOf("catch", "finally", "try", "throw"),
            correctAnswer = "try",
            explanation = "Execution always starts from try block.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_021",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is thrown when number conversion fails?",
            options = listOf(
                "IllegalArgumentException",
                "NumberFormatException",
                "ArithmeticException",
                "NullPointerException"
            ),
            correctAnswer = "NumberFormatException",
            explanation = "Occurs when string cannot be converted to number.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_022",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is parent of all runtime exceptions?",
            options = listOf("Throwable", "Exception", "RuntimeException", "Error"),
            correctAnswer = "RuntimeException",
            explanation = "RuntimeException is parent of unchecked exceptions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_023",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Can finally block be skipped?",
            options = listOf(
                "No",
                "Yes, always",
                "Only with System.exit()",
                "Only with return"
            ),
            correctAnswer = "Only with System.exit()",
            explanation = "System.exit() stops JVM execution.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_024",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block is used to catch exception?",
            options = listOf("throw", "throws", "catch", "finally"),
            correctAnswer = "catch",
            explanation = "catch handles raised exceptions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_025",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when file is not found?",
            options = listOf(
                "IOException",
                "FileNotFoundException",
                "ClassNotFoundException",
                "NoSuchFileException"
            ),
            correctAnswer = "FileNotFoundException",
            explanation = "Occurs when specified file does not exist.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_026",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block executes last?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "finally",
            explanation = "finally block executes at the end.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_027",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is related to database operations?",
            options = listOf(
                "IOException",
                "SQLException",
                "ClassNotFoundException",
                "NullPointerException"
            ),
            correctAnswer = "SQLException",
            explanation = "SQLException occurs during database access.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_028",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is thrown when accessing closed resource?",
            options = listOf(
                "IOException",
                "IllegalStateException",
                "NullPointerException",
                "RuntimeException"
            ),
            correctAnswer = "IllegalStateException",
            explanation = "Occurs when resource is in invalid state.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_029",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception hierarchy separates errors and exceptions?",
            options = listOf("Exception", "Throwable", "Error", "RuntimeException"),
            correctAnswer = "Throwable",
            explanation = "Throwable is the parent of Error and Exception.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_030",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when method argument is invalid?",
            options = listOf(
                "IllegalArgumentException",
                "NumberFormatException",
                "ClassCastException",
                "NullPointerException"
            ),
            correctAnswer = "IllegalArgumentException",
            explanation = "Thrown when illegal argument is passed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_031",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block cannot exist alone?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "catch",
            explanation = "catch must be associated with try.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_032",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when JVM runs out of memory?",
            options = listOf(
                "StackOverflowError",
                "OutOfMemoryError",
                "MemoryException",
                "RuntimeException"
            ),
            correctAnswer = "OutOfMemoryError",
            explanation = "Occurs when JVM cannot allocate memory.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_033",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs during invalid arithmetic operation?",
            options = listOf(
                "ArithmeticException",
                "NumberFormatException",
                "IllegalStateException",
                "ClassCastException"
            ),
            correctAnswer = "ArithmeticException",
            explanation = "Occurs during invalid arithmetic.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_034",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block handles exception object?",
            options = listOf("try", "throw", "catch", "finally"),
            correctAnswer = "catch",
            explanation = "catch block receives exception object.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_035",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when accessing null reference?",
            options = listOf(
                "IllegalArgumentException",
                "NullPointerException",
                "ClassCastException",
                "IndexOutOfBoundsException"
            ),
            correctAnswer = "NullPointerException",
            explanation = "Occurs when object reference is null.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_036",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception type is not required to be handled?",
            options = listOf(
                "Checked exception",
                "Unchecked exception",
                "Compile-time exception",
                "IO exception"
            ),
            correctAnswer = "Unchecked exception",
            explanation = "Unchecked exceptions are not mandatory to handle.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_037",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs during thread interruption?",
            options = listOf(
                "InterruptedException",
                "RuntimeException",
                "ThreadDeath",
                "IllegalStateException"
            ),
            correctAnswer = "InterruptedException",
            explanation = "Occurs when thread is interrupted.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_038",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which keyword rethrows an exception?",
            options = listOf("throw", "throws", "catch", "finally"),
            correctAnswer = "throw",
            explanation = "throw can rethrow an exception.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_039",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is thrown when class casting fails?",
            options = listOf(
                "ClassCastException",
                "IllegalStateException",
                "RuntimeException",
                "ClassNotFoundException"
            ),
            correctAnswer = "ClassCastException",
            explanation = "Occurs during invalid object casting.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_040",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block is mandatory?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "try",
            explanation = "Exception handling starts with try block.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_041",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs during invalid index access?",
            options = listOf(
                "IndexOutOfBoundsException",
                "ArrayStoreException",
                "NullPointerException",
                "ClassCastException"
            ),
            correctAnswer = "IndexOutOfBoundsException",
            explanation = "Occurs when index is invalid.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_042",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception occurs when input-output fails?",
            options = listOf(
                "IOException",
                "SQLException",
                "ClassNotFoundException",
                "InterruptedException"
            ),
            correctAnswer = "IOException",
            explanation = "IOException occurs during I/O failure.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_043",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which exception is thrown when resource is closed prematurely?",
            options = listOf(
                "IOException",
                "IllegalStateException",
                "RuntimeException",
                "NullPointerException"
            ),
            correctAnswer = "IllegalStateException",
            explanation = "Occurs when method is invoked at wrong time.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_044",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which block is best suited for resource cleanup?",
            options = listOf("try", "catch", "finally", "throw"),
            correctAnswer = "finally",
            explanation = "finally ensures resource cleanup.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_exception_handling_045",
            categoryId = categoryId,
            chapterId = JAVA_EXCEPTIONS,
            questionText = "Which approach improves exception handling design?",
            options = listOf(
                "Ignoring exceptions",
                "Catching generic Exception",
                "Using specific exceptions",
                "Using System.exit()"
            ),
            correctAnswer = "Using specific exceptions",
            explanation = "Specific exceptions improve clarity and debugging.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_collection_framework_001",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "What is the Java Collection Framework?",
            options = listOf(
                "A set of classes for file handling",
                "A framework for GUI design",
                "A unified architecture to store and manipulate groups of objects",
                "A JVM component"
            ),
            correctAnswer = "A unified architecture to store and manipulate groups of objects",
            explanation = "The Collection Framework provides standard ways to store and process objects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_002",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which interface is the root of the Collection Framework?",
            options = listOf("List", "Set", "Collection", "Iterable"),
            correctAnswer = "Collection",
            explanation = "Collection is the root interface of the Collection hierarchy.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_003",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection allows duplicate elements?",
            options = listOf("Set", "List", "Map", "Queue"),
            correctAnswer = "List",
            explanation = "List allows duplicate and ordered elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_004",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection does NOT allow duplicate elements?",
            options = listOf("ArrayList", "LinkedList", "Set", "Vector"),
            correctAnswer = "Set",
            explanation = "Set enforces uniqueness of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_005",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which interface stores data as key-value pairs?",
            options = listOf("List", "Set", "Map", "Queue"),
            correctAnswer = "Map",
            explanation = "Map stores elements in key-value form.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_006",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which class implements List interface?",
            options = listOf("HashSet", "TreeSet", "ArrayList", "HashMap"),
            correctAnswer = "ArrayList",
            explanation = "ArrayList is a resizable array implementation of List.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_007",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which class does not allow duplicate keys?",
            options = listOf("HashMap", "TreeMap", "Hashtable", "All of these"),
            correctAnswer = "All of these",
            explanation = "Map implementations do not allow duplicate keys.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_008",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection maintains insertion order?",
            options = listOf("HashSet", "TreeSet", "LinkedHashSet", "Set"),
            correctAnswer = "LinkedHashSet",
            explanation = "LinkedHashSet preserves insertion order.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_009",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is synchronized by default?",
            options = listOf("ArrayList", "Vector", "HashSet", "LinkedList"),
            correctAnswer = "Vector",
            explanation = "Vector methods are synchronized by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_010",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which Map implementation is synchronized?",
            options = listOf("HashMap", "TreeMap", "LinkedHashMap", "Hashtable"),
            correctAnswer = "Hashtable",
            explanation = "Hashtable is thread-safe and synchronized.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_011",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection allows null values?",
            options = listOf("Hashtable", "TreeMap", "HashMap", "ConcurrentHashMap"),
            correctAnswer = "HashMap",
            explanation = "HashMap allows one null key and multiple null values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_012",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is best for fast random access?",
            options = listOf("LinkedList", "ArrayList", "TreeSet", "Queue"),
            correctAnswer = "ArrayList",
            explanation = "ArrayList provides O(1) random access.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_013",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is best for frequent insertion and deletion?",
            options = listOf("ArrayList", "Vector", "LinkedList", "HashSet"),
            correctAnswer = "LinkedList",
            explanation = "LinkedList performs better for insert/delete operations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_014",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which interface supports FIFO order?",
            options = listOf("List", "Set", "Queue", "Map"),
            correctAnswer = "Queue",
            explanation = "Queue follows First-In-First-Out order.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_015",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which class implements Queue interface?",
            options = listOf("ArrayList", "PriorityQueue", "HashSet", "TreeMap"),
            correctAnswer = "PriorityQueue",
            explanation = "PriorityQueue is a Queue implementation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_016",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection sorts elements naturally?",
            options = listOf("HashSet", "LinkedHashSet", "TreeSet", "ArrayList"),
            correctAnswer = "TreeSet",
            explanation = "TreeSet stores elements in sorted order.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_017",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which Map sorts keys in natural order?",
            options = listOf("HashMap", "LinkedHashMap", "TreeMap", "Hashtable"),
            correctAnswer = "TreeMap",
            explanation = "TreeMap maintains keys in sorted order.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_018",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which iterator method removes element?",
            options = listOf("delete()", "remove()", "clear()", "pop()"),
            correctAnswer = "remove()",
            explanation = "Iterator remove() deletes current element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_019",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which cursor is legacy in Java?",
            options = listOf("Iterator", "ListIterator", "Enumeration", "Spliterator"),
            correctAnswer = "Enumeration",
            explanation = "Enumeration is a legacy cursor.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_020",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which interface allows bidirectional traversal?",
            options = listOf("Iterator", "Enumeration", "ListIterator", "Spliterator"),
            correctAnswer = "ListIterator",
            explanation = "ListIterator supports forward and backward traversal.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_021",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is thread-safe?",
            options = listOf("ArrayList", "HashMap", "Vector", "HashSet"),
            correctAnswer = "Vector",
            explanation = "Vector is synchronized and thread-safe.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_022",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which method removes all elements from a collection?",
            options = listOf("remove()", "delete()", "clear()", "flush()"),
            correctAnswer = "clear()",
            explanation = "clear() removes all elements from a collection.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_023",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection does not allow null elements?",
            options = listOf("HashSet", "TreeSet", "ArrayList", "LinkedList"),
            correctAnswer = "TreeSet",
            explanation = "TreeSet does not allow null elements.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_024",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection allows one null key?",
            options = listOf("Hashtable", "TreeMap", "HashMap", "ConcurrentHashMap"),
            correctAnswer = "HashMap",
            explanation = "HashMap allows one null key.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_025",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which data structure is used internally by HashMap?",
            options = listOf("Array", "LinkedList", "Array and LinkedList", "Tree"),
            correctAnswer = "Array and LinkedList",
            explanation = "HashMap uses array with linked list/tree for collision handling.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_026",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is best for uniqueness and fast search?",
            options = listOf("ArrayList", "LinkedList", "HashSet", "Vector"),
            correctAnswer = "HashSet",
            explanation = "HashSet offers fast lookup and uniqueness.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_027",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which interface is implemented by all collection classes?",
            options = listOf("Serializable", "Cloneable", "Iterable", "Comparable"),
            correctAnswer = "Iterable",
            explanation = "Iterable allows collections to be traversed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_028",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection supports priority-based ordering?",
            options = listOf("ArrayDeque", "LinkedList", "PriorityQueue", "HashSet"),
            correctAnswer = "PriorityQueue",
            explanation = "PriorityQueue orders elements by priority.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_029",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which method checks element existence?",
            options = listOf("exists()", "contains()", "has()", "find()"),
            correctAnswer = "contains()",
            explanation = "contains() checks if element exists.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_030",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection does not maintain order?",
            options = listOf("ArrayList", "LinkedHashSet", "HashSet", "LinkedList"),
            correctAnswer = "HashSet",
            explanation = "HashSet does not guarantee order.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_031",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which Map implementation is fastest generally?",
            options = listOf("Hashtable", "TreeMap", "HashMap", "LinkedHashMap"),
            correctAnswer = "HashMap",
            explanation = "HashMap offers fastest average performance.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_032",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection allows duplicate keys?",
            options = listOf("HashMap", "TreeMap", "LinkedHashMap", "None"),
            correctAnswer = "None",
            explanation = "Maps do not allow duplicate keys.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_033",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is legacy?",
            options = listOf("ArrayList", "Vector", "HashSet", "TreeSet"),
            correctAnswer = "Vector",
            explanation = "Vector is part of legacy classes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_034",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which interface does HashSet implement?",
            options = listOf("List", "Queue", "Set", "Map"),
            correctAnswer = "Set",
            explanation = "HashSet is an implementation of Set.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_035",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is best for stack operations?",
            options = listOf("Queue", "Deque", "Set", "Map"),
            correctAnswer = "Deque",
            explanation = "Deque supports stack and queue operations.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_036",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which class implements Deque?",
            options = listOf("PriorityQueue", "ArrayDeque", "LinkedHashSet", "TreeMap"),
            correctAnswer = "ArrayDeque",
            explanation = "ArrayDeque is a Deque implementation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_037",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which operation is fastest in HashSet?",
            options = listOf("Traversal", "Insertion", "Sorting", "Index access"),
            correctAnswer = "Insertion",
            explanation = "HashSet offers constant-time insertion on average.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_038",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection maintains key insertion order?",
            options = listOf("HashMap", "TreeMap", "LinkedHashMap", "Hashtable"),
            correctAnswer = "LinkedHashMap",
            explanation = "LinkedHashMap preserves insertion order.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_039",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which iterator is fail-fast?",
            options = listOf("Enumeration", "Iterator", "ListIterator", "All except Enumeration"),
            correctAnswer = "All except Enumeration",
            explanation = "Modern iterators are fail-fast.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_040",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection uses hashing?",
            options = listOf("TreeSet", "ArrayList", "HashSet", "LinkedList"),
            correctAnswer = "HashSet",
            explanation = "HashSet uses hashing for storage.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_041",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which interface does TreeSet use internally?",
            options = listOf("Comparator", "Comparable", "NavigableSet", "Map"),
            correctAnswer = "NavigableSet",
            explanation = "TreeSet implements NavigableSet.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_042",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which method gets size of collection?",
            options = listOf("length()", "count()", "size()", "getSize()"),
            correctAnswer = "size()",
            explanation = "size() returns number of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_043",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection is recommended over Vector?",
            options = listOf("ArrayList", "LinkedList", "HashSet", "TreeSet"),
            correctAnswer = "ArrayList",
            explanation = "ArrayList is preferred over Vector.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_044",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection framework principle improves performance?",
            options = listOf(
                "Using legacy classes",
                "Using correct collection type",
                "Using synchronized collections always",
                "Avoiding generics"
            ),
            correctAnswer = "Using correct collection type",
            explanation = "Choosing right collection improves performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collection_framework_045",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which feature makes collections type-safe?",
            options = listOf("Inheritance", "Polymorphism", "Generics", "Encapsulation"),
            correctAnswer = "Generics",
            explanation = "Generics provide compile-time type safety.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_multithreading_001",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "What is a thread in Java?",
            options = listOf(
                "A lightweight process",
                "A heavy process",
                "A method",
                "A class"
            ),
            correctAnswer = "A lightweight process",
            explanation = "A thread is a small unit of execution within a process.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_002",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which package contains thread classes?",
            options = listOf(
                "java.io",
                "java.util",
                "java.lang",
                "java.thread"
            ),
            correctAnswer = "java.lang",
            explanation = "Thread and Runnable belong to java.lang package.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_003",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which class is used to create a thread?",
            options = listOf(
                "Runnable",
                "Thread",
                "Executor",
                "Process"
            ),
            correctAnswer = "Thread",
            explanation = "Thread class is used directly to create threads.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_004",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which interface is used to create a thread?",
            options = listOf(
                "Callable",
                "Runnable",
                "Serializable",
                "Cloneable"
            ),
            correctAnswer = "Runnable",
            explanation = "Runnable provides a run() method for threads.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_005",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method starts a thread?",
            options = listOf(
                "run()",
                "start()",
                "execute()",
                "init()"
            ),
            correctAnswer = "start()",
            explanation = "start() creates a new thread and calls run().",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_006",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "What happens if run() is called directly?",
            options = listOf(
                "New thread starts",
                "Compile-time error",
                "Method executes like normal method",
                "Runtime exception"
            ),
            correctAnswer = "Method executes like normal method",
            explanation = "run() executes in the current thread.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_007",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method returns current executing thread?",
            options = listOf(
                "getThread()",
                "currentThread()",
                "thisThread()",
                "activeThread()"
            ),
            correctAnswer = "currentThread()",
            explanation = "Thread.currentThread() returns current thread.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_008",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread is created automatically when program starts?",
            options = listOf(
                "Child thread",
                "Main thread",
                "Daemon thread",
                "Worker thread"
            ),
            correctAnswer = "Main thread",
            explanation = "JVM starts the main thread automatically.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_009",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method pauses execution for specific time?",
            options = listOf(
                "wait()",
                "sleep()",
                "pause()",
                "delay()"
            ),
            correctAnswer = "sleep()",
            explanation = "sleep() pauses thread for given time.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_010",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which exception is thrown by sleep()?",
            options = listOf(
                "IOException",
                "InterruptedException",
                "RuntimeException",
                "ThreadException"
            ),
            correctAnswer = "InterruptedException",
            explanation = "sleep() throws InterruptedException.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_011",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method is used to give thread a name?",
            options = listOf(
                "rename()",
                "setName()",
                "getName()",
                "name()"
            ),
            correctAnswer = "setName()",
            explanation = "setName() assigns a name to thread.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_012",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method returns thread name?",
            options = listOf(
                "setName()",
                "threadName()",
                "getName()",
                "name()"
            ),
            correctAnswer = "getName()",
            explanation = "getName() returns the thread name.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_013",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread has highest priority?",
            options = listOf(
                "1",
                "5",
                "10",
                "0"
            ),
            correctAnswer = "10",
            explanation = "Thread priority ranges from 1 to 10.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_014",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Default priority of a thread is?",
            options = listOf(
                "1",
                "3",
                "5",
                "10"
            ),
            correctAnswer = "5",
            explanation = "Default thread priority is 5.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_015",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method sets thread priority?",
            options = listOf(
                "getPriority()",
                "setPriority()",
                "priority()",
                "changePriority()"
            ),
            correctAnswer = "setPriority()",
            explanation = "setPriority() assigns priority to thread.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_016",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method waits for thread to die?",
            options = listOf(
                "wait()",
                "sleep()",
                "join()",
                "stop()"
            ),
            correctAnswer = "join()",
            explanation = "join() waits for thread completion.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_017",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method stops a thread safely?",
            options = listOf(
                "stop()",
                "destroy()",
                "interrupt()",
                "exit()"
            ),
            correctAnswer = "interrupt()",
            explanation = "interrupt() signals thread to stop.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_018",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method is deprecated for stopping thread?",
            options = listOf(
                "interrupt()",
                "stop()",
                "join()",
                "sleep()"
            ),
            correctAnswer = "stop()",
            explanation = "stop() is deprecated due to safety issues.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_019",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread runs in background?",
            options = listOf(
                "User thread",
                "Main thread",
                "Daemon thread",
                "Worker thread"
            ),
            correctAnswer = "Daemon thread",
            explanation = "Daemon threads run in background.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_020",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method makes thread daemon?",
            options = listOf(
                "setDaemon(true)",
                "makeDaemon()",
                "daemon()",
                "setBackground()"
            ),
            correctAnswer = "setDaemon(true)",
            explanation = "setDaemon(true) marks thread as daemon.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_021",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which synchronization keyword prevents race condition?",
            options = listOf(
                "volatile",
                "final",
                "static",
                "synchronized"
            ),
            correctAnswer = "synchronized",
            explanation = "synchronized ensures mutual exclusion.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_022",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "What is race condition?",
            options = listOf(
                "Thread waiting problem",
                "Multiple threads accessing shared data incorrectly",
                "Deadlock",
                "Thread starvation"
            ),
            correctAnswer = "Multiple threads accessing shared data incorrectly",
            explanation = "Race condition occurs due to improper synchronization.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_023",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method is used for inter-thread communication?",
            options = listOf(
                "sleep()",
                "join()",
                "wait()",
                "interrupt()"
            ),
            correctAnswer = "wait()",
            explanation = "wait() is used for inter-thread communication.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_024",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method wakes waiting thread?",
            options = listOf(
                "resume()",
                "start()",
                "notify()",
                "interrupt()"
            ),
            correctAnswer = "notify()",
            explanation = "notify() wakes one waiting thread.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_025",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method wakes all waiting threads?",
            options = listOf(
                "notify()",
                "notifyAll()",
                "resume()",
                "interrupt()"
            ),
            correctAnswer = "notifyAll()",
            explanation = "notifyAll() wakes all waiting threads.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_026",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which keyword ensures variable visibility across threads?",
            options = listOf(
                "static",
                "final",
                "volatile",
                "synchronized"
            ),
            correctAnswer = "volatile",
            explanation = "volatile ensures visibility of variable changes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_027",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which state is thread after calling sleep()?",
            options = listOf(
                "Running",
                "Blocked",
                "Waiting",
                "Timed Waiting"
            ),
            correctAnswer = "Timed Waiting",
            explanation = "sleep() puts thread in timed waiting.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_028",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which state is thread after calling wait()?",
            options = listOf(
                "Blocked",
                "Waiting",
                "Runnable",
                "Dead"
            ),
            correctAnswer = "Waiting",
            explanation = "wait() puts thread in waiting state.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_029",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which problem occurs when threads wait forever?",
            options = listOf(
                "Race condition",
                "Starvation",
                "Deadlock",
                "Livelock"
            ),
            correctAnswer = "Deadlock",
            explanation = "Deadlock occurs when threads wait indefinitely.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_030",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread state indicates execution finished?",
            options = listOf(
                "Runnable",
                "Blocked",
                "Terminated",
                "Waiting"
            ),
            correctAnswer = "Terminated",
            explanation = "Thread enters terminated state after completion.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_031",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method checks if thread is alive?",
            options = listOf(
                "isRunning()",
                "isAlive()",
                "alive()",
                "checkAlive()"
            ),
            correctAnswer = "isAlive()",
            explanation = "isAlive() checks thread status.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_032",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which concurrency issue causes low priority thread to wait?",
            options = listOf(
                "Deadlock",
                "Starvation",
                "Race condition",
                "Livelock"
            ),
            correctAnswer = "Starvation",
            explanation = "Starvation occurs due to priority issues.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_033",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread scheduling is used by JVM?",
            options = listOf(
                "Round Robin",
                "Preemptive",
                "Time slicing",
                "Depends on OS"
            ),
            correctAnswer = "Depends on OS",
            explanation = "Thread scheduling depends on OS and JVM.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_034",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread state is ready to run?",
            options = listOf(
                "New",
                "Runnable",
                "Waiting",
                "Blocked"
            ),
            correctAnswer = "Runnable",
            explanation = "Runnable means ready or running.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_035",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which approach is better for thread creation?",
            options = listOf(
                "Extending Thread",
                "Implementing Runnable",
                "Using main thread",
                "Using static methods"
            ),
            correctAnswer = "Implementing Runnable",
            explanation = "Runnable supports multiple inheritance.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_036",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which class provides thread pool?",
            options = listOf(
                "Thread",
                "Runnable",
                "Executors",
                "ExecutorService"
            ),
            correctAnswer = "Executors",
            explanation = "Executors creates thread pools.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_037",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which package supports concurrency utilities?",
            options = listOf(
                "java.util",
                "java.lang",
                "java.util.concurrent",
                "java.thread"
            ),
            correctAnswer = "java.util.concurrent",
            explanation = "Concurrency utilities are in java.util.concurrent.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_038",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread pool creates fixed number of threads?",
            options = listOf(
                "newCachedThreadPool()",
                "newSingleThreadExecutor()",
                "newFixedThreadPool()",
                "newScheduledThreadPool()"
            ),
            correctAnswer = "newFixedThreadPool()",
            explanation = "Creates fixed size thread pool.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_039",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread pool creates threads as needed?",
            options = listOf(
                "newFixedThreadPool()",
                "newSingleThreadExecutor()",
                "newCachedThreadPool()",
                "newScheduledThreadPool()"
            ),
            correctAnswer = "newCachedThreadPool()",
            explanation = "Cached thread pool creates threads dynamically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_040",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which class represents task with return value?",
            options = listOf(
                "Runnable",
                "Callable",
                "Thread",
                "Executor"
            ),
            correctAnswer = "Callable",
            explanation = "Callable returns result and throws exception.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_041",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which method retrieves result from Callable?",
            options = listOf(
                "run()",
                "call()",
                "get()",
                "result()"
            ),
            correctAnswer = "get()",
            explanation = "Future.get() retrieves Callable result.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_042",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which interface represents future result?",
            options = listOf(
                "Callable",
                "Runnable",
                "Future",
                "Executor"
            ),
            correctAnswer = "Future",
            explanation = "Future holds result of asynchronous computation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_043",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which concurrency issue occurs when threads keep responding but no progress?",
            options = listOf(
                "Deadlock",
                "Starvation",
                "Livelock",
                "Race condition"
            ),
            correctAnswer = "Livelock",
            explanation = "Threads stay active but no progress is made.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_044",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which thread method releases lock?",
            options = listOf(
                "sleep()",
                "wait()",
                "join()",
                "interrupt()"
            ),
            correctAnswer = "wait()",
            explanation = "wait() releases object lock.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_multithreading_045",
            categoryId = categoryId,
            chapterId = JAVA_THREADS,
            questionText = "Which approach improves multithreading performance?",
            options = listOf(
                "Creating many threads",
                "Using thread pools",
                "Using sleep() frequently",
                "Using low priority threads"
            ),
            correctAnswer = "Using thread pools",
            explanation = "Thread pools reduce overhead and improve performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_file_handling_001",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which package contains file handling classes in Java?",
            options = listOf("java.io", "java.util", "java.file", "java.nio"),
            correctAnswer = "java.io",
            explanation = "Traditional file handling classes are in java.io package.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_002",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class represents a file or directory path?",
            options = listOf("FileReader", "FileWriter", "File", "Path"),
            correctAnswer = "File",
            explanation = "File class represents file or directory paths.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_003",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method checks whether a file exists?",
            options = listOf("isFile()", "check()", "exists()", "available()"),
            correctAnswer = "exists()",
            explanation = "exists() checks presence of file or directory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_004",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method creates a new empty file?",
            options = listOf("create()", "newFile()", "createNewFile()", "makeFile()"),
            correctAnswer = "createNewFile()",
            explanation = "createNewFile() creates an empty file.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_005",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class is used to read character files?",
            options = listOf("FileInputStream", "FileReader", "BufferedInputStream", "Scanner"),
            correctAnswer = "FileReader",
            explanation = "FileReader reads character-based files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_006",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class is used to write character files?",
            options = listOf("FileWriter", "FileOutputStream", "PrintStream", "BufferedReader"),
            correctAnswer = "FileWriter",
            explanation = "FileWriter writes character data to files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_007",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which stream is used for binary file reading?",
            options = listOf("FileReader", "BufferedReader", "FileInputStream", "Scanner"),
            correctAnswer = "FileInputStream",
            explanation = "FileInputStream reads binary data.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_008",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which stream is used for binary file writing?",
            options = listOf("FileWriter", "PrintWriter", "FileOutputStream", "BufferedWriter"),
            correctAnswer = "FileOutputStream",
            explanation = "FileOutputStream writes binary data.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_009",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class improves file reading performance?",
            options = listOf("FileReader", "BufferedReader", "Scanner", "InputStream"),
            correctAnswer = "BufferedReader",
            explanation = "BufferedReader reads data efficiently using buffer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_010",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method reads a full line of text?",
            options = listOf("read()", "readLine()", "next()", "scanLine()"),
            correctAnswer = "readLine()",
            explanation = "readLine() reads one full line.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_011",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class is best for formatted text output?",
            options = listOf("FileWriter", "BufferedWriter", "PrintWriter", "FileOutputStream"),
            correctAnswer = "PrintWriter",
            explanation = "PrintWriter supports formatted text output.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_012",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method closes a file stream?",
            options = listOf("stop()", "terminate()", "close()", "finish()"),
            correctAnswer = "close()",
            explanation = "close() releases file resources.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_013",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which interface enables object serialization?",
            options = listOf("Cloneable", "Serializable", "Runnable", "Closeable"),
            correctAnswer = "Serializable",
            explanation = "Serializable allows object to be saved to file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_014",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which stream writes objects to file?",
            options = listOf("FileWriter", "ObjectWriter", "ObjectOutputStream", "DataOutputStream"),
            correctAnswer = "ObjectOutputStream",
            explanation = "ObjectOutputStream writes objects to file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_015",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which stream reads objects from file?",
            options = listOf("ObjectInputStream", "ObjectReader", "FileInputStream", "DataInputStream"),
            correctAnswer = "ObjectInputStream",
            explanation = "ObjectInputStream reads serialized objects.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_016",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which keyword prevents a variable from being serialized?",
            options = listOf("static", "final", "transient", "volatile"),
            correctAnswer = "transient",
            explanation = "Transient variables are not serialized.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_017",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which exception occurs if file is missing?",
            options = listOf("IOException", "FileNotFoundException", "EOFException", "ClassNotFoundException"),
            correctAnswer = "FileNotFoundException",
            explanation = "Thrown when file path is invalid.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_018",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method deletes a file?",
            options = listOf("remove()", "delete()", "erase()", "clear()"),
            correctAnswer = "delete()",
            explanation = "delete() removes the file.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_019",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method checks write permission?",
            options = listOf("canWrite()", "isWritable()", "writeCheck()", "allowWrite()"),
            correctAnswer = "canWrite()",
            explanation = "canWrite() checks write permission.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_020",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method checks read permission?",
            options = listOf("canRead()", "isReadable()", "readCheck()", "allowRead()"),
            correctAnswer = "canRead()",
            explanation = "canRead() checks read permission.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_021",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method returns file size in bytes?",
            options = listOf("getSize()", "size()", "length()", "bytes()"),
            correctAnswer = "length()",
            explanation = "length() returns file size in bytes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_022",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class reads primitive data types?",
            options = listOf("ObjectInputStream", "DataInputStream", "BufferedReader", "Scanner"),
            correctAnswer = "DataInputStream",
            explanation = "DataInputStream reads primitive data.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_023",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class writes primitive data types?",
            options = listOf("ObjectOutputStream", "DataOutputStream", "FileWriter", "PrintWriter"),
            correctAnswer = "DataOutputStream",
            explanation = "DataOutputStream writes primitive data.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_024",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which exception occurs at end of file?",
            options = listOf("IOException", "EOFException", "FileNotFoundException", "RuntimeException"),
            correctAnswer = "EOFException",
            explanation = "EOFException indicates end of file.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_025",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class supports line-by-line reading efficiently?",
            options = listOf("Scanner", "BufferedReader", "FileInputStream", "ObjectInputStream"),
            correctAnswer = "BufferedReader",
            explanation = "BufferedReader is efficient for line reading.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_026",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which stream should be closed first?",
            options = listOf("Low-level stream", "High-level stream", "Both together", "No need to close"),
            correctAnswer = "High-level stream",
            explanation = "Closing high-level stream closes underlying streams.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_027",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which feature ensures automatic resource closing?",
            options = listOf("finally", "try-catch", "try-with-resources", "throws"),
            correctAnswer = "try-with-resources",
            explanation = "try-with-resources auto closes streams.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_028",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which interface is required for try-with-resources?",
            options = listOf("Serializable", "Closeable", "Cloneable", "Runnable"),
            correctAnswer = "Closeable",
            explanation = "Resources must implement Closeable.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_029",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which stream supports buffering for output?",
            options = listOf("FileWriter", "BufferedWriter", "PrintWriter", "ObjectOutputStream"),
            correctAnswer = "BufferedWriter",
            explanation = "BufferedWriter improves write performance.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_030",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method flushes buffered output?",
            options = listOf("clear()", "flush()", "sync()", "write()"),
            correctAnswer = "flush()",
            explanation = "flush() forces data to be written.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_031",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which file path is OS dependent?",
            options = listOf("Relative path", "Absolute path", "URL path", "Jar path"),
            correctAnswer = "Absolute path",
            explanation = "Absolute path differs across OS.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_032",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which path is portable?",
            options = listOf("Absolute path", "Relative path", "Drive path", "System path"),
            correctAnswer = "Relative path",
            explanation = "Relative paths are portable.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_033",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class lists files in directory?",
            options = listOf("File", "Directory", "Path", "Files"),
            correctAnswer = "File",
            explanation = "File class lists directory contents.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_034",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method creates a directory?",
            options = listOf("create()", "mkdir()", "newDir()", "makeDir()"),
            correctAnswer = "mkdir()",
            explanation = "mkdir() creates directory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_035",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method creates nested directories?",
            options = listOf("mkdir()", "mkdirs()", "createDir()", "makeDirs()"),
            correctAnswer = "mkdirs()",
            explanation = "mkdirs() creates parent directories too.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_036",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class is newer alternative to File?",
            options = listOf("Files", "Path", "Scanner", "Directory"),
            correctAnswer = "Path",
            explanation = "Path is part of newer NIO API.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_037",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which package introduced NIO file handling?",
            options = listOf("java.io", "java.util", "java.nio.file", "java.stream"),
            correctAnswer = "java.nio.file",
            explanation = "java.nio.file provides modern file handling.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_038",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which class provides static file utility methods?",
            options = listOf("File", "Files", "Path", "Streams"),
            correctAnswer = "Files",
            explanation = "Files provides static file operations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_039",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method reads all lines at once?",
            options = listOf("read()", "readLines()", "readAllLines()", "loadLines()"),
            correctAnswer = "readAllLines()",
            explanation = "readAllLines() reads entire file.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_040",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which exception is common in file handling?",
            options = listOf("SQLException", "IOException", "InterruptedException", "RuntimeException"),
            correctAnswer = "IOException",
            explanation = "IOException is common during file operations.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_041",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method checks if path is directory?",
            options = listOf("isFile()", "isDirectory()", "checkDir()", "hasDir()"),
            correctAnswer = "isDirectory()",
            explanation = "isDirectory() checks directory.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_042",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which file handling practice is safest?",
            options = listOf("Ignoring close()", "Using finally", "Using try-with-resources", "Manual GC"),
            correctAnswer = "Using try-with-resources",
            explanation = "Auto-closing prevents resource leaks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_043",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which method renames a file?",
            options = listOf("rename()", "renameTo()", "move()", "changeName()"),
            correctAnswer = "renameTo()",
            explanation = "renameTo() renames file.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_044",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which file handling API is faster?",
            options = listOf("java.io", "java.nio", "Both same", "Depends on OS"),
            correctAnswer = "java.nio",
            explanation = "NIO provides better performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_file_handling_045",
            categoryId = categoryId,
            chapterId = JAVA_FILES,
            questionText = "Which approach is recommended for modern Java file handling?",
            options = listOf("java.io only", "java.nio.file", "Manual streams", "Legacy APIs"),
            correctAnswer = "java.nio.file",
            explanation = "java.nio.file is modern and efficient.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        javaQuestion(
            id = "java_java_8_features_001",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which Java version introduced lambda expressions?",
            options = listOf("Java 6", "Java 7", "Java 8", "Java 9"),
            correctAnswer = "Java 8",
            explanation = "Lambda expressions were introduced in Java 8.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_002",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "What is a lambda expression?",
            options = listOf(
                "A class",
                "An anonymous function",
                "A package",
                "A thread"
            ),
            correctAnswer = "An anonymous function",
            explanation = "Lambda expressions represent anonymous functions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_003",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which interface is mandatory for lambda expression?",
            options = listOf(
                "Runnable",
                "Serializable",
                "Functional interface",
                "Cloneable"
            ),
            correctAnswer = "Functional interface",
            explanation = "Lambda expressions work with functional interfaces.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_004",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "How many abstract methods can a functional interface have?",
            options = listOf("Zero", "One", "Two", "Any number"),
            correctAnswer = "One",
            explanation = "Functional interface contains exactly one abstract method.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_005",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which annotation is used for functional interface?",
            options = listOf(
                "@Override",
                "@FunctionalInterface",
                "@Lambda",
                "@Interface"
            ),
            correctAnswer = "@FunctionalInterface",
            explanation = "This annotation enforces functional interface rules.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_006",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which feature allows method implementation inside interface?",
            options = listOf(
                "Abstract methods",
                "Static methods",
                "Default methods",
                "Private methods"
            ),
            correctAnswer = "Default methods",
            explanation = "Default methods allow implementation in interfaces.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_007",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which keyword is used with default methods?",
            options = listOf("static", "abstract", "default", "final"),
            correctAnswer = "default",
            explanation = "default keyword defines default methods.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_008",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which feature enables functional programming in Java?",
            options = listOf(
                "Streams",
                "Lambda expressions",
                "Optional",
                "Method references"
            ),
            correctAnswer = "Lambda expressions",
            explanation = "Lambdas enable functional programming style.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_009",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which interface represents a sequence of elements?",
            options = listOf("Iterator", "Collection", "Stream", "Iterable"),
            correctAnswer = "Stream",
            explanation = "Stream represents a sequence of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_010",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which method is used to create stream from collection?",
            options = listOf("stream()", "create()", "build()", "collect()"),
            correctAnswer = "stream()",
            explanation = "stream() converts collection to stream.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_011",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which stream operation transforms elements?",
            options = listOf("filter()", "map()", "forEach()", "collect()"),
            correctAnswer = "map()",
            explanation = "map() transforms each stream element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_012",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which stream operation filters elements?",
            options = listOf("map()", "filter()", "reduce()", "count()"),
            correctAnswer = "filter()",
            explanation = "filter() selects elements based on condition.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_013",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which operation terminates a stream?",
            options = listOf("map()", "filter()", "limit()", "forEach()"),
            correctAnswer = "forEach()",
            explanation = "forEach() is a terminal operation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_014",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which stream operation returns a single result?",
            options = listOf("map()", "filter()", "reduce()", "peek()"),
            correctAnswer = "reduce()",
            explanation = "reduce() combines elements into one result.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_015",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which class avoids NullPointerException?",
            options = listOf("Optional", "Objects", "Stream", "Collectors"),
            correctAnswer = "Optional",
            explanation = "Optional helps handle null values safely.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_016",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which method checks value presence in Optional?",
            options = listOf("get()", "isPresent()", "exists()", "hasValue()"),
            correctAnswer = "isPresent()",
            explanation = "isPresent() checks if value exists.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_017",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which method retrieves value from Optional?",
            options = listOf("value()", "fetch()", "get()", "read()"),
            correctAnswer = "get()",
            explanation = "get() retrieves value from Optional.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_018",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which feature allows referencing existing methods?",
            options = listOf(
                "Lambda expressions",
                "Method references",
                "Streams",
                "Optional"
            ),
            correctAnswer = "Method references",
            explanation = "Method references refer existing methods.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_019",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which symbol is used for lambda expression?",
            options = listOf("=>", "->", "::", "<>"),
            correctAnswer = "->",
            explanation = "-> separates parameters and body in lambda.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_020",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which symbol is used for method reference?",
            options = listOf("->", "::", "=>", "##"),
            correctAnswer = "::",
            explanation = ":: is method reference operator.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_021",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which interface is a built-in functional interface?",
            options = listOf("Runnable", "Comparator", "Callable", "All of these"),
            correctAnswer = "All of these",
            explanation = "All listed are functional interfaces.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_022",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which functional interface accepts input and returns output?",
            options = listOf("Consumer", "Supplier", "Function", "Predicate"),
            correctAnswer = "Function",
            explanation = "Function takes input and returns output.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_023",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which functional interface accepts input and returns boolean?",
            options = listOf("Predicate", "Function", "Supplier", "Consumer"),
            correctAnswer = "Predicate",
            explanation = "Predicate returns boolean result.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_024",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which functional interface does not take input?",
            options = listOf("Supplier", "Consumer", "Function", "Predicate"),
            correctAnswer = "Supplier",
            explanation = "Supplier provides value without input.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_025",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which functional interface consumes input without return?",
            options = listOf("Supplier", "Consumer", "Function", "Predicate"),
            correctAnswer = "Consumer",
            explanation = "Consumer accepts input but returns nothing.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_026",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which stream processes elements concurrently?",
            options = listOf("Sequential stream", "Parallel stream", "Buffered stream", "Async stream"),
            correctAnswer = "Parallel stream",
            explanation = "Parallel streams use multiple threads.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_027",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which method converts stream to list?",
            options = listOf("toList()", "collect()", "list()", "asList()"),
            correctAnswer = "collect()",
            explanation = "collect() gathers stream results.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_028",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which class provides collectors?",
            options = listOf("Collector", "Collection", "Collectors", "Stream"),
            correctAnswer = "Collectors",
            explanation = "Collectors provides utility methods.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_029",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which feature improves interface evolution?",
            options = listOf(
                "Abstract methods",
                "Default methods",
                "Static variables",
                "Final methods"
            ),
            correctAnswer = "Default methods",
            explanation = "Default methods avoid breaking implementations.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_030",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which API introduced new Date-Time classes?",
            options = listOf("java.util", "java.sql", "java.time", "java.calendar"),
            correctAnswer = "java.time",
            explanation = "java.time introduced modern date-time API.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_031",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which class represents date without time?",
            options = listOf("LocalDate", "LocalTime", "LocalDateTime", "Date"),
            correctAnswer = "LocalDate",
            explanation = "LocalDate stores date only.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_032",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which class represents time without date?",
            options = listOf("LocalDate", "LocalTime", "LocalDateTime", "Time"),
            correctAnswer = "LocalTime",
            explanation = "LocalTime stores time only.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_033",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which class represents date and time?",
            options = listOf("Date", "Calendar", "LocalDateTime", "ZonedTime"),
            correctAnswer = "LocalDateTime",
            explanation = "LocalDateTime stores date and time.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_034",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which class handles time zones?",
            options = listOf("Zone", "ZoneId", "ZonedTime", "TimeZone"),
            correctAnswer = "ZoneId",
            explanation = "ZoneId represents time zone identifier.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_035",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which feature supports lazy evaluation?",
            options = listOf("Collections", "Streams", "Arrays", "Optional"),
            correctAnswer = "Streams",
            explanation = "Streams evaluate elements lazily.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_036",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which operation does not modify original collection?",
            options = listOf("map()", "filter()", "remove()", "clear()"),
            correctAnswer = "filter()",
            explanation = "Stream operations do not modify source.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_037",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which feature improves code readability?",
            options = listOf(
                "Anonymous classes",
                "Lambda expressions",
                "Threads",
                "Reflection"
            ),
            correctAnswer = "Lambda expressions",
            explanation = "Lambdas reduce boilerplate code.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_038",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which stream method limits elements?",
            options = listOf("skip()", "limit()", "count()", "sorted()"),
            correctAnswer = "limit()",
            explanation = "limit() restricts number of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_039",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which stream method skips elements?",
            options = listOf("limit()", "skip()", "filter()", "drop()"),
            correctAnswer = "skip()",
            explanation = "skip() ignores initial elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_040",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which feature enables internal iteration?",
            options = listOf("Collections", "Streams", "Loops", "Iterators"),
            correctAnswer = "Streams",
            explanation = "Streams handle iteration internally.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_041",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which method sorts stream elements?",
            options = listOf("order()", "sort()", "sorted()", "arrange()"),
            correctAnswer = "sorted()",
            explanation = "sorted() arranges stream elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_042",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which stream method counts elements?",
            options = listOf("size()", "length()", "count()", "total()"),
            correctAnswer = "count()",
            explanation = "count() returns number of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_043",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which Java 8 feature supports immutability?",
            options = listOf(
                "Optional",
                "Streams",
                "Date-Time API",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "These APIs promote immutability.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_044",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which Java 8 feature reduces NullPointerException risk?",
            options = listOf("Streams", "Optional", "Collectors", "Lambda"),
            correctAnswer = "Optional",
            explanation = "Optional handles null values safely.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_java_8_features_045",
            categoryId = categoryId,
            chapterId = JAVA_8,
            questionText = "Which Java 8 feature improved API design most?",
            options = listOf(
                "Lambda expressions",
                "Streams",
                "Default methods",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All features significantly improved Java API.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        )


    )

}
