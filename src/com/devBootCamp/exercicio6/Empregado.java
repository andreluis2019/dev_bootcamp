package com.devBootCamp.exercicio6;

import java.math.BigDecimal;

public class Empregado extends Pessoa {
    private BigDecimal salarioBase;
    private Double imposto;

    public Empregado(String nome, String cpf, BigDecimal salarioBase, Double imposto) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public BigDecimal calcularSalario() {
        return salarioBase.subtract(BigDecimal.valueOf(imposto));
    }
}
