package MultipleInheritance;

public class Robot implements Movable, Soundable{
    @Override
    public void move() {
        System.out.println("Robot is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Robot is making sound");

    }

    @Override
    public void run() {
        Movable.super.run();
        Soundable.super.run();

    }
}
