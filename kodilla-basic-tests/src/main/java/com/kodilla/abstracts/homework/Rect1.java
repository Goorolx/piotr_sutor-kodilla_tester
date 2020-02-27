package com.kodilla.abstracts.homework;

public class Rect1 extends Shape {

    public Rect1(){
        super(0,0,2,4,4);
        a = b;
    }
    @Override
    public int calculateShapeArea() {
        surfaceArea = a * b;
        return surfaceArea;
        }
    @Override
    public int calculateShapeCircuit() {
        circuit = 2*a + 2*b;
        return circuit;}

}
