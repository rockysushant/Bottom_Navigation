package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)git
        val navController = findNavController(R.id.fragmentContainerView2)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.firstFragment,R.id.secondFragment,R.id.thirdFragment))
        setupActionBarWithNavController(navController,appBarConfiguration)


        bottomNavigationView.setupWithNavController(navController)




    }
}