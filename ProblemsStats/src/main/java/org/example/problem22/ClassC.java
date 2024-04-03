package org.example.problem22;

public class ClassC extends ClassA{

    public void accessNumbers() {
        System.out.println(super.num);
        super.display();
    }

    public void display() {
        System.out.println("Inside class C");
    }

}
