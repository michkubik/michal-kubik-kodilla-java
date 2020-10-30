package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Shop shop;
    private String product;
    private double productAmount;

    public OrderRequest(Shop shop, String product, double productAmount) {
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

    public double getProductAmount() {
        return productAmount;
    }
}
