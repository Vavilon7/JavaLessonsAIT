package Lessons27;

public class Angryman extends MovieCharacter {
    public Angryman(String name, String role) {

        super(name, "Angryman");
}

    @Override
    public void speak(){
        super.speak();
        System.out.println("I destroy the world!!!!");
    }
}
