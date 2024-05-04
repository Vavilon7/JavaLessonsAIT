package HomWork27;

public class Director extends FilmStudioEmployee {
    public Director(String name, String position, int experienceYears) {
        super(name, position, experienceYears);

    }

    public void direct() {
        System.out.println(getName() + " is a director" );
    }

    @Override
    public String toString() {
        return "Director{}" + super.toString();
    }

    @Override
    public void work() {
        super.work();
        System.out.println( "Director makes Casting");
    }
}

