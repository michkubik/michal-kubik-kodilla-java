package com.kodilla.good.patterns.food2door;


import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop{

    private Map <String, Boolean> productMap = new HashMap<String, Boolean>();

    public GlutenFreeShop() {
        productMap.put("Bread", true);
        productMap.put("Flour", true);
        productMap.put("Pasta", false);
    }

    @Override
    public void process(String product) {
        Boolean isAvailable = productMap.get(product);
        if (isAvailable == null) {
            System.out.println("There is no such product!");
        } else if (isAvailable) {
            System.out.println(product + " has been ordered.");
        } else {
            System.out.println(product + " is not available!");
        }
    }
}
