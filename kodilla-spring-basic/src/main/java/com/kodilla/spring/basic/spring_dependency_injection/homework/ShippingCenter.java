package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    @Autowired
    private DeliveryService deliveryService;
    @Autowired
    private NotificationService notificationService;

//    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
//        this.deliveryService = deliveryService;
//        this.notificationService = notificationService;
//    }

    // tutaj dodaj odpowiednie wstrzykiwanie zależności

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        else
        return notificationService.fail(address);
    }
}
