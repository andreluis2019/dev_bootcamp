package com.devBootCamp.exercicio10;

import com.devBootCamp.exercicio10.crud.BaseObject;

import java.math.BigDecimal;

public class Vendedor extends BaseObject {
    private String nome;
    private BigDecimal percentualDeComissao;
    private BigDecimal percentualMaximoDeDesconto;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(BigDecimal percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    public BigDecimal getPercentualMaximoDeDesconto() {
        return percentualMaximoDeDesconto;
    }

    public void setPercentualMaximoDeDesconto(BigDecimal percentualMaximoDeDesconto) {
        this.percentualMaximoDeDesconto = percentualMaximoDeDesconto;
    }
}
