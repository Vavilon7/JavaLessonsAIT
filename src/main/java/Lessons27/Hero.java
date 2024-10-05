package Lessons27;

public class Hero extends MovieCharacter {
    public Hero(String name, String role) {
        super(name, "Hero");
    }

    @Override
    public void speak(){
        super.speak();
        System.out.println(" I*m a hero !!!!");
    }
}


