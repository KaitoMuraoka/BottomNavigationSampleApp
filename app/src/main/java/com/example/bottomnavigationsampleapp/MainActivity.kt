package com.example.bottomnavigationsampleapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavigationsampleapp.databinding.ActivityMainBinding
import com.example.bottomnavigationsampleapp.ui.dashboard.DashboardFragment
import com.example.bottomnavigationsampleapp.ui.home.HomeFragment
import com.example.bottomnavigationsampleapp.ui.notifications.NotificationsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val navView: BottomNavigationView = binding.navView
//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//        navView.setupWithNavController(navController)
        // ↑があると動く。
        // onOptionsItemSelectedないに↑のコードが必要？
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_home, HomeFragment())
                    .commit()
                true
            }
            R.id.navigation_dashboard -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_dashboard, DashboardFragment())
                    .commit()
                true
            }
            R.id.navigation_notifications -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_notifications, NotificationsFragment())
                    .commit()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}