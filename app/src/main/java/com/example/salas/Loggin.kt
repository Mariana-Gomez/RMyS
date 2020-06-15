package com.example.salas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Loggin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggin)
    }

    fun Listo(view: View){
        val actListo: Intent = Intent(this, Sala::class.java)
        startActivity(actListo)
    }
}