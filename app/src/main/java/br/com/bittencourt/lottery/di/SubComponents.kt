package br.com.bittencourt.lottery.di

import br.com.bittencourt.lottery.gameslist.di.GamesListComponent
import dagger.Module

@Module(subcomponents = [GamesListComponent::class])
object SubComponents