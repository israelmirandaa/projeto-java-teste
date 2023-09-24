package com.projetoTeste.project.domain;

public abstract class Pessoas {
    protected String nome;
    protected short idade;

    public Pessoas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public short getIdade() {
        return idade;
    }


}
