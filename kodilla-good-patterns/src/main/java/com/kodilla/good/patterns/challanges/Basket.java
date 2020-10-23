package com.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List goodsInBasket = new ArrayList();

    public Basket(List goodsInBasket) {
        this.goodsInBasket = goodsInBasket;
    }

    public List getGoodsInBasket() {
        return goodsInBasket;
    }
}
