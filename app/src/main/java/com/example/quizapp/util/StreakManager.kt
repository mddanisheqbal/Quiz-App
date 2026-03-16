package com.example.quizapp.util

import com.example.quizapp.data.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StreakManager @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth
) {

    suspend fun updateDailyStreak(): Int {
        val userId = auth.currentUser?.uid ?: return 0
        val userRef = firestore.collection("users").document(userId)

        return try {
            val snapshot = userRef.get().await()
            val user = snapshot.toObject(User::class.java) ?: return 0

            val lastActiveDate = user.lastActiveDate
            val currentStreak = user.streakCount
            val currentTime = System.currentTimeMillis()

            val calendar = Calendar.getInstance()
            val today = calendar.apply { timeInMillis = currentTime }.get(Calendar.DAY_OF_YEAR)
            val thisYear = calendar.get(Calendar.YEAR)

            val lastCalendar = Calendar.getInstance().apply { timeInMillis = lastActiveDate }
            val lastActiveDay = lastCalendar.get(Calendar.DAY_OF_YEAR)
            val lastActiveYear = lastCalendar.get(Calendar.YEAR)

            val newStreak = when {
                // Case 1: Already active today
                lastActiveYear == thisYear && lastActiveDay == today -> currentStreak

                // Case 2: Active yesterday
                isYesterday(lastActiveDate) -> currentStreak + 1

                // Case 3: Missed a day or more
                else -> 1
            }

            // Update Firestore if streak changed or if it's a new day
            if (newStreak != currentStreak || (lastActiveYear != thisYear || lastActiveDay != today)) {
                userRef.update(
                    mapOf(
                        "streakCount" to newStreak,
                        "lastActiveDate" to currentTime
                    )
                ).await()
            }

            newStreak
        } catch (e: Exception) {
            0
        }
    }

    private fun isYesterday(lastActiveTime: Long): Boolean {
        if (lastActiveTime == 0L) return false
        
        val now = Calendar.getInstance()
        val lastActive = Calendar.getInstance().apply { timeInMillis = lastActiveTime }

        now.add(Calendar.DAY_OF_YEAR, -1)
        
        return now.get(Calendar.YEAR) == lastActive.get(Calendar.YEAR) &&
                now.get(Calendar.DAY_OF_YEAR) == lastActive.get(Calendar.DAY_OF_YEAR)
    }
}
