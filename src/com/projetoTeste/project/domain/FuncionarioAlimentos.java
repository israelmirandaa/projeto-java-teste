package com.projetoTeste.project.domain;

public class FuncionarioAlimentos extends Funcionario  {
   ;
    private TipoAlimento alimentos;
    private double salario;
    private double precoAlimentos;



    public FuncionarioAlimentos(String nome, String horarioDeTrabalho, TipoAlimento alimentos) {
        super(nome, horarioDeTrabalho);
        this.salario = 0;
        this.alimentos = alimentos;
    }

    public void vender(int quantidade, TipoAlimento alimentos, double dinheiro) {
        valorALimento(alimentos);
        if (dinheiro > 0) {
            this.salario = salario + this.precoAlimentos * quantidade;
            return;
        }
        System.out.println("Dinheiro insuficiente");

    }

    private void valorALimento(TipoAlimento alimentos) {
        switch (alimentos) {
            case ALGODAO_DOCE -> this.precoAlimentos = 5;
            case PIPOCA, AMEDOIN -> this.precoAlimentos = 10;
            case CHURROS -> this.precoAlimentos = 15;
        }

    }


    public TipoAlimento getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(TipoAlimento alimentos) {
        this.alimentos = alimentos;
    }
    public double getSalario() {
        return this.salario;
    }

}
