package com.example.calculadoraimc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {
    private lateinit var textPeso: TextView
    private lateinit var textAltura: TextView
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textPeso = findViewById(R.id.text_peso)
        textAltura = findViewById(R.id.text_altura)
        textResultado = findViewById(R.id.text_resultado)
        val bundle = intent.extras
        if(bundle != null){
            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")
            textPeso.text = "Peso informado: ${peso} kg"
            textAltura.text = "Altura informada: ${altura} m"

            val imc = peso / (altura * altura)
            if(imc < 18.5){
                textResultado.text = "Resultado: Abaixo do peso"
            }
            if(imc >= 18.5 && imc <= 24.9){
                textResultado.text = "Resultado: Peso normal"
            }
            if(imc >= 25 && imc <= 29.9){
                textResultado.text = "Resultado: Sobrepeso"
            }
            if(imc in 30.0..34.9){
                textResultado.text = "Resultado: Obesidade grau 1"
            }


        }

    }
}