package com.example.aulaactivityfragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var buttonAbrir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonAbrir = findViewById(R.id.button_abrir)
        buttonAbrir.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)
            //intent.putExtra("filme", "the walking dead")

            val filme = Filme(
                "the walking dead",
                "filme de zumbi",
                5.00,
                "Scott M. Gimple",
                "teste de imagem"

            )
            intent.putExtra("filme", filme)
            startActivity(intent)

            // passar parâmetros

        }
        Log.i("Ciclo de vida", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo de vida", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de vida", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo de vida", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo de vida", "onDestroy")
    }


}