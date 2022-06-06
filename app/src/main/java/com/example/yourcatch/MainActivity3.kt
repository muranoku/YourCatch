package com.example.yourcatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CancellationSignal
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity3 : AppCompatActivity() {

    private lateinit var edtEmail:EditText
    private lateinit var edtPassword:EditText
    private lateinit var btnLogin:Button
    private lateinit var btnSignup:Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        mAuth = FirebaseAuth.getInstance()

        edtEmail = findViewById(R.id.edt_mail)
        edtPassword = findViewById(R.id.edt_pass)
        btnLogin = findViewById(R.id.btnLogin)
        btnSignup = findViewById(R.id.btn_signup)

        btnSignup.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            login(email,password)
        }
        edtEmail.setOnClickListener {

        }
    }
    private fun login(email: String, password: String){
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this@MainActivity3,MainActivity3::class.java )
                    startActivity(intent)
                } else {
                    Toast.makeText(this@MainActivity3, "Some error occurred", Toast.LENGTH_SHORT).show()
                }
            }
    }
}