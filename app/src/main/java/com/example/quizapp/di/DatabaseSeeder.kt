package com.example.quizapp.di

import android.content.Context
import android.util.Log
import com.example.quizapp.data.model.Category
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.Topic
import com.example.quizapp.di.questions.*
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseSeeder @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val firestore = FirebaseFirestore.getInstance()

    fun seedDatabaseIfNeeded() {
        val prefs = context.getSharedPreferences("quiz_prefs", Context.MODE_PRIVATE)

        // Incremented version to v38 to fix chapterId leakage and 90-question bug
        val isSeeded = prefs.getBoolean("database_seeded_v39", false)

        if (isSeeded) {
            Log.d("DatabaseSeeder", "Database already seeded (v39). Skipping.")
            return
        }

        CoroutineScope(Dispatchers.IO).launch {
            try {
                Log.d("DatabaseSeeder", "Starting database seeding (v39)...")
                seedDatabase()
                prefs.edit().putBoolean("database_seeded_v39", true).apply()
                Log.d("DatabaseSeeder", "Database seeding completed.")
            } catch (e: Exception) {
                Log.e("DatabaseSeeder", "Seeding failed", e)
            }
        }
    }

    private suspend fun seedDatabase() {
        val createdAt = SimpleDateFormat(
            "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
            Locale.getDefault()
        ).format(Date())

        val categoryList = listOf(
            Category("c", "C", colorHex = "#4CAF50", icon = "C"),
            Category("cpp", "C++", colorHex = "#2196F3", icon = "C++"),
            Category("java", "Java", colorHex = "#F44336", icon = "coffee"),
            Category("python", "Python", colorHex = "#9C27B0", icon = "snake"),
            Category("kotlin", "Kotlin", colorHex = "#7E57C2", icon = "K"),
            Category("html", "HTML", colorHex = "#FF9800", icon = "</>"),
            Category("css", "CSS", colorHex = "#3F51B5", icon = "#"),
            Category("javascript", "JavaScript", colorHex = "#FFEB3B", icon = "JS")
        )

        // 1️⃣ Prepare categories with counts beforehand
        val finalCategories = categoryList.map { cat ->
            val chapters = getChapterNames(cat.id)
            val questions = getQuestions(cat.id, createdAt)
            cat.copy(
                topicCount = chapters.size,
                questionCount = questions.size
            )
        }

        // 2️⃣ Batch upload ALL categories at once
        val categoryBatch = firestore.batch()
        finalCategories.forEach { category ->
            categoryBatch.set(
                firestore.collection("categories").document(category.id),
                category
            )
        }
        categoryBatch.commit().await()

        // 3️⃣ Now upload topics and questions category by category
        for (category in finalCategories) {

            // Create chapters (topics)
            val chapters = getChapterNames(category.id).mapIndexed { index, name ->
                Topic(
                    id = "${category.id}_${slug(name)}",
                    name = name,
                    categoryId = category.id,
                    order = index + 1,
                    questionCount = 0
                )
            }

            // Batch upload topics for this category
            val topicBatch = firestore.batch()
            chapters.forEach { topic ->
                topicBatch.set(firestore.collection("topics").document(topic.id), topic)
            }
            topicBatch.commit().await()

            // Load questions
            val questions = getQuestions(category.id, createdAt)
            if (questions.isEmpty()) continue

            // Save questions in chunks
            questions.chunked(300).forEach { chunk ->
                val qBatch = firestore.batch()
                chunk.forEach { q ->
                    qBatch.set(firestore.collection("questions").document(q.id), q)
                }
                qBatch.commit().await()
            }

            // Update topic question counts
            val chapterCounts = questions.groupBy { it.chapterId }
            for (topic in chapters) {
                val count = chapterCounts[topic.id]?.size ?: 0
                if (count > 0) {
                    firestore.collection("topics")
                        .document(topic.id)
                        .update("questionCount", count)
                        .await()
                }
            }
        }
    }

    // ---------------- HELPERS ----------------

    private fun slug(text: String): String =
        text.lowercase()
            .replace("&", "and")
            .replace("[^a-z0-9]+".toRegex(), "_")
            .trim('_')

    private fun getQuestions(languageId: String, createdAt: String): List<Question> =
        when (languageId) {
            "c" -> getCQuestions(languageId, createdAt)
            "cpp" -> getCppQuestions(languageId, createdAt)
            "java" -> getJavaQuestions(languageId, createdAt)
            "python" -> getPythonQuestions(languageId, createdAt)
            "kotlin" -> getKotlinQuestions(languageId, createdAt)
            "html" -> getHtmlQuestions(languageId, createdAt)
            "css" -> getCssQuestions(languageId, createdAt)
            "javascript" -> getJavaScriptQuestions(languageId, createdAt)
            else -> emptyList()
        }

    private fun getChapterNames(languageId: String): List<String> =
        when (languageId) {
            "c" -> listOf(
                "Basics of C", "Data Types & Variables", "Operators & Expressions",
                "Conditional Statements", "Loops", "Arrays", "Strings", "Functions",
                "Pointers", "Structures & Unions", "File Handling", "Dynamic Memory Allocation"
            )
            "cpp" -> listOf(
                "Basics of C++", "Data Types & Variables", "Control Statements",
                "Functions", "OOP Concepts", "Constructors & Destructors",
                "Inheritance", "Polymorphism", "Templates", "STL",
                "Exception Handling", "File Handling"
            )
            "java" -> listOf(
                "Java Basics", "JVM & JDK", "Data Types & Variables",
                "Control Statements", "OOP Concepts",
                "Inheritance & Polymorphism", "Interfaces & Abstract Classes",
                "Exception Handling", "Collections Framework",
                "Multithreading", "File Handling", "Java 8 Features"
            )
            "python" -> listOf(
                "Python Basics", "Variables & Data Types", "Operators",
                "Conditional Statements", "Loops", "Lists & Tuples",
                "Sets & Dictionaries", "Functions",
                "Modules & Packages", "File Handling",
                "Exception Handling", "OOP in Python"
            )
            "kotlin" -> listOf(
                "Kotlin Basics", "Variables & Data Types", "Control Flow",
                "Functions", "Null Safety", "Classes & Objects",
                "Inheritance", "Data Classes", "Collections",
                "Lambdas", "Coroutines", "Android Basics"
            )
            "html" -> listOf(
                "Introduction to HTML", "HTML Structure", "Text Formatting",
                "Links & Images", "Lists", "Tables", "Forms",
                "Semantic HTML", "Multimedia", "HTML5 Features"
            )
            "css" -> listOf(
                "Introduction to CSS", "CSS Selectors", "Colors & Backgrounds",
                "Box Model", "Text & Fonts", "Display & Position",
                "Flexbox", "Grid", "Responsive Design", "Animations & Transitions"
            )
            "javascript" -> listOf(
                "JavaScript Basics", "Variables & Data Types", "Operators",
                "Conditional Statements", "Loops", "Functions",
                "Arrays & Objects", "DOM Manipulation", "Events",
                "ES6 Features", "Async JavaScript", "Error Handling"
            )
            else -> emptyList()
        }
}
