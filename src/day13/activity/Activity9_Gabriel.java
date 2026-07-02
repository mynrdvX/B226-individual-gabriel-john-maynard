package day13.activity;

import java.util.Scanner;

public class Activity9_Gabriel {

    public static void main(String[] args) {

        System.out.println("===== Activity 9: String Class =====\n");

        // ============================================
        // contains()
        // Checks if a string contains a specific sequence of characters.
        // Returns true if found; otherwise, false.
        // ============================================
        String country = "Philippines";
        System.out.println("contains(): " + country.contains("lip"));
        System.out.println();

        // ============================================
        // endsWith()
        // Checks if a string ends with the specified suffix.
        // Returns true or false.
        // ============================================
        System.out.println("endsWith(): " + country.endsWith("es"));
        System.out.println();

        // ============================================
        // startsWith()
        // Checks if a string starts with the specified prefix.
        // Returns true or false.
        // ============================================
        System.out.println("startsWith(): " + country.startsWith("Phi"));
        System.out.println();

        // ============================================
        // indexOf()
        // Returns the index of the first occurrence of
        // a character or substring. Returns -1 if not found.
        // ============================================
        System.out.println("indexOf(): " + country.indexOf("i"));
        System.out.println();

        // ============================================
        // isEmpty()
        // Checks whether a string is empty.
        // Returns true if the string has no characters.
        // ============================================
        String empty = "";
        System.out.println("isEmpty(): " + empty.isEmpty());
        System.out.println();

        // ============================================
        // trim()
        // Removes spaces at the beginning and end
        // of a string.
        // ============================================
        String text = "   Hello Java   ";
        System.out.println("Before trim(): '" + text + "'");
        System.out.println("After trim(): '" + text.trim() + "'");
        System.out.println();

        // ============================================
        // replace()
        // Replaces all occurrences of a specified
        // character or string.
        // ============================================
        System.out.println("replace(): " + country.replace("i", "I"));
        System.out.println();

        // ============================================
        // toCharArray()
        // Converts a string into a character array.
        // ============================================
        char[] letters = country.toCharArray();

        System.out.print("toCharArray(): ");

        for (char letter : letters) {
            System.out.print(letter + " ");
        }

        System.out.println("\n");

        // ============================================
        // nextLine().charAt()
        // Reads a whole line from the user and gets
        // the character at the specified index.
        // ============================================
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        char firstLetter = scanner.nextLine().charAt(0);

        System.out.println("First character entered: " + firstLetter);
        System.out.println();

        // ============================================
        // valueOf()
        // Converts another data type into a String.
        // ============================================
        int number = 100;
        String converted = String.valueOf(number);

        System.out.println("valueOf(): " + converted);

        scanner.close();
    }
}