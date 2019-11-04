package com.devBootCamp.exercicioExcecao;

public class Main {

    public static void main(String[] args) {

        ValidaPessoa validaPessoa = new ValidaPessoa();
        Pessoa pessoa = new Pessoa();

        //validaPessoa.validarPessoa(pessoa);

        try {
            validaPessoa.validarPessoa(pessoa);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
