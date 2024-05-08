package HomWork28;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employeeIT = new Employee(1,"Gates", "IT", 60000);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(employeeIT);
        Employee employeeITNew = new Employee(1,"Durov", "IT", 80000);
        employeeManager.addEmployee(employeeITNew);

        employeeManager.displayAllEmployees();

        employeeManager.findEmployeeById(3);
    }
}
