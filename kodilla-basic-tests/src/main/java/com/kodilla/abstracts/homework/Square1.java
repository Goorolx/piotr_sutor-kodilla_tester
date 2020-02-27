package com.kodilla.abstracts.homework;

public class Square1 extends Shape {
    public Square1(){
        super(0,0,2,2,2);
        a=b;
        h=b;
    }

    @Override
    public int calculateShapeArea() {

        surfaceArea = a * a;
        return surfaceArea;
    }
    @Override
    public int calculateShapeCircuit() {
        circuit = 4*b;
        return circuit;}

}
