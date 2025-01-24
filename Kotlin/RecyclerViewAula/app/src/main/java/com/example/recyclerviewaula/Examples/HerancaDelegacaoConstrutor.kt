package com.example.recyclerviewaula.Examples

open class Pessoa(var nome: String){

}

class Aluno(nome: String, var matricula:Int): Pessoa(nome){

}

fun main(){
    val aluno = Aluno("artcodezen", 123)
    println("Nome ${aluno.nome} com registro de matricula ${aluno.matricula}")
}