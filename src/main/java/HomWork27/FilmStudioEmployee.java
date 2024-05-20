package HomWork27;

public class FilmStudioEmployee {
    private String name;
    private String position;
    private int experienceYears;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void work (){

        System.out.println( name + " " + position + "  works on her current task");
    }

    public FilmStudioEmployee(String name, String position, int experienceYears) {
        this.name = name;
        this.position = position;
        this.experienceYears = experienceYears;

    }

    @Override
    public String toString() {
        return "FilmStudioEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
