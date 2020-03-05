package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    final private String continentName;
    final private List<Country> countries = new ArrayList();

    public Continent(String continentName) {

        this.continentName = continentName;
    }

    public void addCountry(Country country){

        countries.add(country);
    }

    public String getContinentName() {

        return continentName;
    }

    public List<Country> getCountries() {

        return countries;
    }
}
