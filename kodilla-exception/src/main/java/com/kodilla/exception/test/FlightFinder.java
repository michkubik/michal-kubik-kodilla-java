package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Flight flight;

    public FlightFinder(Flight flight) {
        this.flight = flight;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {


        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Amsterdam", Boolean.TRUE);
        flightMap.put("London", Boolean.TRUE);
        flightMap.put("Berlin", Boolean.TRUE);
        flightMap.put("Milan", Boolean.TRUE);
        flightMap.put("Moscow", Boolean.FALSE);
        flightMap.put("New York", Boolean.FALSE);

        try {
            for (Map.Entry<String, Boolean> entry: flightMap.entrySet()) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    if (entry.getValue() == Boolean.TRUE)
                        System.out.println("There is such connection.");
                }
            }
        } catch (Exception e) {
            throw new RouteNotFoundException();
        } finally {
            System.out.println("Have a good day!");
        }


        // mamy haszmapę z informacją, czy do danego portu da się dolecieć
        // chyba musimy po niej iterować - jeśli dla któregoś będzie boolean że true to wtedy można

    }
}
