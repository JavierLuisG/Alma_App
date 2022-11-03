package com.example.alma_app.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.alma_app.R
import com.example.alma_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // se va a programar el binding o splash
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // en estas dos lineas se crea la asociacion entre el MainActivity(activity) y el activity_main(layout)
        // el setContentView es lo mismo que decir (R.layout.activity_main) -- pero mejor
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // configuracion para correr la animacion en el layout activity_main
        binding.viewAnimation.setAnimation(R.raw.womenanimation)
        binding.viewAnimation.playAnimation()

        // configuracion para que la transicion entre la animacion y la siguiente activity se realice en 4 segundos
        handler=Handler(Looper.myLooper()!!)
        handler.postDelayed(
            {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            },6000)
    }
}