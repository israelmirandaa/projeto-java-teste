package com.projetoTeste.project.domain;

public class FuncionarioBrinquedos extends Funcionario implements PagamentoSeguro {
    private String brinquedo;
    private final double rendimentoBrinquedo;



    public FuncionarioBrinquedos(String nome, String horarioDeTrabalho, String brinquedo) {
        super(nome, horarioDeTrabalho);
        this.brinquedo = brinquedo;
        this.rendimentoBrinquedo = 0;

    }

    @Override
    public void pagamento(double valor) {
        this.salario = rendimentoBrinquedo;

    }



    public String getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    public double getRendimentoBrinquedo() {
        return rendimentoBrinquedo;
    }


}
