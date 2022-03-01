package br.com.bittencourt.lottery.gameslist.presentation

sealed class GameInstanceEvent{
    data class GetSummaryGameInstance(val gameName: String): GameInstanceEvent()
}
