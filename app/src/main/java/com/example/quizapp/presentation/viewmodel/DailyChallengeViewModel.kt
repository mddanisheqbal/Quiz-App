package com.example.quizapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.model.User
import com.example.quizapp.util.Challenge
import com.example.quizapp.util.DailyChallengeManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DailyChallengeViewModel @Inject constructor(
    val challengeManager: DailyChallengeManager,
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth
) : ViewModel() {

    private val _challenges = MutableStateFlow<List<Challenge>>(emptyList())
    val challenges: StateFlow<List<Challenge>> = _challenges.asStateFlow()

    val rewardEvent: SharedFlow<String> = challengeManager.rewardEvent

    init {
        loadChallenges()
    }

    fun loadChallenges() {
        _challenges.value = challengeManager.generateDailyChallenges()
    }

    fun completeChallenge(challenge: Challenge) {
        viewModelScope.launch {
            challengeManager.completeChallenge(challenge.id, challenge.xpReward, challenge.coinReward)
        }
    }
    
    fun checkAndResetChallenges(user: User) {
        viewModelScope.launch {
            challengeManager.checkAndResetChallenges(user)
        }
    }
}
