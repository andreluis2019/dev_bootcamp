package com.devBootCamp.exercicio9;

public class Lambari implements Animal {

    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.PEIXES;
    }

    @Override
    public String getNomeAnimal() {
        return "Lambari";
    }
}
