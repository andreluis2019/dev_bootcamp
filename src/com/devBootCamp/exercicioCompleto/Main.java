package com.devBootCamp.exercicioCompleto;

import com.devBootCamp.exercicioCompleto.pessoa.Pessoa;
import com.devBootCamp.exercicioCompleto.pessoa.PessoaConsoleDAOImpl;

public class Main {

    public static void main(String[] args) {

        PessoaConsoleDAOImpl pessoaDAO = new PessoaConsoleDAOImpl();

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("13246316541");
        pessoa.setNome("André");

        pessoa = pessoaDAO.save(pessoa);
        System.out.println("Pessoa ID: " + pessoa.getId());

    }
}
