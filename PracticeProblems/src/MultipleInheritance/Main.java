package MultipleInheritance;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.makeSound();
        robot.run();
        robot.move();
        Movable m= new Robot();
        m.move();
        m.run();
        Soundable s = new Robot();
        s.makeSound();
        s.run();
    }
}
