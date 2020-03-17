package com.kodilla.collections.adv.exercise.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testAddFlight(){
        //given
        Flight ab1111 = new Flight("Krakow","Bialystok");
        Flight ab2222 = new Flight("Wroclaw","Bydgoszcz");
        Flight ba1111 = new Flight("Bialystok","Krakow");


        //when
        FlightRepository.flights.add(ab1111);
        FlightRepository.flights.add(ab2222);
        FlightRepository.flights.add(ba1111);
        FlightRepository.addFlight("Krakow","Bialystok");
        //then
        assertEquals(3,FlightRepository.flights.size());
    }
    @Test
    public void testFindFlightsFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder("Krakow");
        FlightRepository.addFlight("Bydgoszcz","Krakow");
        FlightRepository.addFlight("Krakow","Bydgoszcz");
        FlightRepository.addFlight("Krakow","Bialystok");
        FlightRepository.addFlight("Bialystok","Krakow");
        FlightRepository.addFlight("Krakow","Bielsko");
        //when
        List<Flight> flight = flightFinder.findFlightsFrom("Krakow");
        //then
        assertEquals(3,flight.size());
    }

    @Test
    public void testFindFlightsTo(){
        //given
        FlightFinder flightFinder = new FlightFinder("Krakow");
        FlightRepository.addFlight("Bydgoszcz","Krakow");
        FlightRepository.addFlight("Krakow","Bydgoszcz");
        FlightRepository.addFlight("Krakow","Bialystok");
        FlightRepository.addFlight("Bialystok","Krakow");
        FlightRepository.addFlight("Krakow","Bielsko");
        //when
        List<Flight> flight = flightFinder.findFlightsTo("Bydgoszcz");
        //then
        assertEquals(1,flight.size());
    }

}