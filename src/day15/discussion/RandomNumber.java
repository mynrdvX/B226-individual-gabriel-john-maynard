package day15.discussion;

public class RandomNumber {
    
    public static void main(String[] args) {
        // Lotto Simulator (6/58)
//        for (int i = 1; i <= 6; i++) {
//            int randomNumber = (int) (Math.random() * 58) + 1;
//            System.out.println("Number " + i + ": " + randomNumber);
//        }


        // Console-Based BINGO Simulator

        // Generate a random number from 1 to 75
        int roll = (int) (Math.random() * 75) + 1;

        String letter;

        // B = Numbers 1 to 15
        if (roll <= 15) {
            letter = "B";

        // I = Numbers 16 to 30
        } else if (roll <= 30) {
            letter = "I";

        // N = Numbers 31 to 45
        } else if (roll <= 45) {
            letter = "N";

        // G = Numbers 46 to 60
        } else if (roll <= 60) {
            letter = "G";

        // O = Numbers 61 to 75
        } else {
            letter = "O";
        }

        System.out.println("BINGO Ball Drawn: " + letter + "-" + roll);

    }
    
    
}