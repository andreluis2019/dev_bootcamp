package com.devBootCamp.exercicio8;

public class Circulo implements Figura {

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return (raio * raio) * Math.PI;
    }

}
