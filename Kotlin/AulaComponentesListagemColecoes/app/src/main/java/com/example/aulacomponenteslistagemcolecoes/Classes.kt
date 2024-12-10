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
// classe de Dados

data class Pergunta(var pergunta: String, var resposta: Int){
    fun exibir() = println("Exibir")
}
fun main(){

    val pergunta1 = Pergunta("Qual a cor do cavalo branco de Napoleao?", 1)
    val pergunta2 = Pergunta("Qual a cor do cavalo branco de Napoleao?", 1)
    // a saída é true pois os dados inseridos são iguais!
    // println("Os dados são iguais? ${pergunta1 == pergunta2}")

    // Exemplo de destructuring ou desestruturação
    val (pergunta, resposta) = pergunta1
    val p = pergunta1.pergunta
    val r = pergunta1.resposta
    println("Pergunta: $pergunta, Resposta: $resposta")



    /*val caminhao = Motorista("Joao")
    caminhao.exibeNome()
    caminhao.Caminhao("Caminhao 1").exibirDadosCaminhao()
*/
 /*   val motorista = Motorista("Joao")
    motorista.exibeNome()*/

}