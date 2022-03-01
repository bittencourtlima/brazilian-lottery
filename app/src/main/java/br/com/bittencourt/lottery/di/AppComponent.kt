package br.com.bittencourt.lottery.di

import br.com.bittencourt.lottery.core.network.di.NetworkModule
import br.com.bittencourt.lottery.gameslist.di.GamesListComponent
import dagger.Component

@Component(modules = [NetworkModule::class, SubComponents::class])
interface AppComponent {

    fun gamesListComponent(): GamesListComponent.Factory
}