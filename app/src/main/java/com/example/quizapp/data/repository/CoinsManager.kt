package com.example.quizapp.data.repository

import com.example.quizapp.data.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoinsManager @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth
) {
    private val userCollection = firestore.collection("users")

    suspend fun getCoins(): Int {
        val userId = auth.currentUser?.uid ?: return 0
        return try {
            val snapshot = userCollection.document(userId).get().await()
            val user = snapshot.toObject(User::class.java)
            user?.coins ?: 0
        } catch (e: Exception) {
            0
        }
    }

    suspend fun addCoins(amount: Int) {
        val userId = auth.currentUser?.uid ?: return
        try {
            userCollection.document(userId).update("coins", FieldValue.increment(amount.toLong())).await()
        } catch (e: Exception) {
            // Log error
        }
    }

    suspend fun spendCoins(amount: Int): Boolean {
        val userId = auth.currentUser?.uid ?: return false
        return try {
            val userRef = userCollection.document(userId)
            firestore.runTransaction { transaction ->
                val snapshot = transaction.get(userRef)
                val currentCoins = snapshot.getLong("coins") ?: 0L
                if (currentCoins >= amount) {
                    transaction.update(userRef, "coins", currentCoins - amount)
                    true
                } else {
                    false
                }
            }.await()
        } catch (e: Exception) {
            false
        }
    }
}
