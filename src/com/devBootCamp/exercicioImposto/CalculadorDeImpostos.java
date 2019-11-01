package com.devBootCamp.exercicioImposto;

import java.util.List;

public class CalculadorDeImpostos {

    public Double calcularImposto(Imposto imposto) {
        return imposto.calcularImposto();
    }

    public Double calcularImposto(List<Imposto> impostos) {
//        Double totalImpostos = 0D;
//        for (Imposto imposto : impostos) {
//            totalImpostos += imposto.calcularImposto();
//        }
        //Tem o mesmo resultado do código acima
        return impostos.stream()
                .mapToDouble(Imposto::calcularImposto)
                .sum();
    }
}
