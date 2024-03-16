package org.example;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);

        BankAccountThread thread1 = new BankAccountThread(account1, "deposit", 500, null, null);
        BankAccountThread thread2 = new BankAccountThread(account1, "withdraw", 200, null, null);
        BankAccountThread thread3 = new BankAccountThread(account1, "transfer", 700, account2, "deposit");
        BankAccountThread thread4 = new BankAccountThread(account1, "transfer", 400, account2, "withdraw");
        BankAccountThread thread5 = new BankAccountThread(account2, "withdraw", 600, null, null);

        Thread t1 = new Thread(thread1);
        t1.setName("Thread1");
        Thread t2 = new Thread(thread2);
        t2.setName("Thread2");
        Thread t3 = new Thread(thread3);
        t3.setName("Thread3");
        Thread t4 = new Thread(thread4);
        t4.setName("Thread4");
        Thread t5 = new Thread(thread5);
        t5.setName("Thread5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

