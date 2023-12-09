package com.example.cineangel.WelcomePage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cineangel.R
import com.example.cineangel.databinding.ActivityWelcomePage1Binding

class WelcomePageActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomePage1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomePage1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            ivArrow2.setOnClickListener{
                val intentView = Intent(this@WelcomePageActivity1,WelcomePageActivity2::class.java)
                startActivity(intentView)
            }
        }

    }
}