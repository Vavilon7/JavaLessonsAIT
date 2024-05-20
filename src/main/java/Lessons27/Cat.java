package Lessons27;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void sayMiau (){
        System.out.println(getName() + " say miau");
    }
}
