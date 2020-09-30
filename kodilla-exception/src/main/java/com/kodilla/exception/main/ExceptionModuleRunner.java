package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
       /* FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();

        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }*/

        Flight flight = new Flight("Warsaw", "Moscow");
        FlightFinder flightFinder = new FlightFinder(flight);
        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Arrival airport not found!");
        }
    }
}
