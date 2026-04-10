/* Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu.
Klasa przechowuje następujące informacje: product_number (typ String), prodcut_description (typ String), quantity(typ int) i
pricePerItem`(typ double). Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów.
Zaimplementuj metody set i get dla każdej zmiennej. Dodaj metodę:
Amount, które zwraca iloczyn quantity i pricePerItem. Jeżeli pricePerItem nie jest dodatnia, Amount powinien zwrócić 0. Jeżeli quantity nie jest dodatnie, Amount powinna zwrócić 0. Przetestuj zaimplementowany program.

Dominik Borzyszkowski, s35498
 */

class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Numer", "Opis", 3, 20);
        System.out.println(invoice.Amount());

        Invoice invoice1 = new Invoice("Numer", "Opis", -3, 20);
        System.out.println(invoice1.Amount());

        Invoice invoice2 = new Invoice("Numer", "Opis", 3, -20);
        System.out.println(invoice2.Amount());
    }
}