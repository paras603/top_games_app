package com.mastercoding.topgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. Adapter View: Recylcler (card view)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
        false)

        //2. Data Source: Game list array
        var GameList: ArrayList<GameModel> = ArrayList()

        var g1 = GameModel(R.drawable.card1, "Horizon")
        var g2 = GameModel(R.drawable.card2,"PUBG")
        var g3 = GameModel(R.drawable.card3, "Head Ball 2")
        var g4 = GameModel(R.drawable.card4, "Hooked on You")
        var g5 = GameModel(R.drawable.card5, "FIFA 2022")
        var g6 = GameModel(R.drawable.card6, "Fortnite")

        GameList.add(g1)
        GameList.add(g2)
        GameList.add(g3)
        GameList.add(g4)
        GameList.add(g4)
        GameList.add(g5)
        GameList.add(g6)

        //3. Adapter
        var adapter = GameAdapter(GameList)
        recyclerView.adapter = adapter
    }
}