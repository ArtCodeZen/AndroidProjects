package com.example.aulacomponenteslistagemcolecoes
class Matematica{
    fun somar(n1: Int, n2: Int): Int{
        return n1 + n2
    }
}


fun calcular(funcao: (Int, Int) -> Int){
    println(funcao(10,10))
}
fun main(){
    val matematica = Matematica()
    calcular(matematica::somar)
}