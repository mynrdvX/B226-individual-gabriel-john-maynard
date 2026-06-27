package day8.discussion;
import java.util.Scanner;

public class AgeClassification {

    public static void main(String[] args) {
/*
            Age: 0 - 12 -> Child 
                Age: 0 - 5 ->  Specifically, Toddler
                Age: 6 - 12 ->  Specifically, Pre-Teen
            Age: 13 - 19 -> Teenager
                Age: 13 - 15 ->  Specifically, Eary Teen
                Age: 16 - 19 ->  Specifically, Late Teen
            Age: 20 - 59 -> Adult
                Age: 20 - 35 ->  Specifically, Young Adult
                Age: 36 - 59 ->  Specifically, Middle-Aged
            Age: 60 - 120 -> Senior Citizen
                Age: 60 - 75 ->  Specifically, Young Senior
                Age: 76 - 120 ->  Specifically, Elderly
            Invalid Age -> Invalid Input
        */
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Invalid age entered.");
        } 
        else {

            if (age <= 12) {
                System.out.println("You are a Child");

                if (age <= 5) {
                    System.out.println("Specifically, Toddler");
                } else {
                    System.out.println("Specifically, Pre-Teen");
                }

            } 
            else if (age <= 19) {
                System.out.println("You are a Teenager");

                if (age <= 15) {
                    System.out.println("Specifically, Early Teen");
                } else {
                    System.out.println("Specifically, Late Teen");
                }

            } 
            else if (age <= 59) {
                System.out.println("You are an Adult");

                if (age <= 35) {
                    System.out.println("Specifically, Young Adult");
                } else {
                    System.out.println("Specifically, Middle-Aged");
                }

            } 
            else {
                System.out.println("You are a Senior Citizen");

                if (age <= 75) {
                    System.out.println("Specifically, Young Senior");
                } else {
                    System.out.println("Specifically, Elderly");
                }
            }
        }

        input.close();
    }
}