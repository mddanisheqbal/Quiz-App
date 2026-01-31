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
            Resource.Success(topics)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch topics from Firestore")
        }
    }

    suspend fun getQuestionsByTopic(topicId: String): Resource<List<Question>> {
        return try {
            val snapshot = questionsCollection.whereEqualTo("topicId", topicId).get().await()
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