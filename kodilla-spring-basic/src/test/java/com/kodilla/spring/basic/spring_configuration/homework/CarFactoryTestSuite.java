package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@SpringBootTest
public class CarFactoryTestSuite {
    @Test
    public void shouldCreateCarBeanAndFetchSedan() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carPicker");
        //When
        String getCar = car.getCarType();
        System.out.println(getCar);
        //Then
        if (LocalDate.now().getDayOfYear() < 90 || LocalDate.now().getDayOfYear() > 356) {
            assertEquals("It's winter therefore you need a SUV", getCar);
        } else if ((LocalDate.now().getDayOfYear() > 180 && LocalDate.now().getDayOfYear() < 270)) {
            assertEquals("Cabriolet, life is good :)", getCar);
        } else {
            assertEquals("A comfortable Sedan is perfect for Spring and Autumn", getCar);
        }
    }

    @Test
    public void shouldCreateCarBeanAndCheckLights() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carPicker");  //wrzucam (cast) Car do metody?
        //When
        boolean getCar = car.hasHeadlightsTurnedOn();
        //then
        assertFalse(getCar);

    }
}