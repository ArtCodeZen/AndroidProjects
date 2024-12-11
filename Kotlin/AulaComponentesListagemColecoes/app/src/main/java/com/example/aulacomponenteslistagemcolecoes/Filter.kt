package com.example.aulacomponenteslistagemcolecoes

fun main(){
    var list = listOf("maça", "banana", "laranja")
    var listaVendas = listOf(100, 200, 300)

    val novaLista = list.filter { fruta
        -> fruta.contains("ba")

    }
    val novaListaVendas = listaVendas.filter { vendas -> vendas > 200 }
    for(item in novaLista){
        println(item)
    }

    for(item in novaListaVendas){
        println(item)
    }
    println(list.contains("banana"))
}