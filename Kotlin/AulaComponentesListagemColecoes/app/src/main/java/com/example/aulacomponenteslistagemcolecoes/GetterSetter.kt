package com.example.aulacomponenteslistagemcolecoes
class Usuario(){
    var nome: String = ""
        get(){
            println("get: $field")
            return field.uppercase()
        }
        set(value){
            println("set: $value")
            field = "set: $value"

        }
    var idade: Int = 0
    val maiorIdade
        get() =  idade >= 18



}

fun main(){
    // exemplo usando o java get set
   /* var pessoa = Pessoa()
    pessoa.nome = "ssd"
    pessoa.setNome("Maria")

    println(pessoa.getNome())*/
    var usuario = Usuario()
    usuario.nome = "Maria"
    usuario.idade = 15
    print(usuario.nome)
    println("maior idade? ${usuario.maiorIdade}")
}