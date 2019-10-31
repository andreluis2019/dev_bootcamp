package com.devBootCamp.exercicio6;

import java.math.BigDecimal;

public class Vendedor extends Empregado {
    private Double valorProdutosVendidos; //corresponde ao valor monetário dos artigos efetivamente vendidos
    private Double comissao; //corresponde à porcentagem do valor sobre as vendas de produtos

    public Vendedor(String nome, String cpf, BigDecimal salarioBase, Double imposto, Double valorProdutosVendidos,
                    Double comissao) {
        super(nome, cpf, salarioBase, imposto);
        this.valorProdutosVendidos = valorProdutosVendidos;
        this.comissao = comissao;
        calcularSalario();
    }

    public Double getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }

    public void setValorProdutosVendidos(Double valorProdutosVendidos) {
        this.valorProdutosVendidos = valorProdutosVendidos;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double valorComissao) {
        this.comissao = valorComissao;
    }

    @Override
    public BigDecimal calcularSalario() {
        Double valorComissao = valorProdutosVendidos * (comissao / 100D);
        return super.calcularSalario().add(BigDecimal.valueOf(valorComissao));
    }
}
