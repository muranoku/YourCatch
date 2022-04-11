package com.example.yourcatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth

class MainActivity2 : AppCompatActivity() {


    private lateinit var mAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mAuth = FirebaseAuth.getInstance()

        val anime1:ImageView = findViewById(R.id.anime1)

        anime1.setOnClickListener {
            loginAlert()
            //val intent = Intent(this,MainActivity3::class.java)
            //startActivity(intent)
        }


    }

    private fun loginAlert() {
        AlertDialog.Builder(this)
            .setTitle("YourCatch ログイン")
            .setMessage("会員登録が必要です")
            .show()
    }
}