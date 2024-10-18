package com.example.aprendendokotlin

// classe com construtor primario
class UsuarioComCosntrutor(var nome: String, var idade:Int) {

    init {
        this.nome = nome
        println("Objeto Usuario criado")
    }

    fun printNomeEIdade() {
        println("Nome: $nome Idade: $idade")
    }

    // construtor secundário sem definir o nome
    constructor(nome: String) : this(nome, 0) {
    }
}
fun main(){
    var user = UsuarioComCosntrutor("artcodezen", 27)
    user.printNomeEIdade()
}