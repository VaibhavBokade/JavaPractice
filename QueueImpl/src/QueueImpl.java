public class QueueImpl {
    int queueLength = 4;
    int[] queue = new int[queueLength];
    int front = 0; // Initialize front to 0
    int back = -1;

    public boolean isFull() {
        return back == queueLength - 1;
    }

    public boolean isEmpty() {
        return front > back;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            back++;
            queue[back] = element;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            front++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    void peak() {
        System.out.println("Front value is: " + queue[front]);
    }
}
