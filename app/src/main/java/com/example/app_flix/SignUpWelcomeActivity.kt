package com.example.app_flix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar

class SignUpWelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_welcome)

        val signUpToolbar: Toolbar = findViewById(R.id.signup_toolbar)
        setSupportActionBar(signUpToolbar)
        supportActionBar?.title = null
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.signup_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

}