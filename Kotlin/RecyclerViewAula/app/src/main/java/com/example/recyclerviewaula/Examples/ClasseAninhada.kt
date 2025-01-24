package com.example.recyclerviewaula.Examples

class ClasseAninhada {
    var value: Int = 10

    class ClasseInterna {
        fun printHello() {
            println("Hello")
            // println(value) classe aninhada não consegue acessar membros da classe externa
            // classe inner consegue acessar membros da classe externa
        }

    }
}
fun main(){
    val obj = ClasseAninhada.ClasseInterna()
    obj.printHello()

}