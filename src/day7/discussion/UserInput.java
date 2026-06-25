
package day7.discussion;

import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        // create object of scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine(); // String input
        
        System.out.print("Enter age: ");
        int age = input.nextByte();
        
        System.out.print("Enter Salary: ");    
        double salary = input.nextDouble(); //double input
        
        
        //Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
    }
}
