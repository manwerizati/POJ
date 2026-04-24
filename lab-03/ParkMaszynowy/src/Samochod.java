public class Samochod extends Pojazd {
    private SegmentSamochodu segment;
    private String VIN;

    public Samochod(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy, SegmentSamochodu segment, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        this.VIN = VIN;
    }

    public void wyswietl() {
        super.wyswietl();
        System.out.println("Segment: " + segment);
        System.out.println("VIN: " + VIN);
    }
}