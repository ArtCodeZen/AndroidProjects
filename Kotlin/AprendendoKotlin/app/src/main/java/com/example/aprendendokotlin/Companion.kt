package com.example.aprendendokotlin
// Companion Object facilita a chamada de constantes
// Em java seria static final
class Motor(var nome: String, var cilindrada: Int){
    companion object{
         val PESO_MAXIMO = 1000
    }
}


fun main(){

    println("Peso máximo do motor: ${Motor.PESO_MAXIMO}")
}