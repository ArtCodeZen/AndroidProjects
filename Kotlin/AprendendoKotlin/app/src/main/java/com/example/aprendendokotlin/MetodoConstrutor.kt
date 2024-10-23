package com.example.aprendendokotlin

// classe com construtor primario
class UsuarioComConstrutor(var nome: String, var idade:Int) {
    /*
    init {
        this.nome = nome
        println("Objeto Usuario criado")
    }
    */
    fun printNomeEIdade() {
        println("Nome: $nome Idade: $idade")
    }

    // construtor secundário sem definir o nome
    constructor(nome: String) : this(nome, idade = 0) {
    }
}
fun main(){
    var user = UsuarioComConstrutor("artcodezen", 27)
    user.printNomeEIdade()
    var user2 = UsuarioComConstrutor("Maria", 30)
    user2.printNomeEIdade()

}