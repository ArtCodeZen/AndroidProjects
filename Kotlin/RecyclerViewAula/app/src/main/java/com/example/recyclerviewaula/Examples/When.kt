package com.example.recyclerviewaula.Examples

fun whatNumber(x:Int){
    when(x){
        0 -> println("x é zero")
        1 -> println("x é 1")
        else -> println("x não é nenhum dos dois")
    }
}

fun whenMaiorMenor(x:Int, y: Int){
    when{
        x > y -> println("x é maior que y")
        y < x -> println("x é menor que y")
        else -> println("x igual a y")
    }
}

fun main(){
//    whatNumber(1)
//    whatNumber(10)
    whenMaiorMenor(1,2)
    whenMaiorMenor(100,40)
    whenMaiorMenor(100,100)



}