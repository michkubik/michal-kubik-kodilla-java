package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    public Order retrieve() {

        User user = new User("Jan Kowalski", "kowal99");

        LocalDate orderDate = new LocalDate(2020-10-21);

        List goodsInBasket = new ArrayList();
        goodsInBasket.add("Żelazko");
        goodsInBasket.add("Kapcie");
        goodsInBasket.add("Suszarka");

        int orderNumber = new

        Basket basket = new Basket(goodsInBasket);

        return new Order(user, orderDate, orderNumber, goodsInBasket);
    }

}
