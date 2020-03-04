package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Star;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("------------------------------------");
        System.out.println("This Car name is "+ getCarName(car));
        System.out.println("This car current speed is "+ car.getSpeed());
            }

    public static String getCarName(Car car){
        if (car instanceof Ford)
            return "FORD";
        else if (car instanceof Opel)
            return "OPEL";
        else if (car instanceof Star)
            return "STAR";
        else
            return "I don't know what that is";


    }

}
