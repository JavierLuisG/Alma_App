package com.example.alma_app.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.alma_app.R
// import com.example.alma_app.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    // binding es la variable para la asociacion
    // lateinit var binding: ActivityMainBinding

    lateinit var iniciarButton: Button
    lateinit var registrarButton: Button
    lateinit var recuperarButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // en las dos siguientes lineas se agrega el binding y el set cambia porque falta definir la linea
        // de ejecucion de procesos por ejemplo, de esta actividad se activa otra y esta activa esta o esta y asi sucesivamente
        // binding = ActivityMainBinding.inflate(layoutInflater)
        // setContentView(binding.root)

        setContentView(R.layout.activity_login)

        // permite indicar cual es la relacion entre la var y el id del boton en login
        iniciarButton = findViewById(R.id.Biniciar)
        registrarButton = findViewById(R.id.Bregistrar)
        recuperarButton = findViewById(R.id.Brecuperar)

        // permite que se asocien con un click... setOnClickListener siempre se utiliza cuando queremos dar un click
        iniciarButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        registrarButton.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }
        recuperarButton.setOnClickListener {
            startActivity(Intent(this, RecuperarActivity::class.java))
        }
    }
}