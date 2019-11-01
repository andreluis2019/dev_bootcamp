package com.devBootCamp.exercicio9;

import java.util.ArrayList;
import java.util.List;

public class EspeciesUtilImpl implements EspeciesUtil {

    @Override
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar) {
        List<Animal> animalList = new ArrayList<>();
        for (Animal animal : animais) {
            if(especieFiltrar.equals(animal.getEspecie())){
                animalList.add(animal);
            }
        }

        return animalList;
    }

    @Override
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais) {
        List<EspecieAnimal> especieAnimalList = new ArrayList<>();
        for (Animal animal : animais) {
            if(!especieAnimalList.contains(animal.getEspecie())) {
                especieAnimalList.add(animal.getEspecie());
            }
        }

        return especieAnimalList;
    }
}
