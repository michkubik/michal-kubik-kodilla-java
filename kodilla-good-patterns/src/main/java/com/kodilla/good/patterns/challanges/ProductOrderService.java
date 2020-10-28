package com.kodilla.good.patterns.challanges;

//klasa a odpowiadać za wysłanie zamówienia

import java.time.LocalDate;

public class ProductOrderService {
    public boolean send (final User user, OrderRequest orderRequest, LocalDate orderDate) {
        if (orderRequest.getOrderedGoods().contains("Kapusta")) {
            return false;
        } else {
        System.out.println("Order by: " + user.getUserName() + ", made on: " + orderDate + "; order number: " + orderRequest.getOrderNumber() + "; has been sent.");
        return true;
        }
    }
}
