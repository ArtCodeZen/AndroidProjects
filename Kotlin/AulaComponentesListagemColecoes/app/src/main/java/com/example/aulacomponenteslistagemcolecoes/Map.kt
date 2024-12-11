package com.example.aulacomponenteslistagemcolecoes
data class Produto(val nome: String, val preco: Double)
fun main(){
    //val lista = mapOf(0 to "nome1", 1 to "nome2")
    val lista = mutableMapOf(0 to Produto("prod1", 22.22), 1 to Produto("prod2", 33.33))

    //exibir os dados da lista

    lista.forEach{
        println(it.value.nome)
        println(it.value.preco)
    }



}


