package com.devBootCamp.exercicioInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();

        zoologico.caracteristicasDoGato(new Gato());
        zoologico.caracteristicasDoCachorro(new Cachorro());
        zoologico.caracteristicasDoCavalo(new Cavalo());

        System.out.println();

        zoologico.caracteristicasDosAnimais(new Gato());
        zoologico.caracteristicasDosAnimais(new Cachorro());
        zoologico.caracteristicasDosAnimais(new Cavalo());

        System.out.println();

        System.out.println("Com Lista");
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Cavalo());

        zoologico.caracteristicasDosAnimais(animais);
    }
}
