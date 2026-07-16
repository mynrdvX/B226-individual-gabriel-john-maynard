
package day23.discussion.paymentmethod;


public class Main {
    public static void main(String[] args) {
        // Instantiation (Dynamic Polymorphism)
        Payment cash = new CashPayment();
        Payment cc = new CreditCardPayment();
        Payment gcash = new GcashPayment();
        cash.pay(100);
        cc.pay(1000);
        gcash.pay(5000);
    }
}
