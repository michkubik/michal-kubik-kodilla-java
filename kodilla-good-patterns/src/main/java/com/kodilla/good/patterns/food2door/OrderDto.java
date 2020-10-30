package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.util.List;

public class OrderDto {

    private Shop shop;
    private boolean isSent;
    private List<String> orderedGoods;
    private BigDecimal amount;

    public OrderDto(Shop shop, boolean isSent, List<String> orderedGoods, BigDecimal amount) {
        this.shop = shop;
        this.isSent = isSent;
        this.orderedGoods = orderedGoods;
        this.amount = amount;
    }

    public Shop getShop() {
        return shop;
    }

    public boolean isSent() {
        return isSent;
    }

    public List<String> getOrderedGoods() {
        return orderedGoods;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
