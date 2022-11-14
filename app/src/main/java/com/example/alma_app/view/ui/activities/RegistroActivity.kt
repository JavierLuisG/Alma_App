package com.example.alma_app.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.alma_app.R
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegistroActivity : AppCompatActivity() {

    lateinit var registroButton: Button
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        firebaseAuth = Firebase.auth
        val email = findViewById<EditText>(R.id.Registroaddress)
        val ciudad = findViewById<EditText>(R.id.Registrociudad)
        val direccion = findViewById<EditText>(R.id.Registrodireccion)
        val telefono = findViewById<EditText>(R.id.Registrotelefono)
        val password = findViewById<EditText>(R.id.Registropassword)

        registroButton = findViewById(R.id.Rregistro)
        registroButton.setOnClickListener {
            // cuando el usuario le da click al registrarse va a pasar que se CREA EL USUARIO
            //startActivity(Intent(this, LoginActivity::class.java))
            createUser(email.text.toString(),password.text.toString())

        }
    }

    fun createUser(email:String,password:String){
        firebaseAuth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                Task-> if (Task.isSuccessful){
                startActivity(Intent(this, LoginActivity::class.java))
                }else{
                    Toast.makeText(baseContext, "Intente de nuevo", Toast.LENGTH_LONG).show()
                }
        }
    }
}