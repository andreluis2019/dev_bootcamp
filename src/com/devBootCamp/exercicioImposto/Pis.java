package com.devBootCamp.exercicioImposto;

public class Pis implements Imposto {

    private Double valorBase;

    public Pis(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public Double calcularImposto() {
        return valorBase * 0.20;
    }
}
