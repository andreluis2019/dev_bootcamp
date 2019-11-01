package com.devBootCamp.exercicio7;

import java.util.ArrayList;
import java.util.List;

public class GrupoDePessoas {
    private List<Pessoa> pessoasMenorerDeIdadeList = new ArrayList<>();
    private List<Pessoa> pessoasMaioresDeIdadeList = new ArrayList<>();

    public List<Pessoa> getPessoasMenorerDeIdadeList() {
        return pessoasMenorerDeIdadeList;
    }

    public void setPessoasMenorerDeIdadeList(List<Pessoa> pessoasMenorerDeIdadeList) {
        this.pessoasMenorerDeIdadeList = pessoasMenorerDeIdadeList;
    }

    public List<Pessoa> getPessoasMaioresDeIdadeList() {
        return pessoasMaioresDeIdadeList;
    }

    public void setPessoasMaioresDeIdadeList(List<Pessoa> pessoasMaioresDeIdadeList) {
        this.pessoasMaioresDeIdadeList = pessoasMaioresDeIdadeList;
    }

    public void adicionarPessoas(Pessoa p) {
        if(p.getIdade() >= 18) {
            pessoasMaioresDeIdadeList.add(p);
        } else {
            pessoasMenorerDeIdadeList.add(p);
        }
    }

    public void mostraDados() {
        System.out.println("Pessoas menores de idade: ");
        for (Pessoa p : pessoasMenorerDeIdadeList) {
            System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + " - Idade: " + p.getIdade());
        }
        System.out.println("***********************");
        System.out.println();

        System.out.println("Pessoas maiores de idade: ");
        for (Pessoa p : pessoasMaioresDeIdadeList) {
            System.out.println("Nome: " + p.getNome() + " " + p.getSobrenome() + " - Idade: " + p.getIdade());
        }
    }
}
