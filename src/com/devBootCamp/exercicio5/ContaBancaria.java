package com.devBootCamp.exercicio5;

public abstract class ContaBancaria {
    private String nroConta;
    protected Double saldo;

    public String getNroConta() {
        return nroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    protected abstract void sacar(Double valor);

    protected abstract void depositar(Double valor);
}
