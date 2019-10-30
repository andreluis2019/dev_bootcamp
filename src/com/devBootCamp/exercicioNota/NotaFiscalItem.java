package com.devBootCamp.exercicioNota;

import java.util.Objects;

public class NotaFiscalItem {
    private int idNotaFiscalItem;
    private NotaFiscal nota;
    private Produto produto;
    private Double quantidade;
    private Double valorUnitario;
    //private Double valorTotal;

    public NotaFiscalItem(NotaFiscal nota, Produto produto, Double quantidade, Double valorUnitario) {
        this.nota = nota;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public void setIdNotaFiscalItem(int idNotaFiscalItem) {
        this.idNotaFiscalItem = idNotaFiscalItem;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getIdNotaFiscalItem() {
        return idNotaFiscalItem;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public Produto getProduto() {
        return produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Double getValorTotal() {
        return quantidade * valorUnitario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalItem that = (NotaFiscalItem) o;
        return nota.equals(that.nota) &&
                produto.equals(that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, produto);
    }
}
