import java.util.function.*;
class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 40;
        System.out.println(alert.test(42.5));  // true
    }
}

