package com.example.aprendendokotlin
open class Animal{      // open o mesmo que public em java
    var cor = ""
    var tamanho = "" // pequeno, médio e grande porte
    var peso = 0
    open fun dormir(){
        print("O animal ")
    }
}
class Cao : Animal(){

    fun correr(){
        println("cao ${cor} está correndo ")
    }
    // override funciona como o @Override do java sobreescrever um metodo
    override fun dormir(){
        super.dormir()
        println("cao está dormindo")
    }   
}
class Passaro : Animal(){


    fun voar(){
        println("passaro ${cor} está voando")
    }


}
fun main(){
    val nome:String = "artcodezen"
    val cao = Cao()
    cao.cor = "Marrom"
    cao.dormir()
    val passaro = Passaro()
    passaro.dormir()
}