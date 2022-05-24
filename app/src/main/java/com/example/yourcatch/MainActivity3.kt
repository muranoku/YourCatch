package com.example.yourcatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CancellationSignal
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {

    private lateinit var edtEmail:EditText
    private lateinit var edtPassword:EditText
    private lateinit var btnLogin:Button
    private lateinit var btnSignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        edtEmail = findViewById(R.id.edt_mail)
        edtPassword = findViewById(R.id.edt_pass)
        btnLogin = findViewById(R.id.btnLogin)
        btnSignup = findViewById(R.id.btn_signup)

        btnSignup.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }



    }
}