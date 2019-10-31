package com.devBootCamp.exercicio4;

import java.time.LocalDateTime;
import java.util.List;

public class TestaVoo {

    public static void main(String[] args) {

        Voo voo1 = new Voo(1, LocalDateTime.now(), 10);

        List<Integer> assentosLivres = voo1.assentosLivres();
        System.out.println("Acentos Livre: ");
        for (Integer assentosLivre : assentosLivres) {
            System.out.print(assentosLivre +  " ");
        }

        System.out.println();
        System.out.println("Pŕoximo assento livre: ");
        voo1.primeiroLivre(2);

        voo1.ocupaAssento(3);



    }
}
