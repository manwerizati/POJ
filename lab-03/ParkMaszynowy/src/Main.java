public class Main {
    public static void main(String[] args) {
        Lokomotywa lok1 = new Lokomotywa("Newag", "Griffin", 0, rodzajSilnika.ELEKTRYCZNY, 40, "PKP");
        lok1.wyswietl();
        Lokomotywa lok2 = new Lokomotywa("Pesa", "Gama", 12800, rodzajSilnika.SPALINOWY, 25, "Intercity");
        lok2.wyswietl();
    }
}
