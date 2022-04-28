package com.example.yourcatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //view取得
        val btnAnime: Button = findViewById(R.id.btnAnime)
        val btnMovie: Button = findViewById(R.id.btnMovie)
        val btnBook: Button = findViewById(R.id.btnBook)
        val btnComic: Button = findViewById(R.id.btnComic)

        btnAnime.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        btnMovie.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }




    }
}