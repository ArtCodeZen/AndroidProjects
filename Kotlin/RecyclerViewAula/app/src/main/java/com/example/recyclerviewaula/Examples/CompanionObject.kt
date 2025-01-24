package com.example.recyclerviewaula.Examples

class CompanionObject {
    companion object {
        fun printHello() {
            println("Hello")
        }
    }
}
fun main(){
    val obj = CompanionObject.printHello()
    println(obj)
}