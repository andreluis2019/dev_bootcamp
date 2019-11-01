package com.devBootCamp.exercicioImposto;

public class Main {
    public static void main(String[] args) {
        CalculadorDeImpostosOld calculadorDeImpostos = new CalculadorDeImpostosOld();

        Double valorBaseCalculo = 1000D;

//        Double valorIcms = calculadorDeImpostos.calcular("ICMS", valorBaseCalculo);
//        Double valorPis = calculadorDeImpostos.calcular("PIS", valorBaseCalculo);
//        Double valorCofins = calculadorDeImpostos.calcular("COFINS", valorBaseCalculo);
//
//        System.out.println("Valor ICMS: " + valorIcms);
//        System.out.println("Valor PIS: " + valorPis);
//        System.out.println("Valor COFINS: " + valorCofins);

        Imposto icms = new Icms(valorBaseCalculo);

    }
}
