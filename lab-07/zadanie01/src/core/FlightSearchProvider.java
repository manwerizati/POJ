package core;

import java.util.List;

public interface FlightSearchProvider {
    List<FlightTicket> searchFlights(String from, String to);
}
