package HomWork27;

public class Director extends FilmStudioEmployee {
    public Director(String name, String position, int experienceYears) {
        super(name, position, experienceYears);

    }
    public void leads (){
        super.work();
        System.out.println( getName()  + " руководит сьемочной группой " + getExperienceYears() + " лет" );
    }
    @Override
    public void work (){
        super.work();
        System.out.println( " Mister Nic works on her current task");

    }
}

