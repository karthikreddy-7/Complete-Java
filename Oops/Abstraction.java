package Oops;

public class Abstraction {
    public static void main(String[] args) {
        // SavingsAccount s1 = new SavingsAccount(50);
        SavingsAccount s2 = new SavingsAccount(150);
        Checking c1 = new Checking(15);
        c1.deposit(50);
        s2.withdraw(51);
        c1.getbalance();
        // s1.getbalance();

        s2.getbalance();

    }

}

class SavingsAccount extends BankAccount {
    public static final double minimum = 100.0;

    public SavingsAccount(double intial) {
        super(intial);
        if (intial < minimum) {
            throw new IllegalArgumentException("Intial balance for Savings account would be 100.0");

        }
    }

    public void deposit(double money) {
        balance += money;
        System.out.println("deposited successfully");
    }

    public void withdraw(double amount) {
        if (balance - amount >= minimum) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance limit reached.");
        }
    }
}

class Checking extends BankAccount {
    public Checking(double money) {
        super(money);
    }

    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        balance -= money;
    }
}

abstract class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    abstract void deposit(double money);

    abstract void withdraw(double money);

    void getbalance() {
        System.out.println("the balance in the account is: " + balance);
    }

}
