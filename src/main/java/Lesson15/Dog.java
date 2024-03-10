package Lesson15;

public class Dog {
    private  String name;
    private String color;
   private String breed;
    private boolean canBellt;
    private boolean serviceGod;

    public Dog(String name, String color, String breed, boolean canBellt, boolean serviceGod) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.canBellt = canBellt;
        this.serviceGod = serviceGod;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isCanBellt() {
        return canBellt;
    }

    public boolean isServiceGod() {
        return serviceGod;
    }
}
