package com.devBootCamp.exercicioCompleto.item;

import com.devBootCamp.exercicioCompleto.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemJpaDAOImpl implements ItemCrudDAO {

    private List<Item> itemList = new ArrayList<>();

    @Override
    public Item save(Item item) {
        item.setId(new Random().nextInt());
        System.out.println("JPA - Registro incluído com sucesso");
        itemList.add(item);
        return item;
    }

    @Override
    public List<Item> findAll() {
        System.out.println("[JPA] - findAll (Item)");
        return itemList;
    }

    @Override
    public void delete(Integer id) {
        System.out.println("[JPA] - delete (Item)");
        itemList.removeIf(item -> item.getId().equals(id));
    }

    @Override
    public Item findById(Integer id) {
        System.out.println("[JPA] - findById (Item)");
        for (Item item : itemList) {
            if(item.getId().equals(id)) {
                return item;
            }
        }

        return new Item();

//        return itemList.stream()
//                .filter(item -> item.getId().equals(id))
//                .findAny()
//                .orElse(new Item());

    }
}
