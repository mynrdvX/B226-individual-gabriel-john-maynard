
package day24.activity15accountingtransactionsabstraction;


public abstract class Account {

    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public Account(
            String accountNumber,
            String accountHolder,
            double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void displayAccountInfo();
}