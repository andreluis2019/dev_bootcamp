package com.devBootCamp.exercicio10.item;

import com.devBootCamp.exercicio10.crud.BaseObject;

import java.math.BigDecimal;

public class Item extends BaseObject {
    private String descricao;
    private Boolean inativo;
    private BigDecimal quantidadeEmEstoque;
    private BigDecimal valorUnitario;

    public Item() {
        inativo = Boolean.FALSE;
    }

    public Item(BigDecimal quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getInativo() {
        return inativo;
    }

    public void setInativo(Boolean inativo) {
        this.inativo = inativo;
    }

    public BigDecimal getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(BigDecimal quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
