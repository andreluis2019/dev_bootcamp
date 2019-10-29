package com.devBootCamp.exercicio1;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    private List<Endereco> enderecos;
    private List<Telefone> telefones;

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefones = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Telefone> getTelefone() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void dadosPessoa(){
        System.out.println("Dados Pessoais: " + nome + " " + sobrenome + "\nCpf: " + cpf + "\nEmail: " + email +
                "\nData de Nasc: " + dataNascimento);

        for (Endereco endereco : enderecos) {
            System.out.println(endereco.toString());
            System.out.println("-------------------");
        }

        for (Telefone telefone : telefones) {
            System.out.println(telefone.toString());
            System.out.println("-------------------");
        }
    }
}
