package com.kodilla.good.patterns.challanges;

//przechowywanie koszyka?

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ProductOrderRepository {
    public Map<String, BigDecimal> priceList;



    public ProductOrderRepository(Map<String, BigDecimal> priceList) {
        this.priceList = priceList;
    }


    public BigDecimal calculateAmountAndStore(List<String> orderedGoods) {
        //mapae stworzyć w metodzie albo poprzez konstruktor
        BigDecimal totalAmount = orderedGoods.stream()
                .map(e -> priceList.getOrDefault(e, new BigDecimal(10)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return totalAmount;
    }




}
