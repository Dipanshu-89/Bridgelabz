import java.util.*;
public class WordFrequency {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", "");
        String[] words = text.split("\\s+");

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println(countWords(input)); // {hello=2, world=1, java=1}
    }
}

