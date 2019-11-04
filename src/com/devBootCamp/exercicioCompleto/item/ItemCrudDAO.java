package com.devBootCamp.exercicioCompleto.item;

import java.util.List;

public interface ItemCrudDAO {

    Item save(Item item);

    List<Item> findAll();

    void delete(Integer id);

    Item findById(Integer id);
}
