import airlines.*;
import adapters.*;
import core.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UATicketService uaMockService = new UATicketService() {
            @Override
            public List<UATicketInfo> getTicketInfo(String from, String to, Date when) {
                return List.of(
                        new UATicketInfo(from, to, when, 2500.0),
                        new UATicketInfo(from, to, when, 1800.0)
                );
            }
        };

        BATicketService baMockService = new BATicketService() {
            @Override
            public List<BATicket> getTicketInfo(Airport from, Airport to, Date when) {
                return List.of(
                        new BATicket(when, 3000.0),
                        new BATicket(when, 1200.0)
                );
            }
        };

        FlightSearchProvider unitedAdapter = new UAAdapter(uaMockService);
        FlightSearchProvider britishAdapter = new BATAdapter(baMockService);

        List<FlightTicket> allTickets = new ArrayList<>();

        allTickets.addAll(unitedAdapter.searchFlights("Warszawa", "Nowy Jork"));
        allTickets.addAll(britishAdapter.searchFlights("Warszawa", "Nowy Jork"));

        printOutTickets(allTickets);

        List<FlightTicket> sortedTickets = new ArrayList<>(allTickets);

        for (int i = 0; i < sortedTickets.size() - 1; i++) {
            for (int j = 0; j < sortedTickets.size() - 1 - i; j++) {
                if (sortedTickets.get(j).price > sortedTickets.get(j + 1).price) {
                    FlightTicket temp = sortedTickets.get(j);
                    sortedTickets.set(j, sortedTickets.get(j + 1));
                    sortedTickets.set(j + 1, temp);
                }
            }
        }

        printOutTickets(sortedTickets);

        List<FlightTicket> cheapTickets = new ArrayList<>();

        for (FlightTicket ticket : allTickets) {
            if (ticket.price < 2000.0) {
                cheapTickets.add(ticket);
            }
        }

        printOutTickets(cheapTickets);
    }

    private static void printOutTickets(List<FlightTicket> tickets) {
        for (FlightTicket ticket : tickets) {
            System.out.printf("Lot: %s -> %s, Cena: %6.2f PLN, Przesiadki: %d, Czas: %d min\n",
                    ticket.from, ticket.to, ticket.price, ticket.numberOfStops, ticket.flightDuration);
        }
    }
}