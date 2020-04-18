package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car {

    LocalTime time = LocalTime.now();
    @Override
    public boolean hasHeadlightsTurnedOn() {
        boolean lightsOn=true;
        if(time.getHour() >= 6 && time.getHour() <22){
            lightsOn = false;}

        return lightsOn;
    }

    @Override
    public String getCarType() {
        return "A comfortable Sedan is perfect for Spring and Autumn";
    }
}
