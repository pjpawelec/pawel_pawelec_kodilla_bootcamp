package com.kodilla.exception.test;

public class SearcherRunner_old {


    public static void main (String args[]){

       FlightSearcher_old flightSearcherOld = new FlightSearcher_old();

        Flight_old flightOld1 = new Flight_old("Warsaw", "New York");

        flightSearcherOld.findFlight(flightOld1);
    }
}
