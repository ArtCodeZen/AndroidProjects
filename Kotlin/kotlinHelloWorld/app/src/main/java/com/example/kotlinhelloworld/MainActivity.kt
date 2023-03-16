package com.example.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: TextView = findViewById(R.id.meu_te)
        // toast show

        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text.text.toString() , duration)
        toast.show()
    }
}