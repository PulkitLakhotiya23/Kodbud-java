
import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000.0;
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully!");
                        System.out.println("Updated Balance: Rs. " + balance);
                    } else {
                        System.out.println("Please enter a valid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Please enter a valid amount.");
                    } else if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: Rs. " + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}


