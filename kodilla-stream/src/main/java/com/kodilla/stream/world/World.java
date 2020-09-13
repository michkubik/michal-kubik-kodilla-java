package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private final List<Continent> continentList;

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }
}
