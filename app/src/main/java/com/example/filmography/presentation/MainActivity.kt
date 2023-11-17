package com.example.filmography.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmography.R
import com.example.filmography.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //init()
    }

//    private fun init(){
//        //binding.buttomNavView.nav
//    }
}