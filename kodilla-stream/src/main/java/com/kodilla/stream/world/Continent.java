package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continentName;
    private final ArrayList<Country> countryList;


    public Continent(String continentName, ArrayList<Country> countryList) {
        this.continentName = continentName;
        this.countryList = (ArrayList<Country>) countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }
}
