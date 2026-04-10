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