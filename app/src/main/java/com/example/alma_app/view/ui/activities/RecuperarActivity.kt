package com.example.alma_app.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.alma_app.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RecuperarActivity : AppCompatActivity() {

    lateinit var enviarCodigoButton: Button
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)

        firebaseAuth = Firebase.auth
        val correo = findViewById<TextView>(R.id.RestablecerAddress)
        val confircorreo = findViewById<TextView>(R.id.RestablecerConfirmAddress)

        enviarCodigoButton = findViewById(R.id.ReEnviarCodigo)
        enviarCodigoButton.setOnClickListener {
            //startActivity(Intent(this, IngresoCodigoActivity::class.java))
            if(correo.text == confircorreo.text){
                restablecerPassword(correo.text.toString())
            }else{
                Toast.makeText(this, "Confirmación incorrecta", Toast.LENGTH_LONG).show()
            }
            /*
            Explicacion del porque toString()
            email --> tipo de dato TextView
            email.text --> tipo de dato Objeto
            email.text.toString() --> tipo de dato String
            */
        }

    }

    fun restablecerPassword(email:String){
        firebaseAuth.sendPasswordResetEmail(email)
            .addOnCompleteListener(this){
                Task-> if (Task.isSuccessful){
                startActivity(Intent(this, IngresoCodigoActivity::class.java))
                }else{
                    Toast.makeText(this, "Correo no registrado", Toast.LENGTH_LONG).show()
                }
            }
    }

    fun enviarCodigo(email:String,email2:String){
    }

}