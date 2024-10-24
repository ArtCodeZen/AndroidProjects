package com.example.aprendendokotlin
enum class StatusPedido{
    PENDENTE,
    EM_ANDAMENTO,
    PRONTO,
    ENTREGUE
}

class Pedido(
    var codigo: String,
    var statusPedido: StatusPedido
){
    fun mostrarStatus(){
        println("Status do pedido: $statusPedido")
    }
}

fun main(){
    var pedido = Pedido("123", StatusPedido.PENDENTE)
    pedido.mostrarStatus()
    if(pedido.statusPedido == StatusPedido.PENDENTE){
        println("Cliente em duvida")
    }
}