package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Star;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
//        for (int n = 0; n < cars.length; n++) {
//            CarUtils.describeCar(cars[n]);}

       for (Car car : cars)
            CarUtils.describeCar(car);
    }


    public static Car drawCar() {
        Random random = new Random();
        int drawNewCar = random.nextInt(3);
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        int c = random.nextInt(10) + 1;

        if (drawNewCar == 0)
            return new Ford(a, b, c);
        else if (drawNewCar == 1)
            return new Opel(a, b, c);
        else
            return new Star(a, b, c);

    }
}


