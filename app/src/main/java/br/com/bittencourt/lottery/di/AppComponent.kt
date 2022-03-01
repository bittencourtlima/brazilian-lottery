package br.com.bittencourt.lottery.di

import br.com.bittencourt.lottery.core.network.di.NetworkModule
import dagger.Component

@Component(modules = [NetworkModule::class])
interface AppComponent {
}