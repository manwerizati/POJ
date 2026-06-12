import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loan[] loans = new Loan[5];

        System.out.print("Podaj aktualną stopę procentową: ");
        double primeRate = scanner.nextDouble();

        for (int i = 0; i < loans.length; i++) {
            System.out.print("Wybierz typ (1 - Biznesowa, 2 - Osobista): ");
            int loanType = scanner.nextInt();

            System.out.print("Numer pożyczki: ");
            int loanNum = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Nazwisko klienta: ");
            String lastName = scanner.nextLine();

            System.out.print("Kwota pożyczki (max 100000): ");
            double amount = scanner.nextDouble();

            System.out.print("Okres pożyczki w latach (1, 3 lub 5): ");
            int term = scanner.nextInt();

            if (loanType == 1) {
                loans[i] = new BusinessLoan(loanNum, lastName, amount, term, primeRate);
            } else {
                loans[i] = new PersonalLoan(loanNum, lastName, amount, term, primeRate);
            }
        }

        for (Loan currentLoan : loans) {
            System.out.println(currentLoan.toString());
        }

        scanner.close();
    }
}
