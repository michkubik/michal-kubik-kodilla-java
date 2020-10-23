package com.kodilla.good.patterns.challanges;

//klasa a odpowiadać za wysłanie zamówienia

import java.time.LocalDate;

public class ProductOrderService {
    public boolean send (final User user, Order order, LocalDate orderDate) {
        System.out.println("Order by: " + user.getUserName() + ", made on: " + orderDate + "; order number: " + order.getOrderNumber() + "; has been sent.");
        return true;
    }

}
