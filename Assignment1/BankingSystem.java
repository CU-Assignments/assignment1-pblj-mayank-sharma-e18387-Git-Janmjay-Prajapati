import java.util.Scanner;

// BankAccount class using Encapsulation
class BankiongSystem {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankiongSystem(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Withdrawal Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Account Creation
        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Create BankAccount object
        BankiongSystem account = new BankiongSystem(name, accountNumber, initialBalance);
        System.out.println("\nAccount created successfully!");

        // Deposit
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdrawal
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        scanner.close();
    }
}
