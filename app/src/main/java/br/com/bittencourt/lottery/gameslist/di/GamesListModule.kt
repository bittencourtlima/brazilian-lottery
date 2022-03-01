package br.com.bittencourt.lottery.gameslist.di

import br.com.bittencourt.lottery.commons.mappers.ResponseMapper
import br.com.bittencourt.lottery.gameslist.data.GameInstanceRepositoryImpl
import br.com.bittencourt.lottery.gameslist.data.api.GameInstanceAPI
import br.com.bittencourt.lottery.gameslist.data.model.GameInstanceResponse
import br.com.bittencourt.lottery.gameslist.data.model.mapper.GameInstanceToSummaryMapper
import br.com.bittencourt.lottery.gameslist.domain.GameInstanceRepository
import br.com.bittencourt.lottery.gameslist.domain.model.SummaryInfoGameInstance
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
abstract class GamesListModule {

    companion object{
        @Provides
        fun provideApi(retrofit: Retrofit) = retrofit.create(GameInstanceAPI::class.java)
    }

    @Binds
    abstract fun provideMapper(mapper: GameInstanceToSummaryMapper): ResponseMapper<GameInstanceResponse, SummaryInfoGameInstance>

    @Binds
    abstract fun provideRepository(repository: GameInstanceRepositoryImpl): GameInstanceRepository
}