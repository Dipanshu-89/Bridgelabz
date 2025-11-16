package Bridgelabz.Exception_Assignment;
class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String msg) { super(msg); }
}
public class Main8 {

    public static double convert(double temp, char unit) throws InvalidTemperatureException {
        if (unit == 'C' && temp < -273.15)
            throw new InvalidTemperatureException("Error: Temperature below absolute zero!");

        if (unit == 'F' && temp < -459.67)
            throw new InvalidTemperatureException("Error: Temperature below absolute zero!");

        if (unit == 'C')
            return (temp * 9/5) + 32;
        else
            return (temp - 32) * 5/9;
    }

    public static void main(String[] args) {
        try {
            double result = convert(-300, 'C');
            System.out.println(result);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}

