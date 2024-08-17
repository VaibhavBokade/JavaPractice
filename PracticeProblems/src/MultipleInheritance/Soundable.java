package MultipleInheritance;

public interface Soundable {
    void makeSound();
    default void run() {
        System.out.println("Sound Running");
    }
}
