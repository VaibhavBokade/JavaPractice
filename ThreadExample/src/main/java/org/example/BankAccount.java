package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        synchronized (this) {
            balance += amount;
            return balance;
        }
    }
    public String withdraw(double amount) {
        synchronized (this) {
            if(balance >= amount) {
                balance -=amount;
                return "Now your remaining balance is :"+balance;
            }else {
                return "Insufficient balance";
            }
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        synchronized (this) {
            if (balance >= amount) {
                withdraw(amount);
                receiver.deposit(amount);
                System.out.println("Transferred: " + amount + " to another account");

            } else {
                System.out.println("Insufficient Balance for Transfer");
            }
        }
    }

    public synchronized void printAccountInfo() {
        System.out.println("Account Balance: " + balance);
    }
}

