package com.devBootCamp.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Endereco e1 = new Endereco("Rua X", 123, "Bairro X");
        Endereco e2 = new Endereco("Rua Y", 321, "Bairro Y");
        Endereco e3 = new Endereco("Rua Z", 987, "Bairro Z");
        List<Endereco> endereco = new ArrayList<>();
        endereco.add(e1);
        endereco.add(e2);
        endereco.add(e3);

        Telefone t1 = new Telefone("99999-9999");
        Telefone t2 = new Telefone("88888-8888");
        t1.setTipoTelefone(TipoTelefone.CELULAR);
        t2.setTipoTelefone(TipoTelefone.RESIDENCIAL);
        List<Telefone> telefone = new ArrayList<>();
        telefone.add(t1);
        telefone.add(t2);

        p1.setNome("João");
        p1.setSobrenome("da Silva");
        p1.setCpf("00000000000");
        p1.setEmail("teste@teste.com");
        p1.setDataNascimento(LocalDate.of(1998, 10, 20));
        p1.setEnderecos(endereco);
        p1.setTelefone(telefone);
        p1.dadosPessoa();
    }
}
