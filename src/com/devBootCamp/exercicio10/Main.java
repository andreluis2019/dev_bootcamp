package com.devBootCamp.exercicio10;


import com.devBootCamp.exercicio10.cliente.Cliente;
import com.devBootCamp.exercicio10.item.Item;
import com.devBootCamp.exercicio10.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente1");
        cliente.setId(1);
        cliente.setEmail("cliente@teste.com");

        Vendedor vendedor = new Vendedor("Vendedor1");
        vendedor.setId(1);
        vendedor.setPercentualDeComissao(BigDecimal.valueOf(5));
        vendedor.setPercentualMaximoDeDesconto(BigDecimal.valueOf(10));

        Item item1 = new Item(BigDecimal.valueOf(10));
        item1.setDescricao("Item1");
        item1.setInativo(Boolean.TRUE);
        item1.setId(1);

        Item item2 = new Item(BigDecimal.valueOf(5));
        item2.setDescricao("Item2");
        item2.setId(2);

        Item item3 = new Item(BigDecimal.valueOf(20));
        item3.setDescricao("Item3");
        item3.setId(3);

        List<PedidoItem> pedidoItemList = new ArrayList<>();


        Pedido pedido1 = new Pedido(cliente, vendedor, LocalDateTime.now());
        pedido1.setPedidoItemList(pedidoItemList);


    }
}
