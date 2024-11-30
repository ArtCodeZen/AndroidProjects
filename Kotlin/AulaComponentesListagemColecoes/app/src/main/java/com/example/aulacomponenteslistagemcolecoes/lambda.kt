package com.example.aulacomponenteslistagemcolecoes
class Botao{
    fun configurarCliqueBotao(nome: String, funcao: () -> Unit){
        funcao()
        println("Nome do botão: $nome")
    }
    fun configurarCliqueBotao(funcao: (String) -> Unit){
        funcao("com parametro artcodezen")
    }
}
fun executarClique(){
    println("Executando clique")
}
fun main(){
    println("ola")
   /* val funcaoLambda = { nome : String ->
        println("funcao lambda $nome")
    }
    funcaoLambda("artcodezen")*/
    val botao = Botao()
    botao.configurarCliqueBotao("artcodezen"){
        println("Executando clique")
    }
    botao.configurarCliqueBotao{ nome ->
        println("Executando clique com parametro Nome: $nome")
    }

}