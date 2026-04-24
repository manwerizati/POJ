public class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        setCzyMelekser(czyMelekser);
        setCzyNaped(czyNaped);
        setLiczbaOstrzy(liczbaOstrzy);
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }
    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }
    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Silnik: " + rodzajSilnika + " (" + pojemnoscSilnika + " cm3)");
        System.out.println("Melekser: " + (czyMelekser ? "Tak" : "Nie"));
        System.out.println("Napęd: " + (czyNaped ? "Tak" : "Nie"));
        System.out.println("Liczba ostrzy: " + liczbaOstrzy);
    }
}
