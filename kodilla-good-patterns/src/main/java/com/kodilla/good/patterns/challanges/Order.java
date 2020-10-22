package com.kodilla.good.patterns.challanges;

//koszyk zakupów (?)

import java.time.LocalDateTime;

public interface Order {

    public int getNumber();
    public LocalDateTime getDate();
    public String getOrder();
}
