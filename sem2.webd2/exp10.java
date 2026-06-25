class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 5;

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    double interestRate = 2;

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Current Account Interest: " + interest);
    }
}

public class experiment10 {
    public static void main(String[] args) {

        System.out.println("----- Savings Account -----");

        SavingsAccount s = new SavingsAccount(101, "Rahul", 10000);
        s.deposit(2000);
        s.display();
        s.calculateInterest();

        System.out.println();

        System.out.println("----- Current Account -----");

        CurrentAccount c = new CurrentAccount(102, "Anita", 20000);
        c.deposit(3000);
        c.display();
        c.calculateInterest();
    }
}