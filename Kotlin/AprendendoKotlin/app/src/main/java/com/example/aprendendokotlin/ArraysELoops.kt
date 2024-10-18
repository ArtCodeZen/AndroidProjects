package com.example.aprendendokotlin

fun main(){
    var meuArray = arrayOf("Ana", "Maria", "João")
    var outroArray = emptyArray<String>().toMutableList()



    var numero = 0

    while (numero < 10){
        println("Valor impresso ${numero + 1}")
        numero++

    }
    for(i in 1..10){
        println("Valor do for ${i}")
    }
    //listagem de nomes
    for(nome in meuArray){
        println(nome)
        outroArray.add(nome)

    }
    for(nome in outroArray){
        println("Nome em outro array ${nome}")
    }

    // com for indice
    for((index, nome) in meuArray.withIndex()){
        println("Nome no indice ${index} é ${nome}")
    }
}