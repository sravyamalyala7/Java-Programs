import java.util.Scanner;

class Account {

    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        }
    }

    public void display() {
        System.out.println("\n------ Account Details ------");
        System.out.println("Account Holder     : " + accountHolder);
        System.out.println("Available Balance  : ₹" + balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(name, balance);

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        switch (choice) {

            case 1:
                account.deposit(amount);
                break;

            case 2:
                account.withdraw(amount);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        account.display();

        sc.close();
    }
}