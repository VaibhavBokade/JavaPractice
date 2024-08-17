package PracticalExamples;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Rocky", 25);
        Animal animalWithDog = new Dog("Ruby", 10);
        Dog dog = new Dog("Moti", 15);

        animal.run();
        animalWithDog.run();
        dog.run();
        Animal.sounds();
        Dog.sounds();
        animalWithDog.makeSound();
        dog.x();
        dog.y();
        dog.z();

    }
}
