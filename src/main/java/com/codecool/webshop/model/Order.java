package com.codecool.webshop.model;

import java.util.List;

// TODO review what is really needed here.
public class Order {

    private int id;

    private List<Product> products;

    private Payment paymentMethod;

    private int sumAmount;

    private enum Payment {
        CARD, CASH, PAYPAL
    }

    public Order(int id) {
        this.id = id;
    }

    public Order(int id, List<Product> products, Payment paymentMethod) {
        this.id = id;
        this.products = products;
        this.paymentMethod = paymentMethod;
    }

    public Order(Payment paymentMethod, int sumAmount) {
        this.paymentMethod = paymentMethod;
        this.sumAmount = sumAmount;
    }

    public Order(int id, List<Product> products, Payment paymentMethod, int sumAmount) {
        this.id = id;
        this.products = products;
        this.paymentMethod = paymentMethod;
        this.sumAmount = sumAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(int sumAmount) {
        this.sumAmount = sumAmount;
    }

    @Override
    public java.lang.String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", paymentMethod=" + paymentMethod +
                ", sumAmount=" + sumAmount +
                '}';
    }

}
