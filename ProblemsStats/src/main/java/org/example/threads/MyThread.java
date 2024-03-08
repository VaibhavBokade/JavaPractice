package org.example.threads;

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int sum = 2;
                sum = sum + i;
                System.out.println(sum);
            }
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}



