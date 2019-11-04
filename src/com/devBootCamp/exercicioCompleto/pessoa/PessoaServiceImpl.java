package com.devBootCamp.exercicioCompleto.pessoa;

import java.util.List;

public class PessoaServiceImpl implements PessoaService {

    private PessoaCrudDAO pessoaCrudDAO = new PessoaJpaDAOImpl();

    @Override
    public Pessoa save(Pessoa pessoa) {
        return pessoaCrudDAO.save(pessoa);
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaCrudDAO.findAll();
    }

    @Override
    public void delete(Integer id) {
        pessoaCrudDAO.delete(id);
    }

    @Override
    public Pessoa findByID(Integer id) {
        return pessoaCrudDAO.findById(id);
    }
}
