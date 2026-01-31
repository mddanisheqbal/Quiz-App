package com.example.quizapp.di

import android.content.Context
import android.util.Log
import com.example.quizapp.data.model.Category
import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.Topic
import com.example.quizapp.di.questions.getCppQuestions
import com.example.quizapp.di.questions.getCQuestions
import com.example.quizapp.di.questions.getCssQuestions
import com.example.quizapp.di.questions.getHtmlQuestions
import com.example.quizapp.di.questions.getJavaQuestions
import com.example.quizapp.di.questions.getJavaScriptQuestions
import com.example.quizapp.di.questions.getKotlinQuestions
import com.example.quizapp.di.questions.getPythonQuestions
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseSeeder @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val firestore = FirebaseFirestore.getInstance()

    fun seedDatabaseIfNeeded() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                Log.d("DatabaseSeeder", "FORCE MODE: Starting...")
                clearDatabase()
                seedDataSafe()
                Log.d("DatabaseSeeder", "FORCE MODE: Completed.")
            } catch (e: Exception) {
                Log.e("DatabaseSeeder", "Critical Error in Seeder", e)
            }
        }
    }

    private suspend fun clearDatabase() {
        val collections = listOf("questions", "topics", "categories")
        for (path in collections) {
            val snapshot = firestore.collection(path).get().await()
            snapshot.documents.chunked(400).forEach { chunk ->
                val batch = firestore.batch()
                chunk.forEach { batch.delete(it.reference) }
                batch.commit().await()
            }
        }
        Log.d("DatabaseSeeder", "Database Cleared.")
    }

    private suspend fun seedDataSafe() {
        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val createdAt = sdf.format(Date())
        val categories = getCategories()

        categories.forEach { category ->
            try {
                Log.d("DatabaseSeeder", "Starting Category: ${category.name}")

                val catRef = firestore.collection("categories").document(category.id)
                catRef.set(category).await()

                val topic = Topic(
                    id = "${category.id}_general",
                    name = "General ${category.name}",
                    categoryId = category.id,
                    order = 1
                )
                
                val questions = getQuestionsForCategory(category.id, topic.id, createdAt)

                Log.d("DatabaseSeeder", "${category.name} Questions Found: ${questions.size}")

                // Save single general topic
                val topicRef = firestore.collection("topics").document(topic.id)
                firestore.collection("topics").document(topic.id).set(topic.copy(questionCount = questions.size)).await()

                // Save Questions
                if (questions.isNotEmpty()) {
                    questions.chunked(300).forEach { chunk ->
                        val batch = firestore.batch()
                        chunk.forEach { q ->
                            batch.set(firestore.collection("questions").document(q.id), q)
                        }
                        batch.commit().await()
                    }
                }

                // Update Category Counts
                catRef.update(mapOf(
                    "topicCount" to 1,
                    "questionCount" to questions.size
                )).await()

                Log.d("DatabaseSeeder", "Completed Category: ${category.name}")

            } catch (e: Exception) {
                Log.e("DatabaseSeeder", "FAILED to seed ${category.name}. Skipping...", e)
            }
        }
    }

    private fun getCategories(): List<Category> = listOf(
        Category(id = "c", name = "C"), Category(id = "cpp", name = "C++"),
        Category(id = "css", name = "CSS"), Category(id = "html", name = "HTML"),
        Category(id = "java", name = "Java"), Category(id = "javascript", name = "JavaScript"),
        Category(id = "kotlin", name = "Kotlin"), Category(id = "python", name = "Python")
    )

    private fun getQuestionsForCategory(categoryId: String, topicId: String, createdAt: String): List<Question> {
        val questions = when (categoryId) {
            "c" -> getCQuestions(categoryId, createdAt)
            "cpp" -> getCppQuestions(categoryId, createdAt)
            "css" -> getCssQuestions(categoryId, createdAt)
            "html" -> getHtmlQuestions(categoryId, createdAt)
            "java" -> getJavaQuestions(categoryId, createdAt)
            "javascript" -> getJavaScriptQuestions(categoryId, createdAt)
            "kotlin" -> getKotlinQuestions(categoryId, createdAt)
            "python" -> getPythonQuestions(categoryId, createdAt)
            else -> emptyList()
        }
        
        return questions.map { it.copy(topicId = topicId) }
    }
}