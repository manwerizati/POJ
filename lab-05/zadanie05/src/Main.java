public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Jan Kowalski", 20);
        System.out.println("Klient: " + c1);

        Invoice inv1 = new Invoice(101, c1, 1000.0);

        System.out.println("Faktura dla: " + inv1.getCustomerName());
        System.out.println("Kwota początkowa: " + inv1.getAmount());
        System.out.println("Kwota po zniżce (" + c1.getDiscount() + "%): " + inv1.getAmountAfterDiscount());

        c1.setDiscount(50);
        System.out.println("Kwota po zniżce (50%): " + inv1.getAmountAfterDiscount());
    }
}