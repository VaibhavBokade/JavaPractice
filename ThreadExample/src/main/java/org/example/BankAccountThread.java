package org.example;

public class BankAccountThread implements Runnable {
    private BankAccount account;
    private String action;
    private double amount;
    private BankAccount receiver;
    private String transferAction;

    public BankAccountThread(BankAccount account, String action, double amount, BankAccount receiver, String transferAction) {
        this.account = account;
        this.action = action;
        this.amount = amount;
        this.receiver = receiver;
        this.transferAction = transferAction;
    }

    @Override
    public void run() {
        switch (action) {
            case "deposit":
                double currentAmount = account.deposit(amount);
                System.out.println("Current amount in your account is :"+currentAmount);
                break;
            case "withdraw":
                String result = account.withdraw(amount);
                System.out.println(result);
                break;
            case "transfer":
                account.transfer(receiver, amount);
                break;
            default:
                System.out.println("Invalid action");
        }
    }
}

