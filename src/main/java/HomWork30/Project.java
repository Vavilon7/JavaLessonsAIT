package HomWork30;

import java.util.HashMap;

public class Project {
    private int projectId;
    private String name;
    private HashMap<Integer, Task> projectTasks = new HashMap<>();
    private HashMap<Integer, Employee> projectEmployees = new HashMap<>();

    public Project(int projectId, String name) {
        this.projectId = projectId;
        this.name = name;
    }

    public Project(int projectId, String name, HashMap<Integer, Task> projectTasks, HashMap<Integer, Employee> projectEmployees) {
        this.projectId = projectId;
        this.name = name;
        this.projectTasks = projectTasks;
        this.projectEmployees = projectEmployees;
    }

    public void addTask(Task task) {
        projectTasks.put(task.getTaskId(), task);
    }

    public void removeTask(int taskId) {
        projectTasks.remove(taskId);
    }

    public void addEmployee(Employee employee) {
        projectEmployees.put(employee.getEmployeeId(), employee);
    }

    public void removeEmployee(int employeeId) {
        projectEmployees.remove(employeeId);
    }

    public int getProjectId() {
        return projectId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, Task> getProjectTasks() {
        return new HashMap<>(projectTasks);
    }


    public HashMap<Integer, Employee> getProjectEmployees() {
        return new HashMap<> (projectEmployees);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", projectTasks=" + projectTasks +
                ", projectEmployees=" + projectEmployees +
                '}';
    }

}
