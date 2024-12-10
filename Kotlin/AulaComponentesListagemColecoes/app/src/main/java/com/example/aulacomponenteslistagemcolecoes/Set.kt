package com.example.aulacomponenteslistagemcolecoes

class Carro(val cor: String, val ano: Int, val modelo: String) {
}

fun main(){
    // o set remove automaticamente nomes iguais

    val lista = setOf("james","james", "iana", "pedro")
    lista.forEach{nome ->
        println(nome)}


    println()
    // mutable setof
    val mutableLista = mutableSetOf("james","james", "iana", "pedro")
    mutableLista.add("maria")
    mutableLista.forEach{nome ->
        println(nome)}

}
