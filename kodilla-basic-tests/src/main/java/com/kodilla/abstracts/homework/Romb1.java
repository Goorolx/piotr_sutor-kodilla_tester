package com.kodilla.abstracts.homework;

public class Romb1 extends Shape {
    public Romb1(){
        super (0,0,3,3,2);
        a = b;
    }

    @Override
    public int calculateShapeArea() {

        surfaceArea = a * h;
        return surfaceArea;
    }
    @Override
    public int calculateShapeCircuit() {
        circuit = 4*a;
        return circuit;}

}
