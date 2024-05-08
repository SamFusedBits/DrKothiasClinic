package com.example.ksharsutra

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val forgotPassword = findViewById<TextView>(R.id.forgot_password)
        val createAccount = findViewById<TextView>(R.id.create_account)

        val signInButton = findViewById<Button>(R.id.signin)


        signInButton.setOnClickListener {
            if(username.text.toString().isEmpty()){
                username.error = "Please enter username"
                return@setOnClickListener
            }
            else if(email.text.toString().isEmpty()){
                email.error = "Please enter email"
                return@setOnClickListener
            }
            else if(password.text.toString().isEmpty()){
                password.error = "Please enter password"
                return@setOnClickListener
            }else{
                val intent = Intent(this, HomePageActivity::class.java)
                startActivity(intent)
            }
        }

        forgotPassword.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        createAccount.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}