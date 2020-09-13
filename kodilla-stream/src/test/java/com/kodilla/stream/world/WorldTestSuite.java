package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import com.kodilla.stream.world.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        Country country1 = new Country("Country A", 100000000);
        Country country2 = new Country("Country B", 300000000);
        Country country3 = new Country("Country C", 150000000);

        List countryList1 = new ArrayList();
        countryList1.add(country1);
        countryList1.add(country2);
        countryList1.add(country3);

        Country country4 = new Country("Country D", 100000000);
        Country country5 = new Country("Country E", 800000000);
        Country country6 = new Country("Country F", 900000000);

        List countryList2 = new ArrayList();
        countryList2.add(country4);
        countryList2.add(country4);
        countryList2.add(country6);


        // When
        List continent1 = (List) new Continent("Europe", countryList1);
        List continent2 = (List) new Continent("Asia", countryList2);
        List continents = new ArrayList();
        continents.add(continent1);
        continents.add(continent2);
        World world = new World(continents);


        // Then
        BigDecimal expectedQuantity = new BigDecimal("2350000000");
        Assertions.assertEquals(expectedQuantity, world.getPeopleQuantity());

    }



}
