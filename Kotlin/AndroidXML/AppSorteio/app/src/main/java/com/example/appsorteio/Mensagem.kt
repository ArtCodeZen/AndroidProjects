package com.example.appsorteio

import android.content.Context
import android.widget.Toast

class Mensagem {
    var context: Context
    constructor(context: Context) {
        this.context = context
    }
    fun enviarMensagem(){
        Toast.makeText(context, "Número foi sorteado", Toast.LENGTH_SHORT).show()
    }
}