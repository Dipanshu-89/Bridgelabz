import java.util.*;
class UpperName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "amit", "sneha");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}

