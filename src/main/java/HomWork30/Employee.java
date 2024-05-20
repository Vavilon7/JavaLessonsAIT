package HomWork30;


import java.util.HashMap;
import java.util.Objects;

public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private HashMap<Integer, Task> employeeTasks = new HashMap<>();

    public Employee(int employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

    public void addTask(Task task) {
        employeeTasks.put(task.getTaskId(), task);
    }

    public void deleteTask(int taskId) {
        employeeTasks.remove(taskId);
    }

    public void displayEmployeeInfo(){
        System.out.println(toString());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public HashMap<Integer, Task> getEmployeeTasks() {
        return employeeTasks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", employeeTasks=" + employeeTasks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmployeeId() == employee.getEmployeeId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getEmployeeId());
    }
}

