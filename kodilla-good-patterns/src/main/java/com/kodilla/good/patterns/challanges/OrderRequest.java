package com.kodilla.good.patterns.challanges;

//koszyk zakupów (?)

import java.time.LocalDate;
import java.util.List;

public class OrderRequest {

    private User user;
    private LocalDate orderDate;
    private int orderNumber;
    private List<String> orderedGoods;

    public OrderRequest(User user, LocalDate orderDate, int orderNumber, List<String> orderedGoods) {
        this.user = user;
        this.orderDate = orderDate;
        this.orderNumber = orderNumber;
        this.orderedGoods = orderedGoods;
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

    public List<String> getOrderedGoods() {
        return orderedGoods;
    }
}
