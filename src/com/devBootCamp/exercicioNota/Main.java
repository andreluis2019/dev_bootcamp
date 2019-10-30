package com.devBootCamp.exercicioNota;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco(1, "Rua X", "123", "Bairro X");
        endereco1.setTipoEndereco(TipoEndereco.COBRANCA);
        Endereco endereco2 = new Endereco(2, "Rua Z", "321", "Bairro Z");
        endereco2.setTipoEndereco(TipoEndereco.ENTREGA);

        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(endereco1);
        enderecos.add(endereco2);

        Cliente cliente = new Cliente(1, "João da Silva", "012345678901", enderecos);

        Produto produto1 = new Produto(1, "Computador", 10D, 1500D);
        Produto produto2 = new Produto(2, "Teclado", 70D, 50D);
        Produto produto3 = new Produto(3, "Monitor", 20D, 350D);

        NotaFiscal notaFiscal = new NotaFiscal(1, "1", cliente);

        NotaFiscalItem notaItem1 = new NotaFiscalItem(notaFiscal, produto1, 2D, 1500D);
        NotaFiscalItem notaItem2 = new NotaFiscalItem(notaFiscal, produto2, 10D, 50D);
        NotaFiscalItem notaItem3 = new NotaFiscalItem(notaFiscal, produto3, 5D, 350D);

        List<NotaFiscalItem> notaFiscalItems = new ArrayList<>();
        notaFiscalItems.add(notaItem1);
        notaFiscalItems.add(notaItem2);
        notaFiscalItems.add(notaItem3);

        notaFiscal.setListaItensNota(notaFiscalItems);

        notaFiscal.mostraDados();
    }
}
