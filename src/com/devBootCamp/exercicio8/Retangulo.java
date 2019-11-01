package com.devBootCamp.exercicio8;

public class Retangulo implements Figura {

    private Double lado1;
    private Double lado2;

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Retangulo(Double lado1, Double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public Double getArea() {
        return lado1 * lado2;
    }

}
