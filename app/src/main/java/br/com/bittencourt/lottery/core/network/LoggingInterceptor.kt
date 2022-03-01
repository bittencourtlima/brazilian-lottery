package br.com.bittencourt.lottery.core.network

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject

private const val TAG = "Network"

class LoggingInterceptor @Inject constructor() : HttpLoggingInterceptor.Logger {
    override fun log(message: String) {
        Log.d(TAG, message)
    }
}