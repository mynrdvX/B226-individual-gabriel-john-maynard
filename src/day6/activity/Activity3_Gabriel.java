
package day6.activity;


public class Activity3_Gabriel {
    
    public static void main(String[] args) {
     
        // ==========================================
        // Problem 2: Logical AND (&&) - Event Entry
        // ==========================================
        int age = 20;
        boolean hasValidID = true;

        // Person can enter if age is 18 or above AND has a valid ID
        boolean canEnter = (age >= 18) && hasValidID;

        System.out.println("=== Event Entry Check ===");
        System.out.println("Age: " + age);
        System.out.println("Has Valid ID: " + hasValidID);
        System.out.println("Allowed to Enter: " + canEnter);

        // ==========================================
        // Problem 3: Logical OR (||) - Class Schedule
        // ==========================================
        boolean isWeekend = true;
        boolean isHoliday = false;

        // No classes if it is a weekend OR a holiday
        boolean noClasses = isWeekend || isHoliday;

        System.out.println("\n=== Class Schedule Check ===");
        System.out.println("Is Weekend: " + isWeekend);
        System.out.println("Is Holiday: " + isHoliday);
        System.out.println("No Classes Today: " + noClasses);

        // ==========================================
        // Problem 4: Ternary (? :) - Passed or Failed
        // ==========================================
        int score = 85;

        // Score 75 and above = Passed, below 75 = Failed
        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println("\n=== Student Result ===");
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);

        // ==========================================
        // Problem 5: Ternary (? :) - Larger Number
        // ==========================================
        int num1 = 10;
        int num2 = 25;

        // Compare num1 and num2, store the larger number
        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("\n=== Larger Number ===");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("Larger Number: " + larger);
    }
}
