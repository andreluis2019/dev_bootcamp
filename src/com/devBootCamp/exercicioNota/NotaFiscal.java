package com.devBootCamp.exercicioNota;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private int idNota;
    private String numero;
    private Cliente cliente;
    private Endereco enderecoEntrega;
    private List<NotaFiscalItem> listaItensNota= new ArrayList();
    private Double valorTotal = 0D;

    public NotaFiscal(int idNota, String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        definirEndereco();
    }

    private void definirEndereco() {
        for (Endereco endereco : cliente.getEnderecos()) {
            if (TipoEndereco.ENTREGA.equals(endereco.getTipoEndereco())) {
                enderecoEntrega = endereco;
                return;
            }
        }

        //System.out.println("Não possui endereço de entrega");
    }

    public List<NotaFiscalItem> getListaItensNota() {
        return listaItensNota;
    }

    public Double getValorTotal() {
        for (NotaFiscalItem listaItensNota : listaItensNota) {
            valorTotal += listaItensNota.getValorTotal();
        }
        return valorTotal;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
       this.enderecoEntrega = enderecoEntrega;
    }

    public void setListaItensNota(List<NotaFiscalItem> listaItensNota) {
        this.listaItensNota = listaItensNota;
    }

    public void mostraDados(){
        System.out.println("ID Nota: " + idNota);
        System.out.println("Nro Nota: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço Entrega: ");
        if (enderecoEntrega != null) {
            System.out.println("Rua: " + enderecoEntrega.getRua() + ", Número: " + enderecoEntrega.getNumero() +
                    " - Bairro: " + enderecoEntrega.getBairro());
        } else {
            System.out.println("Endereço de entrega não informado");
        }

        System.out.println("Itens Nota Fiscal:");
        for (NotaFiscalItem notaFiscalItem : listaItensNota) {
            System.out.println("-----------------------");
            System.out.println("Produto: " + notaFiscalItem.getProduto().getDescricao());
            System.out.println("Quantidade: " + notaFiscalItem.getQuantidade());
            System.out.println("Valor Unitário: R$ " + notaFiscalItem.getValorUnitario());
            System.out.println("Total: R$ " + notaFiscalItem.getValorTotal());
        }
        System.out.println("-----------------------");
        System.out.println("Valor total Nota: R$ " + getValorTotal());
    }
}
