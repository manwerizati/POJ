package airlines;

import java.util.Date;

public class BATicket {
    public Date departureTime;
    public double ticketPrice;

    public BATicket(Date departureTime, double ticketPrice) {
        this.departureTime = departureTime;
        this.ticketPrice = ticketPrice;
    }
}