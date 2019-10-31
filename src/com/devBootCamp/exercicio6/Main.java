package com.devBootCamp.exercicio6;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("Empregado", "1034685163", BigDecimal.valueOf(1500), 15D);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("CPF: " + empregado.getCpf());
        System.out.println("Salário: " + empregado.calcularSalario());
        System.out.println("***************************");

        System.out.println("Vendedores:");
        Vendedor vendedor1 = new Vendedor("Vendedor 1", "6546846543", BigDecimal.valueOf(1000), 10D,
                500D, 5D);
        System.out.println("Nome: " + vendedor1.getNome());
        System.out.println("CPF: " + vendedor1.getCpf());
        System.out.println("Valor produtos vendidos: " + vendedor1.getValorProdutosVendidos());
        System.out.println("Salário: " + vendedor1.calcularSalario());
        System.out.println("***************************");

        Vendedor vendedor2 = new Vendedor("Vendedor 2", "63876546788", BigDecimal.valueOf(1200), 10D,
                1000D, 5D);
        System.out.println("Nome: " + vendedor2.getNome());
        System.out.println("CPF: " + vendedor2.getCpf());
        System.out.println("Valor produtos vendidos: " + vendedor2.getValorProdutosVendidos());
        System.out.println("Salário: " + vendedor2.calcularSalario());
        System.out.println("***************************");

        Gerente gerente = new Gerente("Gerente", "06135451681", BigDecimal.valueOf(2000), 20D,
                500D, 10D);
        gerente.getVendedorList().add(vendedor1);
        gerente.getVendedorList().add(vendedor2);
        gerente.calcularSalario();

        System.out.println("Gerentes:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Ajuda de Custo: " + gerente.getAjudaDeCusto());
        System.out.println("Salário: " + gerente.calcularSalario());

    }
}
