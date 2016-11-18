package com.codecool.webshop.dao.impl;

import com.codecool.webshop.dao.ProductDao;
import com.codecool.webshop.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by makaimark on 2016.11.17..
 */
public class InMemoryProductDao implements ProductDao {

    private static final List<Product> DATA = new ArrayList<>();

    @Override
    public void add(Product p) {
        DATA.add(p);
    }

    @Override
    public List<Product> list() {
        return DATA;
    }

    public Product search(Product p) { return  null;}
}
