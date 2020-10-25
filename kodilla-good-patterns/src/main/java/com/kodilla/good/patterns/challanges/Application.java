package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main (String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        Order order = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new EmailService(), new ProductOrderService(), new ProductOrderRepository(), new Order());
        productOrderProcessor.process(order);



    }

}
