
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 3;

        // PIN Verification
        while (attempts > 0) {

            System.out.print("Enter your ATM PIN: ");
            String enteredPin = sc.nextLine();

            if (enteredPin.equals(Data.PIN)) {
                System.out.println("Access Granted!\n");
                break;
            } else {
                attempts--;
                System.out.println("Wrong PIN! Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Card Blocked!");
        } else {

            while (true) {

                System.out.println("\n--- ATM Simulation ---");
                System.out.println("1. Display Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Statement");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                String choice = sc.nextLine();

                switch (choice) {

                    case "1":
                        Operations.displayBalance();
                        break;

                    case "2":
                        Operations.deposit();
                        break;

                    case "3":
                        Operations.withdraw();
                        break;

                    case "4":
                        Operations.showStatement();
                        break;

                    case "5":
                        System.out.println("Thank you for using ATM!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

        sc.close();
    }
}
