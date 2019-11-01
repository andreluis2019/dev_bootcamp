package com.devBootCamp.exercicio9;

public enum EspecieAnimal {
    AVES("Aves"),
    MAMIFEROS("Mamíferos"),
    PEIXES("Peixes"),
    REPTEIS("Répteis");

    private String label;

    EspecieAnimal(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
