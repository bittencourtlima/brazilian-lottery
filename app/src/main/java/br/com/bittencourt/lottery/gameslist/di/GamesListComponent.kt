package br.com.bittencourt.lottery.gameslist.di

import br.com.bittencourt.lottery.gameslist.presentation.GamesListActivity
import dagger.Subcomponent

@Subcomponent
interface GamesListComponent {
    fun inject(activity: GamesListActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): GamesListComponent
    }
}