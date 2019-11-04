package com.devBootCamp.exercicioExcecao;

public class ValidaPessoa {

//    public void validarPessoa(Pessoa pessoa) throws Exception {
//        if(pessoa.getCpf() == null || pessoa.getCpf().length() < 11) {
//            throw new Exception("CPF não é válido, caracteres insuficientes");
//
//        }
//    }

    public void validarPessoa(Pessoa pessoa) {
        if(pessoa.getCpf() == null || pessoa.getCpf().length() < 11) {
            throw new RuntimeException("CPF não é válido, caracteres insuficientes");

        }
    }
}
