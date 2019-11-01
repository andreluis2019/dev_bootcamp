package com.devBootCamp.exercicioInterface;

public class Gato implements Animal {

    @Override
    public String somDoAnimal() {
        return "miau";
    }

    @Override
    public String corDoAnimal() {
        return "Branco";
    }

    @Override
    public String animal() {
        return "Gato";
    }
}
