package br.com.bittencourt.lottery.gameslist.data.api

import br.com.bittencourt.lottery.gameslist.data.model.GameInstanceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface GetGameInstanceAPI {
    @GET("/app/resultado")
    fun getGame(@Query("loteria") lotteryName: String): Call<GameInstanceResponse>
}