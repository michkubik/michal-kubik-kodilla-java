package com.kodilla.good.patterns.challanges;

public class EmailService implements InformationService {

    User user;

    String message = "Your order has been sent.";

    @Override
    public void informUser(User user) {
        System.out.println(message);
    }
}
