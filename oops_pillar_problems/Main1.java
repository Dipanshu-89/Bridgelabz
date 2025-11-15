package Bridgelabz.oops_pillar_problems;
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    Employee(int id, String n, double s) {
        employeeId = id;
        name = n;
        baseSalary = s;
    }
    public int getId() { 
        return employeeId; 
    }
    public String getName() { 
        return name; 
    }
    public double getBaseSalary() { 
        return baseSalary; 
    }
    public void setBaseSalary(double s) { 
        baseSalary = s; 
    }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
interface Department {
    void assignDepartment(String d);
    void getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {
    private String dept;
    FullTimeEmployee(int id, String n, double s) {
        super(id, n, s);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
    public void assignDepartment(String d) {
        dept = d;
    }
    public void getDepartmentDetails() {
        System.out.println("Department: " + dept);
    }
}

class PartTimeEmployee extends Employee implements Department {

    private String dept;
    private int hours;

    PartTimeEmployee(int id, String n, double hourlyRate, int h) {
        super(id, n, hourlyRate);
        hours = h;
    }

    public double calculateSalary() {
        return hours * getBaseSalary(); // baseSalary = hourly rate
    }

    public void assignDepartment(String d) {
        dept = d;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + dept);
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee(1, "Amit", 30000);
        PartTimeEmployee p1 = new PartTimeEmployee(2, "Rohit", 500, 80);

        f1.assignDepartment("HR");
        p1.assignDepartment("Support");

        System.out.println("----- FULL TIME -----");
        f1.displayDetails();
        f1.getDepartmentDetails();
        System.out.println("Salary: " + f1.calculateSalary());

        System.out.println("\n----- PART TIME -----");
        p1.displayDetails();
        p1.getDepartmentDetails();
        System.out.println("Salary: " + p1.calculateSalary());
    }
}



