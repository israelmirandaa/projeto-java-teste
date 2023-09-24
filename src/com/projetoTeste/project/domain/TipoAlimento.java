package com.projetoTeste.project.domain;

public enum TipoAlimento {
    ALGODAO_DOCE("Algodão doce"),
    PIPOCA("Pipoca"),
    AMEDOIN("Amedoin"),
    CHURROS("Churros");

    public final String alimento;

     TipoAlimento(String alimento) {
        this.alimento = alimento;
    }

}
