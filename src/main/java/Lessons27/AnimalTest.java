package Lessons27;

public class AnimalTest {
    public static void main(String[] args) {
        Dog hatiko = new Dog("Hatiko");
        hatiko.bark();
        System.out.println(hatiko.getName());

        Cat cat = new Cat("Cat");
        cat.sayMiau();
        System.out.println(cat.getName());


        Birt birt = new Birt ("Fenix");
        birt.eat();

    }
}
