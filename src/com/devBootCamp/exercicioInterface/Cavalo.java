package com.devBootCamp.exercicioInterface;

public class Cavalo implements Animal {

    @Override
    public String somDoAnimal() {
        return "Irriinn";
    }

    @Override
    public String corDoAnimal() {
        return "MARROM";
    }

    @Override
    public String animal() {
        return "Cavalo";
    }
}
