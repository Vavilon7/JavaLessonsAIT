package Lessons28;

public class Student extends Person{
    private int studentId;
    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
    @Override
    public void display(){
        super.display();
        System.out.println(" studentId: " + studentId);
    }
}

