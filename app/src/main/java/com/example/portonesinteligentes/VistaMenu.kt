package com.example.portonesinteligentes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class VistaMenu : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnGoToLogin: Button = findViewById(R.id.btn_logout)

        btnGoToLogin.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()
        }
        val btn_historial: Button = findViewById(R.id.btn_historial)

        btn_historial.setOnClickListener {

            val intent = Intent(this, VistaInformacion::class.java)
            startActivity(intent)

            finish()
        }
        val btn_estado: Button = findViewById(R.id.btn_estado)

        btn_estado.setOnClickListener {

            val intent = Intent(this, VistaEstado::class.java)
            startActivity(intent)

            finish()
        }
    }
}
