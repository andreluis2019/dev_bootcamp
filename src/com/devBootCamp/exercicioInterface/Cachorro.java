package com.devBootCamp.exercicioInterface;

public class Cachorro implements Animal {

    @Override
    public String somDoAnimal() {
        return "Auau";
    }

    @Override
    public String corDoAnimal() {
        return "Preto";
    }

    @Override
    public String animal() {
        return "Cachorro";
    }
}
