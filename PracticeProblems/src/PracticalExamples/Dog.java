package PracticalExamples;

public class Dog extends Animal{
    static int a;
    static int b;

    void x() {
        System.out.println(a);
    }

    void y() {
        a=10;
        b=20;
    }

    void z() {
        System.out.println(a);
        System.out.println(b);


    }


    public Dog(String name, int age) {
        super(name, age);
    }

    public static void sounds() {
        System.out.println("Dog is barking");
    }

    public void makeSound() {
        System.out.println("Dog is making a sound");
    }


    @Override
    public void run() {
        System.out.println("Dog is running");
    }


}
