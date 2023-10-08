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
            } else if (tetPass.length() < 6 && tetEmail.length() < 6) {
                tetPass.error = "password cant be lower then 6"
                tetEmail.error = "email cant be lower then 6"

            } else if (tetPass.length() < 6) {
                tetPass.error = "password cant be lower then 6"

            } else if (tetEmail.length() < 6) {
                tetEmail.error = "email cant be lower then 6"

            } else {

                startOnboardingActivity(
                    this,
                    tetEmail.text.toString() + " " + tetPass.text.toString()
                )
            }
        }
    }
}

