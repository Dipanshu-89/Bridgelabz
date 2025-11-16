package Bridgelabz.Exception_Assignment;
class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String msg) { super(msg); }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String msg) { super(msg); }
}

class Vehicle {
    public void checkMaintenance(int daysLate, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if (daysLate > 0)
            throw new ServiceOverdueException("Service overdue by " + daysLate + " days!");

        if (mileage < 0)
            throw new InvalidMileageException("Mileage cannot be negative!");

        System.out.println("Vehicle is in good condition.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try {
            v.checkMaintenance(5, -200);
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println(e.getMessage());
        }
    }
}
