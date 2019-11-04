package com.devBootCamp.exercicioCompleto.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaConsoleDAOImpl implements PessoaCrudDAO {

    @Override
    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("Console - Registro incluído com sucesso");
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        System.out.println("[console] - findAll");
        return new ArrayList<>();
    }

    @Override
    public void delete(Integer id) {
        System.out.println("[Console] - findAll");
    }

    @Override
    public Pessoa findById(Integer id) {
        System.out.println("[Console] - findById");
        return new Pessoa();
    }
}
