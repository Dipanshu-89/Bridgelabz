import java.time.*;
import java.util.*;
class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date (yyyy-mm-dd): ");
        String in = sc.nextLine();
        LocalDate date = LocalDate.parse(in);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);
        result = result.minusWeeks(3);
        System.out.println("Final Date: " + result);
        sc.close();
    }
}

