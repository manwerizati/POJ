public class Health extends Insurance {
    Health() {
        super("Health");
    };

    @Override
    public void setCost() {
        monthlyPrice = 196;
    }

    @Override
    public void display() {
        System.out.println("Typ ubezpieczenia: " + type);
        System.out.println("Miesięczny koszt: $" + monthlyPrice);
    }
}

