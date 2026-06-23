
package day5.activity;


public class Activity2_Gabriel {
    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Calculate percentage
        double foodPercent = (foodAllowance / income) * 100;
        double transportationPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        // Calculate remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Display results
        System.out.printf("Income: %.0f%n", income);

        System.out.printf("Food Allowance: %.1f%%%n", foodPercent);
        System.out.printf("Transportation: %.1f%%%n", transportationPercent);
        System.out.printf("Rent: %.1f%%%n", rentPercent);
        System.out.printf("Utility Bill: %.1f%%%n", utilityPercent);

        System.out.printf("Remaining Balance: %.0f%n", remainingBalance);
    }
 
}
