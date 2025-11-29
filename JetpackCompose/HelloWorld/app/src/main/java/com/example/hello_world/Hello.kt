package com.example.hello_world

fun main(){
    println("Hello")
    val x : UInt = 100u
    val mychar : Char = '\u00AE'
    var idade = 0
    print("Digite sua idade: ")
    idade = readln().toInt()
    if(idade >= 100){
        println("x is greater than or equal to 100 " + mychar)

    }else{
        println("A idade não é menor que 100")
    }
}