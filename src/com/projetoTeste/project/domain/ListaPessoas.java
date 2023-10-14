package com.projetoTeste.project.domain;



public class ListaPessoas <T> {
    protected T[] elementos;
    protected int tamanho;


    public ListaPessoas (int capacidade) {
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = 0;

    }

    public ListaPessoas () {
        this(10);
    }

    public void adicionar(T elemento) {
        this.elementos[tamanho++] = elemento;
    }

    public boolean adicinar(int posicao, T elemento) {
        for (int i = posicao; i > this.tamanho;i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        return true;
    }

    private void aumentarTamanho() {
        T[] novosElementos = (T[])new Object[this.elementos.length];
       if(this.elementos.length == this.tamanho) {
           novosElementos = this.elementos;
       }
       this.elementos = novosElementos;

    }




}
