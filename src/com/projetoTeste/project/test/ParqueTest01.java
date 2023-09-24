package com.projetoTeste.project.test;

import com.projetoTeste.project.service.Parque;
import com.projetoTeste.project.domain.*;

public class ParqueTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new FuncionarioAlimentos("Fulano", "07 as 05",TipoAlimento.PIPOCA);
        Funcionario funcionarioBrinquedos = new FuncionarioBrinquedos("Sicrano", "07 as 05", "Barca");
        Pessoas cliente1 = new Cliente("Joao",3040);
        Pessoas[] pessoas = {cliente1, funcionarioBrinquedos, funcionario};
        Parque parque = new Parque(pessoas, 2);

        System.out.println(parque);









    }
}
