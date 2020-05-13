package com.kodilla.good.patterns.loty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Flights {
    private Map<String, List<String>> flights;

    public Flights(Map<String, List<String>> flights) {
        this.flights = flights;
    }

    public Map<String, List<String>> getFlights() {
        return flights;
    }

    public void searchFlightFrom(String from) {
        System.out.println("Z " + from + " można polecieć do:");
        System.out.println(flights.get(from));
    }

    public void searchFlightTo(String to) {
        System.out.println("Do " + to + " można polecieć z:");
        flights.entrySet().stream().filter(f -> f.getValue().contains(to)).forEach(f -> System.out.println(f.getKey()));
    }

    public void searchFlightFromTo(String from, String to) {

        String throughAirport = null;

        if (flights.get(from).contains(to)) {
            System.out.println("Z " + from + " można bezpośrednio polecieć do " + to);

        } else {
            throughAirport = flights.entrySet().stream().filter(f -> f.getValue().contains(to)).map(f -> f.getKey()).collect(Collectors.joining());
            System.out.println(throughAirport);
        }
    }

}
