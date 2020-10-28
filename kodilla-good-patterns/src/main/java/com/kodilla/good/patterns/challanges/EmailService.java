package com.kodilla.good.patterns.challanges;

import java.math.BigDecimal;
import java.util.List;

public class EmailService implements InformationService {

    private static final String MESSAGE = "Your order has been sent.";

    @Override
    public void informUser(User user, List<String> orderedGoods, BigDecimal amount) {
        System.out.println(MESSAGE + "\nYour order contains: " + orderedGoods + "\n Total price: " + amount);
    }
}
