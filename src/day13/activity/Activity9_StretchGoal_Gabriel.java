package day13.activity;

public class Activity9_StretchGoal_Gabriel {

    public static void main(String[] args) {

        // Given string (as required by the activity)
        String country = "Philippines";

        System.out.println("===== Activity 9: Stretch Goal =====");
        System.out.println("Country: " + country);
        System.out.println();

        // ============================================
        // Display the first and last character
        // ============================================
        char firstCharacter = country.charAt(0);
        char lastCharacter = country.charAt(country.length() - 1);

        System.out.println("First Character: " + firstCharacter);
        System.out.println("Last Character: " + lastCharacter);
        System.out.println();

        // ============================================
        // Count how many times 'P' or 'p' appears
        // ============================================
        int pCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char letter = country.charAt(i);

            if (letter == 'P' || letter == 'p') {
                pCount++;
            }

        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println();

        // ============================================
        // Count the total number of vowels
        // ============================================
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char letter = Character.toLowerCase(country.charAt(i));

            if (letter == 'a' ||
                letter == 'e' ||
                letter == 'i' ||
                letter == 'o' ||
                letter == 'u') {

                vowelCount++;
            }

        }

        System.out.println("Total Number of Vowels: " + vowelCount);
    }
}