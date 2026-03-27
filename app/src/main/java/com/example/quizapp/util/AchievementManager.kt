package com.example.quizapp.util

import android.util.Log
import com.example.quizapp.data.allAchievements
import com.example.quizapp.data.model.Achievement
import com.example.quizapp.data.model.User
import com.example.quizapp.data.model.UserAchievement
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AchievementManager @Inject constructor() {

    private val _achievementEvent = MutableSharedFlow<Achievement>()
    val achievementEvent = _achievementEvent.asSharedFlow()

    suspend fun updateProgress(
        user: User,
        type: String,
        value: Int
    ): User {
        val updatedAchievements = user.achievements.toMutableList()
        var currentXp = user.totalXP
        var currentCoins = user.coins
        var userChanged = false

        allAchievements.filter { it.category == type }.forEach { achievement ->
            val existingIndex = updatedAchievements.indexOfFirst { it.id == achievement.id }
            val existing = if (existingIndex != -1) updatedAchievements[existingIndex] else null
            
            // Critical check: If already unlocked, skip entirely
            if (existing?.isUnlocked == true) return@forEach

            val currentProgress = existing?.progress ?: 0
            val newProgress = if (type == "streak" || type == "progress") value else currentProgress + value

            if (newProgress >= achievement.target) {
                // Only emit if it's the FIRST time we see this achievement completed
                // This prevents re-triggering on app restart if Firestore is slow to sync
                val wasAlreadyCompletedConceptually = currentProgress >= achievement.target
                
                // 🎉 Unlock
                val unlockedAchievement = UserAchievement(
                    id = achievement.id,
                    progress = achievement.target,
                    isUnlocked = true
                )
                
                if (existingIndex != -1) {
                    updatedAchievements[existingIndex] = unlockedAchievement
                } else {
                    updatedAchievements.add(unlockedAchievement)
                }
                
                // Add rewards ONLY if not previously earned
                if (!wasAlreadyCompletedConceptually) {
                    currentXp += achievement.xpReward
                    currentCoins += achievement.coinReward
                    userChanged = true
                    
                    Log.d("AchievementManager", "New Achievement Unlocked: ${achievement.title}")
                    _achievementEvent.emit(achievement)
                } else {
                    // Just ensuring the isUnlocked flag is true in the data
                    userChanged = true
                }
            } else if (newProgress > currentProgress) {
                // Update progress without unlocking
                val updated = UserAchievement(
                    id = achievement.id,
                    progress = newProgress,
                    isUnlocked = false
                )
                if (existingIndex != -1) {
                    updatedAchievements[existingIndex] = updated
                } else {
                    updatedAchievements.add(updated)
                }
                userChanged = true
            }
        }

        return if (userChanged) {
            user.copy(
                achievements = updatedAchievements,
                totalXP = currentXp,
                coins = currentCoins
            )
        } else {
            user
        }
    }
}
