package Lessons27;

public class Student extends Person {
    private String educationTime;
    private double avarageDegree;

    public Student(String name, int age, String educationTime, double avarageDegree) {
        super(name, age);
        this.educationTime = educationTime;
        this.avarageDegree = avarageDegree;
    }

    public String getEducationTime() {
        return educationTime;
    }

    public double getAvarageDegree() {
        return avarageDegree;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student --> ");
        sb.append("educationTime='").append(educationTime).append('\'');
        sb.append(", avarageDegree=").append(avarageDegree);
        return sb.toString();
    }

}
