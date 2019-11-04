package com.devBootCamp.exercicioCompleto;

import com.devBootCamp.exercicioCompleto.item.Item;
import com.devBootCamp.exercicioCompleto.item.ItemService;
import com.devBootCamp.exercicioCompleto.item.ItemServiceImpl;
import com.devBootCamp.exercicioCompleto.pessoa.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        PessoaService pessoaService = new PessoaServiceImpl();
//
//        Pessoa pessoa = new Pessoa();
//        pessoa.setCpf("13246316541");
//        pessoa.setNome("André");
//        pessoa = pessoaService.save(pessoa);
//        System.out.println("Pessoa ID: " + pessoa.getId());
//        System.out.println();
//
//        Pessoa pessoa2 = new Pessoa();
//        pessoa2.setCpf("65464638765241");
//        pessoa2.setNome("Pessoa2");
//        pessoa2 = pessoaService.save(pessoa2);
//        System.out.println("Pessoa ID: " + pessoa2.getId());
//        System.out.println();
//
//        Pessoa pessoa3 = new Pessoa();
//        pessoa3.setCpf("451687346515");
//        pessoa3.setNome("Pessoa3");
//        pessoa3 = pessoaService.save(pessoa3);
//        System.out.println("Pessoa ID: " + pessoa3.getId());
//        System.out.println();
//
//        Pessoa pessoa4 = new Pessoa();
//        pessoa4.setCpf("7543576546");
//        pessoa4.setNome("Pessoa4");
//        pessoa4 = pessoaService.save(pessoa4);
//
//        Integer idPessoa = pessoa4.getId();
//
//        System.out.println("Pessoa ID: " + pessoa4.getId());
//        System.out.println();
//
//        List<Pessoa> pessoaList = pessoaService.findAll();
//
//        for (Pessoa p : pessoaList) {
//            System.out.println("ID: " + p.getId());
//            System.out.println("Nome: " + p.getNome());
//            System.out.println("CPF: " + p.getCpf());
//            System.out.println();
//        }
//
//        pessoaService.delete(pessoa2.getId());
//
//        pessoaList = pessoaService.findAll();
//        for (Pessoa p : pessoaList) {
//            System.out.println("ID: " + p.getId());
//            System.out.println("Nome: " + p.getNome());
//            System.out.println("CPF: " + p.getCpf());
//            System.out.println();
//        }
//
//        Pessoa pessoaTeste = pessoaService.findByID(idPessoa);
//        System.out.println("ID: " + pessoaTeste.getId());
//        System.out.println("Nome: " + pessoaTeste.getNome());
//        System.out.println("CPF: " + pessoaTeste.getCpf());
//        System.out.println();

        ItemService itemService = new ItemServiceImpl();

        Item item1 = new Item();
        item1.setDescricao("Item1");
        item1.setQuantidade(BigDecimal.valueOf(10));
        item1.setValorUnitario(BigDecimal.valueOf(50.5));
        item1 = itemService.save(item1);
        System.out.println("Item ID: " + item1.getId());
        System.out.println();

        Item item2 = new Item();
        item2.setDescricao("Item2");
        item2.setQuantidade(BigDecimal.valueOf(55));
        item2.setValorUnitario(BigDecimal.valueOf(120.0));
        item2 = itemService.save(item2);
        System.out.println("Item ID: " + item2.getId());
        System.out.println();

        Item item3 = new Item();
        item3.setDescricao("Item3");
        item3.setQuantidade(BigDecimal.valueOf(200));
        item3.setValorUnitario(BigDecimal.valueOf(0.75));
        item3 = itemService.save(item3);

        Integer idItem = item3.getId();

        System.out.println("Item ID: " + item3.getId());
        System.out.println();

        List<Item> itemList = itemService.findAll();

        for (Item i : itemList) {
            System.out.println("ID: " + i.getId());
            System.out.println("Nome: " + i.getDescricao());
            System.out.println("CPF: " + i.getQuantidade());
            System.out.println("CPF: " + i.getValorUnitario());
            System.out.println();
        }

        itemService.delete(item2.getId());

        itemList = itemService.findAll();
        for (Item i : itemList) {
            System.out.println("ID: " + i.getId());
            System.out.println("Nome: " + i.getDescricao());
            System.out.println("CPF: " + i.getQuantidade());
            System.out.println("CPF: " + i.getValorUnitario());
            System.out.println();
        }

        Item itemTeste = itemService.findById(idItem);
        System.out.println("ID: " + itemTeste.getId());
        System.out.println("Nome: " + itemTeste.getDescricao());
        System.out.println("CPF: " + itemTeste.getQuantidade());
        System.out.println("CPF: " + itemTeste.getValorUnitario());
        System.out.println();

    }
}
