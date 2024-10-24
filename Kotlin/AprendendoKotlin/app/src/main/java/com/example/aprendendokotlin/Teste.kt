package com.example.aprendendokotlin
class device : Computador(){
    override fun desligar(){
        println("desligando o device")
    }
    fun desligarPC(){
        desligar()
    }
}
// protected evita a utilização de métodos que não foram herdados pela classe filha,
// apenas a classe filha pode utilizar. O que instancia não tem acesso.
fun main(){
    var pc = device()
    pc.setModelo("AMD")
    pc.desligarPC()
}