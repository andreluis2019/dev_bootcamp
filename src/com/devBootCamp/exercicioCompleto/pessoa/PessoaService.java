package com.devBootCamp.exercicioCompleto.pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa save(Pessoa pessoa);

    List<Pessoa> findAll();

    void delete(Integer id);

    Pessoa findByID(Integer id);
}
