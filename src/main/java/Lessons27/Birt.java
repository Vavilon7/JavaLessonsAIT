package Lessons27;

public class Birt extends Animal {
    public Birt(String name) {

        super(name);
    }
    @Override
    public void eat(){

        System.out.println("I'm bird, I'm hungry");
    }
}
