package com.devBootCamp.exercicio1;

public class Endereco {
    private String endereco;
    private Integer numero;
    private String bairro;

    public Endereco(String endereco, Integer numero, String bairro) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String toString(){
        return "Endereço: " + endereco + "\nNro: " + numero + "\nBairro: " + bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }
}
