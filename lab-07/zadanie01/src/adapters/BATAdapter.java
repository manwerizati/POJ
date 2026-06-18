package adapters;

import core.FlightSearchProvider;
import core.FlightTicket;

import airlines.Airport;
import airlines.BATicket;
import airlines.BATicketService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BATAdapter implements FlightSearchProvider {
    private BATicketService baTicket;

    public BATAdapter(BATicketService baTicket) {
        this.baTicket = baTicket;
    }

    @Override
    public List<FlightTicket> searchFlights(String from, String to) {
        List<BATicket> theirTickets = baTicket.getTicketInfo(new Airport(from), new Airport(to), new Date());

        List<FlightTicket> ourTickets = new ArrayList<>();

        for (BATicket foreignTickets : theirTickets) {
            FlightTicket ourNewTicket = new FlightTicket(from, to, foreignTickets.ticketPrice, 0, 120);

            ourTickets.add(ourNewTicket);
        }

        return ourTickets;
    }
}
