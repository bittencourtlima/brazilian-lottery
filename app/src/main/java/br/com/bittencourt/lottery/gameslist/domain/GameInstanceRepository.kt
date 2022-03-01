package br.com.bittencourt.lottery.gameslist.domain

import br.com.bittencourt.lottery.gameslist.domain.model.SummaryInfoGameInstance

interface GameInstanceRepository{
    suspend fun getSummaryInfoGameInstance(lotteryName: String): SummaryInfoGameInstance
}