package org.example.threadSynchronization;

public class SynchronizeBlockExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        CounterRunnable counterRunnable1= new CounterRunnable(counter);
        CounterRunnable counterRunnable2= new CounterRunnable(counter);
        Thread thread1= new Thread(counterRunnable1);
        Thread thread2= new Thread(counterRunnable2);
        thread1.setName("First thread");
        thread2.setName("Second thread");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}
