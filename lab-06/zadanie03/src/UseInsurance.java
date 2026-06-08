import java.util.Scanner;

public class UseInsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz typ ubezpieczenia: ");
        String input = scanner.nextLine();

        Insurance insurance = null;

        if (input.equalsIgnoreCase("health")) {
            insurance = new Health();
        } else if (input.equalsIgnoreCase("life")) {
            insurance = new Life();
        } else {
            System.out.println("Niepoprawne dane");
        }

        if (insurance != null) {
            insurance.setCost();
            insurance.display();
        }

        scanner.close();
    }
}
