package com.devBootCamp.exercicio3;

public class Elevador {
    private Integer andarAtual = 0;
    private Integer totalAndares;
    private Integer capacidade;
    private Integer pessoasPresentes = 0;

    public Elevador(Integer totalAndares, Integer capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(Integer pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void entra() {
        if(pessoasPresentes < capacidade){
            pessoasPresentes += 1;
            System.out.println("Pessoas presentes: " + pessoasPresentes);
        } else{
            System.out.println("Capacidade máxima atingida.");
        }
    }

    public void sai() {
        if(pessoasPresentes > 0) {
            pessoasPresentes -= 1;
            System.out.println("Desceu 1, Pessoas presentes: " + pessoasPresentes);
        } else {
            System.out.println("Elevador vazio.");
        }
    }

    public void sobe() {
        if(andarAtual < totalAndares) {
            andarAtual += 1;
            System.out.println("Andar " + andarAtual);
        } else {
            System.out.println("Último andar.");
        }
    }

    public void desce() {
        if(andarAtual > 0) {
            andarAtual -= 1;
            System.out.println("Andar: " + andarAtual);
        } else {
            System.out.println("Térreo.");
        }
    }
}
