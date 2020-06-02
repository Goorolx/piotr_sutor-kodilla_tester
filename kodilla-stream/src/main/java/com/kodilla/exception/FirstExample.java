package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String userName = "John";
        String[] nameParts = userName.split(" ");
        System.out.println("First Name "+nameParts[0]);
        System.out.println("Last Name "+nameParts[1]);
    }
}
