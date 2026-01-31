package com.example.quizapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.model.QuizResult
import com.example.quizapp.data.repository.QuizRepository
import com.example.quizapp.util.PreferencesManager
import com.example.quizapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HistoryViewModel @Inject constructor(
    private val quizRepository: QuizRepository,
    private val prefsManager: PreferencesManager
) : ViewModel() {

    private val _quizHistory = MutableStateFlow<Resource<List<QuizResult>>>(Resource.Loading())
    val quizHistory: StateFlow<Resource<List<QuizResult>>> = _quizHistory

    fun loadQuizHistory() {
        viewModelScope.launch {
            _quizHistory.value = Resource.Loading()

            val userId = prefsManager.getUserId()
            if (userId == null) {
                _quizHistory.value = Resource.Error("User not logged in")
                return@launch
            }

            val result = quizRepository.getQuizHistory(userId)
            _quizHistory.value = result
        }
    }

    fun refreshHistory() {
        loadQuizHistory()
    }
}