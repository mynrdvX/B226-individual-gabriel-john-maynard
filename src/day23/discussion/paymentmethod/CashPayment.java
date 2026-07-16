
package day23.discussion.paymentmethod;

// tight coupling
public class CashPayment extends Payment{
    
    @Override
    public void pay(double amount ){
        System.out.println("Paid P" + amount + " using Cash Payment");
    }
    
    @Override
    public void deposit(double amount, String refNum) {
        System.out.println("Deposit P" + amount + " using Cash.");
    }
}
