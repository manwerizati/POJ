public class Lokomotywa extends Maszyna {
    private int iloscWagonow;
    private String przewoznik;

    public Lokomotywa(String marka, String nazwa, int pojemnoscSilnika, rodzajSilnika rodzajSilnika, int iloscWagonow, String przewoznik) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.iloscWagonow = iloscWagonow;
        this.przewoznik = przewoznik;
    }

    public void wyswietl() {
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Silnik: " + rodzajSilnika + " (" + pojemnoscSilnika + " cm3)");
        System.out.println("Przewoźnik: " + przewoznik);
        System.out.println("Ilość wagonów: " + iloscWagonow);
    }
}