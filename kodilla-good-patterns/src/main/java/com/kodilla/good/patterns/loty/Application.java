package com.kodilla.good.patterns.loty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<String, List<String>> availableFlights = new HashMap<>();
        availableFlights.put("Warszawa", Arrays.asList("Gdanska", "Poznan"));
        availableFlights.put("Gdansk", Arrays.asList("Warszawa", "Katowice"));
        availableFlights.put("Poznan", Arrays.asList("Warszawa", "Katowice"));
        availableFlights.put("Katowice", Arrays.asList("Gdansk", "Wroclaw"));
        availableFlights.put("Wroclaw", Arrays.asList("Rzeszow", "Poznan"));
        availableFlights.put("Rzeszow", Arrays.asList("Gdansk", "Poznan"));

        Flights f = new Flights(availableFlights);
       // f.searchFlightFrom("Warszawa");
      //  f.searchFlightTo("Poznan");
       f.searchFlightFromTo("Warszawa", "Rzeszow");
    }
}
