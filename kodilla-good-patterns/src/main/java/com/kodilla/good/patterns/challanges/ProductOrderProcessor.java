package com.kodilla.good.patterns.challanges;

//klasa ma odpowiadać za obsługę procesu/przetwarzanie zamowienia

public class ProductOrderProcessor {

    private InformationService emailService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;
    private Order order;
    private OrderDto orderDto;

    public ProductOrderProcessor(final InformationService emailService,
                                 final ProductOrderService productOrderService,
                                 final ProductOrderRepository productOrderRepository, final Order order) {
        this.emailService = emailService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
        this.order = order;
    }

    public OrderDto process(final Order order) {
        boolean isSent = productOrderService.send(order.getUser(), order, order.getOrderDate());

        if (isSent) {
            emailService.informUser(order.getUser());
            return new OrderDto(orderDto.getUser(), orderDto.getBasket(), true);
        } else {
            return new OrderDto(order.getUser(), orderDto.getBasket(), false);
        }
    }

}
