
package day24.activity15accountingtransactionsabstraction;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        SavingsAccount savingsAccount = null;
        CheckingAccount checkingAccount = null;

        int mainChoice;

        do {
            displayMainMenu();

            System.out.print("Enter your choice: ");
            mainChoice = scan.nextInt();
            scan.nextLine();

            switch (mainChoice) {

                case 1:
                    if (savingsAccount == null) {

                        savingsAccount = createSavingsAccount(scan);

                    } else {
                        System.out.println(
                                "\nA Savings Account already exists."
                        );

                        System.out.println(
                                "Please select Manage Savings Account."
                        );
                    }
                    break;

                case 2:
                    if (checkingAccount == null) {

                        checkingAccount = createCheckingAccount(scan);

                    } else {
                        System.out.println(
                                "\nA Checking Account already exists."
                        );

                        System.out.println(
                                "Please select Manage Checking Account."
                        );
                    }
                    break;

                case 3:
                    if (savingsAccount != null) {

                        manageSavingsAccount(scan, savingsAccount);

                    } else {
                        System.out.println(
                                "\nSavings Account does not exist."
                        );

                        System.out.println(
                                "Please create a Savings Account first."
                        );
                    }
                    break;

                case 4:
                    if (checkingAccount != null) {

                        manageCheckingAccount(scan, checkingAccount);

                    } else {
                        System.out.println(
                                "\nChecking Account does not exist."
                        );

                        System.out.println(
                                "Please create a Checking Account first."
                        );
                    }
                    break;

                case 5:
                    System.out.println(
                            "\nThank you for using the program."
                    );
                    break;

                default:
                    System.out.println(
                            "\nInvalid choice. Please select from 1 to 5."
                    );
            }

        } while (mainChoice != 5);

        scan.close();
    }

    public static void displayMainMenu() {

        System.out.println("\n================================");
        System.out.println("     ACCOUNTING TRANSACTIONS");
        System.out.println("================================");
        System.out.println("1. Create Savings Account");
        System.out.println("2. Create Checking Account");
        System.out.println("3. Manage Savings Account");
        System.out.println("4. Manage Checking Account");
        System.out.println("5. Exit");
    }

    public static SavingsAccount createSavingsAccount(Scanner scan) {

        System.out.println("\n--- Create Savings Account ---");

        System.out.print("Enter Account Number: ");
        String accountNumber = scan.nextLine();

        System.out.print("Enter Account Holder: ");
        String accountHolder = scan.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scan.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        double interestRate = scan.nextDouble();
        scan.nextLine();

        SavingsAccount savingsAccount = new SavingsAccount(
                accountNumber,
                accountHolder,
                initialBalance,
                interestRate
        );

        System.out.println(
                "\nSavings Account created successfully."
        );

        return savingsAccount;
    }

    public static CheckingAccount createCheckingAccount(Scanner scan) {

        System.out.println("\n--- Create Checking Account ---");

        System.out.print("Enter Account Number: ");
        String accountNumber = scan.nextLine();

        System.out.print("Enter Account Holder: ");
        String accountHolder = scan.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scan.nextDouble();

        System.out.print("Enter Overdraft Limit: ");
        double overdraftLimit = scan.nextDouble();
        scan.nextLine();

        CheckingAccount checkingAccount = new CheckingAccount(
                accountNumber,
                accountHolder,
                initialBalance,
                overdraftLimit
        );

        System.out.println(
                "\nChecking Account created successfully."
        );

        return checkingAccount;
    }

    public static void manageSavingsAccount(
            Scanner scan,
            SavingsAccount savingsAccount) {

        int savingsChoice;

        do {
            System.out.println("\n================================");
            System.out.println("      MANAGE SAVINGS ACCOUNT");
            System.out.println("================================");
            System.out.println("1. Display Account Information");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            savingsChoice = scan.nextInt();

            switch (savingsChoice) {

                case 1:
                    savingsAccount.displayAccountInfo();
                    break;

                case 2:
                    System.out.print("\nEnter deposit amount: ");
                    double depositAmount = scan.nextDouble();

                    savingsAccount.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("\nEnter withdrawal amount: ");
                    double withdrawalAmount = scan.nextDouble();

                    savingsAccount.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println(
                            "\nReturning to the main menu..."
                    );
                    break;

                default:
                    System.out.println(
                            "\nInvalid choice. Please select from 1 to 4."
                    );
            }

        } while (savingsChoice != 4);
    }

    public static void manageCheckingAccount(
            Scanner scan,
            CheckingAccount checkingAccount) {

        int checkingChoice;

        do {
            System.out.println("\n================================");
            System.out.println("      MANAGE CHECKING ACCOUNT");
            System.out.println("================================");
            System.out.println("1. Display Account Information");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            checkingChoice = scan.nextInt();

            switch (checkingChoice) {

                case 1:
                    checkingAccount.displayAccountInfo();
                    break;

                case 2:
                    System.out.print("\nEnter deposit amount: ");
                    double depositAmount = scan.nextDouble();

                    checkingAccount.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("\nEnter withdrawal amount: ");
                    double withdrawalAmount = scan.nextDouble();

                    checkingAccount.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println(
                            "\nReturning to the main menu..."
                    );
                    break;

                default:
                    System.out.println(
                            "\nInvalid choice. Please select from 1 to 4."
                    );
            }

        } while (checkingChoice != 4);
    }
}