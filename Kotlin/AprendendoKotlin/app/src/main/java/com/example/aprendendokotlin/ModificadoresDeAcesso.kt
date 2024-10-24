package com.example.aprendendokotlin

open class Computador{
    private var modelo = ""

    fun ligar(){
        println("Ligando o computador")

    }
    protected open fun desligar() {
        println("Desligando o computador")
    }
    fun setModelo(modelo:String){ this.modelo = modelo
    }
    fun getModelo():String{
        return this.modelo
    }
}

fun main(){
    var pc = Computador()
    pc.ligar()
    
}