package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {


    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Amsterdam", Boolean.TRUE);
        flightMap.put("London", Boolean.TRUE);
        flightMap.put("Berlin", Boolean.TRUE);
        flightMap.put("Milan", Boolean.TRUE);
        flightMap.put("Moscow", Boolean.FALSE);
        flightMap.put("New York", Boolean.FALSE);

        boolean existDepartureAirport = flightMap.containsKey(flight.getDepartureAirport());
        boolean existArrivalAirport = flightMap.containsKey(flight.getArrivalAirport());

        if (!existArrivalAirport || !existDepartureAirport) {
            throw new RouteNotFoundException();
        }

        return flightMap.get(flight.getArrivalAirport());


    }
}
