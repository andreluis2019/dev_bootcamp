package com.devBootCamp.exercicioCompleto;

import com.devBootCamp.exercicioCompleto.pessoa.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PessoaService pessoaService = new PessoaServiceImpl();

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("13246316541");
        pessoa.setNome("André");
        pessoa = pessoaService.save(pessoa);
        System.out.println("Pessoa ID: " + pessoa.getId());
        System.out.println();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("65464638765241");
        pessoa2.setNome("Pessoa2");
        pessoa2 = pessoaService.save(pessoa2);
        System.out.println("Pessoa ID: " + pessoa2.getId());
        System.out.println();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setCpf("451687346515");
        pessoa3.setNome("Pessoa3");
        pessoa3 = pessoaService.save(pessoa3);
        System.out.println("Pessoa ID: " + pessoa3.getId());
        System.out.println();

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setCpf("7543576546");
        pessoa4.setNome("Pessoa4");
        pessoa4 = pessoaService.save(pessoa4);

        Integer idPessoa = pessoa4.getId();

        System.out.println("Pessoa ID: " + pessoa4.getId());
        System.out.println();

        List<Pessoa> pessoaList = pessoaService.findAll();

        for (Pessoa p : pessoaList) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("CPF: " + p.getCpf());
            System.out.println();
        }

        pessoaService.delete(pessoa2.getId());

        pessoaList = pessoaService.findAll();
        for (Pessoa p : pessoaList) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("CPF: " + p.getCpf());
            System.out.println();
        }

        Pessoa pessoaTeste = pessoaService.findByID(idPessoa);
        System.out.println("ID: " + pessoaTeste.getId());
        System.out.println("Nome: " + pessoaTeste.getNome());
        System.out.println("CPF: " + pessoaTeste.getCpf());
        System.out.println();

    }
}
