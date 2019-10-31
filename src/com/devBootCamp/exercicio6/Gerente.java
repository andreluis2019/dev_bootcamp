package com.devBootCamp.exercicio6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {
    private Double ajudaDeCusto;
    private List<Vendedor> vendedorList = new ArrayList<>();
    private Double percentualComissao;

    public Gerente(String nome, String cpf, BigDecimal salarioBase, Double imposto, Double ajudaDeCusto,
                   Double percentualComissao) {
        super(nome, cpf, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
        this.percentualComissao = percentualComissao;
        calcularSalario();
    }

    public Double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public List<Vendedor> getVendedorList() {
        return vendedorList;
    }

    public void setVendedorList(List<Vendedor> vendedorList) {
        this.vendedorList = vendedorList;
    }

    public Double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(Double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public BigDecimal calcularSalario() {
        Double comissaoGerente = 0D;
        for (Vendedor vendedor : vendedorList) {
            comissaoGerente += (vendedor.getValorProdutosVendidos() * (percentualComissao / 100));
        }

        return super.calcularSalario().add(BigDecimal.valueOf(comissaoGerente).add(BigDecimal.valueOf(ajudaDeCusto)));
    }

//    public Double calculaComissaoGerente(List<Vendedor> vendedorList) {
//        Double comissaoGerente = 0D;
//        for (Vendedor vendedor : vendedorList) {
//            comissaoGerente += (vendedor.getValorProdutosVendidos() * (percentualComissao / 100));
//        }
//        return comissaoGerente;
//    }
}
