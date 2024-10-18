package com.example.aprendendokotlin

class NullSafety {
    var nome = "artcodezen"

    fun imprimirNome(){
        println(this.nome)
    }
}
class Carro{
    fun acelerar(){
        println("acelerando")
    }
}


fun main(){
    var obj = NullSafety()
    obj.imprimirNome()
    var carro:Carro? = null
    carro = Carro()
    // usar a interrogação ? para a chamada segura!
    // Se não utilizar a chamada segura teremos um problema
    // ex: carro?.acelerar()
    carro.acelerar()

}