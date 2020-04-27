package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    private Map<String, List<String>> availableFlights;

    public FlightFinder(Map<String, List<String>> availableFlights) {
        this.availableFlights = availableFlights;
    }


    public List<String> isFlightPossible(String from, String to) {

        final List<String> result = new ArrayList<>();

        final List<String> flightPossible = isFlightPossible(from, to, result);
        result.add(from);
        Collections.reverse(flightPossible);
        System.out.println("Znaleziono następujące połączenie: " + flightPossible);
        return flightPossible;
    }

    public List<String> isFlightPossible(String from, String to, List<String> list) {
        if (availableFlights.get(from) == null) {
            return null;
        }
        if (availableFlights.get(from).contains(to)) {
            list.add(to);
            return list;
        }

        for (String newFrom : availableFlights.get(from)) {
            if (isFlightPossible(newFrom, to, list) != null) {
                list.add(newFrom);
                return list;
            }
        }
        return null;
    }
}
