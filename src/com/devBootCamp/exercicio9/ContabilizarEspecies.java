package com.devBootCamp.exercicio9;


import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies{

    public List<Resultado> contabilizarEspecies(List<Animal> animais, EspeciesUtil especiesUtil) {
        List<Resultado> resultados = new ArrayList<>();

        List<EspecieAnimal> especies = especiesUtil.classificaEspecies(animais);

        for (EspecieAnimal especie : especies) {
            List<Animal> animalList = especiesUtil.filtraEspecie(animais, especie);
            Resultado resultado = new Resultado(especie, animalList.size());
            resultados.add(resultado);
            System.out.println("Espécie: " + especie);
            System.out.println("Quantidade: " + resultado.getQuantidade());
            System.out.println();
        }

        return resultados;
    }

}
