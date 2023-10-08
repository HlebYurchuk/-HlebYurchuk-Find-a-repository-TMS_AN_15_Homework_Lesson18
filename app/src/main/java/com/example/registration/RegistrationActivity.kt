package com.example.registration

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.registration.OnboardingActivity.Companion.startOnboardingActivity

class RegistrationActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrarion_activity)


        val tetEmail = findViewById<EditText>(R.id.etLogin)
        val tetPass = findViewById<EditText>(R.id.etPassword)
        val btnRg = findViewById<Button>(R.id.btnRg)

        btnRg.setOnClickListener {

            if (tetEmail.text.toString().isEmpty() && tetPass.text.toString().isEmpty()) {
                tetEmail.error = "email cant be empty"
                tetPass.error = "password cant be empty"

            } else if (tetEmail.text.toString().isEmpty()) {


                tetEmail.error = "email cant be empty"


            } else if (tetPass.text.toString().isEmpty()) {
                tetPass.error = "password cant be empty"
            } else {

                startOnboardingActivity(this,tetEmail.text.toString() + " " + tetPass.text.toString())
            }
        }
    }
    }

