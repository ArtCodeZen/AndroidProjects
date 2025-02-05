package com.example.recyclerviewaula.Examples.ModificadorAcesso

import java.io.BufferedReader
import java.io.File
import kotlin.io.readText
import kotlin.io.use


// final no java é constante

// No kotlin val é constante
val PI = 3.14
val E = 2.178

val caminho : String = "arquivo.txt"
class Person(val name: String){
    //private fun age(): Int = 21

    private fun age():Int{
        return 21
    }
    // tudo o que aberto é open e open é public
    private fun fazerAlgo(){
        println("Pi $PI")
        println("Pi $E")
    }
    fun executar(): Int{
        fazerAlgo()
        return age()

    }

    fun tratadoComException(){
        try {
            fazerAlgo()
        }catch (e: Exception){
            println(e.message)
        }
    }
    fun abrirArquivo(){
        // precisa colocar o caminho completo
        val file = File("/home/artcodezen/Documentos/GITHUB/AndroidProjects/Kotlin/RecyclerViewAula/app/src/main/java/com/example/recyclerviewaula/Examples/ModificadorAcesso/arquivo.txt")
        if (file.exists()) {
            val bufferedReader: BufferedReader = file.bufferedReader()
            val inputString = bufferedReader.use { it.readText() } // Read the entire file content
            println(inputString)
        } else {
            println("File not found.")
        }
    }
}

fun main(){
    var person = Person("Henrique")
    println(person.name)
    println(person.executar())
    person.abrirArquivo()
}


