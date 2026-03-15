package com.example.quizapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.model.User
import com.example.quizapp.data.repository.AuthRepository
import com.example.quizapp.util.Resource
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

    fun signUp(email: String, password: String, displayName: String) {
        viewModelScope.launch {
            _authState.value = Resource.Loading()
            val result = authRepository.signUp(email, password, displayName)
            _authState.value = result

            if (result is Resource.Success<User>) {
                _isLoggedIn.value = true
            }
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

    fun signOut() {
        authRepository.signOut()
        _isLoggedIn.value = false
        _isAdmin.value = false
        _authState.value = null
    }

    fun resetAuthState() {
        _authState.value = null
    }

    fun resetPasswordState() {
        _resetPasswordState.value = null
    }
}
