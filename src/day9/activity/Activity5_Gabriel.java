package day9.activity;

import java.util.Scanner;

public class Activity5_Gabriel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ─────────────────────────────────────────
        // Activity 5.1 – Summation of 1 to N
        // ─────────────────────────────────────────
        System.out.println("=== Activity 5.1: Summation of 1 to N ===");
        System.out.print("Enter N: ");
        int n1 = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n1; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
        System.out.println("Final Sum: " + sum);


        // ─────────────────────────────────────────
        // Activity 5.2 – Product of 1 to N
        // ─────────────────────────────────────────
        System.out.println("\n=== Activity 5.2: Product of 1 to N ===");
        System.out.print("Enter N: ");
        int n2 = input.nextInt();

        long product = 1;
        for (int i = 1; i <= n2; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }
        System.out.println("Final Product: " + product);


        // ─────────────────────────────────────────
        // Activity 5.3 – Arithmetic Sequence (Sum Only)
        // ─────────────────────────────────────────
        System.out.println("\n=== Activity 5.3: Arithmetic Sequence (Sum Only) ===");
        System.out.print("Enter start number: ");
        int start3 = input.nextInt();
        System.out.print("Enter common difference: ");
        int diff3 = input.nextInt();
        System.out.print("Enter N (number of terms): ");
        int n3 = input.nextInt();

        int sum3 = 0;
        int current3 = start3;
        String sequence3 = "";

        for (int i = 1; i <= n3; i++) {
            sum3 += current3;
            if (i < n3) {
                sequence3 = sequence3 + current3 + " + ";
            } else {
                sequence3 = sequence3 + current3;
            }
            current3 += diff3;
        }

        System.out.println(sequence3 + " = " + sum3);


        // ─────────────────────────────────────────
        // Activity 5.4 – Arithmetic Sequence (Sum and Product)
        // ─────────────────────────────────────────
        System.out.println("\n=== Activity 5.4: Arithmetic Sequence (Sum and Product) ===");
        System.out.print("Enter start number: ");
        int start4 = input.nextInt();
        System.out.print("Enter common difference: ");
        int diff4 = input.nextInt();
        System.out.print("Enter N (number of terms): ");
        int n4 = input.nextInt();

        int sum4 = 0;
        long product4 = 1;
        int current4 = start4;
        String sumSeq = "";
        String prodSeq = "";

        for (int i = 1; i <= n4; i++) {
            sum4 += current4;
            product4 *= current4;
            if (i < n4) {
                sumSeq  = sumSeq  + current4 + " + ";
                prodSeq = prodSeq + current4 + " * ";
            } else {
                sumSeq  = sumSeq  + current4;
                prodSeq = prodSeq + current4;
            }
            current4 += diff4;
        }

        System.out.println("Sum: "     + sumSeq  + " = " + sum4);
        System.out.println("Product: " + prodSeq + " = " + product4);


        input.close();
    }
}