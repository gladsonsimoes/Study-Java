package com.company.orientacao_a_objetos.mais_detalhes_e_framework._7_11_introducao_a_generics;


import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {

    public static void main(String[] args) {
        List<Funcionario> nomes = new ArrayList<>();
        nomes.add(new Funcionario("Ricardo"));

        Funcionario f = RetiraElementos.recuperarPrimeiro(nomes);
        System.out.println(f.getNome());
    }
}
