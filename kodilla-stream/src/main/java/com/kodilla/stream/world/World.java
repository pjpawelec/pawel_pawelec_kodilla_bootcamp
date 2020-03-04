package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private List<Continent> continents = new ArrayList<>();

    public void addContinent() {
        continents.add(new Continent("Europe"));
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Africa"));
    }

    public List<Continent> getPeopleQuantity(){
        return continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}