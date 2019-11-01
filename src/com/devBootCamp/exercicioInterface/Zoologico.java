package com.devBootCamp.exercicioInterface;

import java.util.List;

public class Zoologico {

    public void caracteristicasDosAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            caracteristicasDosAnimais(animal);
            System.out.println();
        }
    }

    public void caracteristicasDosAnimais(Animal animal) {

        System.out.println("Som: " + animal.somDoAnimal());
        System.out.println("Cor: " + animal.corDoAnimal());
        System.out.println("Animal: " + animal.animal());
    }

    public void caracteristicasDoGato(Gato gato) {

        System.out.println("Som: " + gato.somDoAnimal());
        System.out.println("Cor: " + gato.corDoAnimal());
        System.out.println("Animal: " + gato.animal());
    }

    public void caracteristicasDoCachorro(Cachorro cachorro) {

        System.out.println("Som: " + cachorro.somDoAnimal());
        System.out.println("Cor: " + cachorro.corDoAnimal());
        System.out.println("Animal: " + cachorro.animal());
    }

    public void caracteristicasDoCavalo(Cavalo cavalo) {

        System.out.println("Som: " + cavalo.somDoAnimal());
        System.out.println("Cor: " + cavalo.corDoAnimal());
        System.out.println("Animal: " + cavalo.animal());
    }
}
