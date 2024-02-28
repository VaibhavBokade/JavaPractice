package StackAssignment;

public class DriverClass {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack:");
        stack.printStack();

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Push more elements:");
        stack.push(6);
        stack.push(7);
        stack.push(8);


        stack.printStack();

    }

}
