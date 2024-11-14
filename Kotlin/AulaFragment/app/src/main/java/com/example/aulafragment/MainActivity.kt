package com.example.aulafragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aulafragment.Fragment.ChamadasFragment
import com.example.aulafragment.Fragment.ConversasFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

        btnConversas.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_conteudo, ConversasFragment())
                .commit()
        }
        btnChamadas.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
                .commit()
        }
        // primeira opçãp
//        val fragmentManager = supportFragmentManager.beginTransaction()
//        fragmentManager.add(R.id.fragment_conteudo, ConversasFragment())
//        fragmentManager.commit()

        // segunda opção
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_conteudo, ConversasFragment())
            .commit()

    }
}