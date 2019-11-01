package com.devBootCamp.exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro1 = new Cachorro();
        Animal cachorro2 = new Cachorro();
        Animal aguia1 = new Aguia();
        Animal gato1 = new Gato();
        Animal gato2 = new Gato();
        Animal gato3 = new Gato();
        Animal jacare1 = new Jacare();
        Animal jacare2 = new Jacare();
        Animal lambari1 = new Lambari();

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro1);
        animais.add(cachorro2);
        animais.add(aguia1);
        animais.add(gato1);
        animais.add(gato2);
        animais.add(gato3);
        animais.add(jacare1);
        animais.add(jacare2);
        animais.add(lambari1);

        ContabilizarEspecies contabilizarEspecies = new ContabilizarEspecies();

        contabilizarEspecies.contabilizarEspecies(animais, new EspeciesUtilImpl());

    }
}
