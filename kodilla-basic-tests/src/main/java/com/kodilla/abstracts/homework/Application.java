package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape rect = new Rect1();
        rect.calculateShapeArea();
        rect.calculateShapeCircuit();
        rect.show();

        Shape square = new Square1();
        square.calculateShapeCircuit();
        square.calculateShapeArea();
        square.show();

        Shape romb = new Romb1();
        romb.calculateShapeArea();
        romb.calculateShapeCircuit();
        romb.show();
    }
}
