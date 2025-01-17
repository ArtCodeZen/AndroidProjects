package com.example.padraoadapter

class ConectorAdaptador(val conectorNovoPadrao: ConectorNovoPadrao): Conector{
    override fun quantidadePinos(): Int {
        return 2
    }

    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }
}

interface Conector{
    fun quantidadePinos() : Int
    fun ligarAparelho()
}
class TomadaAntiga(val conector: Conector){
    fun passarEnergia(){
        val qtdePinos = conector.quantidadePinos()
        if(qtdePinos == 2) {
            conector.ligarAparelho()
            println("Quantidade de pinos:  $qtdePinos")
            println("passando energia")
        }else{
            println("Essa tomada só funciona com 2 pinos você não pode")
        }
    }

}
class ConectorNovoPadrao : Conector{
    override fun quantidadePinos(): Int {
        return 3
    }

    override fun ligarAparelho() {
        println("Aparelho ligado!")
    }
}

fun main(){
    val conectorNovoPadrao = ConectorNovoPadrao()
    val conectorAdaptador =ConectorAdaptador(conectorNovoPadrao)
    val tomadaAntiga = TomadaAntiga(conectorAdaptador)
    tomadaAntiga.passarEnergia()
}