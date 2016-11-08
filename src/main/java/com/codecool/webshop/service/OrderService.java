package com.codecool.webshop.service;

import com.codecool.webshop.model.Order;

import java.util.List;

public interface OrderService {

    String PAYMENT_METHOD_BANKCARD = "bankcard";

    String PAYMENT_METHOD_PAYPAL = "paypal";

    void save(Order o);

    List<Order> list();

}
