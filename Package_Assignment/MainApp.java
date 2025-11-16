package Bridgelabz.Package_Assignment;
import Bridgelabz.Package_Assignment.Problem_06.employee;
import Bridgelabz.Package_Assignment.Problem_06.payroll;
public class MainApp {
    public static void main(String[] args) {
        employee e = new employee(1, "Dipanshu", "IT", 40000);
        payroll p = new payroll();
        p.calculateBonus(e);
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Dept: " + e.getDept());
        System.out.println("Final Salary: " + e.getSalary());
    }
}

