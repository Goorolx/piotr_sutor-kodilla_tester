package com.kodilla.collections.adv.exercise.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private String airport;

    public FlightFinder(String airport) {
        this.airport = airport;
    }

    public List<Flight> findFlightsFrom(String departure){
    List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)){
                result.add(flight);
            }
            }return result;
        }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> result = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)){
                result.add(flight);
            }
        }return result;
    }
}
