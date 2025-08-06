import java.util.*;

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    boolean withdraw(double amount){
        if(balance >= amount && amount > 0){
            balance -= amount;
            return true;
        } else{
            return false;
        }
    }
}

class ATM{
    private final Scanner sc = new Scanner(System.in);
    private final BankAccount account;
    ATM(BankAccount acc){
        this.account = acc;
    }
    void withdraw(){
        System.out.println("Enter  the amount:");
        try {
            double amount = sc.nextDouble();
            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
            } else {
                System.out.println("Invalid amount or balance.");
            }
        }catch(Exception E){
            System.out.println("Invalid input type. Please enter valid input.");
            sc.nextLine();
        }
    }
    void deposit(){
        System.out.println("Enter the amount:");
        try {
            double amount = sc.nextDouble();
            account.deposit(amount);
        } catch (Exception E) {
            System.out.println("Invalid input type. Please enter valid input.");
            sc.nextLine();
        }
    }
    void checkBalance(){
        System.out.println("Balance: "+account.getBalance());
    }
}

public class ATM_Interface {
    static void showMenu(){
        System.out.println("""
                Welcome to ATM
                1. Withdraw
                2. Deposit
                3. Check balance
                4. Exit""");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean process = true;
        BankAccount account = new BankAccount(5000);
        ATM atm = new ATM(account);
        while (process){
            showMenu();
            System.out.println("Enter your choice:");
            try {
                int option = sc.nextInt();
                if (option == 1) {
                    atm.withdraw();
                } else if (option == 2) {
                    atm.deposit();
                } else if (option == 3) {
                    atm.checkBalance();
                } else if (option == 4) {
                    process = false;
                } else {
                    System.out.println("Invalid input option.");
                }
            } catch(Exception E){
                System.out.println("Invalid input type. Please enter valid input.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
