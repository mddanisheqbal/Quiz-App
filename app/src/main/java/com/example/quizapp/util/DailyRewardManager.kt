package com.example.quizapp.util

import com.example.quizapp.data.model.User
import com.example.quizapp.data.repository.CoinsManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DailyRewardManager @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth,
    private val coinsManager: CoinsManager
) {

    fun getRewardForDay(day: Int): Int {
        return when (day) {
            1 -> 10
            2 -> 20
            3 -> 30
            4 -> 50
            5 -> 75
            6 -> 100
            7 -> 200
            else -> 10
        }
    }

    suspend fun checkAndClaimDailyReward(): Int? {
        val userId = auth.currentUser?.uid ?: return null
        val userRef = firestore.collection("users").document(userId)

        return try {
            val snapshot = userRef.get().await()
            val user = snapshot.toObject(User::class.java) ?: return null

            val lastRewardDate = user.lastRewardDate
            val currentTime = System.currentTimeMillis()

            if (isSameDay(lastRewardDate, currentTime)) {
                return null // Already claimed today
            }

            val nextDay = if (user.rewardDay >= 7 || !isConsecutiveDay(lastRewardDate, currentTime)) 1 else user.rewardDay + 1
            val rewardAmount = getRewardForDay(nextDay)

            // Update user in Firestore
            userRef.update(
                mapOf(
                    "lastRewardDate" to currentTime,
                    "rewardDay" to nextDay,
                    "coins" to com.google.firebase.firestore.FieldValue.increment(rewardAmount.toLong())
                )
            ).await()

            rewardAmount
        } catch (e: Exception) {
            null
        }
    }

    private fun isSameDay(time1: Long, time2: Long): Boolean {
        val cal1 = Calendar.getInstance().apply { timeInMillis = time1 }
        val cal2 = Calendar.getInstance().apply { timeInMillis = time2 }
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)
    }

    private fun isConsecutiveDay(lastTime: Long, currentTime: Long): Boolean {
        if (lastTime == 0L) return true
        val lastCal = Calendar.getInstance().apply { timeInMillis = lastTime }
        val currentCal = Calendar.getInstance().apply { timeInMillis = currentTime }
        
        lastCal.add(Calendar.DAY_OF_YEAR, 1)
        return lastCal.get(Calendar.YEAR) == currentCal.get(Calendar.YEAR) &&
                lastCal.get(Calendar.DAY_OF_YEAR) == currentCal.get(Calendar.DAY_OF_YEAR)
    }
}
