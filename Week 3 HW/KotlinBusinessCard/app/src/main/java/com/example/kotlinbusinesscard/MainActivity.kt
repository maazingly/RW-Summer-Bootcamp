package com.example.kotlinbusinesscard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.security.AccessController.getContext
import android.widget.Toast.makeText as makeText1


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val link = findViewById<Button>(R.id.button)
        link.setOnClickListener(
            Toast.makeText(this, "+1 User", Toast.LENGTH_LONG).show()
        )
    }
}

private fun Button.setOnClickListener(show: Unit) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
