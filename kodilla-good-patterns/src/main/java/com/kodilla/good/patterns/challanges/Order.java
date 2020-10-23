package com.kodilla.good.patterns.challanges;

//koszyk zakupów (?)

import java.time.LocalDate;

public class Order {

    User user;
    LocalDate orderDate;
    int orderNumber;
    Basket basket;

    public Order(User user, LocalDate orderDate, int orderNumber, Basket basket) {
        this.user = user;
        this.orderDate = orderDate;
        this.orderNumber = orderNumber;
        this.basket = basket;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Basket getBasket() {
        return basket;
    }
}
