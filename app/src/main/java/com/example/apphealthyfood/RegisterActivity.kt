package com.example.apphealthyfood


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var btnCreateAccount: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnCreateAccount = findViewById(R.id.btnRegister)

        btnCreateAccount.setOnClickListener {
            Toast.makeText(this, "Cuenta creada, volviendo al login", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}