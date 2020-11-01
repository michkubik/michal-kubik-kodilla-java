package com.kodilla.good.patterns.flightconnector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {

    private List<Flight> flights;

    public FlightProcessor(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departureAirport) {
        return flights.stream()
                .filter(v -> v.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String destinationAirport) {
        return flights.stream()
                .filter(y -> y.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
    }

    public List<Flight[]> findFlightsVia(String departureAirport, /*String viaAirport, */String destinationAirport) {

        List<Flight> listOfFlightsFrom = findFlightsFrom(departureAirport);
        List<Flight> listOfFlightsTo = findFlightsTo(destinationAirport);
        List<Flight[]> listOfFlightsWithTransfer = new ArrayList<>();
        for (Flight flight : listOfFlightsFrom) {
            listOfFlightsTo.stream()
                    .filter(e -> e.getDepartureAirport().equals(flight.getDestinationAirport()))
                    .map(e -> new Flight[]{flight, e})
                    .forEach(listOfFlightsWithTransfer::add);
        }

        return listOfFlightsWithTransfer;


    }

}
