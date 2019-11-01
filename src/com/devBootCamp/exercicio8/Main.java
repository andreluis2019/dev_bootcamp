package com.devBootCamp.exercicio8;

public class Main {
    public static void main(String[] args) {
//        Figura dadosQuadrado = new Quadrado(10D, 10D);
//        Figura dadosRetangulo = new Retangulo(10D, 5D);
//        Figura dadosTriangulo = new Triangulo(5D, 10D);
//        Figura dadosCirculo = new Circulo(5D);

        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

        System.out.println("Dados do Quadrado: ");
        System.out.println("Área do Quadrado: " + figuraGeometrica.calcularArea(new Quadrado(10D, 10D)));
        System.out.println("***********************");

        System.out.println("Dados do Retângulo: ");
        System.out.println("Área do Retângulo: " + figuraGeometrica.calcularArea(new Retangulo(10D, 5D)));
        System.out.println("***********************");

        System.out.println("Dados do Triângulo: ");
        System.out.println("Área do Triângulo: " + figuraGeometrica.calcularArea(new Triangulo(5D, 10D)));
        System.out.println("***********************");

        System.out.println("Dados do Círculo: ");
        System.out.println("Área do Círculo: " + figuraGeometrica.calcularArea(new Circulo(5D)));
    }
}
