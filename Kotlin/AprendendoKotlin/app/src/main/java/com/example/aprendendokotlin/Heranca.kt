package com.example.aprendendokotlin


// para evitar intânciar a classe iremos transformar em abstract
// open = public
// abstract
abstract class Animal{      // open o mesmo que public em java
    var cor = ""
    var tamanho = "" // pequeno, médio e grande porte
    var peso = 0
    open fun dormir(){
        print("O animal ")
    }
    abstract fun comer()
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
    override fun comer(){
        println("cao está comendo")
    }

}
class Passaro : Animal(){


    fun voar(){
        println("passaro ${cor} está voando")
    }
    override fun dormir(){
        super.dormir()
        println("passaro está dormindo")
    }
    override fun comer(){
        println("passaro está comendo")
    }


}
fun main(){
    val nome:String = "artcodezen"

    val cao = Cao()
    cao.cor = "Marrom"
    cao.dormir()
    cao.comer()
    val passaro = Passaro()
    passaro.dormir()
}