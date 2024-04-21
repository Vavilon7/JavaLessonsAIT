package Lessons27;

public class PersonTest {
    public static void main(String[] args) {
    Student student = new Student("Musterman",23,"2022-2026",3.0);
    System.out.println(student.toString());
    Teacher teacher = new Teacher("Lehrmann", 50, "Mathe", 20);
    System.out.println(teacher.toString());
}
}


