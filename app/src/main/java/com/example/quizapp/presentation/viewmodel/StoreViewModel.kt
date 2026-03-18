package com.example.quizapp.presentation.viewmodel

import android.app.Activity
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.billingclient.api.ProductDetails
import com.example.quizapp.data.model.PowerUp
import com.example.quizapp.data.model.PowerUpType
import com.example.quizapp.data.model.UserPowerUps
import com.example.quizapp.data.repository.BillingManager
import com.example.quizapp.data.repository.StoreRepository
import com.example.quizapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StoreViewModel @Inject constructor(
    private val repository: StoreRepository,
    private val billingManager: BillingManager
) : ViewModel() {

    private val _coins = MutableStateFlow<Resource<Int>>(Resource.Loading())
    val coins: StateFlow<Resource<Int>> = _coins.asStateFlow()

    private val _powerUps = MutableStateFlow<Resource<UserPowerUps>>(Resource.Loading())
    val powerUps: StateFlow<Resource<UserPowerUps>> = _powerUps.asStateFlow()

    private val _buyState = MutableStateFlow<Resource<Unit>?>(null)
    val buyState: StateFlow<Resource<Unit>?> = _buyState.asStateFlow()

    private val _storeState = MutableStateFlow<StoreState>(StoreState.Loading)
    val storeState: StateFlow<StoreState> = _storeState.asStateFlow()

    val billingPurchaseState: StateFlow<Resource<Unit>?> = billingManager.purchaseState

    init {
        loadUserData()
        observeBillingStatus()
    }

    private fun loadUserData() {
        viewModelScope.launch {
            repository.getUserCoins().collect {
                _coins.value = it
                Log.d("COINS_DEBUG", "Coins updated: ${it.data}")
            }
        }
        viewModelScope.launch {
            repository.getUserPowerUps().collect {
                _powerUps.value = it
            }
        }
    }

    private fun observeBillingStatus() {
        viewModelScope.launch {
            billingManager.productDetailsList.collect { products ->
                if (products.isNotEmpty()) {
                    _storeState.value = StoreState.Success(products)
                }
            }
        }

        viewModelScope.launch {
            billingManager.billingError.collect { error ->
                if (error != null) {
                    _storeState.value = StoreState.Error(error)
                }
            }
        }
    }

    fun buyPowerUp(powerUp: PowerUp) {
        viewModelScope.launch {
            _buyState.value = Resource.Loading()
            val result = if (powerUp.type == PowerUpType.REMOVE_ADS) {
                repository.buyPremiumFeature(powerUp.id, powerUp.cost, 1)
            } else {
                repository.buyPowerUp(powerUp.id, powerUp.cost)
            }
            _buyState.value = result
        }
    }

    fun purchaseCoins(activity: Activity, productDetails: ProductDetails) {
        billingManager.launchBillingFlow(activity, productDetails)
    }

    fun retryConnection() {
        _storeState.value = StoreState.Loading
        billingManager.retryConnection()
    }

    fun onRewardAdCompleted() {
        Log.d("ADS_DEBUG", "Ad watched -> reward triggered")
        viewModelScope.launch {
            val result = repository.addCoins(20)
            if (result is Resource.Success) {
                Log.d("COINS_DEBUG", "Added 20 coins via ad")
            }
        }
    }

    fun clearBuyState() {
        _buyState.value = null
    }

    fun clearBillingState() {
        billingManager.clearPurchaseState()
    }
}
