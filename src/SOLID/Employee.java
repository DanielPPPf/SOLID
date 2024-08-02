package SOLID;

public class Employee {

    private String name;
    private String departament;

    public Employee(String name, String departament) {
    this.name = name;
    this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }
}
