package com.devBootCamp.exercicioCompleto.item;

import java.util.List;

public class ItemServiceImpl implements ItemService {

    private ItemCrudDAO itemCrudDAO = new ItemJpaDAOImpl();

    @Override
    public Item save(Item item) {
        return itemCrudDAO.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemCrudDAO.findAll();
    }

    @Override
    public void delete(Integer id) {
        itemCrudDAO.delete(id);
    }

    @Override
    public Item findById(Integer id) {
        return itemCrudDAO.findById(id);
    }
}
