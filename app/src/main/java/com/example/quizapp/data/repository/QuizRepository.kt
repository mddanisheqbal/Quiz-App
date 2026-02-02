package com.example.quizapp.data.repository

import com.example.quizapp.data.model.Category
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuizResult
import com.example.quizapp.data.model.Topic
import com.example.quizapp.util.Resource
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizRepository @Inject constructor(
    private val firestore: FirebaseFirestore
) {

    private val categoriesCollection = firestore.collection("categories")
    private val topicsCollection = firestore.collection("topics")
    private val questionsCollection = firestore.collection("questions")
    private val resultsCollection = firestore.collection("results")

    suspend fun getCategories(): Resource<List<Category>> {
        return try {
            val snapshot = categoriesCollection.orderBy("name").get().await()
            val categories = snapshot.toObjects(Category::class.java)
            Resource.Success(categories)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch categories from Firestore")
        }
    }

    suspend fun getTopicsByCategory(categoryId: String): Resource<List<Topic>> {
        return try {
            val snapshot = topicsCollection
                .whereEqualTo("categoryId", categoryId)
                .orderBy("order", Query.Direction.ASCENDING)
                .get()
                .await()
            val topics = snapshot.toObjects(Topic::class.java)
            
            if (topics.isEmpty()) {
                return Resource.Success(getHardcodedTopics(categoryId))
            }
            
            Resource.Success(topics)
        } catch (e: Exception) {
            Resource.Success(getHardcodedTopics(categoryId))
        }
    }

    private fun getHardcodedTopics(categoryId: String): List<Topic> {
        val names = when (categoryId.lowercase()) {
            "c", "c_lang" -> listOf(
                "Basics of C", "Data Types & Variables", "Operators & Expressions",
                "Conditional Statements", "Loops", "Arrays", "Strings", "Functions",
                "Pointers", "Structures & Unions", "File Handling", "Dynamic Memory Allocation"
            )
            "cpp", "cpp_lang", "c++" -> listOf(
                "Basics of C++", "Data Types & Variables", "Control Statements", "Functions",
                "OOP Concepts", "Constructors & Destructors", "Inheritance", "Polymorphism",
                "Templates", "STL", "Exception Handling", "File Handling"
            )
            "java", "java_lang" -> listOf(
                "Java Basics", "JVM & JDK", "Data Types & Variables", "Control Statements",
                "OOP Concepts", "Inheritance & Polymorphism", "Interfaces & Abstract Classes",
                "Exception Handling", "Collections Framework", "Multithreading", "File Handling", "Java 8 Features"
            )
            "python", "python_lang" -> listOf(
                "Python Basics", "Variables & Data Types", "Operators", "Conditional Statements",
                "Loops", "Lists & Tuples", "Sets & Dictionaries", "Functions",
                "Modules & Packages", "File Handling", "Exception Handling", "OOP in Python"
            )
            "kotlin", "kotlin_lang" -> listOf(
                "Kotlin Basics", "Variables & Data Types", "Control Flow", "Functions",
                "Null Safety", "Classes & Objects", "Inheritance", "Data Classes",
                "Collections", "Lambdas", "Coroutines", "Android Basics"
            )
            "html", "html_lang" -> listOf(
                "Introduction to HTML", "HTML Structure", "Text Formatting", "Links & Images",
                "Lists", "Tables", "Forms", "Semantic HTML", "Multimedia", "HTML5 Features"
            )
            "css", "css_lang" -> listOf(
                "Introduction to CSS", "CSS Selectors", "Colors & Backgrounds", "Box Model",
                "Text & Fonts", "Display & Position", "Flexbox", "Grid", "Responsive Design", "Animations & Transitions"
            )
            "javascript", "js_lang", "js" -> listOf(
                "JavaScript Basics", "Variables & Data Types", "Operators", "Conditional Statements",
                "Loops", "Functions", "Arrays & Objects", "DOM Manipulation", "Events",
                "ES6 Features", "Async JavaScript", "Error Handling"
            )
            else -> emptyList()
        }

        return names.mapIndexed { index, name ->
            Topic(
                id = "${categoryId.lowercase()}_${name.lowercase().replace(" ", "_").replace("&", "and")}",
                name = name,
                categoryId = categoryId,
                order = index + 1
            )
        }
    }

    suspend fun getQuestionsByChapter(chapterId: String): Resource<List<Question>> {
        return try {
            val snapshot = questionsCollection
                .whereEqualTo("chapterId", chapterId) // Hardened query
                .get()
                .await()

            val questions = snapshot.toObjects(Question::class.java)
            Resource.Success(questions)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch questions from Firestore")
        }
    }

    suspend fun getQuestionsByCategory(categoryId: String): Resource<List<Question>> {
        return try {
            val snapshot = questionsCollection.whereEqualTo("categoryId", categoryId).get().await()
            val questions = snapshot.toObjects(Question::class.java)
            Resource.Success(questions)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch questions from Firestore")
        }
    }

    suspend fun saveQuizResult(result: QuizResult): Resource<Unit> {
        return try {
            resultsCollection.document(result.id).set(result).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to save quiz result to Firestore")
        }
    }

    suspend fun getQuizHistory(userId: String): Resource<List<QuizResult>> {
        return try {
            val snapshot = resultsCollection
                .whereEqualTo("userId", userId)
                .orderBy("completedAt", Query.Direction.DESCENDING)
                .get()
                .await()

            val history = snapshot.toObjects(QuizResult::class.java)
            Resource.Success(history)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch quiz history from Firestore")
        }
    }
}