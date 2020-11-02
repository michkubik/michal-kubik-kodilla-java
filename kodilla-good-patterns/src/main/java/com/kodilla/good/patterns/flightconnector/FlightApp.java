package com.kodilla.good.patterns.flightconnector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightApp {

    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Poznan");
        Flight flight2 = new Flight("Warsaw", "Cracow");
        Flight flight3 = new Flight("Warsaw", "Gdansk");
        Flight flight4 = new Flight("Gdansk", "Cracow");
        Flight flight5 = new Flight("Cracow", "Poznan");
        Flight flight6 = new Flight("Gdansk", "Warsaw");
        Flight flight7 = new Flight("Cracow", "Warsaw");

        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
        flights.add(flight7);

        FlightProcessor flightProcessor = new FlightProcessor(flights);
        List<Flight> flightsFromWarsaw = flightProcessor.findFlightsFrom("Warsaw");
        System.out.println("Flights to Warsaw:");
        flightsFromWarsaw
                .forEach(System.out::println);

        List<Flight> flightsToPoznan = flightProcessor.findFlightsTo("Poznan");
        System.out.println("\nFlights to Poznan:");
        flightsToPoznan
                .forEach(System.out::println);

        List<Flight[]> flightsToPoznanWithTransfer = flightProcessor.findFlightsVia("Gdansk", "Poznan");
        System.out.println("\nFlights to Poznan with Transfer:");
        flightsToPoznanWithTransfer
                .forEach(e -> System.out.println(Arrays.deepToString(e)));





    }
}
