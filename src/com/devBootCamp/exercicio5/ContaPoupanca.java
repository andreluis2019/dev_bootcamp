package com.devBootCamp.exercicio5;

public class ContaPoupanca extends ContaBancaria {

    private Double limiteDeCredito;

    public ContaPoupanca(Double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public Double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(Double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    @Override
    protected void sacar(Double valor) {
        if (saldo > valor) {
            saldo -= valor;
        } else {
            if (valor > (saldo + limiteDeCredito)) {
                System.out.println("Valor superior ao limite de crédito");
            } else {
                System.out.println("Valor superior ao saldo.");
                super.saldo -= valor;
            }
        }
    }

    @Override
    protected void depositar(Double valor) {
        super.saldo += valor;
    }
}
