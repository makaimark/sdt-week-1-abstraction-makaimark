package com.codecool.webshop.dao.impl;

import com.codecool.webshop.dao.OrderDao;
import com.codecool.webshop.model.Order;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOrderDaoImpl implements OrderDao {

    private static final List<Order> DATA = new ArrayList<>();

    public void add(Order o){
        DATA.add(o);
    }

    public Order search(Order o){
        // TODO implement
        return null;
    }

    public List<Order> list(){
        return DATA;
    }

}
