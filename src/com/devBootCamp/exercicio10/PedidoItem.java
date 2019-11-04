package com.devBootCamp.exercicio10;

import com.devBootCamp.exercicio10.crud.BaseObject;
import com.devBootCamp.exercicio10.item.Item;
import com.devBootCamp.exercicio10.pedido.Pedido;

import java.math.BigDecimal;

public class PedidoItem extends BaseObject {
    private Pedido pedido;
    private Item item;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorDeDesconto;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorDeDesconto() {
        return valorDeDesconto;
    }

    public void setValorDeDesconto(BigDecimal valorDeDesconto) {
        this.valorDeDesconto = valorDeDesconto;
    }

    public BigDecimal getValorTotal() {
        return quantidade.multiply(valorUnitario).subtract(valorDeDesconto);
    }

    public BigDecimal getValorTotalSemDesconto () {
        return quantidade.multiply(valorUnitario);
    }
}
