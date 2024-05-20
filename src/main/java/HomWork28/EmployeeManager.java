package HomWork28;

import java.util.ArrayList;
public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employeeToSave) {
        if (!checkEmployee(employeeToSave)) {
            employees.add(employeeToSave);
            System.out.println("Employee " + employeeToSave.getName() + " added to the list");
        } else {
            System.out.println("Employee was not added to the list");
        }
    }

    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    public void updateEmployee(int employeeId, String name, String department, double salary) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setName(name);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("Employee information updated");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + "  not found");
    }

    public void removeEmployee(int employeeId) {
        boolean removeResult = employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
        if (removeResult) {
            System.out.println("Employee " + employeeId + " removed from list");
        } else {
            System.out.println("Employee with ID " + employeeId + " not found");
        }
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                System.out.println("Employee ID " + employeeId + " found");
                return employee;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found");
        return null;
    }

    public void setName(int employeeId, String name) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setName(name);
                System.out.println("Employee information name was updated");
            }
        }
    }


    private boolean checkEmployee(Employee employeeToCheck) {
        for (Employee employee : employees) {
            if (employeeToCheck.getEmployeeId() == employee.getEmployeeId()) {
                System.out.println("Employee with ID " + employeeToCheck.getEmployeeId() + " already exists");
                return true;
            }
        }
        return false;

    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Employee list is empty");
        }
        for (Employee employee : employees) {
            System.out.println(employee.displayInfo());
        }
    }
}

