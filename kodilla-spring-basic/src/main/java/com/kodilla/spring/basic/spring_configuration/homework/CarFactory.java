package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

    @Bean
    public Car carPicker() {
        Car car;
        LocalDate dateTime = LocalDate.now();

        if (dateTime.getDayOfYear() < 90
                || dateTime.getDayOfYear() > 356) {
            car = new SUV();
        } else if (dateTime.getDayOfYear() > 180 && dateTime.getDayOfYear() < 270) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }
}
