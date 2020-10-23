package com.kodilla.good.patterns.challanges;

//przechowywanie koszyka?

import java.util.ArrayList;
import java.util.List;

public class ProductOrderRepository {
    OrderDto orderDto;
    List orderList = new ArrayList();


    public ProductOrderRepository(OrderDto orderDto) {
        this.orderDto = orderDto;
    }

    public boolean addOrder (OrderDto orderDto) {
        orderList.add(orderDto);
        return true;
    }

    public OrderDto getOrderDto() {
        return orderDto;
    }
}
