package com.example.app_flix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class SignUpWelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_welcome)

        val signUpToolbar: Toolbar = findViewById(R.id.signup_toolbar)
        setSupportActionBar(signUpToolbar)

    }
}