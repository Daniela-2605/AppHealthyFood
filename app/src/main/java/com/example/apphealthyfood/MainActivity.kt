package com.example.apphealthyfood
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvGoRegister = findViewById<TextView>(R.id.tvGoRegister)

        btnLogin.setOnClickListener {
            // Ir a pantalla login
            startActivity(Intent(this, LoginActivity::class.java))
        }

        tvGoRegister.setOnClickListener {
            // Ir a pantalla registro
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
