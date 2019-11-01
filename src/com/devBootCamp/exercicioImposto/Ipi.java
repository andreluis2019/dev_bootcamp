package com.devBootCamp.exercicioImposto;

public class Ipi implements Imposto {

    private Double valorBase;

    public Ipi(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public Double calcularImposto() {
        return valorBase * 0.15;
    }
}
