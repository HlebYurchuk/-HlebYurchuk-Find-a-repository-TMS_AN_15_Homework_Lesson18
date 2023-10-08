package com.example.registration

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)




        val tvLogin = findViewById<TextView>(R.id.tvLogin)
        val tvPassword = findViewById<TextView>(R.id.tvPass)

        val data: String = intent.getStringExtra(KEY).toString() ?: "no data"
        tvLogin.text = data
    }
    companion object{

        private const val KEY = "1"

        fun startOnboardingActivity(context: Context, string: String){

            val intent = Intent(context, OnboardingActivity::class.java)
            intent.putExtra(KEY, string.toString())
            context.startActivity(intent)
        }
    }
}