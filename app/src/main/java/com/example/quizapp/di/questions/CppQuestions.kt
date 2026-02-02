package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH DatabaseSeeder slug)
   =============================== */

const val CPP_BASICS = "cpp_basics_of_c"
const val CPP_DATA_TYPES = "cpp_data_types_variables"
const val CPP_CONTROL = "cpp_control_statements"
const val CPP_FUNCTIONS = "cpp_functions"
const val CPP_OOP = "cpp_oop_concepts"
const val CPP_CONSTRUCTORS = "cpp_constructors_destructors"
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

        // 1️⃣ BASICS
        cppQuestion(
            "cpp_basics_001",
            categoryId,
            CPP_BASICS,
            "Who developed C++?",
            listOf("Bjarne Stroustrup", "Dennis Ritchie", "James Gosling", "Guido van Rossum"),
            "Bjarne Stroustrup",
            "C++ was developed by Bjarne Stroustrup.",
            Difficulty.EASY,
            createdAt
        ),

        // 2️⃣ DATA TYPES
        cppQuestion(
            "cpp_datatype_001",
            categoryId,
            CPP_DATA_TYPES,
            "Which data type stores decimal values?",
            listOf("int", "float", "char", "bool"),
            "float",
            "float is used to store decimal values.",
            Difficulty.EASY,
            createdAt
        ),

        // 3️⃣ CONTROL STATEMENTS
        cppQuestion(
            "cpp_control_001",
            categoryId,
            CPP_CONTROL,
            "Which statement is used for decision making?",
            listOf("if", "cout", "cin", "return"),
            "if",
            "if statement controls conditional execution.",
            Difficulty.EASY,
            createdAt
        ),

        // 4️⃣ FUNCTIONS
        cppQuestion(
            "cpp_func_001",
            categoryId,
            CPP_FUNCTIONS,
            "What is a function?",
            listOf("Block of code", "Variable", "Loop", "Object"),
            "Block of code",
            "Functions perform specific tasks.",
            Difficulty.EASY,
            createdAt
        ),

        // 5️⃣ OOP
        cppQuestion(
            "cpp_oop_001",
            categoryId,
            CPP_OOP,
            "Which feature binds data and methods?",
            listOf("Encapsulation", "Inheritance", "Polymorphism", "Abstraction"),
            "Encapsulation",
            "Encapsulation bundles data and methods.",
            Difficulty.MEDIUM,
            createdAt
        ),

        // 6️⃣ CONSTRUCTORS
        cppQuestion(
            "cpp_ctor_001",
            categoryId,
            CPP_CONSTRUCTORS,
            "What is a constructor?",
            listOf("Special function", "Destructor", "Variable", "Loop"),
            "Special function",
            "Constructor initializes objects.",
            Difficulty.EASY,
            createdAt
        ),

        // 7️⃣ INHERITANCE
        cppQuestion(
            "cpp_inherit_001",
            categoryId,
            CPP_INHERITANCE,
            "Which symbol is used for inheritance?",
            listOf(":", "::", "->", "."),
            ":",
            ": is used to inherit a class.",
            Difficulty.MEDIUM,
            createdAt
        ),

        // 8️⃣ POLYMORPHISM
        cppQuestion(
            "cpp_poly_001",
            categoryId,
            CPP_POLYMORPHISM,
            "Polymorphism means?",
            listOf("Many forms", "One form", "Two classes", "Inheritance"),
            "Many forms",
            "Polymorphism allows many forms.",
            Difficulty.MEDIUM,
            createdAt
        ),

        // 9️⃣ TEMPLATES
        cppQuestion(
            "cpp_template_001",
            categoryId,
            CPP_TEMPLATES,
            "Templates are used for?",
            listOf("Generic programming", "Memory allocation", "I/O", "Inheritance"),
            "Generic programming",
            "Templates enable generic programming.",
            Difficulty.MEDIUM,
            createdAt
        ),

        // 🔟 STL
        cppQuestion(
            "cpp_stl_001",
            categoryId,
            CPP_STL,
            "Which STL container stores unique values?",
            listOf("set", "vector", "list", "deque"),
            "set",
            "set stores unique values.",
            Difficulty.MEDIUM,
            createdAt
        ),

        // 1️⃣1️⃣ EXCEPTION
        cppQuestion(
            "cpp_exception_001",
            categoryId,
            CPP_EXCEPTION,
            "Which keyword handles exceptions?",
            listOf("try", "catch", "throw", "All"),
            "All",
            "try, catch and throw are used.",
            Difficulty.MEDIUM,
            createdAt
        ),

        // 1️⃣2️⃣ FILE HANDLING
        cppQuestion(
            "cpp_file_001",
            categoryId,
            CPP_FILE,
            "Which header is used for file handling?",
            listOf("<fstream>", "<iostream>", "<file>", "<stream>"),
            "<fstream>",
            "fstream is used for file operations.",
            Difficulty.EASY,
            createdAt
        )
    )
}
