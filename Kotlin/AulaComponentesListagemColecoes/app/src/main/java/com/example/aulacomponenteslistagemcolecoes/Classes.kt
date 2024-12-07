package com.example.aulacomponenteslistagemcolecoes

class Motorista(val nome: String){
    fun exibeNome() = println("Nome do motorista: $nome")
    /*class Caminhao(val nomeCaminhao: String){ // Classe aninhada ( Nested class)
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")
    }*/
    // inner class
    // possui uma relação com a classe motorista
    inner class Caminhao(val nomeCaminhao: String){
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")
    }
}

fun main(){
    val caminhao = Motorista("Joao")
    caminhao.exibeNome()
    caminhao.Caminhao("Caminhao 1").exibirDadosCaminhao()
    
 /*   val motorista = Motorista("Joao")
    motorista.exibeNome()*/

}