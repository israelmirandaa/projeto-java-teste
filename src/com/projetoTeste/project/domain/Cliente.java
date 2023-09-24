package com.projetoTeste.project.domain;

public class Cliente extends Pessoas implements PagamentoSeguro {
    private double carteira;

    public Cliente(String nome, double carteira) {
        super(nome);
        this.carteira = carteira;
    }

    @Override
    public void pagamento(double valor) {
        this.carteira -= valor;
    }



    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }
    public double getCarteira() {
        return carteira;
    }
}
