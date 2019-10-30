package com.devBootCamp.exercicioNota;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private List<Endereco> enderecos = new ArrayList();

    public Cliente(int idCliente, String nome, String cpf, List<Endereco> enderecos) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = enderecos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        int i = 0;

        for (Endereco endereco : enderecos) {
            if(endereco.getTipoEndereco().equals("ENTREGA")) {
                i++;
            }
        }

        if(i == 1){
            this.enderecos = enderecos;
        } else if (i > 1){
            System.out.println("Cliente já possui um endereço de entrega");
        } else {
            System.out.println("Cliente não possui endereço de entrega");
        }
    }
}
