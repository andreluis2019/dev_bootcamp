package com.devBootCamp.exercicio3;

public class TesteElevador {

    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 8);

        System.out.println("Entrando no elevador...");
        for (int i = elevador.getPessoasPresentes(); i <= elevador.getCapacidade(); i++) {
            elevador.entra();
        }
        System.out.println();

        System.out.println("Subindo...");
        for (int i = elevador.getAndarAtual(); i <= elevador.getTotalAndares(); i++) {
            elevador.sobe();
            if(i <= elevador.getCapacidade()) {
                elevador.sai();
            }
        }
        System.out.println();

        System.out.println("Descendo...");
        for (int i = elevador.getAndarAtual(); i >= 0; i--) {
            elevador.desce();
        }

    }
}
