package com.codecool.webshop.dao;

import com.codecool.webshop.model.Order;

import java.util.List;

public interface OrderDao {

    void add(Order o);

    List<Order> list();
}
