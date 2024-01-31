package solid.bad.i;

public class User {
    private String id;
    private String name;
    private EmployeeType designation;
    private double salary;

    public User(String id, String name, EmployeeType designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getDesignation() {
        return designation;
    }

    public void setDesignation(EmployeeType designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
