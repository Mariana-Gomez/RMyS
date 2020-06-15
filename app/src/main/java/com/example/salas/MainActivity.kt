package com.example.salas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Registro(view: View){
        val actRegistro: Intent = Intent(this, Loggin::class.java)
        startActivity(actRegistro)
    }

    fun Check (view: View){
        val actCheck: Intent = Intent(this, Sala::class.java)
        startActivity(actCheck)
    }
    /*fun Registro(view: View){
        val actRegistro: Intent = Intent(this, Loggin::class.java)
        startActivity(actRegistro)
    }*/
}