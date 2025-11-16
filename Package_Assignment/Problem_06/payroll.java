package Bridgelabz.Package_Assignment.Problem_06;
public class payroll {
    public void calculateBonus(employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
    }
}

