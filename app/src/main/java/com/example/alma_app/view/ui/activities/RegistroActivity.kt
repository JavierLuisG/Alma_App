package com.example.alma_app.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alma_app.R

class RegistroActivity : AppCompatActivity() {

    lateinit var registroButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        registroButton = findViewById(R.id.Rregistro)

        registroButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}