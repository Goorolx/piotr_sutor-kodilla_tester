package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        System.out.println("Vienna status: " + isViennaInUse);
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
        } catch (AirportNotFoundException e) {
            e.printStackTrace();
        System.out.println("Sorry this airport is not served by our airlines");
        }
        finally {
            System.out.println("Thank you for using Kodilla airlines");
        }
    }
}
