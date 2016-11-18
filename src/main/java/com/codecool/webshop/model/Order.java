package com.codecool.webshop.model;

import java.util.List;

// TODO review what is really needed here.
public class Order {

    private final int id;

    private final List<Product> products;

    private final Payment paymentMethod;

    private final int sumAmount;

    public Order(OrderBuilder orderBuilder) {
        this.id = orderBuilder.id;
        this.products = orderBuilder.products;
        this.paymentMethod = orderBuilder.paymentMethod;
        this.sumAmount = orderBuilder.sumAmount;
    }

    private enum Payment {
        CARD, CASH, PAYPAL
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public int getSumAmount() {
        return sumAmount;
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

    public static class OrderBuilder {

        private int id;

        private List<Product> products;

        private Order.Payment paymentMethod;

        private int sumAmount;

        public OrderBuilder id(int id) {
            this.id = id;
            return this;
        }

        public OrderBuilder products(List<Product> products) {
            this.products = products;
            return this;
        }

        public OrderBuilder sumamount(int sumAmount) {
            this.sumAmount = sumAmount;
            return this;
        }

        public OrderBuilder paymentmethod(Payment paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

}
