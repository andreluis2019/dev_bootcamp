package com.devBootCamp.exercicio10.pedido;

import com.devBootCamp.exercicio10.PedidoItem;
import com.devBootCamp.exercicio10.cliente.Cliente;
import com.devBootCamp.exercicio10.item.Item;
import com.devBootCamp.exercicio10.Vendedor;
import com.devBootCamp.exercicio10.crud.BaseObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends BaseObject {
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataDeCadastro;
    private LocalDate dataDeValidade;
    private LocalDate dataPrevisaoDeEntrega;
    private String enderecoDeEntrega;
    private String observacao;
    private Enum formaDePagamento;
    private List<PedidoItem> pedidoItemList = new ArrayList<>();

    public Pedido(Cliente cliente, Vendedor vendedor, LocalDateTime dataDeCadastro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataDeCadastro = dataDeCadastro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public LocalDate getDataPrevisaoDeEntrega() {
        return dataPrevisaoDeEntrega;
    }

    public void setDataPrevisaoDeEntrega(LocalDate dataPrevisaoDeEntrega) {
        this.dataPrevisaoDeEntrega = dataPrevisaoDeEntrega;
    }

    public String getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(String enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Enum getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(Enum formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public List<PedidoItem> getPedidoItemList() {
        return pedidoItemList;
    }
    public void setPedidoItemList(List<PedidoItem> pedidoItemList) {
        this.pedidoItemList = pedidoItemList;
    }
}
