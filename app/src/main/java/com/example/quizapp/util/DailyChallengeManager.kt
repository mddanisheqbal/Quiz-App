package com.example.quizapp.util

import com.example.quizapp.data.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.tasks.await
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

data class Challenge(
    val id: String,
    val name: String,
    val description: String,
    val xpReward: Int,
    val coinReward: Int,
    val targetCategory: String? = null
)

@Singleton
class DailyChallengeManager @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth
) {

    private val _rewardEvent = MutableSharedFlow<String>()
    val rewardEvent: SharedFlow<String> = _rewardEvent.asSharedFlow()

    fun getTodayDate(): Long {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        calendar.set(Calendar.MILLISECOND, 0)
        return calendar.timeInMillis
    }

    fun generateDailyChallenges(): List<Challenge> {
        val calendar = Calendar.getInstance()
        val dayOfYear = calendar.get(Calendar.DAY_OF_YEAR)
        val seed = dayOfYear.toLong()
        val random = Random(seed)

        val categories = listOf("C", "C++", "Java", "Python", "JavaScript", "Kotlin")
        val randomCategory = categories[random.nextInt(categories.size)]

        return listOf(
            Challenge("daily", "Daily Challenge", "Answer 10 random questions", 25, 10),
            Challenge("speed", "Speed Challenge", "Complete quiz in 60 sec", 30, 15),
            Challenge("accuracy", "Accuracy Challenge", "Score 100% in any quiz", 40, 20),
            Challenge("category", "Category Challenge", "Complete a $randomCategory quiz", 20, 10, randomCategory)
        )
    }

    suspend fun checkAndResetChallenges(user: User): User {
        val today = getTodayDate()
        if (user.dailyChallengeDate != today) {
            val updatedUser = user.copy(
                completedChallenges = emptyList(),
                dailyChallengeDate = today
            )
            val userId = auth.currentUser?.uid ?: return updatedUser
            firestore.collection("users").document(userId).set(updatedUser).await()
            return updatedUser
        }
        return user
    }

    suspend fun completeChallenge(challengeId: String, xp: Int, coins: Int): Boolean {
        val userId = auth.currentUser?.uid ?: return false
        val userRef = firestore.collection("users").document(userId)

        var completed = false
        try {
            firestore.runTransaction { transaction ->
                val snapshot = transaction.get(userRef)
                val user = snapshot.toObject(User::class.java) ?: return@runTransaction

                if (!user.completedChallenges.contains(challengeId)) {
                    val newCompleted = user.completedChallenges + challengeId
                    transaction.update(userRef, mapOf(
                        "completedChallenges" to newCompleted,
                        "totalXP" to (user.totalXP + xp),
                        "coins" to (user.coins + coins)
                    ))
                    completed = true
                }
            }.await()
            
            if (completed) {
                _rewardEvent.emit("🎉 +$xp XP & +$coins Coins")
            }
        } catch (e: Exception) {
            return false
        }
        return completed
    }
}
