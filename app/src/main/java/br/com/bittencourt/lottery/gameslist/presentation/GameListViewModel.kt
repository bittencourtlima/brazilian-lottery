package br.com.bittencourt.lottery.gameslist.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.bittencourt.lottery.gameslist.domain.GetSummaryInfoGameInstance
import kotlinx.coroutines.launch
import javax.inject.Inject

class GameListViewModel @Inject constructor(private val getSummaryInfoGameInstance: GetSummaryInfoGameInstance): ViewModel() {

    fun onEvent(event: GameInstanceEvent){
        when(event){
            is GameInstanceEvent.GetSummaryGameInstance -> loadGameInstanceSummary(event.gameName)
        }
    }

    private fun loadGameInstanceSummary(gameName: String) {
        viewModelScope.launch {
            getSummaryInfoGameInstance(gameName)
        }
    }
}