package org.example.threads;

public class ThreadDemo1 {
    public static void main(String[] args) {
        YieldMethod thread = new YieldMethod();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
