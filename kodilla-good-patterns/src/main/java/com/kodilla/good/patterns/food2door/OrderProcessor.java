package com.kodilla.good.patterns.food2door;

public class OrderProcessor {


    public void order(OrderRequest orderRequest) {
        orderRequest.getShop().process(orderRequest.getProduct());
    }


}
