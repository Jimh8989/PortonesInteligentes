package com.example.portonesinteligentes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class VistaEstado : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estado)

        val btnGoToLogin: Button = findViewById(R.id.buttonBack)

        btnGoToLogin.setOnClickListener {

            val intent = Intent(this, VistaMenu::class.java)
            startActivity(intent)

            finish()
        }
    }
}