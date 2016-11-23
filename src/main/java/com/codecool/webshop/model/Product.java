package com.codecool.webshop.model;

public class Product {

    private int id;

    private String name;

    private int price;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {

        return id;
    }

    public Product(int id, String name, int price) {
        this.id=id;
        this.name = name;
        this.price = price;
    }

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
