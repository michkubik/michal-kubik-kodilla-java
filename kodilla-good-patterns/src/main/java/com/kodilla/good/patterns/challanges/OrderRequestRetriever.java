package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jan Kowalski", "kowal99");
        LocalDate orderDate = LocalDate.of(2020, 10, 25);
        int orderNumber = 3456;

        List<String> orderedGoods = new ArrayList<>();
        orderedGoods.add("Żelazko");
        orderedGoods.add("Kapcie");
        orderedGoods.add("Suszarka");

        OrderRequest orderRequest = new OrderRequest(user, orderDate, orderNumber, orderedGoods);

        return orderRequest;
    }

}
