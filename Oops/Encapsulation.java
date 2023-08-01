/*
 * Encapsulation  refers to the idea of bundling data (attributes or fields) and methods 
 * that operate on the data within a single unit, known as a class. 
 * The class provides controlled access to the data, allowing only certain methods to modify or access it, 
 * while restricting direct access from outside the class.
 */

/*
 * Here, I have shown the use of encapsulation by using the real world example of banking systems.
 */
package Oops;

public class Encapsulation {
    public static void main(String[] args) {
        bankaccount ba = new bankaccount("karthik", 50);
        // System.out.println(ba.Accountnumber);----> won't work....
        System.out.println(ba.getAccountnumber());
        ba.deposit(100);
        System.out.println(ba.getbalance());
        ba.withdrawal(150);
        System.out.println(ba.getbalance());
    }

}

class bankaccount {
    private String accountnumber;
    private int balance;

    // constructor
    public bankaccount(String accountnumber, int balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    // getter method to get the account number
    public String getAccountnumber() {
        return accountnumber;
    }

    // getter method to get the balance
    public int getbalance() {
        return balance;
    }

    // setter method to set the balance by adding the deposit
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited successfully");
        } else {
            System.out.println("invalid deposit amount");
        }
    }

    // setter method for withdrawing the amount.
    public void withdrawal(int amount) {
        balance -= amount;
        System.out.println("amount withdrawal successful");
    }
}
