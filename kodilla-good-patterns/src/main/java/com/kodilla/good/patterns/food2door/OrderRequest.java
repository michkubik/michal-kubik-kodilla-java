package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;

public class OrderRequest {
    private Shop shop;
    private String product;
    private BigDecimal productAmount;

    public OrderRequest(Shop shop, String product, BigDecimal productAmount) {
        this.shop = shop;
        this.product = product;
        this.productAmount = productAmount;
    }

    public Shop getShop() {
        return shop;
    }

    public String getProduct() {
        return product;
    }

    public BigDecimal getProductAmount() {
        return productAmount;
    }
}
