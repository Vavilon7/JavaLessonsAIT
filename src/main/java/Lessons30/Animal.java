package Lessons30;

abstract class Animal {
    //абстрактный метод
    abstract void makeSound();

    // конкретный метод
    void sleep() {
        System.out.println("Спит");
    }

    void eat() {
        System.out.println("Ест");
    }
}





