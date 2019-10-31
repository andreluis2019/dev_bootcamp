package com.devBootCamp.exercicio5;

public class ContaCorrente extends ContaBancaria {

    private Double taxaOperacao;

    public Double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(Double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    protected void sacar(Double valor) {
        if(super.saldo < valor){
            System.out.println("Saldo insuficiente.");
            return;
        }

        valor += taxaOperacao;
        super.saldo -= valor;
    }

    @Override
    protected void depositar(Double valor) {
        valor -= taxaOperacao;
        super.saldo += valor;
    }
}
