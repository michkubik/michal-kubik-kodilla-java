package com.kodilla.good.patterns.challanges;

//klasa ma odpowiadać za obsługę procesu/przetwarzanie zamowienia

import java.math.BigDecimal;
import java.util.Collections;

public class ProductOrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;
    // private Order order; - order niesie dane (interfejsy tu albo coś robią, albo niosą dane)


    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isSent = productOrderService.send(orderRequest.getUser(), orderRequest, orderRequest.getOrderDate());

        if (isSent) {
            BigDecimal totalAmount = productOrderRepository.calculateAmountAndStore(orderRequest.getOrderedGoods());
            informationService.informUser(orderRequest.getUser(), orderRequest.getOrderedGoods(), totalAmount);
            return new OrderDto(orderRequest.getUser(), true, orderRequest.getOrderedGoods(), totalAmount);
        } else {
            return new OrderDto(orderRequest.getUser(), false, Collections.emptyList(), BigDecimal.ZERO);
        }
    }

}
