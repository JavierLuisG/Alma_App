package com.example.alma_app.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import com.example.alma_app.R
import java.util.zip.Inflater

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val rellenar:MenuInflater = menuInflater
        rellenar.inflate(R.menu.nav_menu_bar,menu)
        return true
    }
}