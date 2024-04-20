package Lessons27;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " " + "eats");
    }

    public String getName() {
        return name;
    }
}
