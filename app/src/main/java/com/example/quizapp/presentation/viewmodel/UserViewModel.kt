package com.example.quizapp.presentation.viewmodel

import android.app.Activity
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizapp.data.model.User
import com.example.quizapp.util.NetworkUtils
import com.example.quizapp.util.PreferencesManager
import com.example.quizapp.util.RewardedAdManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val auth: FirebaseAuth,
    private val prefsManager: PreferencesManager,
    private val rewardedAdManager: RewardedAdManager,
    private val networkUtils: NetworkUtils
) : ViewModel() {

    private val _user = MutableStateFlow<User?>(null)
    val user: StateFlow<User?> = _user.asStateFlow()

    private val _coins = MutableStateFlow(0)
    val coins: StateFlow<Int> = _coins.asStateFlow()

    private val _totalXP = MutableStateFlow(0)
    val totalXP: StateFlow<Int> = _totalXP.asStateFlow()

    private val _userLevel = MutableStateFlow(1)
    val userLevel: StateFlow<Int> = _userLevel.asStateFlow()

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private var userListener: ListenerRegistration? = null

    private val userId: String?
        get() = auth.currentUser?.uid

    init {
        observeUserData()
    }

    /**
     * Feature 5 & 6: Sync UI with Firestore in real-time.
     * Single source of truth is Firestore.
     */
    private fun observeUserData() {
        val uid = userId ?: run {
            _isLoading.value = false
            return
        }
        
        _isLoading.value = true
        userListener?.remove()
        userListener = firestore.collection("users").document(uid)
            .addSnapshotListener { snapshot, error ->
                _isLoading.value = false
                if (error != null) {
                    Log.e("USER_DEBUG", "Snapshot listener error", error)
                    return@addSnapshotListener
                }
                
                snapshot?.let { doc ->
                    if (doc.exists()) {
                        val userData = doc.toObject(User::class.java)
                        _user.value = userData
                        
                        _coins.value = userData?.coins ?: 0
                        _totalXP.value = userData?.totalXP ?: 0
                        _userLevel.value = userData?.level ?: 1
                        
                        prefsManager.setTotalXP(userData?.totalXP ?: 0)
                        Log.d("USER_DEBUG", "Real-time sync: User data updated from Firestore")
                    }
                }
            }
    }

    /**
     * Feature 8: Edit Name - Update Firestore.
     */
    fun updateUsername(newName: String, onComplete: (Boolean) -> Unit) {
        val uid = userId ?: return
        viewModelScope.launch {
            try {
                firestore.collection("users")
                    .document(uid)
                    .update("username", newName)
                    .await()
                onComplete(true)
            } catch (e: Exception) {
                Log.e("USER_DEBUG", "Failed to update username", e)
                onComplete(false)
            }
        }
    }

    /**
     * Feature 4: Update coins properly using increment.
     */
    fun addCoins(amount: Int) {
        val uid = userId ?: return
        
        // Optimistic UI update
        _coins.value += amount

        viewModelScope.launch {
            try {
                firestore.collection("users")
                    .document(uid)
                    .update("coins", FieldValue.increment(amount.toLong()))
            } catch (e: Exception) {
                Log.e("COINS_DEBUG", "Error in addCoins", e)
            }
        }
    }

    fun showRewardedAd(activity: Activity) {
        if (!networkUtils.isNetworkAvailable()) return
        
        rewardedAdManager.showRewardedAd(
            activity = activity,
            onRewardEarned = { _ -> 
                Log.d("ADS_DEBUG", "Ad watched -> onUserEarnedReward triggered")
                addCoins(20) 
            },
            onAdDismissed = {
                Log.d("ADS_DEBUG", "Ad dismissed")
            }
        )
    }

    fun logout(onSuccess: () -> Unit) {
        auth.signOut()
        onSuccess()
    }

    val isOnline: StateFlow<Boolean> = networkUtils.observeNetworkStatus
        .stateIn(viewModelScope, kotlinx.coroutines.flow.SharingStarted.WhileSubscribed(5000), networkUtils.isNetworkAvailable())

    override fun onCleared() {
        super.onCleared()
        userListener?.remove()
    }
}
