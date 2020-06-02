package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShippingCenterTestSuite {
    @Test
    public void shouldSendPackage() {
        DeliveryService deliveryService = new PostDeliveryService();
        boolean a = deliveryService.deliverPackage("address", 12);
        assertTrue(a);
    }

    @Test
    public void shouldRejectPackage() {
        DeliveryService deliveryService = new PostDeliveryService();
        boolean a = deliveryService.deliverPackage("address", 122);
        assertFalse(a);
    }

    @Test
    public void shouldSendNotification() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        DeliveryService deliveryService = new PostDeliveryService();
        deliveryService.deliverPackage("address", 12);

        Assertions.assertTrue(outContent.toString().contains("favourite Postman"));

        System.setOut(originalOut);
    }

    @Test
    public void shouldSendNotificationFailed() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        DeliveryService deliveryService = new PostDeliveryService();
        deliveryService.deliverPackage("address", 122);

        Assertions.assertTrue(outContent.toString().contains("too heavy"));

        System.setOut(originalOut);
    }

}

