package com.example.quizapp.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.R
import com.example.quizapp.data.model.User
import com.example.quizapp.data.repository.AuthRepository
import com.example.quizapp.util.Resource
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.Identity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _authState = MutableStateFlow<Resource<User>?>(null)
    val authState: StateFlow<Resource<User>?> = _authState

    private val _isLoggedIn = MutableStateFlow(authRepository.isLoggedIn())
    val isLoggedIn: StateFlow<Boolean> = _isLoggedIn

    private val _isAdmin = MutableStateFlow(authRepository.isAdmin())
    val isAdmin: StateFlow<Boolean> = _isAdmin

    private val _resetPasswordState = MutableStateFlow<Resource<String>?>(null)
    val resetPasswordState: StateFlow<Resource<String>?> = _resetPasswordState

    private val _verificationState = MutableStateFlow<Resource<String>?>(null)
    val verificationState: StateFlow<Resource<String>?> = _verificationState

    fun signUp(email: String, password: String, displayName: String) {
        viewModelScope.launch {
            _authState.value = Resource.Loading()
            val result = authRepository.signUp(email, password, displayName)
            _authState.value = result
        }
    }

    fun signIn(email: String, password: String) {
        viewModelScope.launch {
            _authState.value = Resource.Loading()
            val result = authRepository.signIn(email, password)
            _authState.value = result

            if (result is Resource.Success<User>) {
                _isLoggedIn.value = true
                _isAdmin.value = result.data?.isAdmin ?: false
            }
        }
    }

    fun signInWithGoogle(idToken: String) {
        viewModelScope.launch {
            Log.d("GOOGLE_LOGIN", "Started Firebase Auth with ID Token")
            _authState.value = Resource.Loading()
            val result = authRepository.signInWithGoogle(idToken)
            _authState.value = result

            if (result is Resource.Success<User>) {
                Log.d("GOOGLE_LOGIN", "Success: User logged in")
                _isLoggedIn.value = true
                _isAdmin.value = result.data?.isAdmin ?: false
            } else if (result is Resource.Error) {
                Log.e("GOOGLE_LOGIN", "Failed: ${result.message}")
            }
        }
    }

    fun getGoogleSignInClient(context: Context): GoogleSignInClient {
        val options = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(context.getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        return GoogleSignIn.getClient(context, options)
    }

    // ⭐ One Tap Config to show all accounts and prevent auto-login
    fun getOneTapSignInRequest(context: Context): BeginSignInRequest {
        return BeginSignInRequest.builder()
            .setGoogleIdTokenRequestOptions(
                BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                    .setSupported(true)
                    .setServerClientId(context.getString(R.string.default_web_client_id))
                    .setFilterByAuthorizedAccounts(false) // Show all accounts, not just authorized ones
                    .build()
            )
            .setAutoSelectEnabled(false) // Prevent auto-selection of a single account
            .build()
    }

    fun resendVerificationEmail() {
        viewModelScope.launch {
            _verificationState.value = Resource.Loading()
            val result = authRepository.resendVerificationEmail()
            _verificationState.value = result
        }
    }

    fun sendPasswordResetEmail(email: String) {
        viewModelScope.launch {
            _resetPasswordState.value = Resource.Loading()
            val result = authRepository.sendPasswordResetEmail(email)
            _resetPasswordState.value = result
        }
    }

    fun signInAdmin(email: String, password: String) {
        viewModelScope.launch {
            _authState.value = Resource.Loading()
            val result = authRepository.signInAdmin(email, password)
            _authState.value = result

            if (result is Resource.Success<User>) {
                _isLoggedIn.value = true
                _isAdmin.value = true
            }
        }
    }

    fun signOut(context: Context) {
        viewModelScope.launch {
            try {
                // Sign out from both traditional and One Tap clients
                getGoogleSignInClient(context).signOut()
                Identity.getSignInClient(context).signOut()
            } catch (e: Exception) {
                Log.e("AUTH", "Error signing out from Google", e)
            }
            authRepository.signOut()
            _isLoggedIn.value = false
            _isAdmin.value = false
            _authState.value = null
        }
    }

    fun resetAuthState() {
        _authState.value = null
    }

    fun resetPasswordState() {
        _resetPasswordState.value = null
    }

    fun resetVerificationState() {
        _verificationState.value = null
    }
}
