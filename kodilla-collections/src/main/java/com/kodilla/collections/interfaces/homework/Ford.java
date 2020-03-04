package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;
    int speedUp;
    int speedDown;

    public Ford(int speed, int speedUp, int speedDown) {
        this.speed = speed;
        this.speedUp = speedUp;
        this.speedDown = speedDown;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + speedUp;
    }

    @Override
    public void decreaseSpeed() {
        if (speed <= 0) {
            speed = 0;
        } else {
            speed = speed - speedDown;
        }
    }
}
