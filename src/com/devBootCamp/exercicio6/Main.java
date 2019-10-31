package com.devBootCamp.exercicio6;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("Empregado", "1034685163", BigDecimal.valueOf(1500), 15D);
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());
        System.out.println("***************************");

        Vendedor vendedor = new Vendedor("Vendedor", "6546846543", BigDecimal.valueOf(1000), 10D,
                500D, 5D);
        vendedor.calcularSalario();
        System.out.println("Salário do Vendedor " + vendedor.calcularSalario());
        System.out.println("***************************");

        Gerente gerente = new Gerente("Gerente", "06135451681", BigDecimal.valueOf(2000), 20D,
                500D, 10D);
        gerente.getVendedorList().add(vendedor);
        gerente.calcularSalario();
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());

    }
}
