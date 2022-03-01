package br.com.bittencourt.lottery.gameslist.data

import br.com.bittencourt.lottery.commons.domain.NetworkErrorException
import br.com.bittencourt.lottery.commons.mappers.ResponseMapper
import br.com.bittencourt.lottery.gameslist.data.api.GameInstanceAPI
import br.com.bittencourt.lottery.gameslist.data.model.GameInstanceResponse
import br.com.bittencourt.lottery.gameslist.domain.GameInstanceRepository
import br.com.bittencourt.lottery.gameslist.domain.model.SummaryInfoGameInstance
import retrofit2.HttpException
import javax.inject.Inject

class GameInstanceRepositoryImpl @Inject constructor(
    private val gameInstanceAPI: GameInstanceAPI,
    private val mapper: ResponseMapper<GameInstanceResponse, SummaryInfoGameInstance>
) : GameInstanceRepository {
    override suspend fun getSummaryInfoGameInstance(lotteryName: String): SummaryInfoGameInstance =
        try {
            mapper.toDomain(gameInstanceAPI.getGame(lotteryName))
        }catch (exception: HttpException){
            throw NetworkErrorException(exception.message())
        }

}