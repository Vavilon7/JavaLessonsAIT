package HomWork27;

public class SoundEngineer extends FilmStudioEmployee {
    public SoundEngineer(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void recordSound (){
        System.out.println( getPosition() + " идет запись звука " + getExperienceYears() +  " минут ");
    }
}
