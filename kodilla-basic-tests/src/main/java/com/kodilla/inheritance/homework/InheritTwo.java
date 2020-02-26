package com.kodilla.inheritance.homework;

public class InheritTwo extends OperatingSystem {
    public InheritTwo(int releaseYear) {
        super(releaseYear);
    }
        public void displaySystemYear() {
            System.out.println("Your OS was relased in " + releaseYear);
        }
        @Override
        public void turnOn() {
            System.out.println("Your OS was relaesed in "+releaseYear+" - System is ON");
        }
        @Override
        public void turnOff() {
            System.out.println("Your OS is overridden with system from "+releaseYear+" - System is Off");
        }
}
