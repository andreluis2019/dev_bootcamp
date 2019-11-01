package com.devBootCamp.exercicio7;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", "da Silva", 25);
        Pessoa p2 = new Pessoa("Maria", "Correa", 16);
        Pessoa p3 = new Pessoa("Pedro", "Nunes", 13);
        Pessoa p4 = new Pessoa("Roberta", "Souza", 46);
        Pessoa p5 = new Pessoa("Ana", "Castro", 37);

        GrupoDePessoas grupoDePessoas = new GrupoDePessoas();

        grupoDePessoas.adicionarPessoas(p1);
        grupoDePessoas.adicionarPessoas(p2);
        grupoDePessoas.adicionarPessoas(p3);
        grupoDePessoas.adicionarPessoas(p4);
        grupoDePessoas.adicionarPessoas(p5);

        grupoDePessoas.mostraDados();
    }
}
