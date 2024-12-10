package com.example.aulacomponenteslistagemcolecoes
data class Cliente(val nome: String, val idade: Int)
fun main(){
    // arrayOf não pode ser adicionado ou excluido
    val listArray = arrayOf("item1", "item2")
    listArray[0] = "alterado"
    println(listArray[0])

    // vamos criar uma lista que podemos modificar
    val mutableList = mutableListOf("nome1", "nome2")
    mutableList.add("nome3")

    for(item in mutableList){
        println(item)
    }
    // adicionar todos os item de uma lista em outra lista
    mutableList.addAll(listArray)
    for(item in mutableList){
        println(item)
    }

    val cliente1 = Cliente("santos", 10)
    val cliente2 = Cliente("ana", 30)
    val listaClientes = mutableListOf(cliente1, cliente2)
    //listaClientes.clear() // limpar a lista completamente
    // println(listaClientes[0].nome.contains("santos"))
    var novalista = listaClientes.shuffled()
    listaClientes.forEach { cliente ->
        println(cliente.nome)
        println(cliente.idade)
        println()
    }
    // nova lista embaralhada
    novalista.forEach { cliente ->
        println(cliente.nome)
        println(cliente.idade)
        println()
    }

}