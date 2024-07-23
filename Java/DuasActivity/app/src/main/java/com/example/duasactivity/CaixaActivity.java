package com.example.duasactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class CaixaActivity extends AppCompatActivity {
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caixa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btn = findViewById(R.id.botaoSalvar);
        TextInputEditText text = findViewById(R.id.editText);
        // EXPRESSÃO NORMAL COM OVERRIDE
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                Toast.makeText(getApplicationContext(), "Clicou: " + contador, Toast.LENGTH_SHORT).show();
                *//*Button myButton = (Button)view;
                myButton.setText("OK");*//*
                ((Button) view).setText("Caixa");

            }
        });*/
        // USANDO EXPRESSÃO LAMBDA
        btn.setOnClickListener(view -> {
            contador++;
            if(text.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "App fechado email vazio" , Toast.LENGTH_SHORT).show();
                finishAffinity();

            }
            Toast.makeText(getApplicationContext(), text.getText().toString() , Toast.LENGTH_SHORT).show();
            /*Button myButton = (Button)view;
            myButton.setText("OK");*/
            ((Button) view).setText("Caixa");

        });

    }
/*    // função de clique - Modo normal de função
    public void executar(View view){

    }*/
}