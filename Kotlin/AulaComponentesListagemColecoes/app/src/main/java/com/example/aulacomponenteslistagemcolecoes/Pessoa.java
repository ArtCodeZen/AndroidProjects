package com.example.aulacomponenteslistagemcolecoes;

public class Pessoa {
    String nome;

    public String getNome() {
        System.out.println("getNome Chamado");
        return nome;
    }

    // modo varargs
    public void salvarTelefone(int id, String ...telefones){

        for(String telefone : telefones){
            System.out.println("telefone: " + telefone);
        }


    }
    public void setNome(String nome) {
        System.out.println("setNome Chamado");
        this.nome = nome;
    }
}
