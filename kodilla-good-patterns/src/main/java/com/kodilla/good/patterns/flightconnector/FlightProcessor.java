package com.kodilla.good.patterns.flightconnector;

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

    public List<Flight> findFlightsVia(String departureAirport, String viaAirport, String destinationAirport) {

        /*List<Flight> viaFlights = findFlightsTo(viaAirport);
        return viaFlights.stream()
                .filter(z -> z.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
*/
        return flights.stream()
                .filter(z -> z.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList()).stream()
                    .filter(x -> x.getDestinationAirport().equals(viaAirport))
                    .collect(Collectors.toList()).stream()
                        .filter(y -> y.getDestinationAirport().equals(destinationAirport))
                        .collect(Collectors.toList());



    }

}
