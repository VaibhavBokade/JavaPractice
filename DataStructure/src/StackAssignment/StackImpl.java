package StackAssignment;

public class StackImpl{
    public int size;
    public int top=-1;
    public int[] stack;

    public StackImpl(int size) {
        this.size = size;
        stack = new int[size];
    }
    public void pushExtraElements(int value) {
        if (top == size - 1) {
            int newSize = size * 2;
            int[] newArray = new int[newSize];
            for (int i = 0; i <= top; i++) {
                newArray[i] = stack[i];
            }
            stack = newArray;
            size = newSize;
        }
        top++;
        stack[top] = value;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public void push(int value) {
        if (top < size - 1) {
            top++;
            stack[top] = value;
        } else {
            pushExtraElements(value);
        }
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
    }
}


