package com.devBootCamp.exercicio10.pedido;

public enum FormaDePagamento {
    DINHEIRO("Dinheiro"),
    CARTAO("Cartão"),
    BOLETO("Boleto");

    private String label;

    FormaDePagamento(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
