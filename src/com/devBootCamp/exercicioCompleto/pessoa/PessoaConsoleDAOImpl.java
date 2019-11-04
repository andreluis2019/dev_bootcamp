package com.devBootCamp.exercicioCompleto.pessoa;

import java.util.Random;

public class PessoaConsoleDAOImpl {

    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("Registro incluído com sucesso");
        return pessoa;
    }

}
