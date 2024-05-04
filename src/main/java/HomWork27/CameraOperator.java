package HomWork27;

public class CameraOperator extends FilmStudioEmployee {
    public CameraOperator(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void  operateCamera (){
        System.out.println( getName() + " is operating camera . ");
    }

    @Override
    public String toString() {
        return "CameraOperator{}" + super.toString();
    }

    @Override
    public void work() {
        System.out.println( getName() + " is making light");
    }
}
