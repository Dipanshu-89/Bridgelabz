import java.util.*;
import java.util.function.*;
class AlertFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Normal", "High Fever", "Critical", "Low BP");
        Predicate<String> filter = a -> a.contains("High") || a.contains("Critical");
        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);
    }
}
