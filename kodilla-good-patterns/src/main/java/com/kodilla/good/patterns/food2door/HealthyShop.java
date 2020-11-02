package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Shop{

    private List<String> productsList = new ArrayList<>();

    public HealthyShop() {
        productsList.add("Apples");
        productsList.add("Bananas");
        productsList.add("Carrots");
    }

    @Override
    public void process(String product) {

        boolean isRemoved = productsList.remove(product);
        if (isRemoved) {
            System.out.println(product + " have been ordered.");
        } else {
            System.out.println(product + " are not available or is not on the list!");
        }
    }
}
