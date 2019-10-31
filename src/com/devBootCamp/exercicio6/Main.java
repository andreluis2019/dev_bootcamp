package com.devBootCamp.exercicio6;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("Empregado", "1034685163", BigDecimal.valueOf(1500), 15D);
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());
        System.out.println("***************************");

        Vendedor vendedor1 = new Vendedor("Vendedor 1", "6546846543", BigDecimal.valueOf(1000), 10D,
                500D, 5D);
        vendedor1.calcularSalario();
        System.out.println("Salário do Vendedor 1: " + vendedor1.calcularSalario());
        System.out.println("***************************");

        Vendedor vendedor2 = new Vendedor("Vendedor 2", "63876546788", BigDecimal.valueOf(1200), 10D,
                1000D, 5D);
        vendedor2.calcularSalario();
        System.out.println("Salário do Vendedor 2: " + vendedor2.calcularSalario());
        System.out.println("***************************");

        Gerente gerente = new Gerente("Gerente", "06135451681", BigDecimal.valueOf(2000), 20D,
                500D, 10D);
        gerente.getVendedorList().add(vendedor1);
        gerente.getVendedorList().add(vendedor2);
        gerente.calcularSalario();
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());

    }
}
