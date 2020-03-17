package com.kodilla.collections.adv.exercise.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightRepository {
    static Set<Flight> flights = new HashSet<>();

    public static void addFlight(String departure, String arrival){
        flights.add(new Flight(departure,arrival));
            }

    public static List<Flight> getFlightsTable() {
        List<Flight> flight = new ArrayList<>(flights);
               return flight;

    }

}
