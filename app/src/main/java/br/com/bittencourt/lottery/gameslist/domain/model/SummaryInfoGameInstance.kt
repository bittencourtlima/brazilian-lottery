package br.com.bittencourt.lottery.gameslist.domain.model

data class SummaryInfoGameInstance(
    val name: String,
    val prizeValue: String,
    val idGameInstance: String,
    val nextEstimatedValue: String,
    val dateNextGame: String,
    val dateCurrentGame: String,
    val quantityWinners: Int,
)
