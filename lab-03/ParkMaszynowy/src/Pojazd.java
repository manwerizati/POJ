public class Pojazd extends Maszyna {
    protected double moc;
    protected double momentObrotowy;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;

    public Pojazd(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        maxLiczbaPojazdow++;
        this.nrPojazdu = maxLiczbaPojazdow;
    }

    public void wyswietl() {
        System.out.println("Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        if (pojemnoscSilnika > 0) {
            System.out.println("Silnik: " + rodzajSilnika + " (" + pojemnoscSilnika + " cm3)");
        }
        if (moc > 0) {
            System.out.println("Moc: " + moc + " KM");
        }
        if (momentObrotowy > 0) {
            System.out.println("Moment obrotowy: " + momentObrotowy + " Nm");
        }
    }
}