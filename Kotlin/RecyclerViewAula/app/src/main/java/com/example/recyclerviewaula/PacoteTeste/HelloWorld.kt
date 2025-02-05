package com.example.recyclerviewaula.PacoteTeste

open class auxiliar(){
    fun teste2(){
        print("Coisa 2")
    }
}
class Pessoa(var nome: String, var idade: Int) : auxiliar(){

    fun metodoImprimir(): String{
        return nome
    }
}
// função teste
fun funcao_test(nome: String){
    print(nome)
}
fun main(){
    /*var n: Double = 3.14
    n = 12.1
    var numero: Int

    var nome: String = "Henrique"
    var sobrenome: String? = null
    if(sobrenome.isNullOrEmpty()){
        print("Está nulo!")
    }

    *///funcao_test("Henrique ${n}", )

    var meuObj = Pessoa("Henrique", 28)
    meuObj.teste2()
}