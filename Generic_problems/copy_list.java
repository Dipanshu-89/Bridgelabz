package Bridgelabz.Generic_problems;
import java.util.*;

class ListUtil {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void main(String[] args) {
        List<Number> d = new ArrayList<>();
        List<Integer> s = List.of(1, 2, 3);

        copyList(d, s);
        System.out.println(d);
    }
}

