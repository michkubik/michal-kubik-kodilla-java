package com.kodilla.good.patterns.flightconnector;

import java.util.ArrayList;
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
        flightsFromWarsaw.stream()
                .forEach(System.out::println);

        List<Flight> flightsToPoznan = flightProcessor.findFlightsTo("Poznan");
        System.out.println("\nFlights to Poznan:");
        flightsToPoznan.stream()
                .forEach(System.out::println);

        List<Flight> flightsToPoznanViaCracow = flightProcessor.findFlightsVia("Gdansk", "Cracow", "Poznan");
        System.out.println("\nFlights to Poznan via Cracow:");
        flightsToPoznanViaCracow.stream()
                .forEach(System.out::println);




    }
}
