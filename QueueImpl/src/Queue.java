// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Queue {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.display();
        System.out.println("--------------------------------------------");
        queue.deQueue();
        queue.display();
        System.out.println("--------------------------------------------");

        queue.peak();
        queue.display();

    }
}