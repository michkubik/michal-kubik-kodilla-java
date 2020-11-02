package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        Shop shop = new HealthyShop();
        String product = "Bananas";
        BigDecimal productAmount = new BigDecimal("10");

        OrderRequest orderRequest = new OrderRequest(shop, product, productAmount);
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.order(orderRequest);

    }
}
