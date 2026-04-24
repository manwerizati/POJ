import java.util.ArrayList;
import java.util.List;

public class ParkMaszynowy {
    public static void main(String[] args) {

        Lokomotywa lok1 = new Lokomotywa("Newag", "Griffin", 0, RodzajSilnika.ELEKTRYCZNY, 40, "PKP");
        Lokomotywa lok2 = new Lokomotywa("Pesa", "Gama", 12800, RodzajSilnika.SPALINOWY, 25, "Intercity");

        Kosiarka kos1 = new Kosiarka("Marka", "Model", 50, RodzajSilnika.SPALINOWY, true, true, 20);
        Kosiarka kos2 = new Kosiarka("Marka1", "Model2", 70, RodzajSilnika.SPALINOWY, false, false, 5);

        Samochod sam1 = new Samochod("BMW", "Serii 3", 1998, RodzajSilnika.SPALINOWY, 258, 400, SegmentSamochodu.A, "XXXXXXXXXXXX");
        Samochod sam2 = new Samochod("Seat", "Toledo", 1598, RodzajSilnika.SPALINOWY, 105, 200, SegmentSamochodu.A, "YYYYYYYYYYYY");

        Jednoslad jed1 = new Jednoslad("Yamaha", "MT-07", 689, RodzajSilnika.SPALINOWY, 73.4, 67, TypJednosladu.MOTOCYKL);
        Jednoslad jed2 = new Jednoslad("Trek", "Marlin 7", TypJednosladu.ROWER);

        List<Maszyna> parkMaszyn = new ArrayList<>();
        parkMaszyn.add(lok1);
        parkMaszyn.add(lok2);
        parkMaszyn.add(kos1);
        parkMaszyn.add(kos2);
        parkMaszyn.add(sam1);
        parkMaszyn.add(sam2);
        parkMaszyn.add(jed1);
        parkMaszyn.add(jed2);

        for (Maszyna maszyna : parkMaszyn) {
            maszyna.wyswietl();
            System.out.println();
        }

        kos2.setCzyMelekser(true);
        kos2.setLiczbaOstrzy(4);
        kos2.wyswietl();
    }
}