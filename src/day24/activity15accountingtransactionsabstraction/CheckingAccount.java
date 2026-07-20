
package day24.activity15accountingtransactionsabstraction;


public class CheckingAccount extends Account implements Transaction {

    private double overdraftLimit;

    public CheckingAccount(
            String accountNumber,
            String accountHolder,
            double balance,
            double overdraftLimit) {

        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {

        System.out.println("\n--- Checking Account Information ---");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.printf("Balance: %.2f%n", getBalance());
        System.out.printf("Overdraft Limit: %.2f%n", overdraftLimit);
    }

    @Override
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;

            System.out.printf(
                    "%nDeposited %.2f into Checking Account.%n",
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

        } else if (amount <= balance + overdraftLimit) {
            balance -= amount;

            System.out.printf(
                    "%nWithdrew %.2f from Checking Account.%n",
                    amount
            );

            if (balance < 0) {
                System.out.println(
                        "Transaction completed using overdraft."
                );
            }

            System.out.printf("New Balance: %.2f%n", balance);

        } else {
            System.out.println(
                    "\nWithdrawal exceeds the available balance "
                    + "and overdraft limit."
            );
        }
    }
}