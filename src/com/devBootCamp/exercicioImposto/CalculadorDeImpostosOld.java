package com.devBootCamp.exercicioImposto;

public class CalculadorDeImpostosOld {

    public double calcular(String imposto, Double valor) {
        if(imposto.equals("ICMS"))
            return valor * 0.10;
        else if(imposto.equals("PIS")) {
            return valor * 0.20;
        } else if(imposto.equals("COFINS")) {
            return valor * 0.50;
        }
        return valor;
    }
}
