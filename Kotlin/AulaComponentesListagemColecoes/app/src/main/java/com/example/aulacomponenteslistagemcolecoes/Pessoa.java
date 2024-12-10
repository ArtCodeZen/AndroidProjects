package com.example.aulacomponenteslistagemcolecoes;

public class Pessoa {
    String nome;

    public String getNome() {
        System.out.println("getNome Chamado");
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("setNome Chamado");
        this.nome = nome;
    }
}
