package com.example.aulacomponenteslistagemcolecoes

class Mensagem(
    val mensagem: String,
    val duracao: Int
){
    companion object{
        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1
        fun construirTexto(mensagem: String, duracao: Int) : Mensagem{
            return Mensagem(mensagem, duracao)
        }
    }

    fun exibir(){
        println("Msg: $mensagem, Duracao: $duracao")
    }

}

fun main(){
    Mensagem.construirTexto("Ola mundo", Mensagem.DURACAO_LONGA).exibir()
}