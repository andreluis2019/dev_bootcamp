package com.devBootCamp.exercicio9;

public class Resultado {
    private EspecieAnimal especie;
    private Integer quantidade;

    public Resultado(EspecieAnimal especie, Integer quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    public EspecieAnimal getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieAnimal especie) {
        this.especie = especie;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
