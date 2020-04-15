package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ShippingCenterTest {
    @Test
    public void shouldReturnCorrectAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Orawka 51", 20);
        assertEquals("Package delivered to: Orawka 51",message);
    }
    @Test
    public void shouldReturnNotDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Orawka 51", 50);
        assertEquals("Package not delivered to: Orawka 51",message);
    }
}