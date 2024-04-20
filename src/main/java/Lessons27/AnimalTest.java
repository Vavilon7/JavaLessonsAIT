package Lessons27;

public class AnimalTest {
    public static void main(String[] args) {
        Dog hatiko = new Dog("Hatiko");
        Cat cat = new Cat("Cat");
        System.out.println(hatiko.getName());
        System.out.println(cat.getName());
        hatiko.bark();
        cat.sayMiau();
        Birt birt = new Birt ("Fenix");
        birt.eat();

    }
}
