
package day24.activity15accountingtransactionsabstraction;


public class SavingsAccount extends Account implements Transaction {

    private double interestRate;

    public SavingsAccount(
            String accountNumber,
            String accountHolder,
            double balance,
            double interestRate) {

        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {

        System.out.println("\n--- Savings Account Information ---");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.printf("Balance: %.2f%n", getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;

            System.out.printf(
                    "%nDeposited %.2f into Savings Account.%n",
                    amount
            );

            System.out.printf("New Balance: %.2f%n", balance);

        } else {
            System.out.println(
                    "\nDeposit amount must be greater than zero."
            );
        }
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "\nWithdrawal amount must be greater than zero."
            );

        } else if (amount <= balance) {
            balance -= amount;

            System.out.printf(
                    "%nWithdrew %.2f from Savings Account.%n",
                    amount
            );

            System.out.printf("New Balance: %.2f%n", balance);

        } else {
            System.out.println("\nInsufficient balance.");
        }
    }
}