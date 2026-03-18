package com.example.quizapp.presentation.viewmodel

import com.android.billingclient.api.ProductDetails

sealed class StoreState {
    object Loading : StoreState()
    data class Success(val products: List<ProductDetails>) : StoreState()
    data class Error(val message: String) : StoreState()
}
