package com.example.cineangel.WelcomePage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cineangel.R
import com.example.cineangel.databinding.ActivityWelcomePage1Binding
import com.example.cineangel.databinding.ActivityWelcomePage2Binding

class WelcomePageActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomePage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomePage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            ivArrow1.setOnClickListener{
                val intentView = Intent(this@WelcomePageActivity2,WelcomePageActivity1::class.java)
                startActivity(intentView)
            }
            ivArrow2.setOnClickListener{
                val intentView = Intent(this@WelcomePageActivity2,WelcomePageActivity3::class.java)
                startActivity(intentView)
            }
        }
    }
}