package com.example.appsorteio;

import android.content.Context;

public class Usuario {
    Context context;
    Usuario(Context context){
        this.context = context;
    }
    public void logar(){
        Mensagem msg = new Mensagem(context);
        msg.enviarMensagem();
    }
}
