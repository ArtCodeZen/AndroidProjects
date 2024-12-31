package com.example.aulacomponenteslistagemcolecoes

data class Product(
    var nome: String,
    var preco: Double
){
    fun desativar(){
        println("Produto $nome com preço: $preco foi desativado")
    }
    fun metodo(){

    }
}
fun salvarProduto(produto: Product){

}
class alertMensagem{
    fun configurarTitulo(titulo: String) = println(titulo)
    fun configurarDescricao(descricao: String) = println(descricao)

    fun configuraCancelar() = println("Cancelar")
    fun configuraConfirmar() = println("Confirmar")

}
fun main(){
    var produto: Product? = null

    // usuário é que pode escolher ou não um produto
    produto = Product("Notebook", 1200.00)
    if ( produto != null){
        produto.preco = 1100.00
        salvarProduto(produto)

    }
    // virifica se não é nulo e executa o bloco de código
    produto?.let {
        it.nome = "Notebook_nvidia"
        it.preco = 1100.00
        salvarProduto(produto)
    }
    // usando o run para executar um bloco de código
    produto?.run{
        desativar()
    }
    val novoObjeto = with(produto){
        desativar()
        this        // retorna o novo objeto
    }

    println(produto?.nome)
    println(produto?.preco)

    var alertaMensagem = alertMensagem()
    alertaMensagem.configurarTitulo("Titulo")
    alertaMensagem.configurarDescricao("Você tem certeza que deseja continuar?")
    alertaMensagem.configuraCancelar()
    alertaMensagem.configuraConfirmar()
}
