package com.example.quizapp.data.repository

import android.app.Activity
import android.content.Context
import android.util.Log
import com.android.billingclient.api.*
import com.example.quizapp.util.Resource
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BillingManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val storeRepository: StoreRepository
) : PurchasesUpdatedListener {

    private val _productDetailsList = MutableStateFlow<List<ProductDetails>>(emptyList())
    val productDetailsList: StateFlow<List<ProductDetails>> = _productDetailsList.asStateFlow()

    private val _purchaseState = MutableStateFlow<Resource<Unit>?>(null)
    val purchaseState: StateFlow<Resource<Unit>?> = _purchaseState.asStateFlow()

    private val _billingError = MutableStateFlow<String?>(null)
    val billingError: StateFlow<String?> = _billingError.asStateFlow()

    private val billingClient = BillingClient.newBuilder(context)
        .setListener(this)
        .enablePendingPurchases()
        .build()

    private val productIds = listOf(
        "coin_100",
        "coin_200",
        "coin_500",
        "coin_1000",
        "coin_2500"
    )

    init {
        startBillingConnection()
    }

    fun startBillingConnection() {
        Log.d("BILLING_DEBUG", "Starting billing connection...")
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    Log.d("BILLING_DEBUG", "Billing connected successfully")
                    _billingError.value = null
                    queryProductDetails()
                } else {
                    Log.e("BILLING_DEBUG", "Billing connection failed: ${billingResult.debugMessage}")
                    _billingError.value = "Billing connection failed: ${billingResult.debugMessage}"
                }
            }

            override fun onBillingServiceDisconnected() {
                Log.e("BILLING_DEBUG", "Billing service disconnected")
                _billingError.value = "Billing service disconnected"
            }
        })
    }

    private fun queryProductDetails() {
        if (!billingClient.isReady) {
            Log.e("BILLING_DEBUG", "Billing not ready for query")
            return
        }
        Log.d("BILLING_DEBUG", "Querying product details...")
        val productList = productIds.map {
            QueryProductDetailsParams.Product.newBuilder()
                .setProductId(it)
                .setProductType(BillingClient.ProductType.INAPP)
                .build()
        }

        val params = QueryProductDetailsParams.newBuilder()
            .setProductList(productList)
            .build()

        billingClient.queryProductDetailsAsync(params) { billingResult, productDetailsList ->
            Log.d("BILLING_DEBUG", "Query result code: ${billingResult.responseCode}")
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                if (productDetailsList.isNotEmpty()) {
                    Log.d("BILLING_DEBUG", "Products loaded: ${productDetailsList.size}")
                    _productDetailsList.value = productDetailsList
                    _billingError.value = null
                } else {
                    Log.e("BILLING_DEBUG", "Products empty")
                    _billingError.value = "No products found in Play Console"
                }
            } else {
                Log.e("BILLING_DEBUG", "Query failed: ${billingResult.debugMessage}")
                _billingError.value = "Failed to load products: ${billingResult.debugMessage}"
            }
        }
    }

    fun launchBillingFlow(activity: Activity, productDetails: ProductDetails?) {
        if (productDetails == null) {
            Log.e("BILLING_DEBUG", "ProductDetails is null")
            _purchaseState.value = Resource.Error("Product details not available")
            return
        }

        if (!billingClient.isReady) {
            Log.e("BILLING_DEBUG", "BillingClient is not ready")
            _purchaseState.value = Resource.Error("Billing service is not ready")
            startBillingConnection()
            return
        }

        try {
            val productDetailsParamsList = listOf(
                BillingFlowParams.ProductDetailsParams.newBuilder()
                    .setProductDetails(productDetails)
                    .build()
            )

            val billingFlowParams = BillingFlowParams.newBuilder()
                .setProductDetailsParamsList(productDetailsParamsList)
                .build()

            val result = billingClient.launchBillingFlow(activity, billingFlowParams)
            if (result.responseCode != BillingClient.BillingResponseCode.OK) {
                Log.e("BILLING_DEBUG", "Launch flow failed: ${result.debugMessage}")
                _purchaseState.value = Resource.Error("Launch flow failed: ${result.debugMessage}")
            }
        } catch (e: Exception) {
            Log.e("BILLING_CRASH", "Crash in launchBillingFlow: ${e.message}")
            _purchaseState.value = Resource.Error("An unexpected error occurred")
        }
    }

    override fun onPurchasesUpdated(billingResult: BillingResult, purchases: List<Purchase>?) {
        if (billingResult.responseCode == BillingClient.BillingResponseCode.OK && purchases != null) {
            for (purchase in purchases) {
                handlePurchase(purchase)
            }
        } else if (billingResult.responseCode == BillingClient.BillingResponseCode.USER_CANCELED) {
            _purchaseState.value = Resource.Error("Purchase cancelled")
        } else {
            _purchaseState.value = Resource.Error("Billing error: ${billingResult.debugMessage}")
        }
    }

    private fun handlePurchase(purchase: Purchase) {
        if (purchase.purchaseState == Purchase.PurchaseState.PURCHASED) {
            if (!purchase.isAcknowledged) {
                val coinsToAdd = when (purchase.products.firstOrNull()) {
                    "coin_100" -> 100
                    "coin_200" -> 200
                    "coin_500" -> 500
                    "coin_1000" -> 1000
                    "coin_2500" -> 2500
                    else -> 0
                }

                if (coinsToAdd > 0) {
                    CoroutineScope(Dispatchers.IO).launch {
                        _purchaseState.value = Resource.Loading()
                        val result = storeRepository.addCoins(coinsToAdd)
                        if (result is Resource.Success) {
                            acknowledgePurchase(purchase)
                            consumePurchase(purchase)
                            _purchaseState.value = Resource.Success(Unit)
                        } else {
                            _purchaseState.value = Resource.Error("Failed to update coins in database")
                        }
                    }
                }
            }
        }
    }

    private fun acknowledgePurchase(purchase: Purchase) {
        if (!billingClient.isReady) return
        val params = AcknowledgePurchaseParams.newBuilder()
            .setPurchaseToken(purchase.purchaseToken)
            .build()

        billingClient.acknowledgePurchase(params) { billingResult ->
            if (billingResult.responseCode != BillingClient.BillingResponseCode.OK) {
                Log.e("BILLING_DEBUG", "Acknowledge failed: ${billingResult.debugMessage}")
            }
        }
    }

    private fun consumePurchase(purchase: Purchase) {
        if (!billingClient.isReady) return
        val consumeParams = ConsumeParams.newBuilder()
            .setPurchaseToken(purchase.purchaseToken)
            .build()

        billingClient.consumeAsync(consumeParams) { billingResult, _ ->
            if (billingResult.responseCode != BillingClient.BillingResponseCode.OK) {
                Log.e("BILLING_DEBUG", "Consume failed: ${billingResult.debugMessage}")
            }
        }
    }

    fun clearPurchaseState() {
        _purchaseState.value = null
    }

    fun retryConnection() {
        startBillingConnection()
    }
}
