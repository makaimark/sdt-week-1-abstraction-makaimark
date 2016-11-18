package com.codecool.webshop.model;

public class Product {

    private int id;

    public String getName() {
        return name;
    }

    public int getId() {

        return id;
    }

    private String name;

    public int getPrice() {
        return price;
    }

    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id == product.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
