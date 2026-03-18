package com.example.quizapp.data.repository

import com.example.quizapp.data.model.UserPowerUps
import com.example.quizapp.util.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StoreRepository @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth
) {
    private val userId: String?
        get() = auth.currentUser?.uid

    fun getUserCoins(): Flow<Resource<Int>> = callbackFlow {
        val uid = userId ?: run {
            trySend(Resource.Error("User not logged in"))
            return@callbackFlow
        }
        val listener = firestore.collection("users").document(uid)
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Unknown error"))
                    return@addSnapshotListener
                }
                val coins = snapshot?.getLong("coins")?.toInt() ?: 0
                trySend(Resource.Success(coins))
            }
        awaitClose { listener.remove() }
    }

    fun getUserPowerUps(): Flow<Resource<UserPowerUps>> = callbackFlow {
        val uid = userId ?: run {
            trySend(Resource.Error("User not logged in"))
            return@callbackFlow
        }
        val listener = firestore.collection("users").document(uid)
            .collection("powerups").document("counts")
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    trySend(Resource.Error(error.message ?: "Unknown error"))
                    return@addSnapshotListener
                }
                val powerups = snapshot?.toObject(UserPowerUps::class.java) ?: UserPowerUps()
                trySend(Resource.Success(powerups))
            }
        awaitClose { listener.remove() }
    }

    suspend fun buyPowerUp(powerUpId: String, cost: Int): Resource<Unit> {
        val uid = userId ?: return Resource.Error("User not logged in")
        return try {
            firestore.runTransaction { transaction ->
                val userRef = firestore.collection("users").document(uid)
                val powerUpRef = userRef.collection("powerups").document("counts")
                
                val userSnapshot = transaction.get(userRef)
                val currentCoins = userSnapshot.getLong("coins") ?: 0
                
                if (currentCoins < cost) {
                    throw Exception("Not enough coins")
                }
                
                transaction.update(userRef, "coins", currentCoins - cost)
                
                val powerUpSnapshot = transaction.get(powerUpRef)
                if (!powerUpSnapshot.exists()) {
                    transaction.set(powerUpRef, mapOf(powerUpId to 1))
                } else {
                    transaction.update(powerUpRef, powerUpId, FieldValue.increment(1))
                }
            }.await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Transaction failed")
        }
    }

    suspend fun buyPremiumFeature(featureId: String, cost: Int, durationDays: Int): Resource<Unit> {
        val uid = userId ?: return Resource.Error("User not logged in")
        return try {
            firestore.runTransaction { transaction ->
                val userRef = firestore.collection("users").document(uid)
                val userSnapshot = transaction.get(userRef)
                val currentCoins = userSnapshot.getLong("coins") ?: 0
                
                if (currentCoins < cost) {
                    throw Exception("Not enough coins")
                }
                
                val adsDisabledUntil = userSnapshot.getLong("adsDisabledUntil") ?: 0L
                val startTime = if (adsDisabledUntil > System.currentTimeMillis()) adsDisabledUntil else System.currentTimeMillis()
                val newExpiry = startTime + (durationDays * 24 * 60 * 60 * 1000L)
                
                transaction.update(userRef, "coins", currentCoins - cost)
                transaction.update(userRef, "adsDisabledUntil", newExpiry)
            }.await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Transaction failed")
        }
    }

    suspend fun addCoins(amount: Int): Resource<Unit> {
        val uid = userId ?: return Resource.Error("User not logged in")
        return try {
            firestore.collection("users").document(uid)
                .update("coins", FieldValue.increment(amount.toLong()))
                .await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to add coins")
        }
    }

    suspend fun usePowerUp(powerUpId: String): Resource<Unit> {
        val uid = userId ?: return Resource.Error("User not logged in")
        return try {
            val powerUpRef = firestore.collection("users").document(uid)
                .collection("powerups").document("counts")
            
            firestore.runTransaction { transaction ->
                val snapshot = transaction.get(powerUpRef)
                val count = snapshot.getLong(powerUpId) ?: 0
                if (count <= 0) throw Exception("No power-ups left")
                transaction.update(powerUpRef, powerUpId, FieldValue.increment(-1))
            }.await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to use power-up")
        }
    }
}
