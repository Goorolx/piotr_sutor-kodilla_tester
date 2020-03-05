package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Star;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList<>();

        cars.add(new Opel(1,1,1));
        cars.add(new Ford(2,2,2));
        cars.add(new Star(1,4,5));
        cars.add(new Ford(3,3,3));
        System.out.println("Number of cars on the List : "+cars.size());

        for (Car car: cars)
            CarUtils.describeCar(car);
        Car star = new Star(9,2,3);
        cars.add(star);

        cars.remove(new Star(9,2,3));
        cars.remove(new Ford(2,2,2));
        cars.remove(0);
        cars.remove(star);

        System.out.println("");
        System.out.println("--------------Removed------------------");
        System.out.println("Number of cars on the updated List : "+cars.size());
        for (Car carRemove : cars)
            CarUtils.describeCar(carRemove);
    }
}
