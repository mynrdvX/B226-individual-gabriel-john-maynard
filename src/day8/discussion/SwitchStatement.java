package day8.discussion;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1: Start Game");
                break;
            case 2:
                System.out.println("You selected Option 2: Load Game");
                break;
            case 3:
                System.out.println("You selected Option 3: Settings");
                break;
            case 4:
                System.out.println("You selected Option 4: Exit");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}