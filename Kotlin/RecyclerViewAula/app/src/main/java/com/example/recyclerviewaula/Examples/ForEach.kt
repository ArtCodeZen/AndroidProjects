package com.example.recyclerviewaula.Examples

fun main(){
    var list = listOf(1,2,3,4)
    var lista2 = mutableListOf(1,2,3,4)
    var lista3 = mutableListOf("a", "b", "stop", "c")
    for (i in list){
        println(i)
    }
    // alterado para o valor 100
    lista2[0] = 100
    lista2.forEach{
        println(it) // isso daqui é it
        // it 100
        // it 2
    }

    lista3.forEach{
        if(it == "stop") return@forEach
        else println(it)
    }



}