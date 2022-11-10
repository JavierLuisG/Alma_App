package com.example.alma_app.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alma_app.R

class IngresoCodigoActivity : AppCompatActivity() {

    lateinit var ingresarCodigoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso_codigo)

        ingresarCodigoButton = findViewById(R.id.InConfirmar)

        ingresarCodigoButton.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}