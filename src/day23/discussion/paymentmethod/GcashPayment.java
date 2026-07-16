
package day23.discussion.paymentmethod;


public class GcashPayment extends Payment{
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid P" + amount + " using Gcash Payment");
    }
    
    
}
