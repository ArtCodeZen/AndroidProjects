package com.example.recyclerviewaula.Examples

fun printStringLength(any: Any):Boolean{    // o geral traveco
    if(any is String){
        println(any.length)
        return true
    }
    if(any is Int){
        println("É um inteiro ${any}")
    }
    return false
}

fun main(){
    print(printStringLength("OK"))
    printStringLength(1)

}