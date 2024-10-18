package com.example.aprendendokotlin
fun soma(a : Int, b: Int): Int{
    return a + b
}
fun validarValores(a : Int, b : Int) : Boolean{
    if(a < 0 || b < 0){
        return false
    }
    return true
}
fun main(){
    println("Hello Kotlin " + soma(2,3));
    println("Hello Kotlin " + validarValores(2,1));
}
