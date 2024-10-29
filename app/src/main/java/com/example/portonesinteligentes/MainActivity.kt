package com.example.portonesinteligentes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        val userList = ArrayList<User>() // Lista en memoria
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText: EditText = findViewById(R.id.editTextUsername)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val loginButton: Button = findViewById(R.id.buttonLogin)
        val registerButton: Button = findViewById(R.id.buttonRegister)

        // Usuario por defecto para pruebas
        userList.add(User("admin", "admin123"))

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (isValidUser(username, password)) {
                Toast.makeText(this, "Bienvenido $username", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, VistaMenu::class.java)
                intent.putExtra("username", username) // Enviar nombre de usuario
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun isValidUser(username: String, password: String): Boolean {
        return userList.any { it.username == username && it.password == password }
    }
}
