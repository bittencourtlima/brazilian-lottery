package br.com.bittencourt.lottery.commons.network.di

import br.com.bittencourt.lottery.commons.network.LoggingInterceptor
import br.com.bittencourt.lottery.commons.network.NetworkConstants
import br.com.bittencourt.lottery.commons.network.TokenInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
object NetworkModule {

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(NetworkConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    @Provides
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor, tokenInterceptor: TokenInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(tokenInterceptor)
            .build()

    @Provides
    fun provideHttpLoggingInterceptor(loggingInterceptor: LoggingInterceptor): HttpLoggingInterceptor =
        HttpLoggingInterceptor(loggingInterceptor).apply {
            level = HttpLoggingInterceptor.Level.BODY
        }


}