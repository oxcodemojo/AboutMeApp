package com.example.aboutmeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aboutmeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // added this comment on github, let's see if it shows up on the androis studio when pulled using github pull statement.

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
