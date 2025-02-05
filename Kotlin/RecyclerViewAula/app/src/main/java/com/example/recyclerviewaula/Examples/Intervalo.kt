package com.example.recyclerviewaula.Examples

fun main(){
    val aToZ = "a".."z" // abcde....z
    val numbers = 1..100
    val x = 10
    val isTrue = "c" in aToZ
    if(x in numbers) println("$x Está no intervalo")

    val mySequence = 1..50
    mySequence.forEach{
        if(it % 2 == 0){
            println(it)
        }
    }

//    // meio perigoso
//    val numeroPar = mySequence.step(2)
//    numeroPar.forEach{
//        println(it)
//
//    }
}