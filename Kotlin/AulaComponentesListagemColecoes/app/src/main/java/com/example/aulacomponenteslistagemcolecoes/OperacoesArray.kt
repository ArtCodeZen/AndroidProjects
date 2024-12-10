package com.example.aulacomponenteslistagemcolecoes

class OperacoesArray {
}


fun main(){
    val lista = arrayOf("nome", "nome1")
    /*for(item in lista){
        println(item)
    }*/
    println(lista[0])
    println(lista.get(1))
    // usando o array não podemos adicionar itens ao array
    val novaLista = lista.plus("nome2")
    novaLista.forEach { item->
        println(item)
    }
    println("Tamanho da lista: " + lista.size)
    println("primeiro item:" + lista.first())
    println("ultimo item:" + lista.last())
    println("lista contem nome? " + lista.contains("nome"))

    var minhaArrayList = arrayListOf<String>()
    minhaArrayList.add("item1")
    minhaArrayList.add("item2")
    minhaArrayList.add("item3")
    minhaArrayList.add("item4")
    minhaArrayList.add("item5")

    for(item in minhaArrayList){
        println(item)
    }


}