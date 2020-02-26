package com.kodilla.inheritance.homework;

public class AppChkOS {
    public static void main (String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1983);
        operatingSystem.displaySystemStatus();

        InheritOne inheritOne = new InheritOne(1975);
        inheritOne.turnOff();
        inheritOne.turnOn();
        inheritOne.displaySystemStatus();
        int releaseYr = inheritOne.getReleaseYear();
        System.out.println(releaseYr);

        InheritTwo inheritTwo = new InheritTwo(1111);
        inheritTwo.turnOn();
        inheritTwo.turnOff();
        inheritTwo.displaySystemStatus();


    }
}
