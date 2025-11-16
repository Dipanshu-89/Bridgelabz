import java.util.*;
public class MaxKeyValue {
    public static String maxKey(Map<String, Integer> map) {
        String bestKey = null;
        int max = Integer.MIN_VALUE;

        for (var e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                bestKey = e.getKey();
            }
        }
        return bestKey;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println(maxKey(map)); 
    }
}

