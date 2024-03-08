package org.example.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("CustomThreadName");
        System.out.println("Thread is alive: " + thread.isAlive());
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
