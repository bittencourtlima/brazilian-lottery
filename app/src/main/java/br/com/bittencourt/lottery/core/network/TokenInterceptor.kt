package br.com.bittencourt.lottery.core.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

private const val QUERY_TOKEN = "token"

class TokenInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newUrl = request.url.newBuilder().addQueryParameter(QUERY_TOKEN, NetworkConstants.TOKEN).build()
        return chain.proceed( request.newBuilder().url(newUrl).build() )
    }
}