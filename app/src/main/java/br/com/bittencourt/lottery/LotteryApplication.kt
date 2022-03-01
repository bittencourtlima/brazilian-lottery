package br.com.bittencourt.lottery

import android.app.Application
import br.com.bittencourt.lottery.di.DaggerAppComponent

class LotteryApplication: Application() {

    val appComponent = DaggerAppComponent.create()
}