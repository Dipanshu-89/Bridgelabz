package Bridgelabz.Wrapper_class;
import java.util.*;
class Q10 {
    public static void main(String[] args) {
        int[] ages = {25, 30, 22, 45, 28};
        ArrayList<Integer> list = new ArrayList<>();

        for (int a : ages) {
            list.add(a); 
        }
        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}

