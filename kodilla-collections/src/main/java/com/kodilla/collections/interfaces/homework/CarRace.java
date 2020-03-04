package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(0, 10, 3);
        showSpeed(ford);

        Opel opel = new Opel(0, 10, 3);
        showSpeed(opel);

        doRace(ford);
        doRace(opel);
    }

    public static void showSpeed(Car car) {
        System.out.println(car.getSpeed());
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed is "+ car.getSpeed());

    }
}
