public abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected int pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;

    public Maszyna(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }

    public abstract void wyswietl();
}