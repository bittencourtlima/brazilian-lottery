package br.com.bittencourt.lottery.gameslist.presentation

import br.com.bittencourt.lottery.gameslist.domain.model.SummaryInfoGameInstance

sealed class GameInstanceStateView{
    object Loading: GameInstanceStateView()
    object Error: GameInstanceStateView()
    data class Success(val summaryInfoGameInstance: SummaryInfoGameInstance): GameInstanceStateView()
}
