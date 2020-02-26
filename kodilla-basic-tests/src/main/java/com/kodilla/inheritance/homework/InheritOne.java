package com.kodilla.inheritance.homework;

public class InheritOne extends OperatingSystem {

    public InheritOne(int releaseYear) {
        super(releaseYear);
    }
        public void displaySystemYear() {
            System.out.println("Your OS was relased in " + releaseYear);
        }
        @Override
        public void turnOn() {
            System.out.println("Your OS was realesed in "+releaseYear+" - System is ON");
        }
        @Override
        public void turnOff() {
            System.out.println("Your OS was realesed in "+releaseYear+" - System is Off");
    }

}
