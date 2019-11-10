package com.example.expensesmanager

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expensesmanager.ui.home.ExpenseListAdapter
import kotlinx.android.synthetic.main.activity_main_page.*

class MainPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
        val navController = findNavController(R.id.main_nav_fragment)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        val adapter = ExpenseListAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        newEntryFab.setOnClickListener {
            navController.navigate(R.id.action_bottomNavBarFragment_to_addEntryFragment)
        }
    }

}
