package com.example.recyclerviewaula

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {
    private lateinit var rvLista: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var lista = listOf(
                Mensagem("Haha ", "Ola tudo bem", "12:00"),
                Mensagem("kkk ", "vixe", "11:00"),
                Mensagem("naaa ", "Olha só", "22:00"),
                Mensagem("E ai", "meu amigo", "13:22"),
                Mensagem("E ai", "meu amigo", "13:22"),
                Mensagem("E ai", "meu amigo", "13:22",)
        )
        rvLista = findViewById(R.id.rv_lista)
        // adapter só usa o adapter
        rvLista.adapter = MensagemAdapter(lista) //
        rvLista.layoutManager = LinearLayoutManager(this)
    }
}