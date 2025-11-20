package com.example.apphealthyfood



import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var loginTab: Button
    private lateinit var registerTab: Button
    private lateinit var emailEdit: EditText
    private lateinit var passwordEdit: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginTab = findViewById(R.id.loginTab)
        registerTab = findViewById(R.id.registerTab)
        emailEdit = findViewById(R.id.emailEdit)
        passwordEdit = findViewById(R.id.passwordEdit)
        btnLogin = findViewById(R.id.btnLogin)

        loginTab.setOnClickListener {
            setTabSelected(true)
        }

        registerTab.setOnClickListener {
            setTabSelected(false)
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val email = emailEdit.text.toString().trim()
            val password = passwordEdit.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor completa ambos campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ingresando como $email", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }
        }

        setTabSelected(true)
    }

    private fun setTabSelected(isLogin: Boolean) {
        if (isLogin) {
            loginTab.setBackgroundResource(R.drawable.tab_selected)
            loginTab.setTextColor(Color.BLACK)
            registerTab.setBackgroundColor(Color.TRANSPARENT)
            registerTab.setTextColor(Color.BLACK)
        } else {
            registerTab.setBackgroundResource(R.drawable.tab_selected)
            registerTab.setTextColor(Color.BLACK)
            loginTab.setBackgroundColor(Color.TRANSPARENT)
            loginTab.setTextColor(Color.BLACK)
        }
    }
}
