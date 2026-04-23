public abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected int pojemnoscSilnika;
    protected rodzajSilnika rodzajSilnika;

    public Maszyna(String marka, String nazwa, int pojemnoscSilnika, rodzajSilnika rodzajSilnika) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }
}