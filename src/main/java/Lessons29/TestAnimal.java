package Lessons29;
public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        //dog.makeSound();
        Animal cat = new Cat();
        //cat.makeSound();

        perform(dog);
        perform(cat);
    }

    public static void perform(Animal animal) {
        animal.makeSound();
    }
}
