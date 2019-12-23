package com.example.footballmatchschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.footballmatchschedule.network.PostApi
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leagueTitle: TextView = findViewById(R.id.league_title)
        val leagueDescription: TextView = findViewById(R.id.league_description)
        val leagueBanner: ImageView = findViewById(R.id.league_banner)
        val leaguePoster: ImageView = findViewById(R.id.league_poster)

    }

    fun create(leagueId: Int): PostApi {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://www.thesportsdb.com")
            .build()
        return retrofit.create(PostApi::class.java)
    }

}
