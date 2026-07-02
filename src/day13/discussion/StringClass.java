
package day13.discussion;

import java.util.Scanner;


public class StringClass {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Display the exit confirmation menu
        System.out.println("Are you sure that you want to exit? \n\t[Y] Yes \n\t[N] No");
        
        // Prompt the user for their choice
        System.out.print("Enter your choice: ");    
        String choice = scanner.nextLine(); // Read the user's input as a string
        
        // Check the user's choice (ignoring case sensitivity)
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting..."); // If user enters Y or y
        } else if(choice.equalsIgnoreCase("n")){
            System.out.println("Go Back to Main Menu"); // For any other input
        } else {
            System.out.println("Invalid Input!");
        }
        
        scanner.close(); // Close the Scanner
    }
}


/*
    charAt()

    int num = 10; // fixed value
        
        
        String word = "Hello";
        //System.out.println(word.charAt(0));
        //System.out.println(word.charAt(2));
        
        //System.out.print("Enter gender: ");
        String gender = "Female"; // The String value
        char genderPrefix = gender.charAt(0); // Gets the first character
        System.out.println(genderPrefix);
*/


/*
    length()

    String word = "Hello Java";
        System.out.println(word.length());   
        
        
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
*/


/* toUpperCase() toLowerCase()
    String country = "Philippines";
        
        System.out.println(country.toLowerCase());
        System.out.println(country.toUpperCase());
*/

/*
     concat() +
        String firstName = "Winter";
        String lastName = " Mapagmahal";
        
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName + lastName);
*/

/*
    // equals()
        String username = "winter";
        String loginUsername = "winter123";
        
        System.out.println(username.equals(loginUsername));
*/