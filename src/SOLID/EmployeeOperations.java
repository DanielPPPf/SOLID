package SOLID;

public interface EmployeeOperations {
    void addEmployee(String name, String departament);
    void removeEmployee(String name);
    Employee getEmployee(String name);
}
