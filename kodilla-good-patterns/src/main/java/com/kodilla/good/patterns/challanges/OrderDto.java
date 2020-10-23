package com.kodilla.good.patterns.challanges;

public class OrderDto {

    public User user;
    public boolean isSent;
    public Basket basket;

    public OrderDto(User user, Basket basket, boolean isSent) {
        this.user = user;
        this.isSent = isSent;
        this.basket = basket;
    }

    public User getUser() {
        return user;
    }

    public boolean isSent() {
        return isSent;
    }

    public Basket getBasket() {
        return basket;
    }
}
