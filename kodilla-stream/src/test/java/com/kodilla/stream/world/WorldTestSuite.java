package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        Country country1 = new Country("Country A", new BigDecimal(35000000.00));
        Country country2 = new Country("Country B", new BigDecimal(155000000.00));
        Country country3 = new Country("Country C", new BigDecimal(350000000.00));

        ArrayList<Country> countryList1 = new ArrayList();
        countryList1.add(country1);
        countryList1.add(country2);
        countryList1.add(country3);

        Country country4 = new Country("Country D", new BigDecimal(1000000000.00));
        Country country5 = new Country("Country E", new BigDecimal(1900000000.00));
        Country country6 = new Country("Country F", new BigDecimal(900000000.00));

        ArrayList<Country> countryList2 = new ArrayList();
        countryList2.add(country4);
        countryList2.add(country5);
        countryList2.add(country6);


        // When
        Continent continent1 = new Continent("Europe", countryList1);
        Continent continent2 = new Continent("Asia", countryList2);
        List <Continent> continents = new ArrayList();
        continents.add((Continent) continent1);
        continents.add((Continent) continent2);
        World world = new World(continents);


        // Then
        BigDecimal expectedQuantity = new BigDecimal("4340000000");
        Assertions.assertEquals(expectedQuantity, world.getPeopleQuantity());

    }



}
