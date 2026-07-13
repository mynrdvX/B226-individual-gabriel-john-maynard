package day21.activity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("*      User Account Registration       *");
        System.out.println("****************************************");

        System.out.print("\nEnter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Address: ");
        String address = input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        // Create object using constructor
        UserAccount user = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );

        System.out.println("\n--- User Account Created ---");
        System.out.println("Full Name: " +
                user.getFirstName() + " " +
                user.getMiddleName() + " " +
                user.getLastName());

        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        input.close();
    }
}