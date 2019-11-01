package com.devBootCamp.exercicioImposto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Double valorBaseCalculo = 100D;
        var icms = new Icms(valorBaseCalculo);
        var pis = new Pis(valorBaseCalculo);
        var cofins = new Cofins(valorBaseCalculo);
        var ipi = new Ipi(valorBaseCalculo);

//        Double valorIcms = calculadorDeImpostos.calcular("ICMS", valorBaseCalculo);
//        Double valorPis = calculadorDeImpostos.calcular("PIS", valorBaseCalculo);
//        Double valorCofins = calculadorDeImpostos.calcular("COFINS", valorBaseCalculo);
//
//        System.out.println("Valor ICMS: " + valorIcms);
//        System.out.println("Valor PIS: " + valorPis);
//        System.out.println("Valor COFINS: " + valorCofins);

        Double valorIcms = calculadorDeImpostos.calcularImposto(new Icms(valorBaseCalculo));
        Double valorPis = calculadorDeImpostos.calcularImposto(new Pis(valorBaseCalculo));
        Double valorCofins = calculadorDeImpostos.calcularImposto(new Cofins(valorBaseCalculo));
        Double valorIpi = calculadorDeImpostos.calcularImposto(new Ipi(valorBaseCalculo));

        List<Imposto> impostos = new ArrayList<>();
        impostos.add(icms);
        impostos.add(pis);
        impostos.add(cofins);
        impostos.add(ipi);
        var totalImpostos = calculadorDeImpostos.calcularImposto(impostos);

        System.out.println("Valor ICMS: " + valorIcms);
        System.out.println("Valor PIS: " + valorPis);
        System.out.println("Valor COFINS: " + valorCofins);
        System.out.println("Valor IPI: " + valorIpi);
        System.out.println("Valor total dos impostos: " + totalImpostos);

    }
}
