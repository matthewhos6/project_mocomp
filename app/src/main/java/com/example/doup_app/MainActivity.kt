package com.example.doup_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin : Button
    lateinit var btnToRegis : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.btnLogin)
        btnToRegis = findViewById(R.id.btnToRegis)

        btnLogin.setBackgroundColor(resources.getColor(R.color.orange))
        btnToRegis.setBackgroundColor(resources.getColor(R.color.orange))

    }
}