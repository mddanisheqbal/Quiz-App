package com.example.quizapp.data.repository

import android.util.Patterns
import com.example.quizapp.data.model.User
import com.example.quizapp.util.Constants
import com.example.quizapp.util.PreferencesManager
import com.example.quizapp.util.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
    private val firestore: FirebaseFirestore,
    private val prefsManager: PreferencesManager
) {

    suspend fun signUp(email: String, password: String, displayName: String): Resource<User> {
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return Resource.Error("Please enter a valid email address.")
        }

        return try {
            val authResult =
                firebaseAuth.createUserWithEmailAndPassword(email, password).await()

            val firebaseUser = authResult.user
                ?: return Resource.Error("Sign up failed. Firebase user is null.")

            val profileUpdates = UserProfileChangeRequest.Builder()
                .setDisplayName(displayName)
                .build()

            firebaseUser.updateProfile(profileUpdates).await()

            val user = User(
                uid = firebaseUser.uid,
                email = email,
                displayName = displayName,
                createdAt = System.currentTimeMillis()
            )

            firestore.collection("users")
                .document(firebaseUser.uid)
                .set(user)
                .await()

            saveUserToPrefs(firebaseUser.uid, email, displayName, false)

            Resource.Success(user)

        } catch (e: FirebaseAuthUserCollisionException) {
            Resource.Error("This email is already registered. Please login instead.")
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Signup failed")
        }
    }

    suspend fun signIn(email: String, password: String): Resource<User> {
        return try {
            val authResult = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            val firebaseUser = authResult.user
                ?: return Resource.Error("Sign in failed: Firebase user is null")

            val isAdmin = (firebaseUser.email == Constants.ADMIN_EMAIL)

            val user = User(
                uid = firebaseUser.uid,
                email = firebaseUser.email ?: "",
                displayName = firebaseUser.displayName ?: "",
                isAdmin = isAdmin
            )

            saveUserToPrefs(user.uid, user.email, user.displayName, user.isAdmin)

            Resource.Success(user)
        } catch (e: FirebaseAuthInvalidUserException) {
            Resource.Error("No account found with this email.")
        } catch (e: FirebaseAuthInvalidCredentialsException) {
            Resource.Error("Invalid email or password.")
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred during sign in")
        }
    }

    suspend fun sendPasswordResetEmail(email: String): Resource<String> {
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return Resource.Error("Please enter a valid email address.")
        }

        return try {
            FirebaseAuth.getInstance()
                .sendPasswordResetEmail(email)
                .await()

            Resource.Success("Password reset link sent to your email.")
        } catch (e: FirebaseAuthInvalidUserException) {
            Resource.Error("This email is not registered. Please sign up first.")
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to send reset email.")
        }
    }

    private fun saveUserToPrefs(uid: String, email: String, displayName: String, isAdmin: Boolean) {
        prefsManager.saveUserId(uid)
        prefsManager.saveUserEmail(email)
        prefsManager.setIsAdmin(isAdmin)
        prefsManager.setLoggedIn(true)
    }

    suspend fun signInAdmin(email: String, password: String): Resource<User> {
        val result = signIn(email, password)
        if (result is Resource.Success<User> && result.data?.isAdmin == true) {
            return result
        } else if (result is Resource.Success<User>) {
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
        val firebaseUser = firebaseAuth.currentUser
        val isPrefsLoggedIn = prefsManager.isLoggedIn()
        
        if (firebaseUser != null && !isPrefsLoggedIn) {
            val isAdmin = (firebaseUser.email == Constants.ADMIN_EMAIL)
            saveUserToPrefs(
                firebaseUser.uid, 
                firebaseUser.email ?: "", 
                firebaseUser.displayName ?: "", 
                isAdmin
            )
            return true
        }
        
        return firebaseUser != null && isPrefsLoggedIn
    }

    fun isAdmin(): Boolean {
        return prefsManager.isAdmin() || (firebaseAuth.currentUser?.email == Constants.ADMIN_EMAIL)
    }

    fun getCurrentUserId(): String? {
        return firebaseAuth.currentUser?.uid ?: prefsManager.getUserId()
    }
}
