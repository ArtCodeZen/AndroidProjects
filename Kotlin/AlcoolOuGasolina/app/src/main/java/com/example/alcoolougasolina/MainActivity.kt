package com.example.alcoolougasolina

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    // alcool
    private lateinit var textInputAlcool : TextInputLayout
    private lateinit var editAlcool : TextInputEditText
    // gasolina
    private lateinit var textInputGasolina : TextInputLayout
    private lateinit var editGasolina : TextInputEditText

    // button
    private lateinit var buttonCalcular : Button
    // text resultado
    private lateinit var textResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        inicializarComponentesInterface()
        buttonCalcular.setOnClickListener {
            calcularMelhorPreco()
        }
    }
    private fun calcularMelhorPreco() {
        val precoAlcool = editAlcool.text.toString()
        val precoGasolina = editGasolina.text.toString()
        val resultado = validarCampos(precoAlcool, precoGasolina)
        if(resultado){
            val valorAlcool = precoAlcool.toDouble()
            val valorGasolina = precoGasolina.toDouble()
            val resultadoFinal = valorAlcool / valorGasolina
            if(resultadoFinal >= 0.7){
                textResultado.text = "Melhor utilizar gasolina"
            }else{
                textResultado.text = "Melhor utilizar álcool"
            }
        }


    }
    private fun validarCampos(precoAlcool : String, precoGasolina : String) : Boolean {
        //resetar o erro
        textInputAlcool.error = null
        textInputGasolina.error = null

        // testar se está vazio
        if(precoAlcool.isEmpty()){
            textInputAlcool.error = "Digite o preço do álcool"
            return false
        }
        if(precoGasolina.isEmpty()){
            textInputGasolina.error = "Digite o preço da gasolina"
            return false
        }
        return true
    }
    private fun inicializarComponentesInterface() {
        textInputAlcool = findViewById(R.id.text_input_alcool)
        editAlcool = findViewById(R.id.edit_alcool)
        // inicializar gasolina
        textInputGasolina = findViewById(R.id.text_input_gasolina)
        editGasolina = findViewById(R.id.edit_gasolina)
        // btn calcular
        buttonCalcular = findViewById(R.id.btn_calcular)
        // text resultado
        textResultado = findViewById(R.id.text_resultado)

    }


}