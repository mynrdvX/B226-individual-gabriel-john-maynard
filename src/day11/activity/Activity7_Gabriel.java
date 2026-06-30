package day11.activity;

import java.util.Scanner;

public class Activity7_Gabriel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];

        int sum = 0;

        // Ask the user to input 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // Display all the numbers entered with index
        System.out.println("\nNumbers You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Compute and display the sum and average
        double average = (double) sum / numbers.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // Stretch Goal: Find highest and lowest number
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("Highest Number = " + highest);
        System.out.println("Lowest Number = " + lowest);

        input.close();
    }
}