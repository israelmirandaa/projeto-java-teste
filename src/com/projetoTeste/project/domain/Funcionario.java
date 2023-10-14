package com.projetoTeste.project.domain;

public class Funcionario extends Pessoas {
    protected String horarioDeTrabalho;
    protected double salario;


    public Funcionario(String nome, String horarioDeTrabalho) {
        super(nome);
        this.horarioDeTrabalho = horarioDeTrabalho;

    }

    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    public double getSalario() {
        return salario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "horarioDeTrabalho: " + horarioDeTrabalho + '\'' +
                " salario: " + salario +
                " nome: " + nome + '\'' +
                " idade: " + idade +
                '}';
    }

}
