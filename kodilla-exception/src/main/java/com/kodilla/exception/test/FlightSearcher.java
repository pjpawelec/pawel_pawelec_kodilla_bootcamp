package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) {

        String from = flight.getDepartureAirport();
        String to = flight.getArrivalAirport();
        List<String> possibleDestinations = null;
        List<String> possibleDestinationsSecondRow;
        boolean foundFlight = false;
        int falseCounter = 0;
        int optionalAirportsCounter = 0;

        List<String> destinationsFromWarsaw = new ArrayList<>();
        destinationsFromWarsaw.add("Berlin");
        destinationsFromWarsaw.add("Tokio");

        List<String> destinationsFromBerlin = new ArrayList<>();
        destinationsFromBerlin.add("New York");
        destinationsFromBerlin.add("Warsaw");

        List<String> destinationsFromTokio = new ArrayList<>();
        destinationsFromTokio.add("New York");
        destinationsFromTokio.add("Warsaw");

        List<String> destinationsFromNewYork = new ArrayList<>();
        destinationsFromNewYork.add("Berlin");
        destinationsFromNewYork.add("Tokio");

        Map<String, List> destinationAirport = new HashMap<>();
        destinationAirport.put("New York", destinationsFromNewYork);
        destinationAirport.put("Tokio", destinationsFromTokio);
        destinationAirport.put("Berlin", destinationsFromBerlin);
        destinationAirport.put("Warsaw", destinationsFromWarsaw);

        if (!destinationAirport.containsKey(from)) {
            System.out.println("Lotnisko początkowe nie istnieje.");
        } else {
            for (Map.Entry<String, List> entry : destinationAirport.entrySet()) {
                if (entry.getKey().equals(from)) {
                    possibleDestinations = entry.getValue();
                }
            }
            for (String element : possibleDestinations) {
                if (element.equals(to)) {
                    foundFlight = true;
                }
            }
            if (foundFlight) {
                System.out.println("Znalazłem bezpośrednie połączenie pomiędzy " + from + " i " + to);
            } else {
                System.out.println("Brak bezpośrednich połączeń do " + to + ".");

            for (String element : possibleDestinations) { //Berlin, Tokio
                for (Map.Entry<String, List> entry : destinationAirport.entrySet()) {
                    if (entry.getKey().equals(element)) { // NY, Warsaw, NY, Warsaw
                        possibleDestinationsSecondRow = entry.getValue();
                        for (String secondRowElement : possibleDestinationsSecondRow) {
                            optionalAirportsCounter++;
                            if (secondRowElement.equals(to)) {
                                System.out.println("Znalazłem połączenie do " + to + " z przesiadką w " + element + ".");
                            } else {
                                //System.out.println("A" + optionalAirportsCounter);
                                falseCounter++;
                            }
                        }
                    }
                    }
                }
            }
            if (falseCounter == optionalAirportsCounter && !foundFlight) {
                System.out.println("Brak pośrednich połączeń do " + to + ".");
            }
        }
    }
}