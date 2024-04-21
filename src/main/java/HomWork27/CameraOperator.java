package HomWork27;

public class CameraOperator extends FilmStudioEmployee {
    public CameraOperator(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void controls (){
        super.work();
        System.out.println( getName() +  " оператор управляет камерой " + getExperienceYears() + " лет ");
    }
}
