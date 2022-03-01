package br.com.bittencourt.lottery.gameslist.data.model

import com.google.gson.annotations.SerializedName


data class GameInstanceResponse(
    @SerializedName("nome") var name: String?,
    @SerializedName("numero_concurso") var gameNumber: Int?,
    @SerializedName("data_concurso") var dateGameInstance: String?,
    @SerializedName("data_concurso_milliseconds") var dateGameInstanceMillisec: Long?,
    @SerializedName("local_realizacao") var place: String?,
    @SerializedName("rateio_processamento") var average: Boolean?,
    @SerializedName("acumulou") var hasAccumulated: Boolean?,
    @SerializedName("valor_acumulado") var valueAccmulated: Double?,
    @SerializedName("dezenas") var numbers: List<String>,
    @SerializedName("premiacao") var prizes: List<PrizeResponse>,
    @SerializedName("local_ganhadores") var winnersPlace: List<WinnerPlaceResponse>,
    @SerializedName("arrecadacao_total") var totalRecevived: Double?,
    @SerializedName("data_proximo_concurso") var dateNextGameInstance: String?,
    @SerializedName("data_proximo_concurso_milliseconds") var dateNextGameInstanceMillisec: Long?,
    @SerializedName("valor_estimado_proximo_concurso") var estimatedValueNext: Int?,
    @SerializedName("valor_final_concurso_acumulado") var finalValueAccumulated: Double?,
    @SerializedName("numero_final_concurso_acumulado") var finalNumberAccumulatedGameInstance: Int?,
    @SerializedName("valor_acumulado_especial") var specialValueAccumulated: Double?,
    @SerializedName("nome_acumulado_especial") var specialNameAccumulated: String?
)

data class PrizeResponse(
    @SerializedName("nome") var name: String?,
    @SerializedName("quantidade_ganhadores") var quantityWinners: Int?,
    @SerializedName("valor_total") var totalValue: Double?,
    @SerializedName("acertos") var hits: Int?
)

data class WinnerPlaceResponse(
    @SerializedName("local") var local: String?,
    @SerializedName("cidade") var city: String?,
    @SerializedName("uf") var state: String?,
    @SerializedName("quantidade_ganhadores") var quantityWinners: Int?,
    @SerializedName("canal_eletronico") var electronicChannel: Boolean?
)
