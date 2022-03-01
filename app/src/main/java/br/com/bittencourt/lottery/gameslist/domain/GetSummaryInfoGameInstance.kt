package br.com.bittencourt.lottery.gameslist.domain

import javax.inject.Inject

class GetSummaryInfoGameInstance @Inject constructor(private val repository: GameInstanceRepository) {
    suspend operator fun invoke(nameLottery: String) = repository.getSummaryInfoGameInstance(nameLottery)
}