package com.kodilla.good.patterns.challanges;

//klasa ma odpowiadać za obsługę procesu/przetwarzanie zamowienia

public class ProductOrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private PurchaseRepository purchaseRepository;
    private OrderBasket orderBasket;

    public ProductOrderProcessor(final InformationService informationService,
                               final ProductOrderService productOrderService,
                               final PurchaseRepository purchaseRepository, final OrderBasket orderBasket) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.purchaseRepository = purchaseRepository;
        this.orderBasket = orderBasket;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }

}
