package Lessons27;

public class MovieCharacter {
    private String name;
    private String role;

    public MovieCharacter(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void speak(){
        System.out.println(name + " says ");
    }

    public void describeRole(){
        System.out.println(name + " is a " + role + " in the movie");
    }

}
