package br.com.bittencourt.lottery.gameslist.data.api

import br.com.bittencourt.lottery.gameslist.data.model.GameInstanceResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface GameInstanceAPI {
    @GET("/app/resultado")
    suspend fun getGame(@Query("loteria") lotteryName: String): GameInstanceResponse
}