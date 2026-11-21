
import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner(System.in);

    // Safe amount input
    public static double getAmount(String message) {
        while (true) {
            try {
                System.out.print(message);
                double value = Double.parseDouble(sc.nextLine());

                if (value <= 0) {
                    System.out.println("Enter a positive amount!");
                } else {
                    return value;
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    // Get menu choice
    public static String getChoice(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }

    // Get ATM PIN
    public static String getPin(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }
}
