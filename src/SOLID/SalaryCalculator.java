package SOLID;

public class SalaryCalculator {

    public double calculateSalary(String name) {
        EmployeeManager employeeManager = new EmployeeManager();
        return employeeManager.calculateSalary(name);
        //Hola
    }
}
