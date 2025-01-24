package com.example.recyclerviewaula.Examples

class InnerClassTest {
    inner class Internal{
        fun printHello(){
            println("Hello")
        }
        var value:Int = 10
    }
}
fun main(){
    val obj = InnerClassTest()
    var objInternal = obj.Internal()
    objInternal.printHello()
    println(objInternal.value)
}