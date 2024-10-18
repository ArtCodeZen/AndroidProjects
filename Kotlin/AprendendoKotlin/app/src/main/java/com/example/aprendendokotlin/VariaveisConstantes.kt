package com.example.aprendendokotlin
// variável do tipo const global! Em tempo de compilação
const val nome = "artcodezen"


fun correr() : String{
    // executa alguma coisa!
    return "CorrerArtCodeZen"
}
fun main(){
    var outroNome = correr()
    println("Testando ola mundo")
//    var nome = "Meu nome"
    println("O nome é: " + outroNome)

}