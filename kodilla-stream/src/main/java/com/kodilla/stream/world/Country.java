package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final int population;

    public Country(String countryName, int population) {
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public final BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal(population);
        return peopleQuantity;
    }
}