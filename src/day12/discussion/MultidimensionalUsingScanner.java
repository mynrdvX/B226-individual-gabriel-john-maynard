
package day12.discussion;

import java.util.Scanner;


public class MultidimensionalUsingScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = new int[2][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == 0) {
                    System.out.print("Enter an EVEN number[" + i + "][" + j + "]: ");
                    numbers[i][j] = scanner.nextInt();
                } else {
                    System.out.print("Enter an ODD number[" + i + "][" + j + "]: ");
                    numbers[i][j] = scanner.nextInt();
                }

            }
        }

        // Even Numbers: 2 4 6 8 10
        // Odd Numbers: 1 3 5 7 9
        System.out.println("\nPrinting all the numbers: ");
        for (int[] row : numbers) {
            for (int column : row) {
                System.out.println(column);
            }
            System.out.println("");
        }

    }
}
