package com.example.aulacomponenteslistagemcolecoes

fun main(){
    val listNomes = listOf("nome1", "nome2")
    val listNumeros = listOf(2,5,3)
    // ordenando números
    val novaListaDeNumeros = listNumeros.sorted()
    println(novaListaDeNumeros)
    // ordenando nomes
    val novaListaDeNomes = listNomes.sortedDescending()
    println(novaListaDeNomes)

}