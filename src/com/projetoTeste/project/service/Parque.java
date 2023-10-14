package com.projetoTeste.project.service;


import com.projetoTeste.project.domain.*;

import java.util.Arrays;

public class Parque implements PagamentoSeguro {
    private static final String horarioFuncionamento = "07:00 as 17:00";
    private double lucro;
    private ListaPessoas[] clientes;
    private Funcionario[] funcionarios = new Funcionario[10];
    private int tamanho;
    public final int numeroFuncionarios = 10;


    public Parque(Pessoas[] pessoas, int capacidade) {
        this.entradaFuncionarios(pessoas);
        this.tamanho = 0;


    }

    private void entradaFuncionarios(Pessoas[] pessoas) {
        limiteFuncionarios();
        for (int i = 0; i < pessoas.length;i++) {
            if (pessoas[i] instanceof Funcionario) {
                this.funcionarios[i] = (Funcionario) pessoas[i];

            }

        }

    }

    @Override
    public void pagamento(double valor) {
        for (int i = 0; i < this.numeroFuncionarios;i++) {
            this.lucro = funcionarios[i].getSalario() / 20 * 100;

        }

    }




    public void limiteFuncionarios() {
        if (this.funcionarios.length == 10) {
            System.out.println("Todos os funcionários já chegaram");
            return;

        }
    }


    @Override
    public String toString() {
        return "-----------------------Parque----------------" + "\n" +
                "\n" + "clientes: " + Arrays.toString(clientes) +"\n" +
                " tamanho: " + tamanho + "\n" +
                " funcionarios: " + Arrays.toString(funcionarios) + "\n" +
                " numeroFuncionarios: " + numeroFuncionarios;
    }
}



