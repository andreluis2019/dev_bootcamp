package com.devBootCamp.exercicio1;

public class Telefone {
    private String numero;
    private Enum tipoTelefone;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public void setTipoTelefone(Enum tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String toString(){
        return "Telefone: " + numero + " Tipo: " + tipoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public Enum getTipoTelefone() {
        return tipoTelefone;
    }
}
