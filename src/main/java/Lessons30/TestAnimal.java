package Lessons30;

import java.util.ArrayList;
import java.util.List;
public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.eat();
        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
        cat.eat();
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        System.out.println(animals.get(0));

    }
}
