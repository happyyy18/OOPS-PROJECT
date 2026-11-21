
import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    public static void displayBalance() {
        System.out.println("Current Balance: " + Data.balance);
    }

    public static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            Data.balance += amount;

            Data.transactions[Data.transactionCount++] =
                "Deposited: " + amount;

            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > 0 && Data.balance >= amount) {
            Data.balance -= amount;

            Data.transactions[Data.transactionCount++] =
                "Withdrawn: " + amount;

            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public static void showStatement() {
        System.out.println("\n--- Transaction Statement ---");

        if (Data.transactionCount == 0) {
            System.out.println("No transactions yet!");
        } else {
            for (int i = 0; i < Data.transactionCount; i++) {
                System.out.println(Data.transactions[i]);
            }
        }
    }
}
