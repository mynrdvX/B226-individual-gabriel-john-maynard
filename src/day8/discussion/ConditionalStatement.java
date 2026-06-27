
package day8.discussion;
import java.util.Scanner;

public class ConditionalStatement {
    // User Login Program
    public static void main(String[] args) {
        //create scaner object to accept input from user
         Scanner input = new Scanner(System.in);
        
        //Predefined username and password (hardcoded for demo purposes)
        String username = "admin";
        String password = "admin123";
        
        System.out.print("Enter username: "); // Ask user for username
        String loginUsername =  input.nextLine(); // Read user input and stores it to loginUsername variable
        System.out.print("Enter password: "); // Ask user for password
        String loginPassword = input.nextLine(); // Read user input and stores it to loginPassword variable
        
        
        if(loginUsername.equals(username) && loginPassword.equals(password)){
            System.out.println("\nLogin Successful! " + "Welcome, " + username);
        } else {
            System.out.println("\nLogin Failed. Invalid username or password!");
        }
        
        //close the scanner
        input.close();
    }
}
