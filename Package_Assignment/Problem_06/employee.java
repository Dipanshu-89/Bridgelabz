package Bridgelabz.Package_Assignment.Problem_06;
public class employee {
    private int id;
    private String name;
    private String dept;
    private double salary;
    public employee(int i, String n, String d, double s) {
        id = i;
        name = n;
        dept = d;
        salary = s;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }
    public void setSalary(double s) { salary = s; }
}
