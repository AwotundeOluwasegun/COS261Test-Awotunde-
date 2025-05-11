package basicatm;
import java.util.Scanner;
public class BasicATM {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; // Initial balance
        int options, rate = 0;
        
        do {
            // Display ATM menu
            System.out.println("\n <<<<<< ATM Menu >>>>>>");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("input an option (1-4): ");
            options = scanner.nextInt();

            switch (options) {
                case 1:
                    // Check balance
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful. New balance: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    // money withdrawal
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance: $" + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM. rate your experience with our machine (1-5) star!");
                    rate = scanner.nextInt();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (options != 4);
    }
    
}
