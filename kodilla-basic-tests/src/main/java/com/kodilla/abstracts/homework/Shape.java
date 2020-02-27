package com.kodilla.abstracts.homework;

public abstract class Shape {
    int surfaceArea;
    int circuit;
    int a;
    int b;
    int h;

    public Shape (int surfaceArea, int circuit,int a,int b,int h) {
        this.surfaceArea = surfaceArea;
        this.circuit = circuit;
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public int getCircuit() {
        return circuit;
    }
    public int getSurfaceArea() {
        return surfaceArea;
    }
    public abstract int calculateShapeArea();
    public abstract int calculateShapeCircuit();


    public void show () {
        System.out.println("Shape "+ this.getClass().getSimpleName()+ " surface Area = "+getSurfaceArea());
        System.out.println("Shape "+ this.getClass().getSimpleName()+ " circuit = "+getCircuit());
    }
}
