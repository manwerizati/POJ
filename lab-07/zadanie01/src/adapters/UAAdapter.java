package adapters;

import core.FlightSearchProvider;
import core.FlightTicket;

import airlines.UATicketInfo;
import airlines.UATicketService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UAAdapter implements FlightSearchProvider {
    private UATicketService uaService;

    public UAAdapter(UATicketService uaService) {
        this.uaService = uaService;
    }

    @Override
    public List<FlightTicket> searchFlights(String from, String to) {
        List<UATicketInfo> theirTickets = uaService.getTicketInfo(from, to, new Date());

        List<FlightTicket> ourTickets = new ArrayList<>();

        for (UATicketInfo foreignTicket : theirTickets) {
            FlightTicket ourNewTicket = new FlightTicket(foreignTicket.from, foreignTicket.to, foreignTicket.price, 0, 120);

            ourTickets.add(ourNewTicket);
        }

        return ourTickets;
    }
}
