
package day16.activity;


public class Activity12_Gabriel {
    
    public static void main(String[] args) {
         // 1. Identify if a number is odd or even
        int number = 15;
        System.out.println("1. Odd or Even");
        System.out.println(number + " is " + checkOddEven(number));

        // 2. Print your name 50 times
        System.out.println("\n2. Print Name 50 Times");
        printName50Times();

        // 3. Get the square root of a certain variable
        double value = 81;
        System.out.println("\n3. Square Root");
        System.out.println("Square root of " + value + " = " + getSquareRoot(value));

        // 4. Get the power of a number using base and exponent
        int base = 2;
        int exponent = 5;
        System.out.println("\n4. Power");
        System.out.println(base + "^" + exponent + " = " + getPower(base, exponent));

        // 5. Print a random number between 1 and 100
        System.out.println("\n5. Random Number");
        System.out.println("Random Number: " + getRandomNumber());

        // 6. Get the area of a circle using the given radius
        double radius = 7;
        System.out.println("\n6. Area of Circle");
        System.out.printf("Area = %.2f%n", getAreaOfCircle(radius));

        // 7. Identify if a person is a voter or not
        int age = 26;
        System.out.println("\n7. Voter Checker");
        System.out.println("Age " + age + ": " + checkVoter(age));

        // 8. Get the length of a certain word
        String word = "Programming";
        System.out.println("\n8. Length of Word");
        System.out.println("Length of \"" + word + "\" = " + getWordLength(word));

        // 9. Print a certain word in reverse order
        System.out.println("\n9. Reverse Word");
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reverseWord(word));

        // 10. Print your full name and age
        System.out.println("\n10. Full Name and Age");
        printPersonalInfo();
    }

    // 1. Method to identify if a number is odd or even
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // 2. Method to print your name 50 times
    public static void printName50Times() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". John Maynard Gabriel");
        }
    }

    // 3. Method to get the square root
    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // 4. Method to get the power of a number
    public static double getPower(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    // 5. Method to print a random number between 1 and 100
    public static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    // 6. Method to get the area of a circle
    public static double getAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 7. Method to identify if a person is a voter
    public static String checkVoter(int age) {
        if (age >= 18) {
            return "Eligible to Vote";
        } else {
            return "Not Eligible to Vote";
        }
    }

    // 8. Method to get the length of a word
    public static int getWordLength(String word) {
        return word.length();
    }

    // 9. Method to print a word in reverse order
    public static String reverseWord(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }

    // 10. Method to print full name and age
    public static void printPersonalInfo() {
        System.out.println("Full Name : John Maynard Gabriel");
        System.out.println("Age       : 26 years old");
    }
}
