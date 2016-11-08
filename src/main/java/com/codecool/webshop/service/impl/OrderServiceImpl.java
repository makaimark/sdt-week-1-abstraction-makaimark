package com.codecool.webshop.service.impl;

import com.codecool.webshop.dao.OrderDao;
import com.codecool.webshop.dao.impl.InMemoryOrderDaoImpl;
import com.codecool.webshop.model.Order;
import com.codecool.webshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

    private static OrderService instance;

    private OrderDao orderDao;

    // Why is it good to have OrderDao here?
    private OrderServiceImpl(OrderDao orderDao){
        this.orderDao = orderDao;
    }

    public static OrderService getInstance(){
        if(instance == null){
            instance = new OrderServiceImpl(new InMemoryOrderDaoImpl());
        }
        return instance;
    }

    public void save(Order o){
        log.info("Saving order: " + o);
        orderDao.add(o);
    }

    @Override
    public List<Order> list() {
        log.info("Listing Order entities");
        return orderDao.list();
    }
}
