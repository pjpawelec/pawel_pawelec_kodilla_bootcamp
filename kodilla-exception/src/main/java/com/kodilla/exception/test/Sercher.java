package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sercher {

    public static void main(String[] args){

        Map<String, List<String>> airports = new HashMap<>();

        airports.put("Warsaw", Arrays.asList("London", "Berlin"));
        airports.put("Berlin", Arrays.asList("Paris", "Madrid"));
        airports.put("Madrid", Arrays.asList("Moscow", "Rome"));
        airports.put("Rome", Arrays.asList("Warsaw", "Vienna"));

        FlightFinder flight1 = new FlightFinder(airports);
        flight1.isFlightPossible("Warsaw", "Vienna");
    }
}
