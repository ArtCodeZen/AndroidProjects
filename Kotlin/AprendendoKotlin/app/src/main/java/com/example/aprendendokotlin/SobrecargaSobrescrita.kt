package com.example.aprendendokotlin

class Usuario{
    fun logar(email: String, senha: String): Boolean{
        println("usuario logado com sucesso! usando o email")
        return true
    }
    fun logar(telefone: Int, senha: String): Boolean{
        println("usuario logado com sucesso! usando o telefone")
        return true
    }
    fun cadastrar(email: String, senha: String): Boolean{
        println("usuario cadastrado com sucesso!")
        return true
    }
    fun alterarSenha(senha: String): Boolean{
        println("senha alterada com sucesso!")
        return true
    }
    fun alterarEmail(email: String): Boolean{
        println("email alterado com sucesso!")
        return true
    }
    fun deletarConta(): Boolean{
        println("conta deletada com sucesso!")
        return true
    }


}
fun main(){
    var user = Usuario()
    user.logar(123, "sdsd")
}