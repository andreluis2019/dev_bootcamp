package com.devBootCamp.exercicio10.pedido;

import com.devBootCamp.exercicio10.PedidoItem;
import com.devBootCamp.exercicio10.crud.CrudServiceImpl;
import com.devBootCamp.exercicio10.email.Email;
import com.devBootCamp.exercicio10.email.EmailService;
import com.devBootCamp.exercicio10.email.EmailServiceImpl;
import com.devBootCamp.exercicio10.item.Item;

import java.math.BigDecimal;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido> implements PedidoService {

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected void preSave(Pedido entity) {
        BigDecimal valorTotal = BigDecimal.valueOf(0);
        BigDecimal valorTotalSemDesconto = BigDecimal.valueOf(0);

        for (PedidoItem pedidoItem : entity.getPedidoItemList()) {
            if(pedidoItem.getValorUnitario().compareTo(BigDecimal.valueOf(0)) < 1) {
                throw new RuntimeException("Valor unitário do item " + pedidoItem.getItem().getDescricao() + " zerado.");
            }

            if (pedidoItem.getItem().getInativo()) {
                throw new RuntimeException("Produto " + pedidoItem.getItem().getDescricao() + " está inativo.");
            }

            if (pedidoItem.getQuantidade().compareTo(pedidoItem.getItem().getQuantidadeEmEstoque()) == -1) {
                throw new RuntimeException("Quantidade do item " + pedidoItem.getItem().getDescricao() +
                        " no pedido maior que a quantidade em estoque.");
            }

            valorTotal.add(pedidoItem.getValorTotal());
            valorTotalSemDesconto.add(pedidoItem.getValorTotalSemDesconto());

        }

        if(valorTotalSemDesconto.subtract(valorTotal)
                .divide(valorTotalSemDesconto)
                .multiply(BigDecimal.valueOf(100))
                .compareTo(entity.getVendedor().getPercentualMaximoDeDesconto()) == -1) {
            throw new RuntimeException("Total de descontos maior que o permitido para o vendedor "
                    + entity.getVendedor().getNome());
        }

    }

    @Override
    protected void postSave(Pedido entity) {
        BigDecimal valorTotal = BigDecimal.valueOf(0);

        for (PedidoItem pedidoItem : entity.getPedidoItemList()) {
            valorTotal.add(pedidoItem.getValorTotal());
        }

        BigDecimal valorComissao = BigDecimal.valueOf(0);

        valorComissao.add(valorTotal).multiply(entity.getVendedor()
                .getPercentualDeComissao().divide(BigDecimal.valueOf(100)));

        Email email = new Email("andre@andre.com", "teste@teste.com");
        email.setTitulo("Comissão do vendedor " + entity.getVendedor().getNome());
        email.setConteudo("Olá " + entity.getVendedor().getNome() +
                ", sua comissão referente ao pedido Nro: " + entity.getId() + " foi de: R$" + valorComissao);
        emailService.enviarEmail(email);


    }
}
