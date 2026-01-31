package com.example.quizapp.data.repository

import com.example.quizapp.data.model.User
import com.example.quizapp.util.Constants
import com.example.quizapp.util.PreferencesManager
import com.example.quizapp.util.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.userProfileChangeRequest
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
    private val prefsManager: PreferencesManager
) {

    suspend fun signUp(email: String, password: String, displayName: String): Resource<User> {
        return try {
            val authResult = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            val firebaseUser = authResult.user
                ?: return Resource.Error("Sign up failed: Firebase user is null")

            val profileUpdates = userProfileChangeRequest {
                this.displayName = displayName
            }
            firebaseUser.updateProfile(profileUpdates).await()

            val user = User(uid = firebaseUser.uid, email = email, displayName = displayName)
            Resource.Success(user)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred during sign up")
        }
    }

    suspend fun signIn(email: String, password: String): Resource<User> {
        return try {
            val authResult = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            val firebaseUser = authResult.user
                ?: return Resource.Error("Sign in failed: Firebase user is null")

            // Simple admin check based on the hardcoded admin email
            val isAdmin = (firebaseUser.email == Constants.ADMIN_EMAIL)

            val user = User(
                uid = firebaseUser.uid,
                email = firebaseUser.email ?: "",
                displayName = firebaseUser.displayName ?: "",
                isAdmin = isAdmin
            )

            // Save user session
            prefsManager.saveUserId(user.uid)
            prefsManager.saveUserEmail(user.email)
            prefsManager.setIsAdmin(user.isAdmin)
            prefsManager.setLoggedIn(true)

            Resource.Success(user)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred during sign in")
        }
    }

    suspend fun signInAdmin(email: String, password: String): Resource<User> {
        val result = signIn(email, password)
        if (result is Resource.Success && result.data?.isAdmin == true) {
            return result
        } else if (result is Resource.Success) {
            signOut()
            return Resource.Error("Access Denied: You are not an admin.")
        }
        return result
    }

    fun signOut() {
        firebaseAuth.signOut()
        prefsManager.clearAll()
    }

    fun isLoggedIn(): Boolean {
        return prefsManager.isLoggedIn() && firebaseAuth.currentUser != null
    }

    fun isAdmin(): Boolean {
        return prefsManager.isAdmin()
    }

    fun getCurrentUserId(): String? {
        return firebaseAuth.currentUser?.uid
    }
}