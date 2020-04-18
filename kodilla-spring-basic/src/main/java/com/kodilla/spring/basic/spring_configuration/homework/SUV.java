package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{
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
        return "It's winter therefore you need a SUV";
    }
}
