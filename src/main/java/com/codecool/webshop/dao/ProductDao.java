package com.codecool.webshop.dao;

import com.codecool.webshop.model.Product;

import java.util.List;

/**
 * Created by makaimark on 2016.11.17..
 */
public interface ProductDao {

    void add(Product p);

    List<Product> list();
}
