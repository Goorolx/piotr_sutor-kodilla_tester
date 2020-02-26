package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
        System.out.println("System is ON");
    }

    public void turnOff() {
        System.out.println("System is OFF");
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void displaySystemStatus(){
        System.out.println("Currently installed OS is from year: "+releaseYear);
    }
}
