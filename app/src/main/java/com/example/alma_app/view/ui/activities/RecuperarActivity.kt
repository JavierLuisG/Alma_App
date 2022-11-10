package com.example.alma_app.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alma_app.R

class RecuperarActivity : AppCompatActivity() {

    lateinit var enviarCodigoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)

        enviarCodigoButton = findViewById(R.id.ReEnviarCodigo)

        enviarCodigoButton.setOnClickListener {
            startActivity(Intent(this, IngresoCodigoActivity::class.java))
        }

    }

}