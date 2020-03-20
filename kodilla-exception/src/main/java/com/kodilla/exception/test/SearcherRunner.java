package com.kodilla.exception.test;

public class SearcherRunner {
    public static void main (String args[]){

        FlightSearcher flightSearcher = new FlightSearcher();

        Flight flight1 = new Flight("Warsaw", "New York");

        flightSearcher.findFlight(flight1);
    }
}
