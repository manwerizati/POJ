public class Life extends Insurance {
    Life() {
        super("Life");
    };

    @Override
    public void setCost() {
        monthlyPrice = 36;
    }

    @Override
    public void display() {
        System.out.println("Typ ubezpieczenia: " + type);
        System.out.println("Miesięczny koszt: $" + monthlyPrice);
    }
}
