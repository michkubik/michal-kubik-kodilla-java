package com.kodilla.good.patterns.challanges;

import java.math.BigDecimal;
import java.util.List;

public class OrderDto {

    private User user;
    private boolean isSent;
    private List<String> orderedGoods;
    private BigDecimal amount;

    public OrderDto(User user, boolean isSent, List<String> orderedGoods, BigDecimal amount) {
        this.user = user;
        this.isSent = isSent;
        this.orderedGoods = orderedGoods;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public boolean isSent() {
        return isSent;
    }

    public List<String> getOrderedGoods() {
        return orderedGoods;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
