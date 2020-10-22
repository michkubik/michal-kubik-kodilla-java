package com.kodilla.good.patterns.challanges;

//przechowywanie koszyka?

import java.time.LocalDateTime;

public interface PurchaseRepository {
    public void createPurchase(User user, LocalDateTime orderDate, Order order);
}
