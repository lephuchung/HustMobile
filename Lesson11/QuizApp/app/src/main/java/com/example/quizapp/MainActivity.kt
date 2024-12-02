package com.example.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    var correctAnswers: Int = 0
    var isQuestion1Correct: Int = 0
    var isQuestion2Correct: Int = 0
    var isQuestion3Correct: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up the Toolbar as ActionBar
        val toolbar: Toolbar = findViewById(R.id.toolbar) // Ensure this ID matches your layout XML
        setSupportActionBar(toolbar)

        // Set up the NavHostFragment and NavController
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController: NavController = navHostFragment.navController

        // Ensure the AppBarConfiguration is set up correctly (considering top-level destinations)
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        // Set up ActionBar with NavController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
    }

    // Optional: Handle Up/Back button for proper navigation
    override fun onSupportNavigateUp(): Boolean {
        val navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as? NavHostFragment)?.navController
        return navController?.navigateUp() ?: super.onSupportNavigateUp()
    }
}
