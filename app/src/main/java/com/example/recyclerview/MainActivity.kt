package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jogos = ArrayList<Jogo>()
        jogos.add(Jogo("Mortal Kombate", "Nintendo"))
        jogos.add(Jogo("Super Mário", "Play Station 1"))
        jogos.add(Jogo("Futebol", "XBOX"))
        val adapter = JogoAdapter(applicationContext, jogos)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        recycler.itemAnimator = DefaultItemAnimator()
        recycler.adapter = adapter
    }
}