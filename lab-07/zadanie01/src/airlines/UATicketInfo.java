package airlines;

import java.util.Date;

public class UATicketInfo {
    public String from;
    public String to;
    public Date dateTime;
    public double price;

    public UATicketInfo(String from, String to, Date dateTime, double price) {
        this.from = from;
        this.to = to;
        this.dateTime = dateTime;
        this.price = price;
    }
}