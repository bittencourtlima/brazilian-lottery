package br.com.bittencourt.lottery.gameslist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.bittencourt.lottery.LotteryApplication
import br.com.bittencourt.lottery.R

class GamesListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as LotteryApplication).appComponent.gamesListComponent().create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_list)
    }
}