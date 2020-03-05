package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        europe.addCountry(new Country("Poland", new BigDecimal("50000")));
        europe.addCountry(new Country("Germany", new BigDecimal("80000")));
        asia.addCountry(new Country("China", new BigDecimal("100000")));
        asia.addCountry(new Country("Japan", new BigDecimal("60000")));
        africa.addCountry(new Country("Kenya", new BigDecimal("30000")));
        africa.addCountry(new Country("Eqypt", new BigDecimal("50000")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        BigDecimal resultPopulation = world.getPeopleQuantity();

        BigDecimal expectedPopulation = new BigDecimal("370000");

        Assert.assertEquals(expectedPopulation, resultPopulation);
    }
}
