package com.devBootCamp.exercicio9;

import java.util.List;

public interface EspeciesUtil {
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar);
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais);

}
