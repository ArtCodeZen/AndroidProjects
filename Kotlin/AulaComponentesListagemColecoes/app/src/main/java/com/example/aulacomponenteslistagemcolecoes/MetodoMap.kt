package com.example.aulacomponenteslistagemcolecoes

//main
fun main(){
    val lista = listOf("item1", "item2")
    // lista vazia
    //val novaLista = mutableListOf<String>()
/*
    lista.forEach{
        it -> novaLista.add(it.uppercase())

    }
    novaLista.forEach {
        item -> println(item)
    }*/

    // percorrer a lista com map e converter para uppercase
    val novaLista = lista.map{
        it.uppercase()
    }
    novaLista.forEach {
        item -> println(item)

    }

}