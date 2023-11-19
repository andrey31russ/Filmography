package com.example.filmography.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.filmography.presentation.screens.FragmentHome
import com.project.bindingapp.R


import com.project.bindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

    }


    private fun init(){
        binding.bottomNavMenu.id = R.id.nav_settings
        binding.bottomNavMenu.setOnClickListener {
            when(it.id){
                R.id.nav_home -> {Toast.makeText(this, "you have presed $it", Toast.LENGTH_SHORT).show()}
                R.id.nav_search -> {}
                R.id.nav_settings-> {}
            }

        }
    }
}