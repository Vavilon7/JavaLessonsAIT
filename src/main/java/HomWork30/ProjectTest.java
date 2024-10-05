package HomWork30;

public class ProjectTest {
    public static void main(String[] args) {
        Employee employeeMichael = new Employee(1,"Michael", "Developer");
        Task task = new Task(1,"Intellij settings", "03.05.2024");

        Project project = new Project(1, "Banking App");
        project.addTask(task);
        project.addEmployee(employeeMichael);
        employeeMichael.addTask(task);

        System.out.println(project);

        Task removeDoku = new Task(2, "Delete project doku", "02.05.2024");

        project.getProjectTasks().put(removeDoku.getTaskId(), removeDoku);

        System.out.println(project);

        Employee badEmployee = new Employee(2,"Alex", "haker");
        project.getProjectEmployees().put(badEmployee.getEmployeeId(), badEmployee);

        System.out.println(project);
    }

}
