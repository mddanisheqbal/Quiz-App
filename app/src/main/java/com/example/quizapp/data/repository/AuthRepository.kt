package com.example.quizapp.data.repository

import android.util.Log
import android.util.Patterns
import com.example.quizapp.data.model.User
import com.example.quizapp.util.Constants
import com.example.quizapp.util.PreferencesManager
import com.example.quizapp.util.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.GoogleAuthProvider
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
            
            // Feature 2: Send Email Verification
            try {
                firebaseUser.sendEmailVerification().await()
                Log.d("AUTH_DEBUG", "Verification email sent to $email")
            } catch (e: Exception) {
                Log.e("AUTH_DEBUG", "Failed to send verification email", e)
            }

            val user = User(
                uid = firebaseUser.uid,
                email = email,
                username = displayName,
                createdAt = System.currentTimeMillis()
            )

            // ⭐ IMPORTANT: We DON'T create Firestore user document until email is verified
            // This prevents fake emails from having persistent data until they prove ownership

            Resource.Success(user)

        } catch (e: FirebaseAuthUserCollisionException) {
            Resource.Error("This email is already registered. Please login instead.")
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Signup failed")
        }
    }

    suspend fun signIn(email: String, password: String): Resource<User> {
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return Resource.Error("Please enter a valid email address.")
        }

        return try {
            val authResult = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            val firebaseUser = authResult.user
                ?: return Resource.Error("Sign in failed: Firebase user is null")

            // ⭐ BLOCK UNVERIFIED USERS
            if (!firebaseUser.isEmailVerified) {
                signOut()
                return Resource.Error("Please verify your email address. A verification link was sent to $email.")
            }

            val userDoc = firestore.collection("users").document(firebaseUser.uid).get().await()
            val user = if (userDoc.exists()) {
                userDoc.toObject(User::class.java)!!
            } else {
                // If user is verified but document doesn't exist (from signup), create it now
                val isAdmin = (firebaseUser.email == Constants.ADMIN_EMAIL)
                val newUser = User(
                    uid = firebaseUser.uid,
                    email = firebaseUser.email ?: email,
                    username = firebaseUser.displayName ?: "User",
                    isAdmin = isAdmin,
                    createdAt = System.currentTimeMillis()
                )
                firestore.collection("users").document(firebaseUser.uid).set(newUser).await()
                newUser
            }

            saveUserToPrefs(user)

            Resource.Success(user)
        } catch (e: FirebaseAuthInvalidUserException) {
            Resource.Error("No account found with this email.")
        } catch (e: FirebaseAuthInvalidCredentialsException) {
            Resource.Error("Invalid email or password.")
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred during sign in")
        }
    }

    suspend fun signInWithGoogle(idToken: String): Resource<User> {
        return try {
            val credential = GoogleAuthProvider.getCredential(idToken, null)
            val authResult = firebaseAuth.signInWithCredential(credential).await()
            val firebaseUser = authResult.user ?: return Resource.Error("Google sign in failed: Firebase user is null")

            val userDoc = firestore.collection("users").document(firebaseUser.uid).get().await()
            val user = if (userDoc.exists()) {
                val existingUser = userDoc.toObject(User::class.java)!!
                // Update profile picture if it changed or was missing
                if (existingUser.profilePictureUrl != firebaseUser.photoUrl?.toString()) {
                    val updatedUser = existingUser.copy(profilePictureUrl = firebaseUser.photoUrl?.toString())
                    firestore.collection("users").document(firebaseUser.uid).set(updatedUser).await()
                    updatedUser
                } else {
                    existingUser
                }
            } else {
                val newUser = User(
                    uid = firebaseUser.uid,
                    email = firebaseUser.email ?: "",
                    username = firebaseUser.displayName ?: "User",
                    profilePictureUrl = firebaseUser.photoUrl?.toString(),
                    coins = 0,
                    totalXP = 0,
                    level = 1,
                    streak = 0,
                    createdAt = System.currentTimeMillis()
                )
                firestore.collection("users").document(firebaseUser.uid).set(newUser).await()
                newUser
            }

            saveUserToPrefs(user)
            Resource.Success(user)
        } catch (e: Exception) {
            Log.e("GOOGLE_AUTH", "Error in signInWithGoogle", e)
            Resource.Error(e.message ?: "Google Sign-In failed")
        }
    }

    suspend fun resendVerificationEmail(): Resource<String> {
        return try {
            val user = firebaseAuth.currentUser
            if (user != null) {
                user.sendEmailVerification().await()
                Resource.Success("Verification email sent.")
            } else {
                Resource.Error("No user found. Please login first.")
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to resend verification email.")
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

    private fun saveUserToPrefs(user: User) {
        prefsManager.saveUserId(user.uid)
        prefsManager.saveUserEmail(user.email)
        prefsManager.setIsAdmin(user.isAdmin)
        prefsManager.setLoggedIn(true)
        prefsManager.setTotalXP(user.totalXP)
        prefsManager.setCurrentStreak(user.streak)
        prefsManager.setQuizCount(user.quizzesCompleted)
        prefsManager.setCorrectAnswersCount(user.correctAnswers)
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
        return firebaseUser != null && (firebaseUser.isEmailVerified || firebaseUser.providerData.any { it.providerId == "google.com" })
    }

    fun isAdmin(): Boolean {
        return (prefsManager.isAdmin() || (firebaseAuth.currentUser?.email == Constants.ADMIN_EMAIL))
    }

    fun getCurrentUserId(): String? {
        return firebaseAuth.currentUser?.uid ?: prefsManager.getUserId()
    }
}
