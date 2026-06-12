public abstract class Loan implements LoanConstants {
    protected int loanNumber;
    protected String customerLastName;
    protected double amount;
    protected double interestRate;
    protected int term;

    public Loan(int loanNumber, String customerLastName, double amount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;

        if (amount > maxLoanAmount) {
            System.out.println("Kwota przekracza limit: zredukowano do: $" + maxLoanAmount);
            this.amount = maxLoanAmount;
        } else {
            this.amount = amount;
        }

        if (term != shortTerm && term != mediumTerm && term != longTerm) {
            this.term = shortTerm;
        } else {
            this.term = term;
        }
    }

    @Override
    public String toString() {
        double fee = amount * (interestRate / 100.0) * term;
        double totalOwed = amount + fee;

        return String.format("Firma: %s\nNumer: %d | Nazwisko: %s\nKwota: $%.2f | Okres: %d rok/lata\nOprocentowanie: %.2f%% | Do spłaty: $%.2f\n", companyName, loanNumber, customerLastName, amount, term, interestRate, totalOwed);
    }
}
