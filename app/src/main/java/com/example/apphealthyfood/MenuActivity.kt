package com.example.apphealthyfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnVolverInicio = findViewById<Button>(R.id.btnVolverInicio)
        btnVolverInicio.setOnClickListener {
            // Cambia MainActivity por tu activity principal si tiene otro nombre
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
