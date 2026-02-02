package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val JAVA_BASICS = "java_basics"
const val JAVA_OOP = "java_oop"
const val JAVA_COLLECTIONS = "java_collections"
const val JAVA_ADVANCED = "java_advanced"

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
    val basics = listOf(
        javaQuestion(
            id = "java_basics_001",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "What is the main purpose of the JVM?",
            options = listOf(
                "To compile Java code",
                "To run compiled Java bytecode",
                "To write Java code",
                "To debug Java code"
            ),
            correctAnswer = "To run compiled Java bytecode",
            explanation = "The JVM executes Java bytecode and enables platform independence.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_basics_002",
            categoryId = categoryId,
            chapterId = JAVA_BASICS,
            questionText = "Which keyword is used to declare a constant in Java?",
            options = listOf("const", "static", "final", "let"),
            correctAnswer = "final",
            explanation = "Final variables cannot be reassigned.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- JAVA OOP ---------- */
    val oop = listOf(
        javaQuestion(
            id = "java_oop_001",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "Which OOP concept wraps data and methods together?",
            options = listOf(
                "Inheritance",
                "Encapsulation",
                "Polymorphism",
                "Abstraction"
            ),
            correctAnswer = "Encapsulation",
            explanation = "Encapsulation hides internal data using access modifiers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_oop_002",
            categoryId = categoryId,
            chapterId = JAVA_OOP,
            questionText = "What is the base class of all Java classes?",
            options = listOf("Main", "Java", "Object", "Root"),
            correctAnswer = "Object",
            explanation = "java.lang.Object is the superclass of every Java class.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- JAVA COLLECTIONS ---------- */
    val collections = listOf(
        javaQuestion(
            id = "java_collections_001",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which collection does not allow duplicate elements?",
            options = listOf("List", "Set", "Queue", "Stack"),
            correctAnswer = "Set",
            explanation = "Set enforces uniqueness of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        javaQuestion(
            id = "java_collections_002",
            categoryId = categoryId,
            chapterId = JAVA_COLLECTIONS,
            questionText = "Which Map allows one null key?",
            options = listOf("Hashtable", "HashMap", "TreeMap", "ConcurrentHashMap"),
            correctAnswer = "HashMap",
            explanation = "HashMap allows one null key and multiple null values.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- JAVA ADVANCED ---------- */
    val advanced = listOf(
        javaQuestion(
            id = "java_advanced_001",
            categoryId = categoryId,
            chapterId = JAVA_ADVANCED,
            questionText = "Which Garbage Collector is default since Java 9?",
            options = listOf("Serial GC", "Parallel GC", "G1 GC", "ZGC"),
            correctAnswer = "G1 GC",
            explanation = "G1 GC balances latency and throughput.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        ),
        javaQuestion(
            id = "java_advanced_002",
            categoryId = categoryId,
            chapterId = JAVA_ADVANCED,
            questionText = "What is Type Erasure in Java Generics?",
            options = listOf(
                "Removing generics at runtime",
                "Runtime casting",
                "Deleting generic classes",
                "Replacing all types with Object manually"
            ),
            correctAnswer = "Removing generics at runtime",
            explanation = "Generic type information is removed at compile time for backward compatibility.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    return basics + oop + collections + advanced
}
