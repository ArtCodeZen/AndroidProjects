package com.example.aulaactivityfragment

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesActivity : AppCompatActivity() {
    lateinit var buttonFechar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // adicionar listener no botão fechar
        buttonFechar = findViewById(R.id.button_fechar)
        val bundle = intent.extras   // variável do tipo bundle que recebe os dados da intent
        var filme: Filme? = null     // variável do tipo filme
        // if para testar a versão do android
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            filme = bundle?.getSerializable("filme", Filme::class.java)
        }else
            filme = bundle?.getSerializable("filme") as Filme      // forma antiga

        Toast.makeText(this, "Nome do filme: ${filme?.descricao}", Toast.LENGTH_SHORT).show()

        buttonFechar.setOnClickListener {
            Toast.makeText(this, "Botão fechar clicado", Toast.LENGTH_SHORT).show()
            finish()
        }


    }

}