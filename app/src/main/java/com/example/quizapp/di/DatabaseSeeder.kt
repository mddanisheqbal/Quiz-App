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
        val isSeeded = prefs.getBoolean("database_seeded_v10", false)

        if (isSeeded) {
            Log.d("DatabaseSeeder", "Database already seeded. Skipping.")
            return
        }

        CoroutineScope(Dispatchers.IO).launch {
            try {
                Log.d("DatabaseSeeder", "Starting database seeding...")
                seedDatabase()
                prefs.edit().putBoolean("database_seeded_v10", true).apply()
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

        val categories = listOf(
            Category("c", "C"),
            Category("cpp", "C++"),
            Category("java", "Java"),
            Category("python", "Python"),
            Category("kotlin", "Kotlin"),
            Category("html", "HTML"),
            Category("css", "CSS"),
            Category("javascript", "JavaScript")
        )

        for (category in categories) {

            // 1️⃣ Save category
            firestore.collection("categories")
                .document(category.id)
                .set(category)
                .await()

            // 2️⃣ Create chapters (Topics)
            val chapters = getChapterNames(category.id).mapIndexed { index, name ->
                Topic(
                    id = "${category.id}_${slug(name)}",
                    name = name,
                    categoryId = category.id,
                    order = index + 1,
                    questionCount = 0
                )
            }

            chapters.forEach {
                firestore.collection("topics")
                    .document(it.id)
                    .set(it)
                    .await()
            }

            // 3️⃣ Load raw questions
            val rawQuestions = getQuestions(category.id, createdAt)
            if (rawQuestions.isEmpty()) continue

            // 4️⃣ Distribute questions evenly across chapters
            val distributed = distributeQuestions(rawQuestions, chapters)

            // 5️⃣ Save questions with FIXED chapterId
            var totalQuestions = 0

            distributed.forEach { (chapterId, questions) ->
                totalQuestions += questions.size

                if (questions.isNotEmpty()) {
                    questions.chunked(300).forEach { chunk ->
                        val batch = firestore.batch()
                        chunk.forEach { q ->
                            val fixed = q.copy(
                                categoryId = category.id,
                                chapterId = chapterId
                            )
                            batch.set(
                                firestore.collection("questions").document(fixed.id),
                                fixed
                            )
                        }
                        batch.commit().await()
                    }
                }

                // update chapter count
                firestore.collection("topics")
                    .document(chapterId)
                    .update("questionCount", questions.size)
                    .await()
            }

            // 6️⃣ Update category count
            firestore.collection("categories")
                .document(category.id)
                .update(
                    mapOf(
                        "topicCount" to chapters.size,
                        "questionCount" to totalQuestions
                    )
                )
                .await()
        }
    }

    // ---------------- HELPERS ----------------

    private fun distributeQuestions(
        questions: List<Question>,
        chapters: List<Topic>
    ): Map<String, List<Question>> {

        val map = mutableMapOf<String, MutableList<Question>>()
        chapters.forEach { map[it.id] = mutableListOf() }

        questions.forEachIndexed { index, q ->
            val chapter = chapters[index % chapters.size]
            map[chapter.id]!!.add(q)
        }

        return map
    }

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
