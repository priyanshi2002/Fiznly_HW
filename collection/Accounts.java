package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    @Override
    public String toString() {
        return "Account [Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance + "]";
    }
}

public class Accounts {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Account Holder's Name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double initialBalance = scanner.nextDouble();

                    Account account = new Account(accountNumber, accountHolder, initialBalance);
                    accounts.add(account);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();

                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == depositAccountNumber) {
                            acc.deposit(depositAmount);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == withdrawAccountNumber) {
                            acc.withdraw(withdrawAmount);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int balanceAccountNumber = scanner.nextInt();

                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == balanceAccountNumber) {
                            System.out.println("Account Balance: " + acc.getBalance());
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("List of All Accounts:");
                    for (Account acc : accounts) {
                        System.out.println(acc);
                    }
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }


}