package br.com.bittencourt.lottery.gameslist.data.model.mapper

import br.com.bittencourt.lottery.commons.mappers.ResponseMapper
import br.com.bittencourt.lottery.gameslist.data.model.GameInstanceResponse
import br.com.bittencourt.lottery.gameslist.domain.model.SummaryInfoGameInstance
import javax.inject.Inject

class GameInstanceToSummaryMapper @Inject constructor(): ResponseMapper<GameInstanceResponse, SummaryInfoGameInstance> {
    override fun toDomain(response: GameInstanceResponse): SummaryInfoGameInstance = with(response) {
        SummaryInfoGameInstance(
            name = name ?: "",
            prizeValue = finalValueAccumulated.toString(),
            idGameInstance = gameNumber.toString(),
            nextEstimatedValue = estimatedValueNext.toString(),
            dateNextGame = "",
            dateCurrentGame = "",
            quantityWinners = winnersPlace.sumOf { it.quantityWinners ?: 0 },
        )
    }
}