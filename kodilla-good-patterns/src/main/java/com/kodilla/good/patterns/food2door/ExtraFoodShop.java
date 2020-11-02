package com.kodilla.good.patterns.food2door;

import java.util.Set;

public class ExtraFoodShop implements Shop {

private Set<String> products = Set.of("Milk", "Honey");

    @Override
    public void process(String product) {
        if (products.contains(product)) {
            System.out.println(product + " has been ordered.");
        } else {
            System.out.println("There is no " + product);
        }
    }
}
