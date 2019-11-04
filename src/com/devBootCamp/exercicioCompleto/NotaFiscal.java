package com.devBootCamp.exercicioCompleto;

import com.devBootCamp.exercicioCompleto.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private Integer id;
    private Pessoa pessoa;
    private List<NotaFiscalItem> notaFiscalItemList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<NotaFiscalItem> getNotaFiscalItemList() {
        return notaFiscalItemList;
    }

    public void setNotaFiscalItemList(List<NotaFiscalItem> notaFiscalItemList) {
        this.notaFiscalItemList = notaFiscalItemList;
    }
}
