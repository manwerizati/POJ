package core;

public class FlightTicket {
    public String from;
    public String to;
    public double price;
    public int numberOfStops;
    public int flightDuration;

    public FlightTicket(String from, String to, double price, int numberOfStops, int flightDuration) {
        this.from = from;
        this.to = to;
        this.price = price;
        this.numberOfStops = numberOfStops;
        this.flightDuration = flightDuration;
    }
}
