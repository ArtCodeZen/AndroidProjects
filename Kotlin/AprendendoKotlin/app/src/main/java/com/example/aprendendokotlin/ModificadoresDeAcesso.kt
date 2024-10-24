package com.example.aprendendokotlin
// interface cria um contrato que as classes que implementam devem seguir

interface firewall{
    fun bloquear(ip:String)
}
open class Computador : firewall{
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

    override fun bloquear(ip: String) {
        println("Bloqueando o ip $ip")
    }
}

fun main(){
    var pc = Computador()
    pc.ligar()
    pc.bloquear("192.168.0.1")
    
}