package com.devBootCamp.exercicio9;

public class Cachorro implements Animal {
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.MAMIFEROS;
    }

    @Override
    public String getNomeAnimal() {
        return "Cachorro";
    }
}
