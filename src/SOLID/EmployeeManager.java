package SOLID;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements EmployeeOperations {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, String department) {
        employees.add(new Employee(name, department));
    }
 
    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }

    public void saveToFile(String name) {
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }
}
