package br.com.bittencourt.lottery.gameslist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.bittencourt.lottery.LotteryApplication
import br.com.bittencourt.lottery.R
import retrofit2.Retrofit
import javax.inject.Inject

class GamesListActivity : AppCompatActivity() {

    @Inject lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as LotteryApplication).appComponent.gamesListComponent().create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_list)

        Log.d("Test", retrofit.baseUrl().toString())
    }
}