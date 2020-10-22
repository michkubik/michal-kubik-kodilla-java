package com.kodilla.good.patterns.challanges;

//klasa a odpowiadać za wysłanie zamówienia

import java.time.LocalDateTime;

public class ProductOrderService {
    public boolean send (final User user, Order order, LocalDateTime localDateTime) {
        System.out.println("Order by: " + user.getName() + ", made on: " + localDateTime + "; order number: " + order.getNumber() + "; has been sent.");
        return true;
    }

}
