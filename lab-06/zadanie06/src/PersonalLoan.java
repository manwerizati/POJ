public class PersonalLoan extends Loan {
    public PersonalLoan(int loanNumber, String customerLastName, double amount, int term, double primeRate) {
        super(loanNumber, customerLastName, amount, term);
        this.interestRate = primeRate + 2.0;
    }
}
