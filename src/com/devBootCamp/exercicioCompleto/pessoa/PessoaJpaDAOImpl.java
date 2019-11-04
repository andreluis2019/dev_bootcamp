package com.devBootCamp.exercicioCompleto.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaJpaDAOImpl {

    private List<Pessoa> pessoaList = new ArrayList<>();

    public Pessoa salvar(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("JPA - Registro incluído com sucesso");
        pessoaList.add(pessoa);
        return pessoa;
    }
}
