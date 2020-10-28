package com.kodilla.good.patterns.challanges;

import java.math.BigDecimal;
import java.util.List;

public interface InformationService {
    void informUser(User user, List<String> orderedGoods, BigDecimal amount);

}
