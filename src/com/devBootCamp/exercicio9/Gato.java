package com.devBootCamp.exercicio9;

public class Gato implements Animal{

    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.MAMIFEROS;
    }

    @Override
    public String getNomeAnimal() {
        return "Gato";
    }
}
