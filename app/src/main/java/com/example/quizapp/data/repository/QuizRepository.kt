package com.example.quizapp.data.repository

import com.example.quizapp.data.model.*
import com.example.quizapp.util.Resource
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
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
    private val usersCollection = firestore.collection("users")

    /**
     * Real-time categories stream
     */
    fun getCategoriesFlow(): Flow<Resource<List<Category>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = categoriesCollection
            .orderBy("name")
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Stream error"))
                    return@addSnapshotListener
                }
                if (snapshot != null) {
                    val categories = snapshot.toObjects(Category::class.java)
                    trySend(Resource.Success(categories))
                }
            }
        awaitClose { subscription.remove() }
    }

    /**
     * Real-time topics stream
     */
    fun getTopicsFlow(categoryId: String): Flow<Resource<List<Topic>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = topicsCollection
            .whereEqualTo("categoryId", categoryId)
            .orderBy("order", Query.Direction.ASCENDING)
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Stream error"))
                    return@addSnapshotListener
                }
                if (snapshot != null) {
                    val topics = snapshot.toObjects(Topic::class.java)
                    trySend(Resource.Success(topics))
                }
            }
        awaitClose { subscription.remove() }
    }

    /**
     * Real-time questions stream for a chapter
     */
    fun getQuestionsByChapterFlow(chapterId: String): Flow<Resource<List<Question>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = questionsCollection
            .whereEqualTo("chapterId", chapterId)
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Stream error"))
                    return@addSnapshotListener
                }
                if (snapshot != null) {
                    val questions = snapshot.toObjects(Question::class.java)
                    trySend(Resource.Success(questions))
                }
            }
        awaitClose { subscription.remove() }
    }

    /**
     * Real-time stream for ALL questions
     */
    fun getAllQuestionsFlow(): Flow<Resource<List<Question>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = questionsCollection
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Stream error"))
                    return@addSnapshotListener
                }
                if (snapshot != null) {
                    val questions = snapshot.toObjects(Question::class.java)
                    trySend(Resource.Success(questions))
                }
            }
        awaitClose { subscription.remove() }
    }

    /**
     * Fetch user profile from Firestore
     */
    fun getUserProfileFlow(userId: String): Flow<Resource<User>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = usersCollection.document(userId)
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Stream error"))
                    return@addSnapshotListener
                }
                if (snapshot != null && snapshot.exists()) {
                    val user = snapshot.toObject(User::class.java)
                    if (user != null) {
                        trySend(Resource.Success(user))
                    }
                }
            }
        awaitClose { subscription.remove() }
    }

    /**
     * Fetch top users for leaderboard
     */
    fun getLeaderboardFlow(): Flow<Resource<List<User>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = usersCollection
            .orderBy("totalXP", Query.Direction.DESCENDING)
            .limit(20)
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Stream error"))
                    return@addSnapshotListener
                }
                if (snapshot != null) {
                    val users = snapshot.toObjects(User::class.java)
                    trySend(Resource.Success(users))
                }
            }
        awaitClose { subscription.remove() }
    }

    suspend fun getCategories(): Resource<List<Category>> {
        return try {
            val snapshot = categoriesCollection.orderBy("name").get().await()
            val categories = snapshot.toObjects(Category::class.java)
            Resource.Success(categories)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch categories")
        }
    }

    suspend fun getQuestionsByCategory(categoryId: String): Resource<List<Question>> {
        return try {
            val snapshot = questionsCollection.whereEqualTo("categoryId", categoryId).get().await()
            Resource.Success(snapshot.toObjects(Question::class.java))
        } catch (e: Exception) {
            Resource.Error("Failed to fetch questions")
        }
    }

    suspend fun saveQuizResult(result: QuizResult): Resource<Unit> {
        return try {
            resultsCollection.document(result.id).set(result).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to save result")
        }
    }

    suspend fun getQuizHistory(userId: String): Resource<List<QuizResult>> {
        return try {
            val snapshot = resultsCollection
                .whereEqualTo("userId", userId)
                .orderBy("completedAt", Query.Direction.DESCENDING)
                .get()
                .await()
            Resource.Success(snapshot.toObjects(QuizResult::class.java))
        } catch (e: Exception) {
            Resource.Error("Failed to fetch history")
        }
    }
}
