/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.discussion;

import java.util.Scanner;

public class InfiniteLoop {

    public static void main(String[] args) {
        
        // When to use Do - While: if you must have to execute the loop at least once
        String color = "Black";
        do {
            System.out.println(color);
        } while(color.equals("White"));
        
        
        // syntax for do while loop
        // infinite loop / has no fixed of iterations
//        Scanner input = new Scanner(System.in);
//        int choice;
//        System.out.print("Enter your choice: ");
//        choice = input.nextInt();
//        
//        do  {
//            System.out.println("=== Main Menu ===");
//            System.out.println("    [1] Start Game");
//            System.out.println("    [2] Load Game");
//            System.out.println("    [3] Settings");
//            System.out.println("    [4] Exit"); 
//        }  while (choice != 4);

        // keep looping ulti user chooses Exit
        
        
        
        //input.close(); // Close the Scanner to free resources

        // Common Real-World Uses of DO while
        /*
            Menu-driven programs
            User input validation
            Repetitive Task with guaranteed first run -> Do you want to continue? 
         */
    }
}
