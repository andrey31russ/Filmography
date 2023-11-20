package com.example.filmography.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.filmography.presentation.screens.FragmentHome
import com.example.filmography.presentation.screens.FragmentSearch
import com.example.filmography.presentation.screens.FragmentSettings
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.project.bindingapp.R
class MainActivity : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(FragmentHome())
        bottomNav = findViewById(R.id.bottom_nav_menu) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    loadFragment(FragmentHome())
                    true
                }
                R.id.nav_settings -> {
                    loadFragment(FragmentSettings())
                    true
                }
                R.id.nav_search -> {
                    loadFragment(FragmentSearch())
                    true
                }

                else -> {
                    true
                }
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }

}





