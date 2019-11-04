package com.devBootCamp.exercicio10.email;

import com.devBootCamp.exercicio10.crud.BaseObject;

public class Email{
    private String de;
    private String para;
    private String titulo;
    private String conteudo;

    public Email(String de, String para) {
        this.de = de;
        this.para = para;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
