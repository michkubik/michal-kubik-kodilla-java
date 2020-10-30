package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.Collections;

public class OrderProcessor {

    Shop shop;
    OrderRequest orderRequest;

    public OrderProcessor(Shop shop, OrderRequest orderRequest) {
        this.shop = shop;
        this.orderRequest = orderRequest;
    }

    public OrderDto process() {
        if (isSent) {

        } else {
            return new OrderDto(orderRequest.getUser(), false, Collections.emptyList(), BigDecimal.ZERO);
        }

    }


}
