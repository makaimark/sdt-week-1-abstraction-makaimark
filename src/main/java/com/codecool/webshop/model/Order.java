package com.codecool.webshop.model;

import java.util.List;

// TODO review what is really needed here.
public class Order {

    private int id;

    private List<Product> products;

    private String paymentMethod;

    private int sumAmount;

    private String customerName;

    private String customerAddress;

    public Order(int id) {
        this.id = id;
    }

    public Order(int id, List<Product> products, String paymentMethod) {
        this.id = id;
        this.products = products;
        this.paymentMethod = paymentMethod;
    }

    public Order(String paymentMethod, int sumAmount) {
        this.paymentMethod = paymentMethod;
        this.sumAmount = sumAmount;
    }

    public Order(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public Order(int id, List<Product> products, String paymentMethod, int sumAmount, String customerName, String customerAddress) {
        this.id = id;
        this.products = products;
        this.paymentMethod = paymentMethod;
        this.sumAmount = sumAmount;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(int sumAmount) {
        this.sumAmount = sumAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public java.lang.String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", paymentMethod=" + paymentMethod +
                ", sumAmount=" + sumAmount +
                ", customerName=" + customerName +
                ", customerAddress=" + customerAddress +
                '}';
    }

}
