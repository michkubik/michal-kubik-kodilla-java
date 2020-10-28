package com.kodilla.good.patterns.challanges;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Application {





    public static void main (String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest order = orderRequestRetriever.retrieve();

        Map<String, BigDecimal> priceList = new HashMap<>();
        priceList.put("Żelazko", BigDecimal.valueOf(10));
        priceList.put("Kapcie", BigDecimal.valueOf(5));
        priceList.put("Suszarka", BigDecimal.valueOf(20));


        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new EmailService(), new ProductOrderService(), new ProductOrderRepository(priceList));
        productOrderProcessor.process(order);



    }

}
