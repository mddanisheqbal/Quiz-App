package com.example.quizapp.util

import com.example.quizapp.data.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DailyChallengeManager @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth
) {

    suspend fun checkAndResetDailyChallenge(): Boolean {
        val userId = auth.currentUser?.uid ?: return false
        val userRef = firestore.collection("users").document(userId)

        return try {
            val snapshot = userRef.get().await()
            val user = snapshot.toObject(User::class.java) ?: return false

            val lastChallengeDate = user.dailyChallengeDate
            val currentTime = System.currentTimeMillis()

            val calendar = Calendar.getInstance()
            val today = calendar.apply { timeInMillis = currentTime }.get(Calendar.DAY_OF_YEAR)
            val thisYear = calendar.get(Calendar.YEAR)

            val lastCalendar = Calendar.getInstance().apply { timeInMillis = lastChallengeDate }
            val lastDay = lastCalendar.get(Calendar.DAY_OF_YEAR)
            val lastYear = lastCalendar.get(Calendar.YEAR)

            // If it's a new day, reset completion status
            if (lastYear != thisYear || lastDay != today) {
                userRef.update(
                    mapOf(
                        "dailyChallengeCompleted" to false,
                        "dailyChallengeDate" to currentTime
                    )
                ).await()
                return false
            }

            user.dailyChallengeCompleted
        } catch (e: Exception) {
            false
        }
    }

    suspend fun markChallengeAsCompleted() {
        val userId = auth.currentUser?.uid ?: return
        val userRef = firestore.collection("users").document(userId)

        try {
            userRef.update(
                mapOf(
                    "dailyChallengeCompleted" to true,
                    "dailyChallengeDate" to System.currentTimeMillis()
                )
            ).await()
        } catch (e: Exception) {
            // Log error
        }
    }
}
