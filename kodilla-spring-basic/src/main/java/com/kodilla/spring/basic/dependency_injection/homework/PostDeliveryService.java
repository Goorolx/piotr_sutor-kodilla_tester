package com.kodilla.spring.basic.dependency_injection.homework;

public class PostDeliveryService implements DeliveryService{

    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress... Your favourite Postman is on his way with Your package");
        return true;
    }
}
