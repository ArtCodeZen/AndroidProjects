package com.example.aulacomponenteslistagemcolecoes

fun main(){
    val listLanches = listOf("Hamburger", "Batata")
    val listBebidas = listOf("Refrigerante", "Suco")
    val listaExclusao = listOf("Refrigerante")
    val novaLista = listBebidas.union(listLanches)
    var listaJuntadaPlus = listBebidas + listLanches
    novaLista.forEach{
        println(it)

    }
    println("--------")
    listaJuntadaPlus = listaJuntadaPlus.minus(listaExclusao)
    listaJuntadaPlus.forEach{
        item -> println(item)
    }



}