package com.example.quizapp.data.repository

import com.example.quizapp.data.local.QuizSessionDao
import com.example.quizapp.data.local.QuizSessionEntity
import com.example.quizapp.data.model.*
import com.example.quizapp.util.Resource
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizRepository @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val quizSessionDao: QuizSessionDao
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

    suspend fun getQuestions(chapterId: String): Resource<List<Question>> {
        return try {
            val snapshot = questionsCollection.whereEqualTo("chapterId", chapterId).get().await()
            val questions = snapshot.toObjects(Question::class.java)
            Resource.Success(questions)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch questions")
        }
    }

    suspend fun getRandomQuestions(limit: Int): Resource<List<Question>> {
        return try {
            // Firestore doesn't support native random, so we get all and shuffle or use a better approach.
            // For small/medium datasets, fetching a larger chunk and picking random is okay.
            val snapshot = questionsCollection.limit(100).get().await()
            val questions = snapshot.toObjects(Question::class.java).shuffled().take(limit)
            Resource.Success(questions)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch random questions")
        }
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

    suspend fun getUserProfile(userId: String): Resource<User> {
        return try {
            val doc = usersCollection.document(userId).get().await()
            if (doc.exists()) {
                Resource.Success(doc.toObject(User::class.java)!!)
            } else {
                Resource.Error("User profile not found")
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch user profile")
        }
    }

    /**
     * Fetch top users for leaderboard (All Time)
     */
    fun getLeaderboardFlow(): Flow<Resource<List<User>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = usersCollection
            .orderBy("totalXP", Query.Direction.DESCENDING)
            .limit(50)
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

    /**
     * Fetch top users for leaderboard (Monthly)
     */
    fun getMonthlyLeaderboardFlow(): Flow<Resource<List<User>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = usersCollection
            .orderBy("monthlyXP", Query.Direction.DESCENDING)
            .limit(50)
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

    suspend fun saveQuizResult(userId: String, result: QuizResult): Resource<Unit> {
        return try {
            val resultId = resultsCollection.document().id
            val finalResult = result.copy(id = resultId, userId = userId)
            resultsCollection.document(resultId).set(finalResult).await()
            
            // Also update user's totalXP and monthlyXP
            val userRef = usersCollection.document(userId)
            firestore.runTransaction { transaction ->
                val snapshot = transaction.get(userRef)
                val user = snapshot.toObject(User::class.java) ?: return@runTransaction
                
                transaction.update(userRef, mapOf(
                    "totalXP" to (user.totalXP + result.totalScore), // Assuming xpEarned is totalScore
                    "monthlyXP" to (user.monthlyXP + result.totalScore),
                    "quizzesCompleted" to (user.quizzesCompleted + 1),
                    "correctAnswers" to (user.correctAnswers + result.correctAnswers)
                ))
            }.await()

            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to save result")
        }
    }

    suspend fun getTopicProgress(userId: String): Resource<Map<String, Boolean>> {
        return try {
            val snapshot = usersCollection.document(userId).collection("progress").get().await()
            val progressMap = snapshot.documents.associate { doc ->
                doc.id to (doc.getBoolean("completed") ?: false)
            }
            Resource.Success(progressMap)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch topic progress")
        }
    }

    // FEATURE 2 — SAVE STARS IN FIRESTORE (New Method)
    suspend fun updateTopicProgressWithStars(
        userId: String,
        topicId: String,
        score: Int,
        stars: Int,
        totalQuestions: Int,
        percentage: Int
    ): Resource<Unit> {
        return try {
            val progressRef = usersCollection.document(userId).collection("progress").document(topicId)
            val doc = progressRef.get().await()
            
            val oldStars = doc.getLong("stars")?.toInt() ?: 0
            
            val data = mutableMapOf<String, Any>(
                "topicId" to topicId,
                "completed" to true,
                "score" to score,
                "totalQuestions" to totalQuestions,
                "percentage" to percentage,
                "completedAt" to System.currentTimeMillis()
            )
            
            // Only update stars if newStars > oldStars
            if (stars > oldStars) {
                data["stars"] = stars
            }

            progressRef.set(data, SetOptions.merge()).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to update topic progress")
        }
    }

    // New method to get progress with stars
    suspend fun getTopicProgressWithStars(userId: String): Resource<Map<String, Int>> {
        return try {
            val snapshot = usersCollection.document(userId).collection("progress").get().await()
            val progressMap = snapshot.documents.associate { doc ->
                doc.id to (doc.getLong("stars")?.toInt() ?: 0)
            }
            Resource.Success(progressMap)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch topic progress with stars")
        }
    }

    suspend fun updateTopicProgress(userId: String, topicId: String, score: Int): Resource<Unit> {
        return try {
            val data = mapOf(
                "topicId" to topicId,
                "completed" to true,
                "score" to score,
                "completedAt" to System.currentTimeMillis()
            )
            usersCollection.document(userId).collection("progress").document(topicId).set(data, SetOptions.merge()).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to update topic progress")
        }
    }

    suspend fun initializeTopicProgress(userId: String, topicId: String): Resource<Unit> {
        return try {
            val data = mapOf(
                "topicId" to topicId,
                "completed" to false,
                "score" to 0,
                "stars" to 0,
                "completedAt" to 0L
            )
            usersCollection.document(userId).collection("progress").document(topicId).set(data, SetOptions.merge()).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to initialize topic progress")
        }
    }

    suspend fun isQuizCompleted(userId: String, quizId: String): Boolean {
        return try {
            val doc = usersCollection.document(userId).collection("completedQuizzes").document(quizId).get().await()
            doc.exists()
        } catch (e: Exception) {
            false
        }
    }

    suspend fun markQuizAsCompleted(userId: String, quizId: String, xpAwarded: Int): Resource<Unit> {
        return try {
            val data = mapOf(
                "quizId" to quizId,
                "xpAwarded" to xpAwarded,
                "completedAt" to System.currentTimeMillis()
            )
            usersCollection.document(userId).collection("completedQuizzes").document(quizId).set(data).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to mark quiz as completed")
        }
    }

    suspend fun updateUserXP(userId: String, xp: Int): Resource<Unit> {
        return try {
            val currentMonth = Calendar.getInstance().get(Calendar.MONTH)
            val userRef = usersCollection.document(userId)
            val doc = userRef.get().await()
            val lastResetMonth = doc.getLong("lastResetMonth")?.toInt() ?: -1

            val updates = mutableMapOf<String, Any>(
                "totalXP" to xp,
                "monthlyXP" to FieldValue.increment((xp - (doc.getLong("totalXP")?.toInt() ?: 0)).toLong())
            )

            // Monthly reset check
            if (lastResetMonth != currentMonth) {
                updates["monthlyXP"] = xp - (doc.getLong("totalXP")?.toInt() ?: 0)
                updates["lastResetMonth"] = currentMonth
            }

            userRef.update(updates).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to update XP")
        }
    }

    suspend fun updateUserLevel(userId: String, level: Int): Resource<Unit> {
        return try {
            usersCollection.document(userId).update("level", level).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to update level")
        }
    }

    suspend fun rewardMonthlyTopUsers(): Resource<Unit> {
        return try {
            val snapshot = usersCollection.orderBy("monthlyXP", Query.Direction.DESCENDING).limit(3).get().await()
            snapshot.documents.forEachIndexed { index, doc ->
                val reward = when(index) {
                    0 -> 1000L
                    1 -> 500L
                    2 -> 250L
                    else -> 0L
                }
                if (reward > 0) {
                    doc.reference.update("coins", FieldValue.increment(reward)).await()
                }
            }
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to reward top users")
        }
    }

    // ========== SESSION MANAGEMENT ==========

    suspend fun saveLocalQuizSession(session: QuizSessionEntity) {
        quizSessionDao.saveSession(session)
    }

    suspend fun getLocalQuizSession(chapterId: String): QuizSessionEntity? {
        return quizSessionDao.getSession(chapterId)
    }

    suspend fun deleteLocalQuizSession(chapterId: String) {
        quizSessionDao.deleteSession(chapterId)
    }

    suspend fun saveQuizSession(
        userId: String,
        chapterId: String,
        categoryId: String,
        currentIndex: Int,
        answers: Map<String, String>,
        questionOrder: List<String>,
        totalQuestions: Int,
        startedAt: Long
    ): Resource<Unit> {
        // Save locally first
        saveLocalQuizSession(
            QuizSessionEntity(
                chapterId = chapterId,
                categoryId = categoryId,
                questionOrder = questionOrder,
                answers = answers,
                currentIndex = currentIndex,
                totalQuestions = totalQuestions,
                startedAt = startedAt
            )
        )

        // Then sync to Firestore (Backup only)
        return try {
            val data = mapOf(
                "chapterId" to chapterId,
                "categoryId" to categoryId,
                "questionOrder" to questionOrder,
                "currentIndex" to currentIndex,
                "answers" to answers,
                "totalQuestions" to totalQuestions,
                "startedAt" to startedAt,
                "lastUpdated" to System.currentTimeMillis()
            )
            usersCollection.document(userId).collection("quizSessions").document(chapterId).set(data).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            // Firestore sync fail is okay because we have local storage
            Resource.Error(e.message ?: "Failed to sync quiz session to cloud")
        }
    }

    suspend fun getQuizSession(userId: String, chapterId: String): Resource<QuizSessionEntity?> {
        // Try local first (Source of Truth)
        val localSession = getLocalQuizSession(chapterId)
        if (localSession != null) {
            return Resource.Success(localSession)
        }

        // Then Firestore as backup
        return try {
            val doc = usersCollection.document(userId).collection("quizSessions").document(chapterId).get().await()
            if (doc.exists()) {
                val data = doc.data
                if (data != null) {
                    val session = QuizSessionEntity(
                        chapterId = data["chapterId"] as? String ?: "",
                        categoryId = data["categoryId"] as? String ?: "",
                        questionOrder = data["questionOrder"] as? List<String> ?: emptyList(),
                        answers = data["answers"] as? Map<String, String> ?: emptyMap(),
                        currentIndex = (data["currentIndex"] as? Long)?.toInt() ?: 0,
                        totalQuestions = (data["totalQuestions"] as? Long)?.toInt() ?: 0,
                        startedAt = (data["startedAt"] as? Long) ?: System.currentTimeMillis()
                    )
                    // Restore to local if found on cloud
                    saveLocalQuizSession(session)
                    return Resource.Success(session)
                }
            }
            Resource.Success(null)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to fetch quiz session")
        }
    }

    suspend fun deleteQuizSession(userId: String, chapterId: String): Resource<Unit> {
        deleteLocalQuizSession(chapterId)
        return try {
            usersCollection.document(userId).collection("quizSessions").document(chapterId).delete().await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to delete quiz session")
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

    /**
     * Real-time achievements stream
     */
    fun getAchievementsFlow(userId: String): Flow<Resource<List<UserAchievement>>> = callbackFlow {
        trySend(Resource.Loading())
        val subscription = usersCollection.document(userId)
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Stream error"))
                    return@addSnapshotListener
                }
                if (snapshot != null && snapshot.exists()) {
                    val user = snapshot.toObject(User::class.java)
                    trySend(Resource.Success(user?.achievements ?: emptyList()))
                }
            }
        awaitClose { subscription.remove() }
    }

    suspend fun updateUserAchievements(userId: String, achievements: List<UserAchievement>): Resource<Unit> {
        return try {
            usersCollection.document(userId).update("achievements", achievements).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to update achievements")
        }
    }

    /**
     * Update user's last played progress for smart redirection
     */
    suspend fun updateUserLastProgress(
        userId: String,
        categoryId: String,
        categoryName: String,
        topicId: String,
        topicName: String,
        categoryColor: String
    ): Resource<Unit> {
        return try {
            val updates = mapOf(
                "lastCategoryId" to categoryId,
                "lastCategoryName" to categoryName,
                "lastTopicId" to topicId,
                "lastTopicName" to topicName,
                "lastCategoryColor" to categoryColor,
                "lastActiveDate" to System.currentTimeMillis()
            )
            usersCollection.document(userId).update(updates).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to update last progress")
        }
    }
}
