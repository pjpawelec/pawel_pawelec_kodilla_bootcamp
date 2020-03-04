package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        World world = new World();

        //When
        europe.addCountry(new Country("Poland", 50000));
        europe.addCountry(new Country("Germany", 80000));
        asia.addCountry(new Country("China", 100000));
        asia.addCountry(new Country("Japan", 60000));
        africa.addCountry(new Country("Kenya", 30000));
        africa.addCountry(new Country("Eqypt", 50000));

        BigDecimal resultPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("370000");
        Assert.assertEquals(expectedPopulation, resultPopulation);
    }
}
