public class BusinessLoan extends Loan {
    public BusinessLoan(int loanNumber, String customerLastName, double amount, int term, double primeRate) {
        super(loanNumber, customerLastName, amount, term);
        this.interestRate = primeRate + 1.0;
    }
}
